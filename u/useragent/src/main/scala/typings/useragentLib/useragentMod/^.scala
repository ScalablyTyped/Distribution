package typings
package useragentLib.useragentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("useragent", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val version: scala.Double = js.native
  def fromJSON(obj: java.lang.String): Agent = js.native
  def fromJSON(obj: useragentLib.Anon_DeviceFamily): Agent = js.native
  def is(): Details = js.native
  def is(useragent: java.lang.String): Details = js.native
  def lookup(): Agent = js.native
  def lookup(userAgent: java.lang.String): Agent = js.native
  def lookup(userAgent: java.lang.String, jsAgent: java.lang.String): Agent = js.native
  def parse(): Agent = js.native
  def parse(userAgent: java.lang.String): Agent = js.native
  def parse(userAgent: java.lang.String, jsAgent: java.lang.String): Agent = js.native
}

