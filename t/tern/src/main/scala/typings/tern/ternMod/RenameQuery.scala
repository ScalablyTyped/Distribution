package typings.tern.ternMod

import typings.tern.ternStrings.rename
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenameQuery
  extends StObject
     with BaseQueryWithFile
     with Query {
  
  /** Specify the location of the variable. */
  var end: Double | Position
  
  /** The new name of the variable */
  var newName: String
  
  /** Specify the location of the variable. */
  var start: js.UndefOr[Double | Position] = js.undefined
  
  /** Rename a variable in a scope-aware way. */
  @JSName("type")
  var type_RenameQuery: rename
}
object RenameQuery {
  
  inline def apply(end: Double | Position, file: String, newName: String): RenameQuery = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], newName = newName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("rename")
    __obj.asInstanceOf[RenameQuery]
  }
  
  extension [Self <: RenameQuery](x: Self) {
    
    inline def setEnd(value: Double | Position): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setNewName(value: String): Self = StObject.set(x, "newName", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double | Position): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setType(value: rename): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
