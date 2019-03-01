package typings
package stripejsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BaseCompleteEmptyInvalid extends js.Object {
  var base: js.UndefOr[stripejsLib.elementMod.StyleAttributes] = js.undefined
  var complete: js.UndefOr[stripejsLib.elementMod.StyleAttributes] = js.undefined
  var empty: js.UndefOr[stripejsLib.elementMod.StyleAttributes] = js.undefined
  var invalid: js.UndefOr[stripejsLib.elementMod.StyleAttributes] = js.undefined
}

object Anon_BaseCompleteEmptyInvalid {
  @scala.inline
  def apply(
    base: stripejsLib.elementMod.StyleAttributes = null,
    complete: stripejsLib.elementMod.StyleAttributes = null,
    empty: stripejsLib.elementMod.StyleAttributes = null,
    invalid: stripejsLib.elementMod.StyleAttributes = null
  ): Anon_BaseCompleteEmptyInvalid = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (empty != null) __obj.updateDynamic("empty")(empty)
    if (invalid != null) __obj.updateDynamic("invalid")(invalid)
    __obj.asInstanceOf[Anon_BaseCompleteEmptyInvalid]
  }
}

