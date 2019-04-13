package typings
package urlDashParseLib.urlDashParseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait URLParse extends js.Object {
  val auth: java.lang.String = js.native
  val hash: java.lang.String = js.native
  val host: java.lang.String = js.native
  val hostname: java.lang.String = js.native
  val href: java.lang.String = js.native
  val origin: java.lang.String = js.native
  val password: java.lang.String = js.native
  val pathname: java.lang.String = js.native
  val port: java.lang.String = js.native
  val protocol: java.lang.String = js.native
  val query: org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]] = js.native
  val slashes: scala.Boolean = js.native
  val username: java.lang.String = js.native
  def set(part: URLPart): URLParse = js.native
  def set(part: URLPart, value: java.lang.String): URLParse = js.native
  def set(part: URLPart, value: java.lang.String, fn: scala.Boolean): URLParse = js.native
  def set(part: URLPart, value: java.lang.String, fn: QueryParser): URLParse = js.native
  def set(part: URLPart, value: js.Object): URLParse = js.native
  def set(part: URLPart, value: js.Object, fn: scala.Boolean): URLParse = js.native
  def set(part: URLPart, value: js.Object, fn: QueryParser): URLParse = js.native
  def set(part: URLPart, value: js.UndefOr[scala.Nothing], fn: scala.Boolean): URLParse = js.native
  def set(part: URLPart, value: js.UndefOr[scala.Nothing], fn: QueryParser): URLParse = js.native
  def set(part: URLPart, value: scala.Double): URLParse = js.native
  def set(part: URLPart, value: scala.Double, fn: scala.Boolean): URLParse = js.native
  def set(part: URLPart, value: scala.Double, fn: QueryParser): URLParse = js.native
  def toString(stringify: StringifyQuery): java.lang.String = js.native
}

