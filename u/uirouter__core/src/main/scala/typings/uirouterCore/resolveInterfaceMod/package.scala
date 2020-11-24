package typings.uirouterCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object resolveInterfaceMod {
  
  type CustomAsyncPolicy = js.Function1[/* data */ js.Any, js.Promise[js.Any]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.uirouterCore.uirouterCoreStrings.WAIT
    - typings.uirouterCore.uirouterCoreStrings.NOWAIT
    - typings.uirouterCore.resolveInterfaceMod.CustomAsyncPolicy
  */
  type PolicyAsync = typings.uirouterCore.resolveInterfaceMod._PolicyAsync | typings.uirouterCore.resolveInterfaceMod.CustomAsyncPolicy
}
