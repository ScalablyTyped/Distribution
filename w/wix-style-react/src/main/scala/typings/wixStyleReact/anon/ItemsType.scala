package typings.wixStyleReact.anon

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemsType extends StObject {
  
  var items: Validator[js.Array[js.UndefOr[InferProps[MinWidth] | Null]]]
  
  var `type`: Requireable[String]
}
object ItemsType {
  
  inline def apply(items: Validator[js.Array[js.UndefOr[InferProps[MinWidth] | Null]]], `type`: Requireable[String]): ItemsType = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsType]
  }
  
  extension [Self <: ItemsType](x: Self) {
    
    inline def setItems(value: Validator[js.Array[js.UndefOr[InferProps[MinWidth] | Null]]]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setType(value: Requireable[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
