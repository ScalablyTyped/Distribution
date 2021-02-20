package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Object that defines a Salesforce document object type crawl with this configuration. */
@js.native
trait SourceOptionsObject extends StObject {
  
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
  implicit class SourceOptionsObjectMutableBuilder[Self <: SourceOptionsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
