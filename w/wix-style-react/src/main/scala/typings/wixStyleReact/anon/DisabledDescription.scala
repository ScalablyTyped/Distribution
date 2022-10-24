package typings.wixStyleReact.anon

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeArray
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisabledDescription extends StObject {
  
  var dataHook: Requireable[String]
  
  var disabled: Requireable[Boolean]
  
  var disabledDescription: Requireable[String]
  
  var icon: Validator[String | Double | Boolean | ReactElementLike | ReactNodeArray]
  
  var onClick: Validator[js.Function1[/* repeated */ Any, Any]]
  
  var text: Validator[String]
  
  var tooltipProps: Requireable[InferProps[Any]]
}
object DisabledDescription {
  
  inline def apply(
    dataHook: Requireable[String],
    disabled: Requireable[Boolean],
    disabledDescription: Requireable[String],
    icon: Validator[String | Double | Boolean | ReactElementLike | ReactNodeArray],
    onClick: Validator[js.Function1[/* repeated */ Any, Any]],
    text: Validator[String],
    tooltipProps: Requireable[InferProps[Any]]
  ): DisabledDescription = {
    val __obj = js.Dynamic.literal(dataHook = dataHook.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], disabledDescription = disabledDescription.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], onClick = onClick.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], tooltipProps = tooltipProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisabledDescription]
  }
  
  extension [Self <: DisabledDescription](x: Self) {
    
    inline def setDataHook(value: Requireable[String]): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Requireable[Boolean]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledDescription(value: Requireable[String]): Self = StObject.set(x, "disabledDescription", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: Validator[String | Double | Boolean | ReactElementLike | ReactNodeArray]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: Validator[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setText(value: Validator[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTooltipProps(value: Requireable[InferProps[Any]]): Self = StObject.set(x, "tooltipProps", value.asInstanceOf[js.Any])
  }
}
