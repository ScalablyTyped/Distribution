package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentSpan extends js.Object {
  /**
    * If DocumentSpan.textSpan is the span for name of the declaration,
    * then this is the span for relevant declaration
    */
  var contextSpan: js.UndefOr[TextSpan] = js.undefined
  var fileName: java.lang.String
  var originalContextSpan: js.UndefOr[TextSpan] = js.undefined
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
    contextSpan: TextSpan = null,
    originalContextSpan: TextSpan = null,
    originalFileName: java.lang.String = null,
    originalTextSpan: TextSpan = null
  ): DocumentSpan = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], textSpan = textSpan.asInstanceOf[js.Any])
    if (contextSpan != null) __obj.updateDynamic("contextSpan")(contextSpan.asInstanceOf[js.Any])
    if (originalContextSpan != null) __obj.updateDynamic("originalContextSpan")(originalContextSpan.asInstanceOf[js.Any])
    if (originalFileName != null) __obj.updateDynamic("originalFileName")(originalFileName.asInstanceOf[js.Any])
    if (originalTextSpan != null) __obj.updateDynamic("originalTextSpan")(originalTextSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentSpan]
  }
}

