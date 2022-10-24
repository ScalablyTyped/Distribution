package typings.tuyaPanelKit

import typings.react.mod.RefObject
import typings.tuyaPanelKit.`@reactNavigationCoreTypesMod`.NavigationContainerRef
import typings.tuyaPanelKit.`@reactNavigationNativeTypesMod`.LinkingOptions
import typings.tuyaPanelKit.anon.GetInitialState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `@reactNavigationNativeUseLinkingMod` {
  
  @JSImport("tuya-panel-kit/@react-navigation/native/useLinking", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(ref: RefObject[NavigationContainerRef], param1: LinkingOptions): GetInitialState = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[GetInitialState]
}
