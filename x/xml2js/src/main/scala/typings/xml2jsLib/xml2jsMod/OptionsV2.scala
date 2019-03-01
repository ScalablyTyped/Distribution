package typings
package xml2jsLib.xml2jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsV2 extends Options {
  var cdata: js.UndefOr[scala.Boolean] = js.undefined
  var chunkSize: js.UndefOr[scala.Double] = js.undefined
  var doctype: js.UndefOr[js.Any] = js.undefined
  var headless: js.UndefOr[scala.Boolean] = js.undefined
  var preserveChildrenOrder: js.UndefOr[scala.Boolean] = js.undefined
  var renderOpts: js.UndefOr[xml2jsLib.Anon_Indent] = js.undefined
  var rootName: js.UndefOr[java.lang.String] = js.undefined
  var xmldec: js.UndefOr[xml2jsLib.Anon_Encoding] = js.undefined
}

object OptionsV2 {
  @scala.inline
  def apply(
    async: js.UndefOr[scala.Boolean] = js.undefined,
    attrNameProcessors: js.Array[js.Function1[/* name */ java.lang.String, _]] = null,
    attrValueProcessors: js.Array[js.Function2[/* value */ java.lang.String, /* name */ java.lang.String, _]] = null,
    attrkey: java.lang.String = null,
    cdata: js.UndefOr[scala.Boolean] = js.undefined,
    charkey: java.lang.String = null,
    charsAsChildren: js.UndefOr[scala.Boolean] = js.undefined,
    childkey: java.lang.String = null,
    chunkSize: scala.Int | scala.Double = null,
    doctype: js.Any = null,
    emptyTag: js.Any = null,
    explicitArray: js.UndefOr[scala.Boolean] = js.undefined,
    explicitCharkey: js.UndefOr[scala.Boolean] = js.undefined,
    explicitChildren: js.UndefOr[scala.Boolean] = js.undefined,
    explicitRoot: js.UndefOr[scala.Boolean] = js.undefined,
    headless: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreAttrs: js.UndefOr[scala.Boolean] = js.undefined,
    includeWhiteChars: js.UndefOr[scala.Boolean] = js.undefined,
    mergeAttrs: js.UndefOr[scala.Boolean] = js.undefined,
    normalize: js.UndefOr[scala.Boolean] = js.undefined,
    normalizeTags: js.UndefOr[scala.Boolean] = js.undefined,
    preserveChildrenOrder: js.UndefOr[scala.Boolean] = js.undefined,
    renderOpts: xml2jsLib.Anon_Indent = null,
    rootName: java.lang.String = null,
    strict: js.UndefOr[scala.Boolean] = js.undefined,
    tagNameProcessors: js.Array[js.Function1[/* name */ java.lang.String, _]] = null,
    trim: js.UndefOr[scala.Boolean] = js.undefined,
    validator: js.Function = null,
    valueProcessors: js.Array[js.Function2[/* value */ java.lang.String, /* name */ java.lang.String, _]] = null,
    xmldec: xml2jsLib.Anon_Encoding = null,
    xmlns: js.UndefOr[scala.Boolean] = js.undefined
  ): OptionsV2 = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (attrNameProcessors != null) __obj.updateDynamic("attrNameProcessors")(attrNameProcessors)
    if (attrValueProcessors != null) __obj.updateDynamic("attrValueProcessors")(attrValueProcessors)
    if (attrkey != null) __obj.updateDynamic("attrkey")(attrkey)
    if (!js.isUndefined(cdata)) __obj.updateDynamic("cdata")(cdata)
    if (charkey != null) __obj.updateDynamic("charkey")(charkey)
    if (!js.isUndefined(charsAsChildren)) __obj.updateDynamic("charsAsChildren")(charsAsChildren)
    if (childkey != null) __obj.updateDynamic("childkey")(childkey)
    if (chunkSize != null) __obj.updateDynamic("chunkSize")(chunkSize.asInstanceOf[js.Any])
    if (doctype != null) __obj.updateDynamic("doctype")(doctype)
    if (emptyTag != null) __obj.updateDynamic("emptyTag")(emptyTag)
    if (!js.isUndefined(explicitArray)) __obj.updateDynamic("explicitArray")(explicitArray)
    if (!js.isUndefined(explicitCharkey)) __obj.updateDynamic("explicitCharkey")(explicitCharkey)
    if (!js.isUndefined(explicitChildren)) __obj.updateDynamic("explicitChildren")(explicitChildren)
    if (!js.isUndefined(explicitRoot)) __obj.updateDynamic("explicitRoot")(explicitRoot)
    if (!js.isUndefined(headless)) __obj.updateDynamic("headless")(headless)
    if (!js.isUndefined(ignoreAttrs)) __obj.updateDynamic("ignoreAttrs")(ignoreAttrs)
    if (!js.isUndefined(includeWhiteChars)) __obj.updateDynamic("includeWhiteChars")(includeWhiteChars)
    if (!js.isUndefined(mergeAttrs)) __obj.updateDynamic("mergeAttrs")(mergeAttrs)
    if (!js.isUndefined(normalize)) __obj.updateDynamic("normalize")(normalize)
    if (!js.isUndefined(normalizeTags)) __obj.updateDynamic("normalizeTags")(normalizeTags)
    if (!js.isUndefined(preserveChildrenOrder)) __obj.updateDynamic("preserveChildrenOrder")(preserveChildrenOrder)
    if (renderOpts != null) __obj.updateDynamic("renderOpts")(renderOpts)
    if (rootName != null) __obj.updateDynamic("rootName")(rootName)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    if (tagNameProcessors != null) __obj.updateDynamic("tagNameProcessors")(tagNameProcessors)
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim)
    if (validator != null) __obj.updateDynamic("validator")(validator)
    if (valueProcessors != null) __obj.updateDynamic("valueProcessors")(valueProcessors)
    if (xmldec != null) __obj.updateDynamic("xmldec")(xmldec)
    if (!js.isUndefined(xmlns)) __obj.updateDynamic("xmlns")(xmlns)
    __obj.asInstanceOf[OptionsV2]
  }
}

