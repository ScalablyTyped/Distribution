package typings.yaireoTagify.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Event data relating to a single tag.
  * @template T Type of the tag data. See the Tagify class for more details.
  */
trait TagEventData[T /* <: BaseTagData */]
  extends StObject
     with EventData[T] {
  
  var data: js.UndefOr[T] = js.undefined
  
  var index: js.UndefOr[Double] = js.undefined
  
  var tag: HTMLElement
}
object TagEventData {
  
  inline def apply[T /* <: BaseTagData */](tag: HTMLElement, tagify: Tagify[T]): TagEventData[T] = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any], tagify = tagify.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagEventData[T]]
  }
  
  extension [Self <: TagEventData[?], T /* <: BaseTagData */](x: Self & TagEventData[T]) {
    
    inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setTag(value: HTMLElement): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
