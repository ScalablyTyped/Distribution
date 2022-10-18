package typings.webLocksApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LockManager extends StObject {
  
  def query(): js.Promise[LockManagerSnapshot] = js.native
  
  def request(name: String, callback: js.Function1[/* lock */ Lock, js.Promise[Any]]): js.Promise[Unit] = js.native
  def request[T /* <: LockManagerRequestOptions */](
    name: String,
    options: T,
    callback: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T['ifAvailable'] extends true ? web-locks-api.Lock | null : web-locks-api.Lock */ /* lock */ js.Any, 
      js.Promise[Any]
    ]
  ): js.Promise[Unit] = js.native
}
