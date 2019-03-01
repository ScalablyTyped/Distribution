package typings
package atUirouterCoreLib.libViewInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewConfig extends js.Object {
  @JSName("$id")
  var $id: scala.Double
  var loaded: scala.Boolean
  /** The node the ViewConfig is bound to */
  var path: js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode]
  /** The normalized view declaration from [[State.views]] */
  var viewDecl: atUirouterCoreLib.libStateInterfaceMod._ViewDeclaration
  /** Fetches templates, runs dynamic (controller|template)Provider code, lazy loads Components, etc */
  def load(): js.Promise[ViewConfig]
}

object ViewConfig {
  @scala.inline
  def apply(
    $id: scala.Double,
    load: js.Function0[js.Promise[ViewConfig]],
    loaded: scala.Boolean,
    path: js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode],
    viewDecl: atUirouterCoreLib.libStateInterfaceMod._ViewDeclaration
  ): ViewConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$id")($id)
    __obj.updateDynamic("load")(load)
    __obj.updateDynamic("loaded")(loaded)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("viewDecl")(viewDecl)
    __obj.asInstanceOf[ViewConfig]
  }
}

