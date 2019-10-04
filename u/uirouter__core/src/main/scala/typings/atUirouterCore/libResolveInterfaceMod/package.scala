package typings.atUirouterCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libResolveInterfaceMod {
  type CustomAsyncPolicy = js.Function1[/* data */ js.Any, js.Promise[js.Any]]
  /* Rewritten from type alias, can be one of: 
    - typings.atUirouterCore.atUirouterCoreStrings.WAIT
    - typings.atUirouterCore.atUirouterCoreStrings.NOWAIT
    - typings.atUirouterCore.libResolveInterfaceMod.CustomAsyncPolicy
  */
  type PolicyAsync = _PolicyAsync | CustomAsyncPolicy
}
