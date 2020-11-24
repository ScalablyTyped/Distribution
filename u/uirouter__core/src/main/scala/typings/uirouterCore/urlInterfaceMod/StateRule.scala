package typings.uirouterCore.urlInterfaceMod

import typings.uirouterCore.stateMod.StateObject
import typings.uirouterCore.uirouterCoreStrings.STATE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StateRule extends MatcherUrlRule {
  
  var state: StateObject = js.native
  
  @JSName("type")
  var type_StateRule: STATE = js.native
}
