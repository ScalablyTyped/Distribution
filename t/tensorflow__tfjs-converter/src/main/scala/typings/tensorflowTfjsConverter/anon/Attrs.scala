package typings.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attrs extends StObject {
  
  var attrs: Items
  
  var category: Ref
  
  var customExecutor: Ref
  
  var inputs: Items
  
  var tfOpName: Type
}
object Attrs {
  
  @scala.inline
  def apply(attrs: Items, category: Ref, customExecutor: Ref, inputs: Items, tfOpName: Type): Attrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], customExecutor = customExecutor.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], tfOpName = tfOpName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attrs]
  }
  
  @scala.inline
  implicit class AttrsMutableBuilder[Self <: Attrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttrs(value: Items): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategory(value: Ref): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomExecutor(value: Ref): Self = StObject.set(x, "customExecutor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: Items): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTfOpName(value: Type): Self = StObject.set(x, "tfOpName", value.asInstanceOf[js.Any])
  }
}
