package typings
package xml2jsLib.xml2jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var async: js.UndefOr[scala.Boolean] = js.undefined
  var attrNameProcessors: js.UndefOr[js.Array[js.Function1[/* name */ java.lang.String, _]]] = js.undefined
  var attrValueProcessors: js.UndefOr[
    js.Array[js.Function2[/* value */ java.lang.String, /* name */ java.lang.String, _]]
  ] = js.undefined
  var attrkey: js.UndefOr[java.lang.String] = js.undefined
  var charkey: js.UndefOr[java.lang.String] = js.undefined
  var charsAsChildren: js.UndefOr[scala.Boolean] = js.undefined
  var childkey: js.UndefOr[java.lang.String] = js.undefined
  var emptyTag: js.UndefOr[js.Any] = js.undefined
  var explicitArray: js.UndefOr[scala.Boolean] = js.undefined
  var explicitCharkey: js.UndefOr[scala.Boolean] = js.undefined
  var explicitChildren: js.UndefOr[scala.Boolean] = js.undefined
  var explicitRoot: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreAttrs: js.UndefOr[scala.Boolean] = js.undefined
  var includeWhiteChars: js.UndefOr[scala.Boolean] = js.undefined
  var mergeAttrs: js.UndefOr[scala.Boolean] = js.undefined
  var normalize: js.UndefOr[scala.Boolean] = js.undefined
  var normalizeTags: js.UndefOr[scala.Boolean] = js.undefined
  var strict: js.UndefOr[scala.Boolean] = js.undefined
  var tagNameProcessors: js.UndefOr[js.Array[js.Function1[/* name */ java.lang.String, _]]] = js.undefined
  var trim: js.UndefOr[scala.Boolean] = js.undefined
  var validator: js.UndefOr[js.Function] = js.undefined
  var valueProcessors: js.UndefOr[
    js.Array[js.Function2[/* value */ java.lang.String, /* name */ java.lang.String, _]]
  ] = js.undefined
  var xmlns: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    async: js.UndefOr[scala.Boolean] = js.undefined,
    attrNameProcessors: js.Array[js.Function1[/* name */ java.lang.String, _]] = null,
    attrValueProcessors: js.Array[js.Function2[/* value */ java.lang.String, /* name */ java.lang.String, _]] = null,
    attrkey: java.lang.String = null,
    charkey: java.lang.String = null,
    charsAsChildren: js.UndefOr[scala.Boolean] = js.undefined,
    childkey: java.lang.String = null,
    emptyTag: js.Any = null,
    explicitArray: js.UndefOr[scala.Boolean] = js.undefined,
    explicitCharkey: js.UndefOr[scala.Boolean] = js.undefined,
    explicitChildren: js.UndefOr[scala.Boolean] = js.undefined,
    explicitRoot: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreAttrs: js.UndefOr[scala.Boolean] = js.undefined,
    includeWhiteChars: js.UndefOr[scala.Boolean] = js.undefined,
    mergeAttrs: js.UndefOr[scala.Boolean] = js.undefined,
    normalize: js.UndefOr[scala.Boolean] = js.undefined,
    normalizeTags: js.UndefOr[scala.Boolean] = js.undefined,
    strict: js.UndefOr[scala.Boolean] = js.undefined,
    tagNameProcessors: js.Array[js.Function1[/* name */ java.lang.String, _]] = null,
    trim: js.UndefOr[scala.Boolean] = js.undefined,
    validator: js.Function = null,
    valueProcessors: js.Array[js.Function2[/* value */ java.lang.String, /* name */ java.lang.String, _]] = null,
    xmlns: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (attrNameProcessors != null) __obj.updateDynamic("attrNameProcessors")(attrNameProcessors)
    if (attrValueProcessors != null) __obj.updateDynamic("attrValueProcessors")(attrValueProcessors)
    if (attrkey != null) __obj.updateDynamic("attrkey")(attrkey)
    if (charkey != null) __obj.updateDynamic("charkey")(charkey)
    if (!js.isUndefined(charsAsChildren)) __obj.updateDynamic("charsAsChildren")(charsAsChildren)
    if (childkey != null) __obj.updateDynamic("childkey")(childkey)
    if (emptyTag != null) __obj.updateDynamic("emptyTag")(emptyTag)
    if (!js.isUndefined(explicitArray)) __obj.updateDynamic("explicitArray")(explicitArray)
    if (!js.isUndefined(explicitCharkey)) __obj.updateDynamic("explicitCharkey")(explicitCharkey)
    if (!js.isUndefined(explicitChildren)) __obj.updateDynamic("explicitChildren")(explicitChildren)
    if (!js.isUndefined(explicitRoot)) __obj.updateDynamic("explicitRoot")(explicitRoot)
    if (!js.isUndefined(ignoreAttrs)) __obj.updateDynamic("ignoreAttrs")(ignoreAttrs)
    if (!js.isUndefined(includeWhiteChars)) __obj.updateDynamic("includeWhiteChars")(includeWhiteChars)
    if (!js.isUndefined(mergeAttrs)) __obj.updateDynamic("mergeAttrs")(mergeAttrs)
    if (!js.isUndefined(normalize)) __obj.updateDynamic("normalize")(normalize)
    if (!js.isUndefined(normalizeTags)) __obj.updateDynamic("normalizeTags")(normalizeTags)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    if (tagNameProcessors != null) __obj.updateDynamic("tagNameProcessors")(tagNameProcessors)
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim)
    if (validator != null) __obj.updateDynamic("validator")(validator)
    if (valueProcessors != null) __obj.updateDynamic("valueProcessors")(valueProcessors)
    if (!js.isUndefined(xmlns)) __obj.updateDynamic("xmlns")(xmlns)
    __obj.asInstanceOf[Options]
  }
}

