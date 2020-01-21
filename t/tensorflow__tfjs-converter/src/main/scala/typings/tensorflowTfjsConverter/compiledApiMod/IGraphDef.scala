package typings.tensorflowTfjsConverter.compiledApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGraphDef extends js.Object {
  /** GraphDef library */
  var library: js.UndefOr[IFunctionDefLibrary | Null] = js.undefined
  /** GraphDef node */
  var node: js.UndefOr[js.Array[INodeDef] | Null] = js.undefined
  /** GraphDef versions */
  var versions: js.UndefOr[IVersionDef | Null] = js.undefined
}

object IGraphDef {
  @scala.inline
  def apply(library: IFunctionDefLibrary = null, node: js.Array[INodeDef] = null, versions: IVersionDef = null): IGraphDef = {
    val __obj = js.Dynamic.literal()
    if (library != null) __obj.updateDynamic("library")(library.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    if (versions != null) __obj.updateDynamic("versions")(versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGraphDef]
  }
}

