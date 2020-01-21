package typings.uirouterCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object viewViewMod {
  type ViewConfigFactory = js.Function2[
    /* path */ js.Array[typings.uirouterCore.pathNodeMod.PathNode], 
    /* decl */ typings.uirouterCore.stateInterfaceMod.ViewDeclaration, 
    typings.uirouterCore.viewInterfaceMod.ViewConfig | js.Array[typings.uirouterCore.viewInterfaceMod.ViewConfig]
  ]
  type ViewSyncListener = js.Function1[/* viewTuples */ js.Array[typings.uirouterCore.viewViewMod.ViewTuple], scala.Unit]
}
