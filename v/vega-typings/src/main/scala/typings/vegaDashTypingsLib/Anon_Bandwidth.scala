package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bandwidth extends js.Object {
  var bandwidth: js.UndefOr[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var cellSize: js.UndefOr[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var signal: js.UndefOr[java.lang.String] = js.undefined
  var size: (js.Array[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  var `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.contour
   // TODO: change to Vector2<SignalRef | number> after https://github.com/Microsoft/TypeScript/issues/28017 has been fixed
  var values: js.UndefOr[
    (js.Array[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  var x: js.UndefOr[java.lang.String | vegaDashTypingsLib.typesSpecTransformMod.TransformField] = js.undefined
  var y: js.UndefOr[java.lang.String | vegaDashTypingsLib.typesSpecTransformMod.TransformField] = js.undefined
}

