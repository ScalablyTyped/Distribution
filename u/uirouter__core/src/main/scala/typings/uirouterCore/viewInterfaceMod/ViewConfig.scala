package typings.uirouterCore.viewInterfaceMod

import typings.uirouterCore.pathNodeMod.PathNode
import typings.uirouterCore.stateInterfaceMod.ViewDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewConfig extends js.Object {
  @JSName("$id")
  var $id: Double
  var loaded: Boolean
  /** The node the ViewConfig is bound to */
  var path: js.Array[PathNode]
  /** The normalized view declaration from [[State.views]] */
  var viewDecl: ViewDeclaration
  /** Fetches templates, runs dynamic (controller|template)Provider code, lazy loads Components, etc */
  def load(): js.Promise[ViewConfig]
}

object ViewConfig {
  @scala.inline
  def apply(
    $id: Double,
    load: () => js.Promise[ViewConfig],
    loaded: Boolean,
    path: js.Array[PathNode],
    viewDecl: ViewDeclaration
  ): ViewConfig = {
    val __obj = js.Dynamic.literal($id = $id.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), loaded = loaded.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], viewDecl = viewDecl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewConfig]
  }
}

