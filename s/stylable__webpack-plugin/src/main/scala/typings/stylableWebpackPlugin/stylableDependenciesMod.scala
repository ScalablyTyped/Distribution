package typings.stylableWebpackPlugin

import typings.stylableWebpackPlugin.anon.Exports
import typings.stylableWebpackPlugin.anon.ImportedNames
import typings.stylableWebpackPlugin.typesMod.StylableModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylableDependenciesMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ @JSImport("@stylable/webpack-plugin/cjs/stylable-dependencies", "StylableAssetDependency")
  @js.native
  class StylableAssetDependency protected () extends StObject {
    def this(request: String) = this()
    
    def `type`: String = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ @JSImport("@stylable/webpack-plugin/cjs/stylable-dependencies", "StylableExportsDependency")
  @js.native
  class StylableExportsDependency protected () extends StObject {
    def this(exports: js.Any) = this()
    
    /* private */ var exports: js.Any = js.native
    
    def getExports(): Exports = js.native
    
    def `type`: String = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ @JSImport("@stylable/webpack-plugin/cjs/stylable-dependencies", "StylableImportDependency")
  @js.native
  class StylableImportDependency protected () extends StObject {
    def this(request: String, hasDefaultImportNames: ImportDefinition) = this()
    
    var defaultImport: String = js.native
    
    def getReference(): ImportedNames | Null = js.native
    
    var module: StylableModule = js.native
    
    /* private */ var names: js.Any = js.native
    
    def `type`: String = js.native
    
    def updateHash(hash: js.Any): Unit = js.native
    
    /* private */ var weak: js.Any = js.native
  }
  /* static members */
  object StylableImportDependency {
    
    @JSImport("@stylable/webpack-plugin/cjs/stylable-dependencies", "StylableImportDependency")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createWeak(request: String, originModule: StylableModule, importDef: ImportDefinition): StylableImportDependency = (^.asInstanceOf[js.Dynamic].applyDynamic("createWeak")(request.asInstanceOf[js.Any], originModule.asInstanceOf[js.Any], importDef.asInstanceOf[js.Any])).asInstanceOf[StylableImportDependency]
  }
  
  trait ImportDefinition extends StObject {
    
    var defaultImport: String
    
    var names: js.Array[String]
  }
  object ImportDefinition {
    
    inline def apply(defaultImport: String, names: js.Array[String]): ImportDefinition = {
      val __obj = js.Dynamic.literal(defaultImport = defaultImport.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImportDefinition]
    }
    
    extension [Self <: ImportDefinition](x: Self) {
      
      inline def setDefaultImport(value: String): Self = StObject.set(x, "defaultImport", value.asInstanceOf[js.Any])
      
      inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value :_*))
    }
  }
}
