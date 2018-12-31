package typings
package universalDashCookieLib.universalDashCookieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cookies extends js.Object {
  /**
    * Add a listener to when a cookie is set or removed.
    *
    * @param callback Call that will be called with the first argument containing name, value and options of the changed cookie.
    */
  def addChangeListener(callback: ChangeListenerCallback): scala.Unit = js.native
  /**
    * Get a cookie value
    *
    * @param name cookie name
    * @param options.doNotParse do not convert the cookie into an object no matter what
    */
  def get(name: java.lang.String): java.lang.String = js.native
  def get(name: java.lang.String, options: GetOpts): java.lang.String = js.native
  /**
    * Get all cookies
    *
    * @param options.doNotParse do not convert the cookie into an object no matter what
    */
  def getAll(): CookiesByName = js.native
  def getAll(options: GetOpts): CookiesByName = js.native
  /**
    * Set a cookie value
    *
    * @param name cookie name
    * @param options Support all the cookie options from RFC 6265
    */
  def remove(name: java.lang.String): scala.Unit = js.native
  def remove(name: java.lang.String, options: CookieOpts): scala.Unit = js.native
  /**
    * Remove a listener from the change callback.
    */
  def removeChangeListener(callback: ChangeListenerCallback): scala.Unit = js.native
  /**
    * Set a cookie value
    *
    * @param name cookie name
    * @param value save the value and stringify the object if needed
    * @param options Support all the cookie options from RFC 6265
    */
  def set(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def set(name: java.lang.String, value: java.lang.String, options: CookieOpts): scala.Unit = js.native
  def set(name: java.lang.String, value: js.Object): scala.Unit = js.native
  def set(name: java.lang.String, value: js.Object, options: CookieOpts): scala.Unit = js.native
}

