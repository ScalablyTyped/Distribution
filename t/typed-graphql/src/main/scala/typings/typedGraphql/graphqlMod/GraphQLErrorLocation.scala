package typings.typedGraphql.graphqlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphQLErrorLocation extends StObject {
  
  var column: Double
  
  var line: Double
}
object GraphQLErrorLocation {
  
  inline def apply(column: Double, line: Double): GraphQLErrorLocation = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLErrorLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GraphQLErrorLocation] (val x: Self) extends AnyVal {
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
  }
}
