package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BacklogFields extends js.Object {
  /**
    * Field Type (e.g. Order, Activity) to Field Reference Name map
    */
  var typeFields: org.scalablytyped.runtime.StringDictionary[java.lang.String]
}

object BacklogFields {
  @scala.inline
  def apply(typeFields: org.scalablytyped.runtime.StringDictionary[java.lang.String]): BacklogFields = {
    val __obj = js.Dynamic.literal(typeFields = typeFields)
  
    __obj.asInstanceOf[BacklogFields]
  }
}

