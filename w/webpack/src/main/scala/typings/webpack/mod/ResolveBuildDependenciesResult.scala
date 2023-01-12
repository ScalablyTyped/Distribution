package typings.webpack.mod

import typings.std.Map
import typings.std.Set
import typings.webpack.anon.Directories
import typings.webpack.webpackBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolveBuildDependenciesResult extends StObject {
  
  /**
  	 * list of directories
  	 */
  var directories: Set[String]
  
  /**
  	 * list of files
  	 */
  var files: Set[String]
  
  /**
  	 * list of missing entries
  	 */
  var missing: Set[String]
  
  /**
  	 * dependencies of the resolving
  	 */
  var resolveDependencies: Directories
  
  /**
  	 * stored resolve results
  	 */
  var resolveResults: Map[String, String | `false`]
}
object ResolveBuildDependenciesResult {
  
  inline def apply(
    directories: Set[String],
    files: Set[String],
    missing: Set[String],
    resolveDependencies: Directories,
    resolveResults: Map[String, String | `false`]
  ): ResolveBuildDependenciesResult = {
    val __obj = js.Dynamic.literal(directories = directories.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], missing = missing.asInstanceOf[js.Any], resolveDependencies = resolveDependencies.asInstanceOf[js.Any], resolveResults = resolveResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveBuildDependenciesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResolveBuildDependenciesResult] (val x: Self) extends AnyVal {
    
    inline def setDirectories(value: Set[String]): Self = StObject.set(x, "directories", value.asInstanceOf[js.Any])
    
    inline def setFiles(value: Set[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setMissing(value: Set[String]): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
    
    inline def setResolveDependencies(value: Directories): Self = StObject.set(x, "resolveDependencies", value.asInstanceOf[js.Any])
    
    inline def setResolveResults(value: Map[String, String | `false`]): Self = StObject.set(x, "resolveResults", value.asInstanceOf[js.Any])
  }
}
