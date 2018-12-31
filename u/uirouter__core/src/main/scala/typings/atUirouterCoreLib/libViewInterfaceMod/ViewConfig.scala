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

