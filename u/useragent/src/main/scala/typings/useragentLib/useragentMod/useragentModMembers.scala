package typings
package useragentLib.useragentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("useragent", JSImport.Namespace)
@js.native
object useragentModMembers extends js.Object {
  val version: scala.Double = js.native
  def fromJSON(obj: java.lang.String): useragentLib.useragentMod.UseragentNs.Agent = js.native
  def fromJSON(obj: useragentLib.Anon_Os): useragentLib.useragentMod.UseragentNs.Agent = js.native
  def is(): useragentLib.useragentMod.UseragentNs.Details = js.native
  def is(useragent: java.lang.String): useragentLib.useragentMod.UseragentNs.Details = js.native
  def lookup(): useragentLib.useragentMod.UseragentNs.Agent = js.native
  def lookup(userAgent: java.lang.String): useragentLib.useragentMod.UseragentNs.Agent = js.native
  def lookup(userAgent: java.lang.String, jsAgent: java.lang.String): useragentLib.useragentMod.UseragentNs.Agent = js.native
  def parse(): useragentLib.useragentMod.UseragentNs.Agent = js.native
  def parse(userAgent: java.lang.String): useragentLib.useragentMod.UseragentNs.Agent = js.native
  def parse(userAgent: java.lang.String, jsAgent: java.lang.String): useragentLib.useragentMod.UseragentNs.Agent = js.native
}

