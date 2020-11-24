package typings.wonka.wonkaObservableMod

import typings.wonka.wonkaTypesMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonka/src/web/wonka_observable", "toObservable")
@js.native
object toObservable extends js.Object {
  
  def apply[T](source: Source[T]): JsObservable[T] = js.native
}
