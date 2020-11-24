package typings.vegaTypings.anon

import typings.vegaTypings.configMod.DefaultsConfig
import typings.vegaTypings.streamMod.EventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<'allow', boolean | std.Array<vega-typings.vega-typings/types/spec.EventType>> */
@js.native
trait RecordallowbooleanArrayEv extends DefaultsConfig {
  
  var allow: Boolean | js.Array[EventType] = js.native
}
object RecordallowbooleanArrayEv {
  
  @scala.inline
  def apply(allow: Boolean | js.Array[EventType]): RecordallowbooleanArrayEv = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordallowbooleanArrayEv]
  }
  
  @scala.inline
  implicit class RecordallowbooleanArrayEvOps[Self <: RecordallowbooleanArrayEv] (val x: Self) extends AnyVal {
    
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
    def setAllowVarargs(value: EventType*): Self = this.set("allow", js.Array(value :_*))
    
    @scala.inline
    def setAllow(value: Boolean | js.Array[EventType]): Self = this.set("allow", value.asInstanceOf[js.Any])
  }
}
