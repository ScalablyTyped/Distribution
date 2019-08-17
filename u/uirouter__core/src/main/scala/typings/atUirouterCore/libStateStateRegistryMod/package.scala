package typings.atUirouterCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libStateStateRegistryMod {
  import typings.atUirouterCore.atUirouterCoreStrings.deregistered
  import typings.atUirouterCore.atUirouterCoreStrings.registered
  import typings.atUirouterCore.libStateInterfaceMod.StateDeclaration

  type StateRegistryListener = js.Function2[/* event */ registered | deregistered, /* states */ js.Array[StateDeclaration], Unit]
}
