package typings.webpack.mod

import typings.std.Map
import typings.std.ReadonlySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeGenerationResult extends StObject {
  
  /**
  	 * the resulting data for all source types
  	 */
  var data: js.UndefOr[Map[String, Any]] = js.undefined
  
  /**
  	 * a hash of the code generation result (will be automatically calculated from sources and runtimeRequirements if not provided)
  	 */
  var hash: js.UndefOr[String] = js.undefined
  
  /**
  	 * the runtime requirements
  	 */
  var runtimeRequirements: ReadonlySet[String]
  
  /**
  	 * the resulting sources for all source types
  	 */
  var sources: Map[String, Source]
}
object CodeGenerationResult {
  
  inline def apply(runtimeRequirements: ReadonlySet[String], sources: Map[String, Source]): CodeGenerationResult = {
    val __obj = js.Dynamic.literal(runtimeRequirements = runtimeRequirements.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeGenerationResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodeGenerationResult] (val x: Self) extends AnyVal {
    
    inline def setData(value: Map[String, Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setRuntimeRequirements(value: ReadonlySet[String]): Self = StObject.set(x, "runtimeRequirements", value.asInstanceOf[js.Any])
    
    inline def setSources(value: Map[String, Source]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
  }
}
