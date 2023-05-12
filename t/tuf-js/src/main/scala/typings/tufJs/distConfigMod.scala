package typings.tufJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConfigMod {
  
  object defaultConfig {
    
    @JSImport("tuf-js/dist/config", "defaultConfig")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tuf-js/dist/config", "defaultConfig.fetchRetries")
    @js.native
    def fetchRetries: Double = js.native
    inline def fetchRetries_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fetchRetries")(x.asInstanceOf[js.Any])
    
    @JSImport("tuf-js/dist/config", "defaultConfig.fetchTimeout")
    @js.native
    def fetchTimeout: Double = js.native
    inline def fetchTimeout_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fetchTimeout")(x.asInstanceOf[js.Any])
    
    @JSImport("tuf-js/dist/config", "defaultConfig.maxDelegations")
    @js.native
    def maxDelegations: Double = js.native
    inline def maxDelegations_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxDelegations")(x.asInstanceOf[js.Any])
    
    @JSImport("tuf-js/dist/config", "defaultConfig.maxRootRotations")
    @js.native
    def maxRootRotations: Double = js.native
    inline def maxRootRotations_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxRootRotations")(x.asInstanceOf[js.Any])
    
    @JSImport("tuf-js/dist/config", "defaultConfig.prefixTargetsWithHash")
    @js.native
    def prefixTargetsWithHash: Boolean = js.native
    inline def prefixTargetsWithHash_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixTargetsWithHash")(x.asInstanceOf[js.Any])
    
    @JSImport("tuf-js/dist/config", "defaultConfig.rootMaxLength")
    @js.native
    def rootMaxLength: Double = js.native
    inline def rootMaxLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rootMaxLength")(x.asInstanceOf[js.Any])
    
    @JSImport("tuf-js/dist/config", "defaultConfig.snapshotMaxLength")
    @js.native
    def snapshotMaxLength: Double = js.native
    inline def snapshotMaxLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("snapshotMaxLength")(x.asInstanceOf[js.Any])
    
    @JSImport("tuf-js/dist/config", "defaultConfig.targetsMaxLength")
    @js.native
    def targetsMaxLength: Double = js.native
    inline def targetsMaxLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("targetsMaxLength")(x.asInstanceOf[js.Any])
    
    @JSImport("tuf-js/dist/config", "defaultConfig.timestampMaxLength")
    @js.native
    def timestampMaxLength: Double = js.native
    inline def timestampMaxLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timestampMaxLength")(x.asInstanceOf[js.Any])
  }
  
  trait Config extends StObject {
    
    var fetchRetries: Double
    
    var fetchTimeout: Double
    
    var maxDelegations: Double
    
    var maxRootRotations: Double
    
    var prefixTargetsWithHash: Boolean
    
    var rootMaxLength: Double
    
    var snapshotMaxLength: Double
    
    var targetsMaxLength: Double
    
    var timestampMaxLength: Double
  }
  object Config {
    
    inline def apply(
      fetchRetries: Double,
      fetchTimeout: Double,
      maxDelegations: Double,
      maxRootRotations: Double,
      prefixTargetsWithHash: Boolean,
      rootMaxLength: Double,
      snapshotMaxLength: Double,
      targetsMaxLength: Double,
      timestampMaxLength: Double
    ): Config = {
      val __obj = js.Dynamic.literal(fetchRetries = fetchRetries.asInstanceOf[js.Any], fetchTimeout = fetchTimeout.asInstanceOf[js.Any], maxDelegations = maxDelegations.asInstanceOf[js.Any], maxRootRotations = maxRootRotations.asInstanceOf[js.Any], prefixTargetsWithHash = prefixTargetsWithHash.asInstanceOf[js.Any], rootMaxLength = rootMaxLength.asInstanceOf[js.Any], snapshotMaxLength = snapshotMaxLength.asInstanceOf[js.Any], targetsMaxLength = targetsMaxLength.asInstanceOf[js.Any], timestampMaxLength = timestampMaxLength.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      inline def setFetchRetries(value: Double): Self = StObject.set(x, "fetchRetries", value.asInstanceOf[js.Any])
      
      inline def setFetchTimeout(value: Double): Self = StObject.set(x, "fetchTimeout", value.asInstanceOf[js.Any])
      
      inline def setMaxDelegations(value: Double): Self = StObject.set(x, "maxDelegations", value.asInstanceOf[js.Any])
      
      inline def setMaxRootRotations(value: Double): Self = StObject.set(x, "maxRootRotations", value.asInstanceOf[js.Any])
      
      inline def setPrefixTargetsWithHash(value: Boolean): Self = StObject.set(x, "prefixTargetsWithHash", value.asInstanceOf[js.Any])
      
      inline def setRootMaxLength(value: Double): Self = StObject.set(x, "rootMaxLength", value.asInstanceOf[js.Any])
      
      inline def setSnapshotMaxLength(value: Double): Self = StObject.set(x, "snapshotMaxLength", value.asInstanceOf[js.Any])
      
      inline def setTargetsMaxLength(value: Double): Self = StObject.set(x, "targetsMaxLength", value.asInstanceOf[js.Any])
      
      inline def setTimestampMaxLength(value: Double): Self = StObject.set(x, "timestampMaxLength", value.asInstanceOf[js.Any])
    }
  }
}
