package typings
package umbracoLib.umbracoNs.servicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Show dialog args
  */
trait IShowDialogArgs extends js.Object {
  var action: IShowDialogAction
  var scope: angularLib.angularMod.IScope
}

object IShowDialogArgs {
  @scala.inline
  def apply(action: IShowDialogAction, scope: angularLib.angularMod.IScope): IShowDialogArgs = {
    val __obj = js.Dynamic.literal(action = action, scope = scope)
  
    __obj.asInstanceOf[IShowDialogArgs]
  }
}

