package typings.utf8

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("utf8", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Decodes any given UTF-8-encoded string (byteString) as UTF-8, and returns the UTF-8-decoded version of the string.
    * It throws an error when malformed UTF-8 is detected.
    * @param {string} byteString
    */
  @JSImport("utf8", "decode")
  @js.native
  def decode(byteString: String): String = js.native
  
  /**
    * Encodes any given JavaScript string (string) as UTF-8, and returns the UTF-8-encoded version of the string.
    * It throws an error if the input string contains a non-scalar value, i.e. a lone surrogate.
    * @param {string} inputString
    */
  @JSImport("utf8", "encode")
  @js.native
  def encode(inputString: String): String = js.native
  
  /**
    * A string representing the semantic version number.
    */
  @JSImport("utf8", "version")
  @js.native
  def version: String = js.native
  @scala.inline
  def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
}
