package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnCollapse
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var children: Any
  
  var dataHook: Any
  
  var disabled: Any
  
  var itemKey: Any
  
  var onClick: Any
  
  var onCollapse: Any
  
  var onExpand: Any
  
  var suffix: Any
  
  var title: Any
}
object OnCollapse {
  
  inline def apply(
    children: Any,
    dataHook: Any,
    disabled: Any,
    itemKey: Any,
    onClick: Any,
    onCollapse: Any,
    onExpand: Any,
    suffix: Any,
    title: Any
  ): OnCollapse = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], dataHook = dataHook.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], itemKey = itemKey.asInstanceOf[js.Any], onClick = onClick.asInstanceOf[js.Any], onCollapse = onCollapse.asInstanceOf[js.Any], onExpand = onExpand.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnCollapse]
  }
  
  extension [Self <: OnCollapse](x: Self) {
    
    inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setDataHook(value: Any): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Any): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setItemKey(value: Any): Self = StObject.set(x, "itemKey", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: Any): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnCollapse(value: Any): Self = StObject.set(x, "onCollapse", value.asInstanceOf[js.Any])
    
    inline def setOnExpand(value: Any): Self = StObject.set(x, "onExpand", value.asInstanceOf[js.Any])
    
    inline def setSuffix(value: Any): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: Any): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
