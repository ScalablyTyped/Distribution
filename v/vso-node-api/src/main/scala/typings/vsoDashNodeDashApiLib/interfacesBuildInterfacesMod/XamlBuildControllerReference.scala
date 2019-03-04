package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XamlBuildControllerReference extends js.Object {
  /**
    * Id of the resource
    */
  var id: scala.Double
  /**
    * Name of the linked resource (definition name, controller name, etc.)
    */
  var name: java.lang.String
  /**
    * Full http link to the resource
    */
  var url: java.lang.String
}

object XamlBuildControllerReference {
  @scala.inline
  def apply(id: scala.Double, name: java.lang.String, url: java.lang.String): XamlBuildControllerReference = {
    val __obj = js.Dynamic.literal(id = id, name = name, url = url)
  
    __obj.asInstanceOf[XamlBuildControllerReference]
  }
}

