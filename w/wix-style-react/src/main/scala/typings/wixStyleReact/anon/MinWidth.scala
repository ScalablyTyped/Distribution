package typings.wixStyleReact.anon

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinWidth extends StObject {
  
  var dataHook: Requireable[String]
  
  var id: Requireable[String | Double]
  
  var maxWidth: Requireable[Double]
  
  var minWidth: Requireable[Double]
  
  var title: Requireable[ReactNodeLike]
}
object MinWidth {
  
  inline def apply(
    dataHook: Requireable[String],
    id: Requireable[String | Double],
    maxWidth: Requireable[Double],
    minWidth: Requireable[Double],
    title: Requireable[ReactNodeLike]
  ): MinWidth = {
    val __obj = js.Dynamic.literal(dataHook = dataHook.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinWidth]
  }
  
  extension [Self <: MinWidth](x: Self) {
    
    inline def setDataHook(value: Requireable[String]): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setId(value: Requireable[String | Double]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMaxWidth(value: Requireable[Double]): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidth(value: Requireable[Double]): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
