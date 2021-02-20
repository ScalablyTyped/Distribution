package typings.winrtUwp.global.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Retrieves a hint about resource availability for background tasks. Background tasks can use this hint to decide how much work to do when they are activated. */
@JSGlobal("Windows.ApplicationModel.Background.BackgroundWorkCost")
@js.native
abstract class BackgroundWorkCost ()
  extends typings.winrtUwp.Windows.ApplicationModel.Background.BackgroundWorkCost
object BackgroundWorkCost {
  
  @JSGlobal("Windows.ApplicationModel.Background.BackgroundWorkCost")
  @js.native
  val ^ : js.Any = js.native
  
  /** Retrieves a hint about resource availability for background tasks. */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Background.BackgroundWorkCost.currentBackgroundWorkCost")
  @js.native
  def currentBackgroundWorkCost: typings.winrtUwp.Windows.ApplicationModel.Background.BackgroundWorkCostValue = js.native
  @scala.inline
  def currentBackgroundWorkCost_=(x: typings.winrtUwp.Windows.ApplicationModel.Background.BackgroundWorkCostValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentBackgroundWorkCost")(x.asInstanceOf[js.Any])
}
