package typings.userEvent

import typings.std.Element
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("user-event", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def click(element: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("click")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def click(element: Window): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("click")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def dblClick(element: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dblClick")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def dblClick(element: Window): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dblClick")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def selectOptions(element: Element, values: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("selectOptions")(element.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def selectOptions(element: Element, values: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("selectOptions")(element.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def selectOptions(element: Window, values: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("selectOptions")(element.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def selectOptions(element: Window, values: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("selectOptions")(element.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def `type`(element: Element, text: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("type")(element.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def `type`(element: Element, text: String, userOpts: UserOpts): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("type")(element.asInstanceOf[js.Any], text.asInstanceOf[js.Any], userOpts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def `type`(element: Window, text: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("type")(element.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def `type`(element: Window, text: String, userOpts: UserOpts): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("type")(element.asInstanceOf[js.Any], text.asInstanceOf[js.Any], userOpts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  }
  
  trait UserOpts extends StObject {
    
    var allAtOnce: js.UndefOr[Boolean] = js.undefined
    
    var delay: js.UndefOr[Double] = js.undefined
  }
  object UserOpts {
    
    inline def apply(): UserOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserOpts]
    }
    
    extension [Self <: UserOpts](x: Self) {
      
      inline def setAllAtOnce(value: Boolean): Self = StObject.set(x, "allAtOnce", value.asInstanceOf[js.Any])
      
      inline def setAllAtOnceUndefined: Self = StObject.set(x, "allAtOnce", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    }
  }
}
