package typings.uiBox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object prefixerMod {
  
  @JSImport("ui-box/dist/src/prefixer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(property: String, value: String): js.Array[Rule] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Array[Rule]]
  
  trait Rule extends StObject {
    
    var property: String
    
    var value: String
  }
  object Rule {
    
    @scala.inline
    def apply(property: String, value: String): Rule = {
      val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rule]
    }
    
    @scala.inline
    implicit class RuleMutableBuilder[Self <: Rule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
