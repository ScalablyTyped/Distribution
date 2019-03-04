package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobOption extends js.Object {
  var data: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  /**
    * Gets the id of the option.
    */
  var id: java.lang.String
}

object JobOption {
  @scala.inline
  def apply(data: org.scalablytyped.runtime.StringDictionary[java.lang.String], id: java.lang.String): JobOption = {
    val __obj = js.Dynamic.literal(data = data, id = id)
  
    __obj.asInstanceOf[JobOption]
  }
}

