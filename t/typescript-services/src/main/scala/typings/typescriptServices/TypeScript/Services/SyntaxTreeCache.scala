package typings.typescriptServices.TypeScript.Services

import typings.typescriptServices.TypeScript.SyntaxTree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyntaxTreeCache extends StObject {
  
  /* private */ var _currentFileName: js.Any
  
  /* private */ var _currentFileScriptSnapshot: js.Any
  
  /* private */ var _currentFileSyntaxTree: js.Any
  
  /* private */ var _currentFileVersion: js.Any
  
  /* private */ var _host: js.Any
  
  /* private */ var _hostCache: js.Any
  
  /* private */ def createSyntaxTree(fileName: js.Any, scriptSnapshot: js.Any): js.Any
  
  /* private */ def ensureInvariants(
    fileName: js.Any,
    editRange: js.Any,
    incrementalTree: js.Any,
    oldScriptSnapshot: js.Any,
    newScriptSnapshot: js.Any
  ): js.Any
  
  def getCurrentFileSyntaxTree(fileName: String): SyntaxTree
  
  /* private */ def updateSyntaxTree(fileName: js.Any, scriptSnapshot: js.Any, previousSyntaxTree: js.Any, previousFileVersion: js.Any): js.Any
}
object SyntaxTreeCache {
  
  inline def apply(
    _currentFileName: js.Any,
    _currentFileScriptSnapshot: js.Any,
    _currentFileSyntaxTree: js.Any,
    _currentFileVersion: js.Any,
    _host: js.Any,
    _hostCache: js.Any,
    createSyntaxTree: (js.Any, js.Any) => js.Any,
    ensureInvariants: (js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any,
    getCurrentFileSyntaxTree: String => SyntaxTree,
    updateSyntaxTree: (js.Any, js.Any, js.Any, js.Any) => js.Any
  ): SyntaxTreeCache = {
    val __obj = js.Dynamic.literal(_currentFileName = _currentFileName.asInstanceOf[js.Any], _currentFileScriptSnapshot = _currentFileScriptSnapshot.asInstanceOf[js.Any], _currentFileSyntaxTree = _currentFileSyntaxTree.asInstanceOf[js.Any], _currentFileVersion = _currentFileVersion.asInstanceOf[js.Any], _host = _host.asInstanceOf[js.Any], _hostCache = _hostCache.asInstanceOf[js.Any], createSyntaxTree = js.Any.fromFunction2(createSyntaxTree), ensureInvariants = js.Any.fromFunction5(ensureInvariants), getCurrentFileSyntaxTree = js.Any.fromFunction1(getCurrentFileSyntaxTree), updateSyntaxTree = js.Any.fromFunction4(updateSyntaxTree))
    __obj.asInstanceOf[SyntaxTreeCache]
  }
  
  extension [Self <: SyntaxTreeCache](x: Self) {
    
    inline def setCreateSyntaxTree(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "createSyntaxTree", js.Any.fromFunction2(value))
    
    inline def setEnsureInvariants(value: (js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "ensureInvariants", js.Any.fromFunction5(value))
    
    inline def setGetCurrentFileSyntaxTree(value: String => SyntaxTree): Self = StObject.set(x, "getCurrentFileSyntaxTree", js.Any.fromFunction1(value))
    
    inline def setUpdateSyntaxTree(value: (js.Any, js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "updateSyntaxTree", js.Any.fromFunction4(value))
    
    inline def set_currentFileName(value: js.Any): Self = StObject.set(x, "_currentFileName", value.asInstanceOf[js.Any])
    
    inline def set_currentFileScriptSnapshot(value: js.Any): Self = StObject.set(x, "_currentFileScriptSnapshot", value.asInstanceOf[js.Any])
    
    inline def set_currentFileSyntaxTree(value: js.Any): Self = StObject.set(x, "_currentFileSyntaxTree", value.asInstanceOf[js.Any])
    
    inline def set_currentFileVersion(value: js.Any): Self = StObject.set(x, "_currentFileVersion", value.asInstanceOf[js.Any])
    
    inline def set_host(value: js.Any): Self = StObject.set(x, "_host", value.asInstanceOf[js.Any])
    
    inline def set_hostCache(value: js.Any): Self = StObject.set(x, "_hostCache", value.asInstanceOf[js.Any])
  }
}
