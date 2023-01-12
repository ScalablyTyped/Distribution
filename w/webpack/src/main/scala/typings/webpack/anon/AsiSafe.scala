package typings.webpack.anon

import typings.std.Set
import typings.webpack.mod.InitFragment
import typings.webpack.mod.ModuleGraph
import typings.webpack.mod.RuntimeSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsiSafe extends StObject {
  
  /**
  		 * true, if location is safe for ASI, a bracket can be emitted
  		 */
  var asiSafe: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * when false, call context will not be preserved
  		 */
  var callContext: Boolean
  
  /**
  		 * when true and accessing the default exports, interop code will be generated
  		 */
  var defaultInterop: Boolean
  
  /**
  		 * the export name
  		 */
  var exportName: String | js.Array[String]
  
  /**
  		 * the identifier name of the import variable
  		 */
  var importVar: String
  
  /**
  		 * init fragments will be added here
  		 */
  var initFragments: js.Array[InitFragment[Any]]
  
  /**
  		 * true, if expression will be called
  		 */
  var isCall: Boolean
  
  /**
  		 * the module
  		 */
  var module: typings.webpack.mod.Module
  
  /**
  		 * the module graph
  		 */
  var moduleGraph: ModuleGraph
  
  /**
  		 * the origin module
  		 */
  var originModule: typings.webpack.mod.Module
  
  /**
  		 * the request
  		 */
  var request: String
  
  /**
  		 * runtime for which this code will be generated
  		 */
  var runtime: RuntimeSpec
  
  /**
  		 * if set, will be filled with runtime requirements
  		 */
  var runtimeRequirements: Set[String]
}
object AsiSafe {
  
  inline def apply(
    callContext: Boolean,
    defaultInterop: Boolean,
    exportName: String | js.Array[String],
    importVar: String,
    initFragments: js.Array[InitFragment[Any]],
    isCall: Boolean,
    module: typings.webpack.mod.Module,
    moduleGraph: ModuleGraph,
    originModule: typings.webpack.mod.Module,
    request: String,
    runtimeRequirements: Set[String]
  ): AsiSafe = {
    val __obj = js.Dynamic.literal(callContext = callContext.asInstanceOf[js.Any], defaultInterop = defaultInterop.asInstanceOf[js.Any], exportName = exportName.asInstanceOf[js.Any], importVar = importVar.asInstanceOf[js.Any], initFragments = initFragments.asInstanceOf[js.Any], isCall = isCall.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], moduleGraph = moduleGraph.asInstanceOf[js.Any], originModule = originModule.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], runtimeRequirements = runtimeRequirements.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsiSafe]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AsiSafe] (val x: Self) extends AnyVal {
    
    inline def setAsiSafe(value: Boolean): Self = StObject.set(x, "asiSafe", value.asInstanceOf[js.Any])
    
    inline def setAsiSafeUndefined: Self = StObject.set(x, "asiSafe", js.undefined)
    
    inline def setCallContext(value: Boolean): Self = StObject.set(x, "callContext", value.asInstanceOf[js.Any])
    
    inline def setDefaultInterop(value: Boolean): Self = StObject.set(x, "defaultInterop", value.asInstanceOf[js.Any])
    
    inline def setExportName(value: String | js.Array[String]): Self = StObject.set(x, "exportName", value.asInstanceOf[js.Any])
    
    inline def setExportNameVarargs(value: String*): Self = StObject.set(x, "exportName", js.Array(value*))
    
    inline def setImportVar(value: String): Self = StObject.set(x, "importVar", value.asInstanceOf[js.Any])
    
    inline def setInitFragments(value: js.Array[InitFragment[Any]]): Self = StObject.set(x, "initFragments", value.asInstanceOf[js.Any])
    
    inline def setInitFragmentsVarargs(value: InitFragment[Any]*): Self = StObject.set(x, "initFragments", js.Array(value*))
    
    inline def setIsCall(value: Boolean): Self = StObject.set(x, "isCall", value.asInstanceOf[js.Any])
    
    inline def setModule(value: typings.webpack.mod.Module): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setModuleGraph(value: ModuleGraph): Self = StObject.set(x, "moduleGraph", value.asInstanceOf[js.Any])
    
    inline def setOriginModule(value: typings.webpack.mod.Module): Self = StObject.set(x, "originModule", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: String): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRuntime(value: RuntimeSpec): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeRequirements(value: Set[String]): Self = StObject.set(x, "runtimeRequirements", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
  }
}
