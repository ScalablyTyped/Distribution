package typings.typescriptServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditorOptions extends js.Object {
  
  var ConvertTabsToSpaces: Boolean = js.native
  
  var IndentSize: Double = js.native
  
  var NewLineCharacter: String = js.native
  
  var TabSize: Double = js.native
}
object EditorOptions {
  
  @scala.inline
  def apply(ConvertTabsToSpaces: Boolean, IndentSize: Double, NewLineCharacter: String, TabSize: Double): EditorOptions = {
    val __obj = js.Dynamic.literal(ConvertTabsToSpaces = ConvertTabsToSpaces.asInstanceOf[js.Any], IndentSize = IndentSize.asInstanceOf[js.Any], NewLineCharacter = NewLineCharacter.asInstanceOf[js.Any], TabSize = TabSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorOptions]
  }
  
  @scala.inline
  implicit class EditorOptionsOps[Self <: EditorOptions] (val x: Self) extends AnyVal {
    
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
    def setConvertTabsToSpaces(value: Boolean): Self = this.set("ConvertTabsToSpaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentSize(value: Double): Self = this.set("IndentSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewLineCharacter(value: String): Self = this.set("NewLineCharacter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabSize(value: Double): Self = this.set("TabSize", value.asInstanceOf[js.Any])
  }
}
