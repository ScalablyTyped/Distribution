package typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientGetNameFromDbid extends js.Object {
  var cldbid: Double
  var cluid: String
  var name: String
}

object ClientGetNameFromDbid {
  @scala.inline
  def apply(cldbid: Double, cluid: String, name: String): ClientGetNameFromDbid = {
    val __obj = js.Dynamic.literal(cldbid = cldbid, cluid = cluid, name = name)
  
    __obj.asInstanceOf[ClientGetNameFromDbid]
  }
}

