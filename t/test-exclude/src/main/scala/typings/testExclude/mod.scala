package typings.testExclude

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* was `typeof TestExclude` */
  @JSImport("test-exclude", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with TestExclude {
    def this(options: TestExcludeOptions) = this()
  }
  
  @js.native
  trait TestExclude extends StObject {
    
    def glob(): js.Promise[js.Array[String]] = js.native
    def glob(cwd: String): js.Promise[js.Array[String]] = js.native
    
    def globSync(): js.Array[String] = js.native
    def globSync(cwd: String): js.Array[String] = js.native
    
    def shouldInstrument(filename: String): Boolean = js.native
  }
  
  trait TestExcludeOptions extends StObject {
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var exclude: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var excludeNodeModules: js.UndefOr[Boolean] = js.undefined
    
    var `extension`: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var include: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var relativePath: js.UndefOr[Boolean] = js.undefined
  }
  object TestExcludeOptions {
    
    inline def apply(): TestExcludeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TestExcludeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TestExcludeOptions] (val x: Self) extends AnyVal {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setExclude(value: String | js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeNodeModules(value: Boolean): Self = StObject.set(x, "excludeNodeModules", value.asInstanceOf[js.Any])
      
      inline def setExcludeNodeModulesUndefined: Self = StObject.set(x, "excludeNodeModules", js.undefined)
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setExtension(value: String | js.Array[String]): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
      
      inline def setExtensionVarargs(value: String*): Self = StObject.set(x, "extension", js.Array(value*))
      
      inline def setInclude(value: String | js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value*))
      
      inline def setRelativePath(value: Boolean): Self = StObject.set(x, "relativePath", value.asInstanceOf[js.Any])
      
      inline def setRelativePathUndefined: Self = StObject.set(x, "relativePath", js.undefined)
    }
  }
  
  /* was `typeof TestExclude` */
  type _TestExclude = TestExclude
}
