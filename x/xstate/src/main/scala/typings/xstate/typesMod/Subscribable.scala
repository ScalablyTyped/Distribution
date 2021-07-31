package typings.xstate.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Subscribable[T] extends StObject {
  
  def subscribe(): Unsubscribable = js.native
  def subscribe(next: js.Function1[/* value */ T, Unit]): Unsubscribable = js.native
  def subscribe(next: js.Function1[/* value */ T, Unit], error: js.Function1[/* error */ js.Any, Unit]): Unsubscribable = js.native
  def subscribe(
    next: js.Function1[/* value */ T, Unit],
    error: js.Function1[/* error */ js.Any, Unit],
    complete: js.Function0[Unit]
  ): Unsubscribable = js.native
  def subscribe(next: js.Function1[/* value */ T, Unit], error: Unit, complete: js.Function0[Unit]): Unsubscribable = js.native
  def subscribe(next: Unit, error: js.Function1[/* error */ js.Any, Unit]): Unsubscribable = js.native
  def subscribe(next: Unit, error: js.Function1[/* error */ js.Any, Unit], complete: js.Function0[Unit]): Unsubscribable = js.native
  def subscribe(next: Unit, error: Unit, complete: js.Function0[Unit]): Unsubscribable = js.native
}
