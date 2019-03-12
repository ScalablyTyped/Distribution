package typings
package titaniumLib.TitaniumNs.UINs.iOSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Provides support for the built-in iOS dynamic animations
			 */
trait Animator
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * Behaviors associated with this animator.
  				 */
  var behaviors: js.Array[titaniumLib.TitaniumNs.Proxy]
  /**
  				 * Titanium View object to initialize as the reference view for the animator.
  				 */
  var referenceView: titaniumLib.TitaniumNs.UINs.View
  /**
  				 * Returns `true` if the animator is running else `false`.
  				 */
  val running: scala.Boolean
  /**
  				 * Adds a dynamic behavior to the animator.
  				 */
  def addBehavior(behavior: titaniumLib.TitaniumNs.Proxy): scala.Unit
  /**
  				 * Gets the value of the <Titanium.UI.iOS.Animator.behaviors> property.
  				 */
  def getBehaviors(): js.Array[titaniumLib.TitaniumNs.Proxy]
  /**
  				 * Gets the value of the <Titanium.UI.iOS.Animator.referenceView> property.
  				 */
  def getReferenceView(): titaniumLib.TitaniumNs.UINs.View
  /**
  				 * Gets the value of the <Titanium.UI.iOS.Animator.running> property.
  				 */
  def getRunning(): scala.Boolean
  /**
  				 * Removes all behaviors from this animator.
  				 */
  def removeAllBehaviors(): scala.Unit
  /**
  				 * Removes the specified behavior from the animator.
  				 */
  def removeBehavior(behavior: titaniumLib.TitaniumNs.Proxy): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.Animator.behaviors> property.
  				 */
  def setBehaviors(behaviors: js.Array[titaniumLib.TitaniumNs.Proxy]): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.Animator.referenceView> property.
  				 */
  def setReferenceView(referenceView: js.Any): scala.Unit
  /**
  				 * Starts the animation behaviors.
  				 */
  def startAnimator(): scala.Unit
  /**
  				 * Stops the animation behaviors.
  				 */
  def stopAnimator(): scala.Unit
  /**
  				 * Updates the animator's state information with the current state of the specified item.
  				 */
  def updateItemUsingCurrentState(item: js.Any): scala.Unit
}

object Animator {
  @scala.inline
  def apply(
    addBehavior: titaniumLib.TitaniumNs.Proxy => scala.Unit,
    addEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    apiName: java.lang.String,
    applyProperties: js.Any => scala.Unit,
    behaviors: js.Array[titaniumLib.TitaniumNs.Proxy],
    bubbleParent: scala.Boolean,
    fireEvent: (java.lang.String, js.Any) => scala.Unit,
    getApiName: () => java.lang.String,
    getBehaviors: () => js.Array[titaniumLib.TitaniumNs.Proxy],
    getBubbleParent: () => scala.Boolean,
    getReferenceView: () => titaniumLib.TitaniumNs.UINs.View,
    getRunning: () => scala.Boolean,
    referenceView: titaniumLib.TitaniumNs.UINs.View,
    removeAllBehaviors: () => scala.Unit,
    removeBehavior: titaniumLib.TitaniumNs.Proxy => scala.Unit,
    removeEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    running: scala.Boolean,
    setBehaviors: js.Array[titaniumLib.TitaniumNs.Proxy] => scala.Unit,
    setBubbleParent: scala.Boolean => scala.Unit,
    setReferenceView: js.Any => scala.Unit,
    startAnimator: () => scala.Unit,
    stopAnimator: () => scala.Unit,
    updateItemUsingCurrentState: js.Any => scala.Unit,
    getLifecycleContainer: () => titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): Animator = {
    val __obj = js.Dynamic.literal(addBehavior = js.Any.fromFunction1(addBehavior), addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), behaviors = behaviors, bubbleParent = bubbleParent, fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBehaviors = js.Any.fromFunction0(getBehaviors), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getReferenceView = js.Any.fromFunction0(getReferenceView), getRunning = js.Any.fromFunction0(getRunning), referenceView = referenceView, removeAllBehaviors = js.Any.fromFunction0(removeAllBehaviors), removeBehavior = js.Any.fromFunction1(removeBehavior), removeEventListener = js.Any.fromFunction2(removeEventListener), running = running, setBehaviors = js.Any.fromFunction1(setBehaviors), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setReferenceView = js.Any.fromFunction1(setReferenceView), startAnimator = js.Any.fromFunction0(startAnimator), stopAnimator = js.Any.fromFunction0(stopAnimator), updateItemUsingCurrentState = js.Any.fromFunction1(updateItemUsingCurrentState))
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[Animator]
  }
}

