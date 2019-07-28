package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobOption extends js.Object {
  var data: StringDictionary[String]
  /**
    * Gets the id of the option.
    */
  var id: String
}

object JobOption {
  @scala.inline
  def apply(data: StringDictionary[String], id: String): JobOption = {
    val __obj = js.Dynamic.literal(data = data, id = id)
  
    __obj.asInstanceOf[JobOption]
  }
}

