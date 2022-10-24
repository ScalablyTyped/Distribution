package typings.wixStyleReact.anon

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultValue extends StObject {
  
  var className: Requireable[String]
  
  var dataHook: Requireable[String]
  
  var defaultValue: Requireable[String | Double]
  
  var disabled: Requireable[Boolean]
  
  var hideStepper: Requireable[Boolean]
  
  var id: Requireable[String]
  
  var max: Requireable[Double]
  
  var min: Requireable[Double]
  
  var name: Requireable[String]
  
  var onBlur: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var onChange: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var onFocus: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var placeholder: Requireable[String]
  
  var prefix: Requireable[ReactNodeLike]
  
  var size: Requireable[String]
  
  var status: Requireable[String]
  
  var statusMessage: Requireable[ReactNodeLike]
  
  var step: Requireable[Double]
  
  var strict: Requireable[Boolean]
  
  var value: Requireable[String | Double]
}
object DefaultValue {
  
  inline def apply(
    className: Requireable[String],
    dataHook: Requireable[String],
    defaultValue: Requireable[String | Double],
    disabled: Requireable[Boolean],
    hideStepper: Requireable[Boolean],
    id: Requireable[String],
    max: Requireable[Double],
    min: Requireable[Double],
    name: Requireable[String],
    onBlur: Requireable[js.Function1[/* repeated */ Any, Any]],
    onChange: Requireable[js.Function1[/* repeated */ Any, Any]],
    onFocus: Requireable[js.Function1[/* repeated */ Any, Any]],
    placeholder: Requireable[String],
    prefix: Requireable[ReactNodeLike],
    size: Requireable[String],
    status: Requireable[String],
    statusMessage: Requireable[ReactNodeLike],
    step: Requireable[Double],
    strict: Requireable[Boolean],
    value: Requireable[String | Double]
  ): DefaultValue = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], dataHook = dataHook.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], hideStepper = hideStepper.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onBlur = onBlur.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], onFocus = onFocus.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], strict = strict.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultValue]
  }
  
  extension [Self <: DefaultValue](x: Self) {
    
    inline def setClassName(value: Requireable[String]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setDataHook(value: Requireable[String]): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setDefaultValue(value: Requireable[String | Double]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Requireable[Boolean]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setHideStepper(value: Requireable[Boolean]): Self = StObject.set(x, "hideStepper", value.asInstanceOf[js.Any])
    
    inline def setId(value: Requireable[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Requireable[Double]): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Requireable[Double]): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setName(value: Requireable[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOnBlur(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    inline def setOnFocus(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onFocus", value.asInstanceOf[js.Any])
    
    inline def setPlaceholder(value: Requireable[String]): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Requireable[String]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Requireable[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStep(value: Requireable[Double]): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStrict(value: Requireable[Boolean]): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Requireable[String | Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
