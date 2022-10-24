package typings.wixStyleReact.anon

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelShort extends StObject {
  
  var description: Requireable[ReactNodeLike]
  
  var descriptionInfo: Requireable[ReactNodeLike]
  
  var label: Requireable[ReactNodeLike]
  
  var labelShort: Requireable[ReactNodeLike]
  
  var value: Validator[Double]
}
object LabelShort {
  
  inline def apply(
    description: Requireable[ReactNodeLike],
    descriptionInfo: Requireable[ReactNodeLike],
    label: Requireable[ReactNodeLike],
    labelShort: Requireable[ReactNodeLike],
    value: Validator[Double]
  ): LabelShort = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], descriptionInfo = descriptionInfo.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelShort = labelShort.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelShort]
  }
  
  extension [Self <: LabelShort](x: Self) {
    
    inline def setDescription(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionInfo(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "descriptionInfo", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelShort(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "labelShort", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Validator[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
