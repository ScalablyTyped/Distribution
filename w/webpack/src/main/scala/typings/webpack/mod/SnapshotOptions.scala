package typings.webpack.mod

import typings.webpack.anon.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options affecting how file system snapshots are created and validated.
  */
trait SnapshotOptions extends StObject {
  
  /**
  	 * Options for snapshotting build dependencies to determine if the whole cache need to be invalidated.
  	 */
  var buildDependencies: js.UndefOr[Timestamp] = js.undefined
  
  /**
  	 * List of paths that are managed by a package manager and contain a version or hash in its path so all files are immutable.
  	 */
  var immutablePaths: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
  
  /**
  	 * List of paths that are managed by a package manager and can be trusted to not be modified otherwise.
  	 */
  var managedPaths: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
  
  /**
  	 * Options for snapshotting dependencies of modules to determine if they need to be built again.
  	 */
  var module: js.UndefOr[Timestamp] = js.undefined
  
  /**
  	 * Options for snapshotting dependencies of request resolving to determine if requests need to be re-resolved.
  	 */
  var resolve: js.UndefOr[Timestamp] = js.undefined
  
  /**
  	 * Options for snapshotting the resolving of build dependencies to determine if the build dependencies need to be re-resolved.
  	 */
  var resolveBuildDependencies: js.UndefOr[Timestamp] = js.undefined
}
object SnapshotOptions {
  
  inline def apply(): SnapshotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SnapshotOptions] (val x: Self) extends AnyVal {
    
    inline def setBuildDependencies(value: Timestamp): Self = StObject.set(x, "buildDependencies", value.asInstanceOf[js.Any])
    
    inline def setBuildDependenciesUndefined: Self = StObject.set(x, "buildDependencies", js.undefined)
    
    inline def setImmutablePaths(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "immutablePaths", value.asInstanceOf[js.Any])
    
    inline def setImmutablePathsUndefined: Self = StObject.set(x, "immutablePaths", js.undefined)
    
    inline def setImmutablePathsVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "immutablePaths", js.Array(value*))
    
    inline def setManagedPaths(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "managedPaths", value.asInstanceOf[js.Any])
    
    inline def setManagedPathsUndefined: Self = StObject.set(x, "managedPaths", js.undefined)
    
    inline def setManagedPathsVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "managedPaths", js.Array(value*))
    
    inline def setModule(value: Timestamp): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
    
    inline def setResolve(value: Timestamp): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
    
    inline def setResolveBuildDependencies(value: Timestamp): Self = StObject.set(x, "resolveBuildDependencies", value.asInstanceOf[js.Any])
    
    inline def setResolveBuildDependenciesUndefined: Self = StObject.set(x, "resolveBuildDependencies", js.undefined)
    
    inline def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
  }
}
