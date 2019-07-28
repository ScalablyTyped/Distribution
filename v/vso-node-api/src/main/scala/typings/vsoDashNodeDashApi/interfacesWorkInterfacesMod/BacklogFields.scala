package typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BacklogFields extends js.Object {
  /**
    * Field Type (e.g. Order, Activity) to Field Reference Name map
    */
  var typeFields: StringDictionary[String]
}

object BacklogFields {
  @scala.inline
  def apply(typeFields: StringDictionary[String]): BacklogFields = {
    val __obj = js.Dynamic.literal(typeFields = typeFields)
  
    __obj.asInstanceOf[BacklogFields]
  }
}

