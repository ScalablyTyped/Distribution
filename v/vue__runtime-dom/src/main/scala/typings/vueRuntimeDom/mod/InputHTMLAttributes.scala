package typings.vueRuntimeDom.mod

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputHTMLAttributes
  extends StObject
     with HTMLAttributes {
  
  var accept: js.UndefOr[String] = js.undefined
  
  var alt: js.UndefOr[String] = js.undefined
  
  var autocomplete: js.UndefOr[String] = js.undefined
  
  var autofocus: js.UndefOr[Booleanish] = js.undefined
  
  var capture: js.UndefOr[Boolean | "user" | "environment"] = js.undefined
  
  // https://www.w3.org/tr/html-media-capture/#the-capture-attribute
  var checked: js.UndefOr[Booleanish | js.Array[Any] | Set[Any]] = js.undefined
  
  // for IDE v-model multi-checkbox support
  var crossorigin: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[Booleanish] = js.undefined
  
  var form: js.UndefOr[String] = js.undefined
  
  var formaction: js.UndefOr[String] = js.undefined
  
  var formenctype: js.UndefOr[String] = js.undefined
  
  var formmethod: js.UndefOr[String] = js.undefined
  
  var formnovalidate: js.UndefOr[Booleanish] = js.undefined
  
  var formtarget: js.UndefOr[String] = js.undefined
  
  var height: js.UndefOr[Numberish] = js.undefined
  
  var indeterminate: js.UndefOr[Boolean] = js.undefined
  
  var list: js.UndefOr[String] = js.undefined
  
  var max: js.UndefOr[Numberish] = js.undefined
  
  var maxlength: js.UndefOr[Numberish] = js.undefined
  
  var min: js.UndefOr[Numberish] = js.undefined
  
  var minlength: js.UndefOr[Numberish] = js.undefined
  
  var multiple: js.UndefOr[Booleanish] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var pattern: js.UndefOr[String] = js.undefined
  
  var readonly: js.UndefOr[Booleanish] = js.undefined
  
  var required: js.UndefOr[Booleanish] = js.undefined
  
  var size: js.UndefOr[Numberish] = js.undefined
  
  var src: js.UndefOr[String] = js.undefined
  
  var step: js.UndefOr[Numberish] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[Any] = js.undefined
  
  // we support :value to be bound to anything w/ v-model
  var width: js.UndefOr[Numberish] = js.undefined
}
object InputHTMLAttributes {
  
  inline def apply(): InputHTMLAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputHTMLAttributes]
  }
  
  extension [Self <: InputHTMLAttributes](x: Self) {
    
    inline def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
    
    inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
    
    inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    inline def setAutocomplete(value: String): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
    
    inline def setAutocompleteUndefined: Self = StObject.set(x, "autocomplete", js.undefined)
    
    inline def setAutofocus(value: Booleanish): Self = StObject.set(x, "autofocus", value.asInstanceOf[js.Any])
    
    inline def setAutofocusUndefined: Self = StObject.set(x, "autofocus", js.undefined)
    
    inline def setCapture(value: Boolean | "user" | "environment"): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    
    inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
    
    inline def setChecked(value: Booleanish | js.Array[Any] | Set[Any]): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    inline def setCheckedVarargs(value: Any*): Self = StObject.set(x, "checked", js.Array(value*))
    
    inline def setCrossorigin(value: String): Self = StObject.set(x, "crossorigin", value.asInstanceOf[js.Any])
    
    inline def setCrossoriginUndefined: Self = StObject.set(x, "crossorigin", js.undefined)
    
    inline def setDisabled(value: Booleanish): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setFormaction(value: String): Self = StObject.set(x, "formaction", value.asInstanceOf[js.Any])
    
    inline def setFormactionUndefined: Self = StObject.set(x, "formaction", js.undefined)
    
    inline def setFormenctype(value: String): Self = StObject.set(x, "formenctype", value.asInstanceOf[js.Any])
    
    inline def setFormenctypeUndefined: Self = StObject.set(x, "formenctype", js.undefined)
    
    inline def setFormmethod(value: String): Self = StObject.set(x, "formmethod", value.asInstanceOf[js.Any])
    
    inline def setFormmethodUndefined: Self = StObject.set(x, "formmethod", js.undefined)
    
    inline def setFormnovalidate(value: Booleanish): Self = StObject.set(x, "formnovalidate", value.asInstanceOf[js.Any])
    
    inline def setFormnovalidateUndefined: Self = StObject.set(x, "formnovalidate", js.undefined)
    
    inline def setFormtarget(value: String): Self = StObject.set(x, "formtarget", value.asInstanceOf[js.Any])
    
    inline def setFormtargetUndefined: Self = StObject.set(x, "formtarget", js.undefined)
    
    inline def setHeight(value: Numberish): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setIndeterminate(value: Boolean): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
    
    inline def setIndeterminateUndefined: Self = StObject.set(x, "indeterminate", js.undefined)
    
    inline def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
    
    inline def setMax(value: Numberish): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMaxlength(value: Numberish): Self = StObject.set(x, "maxlength", value.asInstanceOf[js.Any])
    
    inline def setMaxlengthUndefined: Self = StObject.set(x, "maxlength", js.undefined)
    
    inline def setMin(value: Numberish): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setMinlength(value: Numberish): Self = StObject.set(x, "minlength", value.asInstanceOf[js.Any])
    
    inline def setMinlengthUndefined: Self = StObject.set(x, "minlength", js.undefined)
    
    inline def setMultiple(value: Booleanish): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setReadonly(value: Booleanish): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
    
    inline def setRequired(value: Booleanish): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setSize(value: Numberish): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    inline def setStep(value: Numberish): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setWidth(value: Numberish): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
