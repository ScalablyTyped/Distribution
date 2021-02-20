package typings.userEvent

import typings.std.Element
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("user-event", "default.click")
    @js.native
    def click(element: Element): Unit = js.native
    @JSImport("user-event", "default.click")
    @js.native
    def click(element: Window): Unit = js.native
    
    @JSImport("user-event", "default.dblClick")
    @js.native
    def dblClick(element: Element): Unit = js.native
    @JSImport("user-event", "default.dblClick")
    @js.native
    def dblClick(element: Window): Unit = js.native
    
    @JSImport("user-event", "default.selectOptions")
    @js.native
    def selectOptions(element: Element, values: String): Unit = js.native
    @JSImport("user-event", "default.selectOptions")
    @js.native
    def selectOptions(element: Element, values: js.Array[String]): Unit = js.native
    @JSImport("user-event", "default.selectOptions")
    @js.native
    def selectOptions(element: Window, values: String): Unit = js.native
    @JSImport("user-event", "default.selectOptions")
    @js.native
    def selectOptions(element: Window, values: js.Array[String]): Unit = js.native
    
    @JSImport("user-event", "default.type")
    @js.native
    def `type`(element: Element, text: String): js.Promise[Unit] = js.native
    @JSImport("user-event", "default.type")
    @js.native
    def `type`(element: Element, text: String, userOpts: UserOpts): js.Promise[Unit] = js.native
    @JSImport("user-event", "default.type")
    @js.native
    def `type`(element: Window, text: String): js.Promise[Unit] = js.native
    @JSImport("user-event", "default.type")
    @js.native
    def `type`(element: Window, text: String, userOpts: UserOpts): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait UserOpts extends StObject {
    
    var allAtOnce: js.UndefOr[Boolean] = js.native
    
    var delay: js.UndefOr[Double] = js.native
  }
  object UserOpts {
    
    @scala.inline
    def apply(): UserOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserOpts]
    }
    
    @scala.inline
    implicit class UserOptsMutableBuilder[Self <: UserOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllAtOnce(value: Boolean): Self = StObject.set(x, "allAtOnce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllAtOnceUndefined: Self = StObject.set(x, "allAtOnce", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    }
  }
}
