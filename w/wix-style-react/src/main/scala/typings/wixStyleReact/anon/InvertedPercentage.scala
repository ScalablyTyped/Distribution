package typings.wixStyleReact.anon

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvertedPercentage extends StObject {
  
  var children: Requireable[ReactNodeLike]
  
  var description: Requireable[String]
  
  var descriptionInfo: Requireable[String]
  
  var invertedPercentage: Requireable[Boolean]
  
  var onClick: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var percentage: Requireable[Double]
  
  var value: Requireable[String]
  
  var valueInShort: Requireable[String]
}
object InvertedPercentage {
  
  inline def apply(
    children: Requireable[ReactNodeLike],
    description: Requireable[String],
    descriptionInfo: Requireable[String],
    invertedPercentage: Requireable[Boolean],
    onClick: Requireable[js.Function1[/* repeated */ Any, Any]],
    percentage: Requireable[Double],
    value: Requireable[String],
    valueInShort: Requireable[String]
  ): InvertedPercentage = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], descriptionInfo = descriptionInfo.asInstanceOf[js.Any], invertedPercentage = invertedPercentage.asInstanceOf[js.Any], onClick = onClick.asInstanceOf[js.Any], percentage = percentage.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueInShort = valueInShort.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvertedPercentage]
  }
  
  extension [Self <: InvertedPercentage](x: Self) {
    
    inline def setChildren(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Requireable[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionInfo(value: Requireable[String]): Self = StObject.set(x, "descriptionInfo", value.asInstanceOf[js.Any])
    
    inline def setInvertedPercentage(value: Requireable[Boolean]): Self = StObject.set(x, "invertedPercentage", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setPercentage(value: Requireable[Double]): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Requireable[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueInShort(value: Requireable[String]): Self = StObject.set(x, "valueInShort", value.asInstanceOf[js.Any])
  }
}
