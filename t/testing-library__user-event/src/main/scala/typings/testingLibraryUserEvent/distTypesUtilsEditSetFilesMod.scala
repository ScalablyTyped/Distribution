package typings.testingLibraryUserEvent

import typings.std.FileList
import typings.testingLibraryUserEvent.anon.HTMLInputElementtypefile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsEditSetFilesMod {
  
  @JSImport("@testing-library/user-event/dist/types/utils/edit/setFiles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setFiles(el: HTMLInputElementtypefile, files: FileList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setFiles")(el.asInstanceOf[js.Any], files.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object global {
    
    @js.native
    trait HTMLInputElement extends StObject
  }
}
