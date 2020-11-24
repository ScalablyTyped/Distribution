package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Object that defines a Salesforce document object type crawl with this configuration. */
@js.native
trait SourceOptionsObject extends js.Object {
  
  /** The maximum number of documents to crawl for this document object. By default, all documents in the document object are crawled. */
  var limit: js.UndefOr[Double] = js.native
  
  /** The name of the Salesforce document object to crawl. For example, `case`. */
  var name: String = js.native
}
object SourceOptionsObject {
  
  @scala.inline
  def apply(name: String): SourceOptionsObject = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceOptionsObject]
  }
  
  @scala.inline
  implicit class SourceOptionsObjectOps[Self <: SourceOptionsObject] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
  }
}
