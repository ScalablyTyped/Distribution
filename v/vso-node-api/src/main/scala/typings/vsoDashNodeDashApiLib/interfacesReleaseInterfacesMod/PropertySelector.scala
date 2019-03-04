package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertySelector extends js.Object {
  var properties: js.Array[java.lang.String]
  var selectorType: PropertySelectorType
}

object PropertySelector {
  @scala.inline
  def apply(properties: js.Array[java.lang.String], selectorType: PropertySelectorType): PropertySelector = {
    val __obj = js.Dynamic.literal(properties = properties, selectorType = selectorType)
  
    __obj.asInstanceOf[PropertySelector]
  }
}

