package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CompletionInfoFlags extends StObject
@JSImport("typescript", "CompletionInfoFlags")
@js.native
object CompletionInfoFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CompletionInfoFlags & Double] = js.native
  
  @js.native
  sealed trait IsContinuation
    extends StObject
       with CompletionInfoFlags
  /* 4 */ val IsContinuation: typings.typescript.mod.CompletionInfoFlags.IsContinuation & Double = js.native
  
  @js.native
  sealed trait IsImportStatementCompletion
    extends StObject
       with CompletionInfoFlags
  /* 2 */ val IsImportStatementCompletion: typings.typescript.mod.CompletionInfoFlags.IsImportStatementCompletion & Double = js.native
  
  @js.native
  sealed trait MayIncludeAutoImports
    extends StObject
       with CompletionInfoFlags
  /* 1 */ val MayIncludeAutoImports: typings.typescript.mod.CompletionInfoFlags.MayIncludeAutoImports & Double = js.native
  
  @js.native
  sealed trait MayIncludeMethodSnippets
    extends StObject
       with CompletionInfoFlags
  /* 32 */ val MayIncludeMethodSnippets: typings.typescript.mod.CompletionInfoFlags.MayIncludeMethodSnippets & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with CompletionInfoFlags
  /* 0 */ val None: typings.typescript.mod.CompletionInfoFlags.None & Double = js.native
  
  @js.native
  sealed trait ResolvedModuleSpecifiers
    extends StObject
       with CompletionInfoFlags
  /* 8 */ val ResolvedModuleSpecifiers: typings.typescript.mod.CompletionInfoFlags.ResolvedModuleSpecifiers & Double = js.native
  
  @js.native
  sealed trait ResolvedModuleSpecifiersBeyondLimit
    extends StObject
       with CompletionInfoFlags
  /* 16 */ val ResolvedModuleSpecifiersBeyondLimit: typings.typescript.mod.CompletionInfoFlags.ResolvedModuleSpecifiersBeyondLimit & Double = js.native
}
