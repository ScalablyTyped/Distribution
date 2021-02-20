package typings.tern.ternMod

import typings.tern.ternStrings.refs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefsQuery
  extends BaseQueryWithFile
     with Query {
  
  /** Specify the location of the expression. */
  var end: Double | Position = js.native
  
  /** Specify the location of the expression. */
  var start: js.UndefOr[Double | Position] = js.native
  
  /** Used to find all references to a given variable or property. */
  @JSName("type")
  var type_RefsQuery: refs = js.native
}
object RefsQuery {
  
  @scala.inline
  def apply(end: Double | Position, file: String, `type`: refs): RefsQuery = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefsQuery]
  }
  
  @scala.inline
  implicit class RefsQueryMutableBuilder[Self <: RefsQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Double | Position): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double | Position): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setType(value: refs): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
