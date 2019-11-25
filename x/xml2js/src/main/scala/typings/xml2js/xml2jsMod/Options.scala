package typings.xml2js.xml2jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var async: js.UndefOr[Boolean] = js.undefined
  var attrNameProcessors: js.UndefOr[js.Array[js.Function1[/* name */ String, _]]] = js.undefined
  var attrValueProcessors: js.UndefOr[js.Array[js.Function2[/* value */ String, /* name */ String, _]]] = js.undefined
  var attrkey: js.UndefOr[String] = js.undefined
  var charkey: js.UndefOr[String] = js.undefined
  var charsAsChildren: js.UndefOr[Boolean] = js.undefined
  var childkey: js.UndefOr[String] = js.undefined
  var emptyTag: js.UndefOr[js.Any] = js.undefined
  var explicitArray: js.UndefOr[Boolean] = js.undefined
  var explicitCharkey: js.UndefOr[Boolean] = js.undefined
  var explicitChildren: js.UndefOr[Boolean] = js.undefined
  var explicitRoot: js.UndefOr[Boolean] = js.undefined
  var ignoreAttrs: js.UndefOr[Boolean] = js.undefined
  var includeWhiteChars: js.UndefOr[Boolean] = js.undefined
  var mergeAttrs: js.UndefOr[Boolean] = js.undefined
  var normalize: js.UndefOr[Boolean] = js.undefined
  var normalizeTags: js.UndefOr[Boolean] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
  var tagNameProcessors: js.UndefOr[js.Array[js.Function1[/* name */ String, _]]] = js.undefined
  var trim: js.UndefOr[Boolean] = js.undefined
  var validator: js.UndefOr[js.Function] = js.undefined
  var valueProcessors: js.UndefOr[js.Array[js.Function2[/* value */ String, /* name */ String, _]]] = js.undefined
  var xmlns: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    async: js.UndefOr[Boolean] = js.undefined,
    attrNameProcessors: js.Array[js.Function1[/* name */ String, _]] = null,
    attrValueProcessors: js.Array[js.Function2[/* value */ String, /* name */ String, _]] = null,
    attrkey: String = null,
    charkey: String = null,
    charsAsChildren: js.UndefOr[Boolean] = js.undefined,
    childkey: String = null,
    emptyTag: js.Any = null,
    explicitArray: js.UndefOr[Boolean] = js.undefined,
    explicitCharkey: js.UndefOr[Boolean] = js.undefined,
    explicitChildren: js.UndefOr[Boolean] = js.undefined,
    explicitRoot: js.UndefOr[Boolean] = js.undefined,
    ignoreAttrs: js.UndefOr[Boolean] = js.undefined,
    includeWhiteChars: js.UndefOr[Boolean] = js.undefined,
    mergeAttrs: js.UndefOr[Boolean] = js.undefined,
    normalize: js.UndefOr[Boolean] = js.undefined,
    normalizeTags: js.UndefOr[Boolean] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined,
    tagNameProcessors: js.Array[js.Function1[/* name */ String, _]] = null,
    trim: js.UndefOr[Boolean] = js.undefined,
    validator: js.Function = null,
    valueProcessors: js.Array[js.Function2[/* value */ String, /* name */ String, _]] = null,
    xmlns: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (attrNameProcessors != null) __obj.updateDynamic("attrNameProcessors")(attrNameProcessors.asInstanceOf[js.Any])
    if (attrValueProcessors != null) __obj.updateDynamic("attrValueProcessors")(attrValueProcessors.asInstanceOf[js.Any])
    if (attrkey != null) __obj.updateDynamic("attrkey")(attrkey.asInstanceOf[js.Any])
    if (charkey != null) __obj.updateDynamic("charkey")(charkey.asInstanceOf[js.Any])
    if (!js.isUndefined(charsAsChildren)) __obj.updateDynamic("charsAsChildren")(charsAsChildren.asInstanceOf[js.Any])
    if (childkey != null) __obj.updateDynamic("childkey")(childkey.asInstanceOf[js.Any])
    if (emptyTag != null) __obj.updateDynamic("emptyTag")(emptyTag.asInstanceOf[js.Any])
    if (!js.isUndefined(explicitArray)) __obj.updateDynamic("explicitArray")(explicitArray.asInstanceOf[js.Any])
    if (!js.isUndefined(explicitCharkey)) __obj.updateDynamic("explicitCharkey")(explicitCharkey.asInstanceOf[js.Any])
    if (!js.isUndefined(explicitChildren)) __obj.updateDynamic("explicitChildren")(explicitChildren.asInstanceOf[js.Any])
    if (!js.isUndefined(explicitRoot)) __obj.updateDynamic("explicitRoot")(explicitRoot.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreAttrs)) __obj.updateDynamic("ignoreAttrs")(ignoreAttrs.asInstanceOf[js.Any])
    if (!js.isUndefined(includeWhiteChars)) __obj.updateDynamic("includeWhiteChars")(includeWhiteChars.asInstanceOf[js.Any])
    if (!js.isUndefined(mergeAttrs)) __obj.updateDynamic("mergeAttrs")(mergeAttrs.asInstanceOf[js.Any])
    if (!js.isUndefined(normalize)) __obj.updateDynamic("normalize")(normalize.asInstanceOf[js.Any])
    if (!js.isUndefined(normalizeTags)) __obj.updateDynamic("normalizeTags")(normalizeTags.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    if (tagNameProcessors != null) __obj.updateDynamic("tagNameProcessors")(tagNameProcessors.asInstanceOf[js.Any])
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim.asInstanceOf[js.Any])
    if (validator != null) __obj.updateDynamic("validator")(validator.asInstanceOf[js.Any])
    if (valueProcessors != null) __obj.updateDynamic("valueProcessors")(valueProcessors.asInstanceOf[js.Any])
    if (!js.isUndefined(xmlns)) __obj.updateDynamic("xmlns")(xmlns.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

