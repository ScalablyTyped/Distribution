package typings.tern.ternMod

import typings.tern.ternStrings.rename
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenameQuery
  extends BaseQueryWithFile
     with Query {
  
  /** Specify the location of the variable. */
  var end: Double | Position = js.native
  
  /** The new name of the variable */
  var newName: String = js.native
  
  /** Specify the location of the variable. */
  var start: js.UndefOr[Double | Position] = js.native
  
  /** Rename a variable in a scope-aware way. */
  @JSName("type")
  var type_RenameQuery: rename = js.native
}
object RenameQuery {
  
  @scala.inline
  def apply(end: Double | Position, file: String, newName: String, `type`: rename): RenameQuery = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], newName = newName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameQuery]
  }
  
  @scala.inline
  implicit class RenameQueryMutableBuilder[Self <: RenameQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Double | Position): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewName(value: String): Self = StObject.set(x, "newName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double | Position): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setType(value: rename): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
