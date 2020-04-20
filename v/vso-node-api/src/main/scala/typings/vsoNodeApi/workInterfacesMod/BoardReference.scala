package typings.vsoNodeApi.workInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoardReference extends js.Object {
  /**
    * Id of the resource
    */
  var id: String
  /**
    * Name of the resource
    */
  var name: String
  /**
    * Full http link to the resource
    */
  var url: String
}

object BoardReference {
  @scala.inline
  def apply(id: String, name: String, url: String): BoardReference = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoardReference]
  }
}

