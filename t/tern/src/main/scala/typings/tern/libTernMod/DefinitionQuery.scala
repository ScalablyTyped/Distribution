package typings.tern.libTernMod

import typings.tern.ternStrings.definition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefinitionQuery
  extends StObject
     with BaseQueryWithFile
     with Query {
  
  /** Specify the location of the expression. */
  var end: Double | Position
  
  /** Specify the location of the expression. */
  var start: js.UndefOr[Double | Position] = js.undefined
  
  /**
    * Asks for the definition of something. This will try, for a variable or property,
    * to return the point at which it was defined. If that fails, or the chosen
    * expression is not an identifier or property reference, it will try to return
    * the definition site of the type the expression has. If no type is found, or the
    * type is not an object or function (other types don’t store their definition site),
    * it will fail to return useful information.
    */
  @JSName("type")
  var type_DefinitionQuery: definition
}
object DefinitionQuery {
  
  inline def apply(end: Double | Position, file: String): DefinitionQuery = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("definition")
    __obj.asInstanceOf[DefinitionQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefinitionQuery] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: Double | Position): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double | Position): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setType(value: definition): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
