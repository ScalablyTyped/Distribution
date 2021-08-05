package typings.winrt.Windows.Globalization

import typings.winrt.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Collation {
  
  trait CharacterGrouping
    extends StObject
       with ICharacterGrouping
  object CharacterGrouping {
    
    inline def apply(first: String, label: String): CharacterGrouping = {
      val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[CharacterGrouping]
    }
  }
  
  @js.native
  trait CharacterGroupings
    extends StObject
       with ICharacterGroupings
  
  trait ICharacterGrouping extends StObject {
    
    var first: String
    
    var label: String
  }
  object ICharacterGrouping {
    
    inline def apply(first: String, label: String): ICharacterGrouping = {
      val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICharacterGrouping]
    }
    
    extension [Self <: ICharacterGrouping](x: Self) {
      
      inline def setFirst(value: String): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ICharacterGroupings
    extends StObject
       with IVectorView[CharacterGrouping] {
    
    def lookup(text: String): String = js.native
  }
}
