package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofButtonNextComponent extends StObject {
  
  /* static member */
  var defaultProps: As
  
  /* static member */
  var displayName: String
}
object TypeofButtonNextComponent {
  
  @scala.inline
  def apply(defaultProps: As, displayName: String): TypeofButtonNextComponent = {
    val __obj = js.Dynamic.literal(defaultProps = defaultProps.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofButtonNextComponent]
  }
  
  @scala.inline
  implicit class TypeofButtonNextComponentMutableBuilder[Self <: TypeofButtonNextComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: As): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
  }
}
