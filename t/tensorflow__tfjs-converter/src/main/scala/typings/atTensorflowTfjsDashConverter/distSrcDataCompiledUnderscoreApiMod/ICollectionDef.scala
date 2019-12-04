package typings.atTensorflowTfjsDashConverter.distSrcDataCompiledUnderscoreApiMod

import typings.atTensorflowTfjsDashConverter.distSrcDataCompiledUnderscoreApiMod.CollectionDef.IAnyList
import typings.atTensorflowTfjsDashConverter.distSrcDataCompiledUnderscoreApiMod.CollectionDef.IBytesList
import typings.atTensorflowTfjsDashConverter.distSrcDataCompiledUnderscoreApiMod.CollectionDef.IFloatList
import typings.atTensorflowTfjsDashConverter.distSrcDataCompiledUnderscoreApiMod.CollectionDef.IInt64List
import typings.atTensorflowTfjsDashConverter.distSrcDataCompiledUnderscoreApiMod.CollectionDef.INodeList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICollectionDef extends js.Object {
  /** CollectionDef anyList */
  var anyList: js.UndefOr[IAnyList | Null] = js.undefined
  /** CollectionDef bytesList */
  var bytesList: js.UndefOr[IBytesList | Null] = js.undefined
  /** CollectionDef floatList */
  var floatList: js.UndefOr[IFloatList | Null] = js.undefined
  /** CollectionDef int64List */
  var int64List: js.UndefOr[IInt64List | Null] = js.undefined
  /** CollectionDef nodeList */
  var nodeList: js.UndefOr[INodeList | Null] = js.undefined
}

object ICollectionDef {
  @scala.inline
  def apply(
    anyList: IAnyList = null,
    bytesList: IBytesList = null,
    floatList: IFloatList = null,
    int64List: IInt64List = null,
    nodeList: INodeList = null
  ): ICollectionDef = {
    val __obj = js.Dynamic.literal()
    if (anyList != null) __obj.updateDynamic("anyList")(anyList.asInstanceOf[js.Any])
    if (bytesList != null) __obj.updateDynamic("bytesList")(bytesList.asInstanceOf[js.Any])
    if (floatList != null) __obj.updateDynamic("floatList")(floatList.asInstanceOf[js.Any])
    if (int64List != null) __obj.updateDynamic("int64List")(int64List.asInstanceOf[js.Any])
    if (nodeList != null) __obj.updateDynamic("nodeList")(nodeList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICollectionDef]
  }
}

