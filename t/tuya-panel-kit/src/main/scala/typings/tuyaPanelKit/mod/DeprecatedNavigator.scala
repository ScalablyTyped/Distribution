package typings.tuyaPanelKit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeprecatedNavigator extends StObject {
  
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
  implicit class DeprecatedNavigatorMutableBuilder[Self <: DeprecatedNavigator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetCurrentRoutes(value: () => js.Array[DeprecatedNavigatorRoute]): Self = StObject.set(x, "getCurrentRoutes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setImmediatelyResetRouteStack(value: js.Array[DeprecatedNavigatorRoute] => Unit): Self = StObject.set(x, "immediatelyResetRouteStack", js.Any.fromFunction1(value))
    
    @scala.inline
    def setJumpBack(value: () => Unit): Self = StObject.set(x, "jumpBack", js.Any.fromFunction0(value))
    
    @scala.inline
    def setJumpForward(value: () => Unit): Self = StObject.set(x, "jumpForward", js.Any.fromFunction0(value))
    
    @scala.inline
    def setJumpTo(value: DeprecatedNavigatorRoute => Unit): Self = StObject.set(x, "jumpTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPop(value: () => Unit): Self = StObject.set(x, "pop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPopN(value: Double => Unit): Self = StObject.set(x, "popN", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPopToRoute(value: DeprecatedNavigatorRoute => Unit): Self = StObject.set(x, "popToRoute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPopToTop(value: () => Unit): Self = StObject.set(x, "popToTop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPush(value: DeprecatedNavigatorRoute => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReplace(value: DeprecatedNavigatorRoute => Unit): Self = StObject.set(x, "replace", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReplaceAtIndex(value: (DeprecatedNavigatorRoute, Double) => Unit): Self = StObject.set(x, "replaceAtIndex", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReplacePrevious(value: DeprecatedNavigatorRoute => Unit): Self = StObject.set(x, "replacePrevious", js.Any.fromFunction1(value))
  }
}
