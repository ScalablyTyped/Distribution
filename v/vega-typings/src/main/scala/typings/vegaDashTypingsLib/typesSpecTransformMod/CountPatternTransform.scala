package typings
package vegaDashTypingsLib.typesSpecTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountPatternTransform extends _Transforms {
  var as: js.UndefOr[
    (vegaDashTypingsLib.typesSpecUtilMod.Vector2[java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  var `case`: js.UndefOr[java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var field: java.lang.String | TransformField
  var pattern: js.UndefOr[java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var stopwords: js.UndefOr[java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.countpattern
}

object CountPatternTransform {
  @scala.inline
  def apply(
    field: java.lang.String | TransformField,
    `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.countpattern,
    as: (vegaDashTypingsLib.typesSpecUtilMod.Vector2[java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    `case`: java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    pattern: java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    stopwords: java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null
  ): CountPatternTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (`case` != null) __obj.updateDynamic("case")(`case`.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (stopwords != null) __obj.updateDynamic("stopwords")(stopwords.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountPatternTransform]
  }
}

