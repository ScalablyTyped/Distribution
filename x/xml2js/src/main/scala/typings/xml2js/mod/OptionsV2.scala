package typings.xml2js.mod

import typings.xml2js.anon.Encoding
import typings.xml2js.anon.Indent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsV2 extends Options {
  var cdata: js.UndefOr[Boolean] = js.undefined
  var chunkSize: js.UndefOr[Double] = js.undefined
  var doctype: js.UndefOr[js.Any] = js.undefined
  var headless: js.UndefOr[Boolean] = js.undefined
  var preserveChildrenOrder: js.UndefOr[Boolean] = js.undefined
  var renderOpts: js.UndefOr[Indent] = js.undefined
  var rootName: js.UndefOr[String] = js.undefined
  var xmldec: js.UndefOr[Encoding] = js.undefined
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
    chunkSize: js.UndefOr[Double] = js.undefined,
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
    renderOpts: Indent = null,
    rootName: String = null,
    strict: js.UndefOr[Boolean] = js.undefined,
    tagNameProcessors: js.Array[js.Function1[/* name */ String, _]] = null,
    trim: js.UndefOr[Boolean] = js.undefined,
    validator: js.Function = null,
    valueProcessors: js.Array[js.Function2[/* value */ String, /* name */ String, _]] = null,
    xmldec: Encoding = null,
    xmlns: js.UndefOr[Boolean] = js.undefined
  ): OptionsV2 = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.get.asInstanceOf[js.Any])
    if (attrNameProcessors != null) __obj.updateDynamic("attrNameProcessors")(attrNameProcessors.asInstanceOf[js.Any])
    if (attrValueProcessors != null) __obj.updateDynamic("attrValueProcessors")(attrValueProcessors.asInstanceOf[js.Any])
    if (attrkey != null) __obj.updateDynamic("attrkey")(attrkey.asInstanceOf[js.Any])
    if (!js.isUndefined(cdata)) __obj.updateDynamic("cdata")(cdata.get.asInstanceOf[js.Any])
    if (charkey != null) __obj.updateDynamic("charkey")(charkey.asInstanceOf[js.Any])
    if (!js.isUndefined(charsAsChildren)) __obj.updateDynamic("charsAsChildren")(charsAsChildren.get.asInstanceOf[js.Any])
    if (childkey != null) __obj.updateDynamic("childkey")(childkey.asInstanceOf[js.Any])
    if (!js.isUndefined(chunkSize)) __obj.updateDynamic("chunkSize")(chunkSize.get.asInstanceOf[js.Any])
    if (doctype != null) __obj.updateDynamic("doctype")(doctype.asInstanceOf[js.Any])
    if (emptyTag != null) __obj.updateDynamic("emptyTag")(emptyTag.asInstanceOf[js.Any])
    if (!js.isUndefined(explicitArray)) __obj.updateDynamic("explicitArray")(explicitArray.get.asInstanceOf[js.Any])
    if (!js.isUndefined(explicitCharkey)) __obj.updateDynamic("explicitCharkey")(explicitCharkey.get.asInstanceOf[js.Any])
    if (!js.isUndefined(explicitChildren)) __obj.updateDynamic("explicitChildren")(explicitChildren.get.asInstanceOf[js.Any])
    if (!js.isUndefined(explicitRoot)) __obj.updateDynamic("explicitRoot")(explicitRoot.get.asInstanceOf[js.Any])
    if (!js.isUndefined(headless)) __obj.updateDynamic("headless")(headless.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreAttrs)) __obj.updateDynamic("ignoreAttrs")(ignoreAttrs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeWhiteChars)) __obj.updateDynamic("includeWhiteChars")(includeWhiteChars.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mergeAttrs)) __obj.updateDynamic("mergeAttrs")(mergeAttrs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(normalize)) __obj.updateDynamic("normalize")(normalize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(normalizeTags)) __obj.updateDynamic("normalizeTags")(normalizeTags.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveChildrenOrder)) __obj.updateDynamic("preserveChildrenOrder")(preserveChildrenOrder.get.asInstanceOf[js.Any])
    if (renderOpts != null) __obj.updateDynamic("renderOpts")(renderOpts.asInstanceOf[js.Any])
    if (rootName != null) __obj.updateDynamic("rootName")(rootName.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.get.asInstanceOf[js.Any])
    if (tagNameProcessors != null) __obj.updateDynamic("tagNameProcessors")(tagNameProcessors.asInstanceOf[js.Any])
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim.get.asInstanceOf[js.Any])
    if (validator != null) __obj.updateDynamic("validator")(validator.asInstanceOf[js.Any])
    if (valueProcessors != null) __obj.updateDynamic("valueProcessors")(valueProcessors.asInstanceOf[js.Any])
    if (xmldec != null) __obj.updateDynamic("xmldec")(xmldec.asInstanceOf[js.Any])
    if (!js.isUndefined(xmlns)) __obj.updateDynamic("xmlns")(xmlns.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsV2]
  }
}

