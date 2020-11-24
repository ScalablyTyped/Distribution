package typings.tuyaPanelKit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeprecatedNavigator extends js.Object {
  
  def getCurrentRoutes(): js.Array[DeprecatedNavigatorRoute] = js.native
  
  def immediatelyResetRouteStack(nextRouteStack: js.Array[DeprecatedNavigatorRoute]): Unit = js.native
  
  def jumpBack(): Unit = js.native
  
  def jumpForward(): Unit = js.native
  
  def jumpTo(route: DeprecatedNavigatorRoute): Unit = js.native
  
  def pop(): Unit = js.native
  
  def popN(n: Double): Unit = js.native
  
  def popToRoute(route: DeprecatedNavigatorRoute): Unit = js.native
  
  def popToTop(): Unit = js.native
  
  def push(route: DeprecatedNavigatorRoute): Unit = js.native
  
  def replace(route: DeprecatedNavigatorRoute): Unit = js.native
  
  def replaceAtIndex(route: DeprecatedNavigatorRoute, index: Double): Unit = js.native
  
  def replacePrevious(route: DeprecatedNavigatorRoute): Unit = js.native
}
object DeprecatedNavigator {
  
  @scala.inline
  def apply(
    getCurrentRoutes: () => js.Array[DeprecatedNavigatorRoute],
    immediatelyResetRouteStack: js.Array[DeprecatedNavigatorRoute] => Unit,
    jumpBack: () => Unit,
    jumpForward: () => Unit,
    jumpTo: DeprecatedNavigatorRoute => Unit,
    pop: () => Unit,
    popN: Double => Unit,
    popToRoute: DeprecatedNavigatorRoute => Unit,
    popToTop: () => Unit,
    push: DeprecatedNavigatorRoute => Unit,
    replace: DeprecatedNavigatorRoute => Unit,
    replaceAtIndex: (DeprecatedNavigatorRoute, Double) => Unit,
    replacePrevious: DeprecatedNavigatorRoute => Unit
  ): DeprecatedNavigator = {
    val __obj = js.Dynamic.literal(getCurrentRoutes = js.Any.fromFunction0(getCurrentRoutes), immediatelyResetRouteStack = js.Any.fromFunction1(immediatelyResetRouteStack), jumpBack = js.Any.fromFunction0(jumpBack), jumpForward = js.Any.fromFunction0(jumpForward), jumpTo = js.Any.fromFunction1(jumpTo), pop = js.Any.fromFunction0(pop), popN = js.Any.fromFunction1(popN), popToRoute = js.Any.fromFunction1(popToRoute), popToTop = js.Any.fromFunction0(popToTop), push = js.Any.fromFunction1(push), replace = js.Any.fromFunction1(replace), replaceAtIndex = js.Any.fromFunction2(replaceAtIndex), replacePrevious = js.Any.fromFunction1(replacePrevious))
    __obj.asInstanceOf[DeprecatedNavigator]
  }
  
  @scala.inline
  implicit class DeprecatedNavigatorOps[Self <: DeprecatedNavigator] (val x: Self) extends AnyVal {
    
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
    def setGetCurrentRoutes(value: () => js.Array[DeprecatedNavigatorRoute]): Self = this.set("getCurrentRoutes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setImmediatelyResetRouteStack(value: js.Array[DeprecatedNavigatorRoute] => Unit): Self = this.set("immediatelyResetRouteStack", js.Any.fromFunction1(value))
    
    @scala.inline
    def setJumpBack(value: () => Unit): Self = this.set("jumpBack", js.Any.fromFunction0(value))
    
    @scala.inline
    def setJumpForward(value: () => Unit): Self = this.set("jumpForward", js.Any.fromFunction0(value))
    
    @scala.inline
    def setJumpTo(value: DeprecatedNavigatorRoute => Unit): Self = this.set("jumpTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPop(value: () => Unit): Self = this.set("pop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPopN(value: Double => Unit): Self = this.set("popN", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPopToRoute(value: DeprecatedNavigatorRoute => Unit): Self = this.set("popToRoute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPopToTop(value: () => Unit): Self = this.set("popToTop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPush(value: DeprecatedNavigatorRoute => Unit): Self = this.set("push", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReplace(value: DeprecatedNavigatorRoute => Unit): Self = this.set("replace", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReplaceAtIndex(value: (DeprecatedNavigatorRoute, Double) => Unit): Self = this.set("replaceAtIndex", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReplacePrevious(value: DeprecatedNavigatorRoute => Unit): Self = this.set("replacePrevious", js.Any.fromFunction1(value))
  }
}
