package typings.toidentifier

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Convert a string of words to a JavaScript identifier.
    *
    * Given a string as the argument, it will be transformed according to the following
    * rules and the new string will be returned:
    *
    * 1. Split into words separated by space characters (`0x20`).
    * 1. Upper case the first character of each word.
    * 1. Join the words together with no separator.
    * 1. Remove all non-word (`[0-9a-z_]`) characters.
    *
    * @example
    * import toIdentifier = require('toidentifier')
    *
    * console.log(toIdentifier('Bad Request'))
    * // => "BadRequest"
    */
  inline def apply(str: String): String = ^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("toidentifier", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
