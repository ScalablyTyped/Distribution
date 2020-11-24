package typings.vscode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultLanguageValue[T] extends js.Object {
  
  var defaultLanguageValue: js.UndefOr[T] = js.native
  
  var defaultValue: js.UndefOr[T] = js.native
  
  var globalLanguageValue: js.UndefOr[T] = js.native
  
  var globalValue: js.UndefOr[T] = js.native
  
  var key: String = js.native
  
  var languageIds: js.UndefOr[js.Array[String]] = js.native
  
  var workspaceFolderLanguageValue: js.UndefOr[T] = js.native
  
  var workspaceFolderValue: js.UndefOr[T] = js.native
  
  var workspaceLanguageValue: js.UndefOr[T] = js.native
  
  var workspaceValue: js.UndefOr[T] = js.native
}
object DefaultLanguageValue {
  
  @scala.inline
  def apply[T](key: String): DefaultLanguageValue[T] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultLanguageValue[T]]
  }
  
  @scala.inline
  implicit class DefaultLanguageValueOps[Self <: DefaultLanguageValue[_], T] (val x: Self with DefaultLanguageValue[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultLanguageValue(value: T): Self = this.set("defaultLanguageValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultLanguageValue: Self = this.set("defaultLanguageValue", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: T): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setGlobalLanguageValue(value: T): Self = this.set("globalLanguageValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalLanguageValue: Self = this.set("globalLanguageValue", js.undefined)
    
    @scala.inline
    def setGlobalValue(value: T): Self = this.set("globalValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalValue: Self = this.set("globalValue", js.undefined)
    
    @scala.inline
    def setLanguageIdsVarargs(value: String*): Self = this.set("languageIds", js.Array(value :_*))
    
    @scala.inline
    def setLanguageIds(value: js.Array[String]): Self = this.set("languageIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageIds: Self = this.set("languageIds", js.undefined)
    
    @scala.inline
    def setWorkspaceFolderLanguageValue(value: T): Self = this.set("workspaceFolderLanguageValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkspaceFolderLanguageValue: Self = this.set("workspaceFolderLanguageValue", js.undefined)
    
    @scala.inline
    def setWorkspaceFolderValue(value: T): Self = this.set("workspaceFolderValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkspaceFolderValue: Self = this.set("workspaceFolderValue", js.undefined)
    
    @scala.inline
    def setWorkspaceLanguageValue(value: T): Self = this.set("workspaceLanguageValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkspaceLanguageValue: Self = this.set("workspaceLanguageValue", js.undefined)
    
    @scala.inline
    def setWorkspaceValue(value: T): Self = this.set("workspaceValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkspaceValue: Self = this.set("workspaceValue", js.undefined)
  }
}
