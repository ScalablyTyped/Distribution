package typings.svgo.svgoMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Js2SvgOptions extends js.Object {
  /** @default '"' */
  var attrEnd: js.UndefOr[String] = js.undefined
  /** @default '="' */
  var attrStart: js.UndefOr[String] = js.undefined
  /** @default ']]>' */
  var cdataEnd: js.UndefOr[String] = js.undefined
  /** @default '<![CDATA[' */
  var cdataStart: js.UndefOr[String] = js.undefined
  /** @default '-->' */
  var commentEnd: js.UndefOr[String] = js.undefined
  /** @default '<!--' */
  var commentStart: js.UndefOr[String] = js.undefined
  /** @default '>' */
  var doctypeEnd: js.UndefOr[String] = js.undefined
  /** @default '<!DOCTYPE' */
  var doctypeStart: js.UndefOr[String] = js.undefined
  /** @default encodeEntity */
  var encodeEntity: js.UndefOr[js.Function1[/* char */ js.UndefOr[String], String]] = js.undefined
  /** @default 4 */
  var indent: js.UndefOr[Double] = js.undefined
  /** @default false */
  var pretty: js.UndefOr[Boolean] = js.undefined
  /** @default '?>' */
  var procInstEnd: js.UndefOr[String] = js.undefined
  /** @default '<?' */
  var procInstStart: js.UndefOr[String] = js.undefined
  /** @default /[&'"<>]/g */
  var regEntities: js.UndefOr[RegExp] = js.undefined
  /** @default /[&"<>]/g */
  var regValEntities: js.UndefOr[RegExp] = js.undefined
  /** @default '>' */
  var tagCloseEnd: js.UndefOr[String] = js.undefined
  /** @default '</' */
  var tagCloseStart: js.UndefOr[String] = js.undefined
  /** @default '>' */
  var tagOpenEnd: js.UndefOr[String] = js.undefined
  /** @default '<' */
  var tagOpenStart: js.UndefOr[String] = js.undefined
  /** @default '/>' */
  var tagShortEnd: js.UndefOr[String] = js.undefined
  /** @default '<' */
  var tagShortStart: js.UndefOr[String] = js.undefined
  /** @default '' */
  var textEnd: js.UndefOr[String] = js.undefined
  /** @default '' */
  var textStart: js.UndefOr[String] = js.undefined
  /** @default true */
  var useShortTags: js.UndefOr[Boolean] = js.undefined
}

object Js2SvgOptions {
  @scala.inline
  def apply(
    attrEnd: String = null,
    attrStart: String = null,
    cdataEnd: String = null,
    cdataStart: String = null,
    commentEnd: String = null,
    commentStart: String = null,
    doctypeEnd: String = null,
    doctypeStart: String = null,
    encodeEntity: /* char */ js.UndefOr[String] => String = null,
    indent: Int | Double = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    procInstEnd: String = null,
    procInstStart: String = null,
    regEntities: RegExp = null,
    regValEntities: RegExp = null,
    tagCloseEnd: String = null,
    tagCloseStart: String = null,
    tagOpenEnd: String = null,
    tagOpenStart: String = null,
    tagShortEnd: String = null,
    tagShortStart: String = null,
    textEnd: String = null,
    textStart: String = null,
    useShortTags: js.UndefOr[Boolean] = js.undefined
  ): Js2SvgOptions = {
    val __obj = js.Dynamic.literal()
    if (attrEnd != null) __obj.updateDynamic("attrEnd")(attrEnd.asInstanceOf[js.Any])
    if (attrStart != null) __obj.updateDynamic("attrStart")(attrStart.asInstanceOf[js.Any])
    if (cdataEnd != null) __obj.updateDynamic("cdataEnd")(cdataEnd.asInstanceOf[js.Any])
    if (cdataStart != null) __obj.updateDynamic("cdataStart")(cdataStart.asInstanceOf[js.Any])
    if (commentEnd != null) __obj.updateDynamic("commentEnd")(commentEnd.asInstanceOf[js.Any])
    if (commentStart != null) __obj.updateDynamic("commentStart")(commentStart.asInstanceOf[js.Any])
    if (doctypeEnd != null) __obj.updateDynamic("doctypeEnd")(doctypeEnd.asInstanceOf[js.Any])
    if (doctypeStart != null) __obj.updateDynamic("doctypeStart")(doctypeStart.asInstanceOf[js.Any])
    if (encodeEntity != null) __obj.updateDynamic("encodeEntity")(js.Any.fromFunction1(encodeEntity))
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty.asInstanceOf[js.Any])
    if (procInstEnd != null) __obj.updateDynamic("procInstEnd")(procInstEnd.asInstanceOf[js.Any])
    if (procInstStart != null) __obj.updateDynamic("procInstStart")(procInstStart.asInstanceOf[js.Any])
    if (regEntities != null) __obj.updateDynamic("regEntities")(regEntities.asInstanceOf[js.Any])
    if (regValEntities != null) __obj.updateDynamic("regValEntities")(regValEntities.asInstanceOf[js.Any])
    if (tagCloseEnd != null) __obj.updateDynamic("tagCloseEnd")(tagCloseEnd.asInstanceOf[js.Any])
    if (tagCloseStart != null) __obj.updateDynamic("tagCloseStart")(tagCloseStart.asInstanceOf[js.Any])
    if (tagOpenEnd != null) __obj.updateDynamic("tagOpenEnd")(tagOpenEnd.asInstanceOf[js.Any])
    if (tagOpenStart != null) __obj.updateDynamic("tagOpenStart")(tagOpenStart.asInstanceOf[js.Any])
    if (tagShortEnd != null) __obj.updateDynamic("tagShortEnd")(tagShortEnd.asInstanceOf[js.Any])
    if (tagShortStart != null) __obj.updateDynamic("tagShortStart")(tagShortStart.asInstanceOf[js.Any])
    if (textEnd != null) __obj.updateDynamic("textEnd")(textEnd.asInstanceOf[js.Any])
    if (textStart != null) __obj.updateDynamic("textStart")(textStart.asInstanceOf[js.Any])
    if (!js.isUndefined(useShortTags)) __obj.updateDynamic("useShortTags")(useShortTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Js2SvgOptions]
  }
}

