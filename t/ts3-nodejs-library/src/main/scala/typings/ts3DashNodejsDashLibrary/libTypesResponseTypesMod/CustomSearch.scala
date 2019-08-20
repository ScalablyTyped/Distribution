package typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomSearch extends js.Object {
  var cldbid: Double
  var ident: String
  var value: String
}

object CustomSearch {
  @scala.inline
  def apply(cldbid: Double, ident: String, value: String): CustomSearch = {
    val __obj = js.Dynamic.literal(cldbid = cldbid, ident = ident, value = value)
  
    __obj.asInstanceOf[CustomSearch]
  }
}

