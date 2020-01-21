package typings.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomInfo extends js.Object {
  var cldbid: Double
  var ident: String
  var value: String
}

object CustomInfo {
  @scala.inline
  def apply(cldbid: Double, ident: String, value: String): CustomInfo = {
    val __obj = js.Dynamic.literal(cldbid = cldbid.asInstanceOf[js.Any], ident = ident.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CustomInfo]
  }
}

