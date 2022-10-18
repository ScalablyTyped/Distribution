package typings.tuyaPanelKit

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Context
import typings.std.Record
import typings.tuyaPanelKit.`@reactNavigationCoreTypesMod`.NavigationProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `@reactNavigationCoreNavigationContextMod` extends Shortcut {
  
  /**
    * Context which holds the navigation prop for a screen.
    */
  // tslint:disable-next-line use-default-type-parameter
  @JSImport("tuya-panel-kit/@react-navigation/core/NavigationContext", JSImport.Default)
  @js.native
  val default: Context[
    js.UndefOr[
      NavigationProp[Record[String, js.UndefOr[js.Object]], String, Any, Any, js.Object]
    ]
  ] = js.native
  
  type _To = Context[
    js.UndefOr[
      NavigationProp[Record[String, js.UndefOr[js.Object]], String, Any, Any, js.Object]
    ]
  ]
  
  /* This means you don't have to write `default`, but can instead just say ``@reactNavigationCoreNavigationContextMod`.foo` */
  override def _to: Context[
    js.UndefOr[
      NavigationProp[Record[String, js.UndefOr[js.Object]], String, Any, Any, js.Object]
    ]
  ] = default
}
