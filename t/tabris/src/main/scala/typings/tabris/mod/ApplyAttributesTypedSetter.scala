package typings.tabris.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplyAttributesTypedSetter[WidgetConstructor /* <: BaseConstructor[Widget[Any]] */]
  extends StObject
     with ApplyAttributes[WidgetConstructor] {
  
  var attr: js.UndefOr[
    Attributes[
      /* import warning: importer.ImportType#apply Failed type conversion: WidgetConstructor['prototype'] */ js.Any, 
      Any
    ]
  ] = js.undefined
  
  var children: js.UndefOr[
    Attributes[
      /* import warning: importer.ImportType#apply Failed type conversion: WidgetConstructor['prototype'] */ js.Any, 
      Any
    ]
  ] = js.undefined
  
  var selector: js.UndefOr[String] = js.undefined
  
  var target: WidgetConstructor
}
object ApplyAttributesTypedSetter {
  
  inline def apply[WidgetConstructor /* <: BaseConstructor[Widget[Any]] */](target: WidgetConstructor): ApplyAttributesTypedSetter[WidgetConstructor] = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyAttributesTypedSetter[WidgetConstructor]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplyAttributesTypedSetter[?], WidgetConstructor /* <: BaseConstructor[Widget[Any]] */] (val x: Self & ApplyAttributesTypedSetter[WidgetConstructor]) extends AnyVal {
    
    inline def setAttr(
      value: Attributes[
          /* import warning: importer.ImportType#apply Failed type conversion: WidgetConstructor['prototype'] */ js.Any, 
          Any
        ]
    ): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
    
    inline def setAttrUndefined: Self = StObject.set(x, "attr", js.undefined)
    
    inline def setChildren(
      value: Attributes[
          /* import warning: importer.ImportType#apply Failed type conversion: WidgetConstructor['prototype'] */ js.Any, 
          Any
        ]
    ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    inline def setTarget(value: WidgetConstructor): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
