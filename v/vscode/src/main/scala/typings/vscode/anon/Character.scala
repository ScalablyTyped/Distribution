package typings.vscode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Character extends js.Object {
  
  var character: js.UndefOr[Double] = js.native
  
  var line: js.UndefOr[Double] = js.native
}
object Character {
  
  @scala.inline
  def apply(): Character = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Character]
  }
  
  @scala.inline
  implicit class CharacterOps[Self <: Character] (val x: Self) extends AnyVal {
    
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
    def setCharacter(value: Double): Self = this.set("character", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCharacter: Self = this.set("character", js.undefined)
    
    @scala.inline
    def setLine(value: Double): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
  }
}
