package typings.atUirouterCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libViewViewMod {
  import typings.atUirouterCore.libPathPathNodeMod.PathNode
  import typings.atUirouterCore.libStateInterfaceMod._ViewDeclaration
  import typings.atUirouterCore.libViewInterfaceMod.ViewConfig

  type ViewConfigFactory = js.Function2[
    /* path */ js.Array[PathNode], 
    /* decl */ _ViewDeclaration, 
    ViewConfig | js.Array[ViewConfig]
  ]
  type ViewSyncListener = js.Function1[/* viewTuples */ js.Array[ViewTuple], Unit]
}
