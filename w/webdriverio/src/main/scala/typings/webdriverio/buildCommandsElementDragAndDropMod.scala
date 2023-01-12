package typings.webdriverio

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsElementDragAndDropMod {
  
  @JSImport("webdriverio/build/commands/element/dragAndDrop", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(target: Element): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def default(target: Element, param2: DragAndDropOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def default(target: ElementCoordinates): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def default(target: ElementCoordinates, param2: DragAndDropOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait DragAndDropOptions extends StObject {
    
    var duration: js.UndefOr[Double] = js.undefined
  }
  object DragAndDropOptions {
    
    inline def apply(): DragAndDropOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DragAndDropOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DragAndDropOptions] (val x: Self) extends AnyVal {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    }
  }
  
  trait ElementCoordinates extends StObject {
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object ElementCoordinates {
    
    inline def apply(): ElementCoordinates = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ElementCoordinates]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ElementCoordinates] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
