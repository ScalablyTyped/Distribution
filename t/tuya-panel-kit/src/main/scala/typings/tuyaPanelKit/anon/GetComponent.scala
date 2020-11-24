package typings.tuyaPanelKit.anon

import typings.react.mod.ReactNode
import typings.tuyaPanelKit.routersTypesMod.ParamListBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetComponent[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */] extends js.Object {
  
  /**
    * Render callback to render content of this screen.
    */
  def children(props: Route[ParamList, RouteName]): ReactNode = js.native
  
  var component: js.UndefOr[scala.Nothing] = js.native
  
  var getComponent: js.UndefOr[scala.Nothing] = js.native
}
object GetComponent {
  
  @scala.inline
  def apply[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */](children: Route[ParamList, RouteName] => ReactNode): GetComponent[ParamList, RouteName] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[GetComponent[ParamList, RouteName]]
  }
  
  @scala.inline
  implicit class GetComponentOps[Self <: GetComponent[_, _], ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */] (val x: Self with (GetComponent[ParamList, RouteName])) extends AnyVal {
    
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
    def setChildren(value: Route[ParamList, RouteName] => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
  }
}
