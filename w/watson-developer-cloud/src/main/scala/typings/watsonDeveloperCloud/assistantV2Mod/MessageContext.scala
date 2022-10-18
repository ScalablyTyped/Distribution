package typings.watsonDeveloperCloud.assistantV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** MessageContext. */
trait MessageContext extends StObject {
  
  /** Information that is shared by all skills used by the Assistant. */
  var global: js.UndefOr[MessageContextGlobal] = js.undefined
  
  /** Information specific to particular skills used by the Assistant. **Note:** Currently, only a single property named `main skill` is supported. This object contains variables that apply to the dialog skill used by the assistant. */
  var skills: js.UndefOr[MessageContextSkills] = js.undefined
}
object MessageContext {
  
  inline def apply(): MessageContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageContext]
  }
  
  extension [Self <: MessageContext](x: Self) {
    
    inline def setGlobal(value: MessageContextGlobal): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
    
    inline def setSkills(value: MessageContextSkills): Self = StObject.set(x, "skills", value.asInstanceOf[js.Any])
    
    inline def setSkillsUndefined: Self = StObject.set(x, "skills", js.undefined)
  }
}
