package typings.universalCookie.mod

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
  def addChangeListener(callback: ChangeListenerCallback): Unit = js.native
  /**
    * Get a cookie value
    *
    * @param name cookie name
    * @param options.doNotParse do not convert the cookie into an object no matter what
    */
  def get(name: String): String = js.native
  def get(name: String, options: GetOpts): String = js.native
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
  def remove(name: String): Unit = js.native
  def remove(name: String, options: CookieOpts): Unit = js.native
  /**
    * Remove a listener from the change callback.
    */
  def removeChangeListener(callback: ChangeListenerCallback): Unit = js.native
  /**
    * Set a cookie value
    *
    * @param name cookie name
    * @param value save the value and stringify the object if needed
    * @param options Support all the cookie options from RFC 6265
    */
  def set(name: String, value: String): Unit = js.native
  def set(name: String, value: String, options: CookieOpts): Unit = js.native
  def set(name: String, value: js.Object): Unit = js.native
  def set(name: String, value: js.Object, options: CookieOpts): Unit = js.native
}

