package typings.testingLibraryUserEvent

import typings.std.EventInit
import typings.std.File
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilityUploadMod {
  
  @JSImport("@testing-library/user-event/dist/types/utility/upload", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def upload(element: HTMLElement, fileOrFiles: js.Array[File]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(element.asInstanceOf[js.Any], fileOrFiles.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def upload(element: HTMLElement, fileOrFiles: File): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(element.asInstanceOf[js.Any], fileOrFiles.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait uploadInit extends StObject {
    
    var changeInit: js.UndefOr[EventInit] = js.undefined
  }
  object uploadInit {
    
    inline def apply(): uploadInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[uploadInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: uploadInit] (val x: Self) extends AnyVal {
      
      inline def setChangeInit(value: EventInit): Self = StObject.set(x, "changeInit", value.asInstanceOf[js.Any])
      
      inline def setChangeInitUndefined: Self = StObject.set(x, "changeInit", js.undefined)
    }
  }
}
