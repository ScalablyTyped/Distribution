package typings.typedoc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readersMod {
  
  @JSImport("typedoc/dist/lib/utils/options/readers", "ArgumentsReader")
  @js.native
  open class ArgumentsReader protected ()
    extends typings.typedoc.argumentsMod.ArgumentsReader {
    def this(priority: Double) = this()
    def this(priority: Double, args: js.Array[String]) = this()
  }
  
  @JSImport("typedoc/dist/lib/utils/options/readers", "TSConfigReader")
  @js.native
  open class TSConfigReader ()
    extends typings.typedoc.tsconfigMod.TSConfigReader
  /* static members */
  object TSConfigReader {
    
    @JSImport("typedoc/dist/lib/utils/options/readers", "TSConfigReader")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Not considered part of the public API. You can use it, but it might break.
      * @internal
      */
    inline def findConfigFile(file: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("findConfigFile")(file.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  }
  
  @JSImport("typedoc/dist/lib/utils/options/readers", "TypeDocReader")
  @js.native
  open class TypeDocReader ()
    extends typings.typedoc.typedocMod.TypeDocReader
}
