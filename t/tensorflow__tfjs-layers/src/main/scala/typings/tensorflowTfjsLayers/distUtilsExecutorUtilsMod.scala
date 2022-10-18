package typings.tensorflowTfjsLayers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsExecutorUtilsMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/utils/executor_utils", "LruCache")
  @js.native
  open class LruCache[T] () extends StObject {
    def this(maxEntries: Double) = this()
    
    /* private */ var cache: Any = js.native
    
    /**
      * Get the entry for the key and mark it as used recently.
      */
    def get(key: String): T = js.native
    
    /**
      * Get the MaxEntries of the cache.
      */
    def getMaxEntries(): Double = js.native
    
    /* private */ var maxEntries: Any = js.native
    
    /**
      * Put the entry into the cache. If the key already existed, mark the key as
      * used recently.
      */
    def put(key: String, value: T): Unit = js.native
    
    /**
      * Set the MaxEntries of the cache. If the maxEntries is decreased, reduce
      * entries in the cache.
      */
    def setMaxEntries(maxEntries: Double): Unit = js.native
  }
}
