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
  def apply(methods: js.Object, onLoad: js.Function0[scala.Unit], onUnload: js.Function0[scala.Unit]): HOC = {
    val __obj = js.Dynamic.literal(methods = methods, onLoad = onLoad, onUnload = onUnload)
  
    __obj.asInstanceOf[HOC]
  }
}

