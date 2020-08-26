package typings.tensorflowTfjsConverter.compiledApiMod

import typings.tensorflowTfjsConverter.compiledApiMod.CollectionDef.IAnyList
import typings.tensorflowTfjsConverter.compiledApiMod.CollectionDef.IBytesList
import typings.tensorflowTfjsConverter.compiledApiMod.CollectionDef.IFloatList
import typings.tensorflowTfjsConverter.compiledApiMod.CollectionDef.IInt64List
import typings.tensorflowTfjsConverter.compiledApiMod.CollectionDef.INodeList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICollectionDef extends js.Object {
  /** CollectionDef anyList */
  var anyList: js.UndefOr[IAnyList | Null] = js.native
  /** CollectionDef bytesList */
  var bytesList: js.UndefOr[IBytesList | Null] = js.native
  /** CollectionDef floatList */
  var floatList: js.UndefOr[IFloatList | Null] = js.native
  /** CollectionDef int64List */
  var int64List: js.UndefOr[IInt64List | Null] = js.native
  /** CollectionDef nodeList */
  var nodeList: js.UndefOr[INodeList | Null] = js.native
}

object ICollectionDef {
  @scala.inline
  def apply(): ICollectionDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICollectionDef]
  }
  @scala.inline
  implicit class ICollectionDefOps[Self <: ICollectionDef] (val x: Self) extends AnyVal {
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
    def setAnyList(value: IAnyList): Self = this.set("anyList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnyList: Self = this.set("anyList", js.undefined)
    @scala.inline
    def setAnyListNull: Self = this.set("anyList", null)
    @scala.inline
    def setBytesList(value: IBytesList): Self = this.set("bytesList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBytesList: Self = this.set("bytesList", js.undefined)
    @scala.inline
    def setBytesListNull: Self = this.set("bytesList", null)
    @scala.inline
    def setFloatList(value: IFloatList): Self = this.set("floatList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloatList: Self = this.set("floatList", js.undefined)
    @scala.inline
    def setFloatListNull: Self = this.set("floatList", null)
    @scala.inline
    def setInt64List(value: IInt64List): Self = this.set("int64List", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInt64List: Self = this.set("int64List", js.undefined)
    @scala.inline
    def setInt64ListNull: Self = this.set("int64List", null)
    @scala.inline
    def setNodeList(value: INodeList): Self = this.set("nodeList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeList: Self = this.set("nodeList", js.undefined)
    @scala.inline
    def setNodeListNull: Self = this.set("nodeList", null)
  }
  
}

