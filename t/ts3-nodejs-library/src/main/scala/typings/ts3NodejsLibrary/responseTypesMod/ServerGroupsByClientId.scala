package typings.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerGroupsByClientId extends js.Object {
  var cldbid: Double
  var name: String
  var sgid: Double
}

object ServerGroupsByClientId {
  @scala.inline
  def apply(cldbid: Double, name: String, sgid: Double): ServerGroupsByClientId = {
    val __obj = js.Dynamic.literal(cldbid = cldbid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sgid = sgid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerGroupsByClientId]
  }
}

