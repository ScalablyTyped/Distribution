package typings.victoryCore.anon

import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeArray
import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ariadescribedby extends StObject {
  
  var `aria-describedby`: Requireable[String]
  
  var `aria-label`: Requireable[String]
  
  var children: Requireable[String | Double | Boolean | ReactElementLike | ReactNodeArray]
  
  var className: Requireable[String]
  
  var desc: Requireable[String]
  
  var tabIndex: Requireable[Double]
}
object Ariadescribedby {
  
  inline def apply(
    `aria-describedby`: Requireable[String],
    `aria-label`: Requireable[String],
    children: Requireable[String | Double | Boolean | ReactElementLike | ReactNodeArray],
    className: Requireable[String],
    desc: Requireable[String],
    tabIndex: Requireable[Double]
  ): Ariadescribedby = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], desc = desc.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ariadescribedby]
  }
  
  extension [Self <: Ariadescribedby](x: Self) {
    
    inline def `setAria-describedby`(value: Requireable[String]): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
    
    inline def `setAria-label`(value: Requireable[String]): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: Requireable[String | Double | Boolean | ReactElementLike | ReactNodeArray]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setClassName(value: Requireable[String]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setDesc(value: Requireable[String]): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    inline def setTabIndex(value: Requireable[Double]): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
  }
}
