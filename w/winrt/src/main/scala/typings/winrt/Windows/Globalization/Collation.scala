package typings.winrt.Windows.Globalization

import typings.winrt.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Collation {
  
  @js.native
  trait CharacterGrouping extends ICharacterGrouping
  object CharacterGrouping {
    
    @scala.inline
    def apply(first: String, label: String): CharacterGrouping = {
      val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[CharacterGrouping]
    }
  }
  
  @js.native
  trait CharacterGroupings extends ICharacterGroupings
  
  @js.native
  trait ICharacterGrouping extends StObject {
    
    var first: String = js.native
    
    var label: String = js.native
  }
  object ICharacterGrouping {
    
    @scala.inline
    def apply(first: String, label: String): ICharacterGrouping = {
      val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICharacterGrouping]
    }
    
    @scala.inline
    implicit class ICharacterGroupingMutableBuilder[Self <: ICharacterGrouping] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFirst(value: String): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ICharacterGroupings extends IVectorView[CharacterGrouping] {
    
    def lookup(text: String): String = js.native
  }
}
