package typings
package twilioDashSyncLib.libInterfacesServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Network extends js.Object {
  def delete(uri: java.lang.String): js.Any = js.native
  def get(uri: java.lang.String): js.Any = js.native
  def post(uri: java.lang.String, body: js.Object): js.Any = js.native
  def post(uri: java.lang.String, body: js.Object, revision: java.lang.String): js.Any = js.native
  def post(
    uri: java.lang.String,
    body: js.Object,
    revision: java.lang.String,
    retryWhenThrottled: scala.Boolean
  ): js.Any = js.native
  def put(uri: java.lang.String, body: js.Object, revision: java.lang.String): js.Any = js.native
}

