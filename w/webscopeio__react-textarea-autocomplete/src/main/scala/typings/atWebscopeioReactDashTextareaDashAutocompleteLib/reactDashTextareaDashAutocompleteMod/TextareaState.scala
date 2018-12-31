package typings
package atWebscopeioReactDashTextareaDashAutocompleteLib.reactDashTextareaDashAutocompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextareaState[TItem] extends js.Object {
  var actualToken: java.lang.String
  var component: js.UndefOr[reactLib.reactMod.ReactNs.SFC[ItemComponentProps[TItem]]] = js.undefined
  var currentTrigger: js.UndefOr[java.lang.String] = js.undefined
  var data: js.UndefOr[js.Array[TItem]] = js.undefined
  var dataLoading: scala.Boolean
  var left: js.UndefOr[scala.Double] = js.undefined
  var selectionEnd: scala.Double
  var selectionStart: scala.Double
  var top: js.UndefOr[scala.Double] = js.undefined
  var value: java.lang.String
}

