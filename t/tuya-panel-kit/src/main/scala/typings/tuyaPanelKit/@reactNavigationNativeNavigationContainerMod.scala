package typings.tuyaPanelKit

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ForwardRefExoticComponent
import typings.tuyaPanelKit.anon.NavigationContainerPropst
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `@reactNavigationNativeNavigationContainerMod` extends Shortcut {
  
  /**
    * Container component which holds the navigation state designed for React Native apps.
    * This should be rendered at the root wrapping the whole app.
    *
    * @param props.initialState Initial state object for the navigation tree.
    * When deep link handling is enabled, this will override deep links when specified.
    * Make sure that you don't specify an `initialState` when there's a deep link (`Linking.getInitialURL()`).
    * @param props.onReady Callback which is called after the navigation tree mounts.
    * @param props.onStateChange Callback which is called with the latest navigation state when it changes.
    * @param props.theme Theme object for the navigators.
    * @param props.linking Options for deep linking. Deep link handling is enabled when this prop is provided, unless `linking.enabled` is `false`.
    * @param props.fallback Fallback component to render until we have finished getting initial state when linking is enabled. Defaults to `null`.
    * @param props.documentTitle Options to configure the document title on Web. Updating document title is handled by default unless `documentTitle.enabled` is `false`.
    * @param props.children Child elements to render the content.
    * @param props.ref Ref object which refers to the navigation object containing helper methods.
    */
  @JSImport("tuya-panel-kit/@react-navigation/native/NavigationContainer", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[NavigationContainerPropst] = js.native
  
  type _To = ForwardRefExoticComponent[NavigationContainerPropst]
  
  /* This means you don't have to write `default`, but can instead just say ``@reactNavigationNativeNavigationContainerMod`.foo` */
  override def _to: ForwardRefExoticComponent[NavigationContainerPropst] = default
}
