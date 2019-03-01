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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attributes")(attributes)
    __obj.updateDynamic("containerName")(containerName)
    __obj.updateDynamic("revision")(revision)
    __obj.asInstanceOf[AttributesContainer]
  }
}

