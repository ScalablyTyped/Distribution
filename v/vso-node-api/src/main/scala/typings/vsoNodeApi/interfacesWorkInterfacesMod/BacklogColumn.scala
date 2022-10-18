package typings.vsoNodeApi.interfacesWorkInterfacesMod

import typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.WorkItemFieldReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BacklogColumn extends StObject {
  
  var columnFieldReference: WorkItemFieldReference
  
  var width: Double
}
object BacklogColumn {
  
  inline def apply(columnFieldReference: WorkItemFieldReference, width: Double): BacklogColumn = {
    val __obj = js.Dynamic.literal(columnFieldReference = columnFieldReference.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BacklogColumn]
  }
  
  extension [Self <: BacklogColumn](x: Self) {
    
    inline def setColumnFieldReference(value: WorkItemFieldReference): Self = StObject.set(x, "columnFieldReference", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
