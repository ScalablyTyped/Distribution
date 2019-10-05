package typings.titanium.Titanium.UI.iOS

import typings.titanium.Titanium.Proxy
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.View
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Provides support for the built-in iOS dynamic animations
			 */
trait Animator extends Proxy {
  /**
  				 * Behaviors associated with this animator.
  				 */
  var behaviors: js.Array[Proxy]
  /**
  				 * Titanium View object to initialize as the reference view for the animator.
  				 */
  var referenceView: View
  /**
  				 * Returns `true` if the animator is running else `false`.
  				 */
  val running: Boolean
  /**
  				 * Adds a dynamic behavior to the animator.
  				 */
  def addBehavior(behavior: Proxy): Unit
  /**
  				 * Gets the value of the <Titanium.UI.iOS.Animator.behaviors> property.
  				 */
  def getBehaviors(): js.Array[Proxy]
  /**
  				 * Gets the value of the <Titanium.UI.iOS.Animator.referenceView> property.
  				 */
  def getReferenceView(): View
  /**
  				 * Gets the value of the <Titanium.UI.iOS.Animator.running> property.
  				 */
  def getRunning(): Boolean
  /**
  				 * Removes all behaviors from this animator.
  				 */
  def removeAllBehaviors(): Unit
  /**
  				 * Removes the specified behavior from the animator.
  				 */
  def removeBehavior(behavior: Proxy): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.Animator.behaviors> property.
  				 */
  def setBehaviors(behaviors: js.Array[Proxy]): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.Animator.referenceView> property.
  				 */
  def setReferenceView(referenceView: js.Any): Unit
  /**
  				 * Starts the animation behaviors.
  				 */
  def startAnimator(): Unit
  /**
  				 * Stops the animation behaviors.
  				 */
  def stopAnimator(): Unit
  /**
  				 * Updates the animator's state information with the current state of the specified item.
  				 */
  def updateItemUsingCurrentState(item: js.Any): Unit
}

object Animator {
  @scala.inline
  def apply(
    addBehavior: Proxy => Unit,
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    apiName: String,
    applyProperties: js.Any => Unit,
    behaviors: js.Array[Proxy],
    bubbleParent: Boolean,
    fireEvent: (String, js.Any) => Unit,
    getApiName: () => String,
    getBehaviors: () => js.Array[Proxy],
    getBubbleParent: () => Boolean,
    getReferenceView: () => View,
    getRunning: () => Boolean,
    referenceView: View,
    removeAllBehaviors: () => Unit,
    removeBehavior: Proxy => Unit,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    running: Boolean,
    setBehaviors: js.Array[Proxy] => Unit,
    setBubbleParent: Boolean => Unit,
    setReferenceView: js.Any => Unit,
    startAnimator: () => Unit,
    stopAnimator: () => Unit,
    updateItemUsingCurrentState: js.Any => Unit,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): Animator = {
    val __obj = js.Dynamic.literal(addBehavior = js.Any.fromFunction1(addBehavior), addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), behaviors = behaviors, bubbleParent = bubbleParent, fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBehaviors = js.Any.fromFunction0(getBehaviors), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getReferenceView = js.Any.fromFunction0(getReferenceView), getRunning = js.Any.fromFunction0(getRunning), referenceView = referenceView, removeAllBehaviors = js.Any.fromFunction0(removeAllBehaviors), removeBehavior = js.Any.fromFunction1(removeBehavior), removeEventListener = js.Any.fromFunction2(removeEventListener), running = running, setBehaviors = js.Any.fromFunction1(setBehaviors), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setReferenceView = js.Any.fromFunction1(setReferenceView), startAnimator = js.Any.fromFunction0(startAnimator), stopAnimator = js.Any.fromFunction0(stopAnimator), updateItemUsingCurrentState = js.Any.fromFunction1(updateItemUsingCurrentState))
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[Animator]
  }
}

