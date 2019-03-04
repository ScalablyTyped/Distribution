package typings
package vsoDashNodeDashApiLib.interfacesProfileInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributesContainer extends js.Object {
  var attributes: org.scalablytyped.runtime.StringDictionary[ProfileAttribute]
  var containerName: java.lang.String
  var revision: scala.Double
}

object AttributesContainer {
  @scala.inline
  def apply(
    attributes: org.scalablytyped.runtime.StringDictionary[ProfileAttribute],
    containerName: java.lang.String,
    revision: scala.Double
  ): AttributesContainer = {
    val __obj = js.Dynamic.literal(attributes = attributes, containerName = containerName, revision = revision)
  
    __obj.asInstanceOf[AttributesContainer]
  }
}

