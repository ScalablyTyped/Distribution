package typings.webostvjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DRMError extends StObject {
  
  /**
    * This API is not supported in the activated DRM.
    */
  var API_NOT_SUPPORTED: Double
  
  /**
    * The DRM client is not loaded.
    */
  var CLIENT_NOT_LOADED: Double
  
  /**
    * The DRM type of the currently loaded client is not matched with the DRM type
    * that was set when the DRM agent is created.
    */
  var DRM_TYPE_UNMATCHED: Double
  
  /**
    * The key file is not a valid format.
    */
  var INVALID_KEY_FORMAT: Double
  
  /**
    * A part of parameters is not valid data or format.
    */
  var INVALID_PARAMS: Double
  
  /**
    * It cannot get the valid time information.
    */
  var INVALID_TIME_INFO: Double
  
  /**
    * It cannot find a key file in DRM store.
    */
  var KEY_NOT_FOUND: Double
  
  /**
    * No error.
    */
  var NOT_ERROR: Double
  
  /**
    * It's an unknown error.
    */
  var UNKNOWN_ERROR: Double
  
  /**
    * It's not a supported DRM type.
    */
  var UNSUPPORTED_DRM_TYPE: Double
  
  /**
    * The vendor managed error.
    */
  var VENDOR_ERROR: Double
  
  /**
    * There is no process matching to the client ID.
    */
  var WRONG_CLIENT_ID: Double
}
object DRMError {
  
  inline def apply(
    API_NOT_SUPPORTED: Double,
    CLIENT_NOT_LOADED: Double,
    DRM_TYPE_UNMATCHED: Double,
    INVALID_KEY_FORMAT: Double,
    INVALID_PARAMS: Double,
    INVALID_TIME_INFO: Double,
    KEY_NOT_FOUND: Double,
    NOT_ERROR: Double,
    UNKNOWN_ERROR: Double,
    UNSUPPORTED_DRM_TYPE: Double,
    VENDOR_ERROR: Double,
    WRONG_CLIENT_ID: Double
  ): DRMError = {
    val __obj = js.Dynamic.literal(API_NOT_SUPPORTED = API_NOT_SUPPORTED.asInstanceOf[js.Any], CLIENT_NOT_LOADED = CLIENT_NOT_LOADED.asInstanceOf[js.Any], DRM_TYPE_UNMATCHED = DRM_TYPE_UNMATCHED.asInstanceOf[js.Any], INVALID_KEY_FORMAT = INVALID_KEY_FORMAT.asInstanceOf[js.Any], INVALID_PARAMS = INVALID_PARAMS.asInstanceOf[js.Any], INVALID_TIME_INFO = INVALID_TIME_INFO.asInstanceOf[js.Any], KEY_NOT_FOUND = KEY_NOT_FOUND.asInstanceOf[js.Any], NOT_ERROR = NOT_ERROR.asInstanceOf[js.Any], UNKNOWN_ERROR = UNKNOWN_ERROR.asInstanceOf[js.Any], UNSUPPORTED_DRM_TYPE = UNSUPPORTED_DRM_TYPE.asInstanceOf[js.Any], VENDOR_ERROR = VENDOR_ERROR.asInstanceOf[js.Any], WRONG_CLIENT_ID = WRONG_CLIENT_ID.asInstanceOf[js.Any])
    __obj.asInstanceOf[DRMError]
  }
  
  extension [Self <: DRMError](x: Self) {
    
    inline def setAPI_NOT_SUPPORTED(value: Double): Self = StObject.set(x, "API_NOT_SUPPORTED", value.asInstanceOf[js.Any])
    
    inline def setCLIENT_NOT_LOADED(value: Double): Self = StObject.set(x, "CLIENT_NOT_LOADED", value.asInstanceOf[js.Any])
    
    inline def setDRM_TYPE_UNMATCHED(value: Double): Self = StObject.set(x, "DRM_TYPE_UNMATCHED", value.asInstanceOf[js.Any])
    
    inline def setINVALID_KEY_FORMAT(value: Double): Self = StObject.set(x, "INVALID_KEY_FORMAT", value.asInstanceOf[js.Any])
    
    inline def setINVALID_PARAMS(value: Double): Self = StObject.set(x, "INVALID_PARAMS", value.asInstanceOf[js.Any])
    
    inline def setINVALID_TIME_INFO(value: Double): Self = StObject.set(x, "INVALID_TIME_INFO", value.asInstanceOf[js.Any])
    
    inline def setKEY_NOT_FOUND(value: Double): Self = StObject.set(x, "KEY_NOT_FOUND", value.asInstanceOf[js.Any])
    
    inline def setNOT_ERROR(value: Double): Self = StObject.set(x, "NOT_ERROR", value.asInstanceOf[js.Any])
    
    inline def setUNKNOWN_ERROR(value: Double): Self = StObject.set(x, "UNKNOWN_ERROR", value.asInstanceOf[js.Any])
    
    inline def setUNSUPPORTED_DRM_TYPE(value: Double): Self = StObject.set(x, "UNSUPPORTED_DRM_TYPE", value.asInstanceOf[js.Any])
    
    inline def setVENDOR_ERROR(value: Double): Self = StObject.set(x, "VENDOR_ERROR", value.asInstanceOf[js.Any])
    
    inline def setWRONG_CLIENT_ID(value: Double): Self = StObject.set(x, "WRONG_CLIENT_ID", value.asInstanceOf[js.Any])
  }
}
