package typings.vuedraggable

import org.scalablytyped.runtime.Shortcut
import typings.std.DragEvent
import typings.std.Element
import typings.vuedraggable.anon.Clone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("vuedraggable", JSImport.Default)
  @js.native
  val default: ExtendedVue[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any, 
    js.Object, 
    js.Object, 
    js.Object, 
    Clone
  ] = js.native
  
  type CombinedVueInstance[Instance /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any */, Data, Methods, Computed, Props] = Data & Methods & Computed & Props & Instance
  
  trait DraggedContext[T] extends StObject {
    
    var element: T
    
    var futureIndex: Double
    
    var index: Double
  }
  object DraggedContext {
    
    inline def apply[T](element: T, futureIndex: Double, index: Double): DraggedContext[T] = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], futureIndex = futureIndex.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[DraggedContext[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DraggedContext[?], T] (val x: Self & DraggedContext[T]) extends AnyVal {
      
      inline def setElement(value: T): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setFutureIndex(value: Double): Self = StObject.set(x, "futureIndex", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
  
  trait DropContext[T] extends StObject {
    
    var component: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any
    
    var element: T
    
    var index: Double
  }
  object DropContext {
    
    inline def apply[T](
      component: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any,
      element: T,
      index: Double
    ): DropContext[T] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropContext[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DropContext[?], T] (val x: Self & DropContext[T]) extends AnyVal {
      
      inline def setComponent(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any
      ): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setElement(value: T): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
  
  type ExtendedVue[Instance /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any */, Data, Methods, Computed, Props] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor<CombinedVueInstance<Instance, Data, Methods, Computed, Props> & Vue> */ Any
  
  trait MoveEvent[T] extends StObject {
    
    var dragged: Element
    
    var draggedContext: DraggedContext[T]
    
    var draggedRect: Rectangle
    
    var from: Element
    
    var isTrusted: Boolean
    
    var originalEvent: DragEvent
    
    var related: Element
    
    var relatedContext: DropContext[T]
    
    var relatedRect: Rectangle
    
    var to: Element
    
    var willInsertAfter: Boolean
  }
  object MoveEvent {
    
    inline def apply[T](
      dragged: Element,
      draggedContext: DraggedContext[T],
      draggedRect: Rectangle,
      from: Element,
      isTrusted: Boolean,
      originalEvent: DragEvent,
      related: Element,
      relatedContext: DropContext[T],
      relatedRect: Rectangle,
      to: Element,
      willInsertAfter: Boolean
    ): MoveEvent[T] = {
      val __obj = js.Dynamic.literal(dragged = dragged.asInstanceOf[js.Any], draggedContext = draggedContext.asInstanceOf[js.Any], draggedRect = draggedRect.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], isTrusted = isTrusted.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], related = related.asInstanceOf[js.Any], relatedContext = relatedContext.asInstanceOf[js.Any], relatedRect = relatedRect.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], willInsertAfter = willInsertAfter.asInstanceOf[js.Any])
      __obj.asInstanceOf[MoveEvent[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MoveEvent[?], T] (val x: Self & MoveEvent[T]) extends AnyVal {
      
      inline def setDragged(value: Element): Self = StObject.set(x, "dragged", value.asInstanceOf[js.Any])
      
      inline def setDraggedContext(value: DraggedContext[T]): Self = StObject.set(x, "draggedContext", value.asInstanceOf[js.Any])
      
      inline def setDraggedRect(value: Rectangle): Self = StObject.set(x, "draggedRect", value.asInstanceOf[js.Any])
      
      inline def setFrom(value: Element): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
      
      inline def setOriginalEvent(value: DragEvent): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setRelated(value: Element): Self = StObject.set(x, "related", value.asInstanceOf[js.Any])
      
      inline def setRelatedContext(value: DropContext[T]): Self = StObject.set(x, "relatedContext", value.asInstanceOf[js.Any])
      
      inline def setRelatedRect(value: Rectangle): Self = StObject.set(x, "relatedRect", value.asInstanceOf[js.Any])
      
      inline def setTo(value: Element): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setWillInsertAfter(value: Boolean): Self = StObject.set(x, "willInsertAfter", value.asInstanceOf[js.Any])
    }
  }
  
  trait Rectangle extends StObject {
    
    var bottom: Double
    
    var height: Double
    
    var left: Double
    
    var right: Double
    
    var top: Double
    
    var width: Double
  }
  object Rectangle {
    
    inline def apply(bottom: Double, height: Double, left: Double, right: Double, top: Double, width: Double): Rectangle = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rectangle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Rectangle] (val x: Self) extends AnyVal {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ExtendedVue[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any, 
    js.Object, 
    js.Object, 
    js.Object, 
    Clone
  ]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ExtendedVue[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any, 
    js.Object, 
    js.Object, 
    js.Object, 
    Clone
  ] = default
}
