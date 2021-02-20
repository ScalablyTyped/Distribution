package typings.uiBox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object prefixerMod {
  
  @JSImport("ui-box/dist/src/prefixer", JSImport.Default)
  @js.native
  def default(property: String, value: String): js.Array[Rule] = js.native
  
  @js.native
  trait Rule extends StObject {
    
    var property: String = js.native
    
    var value: String = js.native
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
