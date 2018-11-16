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

