package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShallowReference extends js.Object {
  /**
    * Id of the resource
    */
  var id: String
  /**
    * Name of the linked resource (definition name, controller name, etc.)
    */
  var name: String
  /**
    * Full http link to the resource
    */
  var url: String
}

object ShallowReference {
  @scala.inline
  def apply(id: String, name: String, url: String): ShallowReference = {
    val __obj = js.Dynamic.literal(id = id, name = name, url = url)
  
    __obj.asInstanceOf[ShallowReference]
  }
}

