package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** SemanticRolesKeyword. */
@js.native
trait SemanticRolesKeyword extends js.Object {
  
  /** The keyword text. */
  var text: js.UndefOr[String] = js.native
}
object SemanticRolesKeyword {
  
  @scala.inline
  def apply(): SemanticRolesKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SemanticRolesKeyword]
  }
  
  @scala.inline
  implicit class SemanticRolesKeywordOps[Self <: SemanticRolesKeyword] (val x: Self) extends AnyVal {
    
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
