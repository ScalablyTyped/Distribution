package typings.xrm.Xrm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for options used in Xrm.Utility.lookupObjects(LookupOptions)  filters
  */
trait LookupFilterOptions extends StObject {
  
  /**
    * The entity type to which to apply this filter.
    */
  var entityLogicalName: String
  
  /**
    * The FetchXML filter element to apply.
    */
  var filterXml: String
}
object LookupFilterOptions {
  
  inline def apply(entityLogicalName: String, filterXml: String): LookupFilterOptions = {
    val __obj = js.Dynamic.literal(entityLogicalName = entityLogicalName.asInstanceOf[js.Any], filterXml = filterXml.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookupFilterOptions]
  }
  
  extension [Self <: LookupFilterOptions](x: Self) {
    
    inline def setEntityLogicalName(value: String): Self = StObject.set(x, "entityLogicalName", value.asInstanceOf[js.Any])
    
    inline def setFilterXml(value: String): Self = StObject.set(x, "filterXml", value.asInstanceOf[js.Any])
  }
}
