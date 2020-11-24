package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** AlignedElement. */
@js.native
trait AlignedElement extends js.Object {
  
  /** Identifies two elements that semantically align between the compared documents. */
  var element_pair: js.UndefOr[js.Array[ElementPair]] = js.native
  
  /** Specifies whether the aligned element is identical. Elements are considered identical despite minor differences such as leading punctuation, end-of-sentence punctuation, whitespace, the presence or absence of definite or indefinite articles, and others. */
  var identical_text: js.UndefOr[Boolean] = js.native
  
  /** One or more hashed values that you can send to IBM to provide feedback or receive support. */
  var provenance_ids: js.UndefOr[js.Array[String]] = js.native
  
  /** Indicates that the elements aligned are contractual clauses of significance. */
  var significant_elements: js.UndefOr[Boolean] = js.native
}
object AlignedElement {
  
  @scala.inline
  def apply(): AlignedElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlignedElement]
  }
  
  @scala.inline
  implicit class AlignedElementOps[Self <: AlignedElement] (val x: Self) extends AnyVal {
    
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
    def setElement_pairVarargs(value: ElementPair*): Self = this.set("element_pair", js.Array(value :_*))
    
    @scala.inline
    def setElement_pair(value: js.Array[ElementPair]): Self = this.set("element_pair", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement_pair: Self = this.set("element_pair", js.undefined)
    
    @scala.inline
    def setIdentical_text(value: Boolean): Self = this.set("identical_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentical_text: Self = this.set("identical_text", js.undefined)
    
    @scala.inline
    def setProvenance_idsVarargs(value: String*): Self = this.set("provenance_ids", js.Array(value :_*))
    
    @scala.inline
    def setProvenance_ids(value: js.Array[String]): Self = this.set("provenance_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvenance_ids: Self = this.set("provenance_ids", js.undefined)
    
    @scala.inline
    def setSignificant_elements(value: Boolean): Self = this.set("significant_elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignificant_elements: Self = this.set("significant_elements", js.undefined)
  }
}
