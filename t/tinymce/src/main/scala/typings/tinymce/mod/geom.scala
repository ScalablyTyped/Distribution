package typings.tinymce.mod

import typings.std.ClientRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geom {
  
  @js.native
  trait Rect extends StObject {
    
    def clamp(rect: Rect, clampRect: Rect, fixedSize: Boolean): Rect = js.native
    
    def create(x: Double, y: Double, w: Double, h: Double): Rect = js.native
    
    def findBestRelativePosition(rect: Rect, targetRect: Rect, constrainRect: Rect, rels: js.Array[_]): Unit = js.native
    
    def fromClientRect(clientRect: ClientRect): Rect = js.native
    
    def inflate(rect: Rect, w: Double, h: Double): Rect = js.native
    
    def intersect(rect: Rect, cropRect: Rect): Rect = js.native
    
    def relativePosition(rect: Rect, targetRect: Rect, rel: String): Unit = js.native
  }
  object Rect {
    
    @scala.inline
    def apply(
      clamp: (Rect, Rect, Boolean) => Rect,
      create: (Double, Double, Double, Double) => Rect,
      findBestRelativePosition: (Rect, Rect, Rect, js.Array[_]) => Unit,
      fromClientRect: ClientRect => Rect,
      inflate: (Rect, Double, Double) => Rect,
      intersect: (Rect, Rect) => Rect,
      relativePosition: (Rect, Rect, String) => Unit
    ): Rect = {
      val __obj = js.Dynamic.literal(clamp = js.Any.fromFunction3(clamp), create = js.Any.fromFunction4(create), findBestRelativePosition = js.Any.fromFunction4(findBestRelativePosition), fromClientRect = js.Any.fromFunction1(fromClientRect), inflate = js.Any.fromFunction3(inflate), intersect = js.Any.fromFunction2(intersect), relativePosition = js.Any.fromFunction3(relativePosition))
      __obj.asInstanceOf[Rect]
    }
    
    @scala.inline
    implicit class RectMutableBuilder[Self <: Rect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClamp(value: (Rect, Rect, Boolean) => Rect): Self = StObject.set(x, "clamp", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCreate(value: (Double, Double, Double, Double) => Rect): Self = StObject.set(x, "create", js.Any.fromFunction4(value))
      
      @scala.inline
      def setFindBestRelativePosition(value: (Rect, Rect, Rect, js.Array[_]) => Unit): Self = StObject.set(x, "findBestRelativePosition", js.Any.fromFunction4(value))
      
      @scala.inline
      def setFromClientRect(value: ClientRect => Rect): Self = StObject.set(x, "fromClientRect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInflate(value: (Rect, Double, Double) => Rect): Self = StObject.set(x, "inflate", js.Any.fromFunction3(value))
      
      @scala.inline
      def setIntersect(value: (Rect, Rect) => Rect): Self = StObject.set(x, "intersect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRelativePosition(value: (Rect, Rect, String) => Unit): Self = StObject.set(x, "relativePosition", js.Any.fromFunction3(value))
    }
  }
}
