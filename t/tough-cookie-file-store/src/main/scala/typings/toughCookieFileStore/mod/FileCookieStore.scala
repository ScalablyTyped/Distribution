package typings.toughCookieFileStore.mod

import org.scalablytyped.runtime.StringDictionary
import typings.toughCookie.mod.Cookie
import typings.toughCookie.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileCookieStore extends Store {
  var filePath: String = js.native
  var idx: StringDictionary[StringDictionary[StringDictionary[Cookie]]] = js.native
  def checkExpired(): Boolean = js.native
  def checkExpired(domain: String): Boolean = js.native
  def checkExpired(domain: String, path: String): Boolean = js.native
  def checkExpired(domain: String, path: String, key: String): Boolean = js.native
  def checkExpired(domain: String, path: Null, key: String): Boolean = js.native
  def checkExpired(domain: Null, path: String): Boolean = js.native
  def checkExpired(domain: Null, path: String, key: String): Boolean = js.native
  def checkExpired(domain: Null, path: Null, key: String): Boolean = js.native
  def findCookies(
    domain: String,
    path: String,
    cb: js.Function2[/* err */ Null, /* cookies */ js.Array[Cookie], Unit]
  ): Unit = js.native
  def inspect(): String = js.native
  def isEmpty(): Boolean = js.native
  def isExpired(): Boolean = js.native
}

