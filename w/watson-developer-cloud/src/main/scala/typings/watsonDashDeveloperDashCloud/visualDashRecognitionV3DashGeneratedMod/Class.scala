package typings.watsonDashDeveloperDashCloud.visualDashRecognitionV3DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*************************
  * model interfaces
  ************************/
/** A category within a classifier. */
trait Class extends js.Object {
  /** The name of the class. */
  var class_name: String
}

object Class {
  @scala.inline
  def apply(class_name: String): Class = {
    val __obj = js.Dynamic.literal(class_name = class_name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Class]
  }
}

