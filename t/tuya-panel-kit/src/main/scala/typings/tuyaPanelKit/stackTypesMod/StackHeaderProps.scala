package typings.tuyaPanelKit.stackTypesMod

import typings.reactNativeSafeAreaContext.safeAreaTypesMod.EdgeInsets
import typings.tuyaPanelKit.routersTypesMod.ParamListBase
import typings.tuyaPanelKit.routersTypesMod.Route
import typings.tuyaPanelKit.tuyaPanelKitStrings.float
import typings.tuyaPanelKit.tuyaPanelKitStrings.screen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackHeaderProps extends js.Object {
  
  /**
    * Safe area insets to use in the header, e.g. to apply extra spacing for statusbar and notch.
    */
  var insets: EdgeInsets = js.native
  
  /**
    * Layout of the screen.
    */
  var layout: Layout = js.native
  
  /**
    * Mode of the header: `float` renders a single floating header across all screens,
    * `screen` renders separate headers for each screen.
    */
  var mode: float | screen = js.native
  
  /**
    * Navigation prop for the header.
    */
  var navigation: StackNavigationProp[ParamListBase, String] = js.native
  
  /**
    * Object representing the previous scene.
    */
  var previous: js.UndefOr[Scene[Route[String, js.UndefOr[js.Object]]]] = js.native
  
  /**
    * Object representing the current scene, such as the route object and animation progress.
    */
  var scene: Scene[Route[String, js.UndefOr[js.Object]]] = js.native
  
  /**
    * Interpolated styles for various elements in the header.
    */
  var styleInterpolator: StackHeaderStyleInterpolator = js.native
}
object StackHeaderProps {
  
  @scala.inline
  def apply(
    insets: EdgeInsets,
    layout: Layout,
    mode: float | screen,
    navigation: StackNavigationProp[ParamListBase, String],
    scene: Scene[Route[String, js.UndefOr[js.Object]]],
    styleInterpolator: /* props */ StackHeaderInterpolationProps => StackHeaderInterpolatedStyle
  ): StackHeaderProps = {
    val __obj = js.Dynamic.literal(insets = insets.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], styleInterpolator = js.Any.fromFunction1(styleInterpolator))
    __obj.asInstanceOf[StackHeaderProps]
  }
  
  @scala.inline
  implicit class StackHeaderPropsOps[Self <: StackHeaderProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInsets(value: EdgeInsets): Self = this.set("insets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayout(value: Layout): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: float | screen): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigation(value: StackNavigationProp[ParamListBase, String]): Self = this.set("navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScene(value: Scene[Route[String, js.UndefOr[js.Object]]]): Self = this.set("scene", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleInterpolator(value: /* props */ StackHeaderInterpolationProps => StackHeaderInterpolatedStyle): Self = this.set("styleInterpolator", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPrevious(value: Scene[Route[String, js.UndefOr[js.Object]]]): Self = this.set("previous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevious: Self = this.set("previous", js.undefined)
  }
}
