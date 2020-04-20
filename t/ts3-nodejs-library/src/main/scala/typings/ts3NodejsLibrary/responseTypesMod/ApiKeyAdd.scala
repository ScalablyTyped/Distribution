package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.enumMod.ApiKeyScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiKeyAdd extends js.Object {
  var apikey: String
  var cldbid: Double
  var id: Double
  var scope: ApiKeyScope
  var sid: Double
  var time_left: Double
}

object ApiKeyAdd {
  @scala.inline
  def apply(apikey: String, cldbid: Double, id: Double, scope: ApiKeyScope, sid: Double, time_left: Double): ApiKeyAdd = {
    val __obj = js.Dynamic.literal(apikey = apikey.asInstanceOf[js.Any], cldbid = cldbid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], time_left = time_left.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiKeyAdd]
  }
}

