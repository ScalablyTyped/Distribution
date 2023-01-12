package typings.xrm.Xrm.Controls

import typings.xrm.Xrm.LookupValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for a view selector item. This object contains data that identifies a view. Use this as a parameter to
  * the ViewSelector.setCurrentView method.
  */
trait ViewSelectorItem extends StObject {
  
  /**
    * Returns a LookupValue that references this view.
    * @returns The entity reference.
    */
  def getEntityReference(): LookupValue
}
object ViewSelectorItem {
  
  inline def apply(getEntityReference: () => LookupValue): ViewSelectorItem = {
    val __obj = js.Dynamic.literal(getEntityReference = js.Any.fromFunction0(getEntityReference))
    __obj.asInstanceOf[ViewSelectorItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViewSelectorItem] (val x: Self) extends AnyVal {
    
    inline def setGetEntityReference(value: () => LookupValue): Self = StObject.set(x, "getEntityReference", js.Any.fromFunction0(value))
  }
}
