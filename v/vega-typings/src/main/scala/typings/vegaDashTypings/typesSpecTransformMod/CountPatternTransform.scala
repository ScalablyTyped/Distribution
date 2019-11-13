package typings.vegaDashTypings.typesSpecTransformMod

import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.typesSpecUtilMod.Vector2
import typings.vegaDashTypings.vegaDashTypingsStrings.countpattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountPatternTransform extends Transforms {
  var as: js.UndefOr[(Vector2[String | SignalRef]) | SignalRef] = js.undefined
  var `case`: js.UndefOr[String | SignalRef] = js.undefined
  var field: FieldRef
  var pattern: js.UndefOr[String | SignalRef] = js.undefined
  var stopwords: js.UndefOr[String | SignalRef] = js.undefined
  var `type`: countpattern
}

object CountPatternTransform {
  @scala.inline
  def apply(
    field: FieldRef,
    `type`: countpattern,
    as: (Vector2[String | SignalRef]) | SignalRef = null,
    `case`: String | SignalRef = null,
    pattern: String | SignalRef = null,
    stopwords: String | SignalRef = null
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

