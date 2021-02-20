package typings.winrtUwp.global.Windows.ApplicationModel.Background

import typings.winrtUwp.Windows.ApplicationModel.Background.IBackgroundTaskRegistration
import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a background task that has been registered with the system. */
@JSGlobal("Windows.ApplicationModel.Background.BackgroundTaskRegistration")
@js.native
abstract class BackgroundTaskRegistration ()
  extends typings.winrtUwp.Windows.ApplicationModel.Background.BackgroundTaskRegistration
object BackgroundTaskRegistration {
  
  @JSGlobal("Windows.ApplicationModel.Background.BackgroundTaskRegistration")
  @js.native
  val ^ : js.Any = js.native
  
  /** Enumerates an application's registered background tasks. */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Background.BackgroundTaskRegistration.allTasks")
  @js.native
  def allTasks: IMapView[String, IBackgroundTaskRegistration] = js.native
  @scala.inline
  def allTasks_=(x: IMapView[String, IBackgroundTaskRegistration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allTasks")(x.asInstanceOf[js.Any])
}
