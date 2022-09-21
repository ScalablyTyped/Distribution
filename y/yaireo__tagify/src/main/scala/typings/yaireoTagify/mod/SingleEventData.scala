package typings.yaireoTagify.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Event data with a single parameter. When a non-object value is passed to
  * trigger, it is wrapped in this object.
  * @template T Type of the tag data. See the Tagify class for more details.
  * @template S Type of the value provided by this event.
  */
trait SingleEventData[T /* <: BaseTagData */, S]
  extends StObject
     with EventData[T] {
  
  var value: S
}
object SingleEventData {
  
  inline def apply[T /* <: BaseTagData */, S](tagify: Tagify[T], value: S): SingleEventData[T, S] = {
    val __obj = js.Dynamic.literal(tagify = tagify.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleEventData[T, S]]
  }
  
  extension [Self <: SingleEventData[?, ?], T /* <: BaseTagData */, S](x: Self & (SingleEventData[T, S])) {
    
    inline def setValue(value: S): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
