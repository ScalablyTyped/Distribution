package typings
package textractLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ASCII7 extends js.Object {
  var crop: js.UndefOr[Anon_H] = js.undefined
  /**
    * @default "UTF-8"
    */
  var encoding: js.UndefOr[
    textractLib.textractLibStrings.`UCS-2` | textractLib.textractLibStrings.ASCII7 | textractLib.textractLibStrings.Latin1 | textractLib.textractLibStrings.`UTF-8` | textractLib.textractLibStrings.ZapfDingbats | textractLib.textractLibStrings.Symbol
  ] = js.undefined
  var eol: js.UndefOr[
    textractLib.textractLibStrings.unix | textractLib.textractLibStrings.dos | textractLib.textractLibStrings.mac
  ] = js.undefined
  var firstPage: js.UndefOr[scala.Double] = js.undefined
  var lastPage: js.UndefOr[scala.Double] = js.undefined
  /**
    * Do not change unless you know what you are doing!
    * @default "raw"
    */
  var layout: js.UndefOr[
    textractLib.textractLibStrings.layout | textractLib.textractLibStrings.raw | textractLib.textractLibStrings.htmlmeta
  ] = js.undefined
  var ownerPassword: js.UndefOr[java.lang.String] = js.undefined
  var resolution: js.UndefOr[scala.Double] = js.undefined
  /**
    * @default true
    */
  var splitPages: js.UndefOr[scala.Boolean] = js.undefined
  var userPassword: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ASCII7 {
  @scala.inline
  def apply(
    crop: Anon_H = null,
    encoding: textractLib.textractLibStrings.`UCS-2` | textractLib.textractLibStrings.ASCII7 | textractLib.textractLibStrings.Latin1 | textractLib.textractLibStrings.`UTF-8` | textractLib.textractLibStrings.ZapfDingbats | textractLib.textractLibStrings.Symbol = null,
    eol: textractLib.textractLibStrings.unix | textractLib.textractLibStrings.dos | textractLib.textractLibStrings.mac = null,
    firstPage: scala.Int | scala.Double = null,
    lastPage: scala.Int | scala.Double = null,
    layout: textractLib.textractLibStrings.layout | textractLib.textractLibStrings.raw | textractLib.textractLibStrings.htmlmeta = null,
    ownerPassword: java.lang.String = null,
    resolution: scala.Int | scala.Double = null,
    splitPages: js.UndefOr[scala.Boolean] = js.undefined,
    userPassword: java.lang.String = null
  ): Anon_ASCII7 = {
    val __obj = js.Dynamic.literal()
    if (crop != null) __obj.updateDynamic("crop")(crop)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (eol != null) __obj.updateDynamic("eol")(eol.asInstanceOf[js.Any])
    if (firstPage != null) __obj.updateDynamic("firstPage")(firstPage.asInstanceOf[js.Any])
    if (lastPage != null) __obj.updateDynamic("lastPage")(lastPage.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (ownerPassword != null) __obj.updateDynamic("ownerPassword")(ownerPassword)
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (!js.isUndefined(splitPages)) __obj.updateDynamic("splitPages")(splitPages)
    if (userPassword != null) __obj.updateDynamic("userPassword")(userPassword)
    __obj.asInstanceOf[Anon_ASCII7]
  }
}

