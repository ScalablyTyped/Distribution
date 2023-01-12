package typings.vscodeLanguageclient.libCommonFeaturesMod

import typings.vscode.mod.Disposable
import typings.vscode.mod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotifyingFeature[E, P] extends StObject {
  
  def onNotificationSent(listener: js.Function1[/* e */ NotificationSendEvent[E, P], Any]): Disposable
  def onNotificationSent(listener: js.Function1[/* e */ NotificationSendEvent[E, P], Any], thisArgs: Any): Disposable
  def onNotificationSent(
    listener: js.Function1[/* e */ NotificationSendEvent[E, P], Any],
    thisArgs: Any,
    disposables: js.Array[Disposable]
  ): Disposable
  def onNotificationSent(
    listener: js.Function1[/* e */ NotificationSendEvent[E, P], Any],
    thisArgs: Unit,
    disposables: js.Array[Disposable]
  ): Disposable
  @JSName("onNotificationSent")
  var onNotificationSent_Original: Event[NotificationSendEvent[E, P]]
}
object NotifyingFeature {
  
  inline def apply[E, P](
    onNotificationSent: (/* listener */ js.Function1[NotificationSendEvent[E, P], Any], /* thisArgs */ js.UndefOr[Any], /* disposables */ js.UndefOr[js.Array[Disposable]]) => Disposable
  ): NotifyingFeature[E, P] = {
    val __obj = js.Dynamic.literal(onNotificationSent = js.Any.fromFunction3(onNotificationSent))
    __obj.asInstanceOf[NotifyingFeature[E, P]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotifyingFeature[?, ?], E, P] (val x: Self & (NotifyingFeature[E, P])) extends AnyVal {
    
    inline def setOnNotificationSent(
      value: (/* listener */ js.Function1[NotificationSendEvent[E, P], Any], /* thisArgs */ js.UndefOr[Any], /* disposables */ js.UndefOr[js.Array[Disposable]]) => Disposable
    ): Self = StObject.set(x, "onNotificationSent", js.Any.fromFunction3(value))
  }
}
