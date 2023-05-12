package typings.tufJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<tuf-js.tuf-js/dist/config.Config> */
  trait PartialConfig extends StObject {
    
    var fetchRetries: js.UndefOr[Double] = js.undefined
    
    var fetchTimeout: js.UndefOr[Double] = js.undefined
    
    var maxDelegations: js.UndefOr[Double] = js.undefined
    
    var maxRootRotations: js.UndefOr[Double] = js.undefined
    
    var prefixTargetsWithHash: js.UndefOr[Boolean] = js.undefined
    
    var rootMaxLength: js.UndefOr[Double] = js.undefined
    
    var snapshotMaxLength: js.UndefOr[Double] = js.undefined
    
    var targetsMaxLength: js.UndefOr[Double] = js.undefined
    
    var timestampMaxLength: js.UndefOr[Double] = js.undefined
  }
  object PartialConfig {
    
    inline def apply(): PartialConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialConfig] (val x: Self) extends AnyVal {
      
      inline def setFetchRetries(value: Double): Self = StObject.set(x, "fetchRetries", value.asInstanceOf[js.Any])
      
      inline def setFetchRetriesUndefined: Self = StObject.set(x, "fetchRetries", js.undefined)
      
      inline def setFetchTimeout(value: Double): Self = StObject.set(x, "fetchTimeout", value.asInstanceOf[js.Any])
      
      inline def setFetchTimeoutUndefined: Self = StObject.set(x, "fetchTimeout", js.undefined)
      
      inline def setMaxDelegations(value: Double): Self = StObject.set(x, "maxDelegations", value.asInstanceOf[js.Any])
      
      inline def setMaxDelegationsUndefined: Self = StObject.set(x, "maxDelegations", js.undefined)
      
      inline def setMaxRootRotations(value: Double): Self = StObject.set(x, "maxRootRotations", value.asInstanceOf[js.Any])
      
      inline def setMaxRootRotationsUndefined: Self = StObject.set(x, "maxRootRotations", js.undefined)
      
      inline def setPrefixTargetsWithHash(value: Boolean): Self = StObject.set(x, "prefixTargetsWithHash", value.asInstanceOf[js.Any])
      
      inline def setPrefixTargetsWithHashUndefined: Self = StObject.set(x, "prefixTargetsWithHash", js.undefined)
      
      inline def setRootMaxLength(value: Double): Self = StObject.set(x, "rootMaxLength", value.asInstanceOf[js.Any])
      
      inline def setRootMaxLengthUndefined: Self = StObject.set(x, "rootMaxLength", js.undefined)
      
      inline def setSnapshotMaxLength(value: Double): Self = StObject.set(x, "snapshotMaxLength", value.asInstanceOf[js.Any])
      
      inline def setSnapshotMaxLengthUndefined: Self = StObject.set(x, "snapshotMaxLength", js.undefined)
      
      inline def setTargetsMaxLength(value: Double): Self = StObject.set(x, "targetsMaxLength", value.asInstanceOf[js.Any])
      
      inline def setTargetsMaxLengthUndefined: Self = StObject.set(x, "targetsMaxLength", js.undefined)
      
      inline def setTimestampMaxLength(value: Double): Self = StObject.set(x, "timestampMaxLength", value.asInstanceOf[js.Any])
      
      inline def setTimestampMaxLengthUndefined: Self = StObject.set(x, "timestampMaxLength", js.undefined)
    }
  }
}
