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
  
  @scala.inline
  def apply[T /* <: PropertyType */](`type`: T): FullProperty[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullProperty[T]]
  }
  
  @scala.inline
  implicit class FullPropertyMutableBuilder[Self <: FullProperty[?], T /* <: PropertyType */] (val x: Self & FullProperty[T]) extends AnyVal {
    
    @scala.inline
    def setObserver(
      value: String | (js.Function3[
          /* newVal */ ValueType[T], 
          /* oldVal */ ValueType[T], 
          /* changedPath */ js.Array[String | Double], 
          Unit
        ])
    ): Self = StObject.set(x, "observer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObserverFunction3(
      value: (/* newVal */ ValueType[T], /* oldVal */ ValueType[T], /* changedPath */ js.Array[String | Double]) => Unit
    ): Self = StObject.set(x, "observer", js.Any.fromFunction3(value))
    
    @scala.inline
    def setObserverUndefined: Self = StObject.set(x, "observer", js.undefined)
    
    @scala.inline
    def setOptionalTypes(value: js.Array[ShortProperty]): Self = StObject.set(x, "optionalTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalTypesUndefined: Self = StObject.set(x, "optionalTypes", js.undefined)
    
    @scala.inline
    def setOptionalTypesVarargs(value: ShortProperty*): Self = StObject.set(x, "optionalTypes", js.Array(value :_*))
    
    @scala.inline
    def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: ValueType[T]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: js.Any*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
