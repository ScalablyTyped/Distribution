package typings
package atUirouterCoreLib.libTransitionInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HookMatchCriteria
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[HookMatchCriterion]] {
  /** A [[HookMatchCriterion]] to match any state that would be entering */
  var entering: js.UndefOr[HookMatchCriterion] = js.undefined
  /** A [[HookMatchCriterion]] to match any state that would be exiting */
  var exiting: js.UndefOr[HookMatchCriterion] = js.undefined
  /** A [[HookMatchCriterion]] to match the original (from) state */
  var from: js.UndefOr[HookMatchCriterion] = js.undefined
  /** A [[HookMatchCriterion]] to match any state that would be retained */
  var retained: js.UndefOr[HookMatchCriterion] = js.undefined
  /** A [[HookMatchCriterion]] to match the destination state */
  var to: js.UndefOr[HookMatchCriterion] = js.undefined
}

object HookMatchCriteria {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[HookMatchCriterion]] = null,
    entering: HookMatchCriterion = null,
    exiting: HookMatchCriterion = null,
    from: HookMatchCriterion = null,
    retained: HookMatchCriterion = null,
    to: HookMatchCriterion = null
  ): HookMatchCriteria = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (entering != null) __obj.updateDynamic("entering")(entering.asInstanceOf[js.Any])
    if (exiting != null) __obj.updateDynamic("exiting")(exiting.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (retained != null) __obj.updateDynamic("retained")(retained.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[HookMatchCriteria]
  }
}

