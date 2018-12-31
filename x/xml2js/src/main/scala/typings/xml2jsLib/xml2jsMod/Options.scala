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

