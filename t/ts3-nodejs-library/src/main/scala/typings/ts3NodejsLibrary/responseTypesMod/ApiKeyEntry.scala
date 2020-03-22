package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.enumMod.ApiKeyScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiKeyEntry extends js.Object {
  var cldbid: Double
  var count: Double
  var created_at: Double
  var expires_at: Double
  var id: Double
  var scope: ApiKeyScope
  var sid: Double
  var time_left: Double
}

object ApiKeyEntry {
  @scala.inline
  def apply(
    cldbid: Double,
    count: Double,
    created_at: Double,
    expires_at: Double,
    id: Double,
    scope: ApiKeyScope,
    sid: Double,
    time_left: Double
  ): ApiKeyEntry = {
    val __obj = js.Dynamic.literal(cldbid = cldbid.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], expires_at = expires_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], time_left = time_left.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ApiKeyEntry]
  }
}

