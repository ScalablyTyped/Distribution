package typings.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphQLErrorLocation extends StObject {
  
  var column: Double = js.native
  
  var line: Double = js.native
}
object GraphQLErrorLocation {
  
  @scala.inline
  def apply(column: Double, line: Double): GraphQLErrorLocation = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLErrorLocation]
  }
  
  @scala.inline
  implicit class GraphQLErrorLocationMutableBuilder[Self <: GraphQLErrorLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
  }
}
