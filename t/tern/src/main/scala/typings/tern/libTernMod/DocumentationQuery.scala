package typings.tern.libTernMod

import typings.tern.ternStrings.documentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentationQuery
  extends StObject
     with BaseQueryWithFile
     with Query {
  
  /** Specify the location of the expression. */
  var end: Double | Position
  
  /** Specify the location of the expression. */
  var start: js.UndefOr[Double | Position] = js.undefined
  
  /** Get the documentation string and URL for a given expression, if any. */
  @JSName("type")
  var type_DocumentationQuery: documentation
}
object DocumentationQuery {
  
  inline def apply(end: Double | Position, file: String): DocumentationQuery = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("documentation")
    __obj.asInstanceOf[DocumentationQuery]
  }
  
  extension [Self <: DocumentationQuery](x: Self) {
    
    inline def setEnd(value: Double | Position): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double | Position): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setType(value: documentation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
