package typings.winrtUwp.global.Windows.ApplicationModel.Background

import typings.winrtUwp.Windows.ApplicationModel.Background.IBackgroundCondition
import typings.winrtUwp.Windows.ApplicationModel.Background.IBackgroundTrigger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a background task to be registered with the system. */
@JSGlobal("Windows.ApplicationModel.Background.BackgroundTaskBuilder")
@js.native
/** Creates an instance of the BackgroundTaskBuilder class. */
class BackgroundTaskBuilder ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Background.BackgroundTaskBuilder {
  
  /**
    * Adds a condition to a background task.
    * @param condition An instance of a SystemCondition object.
    */
  /* CompleteClass */
  override def addCondition(condition: IBackgroundCondition): Unit = js.native
  
  /** Indicates whether the background task will be canceled if at least one of its required conditions is no longer met. */
  /* CompleteClass */
  var cancelOnConditionLoss: Boolean = js.native
  
  /** This API is not available to all Windows/Windows Phone apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  /* CompleteClass */
  var isNetworkRequested: Boolean = js.native
  
  /** Gets or sets the name of a background task. */
  /* CompleteClass */
  var name: String = js.native
  
  /**
    * Registers a background task with the system.
    * @return An instance of a BackgroundTaskRegistration object.
    */
  /* CompleteClass */
  override def register(): typings.winrtUwp.Windows.ApplicationModel.Background.BackgroundTaskRegistration = js.native
  
  /**
    * Sets the event trigger for a background task.
    * @param trigger An instance of an event trigger object such as a SystemTrigger , TimeTrigger , or NetworkOperatorNotificationTrigger .
    */
  /* CompleteClass */
  override def setTrigger(trigger: IBackgroundTrigger): Unit = js.native
  
  /** Gets or sets the class that performs the work of a background task. */
  /* CompleteClass */
  var taskEntryPoint: String = js.native
}
