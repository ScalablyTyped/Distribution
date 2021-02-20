package typings.vscode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Character extends StObject {
  
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
  implicit class CharacterMutableBuilder[Self <: Character] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharacter(value: Double): Self = StObject.set(x, "character", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharacterUndefined: Self = StObject.set(x, "character", js.undefined)
    
    @scala.inline
    def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
  }
}
