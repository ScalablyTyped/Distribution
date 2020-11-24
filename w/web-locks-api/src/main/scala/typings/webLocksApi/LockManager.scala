package typings.webLocksApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LockManager extends js.Object {
  
  def query(): js.Promise[LockManagerSnapshot] = js.native
  
  def request(name: String, callback: js.Function1[/* lock */ Lock, js.Promise[_]]): js.Promise[js.UndefOr[scala.Nothing]] = js.native
  def request[T /* <: LockManagerRequestOptions */](name: String, options: T, callback: js.Function1[/* lock */ Lock | Null, js.Promise[_]]): js.Promise[js.UndefOr[scala.Nothing]] = js.native
}
