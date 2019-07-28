package typings.y18n.y18nMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Y18N extends js.Object {
  /**
    * Print a localized string, %s will be replaced with args.
    */
  def __(str: String): String = js.native
  def __(str: String, arg1: String): String = js.native
  def __(str: String, arg1: String, arg2: String): String = js.native
  def __(str: String, arg1: String, arg2: String, arg3: String): String = js.native
  /**
    * Print a localized string with appropriate pluralization.
    * If %d is provided in the string, the count will replace this placeholder.
    */
  def __n(singularString: String, pluralString: String, count: Double): String = js.native
  def __n(singularString: String, pluralString: String, count: Double, arg1: String): String = js.native
  def __n(singularString: String, pluralString: String, count: Double, arg1: String, arg2: String): String = js.native
  def __n(
    singularString: String,
    pluralString: String,
    count: Double,
    arg1: String,
    arg2: String,
    arg3: String
  ): String = js.native
  /**
    * What locale is currently being used?
    */
  def getLocale(): String = js.native
  /**
    * Set the current locale being used.
    */
  def setLocale(str: String): Unit = js.native
  /**
    * Update the current locale with the key value pairs in obj.
    */
  def updateLocale(obj: js.Object): Unit = js.native
}

