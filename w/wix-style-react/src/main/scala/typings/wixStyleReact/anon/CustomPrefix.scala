package typings.wixStyleReact.anon

import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeArray
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomPrefix extends StObject {
  
  /**  TODO: still in development. custom bullet element like icon or avatar */
  var customPrefix: Requireable[ReactNodeLike]
  
  /** event text - could be a node or a string */
  var label: Requireable[ReactNodeLike]
  
  /** action element in the end of event text */
  var labelAction: Requireable[ReactNodeLike]
  
  /** suffix text or element placed on the right */
  var suffix: Requireable[String | Double | Boolean | ReactElementLike | ReactNodeArray]
}
object CustomPrefix {
  
  inline def apply(
    customPrefix: Requireable[ReactNodeLike],
    label: Requireable[ReactNodeLike],
    labelAction: Requireable[ReactNodeLike],
    suffix: Requireable[String | Double | Boolean | ReactElementLike | ReactNodeArray]
  ): CustomPrefix = {
    val __obj = js.Dynamic.literal(customPrefix = customPrefix.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelAction = labelAction.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPrefix]
  }
  
  extension [Self <: CustomPrefix](x: Self) {
    
    inline def setCustomPrefix(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "customPrefix", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelAction(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "labelAction", value.asInstanceOf[js.Any])
    
    inline def setSuffix(value: Requireable[String | Double | Boolean | ReactElementLike | ReactNodeArray]): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
  }
}
