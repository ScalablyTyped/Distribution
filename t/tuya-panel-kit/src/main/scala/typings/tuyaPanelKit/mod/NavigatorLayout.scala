package typings.tuyaPanelKit.mod

import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import typings.tuyaPanelKit.anon.ModalVisible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit", "NavigatorLayout")
@js.native
class NavigatorLayout[P, S] protected ()
  extends Component[P, ModalVisible & S, js.Any] {
  def this(props: P) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: P, context: js.Any) = this()
  
  def hookRoute(route: DeprecatedNavigatorRoute): NavigationOptions = js.native
  
  def renderScene(route: DeprecatedNavigatorRoute, navigator: DeprecatedNavigator): js.UndefOr[Element] = js.native
}
