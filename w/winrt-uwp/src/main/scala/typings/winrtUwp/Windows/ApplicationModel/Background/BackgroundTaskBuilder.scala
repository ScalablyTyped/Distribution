package typings.winrtUwp.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a background task to be registered with the system. */
trait BackgroundTaskBuilder extends js.Object {
  /** Indicates whether the background task will be canceled if at least one of its required conditions is no longer met. */
  var cancelOnConditionLoss: Boolean
  /** This API is not available to all Windows/Windows Phone apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var isNetworkRequested: Boolean
  /** Gets or sets the name of a background task. */
  var name: String
  /** Gets or sets the class that performs the work of a background task. */
  var taskEntryPoint: String
  /**
    * Adds a condition to a background task.
    * @param condition An instance of a SystemCondition object.
    */
  def addCondition(condition: IBackgroundCondition): Unit
  /**
    * Registers a background task with the system.
    * @return An instance of a BackgroundTaskRegistration object.
    */
  def register(): BackgroundTaskRegistration
  /**
    * Sets the event trigger for a background task.
    * @param trigger An instance of an event trigger object such as a SystemTrigger , TimeTrigger , or NetworkOperatorNotificationTrigger .
    */
  def setTrigger(trigger: IBackgroundTrigger): Unit
}

object BackgroundTaskBuilder {
  @scala.inline
  def apply(
    addCondition: IBackgroundCondition => Unit,
    cancelOnConditionLoss: Boolean,
    isNetworkRequested: Boolean,
    name: String,
    register: () => BackgroundTaskRegistration,
    setTrigger: IBackgroundTrigger => Unit,
    taskEntryPoint: String
  ): BackgroundTaskBuilder = {
    val __obj = js.Dynamic.literal(addCondition = js.Any.fromFunction1(addCondition), cancelOnConditionLoss = cancelOnConditionLoss.asInstanceOf[js.Any], isNetworkRequested = isNetworkRequested.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], register = js.Any.fromFunction0(register), setTrigger = js.Any.fromFunction1(setTrigger), taskEntryPoint = taskEntryPoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundTaskBuilder]
  }
}

