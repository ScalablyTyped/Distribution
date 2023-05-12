package typings.vscodeLanguageclient.libCommonFeaturesMod

import typings.vscode.mod.Disposable
import typings.vscode.mod.Event
import typings.vscodeLanguageclient.anon.TextDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotifyingFeature[P /* <: TextDocument */] extends StObject {
  
  def onNotificationSent(listener: js.Function1[/* e */ NotificationSendEvent[P], Any]): Disposable
  def onNotificationSent(listener: js.Function1[/* e */ NotificationSendEvent[P], Any], thisArgs: Any): Disposable
  def onNotificationSent(
    listener: js.Function1[/* e */ NotificationSendEvent[P], Any],
    thisArgs: Any,
    disposables: js.Array[Disposable]
  ): Disposable
  def onNotificationSent(
    listener: js.Function1[/* e */ NotificationSendEvent[P], Any],
    thisArgs: Unit,
    disposables: js.Array[Disposable]
  ): Disposable
  @JSName("onNotificationSent")
  var onNotificationSent_Original: Event[NotificationSendEvent[P]]
}
object NotifyingFeature {
  
  inline def apply[P /* <: TextDocument */](
    onNotificationSent: (/* listener */ js.Function1[NotificationSendEvent[P], Any], /* thisArgs */ js.UndefOr[Any], /* disposables */ js.UndefOr[js.Array[Disposable]]) => Disposable
  ): NotifyingFeature[P] = {
    val __obj = js.Dynamic.literal(onNotificationSent = js.Any.fromFunction3(onNotificationSent))
    __obj.asInstanceOf[NotifyingFeature[P]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotifyingFeature[?], P /* <: TextDocument */] (val x: Self & NotifyingFeature[P]) extends AnyVal {
    
    inline def setOnNotificationSent(
      value: (/* listener */ js.Function1[NotificationSendEvent[P], Any], /* thisArgs */ js.UndefOr[Any], /* disposables */ js.UndefOr[js.Array[Disposable]]) => Disposable
    ): Self = StObject.set(x, "onNotificationSent", js.Any.fromFunction3(value))
  }
}
