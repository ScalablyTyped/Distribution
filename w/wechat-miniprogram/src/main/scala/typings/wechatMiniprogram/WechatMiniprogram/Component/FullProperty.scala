package typings.wechatMiniprogram.WechatMiniprogram.Component

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FullProperty[T /* <: PropertyType */] extends StObject {
  
  /** 属性值被更改时的响应函数 */
  var observer: js.UndefOr[
    String | (js.Function3[
      /* newVal */ ValueType[T], 
      /* oldVal */ ValueType[T], 
      /* changedPath */ js.Array[String | Double], 
      Unit
    ])
  ] = js.undefined
  
  /** 属性的类型（可以指定多个） */
  var optionalTypes: js.UndefOr[js.Array[ShortProperty]] = js.undefined
  
  /** 属性类型 */
  var `type`: T
  
  /** 属性初始值 */
  var value: js.UndefOr[ValueType[T]] = js.undefined
}
object FullProperty {
  
  inline def apply[T /* <: PropertyType */](`type`: T): FullProperty[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullProperty[T]]
  }
  
  extension [Self <: FullProperty[?], T /* <: PropertyType */](x: Self & FullProperty[T]) {
    
    inline def setObserver(
      value: String | (js.Function3[
          /* newVal */ ValueType[T], 
          /* oldVal */ ValueType[T], 
          /* changedPath */ js.Array[String | Double], 
          Unit
        ])
    ): Self = StObject.set(x, "observer", value.asInstanceOf[js.Any])
    
    inline def setObserverFunction3(
      value: (/* newVal */ ValueType[T], /* oldVal */ ValueType[T], /* changedPath */ js.Array[String | Double]) => Unit
    ): Self = StObject.set(x, "observer", js.Any.fromFunction3(value))
    
    inline def setObserverUndefined: Self = StObject.set(x, "observer", js.undefined)
    
    inline def setOptionalTypes(value: js.Array[ShortProperty]): Self = StObject.set(x, "optionalTypes", value.asInstanceOf[js.Any])
    
    inline def setOptionalTypesUndefined: Self = StObject.set(x, "optionalTypes", js.undefined)
    
    inline def setOptionalTypesVarargs(value: ShortProperty*): Self = StObject.set(x, "optionalTypes", js.Array(value*))
    
    inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: ValueType[T]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
