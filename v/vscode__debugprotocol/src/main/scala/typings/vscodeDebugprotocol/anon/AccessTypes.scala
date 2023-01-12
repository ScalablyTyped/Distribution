package typings.vscodeDebugprotocol.anon

import typings.vscodeDebugprotocol.mod.DebugProtocol.DataBreakpointAccessType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessTypes extends StObject {
  
  /** Attribute lists the available access types for a potential data breakpoint. A UI client could surface this information. */
  var accessTypes: js.UndefOr[js.Array[DataBreakpointAccessType]] = js.undefined
  
  /** Attribute indicates that a potential data breakpoint could be persisted across sessions. */
  var canPersist: js.UndefOr[Boolean] = js.undefined
  
  /** An identifier for the data on which a data breakpoint can be registered with the setDataBreakpoints request or null if no data breakpoint is available. */
  var dataId: String | Null
  
  /** UI string that describes on what data the breakpoint is set on or why a data breakpoint is not available. */
  var description: String
}
object AccessTypes {
  
  inline def apply(description: String): AccessTypes = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], dataId = null)
    __obj.asInstanceOf[AccessTypes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessTypes] (val x: Self) extends AnyVal {
    
    inline def setAccessTypes(value: js.Array[DataBreakpointAccessType]): Self = StObject.set(x, "accessTypes", value.asInstanceOf[js.Any])
    
    inline def setAccessTypesUndefined: Self = StObject.set(x, "accessTypes", js.undefined)
    
    inline def setAccessTypesVarargs(value: DataBreakpointAccessType*): Self = StObject.set(x, "accessTypes", js.Array(value*))
    
    inline def setCanPersist(value: Boolean): Self = StObject.set(x, "canPersist", value.asInstanceOf[js.Any])
    
    inline def setCanPersistUndefined: Self = StObject.set(x, "canPersist", js.undefined)
    
    inline def setDataId(value: String): Self = StObject.set(x, "dataId", value.asInstanceOf[js.Any])
    
    inline def setDataIdNull: Self = StObject.set(x, "dataId", null)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
  }
}
