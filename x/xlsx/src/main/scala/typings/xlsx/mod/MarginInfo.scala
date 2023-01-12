package typings.xlsx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarginInfo
  extends StObject
     with _SheetKeys {
  
  /** Bottom side margin (inches) */
  var bottom: js.UndefOr[Double] = js.undefined
  
  /** Footer bottom height (inches) */
  var footer: js.UndefOr[Double] = js.undefined
  
  /** Header top margin (inches) */
  var header: js.UndefOr[Double] = js.undefined
  
  /** Left side margin (inches) */
  var left: js.UndefOr[Double] = js.undefined
  
  /** Right side margin (inches) */
  var right: js.UndefOr[Double] = js.undefined
  
  /** Top side margin (inches) */
  var top: js.UndefOr[Double] = js.undefined
}
object MarginInfo {
  
  inline def apply(): MarginInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarginInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MarginInfo] (val x: Self) extends AnyVal {
    
    inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setFooter(value: Double): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setHeader(value: Double): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
