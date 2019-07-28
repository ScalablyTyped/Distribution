package typings.vsoDashNodeDashApi.interfacesProfileInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributesContainer extends js.Object {
  var attributes: StringDictionary[ProfileAttribute]
  var containerName: String
  var revision: Double
}

object AttributesContainer {
  @scala.inline
  def apply(attributes: StringDictionary[ProfileAttribute], containerName: String, revision: Double): AttributesContainer = {
    val __obj = js.Dynamic.literal(attributes = attributes, containerName = containerName, revision = revision)
  
    __obj.asInstanceOf[AttributesContainer]
  }
}

