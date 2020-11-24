package typings.wechatMiniprogram.WechatMiniprogram.Component

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FullProperty[T /* <: PropertyType */] extends js.Object {
  
  /** 属性值被更改时的响应函数 */
  var observer: js.UndefOr[
    String | (js.Function3[
      /* newVal */ ValueType[T], 
      /* oldVal */ ValueType[T], 
      /* changedPath */ js.Array[String | Double], 
      Unit
    ])
  ] = js.native
  
  /** 属性的类型（可以指定多个） */
  var optionalTypes: js.UndefOr[js.Array[ShortProperty]] = js.native
  
  /** 属性类型 */
  var `type`: T = js.native
  
  /** 属性初始值 */
  var value: js.UndefOr[ValueType[T]] = js.native
}
object FullProperty {
  
  @scala.inline
  def apply[T /* <: PropertyType */](`type`: T): FullProperty[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullProperty[T]]
  }
  
  @scala.inline
  implicit class FullPropertyOps[Self <: FullProperty[_], T /* <: PropertyType */] (val x: Self with FullProperty[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: T): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObserverFunction3(
      value: (/* newVal */ ValueType[T], /* oldVal */ ValueType[T], /* changedPath */ js.Array[String | Double]) => Unit
    ): Self = this.set("observer", js.Any.fromFunction3(value))
    
    @scala.inline
    def setObserver(
      value: String | (js.Function3[
          /* newVal */ ValueType[T], 
          /* oldVal */ ValueType[T], 
          /* changedPath */ js.Array[String | Double], 
          Unit
        ])
    ): Self = this.set("observer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObserver: Self = this.set("observer", js.undefined)
    
    @scala.inline
    def setOptionalTypesVarargs(value: ShortProperty*): Self = this.set("optionalTypes", js.Array(value :_*))
    
    @scala.inline
    def setOptionalTypes(value: js.Array[ShortProperty]): Self = this.set("optionalTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionalTypes: Self = this.set("optionalTypes", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: js.Any*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: ValueType[T]): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
