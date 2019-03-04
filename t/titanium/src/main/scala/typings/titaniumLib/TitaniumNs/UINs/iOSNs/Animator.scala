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
    addBehavior: js.Function1[titaniumLib.TitaniumNs.Proxy, scala.Unit],
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    behaviors: js.Array[titaniumLib.TitaniumNs.Proxy],
    bubbleParent: scala.Boolean,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getApiName: js.Function0[java.lang.String],
    getBehaviors: js.Function0[js.Array[titaniumLib.TitaniumNs.Proxy]],
    getBubbleParent: js.Function0[scala.Boolean],
    getReferenceView: js.Function0[titaniumLib.TitaniumNs.UINs.View],
    getRunning: js.Function0[scala.Boolean],
    referenceView: titaniumLib.TitaniumNs.UINs.View,
    removeAllBehaviors: js.Function0[scala.Unit],
    removeBehavior: js.Function1[titaniumLib.TitaniumNs.Proxy, scala.Unit],
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    running: scala.Boolean,
    setBehaviors: js.Function1[js.Array[titaniumLib.TitaniumNs.Proxy], scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    setReferenceView: js.Function1[js.Any, scala.Unit],
    startAnimator: js.Function0[scala.Unit],
    stopAnimator: js.Function0[scala.Unit],
    updateItemUsingCurrentState: js.Function1[js.Any, scala.Unit],
    getLifecycleContainer: js.Function0[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup] = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): Animator = {
    val __obj = js.Dynamic.literal(addBehavior = addBehavior, addEventListener = addEventListener, apiName = apiName, applyProperties = applyProperties, behaviors = behaviors, bubbleParent = bubbleParent, fireEvent = fireEvent, getApiName = getApiName, getBehaviors = getBehaviors, getBubbleParent = getBubbleParent, getReferenceView = getReferenceView, getRunning = getRunning, referenceView = referenceView, removeAllBehaviors = removeAllBehaviors, removeBehavior = removeBehavior, removeEventListener = removeEventListener, running = running, setBehaviors = setBehaviors, setBubbleParent = setBubbleParent, setReferenceView = setReferenceView, startAnimator = startAnimator, stopAnimator = stopAnimator, updateItemUsingCurrentState = updateItemUsingCurrentState)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[Animator]
  }
}

