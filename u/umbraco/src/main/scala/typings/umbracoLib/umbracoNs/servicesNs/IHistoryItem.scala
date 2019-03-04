package typings
package umbracoLib.umbracoNs.servicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * History item
  */
trait IHistoryItem extends js.Object {
  //css class for the list, ex: "icon-image", "icon-doc"
  var icon: java.lang.String
  //route to the editor, ex: "/content/edit/1234"
  var link: java.lang.String
  //friendly name for the history listing
  var name: java.lang.String
}

object IHistoryItem {
  @scala.inline
  def apply(icon: java.lang.String, link: java.lang.String, name: java.lang.String): IHistoryItem = {
    val __obj = js.Dynamic.literal(icon = icon, link = link, name = name)
  
    __obj.asInstanceOf[IHistoryItem]
  }
}

