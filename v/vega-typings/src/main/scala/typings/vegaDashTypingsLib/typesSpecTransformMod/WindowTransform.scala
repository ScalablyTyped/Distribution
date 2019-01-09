package typings
package vegaDashTypingsLib.typesSpecTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowTransform extends js.Object {
  var as: js.UndefOr[
    (js.Array[java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef | scala.Null]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  var fields: js.UndefOr[
    (js.Array[java.lang.String | TransformField | scala.Null]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  var frame: js.UndefOr[
    (vegaDashTypingsLib.typesSpecUtilMod.Vector2[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef | scala.Null]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  var groupby: js.UndefOr[
    (js.Array[java.lang.String | TransformField]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  var ignorePeers: js.UndefOr[scala.Boolean] = js.undefined
  var ops: js.UndefOr[js.Array[java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]] = js.undefined
  var sort: js.UndefOr[vegaDashTypingsLib.typesSpecMarkMod.Compare] = js.undefined
  var `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.window
}

