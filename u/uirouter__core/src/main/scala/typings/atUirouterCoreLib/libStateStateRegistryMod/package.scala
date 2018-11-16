package typings
package atUirouterCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libStateStateRegistryMod {
  type StateRegistryListener = js.Function2[
    /* event */ atUirouterCoreLib.atUirouterCoreLibStrings.registered | atUirouterCoreLib.atUirouterCoreLibStrings.deregistered, 
    /* states */ js.Array[atUirouterCoreLib.libStateInterfaceMod.StateDeclaration], 
    scala.Unit
  ]
}
