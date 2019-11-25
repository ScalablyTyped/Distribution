package typings.umbraco.umbraco.services

import typings.angular.angularMod.IScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Show dialog args
  */
trait IShowDialogArgs extends js.Object {
  var action: IShowDialogAction
  var scope: IScope
}

object IShowDialogArgs {
  @scala.inline
  def apply(action: IShowDialogAction, scope: IScope): IShowDialogArgs = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IShowDialogArgs]
  }
}

