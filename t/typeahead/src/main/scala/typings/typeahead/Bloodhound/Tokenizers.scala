package typings.typeahead.Bloodhound

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Build-in tokenization methods.
  */
@js.native
trait Tokenizers extends js.Object {
  
  /**
    * Split a given string on non-word characters.
    */
  def nonword(str: String): js.Array[String] = js.native
  
  /**
    * Instances of the build-in tokenization methods.
    */
  var obj: ObjTokenizer = js.native
  
  /**
    * Split a given string on whitespace characters.
    */
  def whitespace(str: String): js.Array[String] = js.native
}
object Tokenizers {
  
  @scala.inline
  def apply(nonword: String => js.Array[String], obj: ObjTokenizer, whitespace: String => js.Array[String]): Tokenizers = {
    val __obj = js.Dynamic.literal(nonword = js.Any.fromFunction1(nonword), obj = obj.asInstanceOf[js.Any], whitespace = js.Any.fromFunction1(whitespace))
    __obj.asInstanceOf[Tokenizers]
  }
  
  @scala.inline
  implicit class TokenizersOps[Self <: Tokenizers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNonword(value: String => js.Array[String]): Self = this.set("nonword", js.Any.fromFunction1(value))
    
    @scala.inline
    def setObj(value: ObjTokenizer): Self = this.set("obj", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhitespace(value: String => js.Array[String]): Self = this.set("whitespace", js.Any.fromFunction1(value))
  }
}
