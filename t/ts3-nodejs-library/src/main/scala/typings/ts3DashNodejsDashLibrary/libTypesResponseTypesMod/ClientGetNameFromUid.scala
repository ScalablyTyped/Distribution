package typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod

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
    val __obj = js.Dynamic.literal(cldbid = cldbid, cluid = cluid, name = name)
  
    __obj.asInstanceOf[ClientGetNameFromUid]
  }
}

