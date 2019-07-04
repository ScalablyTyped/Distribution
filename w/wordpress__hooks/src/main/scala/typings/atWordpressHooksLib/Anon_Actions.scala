package typings
package atWordpressHooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Actions extends js.Object {
  var actions: atWordpressHooksLib.atWordpressHooksMod.HookMap[atWordpressHooksLib.atWordpressHooksMod.ActionCallback] = js.native
  @JSName("addAction")
  var addAction_Original: js.Function4[
    /* hookName */ java.lang.String, 
    /* namespace */ java.lang.String, 
    /* callback */ js.Function1[/* repeated */ js.Any, scala.Unit], 
    /* priority */ js.UndefOr[scala.Double], 
    scala.Unit
  ] = js.native
  @JSName("addFilter")
  var addFilter_Original: Fn_Callback = js.native
  @JSName("applyFilters")
  var applyFilters_Original: atWordpressHooksLib.atWordpressHooksMod.RunHook = js.native
  @JSName("currentAction")
  var currentAction_Original: atWordpressHooksLib.atWordpressHooksMod.CurrentHook = js.native
  @JSName("currentFilter")
  var currentFilter_Original: atWordpressHooksLib.atWordpressHooksMod.CurrentHook = js.native
  @JSName("didAction")
  var didAction_Original: atWordpressHooksLib.atWordpressHooksMod.DidHook = js.native
  @JSName("didFilter")
  var didFilter_Original: atWordpressHooksLib.atWordpressHooksMod.DidHook = js.native
  @JSName("doAction")
  var doAction_Original: atWordpressHooksLib.atWordpressHooksMod.RunHook = js.native
  @JSName("doingAction")
  var doingAction_Original: atWordpressHooksLib.atWordpressHooksMod.DoingHook = js.native
  @JSName("doingFilter")
  var doingFilter_Original: atWordpressHooksLib.atWordpressHooksMod.DoingHook = js.native
  var filters: atWordpressHooksLib.atWordpressHooksMod.HookMap[atWordpressHooksLib.atWordpressHooksMod.FilterCallback] = js.native
  @JSName("hasAction")
  var hasAction_Original: atWordpressHooksLib.atWordpressHooksMod.HasHook = js.native
  @JSName("hasFilter")
  var hasFilter_Original: atWordpressHooksLib.atWordpressHooksMod.HasHook = js.native
  @JSName("removeAction")
  var removeAction_Original: atWordpressHooksLib.atWordpressHooksMod.RemoveHook = js.native
  @JSName("removeAllActions")
  var removeAllActions_Original: atWordpressHooksLib.atWordpressHooksMod.RemoveHook = js.native
  @JSName("removeAllFilters")
  var removeAllFilters_Original: atWordpressHooksLib.atWordpressHooksMod.RemoveHook = js.native
  @JSName("removeFilter")
  var removeFilter_Original: atWordpressHooksLib.atWordpressHooksMod.RemoveHook = js.native
  def addAction(
    hookName: java.lang.String,
    namespace: java.lang.String,
    callback: js.Function1[/* repeated */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def addAction(
    hookName: java.lang.String,
    namespace: java.lang.String,
    callback: js.Function1[/* repeated */ js.Any, scala.Unit],
    priority: scala.Double
  ): scala.Unit = js.native
  def addFilter[T](
    hookName: java.lang.String,
    namespace: java.lang.String,
    callback: js.Function2[/* firstArg */ T, /* repeated */ js.Any, T]
  ): scala.Unit = js.native
  def addFilter[T](
    hookName: java.lang.String,
    namespace: java.lang.String,
    callback: js.Function2[/* firstArg */ T, /* repeated */ js.Any, T],
    priority: scala.Double
  ): scala.Unit = js.native
  def applyFilters[T](hookName: java.lang.String): T | scala.Double | java.lang.String = js.native
  def applyFilters[T](hookName: java.lang.String, firstArg: T, rest: js.Any*): T | scala.Double | java.lang.String = js.native
  def currentAction(): java.lang.String | scala.Null = js.native
  def currentFilter(): java.lang.String | scala.Null = js.native
  def didAction(hookName: java.lang.String): scala.Double = js.native
  def didFilter(hookName: java.lang.String): scala.Double = js.native
  def doAction[T](hookName: java.lang.String): T | scala.Double | java.lang.String = js.native
  def doAction[T](hookName: java.lang.String, firstArg: T, rest: js.Any*): T | scala.Double | java.lang.String = js.native
  def doingAction(): scala.Boolean = js.native
  def doingAction(hookName: java.lang.String): scala.Boolean = js.native
  def doingFilter(): scala.Boolean = js.native
  def doingFilter(hookName: java.lang.String): scala.Boolean = js.native
  def hasAction(hookName: java.lang.String): scala.Boolean = js.native
  def hasFilter(hookName: java.lang.String): scala.Boolean = js.native
  def removeAction(hookName: java.lang.String, namespace: java.lang.String): scala.Double = js.native
  def removeAllActions(hookName: java.lang.String, namespace: java.lang.String): scala.Double = js.native
  def removeAllFilters(hookName: java.lang.String, namespace: java.lang.String): scala.Double = js.native
  def removeFilter(hookName: java.lang.String, namespace: java.lang.String): scala.Double = js.native
}

