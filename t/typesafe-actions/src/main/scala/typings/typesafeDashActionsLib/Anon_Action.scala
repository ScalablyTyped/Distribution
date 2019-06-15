package typings
package typesafeDashActionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Action[TRootAction /* <: typesafeDashActionsLib.distTypeDashHelpersMod.Action[typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant] */, TState] extends js.Object {
  var handlers: stdLib.Record[
    /* import warning: ImportType.apply Failed type conversion: TRootAction['type'] */ js.Any, 
    js.Function2[/* state */ TState, /* action */ TRootAction, TState]
  ]
}

object Anon_Action {
  @scala.inline
  def apply[TRootAction /* <: typesafeDashActionsLib.distTypeDashHelpersMod.Action[typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant] */, TState](
    handlers: stdLib.Record[
      /* import warning: ImportType.apply Failed type conversion: TRootAction['type'] */ js.Any, 
      js.Function2[/* state */ TState, /* action */ TRootAction, TState]
    ]
  ): Anon_Action[TRootAction, TState] = {
    val __obj = js.Dynamic.literal(handlers = handlers)
  
    __obj.asInstanceOf[Anon_Action[TRootAction, TState]]
  }
}

