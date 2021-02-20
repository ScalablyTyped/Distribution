package typings.turbolinks

import org.scalablytyped.runtime.Shortcut
import typings.turbolinks.turbolinksStrings.advance
import typings.turbolinks.turbolinksStrings.replace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("turbolinks", JSImport.Namespace)
  @js.native
  val ^ : TurbolinksStatic = js.native
  
  @js.native
  trait Action extends StObject {
    
    var action: advance | replace = js.native
  }
  object Action {
    
    @scala.inline
    def apply(action: advance | replace): Action = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action]
    }
    
    @scala.inline
    implicit class ActionMutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: advance | replace): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TurbolinksStatic extends StObject {
    
    def clearCache(): Unit = js.native
    
    def setProgressBarDelay(delayInMilliseconds: Double): Unit = js.native
    
    def start(): Unit = js.native
    
    var supported: Boolean = js.native
    
    def visit(location: String): Unit = js.native
    def visit(location: String, options: Action): Unit = js.native
  }
  
  type _To = TurbolinksStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: TurbolinksStatic = ^
}
