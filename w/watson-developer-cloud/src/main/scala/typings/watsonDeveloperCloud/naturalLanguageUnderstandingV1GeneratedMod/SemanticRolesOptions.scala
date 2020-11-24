package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parses sentences into subject, action, and object form. Supported languages: English, German, Japanese, Korean, Spanish. */
@js.native
trait SemanticRolesOptions extends js.Object {
  
  /** Set this to `true` to return entity information for subjects and objects. */
  var entities: js.UndefOr[Boolean] = js.native
  
  /** Set this to `true` to return keyword information for subjects and objects. */
  var keywords: js.UndefOr[Boolean] = js.native
  
  /** Maximum number of semantic_roles results to return. */
  var limit: js.UndefOr[Double] = js.native
}
object SemanticRolesOptions {
  
  @scala.inline
  def apply(): SemanticRolesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SemanticRolesOptions]
  }
  
  @scala.inline
  implicit class SemanticRolesOptionsOps[Self <: SemanticRolesOptions] (val x: Self) extends AnyVal {
    
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
    def setEntities(value: Boolean): Self = this.set("entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntities: Self = this.set("entities", js.undefined)
    
    @scala.inline
    def setKeywords(value: Boolean): Self = this.set("keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeywords: Self = this.set("keywords", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
  }
}
