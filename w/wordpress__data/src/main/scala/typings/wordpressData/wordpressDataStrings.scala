package typings.wordpressData

import typings.wordpressData.buildTypesReduxStoreMetadataReducerMod.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wordpressDataStrings {
  
  @js.native
  sealed trait FAIL_RESOLUTION extends StObject
  inline def FAIL_RESOLUTION: FAIL_RESOLUTION = "FAIL_RESOLUTION".asInstanceOf[FAIL_RESOLUTION]
  
  @js.native
  sealed trait FAIL_RESOLUTIONS extends StObject
  inline def FAIL_RESOLUTIONS: FAIL_RESOLUTIONS = "FAIL_RESOLUTIONS".asInstanceOf[FAIL_RESOLUTIONS]
  
  @js.native
  sealed trait FINISH_RESOLUTION extends StObject
  inline def FINISH_RESOLUTION: FINISH_RESOLUTION = "FINISH_RESOLUTION".asInstanceOf[FINISH_RESOLUTION]
  
  @js.native
  sealed trait FINISH_RESOLUTIONS extends StObject
  inline def FINISH_RESOLUTIONS: FINISH_RESOLUTIONS = "FINISH_RESOLUTIONS".asInstanceOf[FINISH_RESOLUTIONS]
  
  @js.native
  sealed trait INVALIDATE_RESOLUTION extends StObject
  inline def INVALIDATE_RESOLUTION: INVALIDATE_RESOLUTION = "INVALIDATE_RESOLUTION".asInstanceOf[INVALIDATE_RESOLUTION]
  
  @js.native
  sealed trait INVALIDATE_RESOLUTION_FOR_STORE extends StObject
  inline def INVALIDATE_RESOLUTION_FOR_STORE: INVALIDATE_RESOLUTION_FOR_STORE = "INVALIDATE_RESOLUTION_FOR_STORE".asInstanceOf[INVALIDATE_RESOLUTION_FOR_STORE]
  
  @js.native
  sealed trait INVALIDATE_RESOLUTION_FOR_STORE_SELECTOR extends StObject
  inline def INVALIDATE_RESOLUTION_FOR_STORE_SELECTOR: INVALIDATE_RESOLUTION_FOR_STORE_SELECTOR = "INVALIDATE_RESOLUTION_FOR_STORE_SELECTOR".asInstanceOf[INVALIDATE_RESOLUTION_FOR_STORE_SELECTOR]
  
  @js.native
  sealed trait START_RESOLUTION extends StObject
  inline def START_RESOLUTION: START_RESOLUTION = "START_RESOLUTION".asInstanceOf[START_RESOLUTION]
  
  @js.native
  sealed trait START_RESOLUTIONS extends StObject
  inline def START_RESOLUTIONS: START_RESOLUTIONS = "START_RESOLUTIONS".asInstanceOf[START_RESOLUTIONS]
  
  @js.native
  sealed trait error
    extends StObject
       with Status
       with typings.wordpressData.buildTypesReduxStoreMetadataSelectorsMod.Status
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait finished
    extends StObject
       with Status
       with typings.wordpressData.buildTypesReduxStoreMetadataSelectorsMod.Status
  inline def finished: finished = "finished".asInstanceOf[finished]
  
  @js.native
  sealed trait resolving
    extends StObject
       with Status
       with typings.wordpressData.buildTypesReduxStoreMetadataSelectorsMod.Status
  inline def resolving: resolving = "resolving".asInstanceOf[resolving]
}
