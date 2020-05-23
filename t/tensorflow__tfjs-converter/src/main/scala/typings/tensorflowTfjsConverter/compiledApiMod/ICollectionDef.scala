package typings.tensorflowTfjsConverter.compiledApiMod

import typings.tensorflowTfjsConverter.compiledApiMod.CollectionDef.IAnyList
import typings.tensorflowTfjsConverter.compiledApiMod.CollectionDef.IBytesList
import typings.tensorflowTfjsConverter.compiledApiMod.CollectionDef.IFloatList
import typings.tensorflowTfjsConverter.compiledApiMod.CollectionDef.IInt64List
import typings.tensorflowTfjsConverter.compiledApiMod.CollectionDef.INodeList
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
    anyList: js.UndefOr[Null | IAnyList] = js.undefined,
    bytesList: js.UndefOr[Null | IBytesList] = js.undefined,
    floatList: js.UndefOr[Null | IFloatList] = js.undefined,
    int64List: js.UndefOr[Null | IInt64List] = js.undefined,
    nodeList: js.UndefOr[Null | INodeList] = js.undefined
  ): ICollectionDef = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(anyList)) __obj.updateDynamic("anyList")(anyList.asInstanceOf[js.Any])
    if (!js.isUndefined(bytesList)) __obj.updateDynamic("bytesList")(bytesList.asInstanceOf[js.Any])
    if (!js.isUndefined(floatList)) __obj.updateDynamic("floatList")(floatList.asInstanceOf[js.Any])
    if (!js.isUndefined(int64List)) __obj.updateDynamic("int64List")(int64List.asInstanceOf[js.Any])
    if (!js.isUndefined(nodeList)) __obj.updateDynamic("nodeList")(nodeList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICollectionDef]
  }
}

