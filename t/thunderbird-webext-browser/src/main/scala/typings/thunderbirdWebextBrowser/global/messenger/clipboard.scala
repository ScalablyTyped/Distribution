package typings.thunderbirdWebextBrowser.global.messenger

import typings.thunderbirdWebextBrowser.messenger.clipboard.SetImageDataImageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clipboard {
  
  @JSGlobal("messenger.clipboard")
  @js.native
  val ^ : js.Any = js.native
  
  inline def setImageData(imageData: js.typedarray.ArrayBuffer, imageType: SetImageDataImageType): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setImageData")(imageData.asInstanceOf[js.Any], imageType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
