package typings.textversionjs.textversionjsMod

import typings.textversionjs.textversionjsStrings.hashify
import typings.textversionjs.textversionjsStrings.indentation
import typings.textversionjs.textversionjsStrings.linebreak
import typings.textversionjs.textversionjsStrings.underline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait styleConfig extends js.Object {
  var headingStyle: js.UndefOr[underline | linebreak | hashify] = js.undefined
  var imgProcess: js.UndefOr[typings.textversionjs.textversionjsMod.imgProcess] = js.undefined
  var keepNbsps: js.UndefOr[Boolean] = js.undefined
  var linkProcess: js.UndefOr[typings.textversionjs.textversionjsMod.linkProcess] = js.undefined
  var listIndentionTabs: js.UndefOr[Double] = js.undefined
  var listStyle: js.UndefOr[indentation | linebreak] = js.undefined
  var oIndentionChar: js.UndefOr[String] = js.undefined
  var uIndentionChar: js.UndefOr[String] = js.undefined
}

object styleConfig {
  @scala.inline
  def apply(
    headingStyle: underline | linebreak | hashify = null,
    imgProcess: (/* src */ String, /* alt */ String) => String = null,
    keepNbsps: js.UndefOr[Boolean] = js.undefined,
    linkProcess: (/* href */ String, /* linkText */ String) => String = null,
    listIndentionTabs: Int | Double = null,
    listStyle: indentation | linebreak = null,
    oIndentionChar: String = null,
    uIndentionChar: String = null
  ): styleConfig = {
    val __obj = js.Dynamic.literal()
    if (headingStyle != null) __obj.updateDynamic("headingStyle")(headingStyle.asInstanceOf[js.Any])
    if (imgProcess != null) __obj.updateDynamic("imgProcess")(js.Any.fromFunction2(imgProcess))
    if (!js.isUndefined(keepNbsps)) __obj.updateDynamic("keepNbsps")(keepNbsps.asInstanceOf[js.Any])
    if (linkProcess != null) __obj.updateDynamic("linkProcess")(js.Any.fromFunction2(linkProcess))
    if (listIndentionTabs != null) __obj.updateDynamic("listIndentionTabs")(listIndentionTabs.asInstanceOf[js.Any])
    if (listStyle != null) __obj.updateDynamic("listStyle")(listStyle.asInstanceOf[js.Any])
    if (oIndentionChar != null) __obj.updateDynamic("oIndentionChar")(oIndentionChar.asInstanceOf[js.Any])
    if (uIndentionChar != null) __obj.updateDynamic("uIndentionChar")(uIndentionChar.asInstanceOf[js.Any])
    __obj.asInstanceOf[styleConfig]
  }
}

