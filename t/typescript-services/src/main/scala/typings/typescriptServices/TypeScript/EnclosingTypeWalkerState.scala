package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnclosingTypeWalkerState extends js.Object {
  var _currentSymbols: js.Array[PullSymbol]
  var _hasSetEnclosingType: Boolean
}

object EnclosingTypeWalkerState {
  @scala.inline
  def apply(_currentSymbols: js.Array[PullSymbol], _hasSetEnclosingType: Boolean): EnclosingTypeWalkerState = {
    val __obj = js.Dynamic.literal(_currentSymbols = _currentSymbols.asInstanceOf[js.Any], _hasSetEnclosingType = _hasSetEnclosingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnclosingTypeWalkerState]
  }
}

