package typings.typescriptServices.mod.Services

import typings.typescriptServices.TypeScript.Services.ILanguageServiceHost
import typings.typescriptServices.TypeScript.SyntaxTree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Services.SyntaxTreeCache")
@js.native
class SyntaxTreeCache protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.Services.SyntaxTreeCache {
  def this(_host: ILanguageServiceHost) = this()
  
  /* CompleteClass */
  var _currentFileName: js.Any = js.native
  
  /* CompleteClass */
  var _currentFileScriptSnapshot: js.Any = js.native
  
  /* CompleteClass */
  var _currentFileSyntaxTree: js.Any = js.native
  
  /* CompleteClass */
  var _currentFileVersion: js.Any = js.native
  
  /* CompleteClass */
  var _host: js.Any = js.native
  
  /* CompleteClass */
  var _hostCache: js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def createSyntaxTree(fileName: js.Any, scriptSnapshot: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def ensureInvariants(
    fileName: js.Any,
    editRange: js.Any,
    incrementalTree: js.Any,
    oldScriptSnapshot: js.Any,
    newScriptSnapshot: js.Any
  ): js.Any = js.native
  
  /* CompleteClass */
  override def getCurrentFileSyntaxTree(fileName: String): SyntaxTree = js.native
  
  /* CompleteClass */
  /* private */ override def updateSyntaxTree(fileName: js.Any, scriptSnapshot: js.Any, previousSyntaxTree: js.Any, previousFileVersion: js.Any): js.Any = js.native
}
