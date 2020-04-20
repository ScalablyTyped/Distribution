package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutliningSpan extends js.Object {
  /**
    * Whether or not this region should be automatically collapsed when
    * the 'Collapse to Definitions' command is invoked.
    */
  var autoCollapse: Boolean
  /** The text to display in the editor for the collapsed region. */
  var bannerText: java.lang.String
  /** The span of the document to display when the user hovers over the collapsed span. */
  var hintSpan: TextSpan
  /**
    * Classification of the contents of the span
    */
  var kind: OutliningSpanKind
  /** The span of the document to actually collapse. */
  var textSpan: TextSpan
}

object OutliningSpan {
  @scala.inline
  def apply(
    autoCollapse: Boolean,
    bannerText: java.lang.String,
    hintSpan: TextSpan,
    kind: OutliningSpanKind,
    textSpan: TextSpan
  ): OutliningSpan = {
    val __obj = js.Dynamic.literal(autoCollapse = autoCollapse.asInstanceOf[js.Any], bannerText = bannerText.asInstanceOf[js.Any], hintSpan = hintSpan.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], textSpan = textSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutliningSpan]
  }
}

