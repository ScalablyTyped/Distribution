package typings
package atUirouterCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libUrlInterfaceMod {
  type UrlRuleHandlerFn = js.Function3[
    /* matchValue */ js.UndefOr[js.Any], 
    /* url */ js.UndefOr[UrlParts], 
    /* router */ js.UndefOr[atUirouterCoreLib.libRouterMod.UIRouter], 
    java.lang.String | atUirouterCoreLib.libStateMod.TargetState | atUirouterCoreLib.libStateInterfaceMod.TargetStateDef | scala.Unit
  ]
  type UrlRuleMatchFn = js.Function2[
    /* url */ js.UndefOr[UrlParts], 
    /* router */ js.UndefOr[atUirouterCoreLib.libRouterMod.UIRouter], 
    js.Any
  ]
  type UrlRuleType = atUirouterCoreLib.atUirouterCoreLibStrings.STATE | atUirouterCoreLib.atUirouterCoreLibStrings.URLMATCHER | atUirouterCoreLib.atUirouterCoreLibStrings.REGEXP | atUirouterCoreLib.atUirouterCoreLibStrings.RAW | atUirouterCoreLib.atUirouterCoreLibStrings.OTHER
}
