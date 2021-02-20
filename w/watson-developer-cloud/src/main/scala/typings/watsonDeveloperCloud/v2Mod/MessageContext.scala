package typings.watsonDeveloperCloud.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** MessageContext. */
@js.native
trait MessageContext extends StObject {
  
  /** Information that is shared by all skills used by the Assistant. */
  var global: js.UndefOr[MessageContextGlobal] = js.native
  
  /** Information specific to particular skills used by the Assistant. **Note:** Currently, only a single property named `main skill` is supported. This object contains variables that apply to the dialog skill used by the assistant. */
  var skills: js.UndefOr[MessageContextSkills] = js.native
}
object MessageContext {
  
  @scala.inline
  def apply(): MessageContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageContext]
  }
  
  @scala.inline
  implicit class MessageContextMutableBuilder[Self <: MessageContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlobal(value: MessageContextGlobal): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
    
    @scala.inline
    def setSkills(value: MessageContextSkills): Self = StObject.set(x, "skills", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkillsUndefined: Self = StObject.set(x, "skills", js.undefined)
  }
}
