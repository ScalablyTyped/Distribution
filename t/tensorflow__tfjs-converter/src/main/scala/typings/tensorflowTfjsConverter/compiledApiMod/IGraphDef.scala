package typings.tensorflowTfjsConverter.compiledApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGraphDef extends js.Object {
  /** GraphDef library */
  var library: js.UndefOr[IFunctionDefLibrary | Null] = js.native
  /** GraphDef node */
  var node: js.UndefOr[js.Array[INodeDef] | Null] = js.native
  /** GraphDef versions */
  var versions: js.UndefOr[IVersionDef | Null] = js.native
}

object IGraphDef {
  @scala.inline
  def apply(): IGraphDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGraphDef]
  }
  @scala.inline
  implicit class IGraphDefOps[Self <: IGraphDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLibrary(value: IFunctionDefLibrary): Self = this.set("library", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLibrary: Self = this.set("library", js.undefined)
    @scala.inline
    def setLibraryNull: Self = this.set("library", null)
    @scala.inline
    def setNodeVarargs(value: INodeDef*): Self = this.set("node", js.Array(value :_*))
    @scala.inline
    def setNode(value: js.Array[INodeDef]): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNode: Self = this.set("node", js.undefined)
    @scala.inline
    def setNodeNull: Self = this.set("node", null)
    @scala.inline
    def setVersions(value: IVersionDef): Self = this.set("versions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersions: Self = this.set("versions", js.undefined)
    @scala.inline
    def setVersionsNull: Self = this.set("versions", null)
  }
  
}

