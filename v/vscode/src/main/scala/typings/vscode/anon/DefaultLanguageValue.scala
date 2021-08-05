package typings.vscode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultLanguageValue[T] extends StObject {
  
  var defaultLanguageValue: js.UndefOr[T] = js.undefined
  
  var defaultValue: js.UndefOr[T] = js.undefined
  
  var globalLanguageValue: js.UndefOr[T] = js.undefined
  
  var globalValue: js.UndefOr[T] = js.undefined
  
  var key: String
  
  var languageIds: js.UndefOr[js.Array[String]] = js.undefined
  
  var workspaceFolderLanguageValue: js.UndefOr[T] = js.undefined
  
  var workspaceFolderValue: js.UndefOr[T] = js.undefined
  
  var workspaceLanguageValue: js.UndefOr[T] = js.undefined
  
  var workspaceValue: js.UndefOr[T] = js.undefined
}
object DefaultLanguageValue {
  
  inline def apply[T](key: String): DefaultLanguageValue[T] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultLanguageValue[T]]
  }
  
  extension [Self <: DefaultLanguageValue[?], T](x: Self & DefaultLanguageValue[T]) {
    
    inline def setDefaultLanguageValue(value: T): Self = StObject.set(x, "defaultLanguageValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultLanguageValueUndefined: Self = StObject.set(x, "defaultLanguageValue", js.undefined)
    
    inline def setDefaultValue(value: T): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setGlobalLanguageValue(value: T): Self = StObject.set(x, "globalLanguageValue", value.asInstanceOf[js.Any])
    
    inline def setGlobalLanguageValueUndefined: Self = StObject.set(x, "globalLanguageValue", js.undefined)
    
    inline def setGlobalValue(value: T): Self = StObject.set(x, "globalValue", value.asInstanceOf[js.Any])
    
    inline def setGlobalValueUndefined: Self = StObject.set(x, "globalValue", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setLanguageIds(value: js.Array[String]): Self = StObject.set(x, "languageIds", value.asInstanceOf[js.Any])
    
    inline def setLanguageIdsUndefined: Self = StObject.set(x, "languageIds", js.undefined)
    
    inline def setLanguageIdsVarargs(value: String*): Self = StObject.set(x, "languageIds", js.Array(value :_*))
    
    inline def setWorkspaceFolderLanguageValue(value: T): Self = StObject.set(x, "workspaceFolderLanguageValue", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceFolderLanguageValueUndefined: Self = StObject.set(x, "workspaceFolderLanguageValue", js.undefined)
    
    inline def setWorkspaceFolderValue(value: T): Self = StObject.set(x, "workspaceFolderValue", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceFolderValueUndefined: Self = StObject.set(x, "workspaceFolderValue", js.undefined)
    
    inline def setWorkspaceLanguageValue(value: T): Self = StObject.set(x, "workspaceLanguageValue", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceLanguageValueUndefined: Self = StObject.set(x, "workspaceLanguageValue", js.undefined)
    
    inline def setWorkspaceValue(value: T): Self = StObject.set(x, "workspaceValue", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceValueUndefined: Self = StObject.set(x, "workspaceValue", js.undefined)
  }
}
