package typings.urlVariables.mod

import typings.urlVariables.urlvariablesMod.URLVariables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def this(str: String) = this()
}
