package typings.switchery

import typings.std.Node
import typings.switchery.mod.Switchery.Options
import typings.switchery.mod.Switchery.SwitcheryStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Switchery")
  @js.native
  class Switchery protected ()
    extends StObject
       with typings.switchery.mod.Switchery {
    def this(node: Node) = this()
    def this(node: Node, options: Options) = this()
    
    /**
      * Unbinding all event handlers attached to the switch element to prepare the object for garbage collection.
      * @returns {void}
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * Disable switch by unbinding attached events and changing opacity to disabledOpacity value
      * @returns {void}
      */
    /* CompleteClass */
    override def disable(): Unit = js.native
    
    /**
      * Enable disabled switch by re-adding event handlers and changing the opacity to 1.
      * @returns {void}
      */
    /* CompleteClass */
    override def enable(): Unit = js.native
    
    /**
      * Check if switch is currently disabled by checking the readonly and disabled attributes on the checkbox and the disabled option set via JS.
      *  If any of those are present, the returned value is true.
      * @returns {boolean} whether it's disabled or not.
      */
    /* CompleteClass */
    override def isDisabled(): Boolean = js.native
  }
  @JSGlobal("Switchery")
  @js.native
  def Switchery: SwitcheryStatic = js.native
  inline def Switchery_=(x: SwitcheryStatic): Unit = js.Dynamic.global.updateDynamic("Switchery")(x.asInstanceOf[js.Any])
}
