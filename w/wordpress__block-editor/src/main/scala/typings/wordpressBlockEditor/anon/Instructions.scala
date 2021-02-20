package typings.wordpressBlockEditor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Instructions extends StObject {
  
  var instructions: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object Instructions {
  
  @scala.inline
  def apply(): Instructions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Instructions]
  }
  
  @scala.inline
  implicit class InstructionsMutableBuilder[Self <: Instructions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstructions(value: String): Self = StObject.set(x, "instructions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstructionsUndefined: Self = StObject.set(x, "instructions", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
