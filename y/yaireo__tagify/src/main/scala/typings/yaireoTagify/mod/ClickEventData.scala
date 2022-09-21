package typings.yaireoTagify.mod

import typings.std.HTMLElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Clicking a tag.
  * @template T Type of the tag data. See the Tagify class for more details.
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.yaireoTagify.mod.EventData because Already inherited
- typings.yaireoTagify.mod.TagEventData because var conflicts: tagify. Inlined data, index, tag */ trait ClickEventData[T /* <: BaseTagData */]
  extends StObject
     with DomEventData[T, MouseEvent] {
  
  var data: js.UndefOr[T]
  
  var index: js.UndefOr[Double]
  
  var tag: HTMLElement
}
object ClickEventData {
  
  inline def apply[T /* <: BaseTagData */](event: MouseEvent, tag: HTMLElement, tagify: Tagify[T]): ClickEventData[T] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagify = tagify.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickEventData[T]]
  }
  
  extension [Self <: ClickEventData[?], T /* <: BaseTagData */](x: Self & ClickEventData[T]) {
    
    inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setTag(value: HTMLElement): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
