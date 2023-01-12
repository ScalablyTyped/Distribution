package typings.vueRuntimeDom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeygenHTMLAttributes
  extends StObject
     with HTMLAttributes {
  
  var autofocus: js.UndefOr[Booleanish] = js.undefined
  
  var challenge: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[Booleanish] = js.undefined
  
  var form: js.UndefOr[String] = js.undefined
  
  var keyparams: js.UndefOr[String] = js.undefined
  
  var keytype: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object KeygenHTMLAttributes {
  
  inline def apply(): KeygenHTMLAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeygenHTMLAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeygenHTMLAttributes] (val x: Self) extends AnyVal {
    
    inline def setAutofocus(value: Booleanish): Self = StObject.set(x, "autofocus", value.asInstanceOf[js.Any])
    
    inline def setAutofocusUndefined: Self = StObject.set(x, "autofocus", js.undefined)
    
    inline def setChallenge(value: String): Self = StObject.set(x, "challenge", value.asInstanceOf[js.Any])
    
    inline def setChallengeUndefined: Self = StObject.set(x, "challenge", js.undefined)
    
    inline def setDisabled(value: Booleanish): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setKeyparams(value: String): Self = StObject.set(x, "keyparams", value.asInstanceOf[js.Any])
    
    inline def setKeyparamsUndefined: Self = StObject.set(x, "keyparams", js.undefined)
    
    inline def setKeytype(value: String): Self = StObject.set(x, "keytype", value.asInstanceOf[js.Any])
    
    inline def setKeytypeUndefined: Self = StObject.set(x, "keytype", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
