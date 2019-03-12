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

object Js2SvgOptions {
  @scala.inline
  def apply(
    attrEnd: java.lang.String = null,
    attrStart: java.lang.String = null,
    cdataEnd: java.lang.String = null,
    cdataStart: java.lang.String = null,
    commentEnd: java.lang.String = null,
    commentStart: java.lang.String = null,
    doctypeEnd: java.lang.String = null,
    doctypeStart: java.lang.String = null,
    encodeEntity: /* char */ js.UndefOr[java.lang.String] => java.lang.String = null,
    indent: scala.Int | scala.Double = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    procInstEnd: java.lang.String = null,
    procInstStart: java.lang.String = null,
    regEntities: stdLib.RegExp = null,
    regValEntities: stdLib.RegExp = null,
    tagCloseEnd: java.lang.String = null,
    tagCloseStart: java.lang.String = null,
    tagOpenEnd: java.lang.String = null,
    tagOpenStart: java.lang.String = null,
    tagShortEnd: java.lang.String = null,
    tagShortStart: java.lang.String = null,
    textEnd: java.lang.String = null,
    textStart: java.lang.String = null,
    useShortTags: js.UndefOr[scala.Boolean] = js.undefined
  ): Js2SvgOptions = {
    val __obj = js.Dynamic.literal()
    if (attrEnd != null) __obj.updateDynamic("attrEnd")(attrEnd)
    if (attrStart != null) __obj.updateDynamic("attrStart")(attrStart)
    if (cdataEnd != null) __obj.updateDynamic("cdataEnd")(cdataEnd)
    if (cdataStart != null) __obj.updateDynamic("cdataStart")(cdataStart)
    if (commentEnd != null) __obj.updateDynamic("commentEnd")(commentEnd)
    if (commentStart != null) __obj.updateDynamic("commentStart")(commentStart)
    if (doctypeEnd != null) __obj.updateDynamic("doctypeEnd")(doctypeEnd)
    if (doctypeStart != null) __obj.updateDynamic("doctypeStart")(doctypeStart)
    if (encodeEntity != null) __obj.updateDynamic("encodeEntity")(js.Any.fromFunction1(encodeEntity))
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (procInstEnd != null) __obj.updateDynamic("procInstEnd")(procInstEnd)
    if (procInstStart != null) __obj.updateDynamic("procInstStart")(procInstStart)
    if (regEntities != null) __obj.updateDynamic("regEntities")(regEntities)
    if (regValEntities != null) __obj.updateDynamic("regValEntities")(regValEntities)
    if (tagCloseEnd != null) __obj.updateDynamic("tagCloseEnd")(tagCloseEnd)
    if (tagCloseStart != null) __obj.updateDynamic("tagCloseStart")(tagCloseStart)
    if (tagOpenEnd != null) __obj.updateDynamic("tagOpenEnd")(tagOpenEnd)
    if (tagOpenStart != null) __obj.updateDynamic("tagOpenStart")(tagOpenStart)
    if (tagShortEnd != null) __obj.updateDynamic("tagShortEnd")(tagShortEnd)
    if (tagShortStart != null) __obj.updateDynamic("tagShortStart")(tagShortStart)
    if (textEnd != null) __obj.updateDynamic("textEnd")(textEnd)
    if (textStart != null) __obj.updateDynamic("textStart")(textStart)
    if (!js.isUndefined(useShortTags)) __obj.updateDynamic("useShortTags")(useShortTags)
    __obj.asInstanceOf[Js2SvgOptions]
  }
}

