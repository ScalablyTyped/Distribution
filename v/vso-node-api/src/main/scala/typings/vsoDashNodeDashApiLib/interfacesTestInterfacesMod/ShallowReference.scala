package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShallowReference extends js.Object {
  /**
    * Id of the resource
    */
  var id: java.lang.String
  /**
    * Name of the linked resource (definition name, controller name, etc.)
    */
  var name: java.lang.String
  /**
    * Full http link to the resource
    */
  var url: java.lang.String
}

object ShallowReference {
  @scala.inline
  def apply(id: java.lang.String, name: java.lang.String, url: java.lang.String): ShallowReference = {
    val __obj = js.Dynamic.literal(id = id, name = name, url = url)
  
    __obj.asInstanceOf[ShallowReference]
  }
}

