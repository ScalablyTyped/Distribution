package typings.vueRuntimeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchedulerJob
  extends js.Function {
  
  var active: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether the effect is allowed to recursively trigger itself
    * when managed by the scheduler.
    *
    * By default, a job cannot trigger itself because some built-in method calls,
    * e.g. Array.prototype.push actually performs reads as well (#1740) which
    * can lead to confusing infinite loops.
    * The allowed cases are component update functions and watch callbacks.
    * Component update functions may update child component props, which in turn
    * trigger flush: "pre" watch callbacks that mutates state that the parent
    * relies on (#1801). Watch callbacks doesn't track its dependencies so if it
    * triggers itself again, it's likely intentional and it is the user's
    * responsibility to perform recursive state mutation that eventually
    * stabilizes (#1727).
    */
  var allowRecurse: js.UndefOr[Boolean] = js.native
  
  var computed: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[Double] = js.native
  
  /**
    * Attached by renderer.ts when setting up a component's render effect
    * Used to obtain component information when reporting max recursive updates.
    * dev only.
    */
  var ownerInstance: js.UndefOr[ComponentInternalInstance] = js.native
  
  var pre: js.UndefOr[Boolean] = js.native
}
