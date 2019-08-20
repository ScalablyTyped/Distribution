package typings.ts3DashNodejsDashLibrary.libTypesEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Debug extends js.Object {
  var data: String
  var `type`: String
}

object Debug {
  @scala.inline
  def apply(data: String, `type`: String): Debug = {
    val __obj = js.Dynamic.literal(data = data)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Debug]
  }
}

