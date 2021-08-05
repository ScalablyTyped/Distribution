package typings.wordpressCustomizeBrowser

import typings.wordpressCustomizeBrowser.externalMod.Attachment
import typings.wordpressCustomizeBrowser.externalMod.Cropper
import typings.wordpressCustomizeBrowser.mediaControlMod.MediaControl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object croppedImageControlMod {
  
  @JSImport("@wordpress/customize-browser/CroppedImageControl", "CroppedImageControl")
  @js.native
  class CroppedImageControl protected () extends MediaControl {
    def this(applicator: js.Object, argsArray: js.Object) = this()
    def this(applicator: js.Object, argsArray: js.Object, options: js.Object) = this()
    
    // TODO
    def calculateImageSelectOptions(attachment: Attachment, controller: Cropper): ImageSelectOptions = js.native
    
    def mustBeCropped(flexW: Boolean, flexH: Boolean, dstW: Double, dstH: Double, imgW: Double, imgH: Double): Boolean = js.native
    
    def onCropped(croppedImage: js.Any): Unit = js.native
    
    def onSelect(): Unit = js.native
    
    def onSkippedCrop(): Unit = js.native
    
    def setImageFromAttachment(attachment: js.Any): Unit = js.native
  }
  
  trait ImageSelectOptions extends StObject {
    
    var aspectRatio: js.UndefOr[String] = js.undefined
    
    var handles: Boolean
    
    var imageHeight: Double
    
    var imageWidth: Double
    
    var instance: Boolean
    
    var keys: Boolean
    
    var maxHeight: js.UndefOr[Double] = js.undefined
    
    var maxWidth: js.UndefOr[Double] = js.undefined
    
    var minHeight: js.UndefOr[Double] = js.undefined
    
    var minWidth: js.UndefOr[Double] = js.undefined
    
    var persistent: Boolean
    
    var x1: Double
    
    var x2: Double
    
    var y1: Double
    
    var y2: Double
  }
  object ImageSelectOptions {
    
    inline def apply(
      handles: Boolean,
      imageHeight: Double,
      imageWidth: Double,
      instance: Boolean,
      keys: Boolean,
      persistent: Boolean,
      x1: Double,
      x2: Double,
      y1: Double,
      y2: Double
    ): ImageSelectOptions = {
      val __obj = js.Dynamic.literal(handles = handles.asInstanceOf[js.Any], imageHeight = imageHeight.asInstanceOf[js.Any], imageWidth = imageWidth.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], persistent = persistent.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageSelectOptions]
    }
    
    extension [Self <: ImageSelectOptions](x: Self) {
      
      inline def setAspectRatio(value: String): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
      
      inline def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
      
      inline def setHandles(value: Boolean): Self = StObject.set(x, "handles", value.asInstanceOf[js.Any])
      
      inline def setImageHeight(value: Double): Self = StObject.set(x, "imageHeight", value.asInstanceOf[js.Any])
      
      inline def setImageWidth(value: Double): Self = StObject.set(x, "imageWidth", value.asInstanceOf[js.Any])
      
      inline def setInstance(value: Boolean): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      inline def setKeys(value: Boolean): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
      
      inline def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      inline def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      inline def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      inline def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    }
  }
}
