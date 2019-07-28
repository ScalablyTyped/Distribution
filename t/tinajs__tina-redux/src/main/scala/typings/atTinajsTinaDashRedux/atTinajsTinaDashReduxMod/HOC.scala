package typings.atTinajsTinaDashRedux.atTinajsTinaDashReduxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HOC extends js.Object {
  var methods: js.Object
  def onLoad(): Unit
  def onUnload(): Unit
}

object HOC {
  @scala.inline
  def apply(methods: js.Object, onLoad: () => Unit, onUnload: () => Unit): HOC = {
    val __obj = js.Dynamic.literal(methods = methods, onLoad = js.Any.fromFunction0(onLoad), onUnload = js.Any.fromFunction0(onUnload))
  
    __obj.asInstanceOf[HOC]
  }
}

