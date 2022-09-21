package typings.xstate.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Subscribable[T]
  extends StObject
     with InteropSubscribable[T] {
  
  def subscribe(next: js.Function1[/* value */ T, Unit]): Subscription = js.native
  def subscribe(next: js.Function1[/* value */ T, Unit], error: js.Function1[/* error */ Any, Unit]): Subscription = js.native
  def subscribe(
    next: js.Function1[/* value */ T, Unit],
    error: js.Function1[/* error */ Any, Unit],
    complete: js.Function0[Unit]
  ): Subscription = js.native
  def subscribe(next: js.Function1[/* value */ T, Unit], error: Unit, complete: js.Function0[Unit]): Subscription = js.native
}
