package typings.twineSugarcube.extensionsMod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait String extends js.Object {
  
  /**
    * Returns the number of times that the given substring was found within the string, starting the search at position.
    * @param needle The substring to count.
    * @param position The zero-based index at which to begin searching for needle. If omitted, will default to 0.
    * @since 2.0.0
    */
  def count(needle: java.lang.String): Double = js.native
  def count(needle: java.lang.String, position: Double): Double = js.native
  
  /**
    * Returns the first Unicode code point within the string. Does not modify the original.
    * @since 2.27.0
    */
  def first(): java.lang.String = js.native
  
  /**
    * Returns the last Unicode code point within the string. Does not modify the original.
    * @since 2.27.0
    */
  def last(): java.lang.String = js.native
  
  /**
    * Returns the string with its first Unicode code point converted to upper case, according to any locale-specific rules.
    * Does not modify the original.
    * @since 2.9.0
    */
  def toLocaleUpperFirst(): java.lang.String = js.native
  
  /**
    * Returns the string with its first Unicode code point converted to upper case. Does not modify the original.
    * @since 2.9.0
    */
  def toUpperFirst(): java.lang.String = js.native
}
