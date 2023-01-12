package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowModalRes extends StObject {
  
  /**
    * 为 true 时，表示用户点击了取消
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 为 true 时，表示用户点击了确定按钮
    */
  var confirm: js.UndefOr[Boolean] = js.undefined
}
object ShowModalRes {
  
  inline def apply(): ShowModalRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowModalRes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShowModalRes] (val x: Self) extends AnyVal {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setConfirm(value: Boolean): Self = StObject.set(x, "confirm", value.asInstanceOf[js.Any])
    
    inline def setConfirmUndefined: Self = StObject.set(x, "confirm", js.undefined)
  }
}
