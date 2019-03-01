package typings
package umbracoLib.umbracoNs.servicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Show dialog action
  */
trait IShowDialogAction extends js.Object {
  var alias: java.lang.String
  var name: java.lang.String
}

object IShowDialogAction {
  @scala.inline
  def apply(alias: java.lang.String, name: java.lang.String): IShowDialogAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alias")(alias)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[IShowDialogAction]
  }
}

