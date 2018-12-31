package typings
package typeaheadLib.BloodhoundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Build-in tokenization methods.
  */
trait Tokenizers extends js.Object {
  /**
    * Instances of the build-in tokenization methods.
    */
  var obj: ObjTokenizer
  /**
    * Split a given string on non-word characters.
    */
  def nonword(str: java.lang.String): js.Array[java.lang.String]
  /**
    * Split a given string on whitespace characters.
    */
  def whitespace(str: java.lang.String): js.Array[java.lang.String]
}

