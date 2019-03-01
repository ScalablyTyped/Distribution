package typings
package vegaDashTypingsLib.typesSpecTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountPatternTransform extends _Transforms {
  var as: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var `case`: js.UndefOr[java.lang.String] = js.undefined
  var field: java.lang.String | TransformField
  var pattern: js.UndefOr[java.lang.String] = js.undefined
  var stopwords: js.UndefOr[java.lang.String] = js.undefined
  var `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.countpattern
}

object CountPatternTransform {
  @scala.inline
  def apply(
    field: java.lang.String | TransformField,
    `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.countpattern,
    as: js.Array[java.lang.String] = null,
    `case`: java.lang.String = null,
    pattern: java.lang.String = null,
    stopwords: java.lang.String = null
  ): CountPatternTransform = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as)
    if (`case` != null) __obj.updateDynamic("case")(`case`)
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    if (stopwords != null) __obj.updateDynamic("stopwords")(stopwords)
    __obj.asInstanceOf[CountPatternTransform]
  }
}

