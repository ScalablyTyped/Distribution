package typings.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientGetNameFromUid extends js.Object {
  var cldbid: Double
  var cluid: String
  var name: String
}

object ClientGetNameFromUid {
  @scala.inline
  def apply(cldbid: Double, cluid: String, name: String): ClientGetNameFromUid = {
    val __obj = js.Dynamic.literal(cldbid = cldbid.asInstanceOf[js.Any], cluid = cluid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClientGetNameFromUid]
  }
}

