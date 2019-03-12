package typings
package atTinajsTinaDashReduxLib.atTinajsTinaDashReduxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HOC extends js.Object {
  var methods: js.Object
  def onLoad(): scala.Unit
  def onUnload(): scala.Unit
}

object HOC {
  @scala.inline
  def apply(methods: js.Object, onLoad: () => scala.Unit, onUnload: () => scala.Unit): HOC = {
    val __obj = js.Dynamic.literal(methods = methods, onLoad = js.Any.fromFunction0(onLoad), onUnload = js.Any.fromFunction0(onUnload))
  
    __obj.asInstanceOf[HOC]
  }
}

