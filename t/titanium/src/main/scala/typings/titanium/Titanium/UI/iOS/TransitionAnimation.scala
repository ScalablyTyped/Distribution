package typings.titanium.Titanium.UI.iOS

import typings.titanium.Titanium.Proxy
import typings.titanium.Titanium.UI.Animation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A transition animation when opening or closing windows in a
  * <Titanium.UI.NavigationWindow> or <Titanium.UI.Tab>.
  * Use this proxy with the Window's
  * [transitionAnimation](Titanium.UI.Window.transitionAnimation) property.
  */
@js.native
trait TransitionAnimation extends Proxy {
  
  /**
    * Length of the transition in milliseconds.
    */
  var duration: Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.iOS.TransitionAnimation.duration> property.
    * @deprecated Access <Titanium.UI.iOS.TransitionAnimation.duration> instead.
    */
  def getDuration(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.iOS.TransitionAnimation.transitionFrom> property.
    * @deprecated Access <Titanium.UI.iOS.TransitionAnimation.transitionFrom> instead.
    */
  def getTransitionFrom(): Animation = js.native
  
  /**
    * Gets the value of the <Titanium.UI.iOS.TransitionAnimation.transitionTo> property.
    * @deprecated Access <Titanium.UI.iOS.TransitionAnimation.transitionTo> instead.
    */
  def getTransitionTo(): Animation = js.native
  
  /**
    * Sets the value of the <Titanium.UI.iOS.TransitionAnimation.duration> property.
    * @deprecated Set the value using <Titanium.UI.iOS.TransitionAnimation.duration> instead.
    */
  def setDuration(duration: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.iOS.TransitionAnimation.transitionFrom> property.
    * @deprecated Set the value using <Titanium.UI.iOS.TransitionAnimation.transitionFrom> instead.
    */
  def setTransitionFrom(transitionFrom: Animation): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.iOS.TransitionAnimation.transitionTo> property.
    * @deprecated Set the value using <Titanium.UI.iOS.TransitionAnimation.transitionTo> instead.
    */
  def setTransitionTo(transitionTo: Animation): Unit = js.native
  
  /**
    * Animation to hide the current window.
    */
  var transitionFrom: Animation = js.native
  
  /**
    * Animation to show the new window.
    */
  var transitionTo: Animation = js.native
}
