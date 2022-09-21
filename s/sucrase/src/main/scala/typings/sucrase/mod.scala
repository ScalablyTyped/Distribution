package typings.sucrase

import typings.sucrase.cjsimportprocessorMod.default
import typings.sucrase.computeSourceMapMod.RawSourceMap
import typings.sucrase.helperManagerMod.HelperManager
import typings.sucrase.optionsMod.Transform
import typings.sucrase.stateMod.Scope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sucrase", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFormattedTokens(code: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormattedTokens")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getVersion(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getVersion")().asInstanceOf[String]
  
  inline def transform(code: String, options: Options): TransformResult = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TransformResult]
  
  type Options = typings.sucrase.optionsMod.Options
  
  type SourceMapOptions = typings.sucrase.optionsMod.SourceMapOptions
  
  trait SucraseContext extends StObject {
    
    var helperManager: HelperManager
    
    var importProcessor: default | Null
    
    var nameManager: typings.sucrase.nameManagerMod.default
    
    var scopes: js.Array[Scope]
    
    var tokenProcessor: typings.sucrase.tokenProcessorMod.default
  }
  object SucraseContext {
    
    inline def apply(
      helperManager: HelperManager,
      nameManager: typings.sucrase.nameManagerMod.default,
      scopes: js.Array[Scope],
      tokenProcessor: typings.sucrase.tokenProcessorMod.default
    ): SucraseContext = {
      val __obj = js.Dynamic.literal(helperManager = helperManager.asInstanceOf[js.Any], nameManager = nameManager.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], tokenProcessor = tokenProcessor.asInstanceOf[js.Any], importProcessor = null)
      __obj.asInstanceOf[SucraseContext]
    }
    
    extension [Self <: SucraseContext](x: Self) {
      
      inline def setHelperManager(value: HelperManager): Self = StObject.set(x, "helperManager", value.asInstanceOf[js.Any])
      
      inline def setImportProcessor(value: default): Self = StObject.set(x, "importProcessor", value.asInstanceOf[js.Any])
      
      inline def setImportProcessorNull: Self = StObject.set(x, "importProcessor", null)
      
      inline def setNameManager(value: typings.sucrase.nameManagerMod.default): Self = StObject.set(x, "nameManager", value.asInstanceOf[js.Any])
      
      inline def setScopes(value: js.Array[Scope]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setScopesVarargs(value: Scope*): Self = StObject.set(x, "scopes", js.Array(value*))
      
      inline def setTokenProcessor(value: typings.sucrase.tokenProcessorMod.default): Self = StObject.set(x, "tokenProcessor", value.asInstanceOf[js.Any])
    }
  }
  
  trait TransformResult extends StObject {
    
    var code: String
    
    var sourceMap: js.UndefOr[RawSourceMap] = js.undefined
  }
  object TransformResult {
    
    inline def apply(code: String): TransformResult = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransformResult]
    }
    
    extension [Self <: TransformResult](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setSourceMap(value: RawSourceMap): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
    }
  }
  
  type Transform_ = Transform
}
