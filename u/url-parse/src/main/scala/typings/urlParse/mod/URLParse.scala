package typings.urlParse.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait URLParse extends js.Object {
  val auth: String = js.native
  val hash: String = js.native
  val host: String = js.native
  val hostname: String = js.native
  val href: String = js.native
  val origin: String = js.native
  val password: String = js.native
  val pathname: String = js.native
  val port: String = js.native
  val protocol: String = js.native
  val query: StringDictionary[js.UndefOr[String]] = js.native
  val slashes: Boolean = js.native
  val username: String = js.native
  def set(part: URLPart): URLParse = js.native
  def set(part: URLPart, value: String): URLParse = js.native
  def set(part: URLPart, value: String, fn: Boolean): URLParse = js.native
  def set(part: URLPart, value: String, fn: QueryParser): URLParse = js.native
  def set(part: URLPart, value: js.Object): URLParse = js.native
  def set(part: URLPart, value: js.Object, fn: Boolean): URLParse = js.native
  def set(part: URLPart, value: js.Object, fn: QueryParser): URLParse = js.native
  def set(part: URLPart, value: Double): URLParse = js.native
  def set(part: URLPart, value: Double, fn: Boolean): URLParse = js.native
  def set(part: URLPart, value: Double, fn: QueryParser): URLParse = js.native
  def toString(stringify: StringifyQuery): String = js.native
}

