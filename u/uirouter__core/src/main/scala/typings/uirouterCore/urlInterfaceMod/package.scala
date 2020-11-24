package typings.uirouterCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object urlInterfaceMod {
  
  type UrlRuleHandlerFn = js.Function3[
    /* matchValue */ js.UndefOr[js.Any], 
    /* url */ js.UndefOr[typings.uirouterCore.urlInterfaceMod.UrlParts], 
    /* router */ js.UndefOr[typings.uirouterCore.routerMod.UIRouter], 
    java.lang.String | typings.uirouterCore.stateMod.TargetState | typings.uirouterCore.stateInterfaceMod.TargetStateDef | scala.Unit
  ]
  
  type UrlRuleMatchFn = js.Function2[
    /* url */ js.UndefOr[typings.uirouterCore.urlInterfaceMod.UrlParts], 
    /* router */ js.UndefOr[typings.uirouterCore.routerMod.UIRouter], 
    js.Any
  ]
}
