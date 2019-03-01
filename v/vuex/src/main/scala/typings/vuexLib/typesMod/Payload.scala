package typings
package vuexLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Payload extends js.Object {
  var `type`: java.lang.String
}

object Payload {
  @scala.inline
  def apply(`type`: java.lang.String): Payload = {
    val __obj = js.Dynamic.literal(`type` = `type`)
  
    __obj.asInstanceOf[Payload]
  }
}

