package typings.telegramWebApp

import typings.telegramWebApp.telegramWebAppStrings.error
import typings.telegramWebApp.telegramWebAppStrings.heavy
import typings.telegramWebApp.telegramWebAppStrings.light
import typings.telegramWebApp.telegramWebAppStrings.medium
import typings.telegramWebApp.telegramWebAppStrings.rigid
import typings.telegramWebApp.telegramWebAppStrings.soft
import typings.telegramWebApp.telegramWebAppStrings.success
import typings.telegramWebApp.telegramWebAppStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *  This object controls haptic feedback.
  */
trait HapticFeedback extends StObject {
  
  /**
    * A method tells that an impact occurred. The Telegram app may play the
    * appropriate haptics based on style value passed. Style can be one of
    * these values:
    * - light, indicates a collision between small or lightweight UI objects,
    * - medium, indicates a collision between medium-sized or medium-weight UI
    *   objects,
    * - heavy, indicates a collision between large or heavyweight UI objects,
    * - rigid, indicates a collision between hard or inflexible UI objects,
    * - soft, indicates a collision between soft or flexible UI objects.
    */
  def impactOccurred(style: light | medium | heavy | rigid | soft): js.Function0[Unit]
  
  /**
    * A method tells that a task or action has succeeded, failed, or produced a
    * warning. The Telegram app may play the appropriate haptics based on type
    * value passed. Type can be one of these values:
    * - error, indicates that a task or action has failed,
    * - success, indicates that a task or action has completed successfully,
    * - warning, indicates that a task or action produced a warning.
    */
  def notificationOccurred(`type`: error | success | warning): js.Function0[Unit]
  
  /**
    * A method tells that the user has changed a selection. The Telegram app
    * may play the appropriate haptics.
    *
    * Do not use this feedback when the user makes or confirms a selection; use
    * it only when the selection changes.
    */
  def selectionChanged(): Unit
}
object HapticFeedback {
  
  inline def apply(
    impactOccurred: light | medium | heavy | rigid | soft => js.Function0[Unit],
    notificationOccurred: error | success | warning => js.Function0[Unit],
    selectionChanged: () => Unit
  ): HapticFeedback = {
    val __obj = js.Dynamic.literal(impactOccurred = js.Any.fromFunction1(impactOccurred), notificationOccurred = js.Any.fromFunction1(notificationOccurred), selectionChanged = js.Any.fromFunction0(selectionChanged))
    __obj.asInstanceOf[HapticFeedback]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HapticFeedback] (val x: Self) extends AnyVal {
    
    inline def setImpactOccurred(value: light | medium | heavy | rigid | soft => js.Function0[Unit]): Self = StObject.set(x, "impactOccurred", js.Any.fromFunction1(value))
    
    inline def setNotificationOccurred(value: error | success | warning => js.Function0[Unit]): Self = StObject.set(x, "notificationOccurred", js.Any.fromFunction1(value))
    
    inline def setSelectionChanged(value: () => Unit): Self = StObject.set(x, "selectionChanged", js.Any.fromFunction0(value))
  }
}
