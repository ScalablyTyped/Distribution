package typings.typesafeActions

import typings.std.Record
import typings.typesafeActions.typeHelpersMod.Action
import typings.typesafeActions.typeHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAction[TRootAction /* <: Action[TypeConstant] */, TState] extends js.Object {
  var handlers: Record[
    /* import warning: importer.ImportType#apply Failed type conversion: TRootAction['type'] */ js.Any, 
    js.Function2[/* state */ TState, /* action */ TRootAction, TState]
  ]
}

object AnonAction {
  @scala.inline
  def apply[TRootAction /* <: Action[TypeConstant] */, TState](
    handlers: Record[
      /* import warning: importer.ImportType#apply Failed type conversion: TRootAction['type'] */ js.Any, 
      js.Function2[/* state */ TState, /* action */ TRootAction, TState]
    ]
  ): AnonAction[TRootAction, TState] = {
    val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAction[TRootAction, TState]]
  }
}

