package typings.urlDashPattern.urlDashPatternMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlPatternOptions extends js.Object {
  var escapeChar: js.UndefOr[String] = js.undefined
  var optionalSegmentEndChar: js.UndefOr[String] = js.undefined
  var optionalSegmentStartChar: js.UndefOr[String] = js.undefined
  var segmentNameCharset: js.UndefOr[String] = js.undefined
  var segmentNameStartChar: js.UndefOr[String] = js.undefined
  var segmentValueCharset: js.UndefOr[String] = js.undefined
  var wildcardChar: js.UndefOr[String] = js.undefined
}

object UrlPatternOptions {
  @scala.inline
  def apply(
    escapeChar: String = null,
    optionalSegmentEndChar: String = null,
    optionalSegmentStartChar: String = null,
    segmentNameCharset: String = null,
    segmentNameStartChar: String = null,
    segmentValueCharset: String = null,
    wildcardChar: String = null
  ): UrlPatternOptions = {
    val __obj = js.Dynamic.literal()
    if (escapeChar != null) __obj.updateDynamic("escapeChar")(escapeChar.asInstanceOf[js.Any])
    if (optionalSegmentEndChar != null) __obj.updateDynamic("optionalSegmentEndChar")(optionalSegmentEndChar.asInstanceOf[js.Any])
    if (optionalSegmentStartChar != null) __obj.updateDynamic("optionalSegmentStartChar")(optionalSegmentStartChar.asInstanceOf[js.Any])
    if (segmentNameCharset != null) __obj.updateDynamic("segmentNameCharset")(segmentNameCharset.asInstanceOf[js.Any])
    if (segmentNameStartChar != null) __obj.updateDynamic("segmentNameStartChar")(segmentNameStartChar.asInstanceOf[js.Any])
    if (segmentValueCharset != null) __obj.updateDynamic("segmentValueCharset")(segmentValueCharset.asInstanceOf[js.Any])
    if (wildcardChar != null) __obj.updateDynamic("wildcardChar")(wildcardChar.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlPatternOptions]
  }
}

