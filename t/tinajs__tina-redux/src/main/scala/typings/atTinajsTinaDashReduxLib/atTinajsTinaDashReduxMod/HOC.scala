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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("methods")(methods)
    __obj.updateDynamic("onLoad")(onLoad)
    __obj.updateDynamic("onUnload")(onUnload)
    __obj.asInstanceOf[HOC]
  }
}

