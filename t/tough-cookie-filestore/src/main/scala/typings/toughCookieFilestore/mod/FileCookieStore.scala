package typings.toughCookieFilestore.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileCookieStore extends js.Object {
  var filePath: String
  var idx: StringDictionary[StringDictionary[StringDictionary[Cookie]]]
  var synchronous: Boolean
  def findCookie(
    domain: String,
    path: String,
    key: String,
    cb: js.Function2[/* whatever */ Null, /* cookie */ js.UndefOr[Cookie | Null], Unit]
  ): Unit
  def findCookies(
    domain: String,
    path: String,
    cb: js.Function2[/* whatever */ Null, /* cookies */ js.Array[Cookie], Unit]
  ): Unit
  def inspect(): String
  def loadFromFile(filePath: String, cb: js.Function1[/* data */ js.Any, Unit]): Unit
  def putCookie(cookie: Cookie, path: String, key: String, cb: js.Function1[/* whatever */ Null, Unit]): Unit
  def removeCookie(domain: String, path: String, key: String, cb: js.Function1[/* whatever */ Null, Unit]): Unit
  def removeCookies(domain: String, path: String, cb: js.Function1[/* whatever */ Null, Unit]): Unit
  def saveToFile(filePath: String, data: js.Any, cb: js.Function0[Unit]): Unit
  def updateCookie(oldCookie: Cookie, newCookie: Cookie, cb: js.Function1[/* whatever */ Null, Unit]): Unit
}

object FileCookieStore {
  @scala.inline
  def apply(
    filePath: String,
    findCookie: (String, String, String, js.Function2[/* whatever */ Null, /* cookie */ js.UndefOr[Cookie | Null], Unit]) => Unit,
    findCookies: (String, String, js.Function2[/* whatever */ Null, /* cookies */ js.Array[Cookie], Unit]) => Unit,
    idx: StringDictionary[StringDictionary[StringDictionary[Cookie]]],
    inspect: () => String,
    loadFromFile: (String, js.Function1[/* data */ js.Any, Unit]) => Unit,
    putCookie: (Cookie, String, String, js.Function1[/* whatever */ Null, Unit]) => Unit,
    removeCookie: (String, String, String, js.Function1[/* whatever */ Null, Unit]) => Unit,
    removeCookies: (String, String, js.Function1[/* whatever */ Null, Unit]) => Unit,
    saveToFile: (String, js.Any, js.Function0[Unit]) => Unit,
    synchronous: Boolean,
    updateCookie: (Cookie, Cookie, js.Function1[/* whatever */ Null, Unit]) => Unit
  ): FileCookieStore = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], findCookie = js.Any.fromFunction4(findCookie), findCookies = js.Any.fromFunction3(findCookies), idx = idx.asInstanceOf[js.Any], inspect = js.Any.fromFunction0(inspect), loadFromFile = js.Any.fromFunction2(loadFromFile), putCookie = js.Any.fromFunction4(putCookie), removeCookie = js.Any.fromFunction4(removeCookie), removeCookies = js.Any.fromFunction3(removeCookies), saveToFile = js.Any.fromFunction3(saveToFile), synchronous = synchronous.asInstanceOf[js.Any], updateCookie = js.Any.fromFunction3(updateCookie))
  
    __obj.asInstanceOf[FileCookieStore]
  }
}

