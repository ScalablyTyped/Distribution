package typings.typeFest.basicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObservableLike extends js.Object {
  
  def subscribe(observer: js.Function1[/* value */ js.Any, Unit]): Unit = js.native
}
