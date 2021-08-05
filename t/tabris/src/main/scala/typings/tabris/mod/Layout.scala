package typings.tabris.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tabris", "Layout")
@js.native
class Layout protected () extends StObject {
  /* protected */ def this(options: js.Object) = this()
  
  /**
    * Callback used internally by widgets to register themselves as managed by this layout.
    * @param composite
    */
  def add(composite: typings.tabris.mod.Composite[Widget]): Unit = js.native
  
  /**
    * Callback used internally by widgets to de-register themselves as managed by this layout.
    * @param composite
    */
  def remove(composite: typings.tabris.mod.Composite[Widget]): Unit = js.native
  
  /**
    * Callback used internally by the framework to process layoutData.
    * @param composite
    */
  def render(composite: typings.tabris.mod.Composite[Widget]): Unit = js.native
}
