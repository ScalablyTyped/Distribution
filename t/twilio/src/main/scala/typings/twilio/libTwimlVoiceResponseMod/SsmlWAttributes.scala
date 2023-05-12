package typings.twilio.libTwimlVoiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SsmlWAttributes extends StObject {
  
  /** role - Customize the pronunciation of words by specifying the word’s part of speech or alternate meaning */
  var role: js.UndefOr[String] = js.undefined
}
object SsmlWAttributes {
  
  inline def apply(): SsmlWAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SsmlWAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SsmlWAttributes] (val x: Self) extends AnyVal {
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
