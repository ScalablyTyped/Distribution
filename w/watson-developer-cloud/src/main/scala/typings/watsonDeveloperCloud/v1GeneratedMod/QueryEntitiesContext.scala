package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Entity text to provide context for the queried entity and rank based on that association. For example, if you wanted to query the city of London in England your query would look for `London` with the context of `England`. */
@js.native
trait QueryEntitiesContext extends StObject {
  
  /** Entity text to provide context for the queried entity and rank based on that association. For example, if you wanted to query the city of London in England your query would look for `London` with the context of `England`. */
  var text: js.UndefOr[String] = js.native
}
object QueryEntitiesContext {
  
  @scala.inline
  def apply(): QueryEntitiesContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryEntitiesContext]
  }
  
  @scala.inline
  implicit class QueryEntitiesContextMutableBuilder[Self <: QueryEntitiesContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
