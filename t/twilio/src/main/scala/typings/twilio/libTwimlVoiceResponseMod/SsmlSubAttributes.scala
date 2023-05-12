package typings.twilio.libTwimlVoiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SsmlSubAttributes extends StObject {
  
  /** alias - Substitute a different word (or pronunciation) for selected text such as an acronym or abbreviation */
  var alias: js.UndefOr[String] = js.undefined
}
object SsmlSubAttributes {
  
  inline def apply(): SsmlSubAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SsmlSubAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SsmlSubAttributes] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
  }
}
