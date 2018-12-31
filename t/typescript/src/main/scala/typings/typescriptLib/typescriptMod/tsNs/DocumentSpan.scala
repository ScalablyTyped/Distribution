package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentSpan extends js.Object {
  var fileName: java.lang.String
  var originalFileName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If the span represents a location that was remapped (e.g. via a .d.ts.map file),
    * then the original filename and span will be specified here
    */
  var originalTextSpan: js.UndefOr[TextSpan] = js.undefined
  var textSpan: TextSpan
}

