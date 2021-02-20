package typings.winrtUwp.anon

import typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceCandidate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemsResourceCandidate extends StObject {
  
  /** The ResourceCandidate objects in the set that start at startIndex. */ var items: ResourceCandidate = js.native
  
  /** The number of ResourceCandidate objects returned. */ var returnValue: Double = js.native
}
object ItemsResourceCandidate {
  
  @scala.inline
  def apply(items: ResourceCandidate, returnValue: Double): ItemsResourceCandidate = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsResourceCandidate]
  }
  
  @scala.inline
  implicit class ItemsResourceCandidateMutableBuilder[Self <: ItemsResourceCandidate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: ResourceCandidate): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
