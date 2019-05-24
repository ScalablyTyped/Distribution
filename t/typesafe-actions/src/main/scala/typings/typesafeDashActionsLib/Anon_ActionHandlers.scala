package typings
package typesafeDashActionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionHandlers[TRootAction /* <: typesafeDashActionsLib.distTypeDashHelpersMod.Action[typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant] */, TState] extends js.Object {
  var handlers: stdLib.Record[
    /* import warning: ImportType.apply Failed type conversion: TRootAction['type'] */ js.Any, 
    js.Function2[/* state */ TState, /* action */ TRootAction, TState]
  ]
}

object Anon_ActionHandlers {
  @scala.inline
  def apply[TRootAction /* <: typesafeDashActionsLib.distTypeDashHelpersMod.Action[typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant] */, TState](
    handlers: stdLib.Record[
      /* import warning: ImportType.apply Failed type conversion: TRootAction['type'] */ js.Any, 
      js.Function2[/* state */ TState, /* action */ TRootAction, TState]
    ]
  ): Anon_ActionHandlers[TRootAction, TState] = {
    val __obj = js.Dynamic.literal(handlers = handlers)
  
    __obj.asInstanceOf[Anon_ActionHandlers[TRootAction, TState]]
  }
}

