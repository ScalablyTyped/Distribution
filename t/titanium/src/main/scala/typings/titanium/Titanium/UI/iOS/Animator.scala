package typings.titanium.Titanium.UI.iOS

import typings.titanium.Titanium.Proxy
import typings.titanium.Titanium.UI.View
import typings.titanium.titaniumStrings.pause
import typings.titanium.titaniumStrings.resume
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides support for the built-in iOS dynamic animations
  */
@js.native
trait Animator extends Proxy {
  
  /**
    * Adds a dynamic behavior to the animator.
    */
  def addBehavior(behavior: Proxy): Unit = js.native
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  @JSName("addEventListener")
  def addEventListener_pause(
    name: pause,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AnimatorPauseEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resume(
    name: resume,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AnimatorResumeEvent, Unit]
  ): Unit = js.native
  
  /**
    * Behaviors associated with this animator.
    */
  var behaviors: js.Array[Proxy] = js.native
  
  /**
    * Fires a synthesized event to any registered listeners.
    */
  @JSName("fireEvent")
  def fireEvent_pause(name: pause): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pause(name: pause, event: AnimatorPauseEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_resume(name: resume): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_resume(name: resume, event: AnimatorResumeEvent): Unit = js.native
  
  /**
    * Gets the value of the <Titanium.UI.iOS.Animator.behaviors> property.
    * @deprecated Access <Titanium.UI.iOS.Animator.behaviors> instead.
    */
  def getBehaviors(): js.Array[Proxy] = js.native
  
  /**
    * Gets the value of the <Titanium.UI.iOS.Animator.referenceView> property.
    * @deprecated Access <Titanium.UI.iOS.Animator.referenceView> instead.
    */
  def getReferenceView(): View = js.native
  
  /**
    * Gets the value of the <Titanium.UI.iOS.Animator.running> property.
    * @deprecated Access <Titanium.UI.iOS.Animator.running> instead.
    */
  def getRunning(): Boolean = js.native
  
  /**
    * Titanium View object to initialize as the reference view for the animator.
    */
  var referenceView: View = js.native
  
  /**
    * Removes all behaviors from this animator.
    */
  def removeAllBehaviors(): Unit = js.native
  
  /**
    * Removes the specified behavior from the animator.
    */
  def removeBehavior(behavior: Proxy): Unit = js.native
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  @JSName("removeEventListener")
  def removeEventListener_pause(
    name: pause,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AnimatorPauseEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resume(
    name: resume,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AnimatorResumeEvent, Unit]
  ): Unit = js.native
  
  /**
    * Returns `true` if the animator is running else `false`.
    */
  val running: Boolean = js.native
  
  /**
    * Sets the value of the <Titanium.UI.iOS.Animator.behaviors> property.
    * @deprecated Set the value using <Titanium.UI.iOS.Animator.behaviors> instead.
    */
  def setBehaviors(behaviors: js.Array[Proxy]): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.iOS.Animator.referenceView> property.
    * @deprecated Set the value using <Titanium.UI.iOS.Animator.referenceView> instead.
    */
  def setReferenceView(referenceView: View): Unit = js.native
  
  /**
    * Starts the animation behaviors.
    */
  def startAnimator(): Unit = js.native
  
  /**
    * Stops the animation behaviors.
    */
  def stopAnimator(): Unit = js.native
  
  /**
    * Updates the animator's state information with the current state of the specified item.
    */
  def updateItemUsingCurrentState(item: View): Unit = js.native
}
