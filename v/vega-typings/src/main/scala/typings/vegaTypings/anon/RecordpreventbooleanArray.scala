package typings.vegaTypings.anon

import typings.vegaTypings.configMod.DefaultsConfig
import typings.vegaTypings.streamMod.EventType
import org.scalablytyped.runtime.StObject
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
  implicit class RecordpreventbooleanArrayMutableBuilder[Self <: RecordpreventbooleanArray] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrevent(value: Boolean | js.Array[EventType]): Self = StObject.set(x, "prevent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventVarargs(value: EventType*): Self = StObject.set(x, "prevent", js.Array(value :_*))
  }
}
