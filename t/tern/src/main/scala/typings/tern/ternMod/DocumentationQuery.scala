package typings.tern.ternMod

import typings.tern.ternStrings.documentation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentationQuery
  extends BaseQueryWithFile
     with Query {
  
  /** Specify the location of the expression. */
  var end: Double | Position = js.native
  
  /** Specify the location of the expression. */
  var start: js.UndefOr[Double | Position] = js.native
  
  /** Get the documentation string and URL for a given expression, if any. */
  @JSName("type")
  var type_DocumentationQuery: documentation = js.native
}
object DocumentationQuery {
  
  @scala.inline
  def apply(end: Double | Position, file: String, `type`: documentation): DocumentationQuery = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentationQuery]
  }
  
  @scala.inline
  implicit class DocumentationQueryOps[Self <: DocumentationQuery] (val x: Self) extends AnyVal {
    
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
    def setEnd(value: Double | Position): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: documentation): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double | Position): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
}
