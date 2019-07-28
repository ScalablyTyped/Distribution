package typings.typesafeDashActions

import typings.std.Record
import typings.typesafeDashActions.distTypeDashHelpersMod.Action
import typings.typesafeDashActions.distTypeDashHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Action[TRootAction /* <: Action[TypeConstant] */, TState] extends js.Object {
  var handlers: Record[
    /* import warning: ImportType.apply Failed type conversion: TRootAction['type'] */ js.Any, 
    js.Function2[/* state */ TState, /* action */ TRootAction, TState]
  ]
}

object Anon_Action {
  @scala.inline
  def apply[TRootAction /* <: Action[TypeConstant] */, TState](
    handlers: Record[
      /* import warning: ImportType.apply Failed type conversion: TRootAction['type'] */ js.Any, 
      js.Function2[/* state */ TState, /* action */ TRootAction, TState]
    ]
  ): Anon_Action[TRootAction, TState] = {
    val __obj = js.Dynamic.literal(handlers = handlers)
  
    __obj.asInstanceOf[Anon_Action[TRootAction, TState]]
  }
}

