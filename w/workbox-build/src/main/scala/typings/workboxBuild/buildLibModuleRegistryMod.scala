package typings.workboxBuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLibModuleRegistryMod {
  
  @JSImport("workbox-build/build/lib/module-registry", "ModuleRegistry")
  @js.native
  /**
    * @private
    */
  open class ModuleRegistry () extends StObject {
    
    /* private */ val _modulesUsed: Any = js.native
    
    /**
      * @return {Array<string>} A list of all of the import statements that are
      * needed for the modules being used.
      * @private
      */
    def getImportStatements(): js.Array[String] = js.native
    
    /**
      * @param {string} pkg The workbox package that the module belongs to.
      * @param {string} moduleName The name of the module to import.
      * @return {string} The local variable name that corresponds to that module.
      * @private
      */
    def getLocalName(pkg: String, moduleName: String): String = js.native
    
    /**
      * @param {string} pkg The workbox package that the module belongs to.
      * @param {string} moduleName The name of the module to import.
      * @return {string} The local variable name that corresponds to that module.
      * @private
      */
    def use(pkg: String, moduleName: String): String = js.native
  }
}
