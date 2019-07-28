package typings.typeahead.BloodhoundNs

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
  def nonword(str: String): js.Array[String]
  /**
    * Split a given string on whitespace characters.
    */
  def whitespace(str: String): js.Array[String]
}

object Tokenizers {
  @scala.inline
  def apply(nonword: String => js.Array[String], obj: ObjTokenizer, whitespace: String => js.Array[String]): Tokenizers = {
    val __obj = js.Dynamic.literal(nonword = js.Any.fromFunction1(nonword), obj = obj, whitespace = js.Any.fromFunction1(whitespace))
  
    __obj.asInstanceOf[Tokenizers]
  }
}

