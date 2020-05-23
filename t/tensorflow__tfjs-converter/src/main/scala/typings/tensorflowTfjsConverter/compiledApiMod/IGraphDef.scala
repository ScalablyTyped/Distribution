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
  def apply(
    library: js.UndefOr[Null | IFunctionDefLibrary] = js.undefined,
    node: js.UndefOr[Null | js.Array[INodeDef]] = js.undefined,
    versions: js.UndefOr[Null | IVersionDef] = js.undefined
  ): IGraphDef = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(library)) __obj.updateDynamic("library")(library.asInstanceOf[js.Any])
    if (!js.isUndefined(node)) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    if (!js.isUndefined(versions)) __obj.updateDynamic("versions")(versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGraphDef]
  }
}

