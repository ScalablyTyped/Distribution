package typings.ts3NodejsLibrary.eventsMod

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
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Debug]
  }
}

