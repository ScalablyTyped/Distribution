package typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod

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
    val __obj = js.Dynamic.literal(id = id, name = name, url = url)
  
    __obj.asInstanceOf[BoardReference]
  }
}

