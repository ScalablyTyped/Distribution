package typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod

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
    val __obj = js.Dynamic.literal(cldbid = cldbid, cluid = cluid)
  
    __obj.asInstanceOf[ClientGetDbidFromUid]
  }
}

