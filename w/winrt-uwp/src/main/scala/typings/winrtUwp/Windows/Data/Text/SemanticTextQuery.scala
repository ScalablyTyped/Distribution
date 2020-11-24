package typings.winrtUwp.Windows.Data.Text

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Permits apps to perform text queries using Advanced Query Syntax (AQS) strings, with the option of providing a language tag to be employed in the query. */
@js.native
trait SemanticTextQuery extends js.Object {
  
  /**
    * Returns segments of a source string that match the SemanticTextQuery object's query.
    * @param content A source string to be queried.
    * @return A collection of TextSegment structures that represent hits from the query.
    */
  def find(content: String): IVectorView[TextSegment] = js.native
  
  /**
    * Returns segments of a source string that match the SemanticTextQuery object's query over properties.
    * @param propertyContent A source string to be queried.
    * @param propertyName The name of the property.
    * @return A collection of TextSegment structures that represent hits from the query.
    */
  def findInProperty(propertyContent: String, propertyName: String): IVectorView[TextSegment] = js.native
}
object SemanticTextQuery {
  
  @scala.inline
  def apply(
    find: String => IVectorView[TextSegment],
    findInProperty: (String, String) => IVectorView[TextSegment]
  ): SemanticTextQuery = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction1(find), findInProperty = js.Any.fromFunction2(findInProperty))
    __obj.asInstanceOf[SemanticTextQuery]
  }
  
  @scala.inline
  implicit class SemanticTextQueryOps[Self <: SemanticTextQuery] (val x: Self) extends AnyVal {
    
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
    def setFind(value: String => IVectorView[TextSegment]): Self = this.set("find", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFindInProperty(value: (String, String) => IVectorView[TextSegment]): Self = this.set("findInProperty", js.Any.fromFunction2(value))
  }
}
