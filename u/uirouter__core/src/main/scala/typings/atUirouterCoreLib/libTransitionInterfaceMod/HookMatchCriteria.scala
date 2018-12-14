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

