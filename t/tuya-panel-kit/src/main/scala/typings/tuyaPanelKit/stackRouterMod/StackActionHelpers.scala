package typings.tuyaPanelKit.stackRouterMod

import typings.tuyaPanelKit.routersTypesMod.ParamListBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackActionHelpers[ParamList /* <: ParamListBase */] extends js.Object {
  
  /**
    * Pop a screen from the stack.
    */
  def pop(): Unit = js.native
  def pop(count: Double): Unit = js.native
  
  /**
    * Pop to the first route in the stack, dismissing all other screens.
    */
  def popToTop(): Unit = js.native
  
  /**
    * Push a new screen onto the stack.
    *
    * @param name Name of the route for the tab.
    * @param [params] Params object for the route.
    */
  def push[RouteName /* <: /* keyof ParamList */ String */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type undefined extends ParamList[RouteName] ? [RouteName] | [RouteName, ParamList[RouteName]] : [RouteName, ParamList[RouteName]] is not an array type */ args: (js.Tuple2[
      RouteName, 
      /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
    ]) | js.Array[RouteName]
  ): Unit = js.native
  
  /**
    * Replace the current route with a new one.
    *
    * @param name Route name of the new route.
    * @param [params] Params object for the new route.
    */
  def replace[RouteName /* <: /* keyof ParamList */ String */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type undefined extends ParamList[RouteName] ? [RouteName] | [RouteName, ParamList[RouteName]] : [RouteName, ParamList[RouteName]] is not an array type */ args: (js.Tuple2[
      RouteName, 
      /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
    ]) | js.Array[RouteName]
  ): Unit = js.native
}
