package typings
package y18nLib.y18nMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Y18N extends js.Object {
  /**
    * Print a localized string, %s will be replaced with args.
    */
  def __(str: java.lang.String): java.lang.String = js.native
  def __(str: java.lang.String, arg1: java.lang.String): java.lang.String = js.native
  def __(str: java.lang.String, arg1: java.lang.String, arg2: java.lang.String): java.lang.String = js.native
  def __(str: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): java.lang.String = js.native
  /**
    * Print a localized string with appropriate pluralization.
    * If %d is provided in the string, the count will replace this placeholder.
    */
  def __n(singularString: java.lang.String, pluralString: java.lang.String, count: scala.Double): java.lang.String = js.native
  def __n(
    singularString: java.lang.String,
    pluralString: java.lang.String,
    count: scala.Double,
    arg1: java.lang.String
  ): java.lang.String = js.native
  def __n(
    singularString: java.lang.String,
    pluralString: java.lang.String,
    count: scala.Double,
    arg1: java.lang.String,
    arg2: java.lang.String
  ): java.lang.String = js.native
  def __n(
    singularString: java.lang.String,
    pluralString: java.lang.String,
    count: scala.Double,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String
  ): java.lang.String = js.native
  /**
    * What locale is currently being used?
    */
  def getLocale(): java.lang.String = js.native
  /**
    * Set the current locale being used.
    */
  def setLocale(str: java.lang.String): scala.Unit = js.native
  /**
    * Update the current locale with the key value pairs in obj.
    */
  def updateLocale(obj: js.Object): scala.Unit = js.native
}

