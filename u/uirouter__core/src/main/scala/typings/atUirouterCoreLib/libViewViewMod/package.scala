package typings
package atUirouterCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libViewViewMod {
  type ViewConfigFactory = js.Function2[
    /* path */ js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode], 
    /* decl */ atUirouterCoreLib.libStateInterfaceMod._ViewDeclaration, 
    atUirouterCoreLib.libViewInterfaceMod.ViewConfig | js.Array[atUirouterCoreLib.libViewInterfaceMod.ViewConfig]
  ]
  type ViewSyncListener = js.Function1[/* viewTuples */ js.Array[ViewTuple], scala.Unit]
}
