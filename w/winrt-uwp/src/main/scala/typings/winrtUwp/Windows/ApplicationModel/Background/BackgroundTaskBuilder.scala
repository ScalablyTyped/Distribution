package typings.winrtUwp.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a background task to be registered with the system. */
@JSGlobal("Windows.ApplicationModel.Background.BackgroundTaskBuilder")
@js.native
/** Creates an instance of the BackgroundTaskBuilder class. */
class BackgroundTaskBuilder () extends js.Object {
  /** Indicates whether the background task will be canceled if at least one of its required conditions is no longer met. */
  var cancelOnConditionLoss: Boolean = js.native
  /** This API is not available to all Windows/Windows Phone apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var isNetworkRequested: Boolean = js.native
  /** Gets or sets the name of a background task. */
  var name: String = js.native
  /** Gets or sets the class that performs the work of a background task. */
  var taskEntryPoint: String = js.native
  /**
    * Adds a condition to a background task.
    * @param condition An instance of a SystemCondition object.
    */
  def addCondition(condition: IBackgroundCondition): Unit = js.native
  /**
    * Registers a background task with the system.
    * @return An instance of a BackgroundTaskRegistration object.
    */
  def register(): BackgroundTaskRegistration = js.native
  /**
    * Sets the event trigger for a background task.
    * @param trigger An instance of an event trigger object such as a SystemTrigger , TimeTrigger , or NetworkOperatorNotificationTrigger .
    */
  def setTrigger(trigger: IBackgroundTrigger): Unit = js.native
}

