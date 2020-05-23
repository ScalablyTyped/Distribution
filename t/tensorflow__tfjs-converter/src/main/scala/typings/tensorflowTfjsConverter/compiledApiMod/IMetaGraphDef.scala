package typings.tensorflowTfjsConverter.compiledApiMod

import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowTfjsConverter.compiledApiMod.MetaGraphDef.IMetaInfoDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMetaGraphDef extends js.Object {
  /** MetaGraphDef assetFileDef */
  var assetFileDef: js.UndefOr[js.Array[IAssetFileDef] | Null] = js.undefined
  /** MetaGraphDef collectionDef */
  var collectionDef: js.UndefOr[StringDictionary[ICollectionDef] | Null] = js.undefined
  /** MetaGraphDef graphDef */
  var graphDef: js.UndefOr[IGraphDef | Null] = js.undefined
  /** MetaGraphDef metaInfoDef */
  var metaInfoDef: js.UndefOr[IMetaInfoDef | Null] = js.undefined
  /** MetaGraphDef saverDef */
  var saverDef: js.UndefOr[ISaverDef | Null] = js.undefined
  /** MetaGraphDef signatureDef */
  var signatureDef: js.UndefOr[StringDictionary[ISignatureDef] | Null] = js.undefined
}

object IMetaGraphDef {
  @scala.inline
  def apply(
    assetFileDef: js.UndefOr[Null | js.Array[IAssetFileDef]] = js.undefined,
    collectionDef: js.UndefOr[Null | StringDictionary[ICollectionDef]] = js.undefined,
    graphDef: js.UndefOr[Null | IGraphDef] = js.undefined,
    metaInfoDef: js.UndefOr[Null | IMetaInfoDef] = js.undefined,
    saverDef: js.UndefOr[Null | ISaverDef] = js.undefined,
    signatureDef: js.UndefOr[Null | StringDictionary[ISignatureDef]] = js.undefined
  ): IMetaGraphDef = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(assetFileDef)) __obj.updateDynamic("assetFileDef")(assetFileDef.asInstanceOf[js.Any])
    if (!js.isUndefined(collectionDef)) __obj.updateDynamic("collectionDef")(collectionDef.asInstanceOf[js.Any])
    if (!js.isUndefined(graphDef)) __obj.updateDynamic("graphDef")(graphDef.asInstanceOf[js.Any])
    if (!js.isUndefined(metaInfoDef)) __obj.updateDynamic("metaInfoDef")(metaInfoDef.asInstanceOf[js.Any])
    if (!js.isUndefined(saverDef)) __obj.updateDynamic("saverDef")(saverDef.asInstanceOf[js.Any])
    if (!js.isUndefined(signatureDef)) __obj.updateDynamic("signatureDef")(signatureDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMetaGraphDef]
  }
}

