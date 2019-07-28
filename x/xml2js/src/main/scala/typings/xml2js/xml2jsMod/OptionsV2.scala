package typings.xml2js.xml2jsMod

import typings.xml2js.Anon_Encoding
import typings.xml2js.Anon_Indent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsV2 extends Options {
  var cdata: js.UndefOr[Boolean] = js.undefined
  var chunkSize: js.UndefOr[Double] = js.undefined
  var doctype: js.UndefOr[js.Any] = js.undefined
  var headless: js.UndefOr[Boolean] = js.undefined
  var preserveChildrenOrder: js.UndefOr[Boolean] = js.undefined
  var renderOpts: js.UndefOr[Anon_Indent] = js.undefined
  var rootName: js.UndefOr[String] = js.undefined
  var xmldec: js.UndefOr[Anon_Encoding] = js.undefined
}

object OptionsV2 {
  @scala.inline
  def apply(
    async: js.UndefOr[Boolean] = js.undefined,
    attrNameProcessors: js.Array[js.Function1[/* name */ String, _]] = null,
    attrValueProcessors: js.Array[js.Function2[/* value */ String, /* name */ String, _]] = null,
    attrkey: String = null,
    cdata: js.UndefOr[Boolean] = js.undefined,
    charkey: String = null,
    charsAsChildren: js.UndefOr[Boolean] = js.undefined,
    childkey: String = null,
    chunkSize: Int | Double = null,
    doctype: js.Any = null,
    emptyTag: js.Any = null,
    explicitArray: js.UndefOr[Boolean] = js.undefined,
    explicitCharkey: js.UndefOr[Boolean] = js.undefined,
    explicitChildren: js.UndefOr[Boolean] = js.undefined,
    explicitRoot: js.UndefOr[Boolean] = js.undefined,
    headless: js.UndefOr[Boolean] = js.undefined,
    ignoreAttrs: js.UndefOr[Boolean] = js.undefined,
    includeWhiteChars: js.UndefOr[Boolean] = js.undefined,
    mergeAttrs: js.UndefOr[Boolean] = js.undefined,
    normalize: js.UndefOr[Boolean] = js.undefined,
    normalizeTags: js.UndefOr[Boolean] = js.undefined,
    preserveChildrenOrder: js.UndefOr[Boolean] = js.undefined,
    renderOpts: Anon_Indent = null,
    rootName: String = null,
    strict: js.UndefOr[Boolean] = js.undefined,
    tagNameProcessors: js.Array[js.Function1[/* name */ String, _]] = null,
    trim: js.UndefOr[Boolean] = js.undefined,
    validator: js.Function = null,
    valueProcessors: js.Array[js.Function2[/* value */ String, /* name */ String, _]] = null,
    xmldec: Anon_Encoding = null,
    xmlns: js.UndefOr[Boolean] = js.undefined
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

