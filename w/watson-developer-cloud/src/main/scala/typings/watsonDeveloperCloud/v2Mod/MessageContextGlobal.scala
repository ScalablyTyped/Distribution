package typings.watsonDeveloperCloud.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Information that is shared by all skills used by the Assistant. */
@js.native
trait MessageContextGlobal extends StObject {
  
  /** Built-in system properties that apply to all skills used by the assistant. */
  var system: js.UndefOr[MessageContextGlobalSystem] = js.native
}
object MessageContextGlobal {
  
  @scala.inline
  def apply(): MessageContextGlobal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageContextGlobal]
  }
  
  @scala.inline
  implicit class MessageContextGlobalMutableBuilder[Self <: MessageContextGlobal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSystem(value: MessageContextGlobalSystem): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
  }
}
