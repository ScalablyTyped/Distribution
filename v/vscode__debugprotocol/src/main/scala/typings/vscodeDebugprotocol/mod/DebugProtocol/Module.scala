package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A Module object represents a row in the modules view.
		The `id` attribute identifies a module in the modules view and is used in a `module` event for identifying a module for adding, updating or deleting.
		The `name` attribute is used to minimally render the module in the UI.
		
		Additional attributes can be added to the module. They show up in the module view if they have a corresponding `ColumnDescriptor`.
		
		To avoid an unnecessary proliferation of additional attributes with similar semantics but different names, we recommend to re-use attributes from the 'recommended' list below first, and only introduce new attributes if nothing appropriate could be found.
	*/
trait Module extends StObject {
  
  /** Address range covered by this module. */
  var addressRange: js.UndefOr[String] = js.undefined
  
  /** Module created or modified, encoded as a RFC 3339 timestamp. */
  var dateTimeStamp: js.UndefOr[String] = js.undefined
  
  /** Unique identifier for the module. */
  var id: Double | String
  
  /** True if the module is optimized. */
  var isOptimized: js.UndefOr[Boolean] = js.undefined
  
  /** True if the module is considered 'user code' by a debugger that supports 'Just My Code'. */
  var isUserCode: js.UndefOr[Boolean] = js.undefined
  
  /** A name of the module. */
  var name: String
  
  /** Logical full path to the module. The exact definition is implementation defined, but usually this would be a full path to the on-disk file for the module. */
  var path: js.UndefOr[String] = js.undefined
  
  /** Logical full path to the symbol file. The exact definition is implementation defined. */
  var symbolFilePath: js.UndefOr[String] = js.undefined
  
  /** User-understandable description of if symbols were found for the module (ex: 'Symbols Loaded', 'Symbols not found', etc.) */
  var symbolStatus: js.UndefOr[String] = js.undefined
  
  /** Version of Module. */
  var version: js.UndefOr[String] = js.undefined
}
object Module {
  
  inline def apply(id: Double | String, name: String): Module = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Module]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Module] (val x: Self) extends AnyVal {
    
    inline def setAddressRange(value: String): Self = StObject.set(x, "addressRange", value.asInstanceOf[js.Any])
    
    inline def setAddressRangeUndefined: Self = StObject.set(x, "addressRange", js.undefined)
    
    inline def setDateTimeStamp(value: String): Self = StObject.set(x, "dateTimeStamp", value.asInstanceOf[js.Any])
    
    inline def setDateTimeStampUndefined: Self = StObject.set(x, "dateTimeStamp", js.undefined)
    
    inline def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsOptimized(value: Boolean): Self = StObject.set(x, "isOptimized", value.asInstanceOf[js.Any])
    
    inline def setIsOptimizedUndefined: Self = StObject.set(x, "isOptimized", js.undefined)
    
    inline def setIsUserCode(value: Boolean): Self = StObject.set(x, "isUserCode", value.asInstanceOf[js.Any])
    
    inline def setIsUserCodeUndefined: Self = StObject.set(x, "isUserCode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setSymbolFilePath(value: String): Self = StObject.set(x, "symbolFilePath", value.asInstanceOf[js.Any])
    
    inline def setSymbolFilePathUndefined: Self = StObject.set(x, "symbolFilePath", js.undefined)
    
    inline def setSymbolStatus(value: String): Self = StObject.set(x, "symbolStatus", value.asInstanceOf[js.Any])
    
    inline def setSymbolStatusUndefined: Self = StObject.set(x, "symbolStatus", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
