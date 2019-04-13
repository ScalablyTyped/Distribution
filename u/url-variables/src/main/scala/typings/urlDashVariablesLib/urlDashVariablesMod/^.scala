package typings
package urlDashVariablesLib.urlDashVariablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * URLVariables class is for representing variables of HTTP.
  *
  * {@link URLVariables} class allows you to transfer variables between an application and server.
  *
  * When transfering, {@link URLVariables} will be converted to a *URI* string.
  * - URI: Uniform Resource Identifier
  *
  * @reference http://help.adobe.com/en_US/FlashPlatform/reference/actionscript/3/flash/net/URLVariables.html
  * @author Migrated by Jeongho Nam <http://samchon.org>
  */
@JSImport("url-variables", JSImport.Namespace)
@js.native
/**
  * Default Constructor.
  */
class ^ () extends URLVariables {
  /**
    * Construct from a URL-encoded string.
    *
    * The {@link decode decode()} method is automatically called to convert the string to properties of the {@link URLVariables} object.
    *
    * @param str A URL-encoded string containing name/value pairs.
    */
  def this(str: java.lang.String) = this()
}

@JSImport("url-variables", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def parse[T](str: java.lang.String): T = js.native
  def parse[T](str: java.lang.String, autoCase: scala.Boolean): T = js.native
  def stringify[T](obj: T): java.lang.String = js.native
}

