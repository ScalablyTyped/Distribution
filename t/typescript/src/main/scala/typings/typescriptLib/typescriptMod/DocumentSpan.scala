package typings
package typescriptLib.typescriptMod

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

object DocumentSpan {
  @scala.inline
  def apply(
    fileName: java.lang.String,
    textSpan: TextSpan,
    originalFileName: java.lang.String = null,
    originalTextSpan: TextSpan = null
  ): DocumentSpan = {
    val __obj = js.Dynamic.literal(fileName = fileName, textSpan = textSpan)
    if (originalFileName != null) __obj.updateDynamic("originalFileName")(originalFileName)
    if (originalTextSpan != null) __obj.updateDynamic("originalTextSpan")(originalTextSpan)
    __obj.asInstanceOf[DocumentSpan]
  }
}

