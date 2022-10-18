package typings.wordpressAdmin.anon

import org.scalablytyped.runtime.StringDictionary
import typings.backbone.mod.Collection
import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivateMode extends StObject {
  
  /**
    * Activate a mode on the frame.
    */
  def activateMode(mode: String): typings.wordpressAdmin.componentsMediaViewsMod.Frame
  
  /**
    * Deactivate a mode on the frame.
    */
  def deactivateMode(mode: String): typings.wordpressAdmin.componentsMediaViewsMod.Frame
  
  def initialize(): Unit
  
  /**
    * Check if a mode is enabled on the frame.
    */
  def isModeActive(mode: String): Boolean
  
  /**
    * Reset all states on the frame to their defaults.
    */
  def reset(): typings.wordpressAdmin.componentsMediaViewsMod.Frame
  
  def triggerModeEvents(
    model: Model[Any, ModelSetOptions, Any],
    collection: Collection[Model[Any, ModelSetOptions, Any]],
    options: StringDictionary[String]
  ): Unit
}
object ActivateMode {
  
  inline def apply(
    activateMode: String => typings.wordpressAdmin.componentsMediaViewsMod.Frame,
    deactivateMode: String => typings.wordpressAdmin.componentsMediaViewsMod.Frame,
    initialize: () => Unit,
    isModeActive: String => Boolean,
    reset: () => typings.wordpressAdmin.componentsMediaViewsMod.Frame,
    triggerModeEvents: (Model[Any, ModelSetOptions, Any], Collection[Model[Any, ModelSetOptions, Any]], StringDictionary[String]) => Unit
  ): ActivateMode = {
    val __obj = js.Dynamic.literal(activateMode = js.Any.fromFunction1(activateMode), deactivateMode = js.Any.fromFunction1(deactivateMode), initialize = js.Any.fromFunction0(initialize), isModeActive = js.Any.fromFunction1(isModeActive), reset = js.Any.fromFunction0(reset), triggerModeEvents = js.Any.fromFunction3(triggerModeEvents))
    __obj.asInstanceOf[ActivateMode]
  }
  
  extension [Self <: ActivateMode](x: Self) {
    
    inline def setActivateMode(value: String => typings.wordpressAdmin.componentsMediaViewsMod.Frame): Self = StObject.set(x, "activateMode", js.Any.fromFunction1(value))
    
    inline def setDeactivateMode(value: String => typings.wordpressAdmin.componentsMediaViewsMod.Frame): Self = StObject.set(x, "deactivateMode", js.Any.fromFunction1(value))
    
    inline def setInitialize(value: () => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction0(value))
    
    inline def setIsModeActive(value: String => Boolean): Self = StObject.set(x, "isModeActive", js.Any.fromFunction1(value))
    
    inline def setReset(value: () => typings.wordpressAdmin.componentsMediaViewsMod.Frame): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setTriggerModeEvents(
      value: (Model[Any, ModelSetOptions, Any], Collection[Model[Any, ModelSetOptions, Any]], StringDictionary[String]) => Unit
    ): Self = StObject.set(x, "triggerModeEvents", js.Any.fromFunction3(value))
  }
}
