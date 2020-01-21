package typings.typestubIpfs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WantList extends js.Object {
  var Keys: js.Array[WantListItem]
}

object WantList {
  @scala.inline
  def apply(Keys: js.Array[WantListItem]): WantList = {
    val __obj = js.Dynamic.literal(Keys = Keys.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WantList]
  }
}

