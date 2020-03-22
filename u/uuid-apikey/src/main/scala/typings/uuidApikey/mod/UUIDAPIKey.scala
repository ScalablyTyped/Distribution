package typings.uuidApikey.mod

import typings.uuidApikey.PartialUUIDOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UUIDAPIKey extends js.Object {
  def check(apiKey: String, uuid: String): Boolean = js.native
  def checkDashes(positions: js.Array[Double], str: String): Boolean = js.native
  def create(): ApiKeyInfo = js.native
  def create(options: PartialUUIDOptions): ApiKeyInfo = js.native
  def isAPIKey(apiKey: String): Boolean = js.native
  def isUUID(uuid: String): Boolean = js.native
  def toAPIKey(uuid: String): String = js.native
  def toAPIKey(uuid: String, options: PartialUUIDOptions): String = js.native
  def toUUID(apiKey: String): String = js.native
}

