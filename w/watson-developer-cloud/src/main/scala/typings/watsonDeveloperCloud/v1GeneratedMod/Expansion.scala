package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An expansion definition. Each object respresents one set of expandable strings. For example, you could have expansions for the word `hot` in one object, and expansions for the word `cold` in another. */
@js.native
trait Expansion extends js.Object {
  
  /** A list of terms that this expansion will be expanded to. If specified without **input_terms**, it also functions as the input term list. */
  var expanded_terms: js.Array[String] = js.native
  
  /** A list of terms that will be expanded for this expansion. If specified, only the items in this list are expanded. */
  var input_terms: js.UndefOr[js.Array[String]] = js.native
}
object Expansion {
  
  @scala.inline
  def apply(expanded_terms: js.Array[String]): Expansion = {
    val __obj = js.Dynamic.literal(expanded_terms = expanded_terms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expansion]
  }
  
  @scala.inline
  implicit class ExpansionOps[Self <: Expansion] (val x: Self) extends AnyVal {
    
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
    def setExpanded_termsVarargs(value: String*): Self = this.set("expanded_terms", js.Array(value :_*))
    
    @scala.inline
    def setExpanded_terms(value: js.Array[String]): Self = this.set("expanded_terms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput_termsVarargs(value: String*): Self = this.set("input_terms", js.Array(value :_*))
    
    @scala.inline
    def setInput_terms(value: js.Array[String]): Self = this.set("input_terms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput_terms: Self = this.set("input_terms", js.undefined)
  }
}
