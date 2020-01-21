package typings.wegameApi.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.triggerGC")
@js.native
object triggerGC extends js.Object {
  /**
    * 加快触发 JavaScriptCore Garbage Collection（垃圾回收），GC 时机是由 JavaScriptCore 来控制的，并不能保证调用后马上触发 GC。
    */
  def apply(): Unit = js.native
}

