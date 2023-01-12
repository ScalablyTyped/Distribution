package typings.tern.libTernMod

import typings.tern.ternStrings.refs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefsQuery
  extends StObject
     with BaseQueryWithFile
     with Query {
  
  /** Specify the location of the expression. */
  var end: Double | Position
  
  /** Specify the location of the expression. */
  var start: js.UndefOr[Double | Position] = js.undefined
  
  /** Used to find all references to a given variable or property. */
  @JSName("type")
  var type_RefsQuery: refs
}
object RefsQuery {
  
  inline def apply(end: Double | Position, file: String): RefsQuery = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("refs")
    __obj.asInstanceOf[RefsQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RefsQuery] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: Double | Position): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double | Position): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setType(value: refs): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
