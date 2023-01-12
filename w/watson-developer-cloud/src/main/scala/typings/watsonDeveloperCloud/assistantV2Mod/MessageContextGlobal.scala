package typings.watsonDeveloperCloud.assistantV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Information that is shared by all skills used by the Assistant. */
trait MessageContextGlobal extends StObject {
  
  /** Built-in system properties that apply to all skills used by the assistant. */
  var system: js.UndefOr[MessageContextGlobalSystem] = js.undefined
}
object MessageContextGlobal {
  
  inline def apply(): MessageContextGlobal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageContextGlobal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageContextGlobal] (val x: Self) extends AnyVal {
    
    inline def setSystem(value: MessageContextGlobalSystem): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    inline def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
  }
}
