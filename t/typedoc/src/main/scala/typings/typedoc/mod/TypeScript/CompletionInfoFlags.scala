package typings.typedoc.mod.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.CompletionInfoFlags")
@js.native
object CompletionInfoFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.typescript.mod.CompletionInfoFlags & Double] = js.native
  
  /* 4 */ val IsContinuation: typings.typescript.mod.CompletionInfoFlags.IsContinuation & Double = js.native
  
  /* 2 */ val IsImportStatementCompletion: typings.typescript.mod.CompletionInfoFlags.IsImportStatementCompletion & Double = js.native
  
  /* 1 */ val MayIncludeAutoImports: typings.typescript.mod.CompletionInfoFlags.MayIncludeAutoImports & Double = js.native
  
  /* 32 */ val MayIncludeMethodSnippets: typings.typescript.mod.CompletionInfoFlags.MayIncludeMethodSnippets & Double = js.native
  
  /* 0 */ val None: typings.typescript.mod.CompletionInfoFlags.None & Double = js.native
  
  /* 8 */ val ResolvedModuleSpecifiers: typings.typescript.mod.CompletionInfoFlags.ResolvedModuleSpecifiers & Double = js.native
  
  /* 16 */ val ResolvedModuleSpecifiersBeyondLimit: typings.typescript.mod.CompletionInfoFlags.ResolvedModuleSpecifiersBeyondLimit & Double = js.native
}
