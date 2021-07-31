package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a set of signature help items, and the preferred item that should be selected.
  */
trait SignatureHelpItems extends StObject {
  
  var applicableSpan: TextSpan
  
  var argumentCount: Double
  
  var argumentIndex: Double
  
  var items: js.Array[SignatureHelpItem]
  
  var selectedItemIndex: Double
}
object SignatureHelpItems {
  
  @scala.inline
  def apply(
    applicableSpan: TextSpan,
    argumentCount: Double,
    argumentIndex: Double,
    items: js.Array[SignatureHelpItem],
    selectedItemIndex: Double
  ): SignatureHelpItems = {
    val __obj = js.Dynamic.literal(applicableSpan = applicableSpan.asInstanceOf[js.Any], argumentCount = argumentCount.asInstanceOf[js.Any], argumentIndex = argumentIndex.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], selectedItemIndex = selectedItemIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelpItems]
  }
  
  @scala.inline
  implicit class SignatureHelpItemsMutableBuilder[Self <: SignatureHelpItems] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicableSpan(value: TextSpan): Self = StObject.set(x, "applicableSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentCount(value: Double): Self = StObject.set(x, "argumentCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentIndex(value: Double): Self = StObject.set(x, "argumentIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: js.Array[SignatureHelpItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: SignatureHelpItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setSelectedItemIndex(value: Double): Self = StObject.set(x, "selectedItemIndex", value.asInstanceOf[js.Any])
  }
}
