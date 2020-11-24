package typings.vscode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Brackets extends js.Object {
  
  /**
    * This property is deprecated and will be **ignored** from
    * the editor.
    * @deprecated
    */
  var brackets: js.UndefOr[js.Any] = js.native
  
  /**
    * This property is deprecated and not fully supported anymore by
    * the editor (scope and lineStart are ignored).
    * Use the autoClosingPairs property in the language configuration file instead.
    * @deprecated
    */
  var docComment: js.UndefOr[Close] = js.native
}
object Brackets {
  
  @scala.inline
  def apply(): Brackets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Brackets]
  }
  
  @scala.inline
  implicit class BracketsOps[Self <: Brackets] (val x: Self) extends AnyVal {
    
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
    def setBrackets(value: js.Any): Self = this.set("brackets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrackets: Self = this.set("brackets", js.undefined)
    
    @scala.inline
    def setDocComment(value: Close): Self = this.set("docComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocComment: Self = this.set("docComment", js.undefined)
  }
}
