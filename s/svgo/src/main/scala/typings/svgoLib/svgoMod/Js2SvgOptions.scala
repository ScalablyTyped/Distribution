package typings
package svgoLib.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Js2SvgOptions extends js.Object {
  /** @default '"' */
  var attrEnd: js.UndefOr[java.lang.String] = js.undefined
  /** @default '="' */
  var attrStart: js.UndefOr[java.lang.String] = js.undefined
  /** @default ']]>' */
  var cdataEnd: js.UndefOr[java.lang.String] = js.undefined
  /** @default '<![CDATA[' */
  var cdataStart: js.UndefOr[java.lang.String] = js.undefined
  /** @default '-->' */
  var commentEnd: js.UndefOr[java.lang.String] = js.undefined
  /** @default '<!--' */
  var commentStart: js.UndefOr[java.lang.String] = js.undefined
  /** @default '>' */
  var doctypeEnd: js.UndefOr[java.lang.String] = js.undefined
  /** @default '<!DOCTYPE' */
  var doctypeStart: js.UndefOr[java.lang.String] = js.undefined
  /** @default encodeEntity */
  var encodeEntity: js.UndefOr[js.Function1[/* char */ js.UndefOr[java.lang.String], java.lang.String]] = js.undefined
  /** @default 4 */
  var indent: js.UndefOr[scala.Double] = js.undefined
  /** @default false */
  var pretty: js.UndefOr[scala.Boolean] = js.undefined
  /** @default '?>' */
  var procInstEnd: js.UndefOr[java.lang.String] = js.undefined
  /** @default '<?' */
  var procInstStart: js.UndefOr[java.lang.String] = js.undefined
  /** @default /[&'"<>]/g */
  var regEntities: js.UndefOr[stdLib.RegExp] = js.undefined
  /** @default /[&"<>]/g */
  var regValEntities: js.UndefOr[stdLib.RegExp] = js.undefined
  /** @default '>' */
  var tagCloseEnd: js.UndefOr[java.lang.String] = js.undefined
  /** @default '</' */
  var tagCloseStart: js.UndefOr[java.lang.String] = js.undefined
  /** @default '>' */
  var tagOpenEnd: js.UndefOr[java.lang.String] = js.undefined
  /** @default '<' */
  var tagOpenStart: js.UndefOr[java.lang.String] = js.undefined
  /** @default '/>' */
  var tagShortEnd: js.UndefOr[java.lang.String] = js.undefined
  /** @default '<' */
  var tagShortStart: js.UndefOr[java.lang.String] = js.undefined
  /** @default '' */
  var textEnd: js.UndefOr[java.lang.String] = js.undefined
  /** @default '' */
  var textStart: js.UndefOr[java.lang.String] = js.undefined
  /** @default true */
  var useShortTags: js.UndefOr[scala.Boolean] = js.undefined
}

