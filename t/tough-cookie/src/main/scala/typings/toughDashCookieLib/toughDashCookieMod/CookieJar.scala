package typings
package toughDashCookieLib.toughDashCookieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tough-cookie", "CookieJar")
@js.native
class CookieJar () extends js.Object {
  def this(store: Store) = this()
  def this(store: Store, options: toughDashCookieLib.toughDashCookieMod.CookieJarNs.Options) = this()
  def clone(cb: js.Function2[/* err */ stdLib.Error | scala.Null, /* newJar */ this.type, scala.Unit]): scala.Unit = js.native
  def clone(
    store: Store,
    cb: js.Function2[/* err */ stdLib.Error | scala.Null, /* newJar */ this.type, scala.Unit]
  ): scala.Unit = js.native
  def cloneSync(store: Store): CookieJar = js.native
  def getCookieString(
    currentUrl: java.lang.String,
    cb: js.Function2[/* err */ stdLib.Error | scala.Null, /* cookies */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def getCookieString(
    currentUrl: java.lang.String,
    options: toughDashCookieLib.toughDashCookieMod.CookieJarNs.GetCookiesOptions,
    cb: js.Function2[/* err */ stdLib.Error | scala.Null, /* cookies */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def getCookieStringSync(currentUrl: java.lang.String): java.lang.String = js.native
  def getCookieStringSync(
    currentUrl: java.lang.String,
    options: toughDashCookieLib.toughDashCookieMod.CookieJarNs.GetCookiesOptions
  ): java.lang.String = js.native
  def getCookies(
    currentUrl: java.lang.String,
    cb: js.Function2[/* err */ stdLib.Error | scala.Null, /* cookies */ js.Array[Cookie], scala.Unit]
  ): scala.Unit = js.native
  def getCookies(
    currentUrl: java.lang.String,
    options: toughDashCookieLib.toughDashCookieMod.CookieJarNs.GetCookiesOptions,
    cb: js.Function2[/* err */ stdLib.Error | scala.Null, /* cookies */ js.Array[Cookie], scala.Unit]
  ): scala.Unit = js.native
  def getCookiesSync(currentUrl: java.lang.String): js.Array[Cookie] = js.native
  def getCookiesSync(
    currentUrl: java.lang.String,
    options: toughDashCookieLib.toughDashCookieMod.CookieJarNs.GetCookiesOptions
  ): js.Array[Cookie] = js.native
  def getSetCookieStrings(
    currentUrl: java.lang.String,
    cb: js.Function2[/* err */ stdLib.Error | scala.Null, /* cookies */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def getSetCookieStrings(
    currentUrl: java.lang.String,
    options: toughDashCookieLib.toughDashCookieMod.CookieJarNs.GetCookiesOptions,
    cb: js.Function2[/* err */ stdLib.Error | scala.Null, /* cookies */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def getSetCookieStringsSync(currentUrl: java.lang.String): java.lang.String = js.native
  def getSetCookieStringsSync(
    currentUrl: java.lang.String,
    options: toughDashCookieLib.toughDashCookieMod.CookieJarNs.GetCookiesOptions
  ): java.lang.String = js.native
  def serialize(
    cb: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* serializedObject */ toughDashCookieLib.toughDashCookieMod.CookieJarNs.Serialized, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def serializeSync(): toughDashCookieLib.toughDashCookieMod.CookieJarNs.Serialized = js.native
  def setCookie(
    cookieOrString: java.lang.String,
    currentUrl: java.lang.String,
    cb: js.Function2[/* err */ stdLib.Error, /* cookie */ Cookie, scala.Unit]
  ): scala.Unit = js.native
  def setCookie(
    cookieOrString: java.lang.String,
    currentUrl: java.lang.String,
    options: toughDashCookieLib.toughDashCookieMod.CookieJarNs.SetCookieOptions,
    cb: js.Function2[/* err */ stdLib.Error | scala.Null, /* cookie */ Cookie, scala.Unit]
  ): scala.Unit = js.native
  def setCookie(
    cookieOrString: Cookie,
    currentUrl: java.lang.String,
    cb: js.Function2[/* err */ stdLib.Error, /* cookie */ Cookie, scala.Unit]
  ): scala.Unit = js.native
  def setCookie(
    cookieOrString: Cookie,
    currentUrl: java.lang.String,
    options: toughDashCookieLib.toughDashCookieMod.CookieJarNs.SetCookieOptions,
    cb: js.Function2[/* err */ stdLib.Error | scala.Null, /* cookie */ Cookie, scala.Unit]
  ): scala.Unit = js.native
  def setCookieSync(cookieOrString: java.lang.String, currentUrl: java.lang.String): scala.Unit = js.native
  def setCookieSync(
    cookieOrString: java.lang.String,
    currentUrl: java.lang.String,
    options: toughDashCookieLib.toughDashCookieMod.CookieJarNs.SetCookieOptions
  ): scala.Unit = js.native
  def setCookieSync(cookieOrString: Cookie, currentUrl: java.lang.String): scala.Unit = js.native
  def setCookieSync(
    cookieOrString: Cookie,
    currentUrl: java.lang.String,
    options: toughDashCookieLib.toughDashCookieMod.CookieJarNs.SetCookieOptions
  ): scala.Unit = js.native
  def toJSON(): toughDashCookieLib.toughDashCookieMod.CookieJarNs.Serialized = js.native
}

/* static members */
@JSImport("tough-cookie", "CookieJar")
@js.native
object CookieJar extends js.Object {
  def deserialize(
    serialized: java.lang.String,
    cb: js.Function2[/* err */ stdLib.Error | scala.Null, /* object */ this.type, scala.Unit]
  ): scala.Unit = js.native
  def deserialize(
    serialized: java.lang.String,
    store: toughDashCookieLib.toughDashCookieMod.Store,
    cb: js.Function2[/* err */ stdLib.Error | scala.Null, /* object */ this.type, scala.Unit]
  ): scala.Unit = js.native
  def deserialize(
    serialized: toughDashCookieLib.toughDashCookieMod.CookieJarNs.Serialized,
    cb: js.Function2[/* err */ stdLib.Error | scala.Null, /* object */ this.type, scala.Unit]
  ): scala.Unit = js.native
  def deserialize(
    serialized: toughDashCookieLib.toughDashCookieMod.CookieJarNs.Serialized,
    store: toughDashCookieLib.toughDashCookieMod.Store,
    cb: js.Function2[/* err */ stdLib.Error | scala.Null, /* object */ this.type, scala.Unit]
  ): scala.Unit = js.native
  def deserializeSync(serialized: java.lang.String): toughDashCookieLib.toughDashCookieMod.CookieJar = js.native
  def deserializeSync(serialized: java.lang.String, store: toughDashCookieLib.toughDashCookieMod.Store): toughDashCookieLib.toughDashCookieMod.CookieJar = js.native
  def deserializeSync(serialized: toughDashCookieLib.toughDashCookieMod.CookieJarNs.Serialized): toughDashCookieLib.toughDashCookieMod.CookieJar = js.native
  def deserializeSync(
    serialized: toughDashCookieLib.toughDashCookieMod.CookieJarNs.Serialized,
    store: toughDashCookieLib.toughDashCookieMod.Store
  ): toughDashCookieLib.toughDashCookieMod.CookieJar = js.native
  def fromJSON(string: java.lang.String): toughDashCookieLib.toughDashCookieMod.CookieJar = js.native
}

