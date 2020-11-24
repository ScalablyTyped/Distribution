package typings.watsonDeveloperCloud.naturalLanguageClassifierV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Response from the classifier for a phrase in a collection. */
@js.native
trait CollectionItem extends js.Object {
  
  /** An array of up to ten class-confidence pairs sorted in descending order of confidence. */
  var classes: js.UndefOr[js.Array[ClassifiedClass]] = js.native
  
  /** The submitted phrase. The maximum length is 2048 characters. */
  var text: js.UndefOr[String] = js.native
  
  /** The class with the highest confidence. */
  var top_class: js.UndefOr[String] = js.native
}
object CollectionItem {
  
  @scala.inline
  def apply(): CollectionItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionItem]
  }
  
  @scala.inline
  implicit class CollectionItemOps[Self <: CollectionItem] (val x: Self) extends AnyVal {
    
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
    def setClassesVarargs(value: ClassifiedClass*): Self = this.set("classes", js.Array(value :_*))
    
    @scala.inline
    def setClasses(value: js.Array[ClassifiedClass]): Self = this.set("classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTop_class(value: String): Self = this.set("top_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTop_class: Self = this.set("top_class", js.undefined)
  }
}
