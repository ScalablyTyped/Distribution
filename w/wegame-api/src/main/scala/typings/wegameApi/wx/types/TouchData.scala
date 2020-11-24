package typings.wegameApi.wx.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchData extends js.Object {
  
  /**
    * 触发此次事件的触摸点列表
    */
  var changedTouches: js.Array[Touch] = js.native
  
  /**
    * 事件触发时的时间戳
    */
  var timeStamp: Double = js.native
  
  /**
    * 当前所有触摸点的列表
    */
  var touches: js.Array[Touch] = js.native
  
  /**
    * 当前事件的类型
    */
  var `type`: String = js.native
}
object TouchData {
  
  @scala.inline
  def apply(changedTouches: js.Array[Touch], timeStamp: Double, touches: js.Array[Touch], `type`: String): TouchData = {
    val __obj = js.Dynamic.literal(changedTouches = changedTouches.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], touches = touches.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchData]
  }
  
  @scala.inline
  implicit class TouchDataOps[Self <: TouchData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChangedTouchesVarargs(value: Touch*): Self = this.set("changedTouches", js.Array(value :_*))
    
    @scala.inline
    def setChangedTouches(value: js.Array[Touch]): Self = this.set("changedTouches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeStamp(value: Double): Self = this.set("timeStamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchesVarargs(value: Touch*): Self = this.set("touches", js.Array(value :_*))
    
    @scala.inline
    def setTouches(value: js.Array[Touch]): Self = this.set("touches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
