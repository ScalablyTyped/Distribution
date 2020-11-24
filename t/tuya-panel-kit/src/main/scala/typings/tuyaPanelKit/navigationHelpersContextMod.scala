package typings.tuyaPanelKit

import typings.react.mod.Context
import typings.std.Record
import typings.tuyaPanelKit.typesMod.NavigationHelpers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit/@react-navigation/core/NavigationHelpersContext", JSImport.Namespace)
@js.native
object navigationHelpersContextMod extends js.Object {
  
  /**
    * Context which holds the navigation helpers of the parent navigator.
    * Navigators should use this context in their view component.
    */
  // tslint:disable-next-line use-default-type-parameter
  val default: Context[js.UndefOr[NavigationHelpers[Record[String, js.UndefOr[js.Object]], js.Object]]] = js.native
}
