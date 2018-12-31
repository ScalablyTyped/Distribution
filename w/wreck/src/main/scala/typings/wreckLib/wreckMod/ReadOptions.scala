package typings
package wreckLib.wreckMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadOptions extends js.Object {
  var gunzip: js.UndefOr[scala.Boolean | wreckLib.wreckLibStrings.force] = js.undefined
  var json: js.UndefOr[
    wreckLib.wreckLibNumbers.`true` | wreckLib.wreckLibStrings.strict | wreckLib.wreckLibStrings.force
  ] = js.undefined
  var maxBytes: js.UndefOr[scala.Double] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

