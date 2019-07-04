package typings
package atWordpressHooksLib.atWordpressHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/hooks", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val actions: HookMap[ActionCallback] = js.native
  val applyFilters: RunHook = js.native
  val currentAction: CurrentHook = js.native
  val currentFilter: CurrentHook = js.native
  val didAction: DidHook = js.native
  val didFilter: DidHook = js.native
  val doAction: RunHook = js.native
  val doingAction: DoingHook = js.native
  val doingFilter: DoingHook = js.native
  val filters: HookMap[FilterCallback] = js.native
  val hasAction: HasHook = js.native
  val hasFilter: HasHook = js.native
  val removeAction: RemoveHook = js.native
  val removeAllActions: RemoveHook = js.native
  val removeAllFilters: RemoveHook = js.native
  val removeFilter: RemoveHook = js.native
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
  def createHooks(): atWordpressHooksLib.Anon_Actions = js.native
}

