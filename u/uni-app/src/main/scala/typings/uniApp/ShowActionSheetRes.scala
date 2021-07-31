package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowActionSheetRes extends StObject {
  
  /**
    * 用户点击的按钮，从上到下的顺序，从0开始
    */
  var tapIndex: js.UndefOr[Double] = js.undefined
}
object ShowActionSheetRes {
  
  @scala.inline
  def apply(): ShowActionSheetRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowActionSheetRes]
  }
  
  @scala.inline
  implicit class ShowActionSheetResMutableBuilder[Self <: ShowActionSheetRes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTapIndex(value: Double): Self = StObject.set(x, "tapIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTapIndexUndefined: Self = StObject.set(x, "tapIndex", js.undefined)
  }
}
