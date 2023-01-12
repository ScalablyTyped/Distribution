package typings.vegaTypings.anon

import typings.vegaTypings.typesSpecConfigMod.DefaultsConfig
import typings.vegaTypings.typesSpecStreamMod.EventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<'prevent', boolean | std.Array<vega-typings.vega-typings/types/spec.EventType>> */
trait RecordpreventbooleanArray
  extends StObject
     with DefaultsConfig {
  
  var prevent: Boolean | js.Array[EventType]
}
object RecordpreventbooleanArray {
  
  inline def apply(prevent: Boolean | js.Array[EventType]): RecordpreventbooleanArray = {
    val __obj = js.Dynamic.literal(prevent = prevent.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordpreventbooleanArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecordpreventbooleanArray] (val x: Self) extends AnyVal {
    
    inline def setPrevent(value: Boolean | js.Array[EventType]): Self = StObject.set(x, "prevent", value.asInstanceOf[js.Any])
    
    inline def setPreventVarargs(value: EventType*): Self = StObject.set(x, "prevent", js.Array(value*))
  }
}
