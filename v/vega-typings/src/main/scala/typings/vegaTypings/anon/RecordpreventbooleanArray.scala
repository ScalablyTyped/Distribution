package typings.vegaTypings.anon

import typings.vegaTypings.configMod.DefaultsConfig
import typings.vegaTypings.streamMod.EventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<'prevent', boolean | std.Array<vega-typings.vega-typings/types/spec.EventType>> */
@js.native
trait RecordpreventbooleanArray extends DefaultsConfig {
  
  var prevent: Boolean | js.Array[EventType] = js.native
}
object RecordpreventbooleanArray {
  
  @scala.inline
  def apply(prevent: Boolean | js.Array[EventType]): RecordpreventbooleanArray = {
    val __obj = js.Dynamic.literal(prevent = prevent.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordpreventbooleanArray]
  }
  
  @scala.inline
  implicit class RecordpreventbooleanArrayOps[Self <: RecordpreventbooleanArray] (val x: Self) extends AnyVal {
    
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
    def setPreventVarargs(value: EventType*): Self = this.set("prevent", js.Array(value :_*))
    
    @scala.inline
    def setPrevent(value: Boolean | js.Array[EventType]): Self = this.set("prevent", value.asInstanceOf[js.Any])
  }
}
