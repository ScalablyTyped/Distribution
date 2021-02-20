package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmitState extends StObject {
  
  var column: Double = js.native
  
  var container: EmitContainer = js.native
  
  var line: Double = js.native
}
object EmitState {
  
  @scala.inline
  def apply(column: Double, container: EmitContainer, line: Double): EmitState = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitState]
  }
  
  @scala.inline
  implicit class EmitStateMutableBuilder[Self <: EmitState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainer(value: EmitContainer): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
  }
}
