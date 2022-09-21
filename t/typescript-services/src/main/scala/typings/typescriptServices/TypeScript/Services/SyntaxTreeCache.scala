package typings.typescriptServices.TypeScript.Services

import typings.typescriptServices.TypeScript.SyntaxTree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyntaxTreeCache extends StObject {
  
  /* private */ var _currentFileName: Any
  
  /* private */ var _currentFileScriptSnapshot: Any
  
  /* private */ var _currentFileSyntaxTree: Any
  
  /* private */ var _currentFileVersion: Any
  
  /* private */ var _host: Any
  
  /* private */ var _hostCache: Any
  
  /* private */ def createSyntaxTree(fileName: Any, scriptSnapshot: Any): Any
  
  /* private */ def ensureInvariants(
    fileName: Any,
    editRange: Any,
    incrementalTree: Any,
    oldScriptSnapshot: Any,
    newScriptSnapshot: Any
  ): Any
  
  def getCurrentFileSyntaxTree(fileName: String): SyntaxTree
  
  /* private */ def updateSyntaxTree(fileName: Any, scriptSnapshot: Any, previousSyntaxTree: Any, previousFileVersion: Any): Any
}
object SyntaxTreeCache {
  
  inline def apply(
    _currentFileName: Any,
    _currentFileScriptSnapshot: Any,
    _currentFileSyntaxTree: Any,
    _currentFileVersion: Any,
    _host: Any,
    _hostCache: Any,
    createSyntaxTree: (Any, Any) => Any,
    ensureInvariants: (Any, Any, Any, Any, Any) => Any,
    getCurrentFileSyntaxTree: String => SyntaxTree,
    updateSyntaxTree: (Any, Any, Any, Any) => Any
  ): SyntaxTreeCache = {
    val __obj = js.Dynamic.literal(_currentFileName = _currentFileName.asInstanceOf[js.Any], _currentFileScriptSnapshot = _currentFileScriptSnapshot.asInstanceOf[js.Any], _currentFileSyntaxTree = _currentFileSyntaxTree.asInstanceOf[js.Any], _currentFileVersion = _currentFileVersion.asInstanceOf[js.Any], _host = _host.asInstanceOf[js.Any], _hostCache = _hostCache.asInstanceOf[js.Any], createSyntaxTree = js.Any.fromFunction2(createSyntaxTree), ensureInvariants = js.Any.fromFunction5(ensureInvariants), getCurrentFileSyntaxTree = js.Any.fromFunction1(getCurrentFileSyntaxTree), updateSyntaxTree = js.Any.fromFunction4(updateSyntaxTree))
    __obj.asInstanceOf[SyntaxTreeCache]
  }
  
  extension [Self <: SyntaxTreeCache](x: Self) {
    
    inline def setCreateSyntaxTree(value: (Any, Any) => Any): Self = StObject.set(x, "createSyntaxTree", js.Any.fromFunction2(value))
    
    inline def setEnsureInvariants(value: (Any, Any, Any, Any, Any) => Any): Self = StObject.set(x, "ensureInvariants", js.Any.fromFunction5(value))
    
    inline def setGetCurrentFileSyntaxTree(value: String => SyntaxTree): Self = StObject.set(x, "getCurrentFileSyntaxTree", js.Any.fromFunction1(value))
    
    inline def setUpdateSyntaxTree(value: (Any, Any, Any, Any) => Any): Self = StObject.set(x, "updateSyntaxTree", js.Any.fromFunction4(value))
    
    inline def set_currentFileName(value: Any): Self = StObject.set(x, "_currentFileName", value.asInstanceOf[js.Any])
    
    inline def set_currentFileScriptSnapshot(value: Any): Self = StObject.set(x, "_currentFileScriptSnapshot", value.asInstanceOf[js.Any])
    
    inline def set_currentFileSyntaxTree(value: Any): Self = StObject.set(x, "_currentFileSyntaxTree", value.asInstanceOf[js.Any])
    
    inline def set_currentFileVersion(value: Any): Self = StObject.set(x, "_currentFileVersion", value.asInstanceOf[js.Any])
    
    inline def set_host(value: Any): Self = StObject.set(x, "_host", value.asInstanceOf[js.Any])
    
    inline def set_hostCache(value: Any): Self = StObject.set(x, "_hostCache", value.asInstanceOf[js.Any])
  }
}
