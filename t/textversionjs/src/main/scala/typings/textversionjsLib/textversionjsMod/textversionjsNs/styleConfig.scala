package typings
package textversionjsLib.textversionjsMod.textversionjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait styleConfig extends js.Object {
  var headingStyle: js.UndefOr[
    textversionjsLib.textversionjsLibStrings.underline | textversionjsLib.textversionjsLibStrings.linebreak | textversionjsLib.textversionjsLibStrings.hashify
  ] = js.undefined
  var imgProcess: js.UndefOr[imgProcess] = js.undefined
  var keepNbsps: js.UndefOr[scala.Boolean] = js.undefined
  var linkProcess: js.UndefOr[linkProcess] = js.undefined
  var listIndentionTabs: js.UndefOr[scala.Double] = js.undefined
  var listStyle: js.UndefOr[
    textversionjsLib.textversionjsLibStrings.indentation | textversionjsLib.textversionjsLibStrings.linebreak
  ] = js.undefined
  var oIndentionChar: js.UndefOr[java.lang.String] = js.undefined
  var uIndentionChar: js.UndefOr[java.lang.String] = js.undefined
}

object styleConfig {
  @scala.inline
  def apply(
    headingStyle: textversionjsLib.textversionjsLibStrings.underline | textversionjsLib.textversionjsLibStrings.linebreak | textversionjsLib.textversionjsLibStrings.hashify = null,
    imgProcess: imgProcess = null,
    keepNbsps: js.UndefOr[scala.Boolean] = js.undefined,
    linkProcess: linkProcess = null,
    listIndentionTabs: scala.Int | scala.Double = null,
    listStyle: textversionjsLib.textversionjsLibStrings.indentation | textversionjsLib.textversionjsLibStrings.linebreak = null,
    oIndentionChar: java.lang.String = null,
    uIndentionChar: java.lang.String = null
  ): styleConfig = {
    val __obj = js.Dynamic.literal()
    if (headingStyle != null) __obj.updateDynamic("headingStyle")(headingStyle.asInstanceOf[js.Any])
    if (imgProcess != null) __obj.updateDynamic("imgProcess")(imgProcess)
    if (!js.isUndefined(keepNbsps)) __obj.updateDynamic("keepNbsps")(keepNbsps)
    if (linkProcess != null) __obj.updateDynamic("linkProcess")(linkProcess)
    if (listIndentionTabs != null) __obj.updateDynamic("listIndentionTabs")(listIndentionTabs.asInstanceOf[js.Any])
    if (listStyle != null) __obj.updateDynamic("listStyle")(listStyle.asInstanceOf[js.Any])
    if (oIndentionChar != null) __obj.updateDynamic("oIndentionChar")(oIndentionChar)
    if (uIndentionChar != null) __obj.updateDynamic("uIndentionChar")(uIndentionChar)
    __obj.asInstanceOf[styleConfig]
  }
}

