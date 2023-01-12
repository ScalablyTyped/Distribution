package typings.webpack.mod

import org.scalablytyped.runtime.StringDictionary
import typings.webpack.webpackBooleans.`false`
import typings.webpack.webpackStrings.brotli
import typings.webpack.webpackStrings.filesystem
import typings.webpack.webpackStrings.gzip
import typings.webpack.webpackStrings.pack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options object for persistent file-based caching.
  */
trait FileCacheOptions
  extends StObject
     with CacheOptionsNormalized {
  
  /**
  	 * Allows to collect unused memory allocated during deserialization. This requires copying data into smaller buffers and has a performance cost.
  	 */
  var allowCollectingMemory: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Dependencies the build depends on (in multiple categories, default categories: 'defaultWebpack').
  	 */
  var buildDependencies: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
  
  /**
  	 * Base directory for the cache (defaults to node_modules/.cache/webpack).
  	 */
  var cacheDirectory: js.UndefOr[String] = js.undefined
  
  /**
  	 * Locations for the cache (defaults to cacheDirectory / name).
  	 */
  var cacheLocation: js.UndefOr[String] = js.undefined
  
  /**
  	 * Compression type used for the cache files.
  	 */
  var compression: js.UndefOr[`false` | gzip | brotli] = js.undefined
  
  /**
  	 * Algorithm used for generation the hash (see node.js crypto package).
  	 */
  var hashAlgorithm: js.UndefOr[String] = js.undefined
  
  /**
  	 * Time in ms after which idle period the cache storing should happen.
  	 */
  var idleTimeout: js.UndefOr[Double] = js.undefined
  
  /**
  	 * Time in ms after which idle period the cache storing should happen when larger changes has been detected (cumulative build time > 2 x avg cache store time).
  	 */
  var idleTimeoutAfterLargeChanges: js.UndefOr[Double] = js.undefined
  
  /**
  	 * Time in ms after which idle period the initial cache storing should happen.
  	 */
  var idleTimeoutForInitialStore: js.UndefOr[Double] = js.undefined
  
  /**
  	 * List of paths that are managed by a package manager and contain a version or hash in its path so all files are immutable.
  	 */
  var immutablePaths: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
  
  /**
  	 * List of paths that are managed by a package manager and can be trusted to not be modified otherwise.
  	 */
  var managedPaths: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
  
  /**
  	 * Time for which unused cache entries stay in the filesystem cache at minimum (in milliseconds).
  	 */
  var maxAge: js.UndefOr[Double] = js.undefined
  
  /**
  	 * Number of generations unused cache entries stay in memory cache at minimum (0 = no memory cache used, 1 = may be removed after unused for a single compilation, ..., Infinity: kept forever). Cache entries will be deserialized from disk when removed from memory cache.
  	 */
  var maxMemoryGenerations: js.UndefOr[Double] = js.undefined
  
  /**
  	 * Additionally cache computation of modules that are unchanged and reference only unchanged modules in memory.
  	 */
  var memoryCacheUnaffected: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Name for the cache. Different names will lead to different coexisting caches.
  	 */
  var name: js.UndefOr[String] = js.undefined
  
  /**
  	 * Track and log detailed timing information for individual cache items.
  	 */
  var profile: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * When to store data to the filesystem. (pack: Store data when compiler is idle in a single file).
  	 */
  var store: js.UndefOr[pack] = js.undefined
  
  /**
  	 * Filesystem caching.
  	 */
  var `type`: filesystem
  
  /**
  	 * Version of the cache data. Different versions won't allow to reuse the cache and override existing content. Update the version when config changed in a way which doesn't allow to reuse cache. This will invalidate the cache.
  	 */
  var version: js.UndefOr[String] = js.undefined
}
object FileCacheOptions {
  
  inline def apply(): FileCacheOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("filesystem")
    __obj.asInstanceOf[FileCacheOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileCacheOptions] (val x: Self) extends AnyVal {
    
    inline def setAllowCollectingMemory(value: Boolean): Self = StObject.set(x, "allowCollectingMemory", value.asInstanceOf[js.Any])
    
    inline def setAllowCollectingMemoryUndefined: Self = StObject.set(x, "allowCollectingMemory", js.undefined)
    
    inline def setBuildDependencies(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "buildDependencies", value.asInstanceOf[js.Any])
    
    inline def setBuildDependenciesUndefined: Self = StObject.set(x, "buildDependencies", js.undefined)
    
    inline def setCacheDirectory(value: String): Self = StObject.set(x, "cacheDirectory", value.asInstanceOf[js.Any])
    
    inline def setCacheDirectoryUndefined: Self = StObject.set(x, "cacheDirectory", js.undefined)
    
    inline def setCacheLocation(value: String): Self = StObject.set(x, "cacheLocation", value.asInstanceOf[js.Any])
    
    inline def setCacheLocationUndefined: Self = StObject.set(x, "cacheLocation", js.undefined)
    
    inline def setCompression(value: `false` | gzip | brotli): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
    
    inline def setHashAlgorithm(value: String): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setHashAlgorithmUndefined: Self = StObject.set(x, "hashAlgorithm", js.undefined)
    
    inline def setIdleTimeout(value: Double): Self = StObject.set(x, "idleTimeout", value.asInstanceOf[js.Any])
    
    inline def setIdleTimeoutAfterLargeChanges(value: Double): Self = StObject.set(x, "idleTimeoutAfterLargeChanges", value.asInstanceOf[js.Any])
    
    inline def setIdleTimeoutAfterLargeChangesUndefined: Self = StObject.set(x, "idleTimeoutAfterLargeChanges", js.undefined)
    
    inline def setIdleTimeoutForInitialStore(value: Double): Self = StObject.set(x, "idleTimeoutForInitialStore", value.asInstanceOf[js.Any])
    
    inline def setIdleTimeoutForInitialStoreUndefined: Self = StObject.set(x, "idleTimeoutForInitialStore", js.undefined)
    
    inline def setIdleTimeoutUndefined: Self = StObject.set(x, "idleTimeout", js.undefined)
    
    inline def setImmutablePaths(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "immutablePaths", value.asInstanceOf[js.Any])
    
    inline def setImmutablePathsUndefined: Self = StObject.set(x, "immutablePaths", js.undefined)
    
    inline def setImmutablePathsVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "immutablePaths", js.Array(value*))
    
    inline def setManagedPaths(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "managedPaths", value.asInstanceOf[js.Any])
    
    inline def setManagedPathsUndefined: Self = StObject.set(x, "managedPaths", js.undefined)
    
    inline def setManagedPathsVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "managedPaths", js.Array(value*))
    
    inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    
    inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
    
    inline def setMaxMemoryGenerations(value: Double): Self = StObject.set(x, "maxMemoryGenerations", value.asInstanceOf[js.Any])
    
    inline def setMaxMemoryGenerationsUndefined: Self = StObject.set(x, "maxMemoryGenerations", js.undefined)
    
    inline def setMemoryCacheUnaffected(value: Boolean): Self = StObject.set(x, "memoryCacheUnaffected", value.asInstanceOf[js.Any])
    
    inline def setMemoryCacheUnaffectedUndefined: Self = StObject.set(x, "memoryCacheUnaffected", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProfile(value: Boolean): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setStore(value: pack): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    
    inline def setType(value: filesystem): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
