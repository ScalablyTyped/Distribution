package typings.vegaTypings.anon

import typings.vegaTypings.configMod.DefaultsConfig
import typings.vegaTypings.streamMod.EventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<'allow', boolean | std.Array<vega-typings.vega-typings/types/spec.EventType>> */
trait RecordallowbooleanArrayEv
  extends StObject
     with DefaultsConfig {
  
  var allow: Boolean | js.Array[EventType]
}
object RecordallowbooleanArrayEv {
  
  inline def apply(allow: Boolean | js.Array[EventType]): RecordallowbooleanArrayEv = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordallowbooleanArrayEv]
  }
  
  extension [Self <: RecordallowbooleanArrayEv](x: Self) {
    
    inline def setAllow(value: Boolean | js.Array[EventType]): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
    
    inline def setAllowVarargs(value: EventType*): Self = StObject.set(x, "allow", js.Array(value :_*))
  }
}
