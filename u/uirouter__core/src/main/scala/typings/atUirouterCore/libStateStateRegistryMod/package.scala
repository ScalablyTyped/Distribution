package typings.atUirouterCore

import typings.atUirouterCore.atUirouterCoreStrings.deregistered
import typings.atUirouterCore.atUirouterCoreStrings.registered
import typings.atUirouterCore.libStateInterfaceMod.StateDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libStateStateRegistryMod {
  type StateRegistryListener = js.Function2[/* event */ registered | deregistered, /* states */ js.Array[StateDeclaration], Unit]
}
