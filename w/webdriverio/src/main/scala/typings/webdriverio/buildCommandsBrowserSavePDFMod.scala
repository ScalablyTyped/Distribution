package typings.webdriverio

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsBrowserSavePDFMod {
  
  @JSImport("webdriverio/build/commands/browser/savePDF", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(filepath: String): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(filepath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  inline def default(filepath: String, options: PDFPrintOptions): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(filepath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  
  trait PDFPrintOptions extends StObject {
    
    var background: js.UndefOr[Boolean] = js.undefined
    
    var bottom: js.UndefOr[Double] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var left: js.UndefOr[Double] = js.undefined
    
    var orientation: js.UndefOr[String] = js.undefined
    
    var pageRanges: js.UndefOr[js.Array[js.Object]] = js.undefined
    
    var right: js.UndefOr[Double] = js.undefined
    
    var scale: js.UndefOr[Double] = js.undefined
    
    var shrinkToFit: js.UndefOr[Boolean] = js.undefined
    
    var top: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object PDFPrintOptions {
    
    inline def apply(): PDFPrintOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PDFPrintOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PDFPrintOptions] (val x: Self) extends AnyVal {
      
      inline def setBackground(value: Boolean): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setPageRanges(value: js.Array[js.Object]): Self = StObject.set(x, "pageRanges", value.asInstanceOf[js.Any])
      
      inline def setPageRangesUndefined: Self = StObject.set(x, "pageRanges", js.undefined)
      
      inline def setPageRangesVarargs(value: js.Object*): Self = StObject.set(x, "pageRanges", js.Array(value*))
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setShrinkToFit(value: Boolean): Self = StObject.set(x, "shrinkToFit", value.asInstanceOf[js.Any])
      
      inline def setShrinkToFitUndefined: Self = StObject.set(x, "shrinkToFit", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
