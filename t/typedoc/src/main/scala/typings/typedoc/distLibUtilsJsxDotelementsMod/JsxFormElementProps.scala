package typings.typedoc.distLibUtilsJsxDotelementsMod

import typings.typedoc.typedocStrings._blank
import typings.typedoc.typedocStrings._parent
import typings.typedoc.typedocStrings._self
import typings.typedoc.typedocStrings._top
import typings.typedoc.typedocStrings.`applicationSlashx-www-form-urlencoded`
import typings.typedoc.typedocStrings.`multipartSlashform-data`
import typings.typedoc.typedocStrings.dialog
import typings.typedoc.typedocStrings.get
import typings.typedoc.typedocStrings.post
import typings.typedoc.typedocStrings.textSlashplain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsxFormElementProps
  extends StObject
     with JsxHtmlGlobalProps {
  
  var `accept-charset`: js.UndefOr[String] = js.undefined
  
  var action: js.UndefOr[String] = js.undefined
  
  var autocomplete: js.UndefOr[String] = js.undefined
  
  var enctype: js.UndefOr[
    `applicationSlashx-www-form-urlencoded` | `multipartSlashform-data` | textSlashplain
  ] = js.undefined
  
  var method: js.UndefOr[get | post | dialog] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var noValidate: js.UndefOr[Boolean] = js.undefined
  
  var rel: js.UndefOr[String] = js.undefined
  
  var target: js.UndefOr[_self | _blank | _parent | _top] = js.undefined
}
object JsxFormElementProps {
  
  inline def apply(): JsxFormElementProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsxFormElementProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JsxFormElementProps] (val x: Self) extends AnyVal {
    
    inline def `setAccept-charset`(value: String): Self = StObject.set(x, "accept-charset", value.asInstanceOf[js.Any])
    
    inline def `setAccept-charsetUndefined`: Self = StObject.set(x, "accept-charset", js.undefined)
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setAutocomplete(value: String): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
    
    inline def setAutocompleteUndefined: Self = StObject.set(x, "autocomplete", js.undefined)
    
    inline def setEnctype(value: `applicationSlashx-www-form-urlencoded` | `multipartSlashform-data` | textSlashplain): Self = StObject.set(x, "enctype", value.asInstanceOf[js.Any])
    
    inline def setEnctypeUndefined: Self = StObject.set(x, "enctype", js.undefined)
    
    inline def setMethod(value: get | post | dialog): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNoValidate(value: Boolean): Self = StObject.set(x, "noValidate", value.asInstanceOf[js.Any])
    
    inline def setNoValidateUndefined: Self = StObject.set(x, "noValidate", js.undefined)
    
    inline def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
    
    inline def setTarget(value: _self | _blank | _parent | _top): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
