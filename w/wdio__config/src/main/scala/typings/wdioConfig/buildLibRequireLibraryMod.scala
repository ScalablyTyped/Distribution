package typings.wdioConfig

import typings.wdioConfig.buildTypesMod.ModuleImportService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLibRequireLibraryMod {
  
  @JSImport("@wdio/config/build/lib/RequireLibrary", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with RequireLibrary {
    
    /* CompleteClass */
    override def `import`[T](module: String): js.Promise[T] = js.native
  }
  
  trait RequireLibrary
    extends StObject
       with ModuleImportService
  object RequireLibrary {
    
    inline def apply(`import`: String => js.Promise[Any]): RequireLibrary = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("import")(js.Any.fromFunction1(`import`))
      __obj.asInstanceOf[RequireLibrary]
    }
  }
}
