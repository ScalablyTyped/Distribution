package typings.typedoc.distLibUtilsJsxDotelementsMod

import typings.typedoc.typedocStrings._blank
import typings.typedoc.typedocStrings._parent
import typings.typedoc.typedocStrings._self
import typings.typedoc.typedocStrings._top
import typings.typedoc.typedocStrings.`applicationSlashx-www-form-urlencoded`
import typings.typedoc.typedocStrings.`multipartSlashform-data`
import typings.typedoc.typedocStrings.button
import typings.typedoc.typedocStrings.get
import typings.typedoc.typedocStrings.post
import typings.typedoc.typedocStrings.reset
import typings.typedoc.typedocStrings.submit
import typings.typedoc.typedocStrings.textSlashplain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsxButtonElementProps
  extends StObject
     with JsxHtmlGlobalProps {
  
  var autofocus: js.UndefOr[Boolean] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var form: js.UndefOr[String] = js.undefined
  
  var formAction: js.UndefOr[String] = js.undefined
  
  var formEnctype: js.UndefOr[
    `applicationSlashx-www-form-urlencoded` | `multipartSlashform-data` | textSlashplain
  ] = js.undefined
  
  var formMethod: js.UndefOr[get | post] = js.undefined
  
  var formNoValidate: js.UndefOr[Boolean] = js.undefined
  
  var formTarget: js.UndefOr[_self | _blank | _parent | _top] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[submit | reset | button] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object JsxButtonElementProps {
  
  inline def apply(): JsxButtonElementProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsxButtonElementProps]
  }
  
  extension [Self <: JsxButtonElementProps](x: Self) {
    
    inline def setAutofocus(value: Boolean): Self = StObject.set(x, "autofocus", value.asInstanceOf[js.Any])
    
    inline def setAutofocusUndefined: Self = StObject.set(x, "autofocus", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormAction(value: String): Self = StObject.set(x, "formAction", value.asInstanceOf[js.Any])
    
    inline def setFormActionUndefined: Self = StObject.set(x, "formAction", js.undefined)
    
    inline def setFormEnctype(value: `applicationSlashx-www-form-urlencoded` | `multipartSlashform-data` | textSlashplain): Self = StObject.set(x, "formEnctype", value.asInstanceOf[js.Any])
    
    inline def setFormEnctypeUndefined: Self = StObject.set(x, "formEnctype", js.undefined)
    
    inline def setFormMethod(value: get | post): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
    
    inline def setFormMethodUndefined: Self = StObject.set(x, "formMethod", js.undefined)
    
    inline def setFormNoValidate(value: Boolean): Self = StObject.set(x, "formNoValidate", value.asInstanceOf[js.Any])
    
    inline def setFormNoValidateUndefined: Self = StObject.set(x, "formNoValidate", js.undefined)
    
    inline def setFormTarget(value: _self | _blank | _parent | _top): Self = StObject.set(x, "formTarget", value.asInstanceOf[js.Any])
    
    inline def setFormTargetUndefined: Self = StObject.set(x, "formTarget", js.undefined)
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: submit | reset | button): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
