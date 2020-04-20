package typings.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Show dialog action
  */
trait IShowDialogAction extends js.Object {
  var alias: String
  var name: String
}

object IShowDialogAction {
  @scala.inline
  def apply(alias: String, name: String): IShowDialogAction = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShowDialogAction]
  }
}

