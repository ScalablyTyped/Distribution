package typings.toughDashCookieDashFilestore.toughDashCookieDashFilestoreMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tough-cookie-filestore", JSImport.Namespace)
@js.native
class ^ protected () extends FileCookieStore {
  def this(filePath: String) = this()
  /* CompleteClass */
  override var filePath: String = js.native
  /* CompleteClass */
  override var idx: StringDictionary[StringDictionary[StringDictionary[Cookie]]] = js.native
  /* CompleteClass */
  override var synchronous: Boolean = js.native
  /* CompleteClass */
  override def findCookie(
    domain: String,
    path: String,
    key: String,
    cb: js.Function2[/* whatever */ Null, /* cookie */ js.UndefOr[Cookie | Null], Unit]
  ): Unit = js.native
  /* CompleteClass */
  override def findCookies(
    domain: String,
    path: String,
    cb: js.Function2[/* whatever */ Null, /* cookies */ js.Array[Cookie], Unit]
  ): Unit = js.native
  /* CompleteClass */
  override def inspect(): String = js.native
  /* CompleteClass */
  override def loadFromFile(filePath: String, cb: js.Function1[/* data */ js.Any, Unit]): Unit = js.native
  /* CompleteClass */
  override def putCookie(cookie: Cookie, path: String, key: String, cb: js.Function1[/* whatever */ Null, Unit]): Unit = js.native
  /* CompleteClass */
  override def removeCookie(domain: String, path: String, key: String, cb: js.Function1[/* whatever */ Null, Unit]): Unit = js.native
  /* CompleteClass */
  override def removeCookies(domain: String, path: String, cb: js.Function1[/* whatever */ Null, Unit]): Unit = js.native
  /* CompleteClass */
  override def saveToFile(filePath: String, data: js.Any, cb: js.Function0[Unit]): Unit = js.native
  /* CompleteClass */
  override def updateCookie(oldCookie: Cookie, newCookie: Cookie, cb: js.Function1[/* whatever */ Null, Unit]): Unit = js.native
}

