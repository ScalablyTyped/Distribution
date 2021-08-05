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
  
  inline def apply(): ShowActionSheetRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowActionSheetRes]
  }
  
  extension [Self <: ShowActionSheetRes](x: Self) {
    
    inline def setTapIndex(value: Double): Self = StObject.set(x, "tapIndex", value.asInstanceOf[js.Any])
    
    inline def setTapIndexUndefined: Self = StObject.set(x, "tapIndex", js.undefined)
  }
}
