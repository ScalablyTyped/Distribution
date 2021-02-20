package typings.xlsx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarginInfo extends _SheetKeys {
  
  /** Bottom side margin (inches) */
  var bottom: js.UndefOr[Double] = js.native
  
  /** Footer bottom height (inches) */
  var footer: js.UndefOr[Double] = js.native
  
  /** Header top margin (inches) */
  var header: js.UndefOr[Double] = js.native
  
  /** Left side margin (inches) */
  var left: js.UndefOr[Double] = js.native
  
  /** Right side margin (inches) */
  var right: js.UndefOr[Double] = js.native
  
  /** Top side margin (inches) */
  var top: js.UndefOr[Double] = js.native
}
object MarginInfo {
  
  @scala.inline
  def apply(): MarginInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarginInfo]
  }
  
  @scala.inline
  implicit class MarginInfoMutableBuilder[Self <: MarginInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    @scala.inline
    def setFooter(value: Double): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    @scala.inline
    def setHeader(value: Double): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
