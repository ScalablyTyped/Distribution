package typings.stylableCore.anon

import typings.stylableCore.cachedProcessFileMod.FileProcessor
import typings.stylableCore.diagnosticsMod.Diagnostics
import typings.stylableCore.stylableProcessorMod.StylableMeta
import typings.stylableCore.stylableTransformerMod.EnvMode
import typings.stylableCore.stylableTransformerMod.StylableResults
import typings.stylableCore.stylableTransformerMod.StylableTransformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@stylable/core.@stylable/core/cjs/stylable-transformer.TransformerOptions> */
trait PartialTransformerOptions extends StObject {
  
  var delimiter: js.UndefOr[String] = js.undefined
  
  var diagnostics: js.UndefOr[Diagnostics] = js.undefined
  
  var fileProcessor: js.UndefOr[FileProcessor[StylableMeta]] = js.undefined
  
  var keepValues: js.UndefOr[Boolean] = js.undefined
  
  var mode: js.UndefOr[EnvMode] = js.undefined
  
  var postProcessor: js.UndefOr[typings.stylableCore.stylableTransformerMod.postProcessor[js.Object]] = js.undefined
  
  var replaceValueHook: js.UndefOr[typings.stylableCore.stylableTransformerMod.replaceValueHook] = js.undefined
  
  var requireModule: js.UndefOr[js.Function1[/* modulePath */ String, js.Any]] = js.undefined
}
object PartialTransformerOptions {
  
  inline def apply(): PartialTransformerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTransformerOptions]
  }
  
  extension [Self <: PartialTransformerOptions](x: Self) {
    
    inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    
    inline def setDiagnostics(value: Diagnostics): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticsUndefined: Self = StObject.set(x, "diagnostics", js.undefined)
    
    inline def setFileProcessor(value: FileProcessor[StylableMeta]): Self = StObject.set(x, "fileProcessor", value.asInstanceOf[js.Any])
    
    inline def setFileProcessorUndefined: Self = StObject.set(x, "fileProcessor", js.undefined)
    
    inline def setKeepValues(value: Boolean): Self = StObject.set(x, "keepValues", value.asInstanceOf[js.Any])
    
    inline def setKeepValuesUndefined: Self = StObject.set(x, "keepValues", js.undefined)
    
    inline def setMode(value: EnvMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setPostProcessor(
      value: (/* stylableResults */ StylableResults, /* transformer */ StylableTransformer) => StylableResults & js.Object
    ): Self = StObject.set(x, "postProcessor", js.Any.fromFunction2(value))
    
    inline def setPostProcessorUndefined: Self = StObject.set(x, "postProcessor", js.undefined)
    
    inline def setReplaceValueHook(
      value: (/* value */ String, /* name */ String | Args, /* isLocal */ Boolean, /* passedThrough */ js.Array[String]) => String
    ): Self = StObject.set(x, "replaceValueHook", js.Any.fromFunction4(value))
    
    inline def setReplaceValueHookUndefined: Self = StObject.set(x, "replaceValueHook", js.undefined)
    
    inline def setRequireModule(value: /* modulePath */ String => js.Any): Self = StObject.set(x, "requireModule", js.Any.fromFunction1(value))
    
    inline def setRequireModuleUndefined: Self = StObject.set(x, "requireModule", js.undefined)
  }
}
