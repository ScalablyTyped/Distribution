package typings.yarnpkgParsers

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSymlMod {
  
  @JSImport("@yarnpkg/parsers/lib/syml", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@yarnpkg/parsers/lib/syml", "PreserveOrdering")
  @js.native
  open class PreserveOrdering protected () extends StObject {
    def this(data: Any) = this()
    
    val data: Any = js.native
  }
  
  inline def parseSyml(source: String): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseSyml")(source.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  
  object stringifySyml {
    
    inline def apply(value: Any): String = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("@yarnpkg/parsers/lib/syml", "stringifySyml")
    @js.native
    val ^ : js.Any = js.native
    
    /* was `typeof imported_syml.PreserveOrdering` */
    @JSImport("@yarnpkg/parsers/lib/syml", "stringifySyml.PreserveOrdering")
    @js.native
    open class PreserveOrdering protected ()
      extends typings.yarnpkgParsers.libSymlMod.PreserveOrdering {
      def this(data: Any) = this()
    }
  }
}
