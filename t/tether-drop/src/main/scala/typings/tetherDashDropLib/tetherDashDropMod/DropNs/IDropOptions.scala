package typings
package tetherDashDropLib.tetherDashDropMod.DropNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDropOptions extends js.Object {
  var beforeClose: js.UndefOr[
    js.Function2[
      /* event */ stdLib.Event, 
      /* drop */ tetherDashDropLib.tetherDashDropMod.Drop, 
      scala.Boolean
    ]
  ] = js.undefined
  var blurDelay: js.UndefOr[scala.Double] = js.undefined
  var classes: js.UndefOr[java.lang.String] = js.undefined
  var closeDelay: js.UndefOr[scala.Double] = js.undefined
  var constrainToScrollParent: js.UndefOr[scala.Boolean] = js.undefined
  var constrainToWindow: js.UndefOr[scala.Boolean] = js.undefined
  var content: js.UndefOr[
    stdLib.Element | java.lang.String | (js.Function1[/* drop */ js.UndefOr[tetherDashDropLib.tetherDashDropMod.Drop], java.lang.String]) | (js.Function1[/* drop */ js.UndefOr[tetherDashDropLib.tetherDashDropMod.Drop], stdLib.Element])
  ] = js.undefined
  var focusDelay: js.UndefOr[scala.Double] = js.undefined
  var hoverCloseDelay: js.UndefOr[scala.Double] = js.undefined
  var hoverOpenDelay: js.UndefOr[scala.Double] = js.undefined
  var openDelay: js.UndefOr[scala.Double] = js.undefined
  var openOn: js.UndefOr[java.lang.String] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
  var remove: js.UndefOr[scala.Boolean] = js.undefined
  var target: js.UndefOr[stdLib.Element] = js.undefined
  var tetherOptions: js.UndefOr[tetherLib.tetherMod.TetherNs.ITetherOptions] = js.undefined
}

