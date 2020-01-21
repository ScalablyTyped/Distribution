package typings.uirouterCore.viewInterfaceMod

import typings.uirouterCore.pathNodeMod.PathNode
import typings.uirouterCore.stateInterfaceMod.ViewDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewConfig extends js.Object {
  @JSName("$id")
  var $id: Double = js.native
  var loaded: Boolean = js.native
  /** The node the ViewConfig is bound to */
  var path: js.Array[PathNode] = js.native
  /** The normalized view declaration from [[State.views]] */
  var viewDecl: ViewDeclaration = js.native
  /** Fetches templates, runs dynamic (controller|template)Provider code, lazy loads Components, etc */
  def load(): js.Promise[ViewConfig] = js.native
}

