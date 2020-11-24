package typings.testingLibraryDom.suggestionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Suggestion extends js.Object {
  
  var queryArgs: QueryArgs = js.native
  
  var queryMethod: String = js.native
  
  var queryName: String = js.native
  
  var variant: String = js.native
  
  var warning: js.UndefOr[String] = js.native
}
object Suggestion {
  
  @scala.inline
  def apply(queryArgs: QueryArgs, queryMethod: String, queryName: String, variant: String): Suggestion = {
    val __obj = js.Dynamic.literal(queryArgs = queryArgs.asInstanceOf[js.Any], queryMethod = queryMethod.asInstanceOf[js.Any], queryName = queryName.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[Suggestion]
  }
  
  @scala.inline
  implicit class SuggestionOps[Self <: Suggestion] (val x: Self) extends AnyVal {
    
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
    def setQueryArgs(value: QueryArgs): Self = this.set("queryArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryMethod(value: String): Self = this.set("queryMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryName(value: String): Self = this.set("queryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariant(value: String): Self = this.set("variant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarning(value: String): Self = this.set("warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
}
