package typings.useragent.useragentMod

import typings.useragent.Anon_DeviceFamily
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("useragent", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val version: Double = js.native
  def fromJSON(obj: String): Agent = js.native
  def fromJSON(obj: Anon_DeviceFamily): Agent = js.native
  def is(): Details = js.native
  def is(useragent: String): Details = js.native
  def lookup(): Agent = js.native
  def lookup(userAgent: String): Agent = js.native
  def lookup(userAgent: String, jsAgent: String): Agent = js.native
  def parse(): Agent = js.native
  def parse(userAgent: String): Agent = js.native
  def parse(userAgent: String, jsAgent: String): Agent = js.native
}

