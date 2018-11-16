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

