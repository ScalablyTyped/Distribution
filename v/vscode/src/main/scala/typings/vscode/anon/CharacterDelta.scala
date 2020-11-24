package typings.vscode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CharacterDelta extends js.Object {
  
  var characterDelta: js.UndefOr[Double] = js.native
  
  var lineDelta: js.UndefOr[Double] = js.native
}
object CharacterDelta {
  
  @scala.inline
  def apply(): CharacterDelta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CharacterDelta]
  }
  
  @scala.inline
  implicit class CharacterDeltaOps[Self <: CharacterDelta] (val x: Self) extends AnyVal {
    
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
    def setCharacterDelta(value: Double): Self = this.set("characterDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCharacterDelta: Self = this.set("characterDelta", js.undefined)
    
    @scala.inline
    def setLineDelta(value: Double): Self = this.set("lineDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineDelta: Self = this.set("lineDelta", js.undefined)
  }
}
