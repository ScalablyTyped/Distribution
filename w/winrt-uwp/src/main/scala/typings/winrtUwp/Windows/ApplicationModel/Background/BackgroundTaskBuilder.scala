package typings.winrtUwp.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a background task to be registered with the system. */
@js.native
trait BackgroundTaskBuilder extends js.Object {
  
  /**
    * Adds a condition to a background task.
    * @param condition An instance of a SystemCondition object.
    */
  def addCondition(condition: IBackgroundCondition): Unit = js.native
  
  /** Indicates whether the background task will be canceled if at least one of its required conditions is no longer met. */
  var cancelOnConditionLoss: Boolean = js.native
  
  /** This API is not available to all Windows/Windows Phone apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var isNetworkRequested: Boolean = js.native
  
  /** Gets or sets the name of a background task. */
  var name: String = js.native
  
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
  
  /** Gets or sets the class that performs the work of a background task. */
  var taskEntryPoint: String = js.native
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
  
  @scala.inline
  implicit class BackgroundTaskBuilderOps[Self <: BackgroundTaskBuilder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddCondition(value: IBackgroundCondition => Unit): Self = this.set("addCondition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCancelOnConditionLoss(value: Boolean): Self = this.set("cancelOnConditionLoss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNetworkRequested(value: Boolean): Self = this.set("isNetworkRequested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegister(value: () => BackgroundTaskRegistration): Self = this.set("register", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetTrigger(value: IBackgroundTrigger => Unit): Self = this.set("setTrigger", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTaskEntryPoint(value: String): Self = this.set("taskEntryPoint", value.asInstanceOf[js.Any])
  }
}
