package typings.tuyaPanelKit.typesMod

import typings.react.mod.global.JSX.Element
import typings.tuyaPanelKit.routersTypesMod.NavigationState
import typings.tuyaPanelKit.routersTypesMod.ParamListBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Descriptor[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */, State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */] extends js.Object {
  
  /**
    * Navigation object for the screen
    */
  var navigation: NavigationProp[ParamList, RouteName, State, ScreenOptions, EventMap] = js.native
  
  /**
    * Options for the route.
    */
  var options: ScreenOptions = js.native
  
  /**
    * Render the component associated with this route.
    */
  def render(): Element = js.native
}
object Descriptor {
  
  @scala.inline
  def apply[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */, State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */](
    navigation: NavigationProp[ParamList, RouteName, State, ScreenOptions, EventMap],
    options: ScreenOptions,
    render: () => Element
  ): Descriptor[ParamList, RouteName, State, ScreenOptions, EventMap] = {
    val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], render = js.Any.fromFunction0(render))
    __obj.asInstanceOf[Descriptor[ParamList, RouteName, State, ScreenOptions, EventMap]]
  }
  
  @scala.inline
  implicit class DescriptorOps[Self <: Descriptor[_, _, _, _, _], ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */, State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */] (val x: Self with (Descriptor[ParamList, RouteName, State, ScreenOptions, EventMap])) extends AnyVal {
    
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
    def setNavigation(value: NavigationProp[ParamList, RouteName, State, ScreenOptions, EventMap]): Self = this.set("navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: ScreenOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRender(value: () => Element): Self = this.set("render", js.Any.fromFunction0(value))
  }
}
