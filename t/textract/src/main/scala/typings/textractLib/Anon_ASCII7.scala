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

