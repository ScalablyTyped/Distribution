package typings.tuyaPanelKit

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Context
import typings.std.Record
import typings.tuyaPanelKit.`@reactNavigationCoreTypesMod`.NavigationHelpers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `@reactNavigationCoreNavigationHelpersContextMod` extends Shortcut {
  
  /**
    * Context which holds the navigation helpers of the parent navigator.
    * Navigators should use this context in their view component.
    */
  // tslint:disable-next-line use-default-type-parameter
  @JSImport("tuya-panel-kit/@react-navigation/core/NavigationHelpersContext", JSImport.Default)
  @js.native
  val default: Context[js.UndefOr[NavigationHelpers[Record[String, js.UndefOr[js.Object]], js.Object]]] = js.native
  
  type _To = Context[js.UndefOr[NavigationHelpers[Record[String, js.UndefOr[js.Object]], js.Object]]]
  
  /* This means you don't have to write `default`, but can instead just say ``@reactNavigationCoreNavigationHelpersContextMod`.foo` */
  override def _to: Context[js.UndefOr[NavigationHelpers[Record[String, js.UndefOr[js.Object]], js.Object]]] = default
}
