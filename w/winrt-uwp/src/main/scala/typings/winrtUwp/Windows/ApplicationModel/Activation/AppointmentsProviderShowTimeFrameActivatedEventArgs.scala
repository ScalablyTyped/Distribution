package typings.winrtUwp.Windows.ApplicationModel.Activation

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data when an app is activated to show a specified time frame on the user’s calendar. */
@js.native
trait AppointmentsProviderShowTimeFrameActivatedEventArgs extends StObject {
  
  /** Gets the duration of the time frame to be shown. */
  var duration: Double = js.native
  
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  
  /** Gets the splash screen object, which provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
  
  /** Gets the starting date and time of the time frame to be shown. */
  var timeToShow: Date = js.native
  
  /** Gets the action to be performed by the appointments provider. */
  var verb: String = js.native
}
object AppointmentsProviderShowTimeFrameActivatedEventArgs {
  
  @scala.inline
  def apply(
    duration: Double,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen,
    timeToShow: Date,
    verb: String
  ): AppointmentsProviderShowTimeFrameActivatedEventArgs = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any], timeToShow = timeToShow.asInstanceOf[js.Any], verb = verb.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentsProviderShowTimeFrameActivatedEventArgs]
  }
  
  @scala.inline
  implicit class AppointmentsProviderShowTimeFrameActivatedEventArgsMutableBuilder[Self <: AppointmentsProviderShowTimeFrameActivatedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: ActivationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousExecutionState(value: ApplicationExecutionState): Self = StObject.set(x, "previousExecutionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplashScreen(value: SplashScreen): Self = StObject.set(x, "splashScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeToShow(value: Date): Self = StObject.set(x, "timeToShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerb(value: String): Self = StObject.set(x, "verb", value.asInstanceOf[js.Any])
  }
}
