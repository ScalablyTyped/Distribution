package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  def apply(): PDFPrintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFPrintOptions]
  }
  
  @scala.inline
  implicit class PDFPrintOptionsMutableBuilder[Self <: PDFPrintOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: Boolean): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setPageRanges(value: js.Array[js.Object]): Self = StObject.set(x, "pageRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageRangesUndefined: Self = StObject.set(x, "pageRanges", js.undefined)
    
    @scala.inline
    def setPageRangesVarargs(value: js.Object*): Self = StObject.set(x, "pageRanges", js.Array(value :_*))
    
    @scala.inline
    def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setShrinkToFit(value: Boolean): Self = StObject.set(x, "shrinkToFit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShrinkToFitUndefined: Self = StObject.set(x, "shrinkToFit", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
