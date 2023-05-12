package typings.thunderbirdWebextBrowser.messenger.messageDisplayAction

import typings.thunderbirdWebextBrowser.messenger.manifest.IconPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetIconDetails extends StObject {
  
  /** The image data for one or more icons for the composeAction button. */
  var imageData: js.UndefOr[ImageDataType | ImageDataDictionary] = js.undefined
  
  /** The paths to one or more icons for the messageDisplayAction button. */
  var path: js.UndefOr[IconPath] = js.undefined
  
  /** Sets the icon only for the given tab. */
  var tabId: js.UndefOr[Double] = js.undefined
  
  /**
    * Will throw an error if used.
    *
    * @deprecated Unsupported on Firefox at this time.
    */
  var windowId: js.UndefOr[Double] = js.undefined
}
object SetIconDetails {
  
  inline def apply(): SetIconDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetIconDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetIconDetails] (val x: Self) extends AnyVal {
    
    inline def setImageData(value: ImageDataType | ImageDataDictionary): Self = StObject.set(x, "imageData", value.asInstanceOf[js.Any])
    
    inline def setImageDataUndefined: Self = StObject.set(x, "imageData", js.undefined)
    
    inline def setPath(value: IconPath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    
    inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
    
    inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
    
    inline def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
  }
}
