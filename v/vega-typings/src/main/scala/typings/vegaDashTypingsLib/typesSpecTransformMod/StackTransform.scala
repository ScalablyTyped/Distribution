package typings
package vegaDashTypingsLib.typesSpecTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackTransform extends js.Object {
  var as: js.UndefOr[
    (vegaDashTypingsLib.typesSpecUtilMod.Vector2[java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  var field: js.UndefOr[java.lang.String | TransformField] = js.undefined
  var groupby: js.UndefOr[js.Array[java.lang.String | TransformField]] = js.undefined
  var offset: js.UndefOr[StackOffset] = js.undefined
  var sort: js.UndefOr[vegaDashTypingsLib.typesSpecMarkMod.Compare] = js.undefined
  var `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.stack
}

