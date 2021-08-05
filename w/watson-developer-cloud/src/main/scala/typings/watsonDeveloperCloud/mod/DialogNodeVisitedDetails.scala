package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** DialogNodeVisitedDetails. */
trait DialogNodeVisitedDetails extends StObject {
  
  /** The conditions that trigger the dialog node. */
  var conditions: js.UndefOr[String] = js.undefined
  
  /** A dialog node that was triggered during processing of the input message. */
  var dialog_node: js.UndefOr[String] = js.undefined
  
  /** The title of the dialog node. */
  var title: js.UndefOr[String] = js.undefined
}
object DialogNodeVisitedDetails {
  
  inline def apply(): DialogNodeVisitedDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogNodeVisitedDetails]
  }
  
  extension [Self <: DialogNodeVisitedDetails](x: Self) {
    
    inline def setConditions(value: String): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setDialog_node(value: String): Self = StObject.set(x, "dialog_node", value.asInstanceOf[js.Any])
    
    inline def setDialog_nodeUndefined: Self = StObject.set(x, "dialog_node", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
