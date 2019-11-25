package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.vsoDashNodeDashApi.interfacesCommonFormInputInterfacesMod.InputValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MappingDetails extends js.Object {
  var mappings: StringDictionary[InputValue]
}

object MappingDetails {
  @scala.inline
  def apply(mappings: StringDictionary[InputValue]): MappingDetails = {
    val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MappingDetails]
  }
}

