package typings.winrtUwp.anon

import typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceQualifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemsResourceQualifier extends StObject {
  
  /** The objects in the view that start at startIndex. */ var items: ResourceQualifier = js.native
  
  /** The number of objects returned. */ var returnValue: Double = js.native
}
object ItemsResourceQualifier {
  
  @scala.inline
  def apply(items: ResourceQualifier, returnValue: Double): ItemsResourceQualifier = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsResourceQualifier]
  }
  
  @scala.inline
  implicit class ItemsResourceQualifierMutableBuilder[Self <: ItemsResourceQualifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: ResourceQualifier): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
