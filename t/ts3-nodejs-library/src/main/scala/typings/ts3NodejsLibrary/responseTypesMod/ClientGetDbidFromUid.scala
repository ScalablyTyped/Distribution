package typings.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientGetDbidFromUid extends js.Object {
  var cldbid: Double
  var cluid: String
}

object ClientGetDbidFromUid {
  @scala.inline
  def apply(cldbid: Double, cluid: String): ClientGetDbidFromUid = {
    val __obj = js.Dynamic.literal(cldbid = cldbid.asInstanceOf[js.Any], cluid = cluid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientGetDbidFromUid]
  }
}

