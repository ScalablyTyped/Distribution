package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoardReference extends js.Object {
  /**
    * Id of the resource
    */
  var id: java.lang.String
  /**
    * Name of the resource
    */
  var name: java.lang.String
  /**
    * Full http link to the resource
    */
  var url: java.lang.String
}

object BoardReference {
  @scala.inline
  def apply(id: java.lang.String, name: java.lang.String, url: java.lang.String): BoardReference = {
    val __obj = js.Dynamic.literal(id = id, name = name, url = url)
  
    __obj.asInstanceOf[BoardReference]
  }
}

