package typings
package toughDashCookieLib.toughDashCookieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tough-cookie", "Store")
@js.native
abstract class Store () extends js.Object {
  def findCookie(
    domain: java.lang.String,
    path: java.lang.String,
    key: java.lang.String,
    cb: js.Function2[/* err */ stdLib.Error | scala.Null, /* cookie */ Cookie | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  def findCookies(
    domain: java.lang.String,
    path: java.lang.String,
    cb: js.Function2[/* err */ stdLib.Error | scala.Null, /* cookie */ js.Array[Cookie], scala.Unit]
  ): scala.Unit = js.native
  def getAllCookies(cb: js.Function2[/* err */ stdLib.Error | scala.Null, /* cookie */ js.Array[Cookie], scala.Unit]): scala.Unit = js.native
  def putCookie(cookie: Cookie, cb: js.Function1[/* err */ stdLib.Error | scala.Null, scala.Unit]): scala.Unit = js.native
  def removeCookie(
    domain: java.lang.String,
    path: java.lang.String,
    key: java.lang.String,
    cb: js.Function1[/* err */ stdLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  def removeCookies(
    domain: java.lang.String,
    path: java.lang.String,
    cb: js.Function1[/* err */ stdLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  def updateCookie(
    oldCookie: Cookie,
    newCookie: Cookie,
    cb: js.Function1[/* err */ stdLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
}

