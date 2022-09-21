package typings.tabris.anon

import typings.tabris.mod.BaseConstructor
import typings.tabris.mod.NativeObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attribute[TargetConstructor /* <: BaseConstructor[NativeObject] */, AttrName /* <: /* keyof ResultType */ String */, ResultType] extends StObject {
  
  var attribute: AttrName
  
  var children: /* import warning: importer.ImportType#apply Failed type conversion: ResultType[AttrName] */ js.Any
  
  var target: TargetConstructor
}
object Attribute {
  
  inline def apply[TargetConstructor /* <: BaseConstructor[NativeObject] */, AttrName /* <: /* keyof ResultType */ String */, ResultType](
    attribute: AttrName,
    children: /* import warning: importer.ImportType#apply Failed type conversion: ResultType[AttrName] */ js.Any,
    target: TargetConstructor
  ): Attribute[TargetConstructor, AttrName, ResultType] = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attribute[TargetConstructor, AttrName, ResultType]]
  }
  
  extension [Self <: Attribute[?, ?, ?], TargetConstructor /* <: BaseConstructor[NativeObject] */, AttrName /* <: /* keyof ResultType */ String */, ResultType](x: Self & (Attribute[TargetConstructor, AttrName, ResultType])) {
    
    inline def setAttribute(value: AttrName): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setChildren(
      value: /* import warning: importer.ImportType#apply Failed type conversion: ResultType[AttrName] */ js.Any
    ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: TargetConstructor): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
