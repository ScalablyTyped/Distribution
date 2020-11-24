package typings.universalify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("universalify", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def fromCallback(fn: js.Function1[/* repeated */ js.Any, _]): js.Function1[/* repeated */ js.Any, js.Promise[_] | Unit] = js.native
  
  def fromPromise(fn: js.Function1[/* repeated */ js.Any, _]): js.Function1[/* repeated */ js.Any, js.Promise[_] | Unit] = js.native
}
