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
    assetFileDef: js.Array[IAssetFileDef] = null,
    collectionDef: StringDictionary[ICollectionDef] = null,
    graphDef: IGraphDef = null,
    metaInfoDef: IMetaInfoDef = null,
    saverDef: ISaverDef = null,
    signatureDef: StringDictionary[ISignatureDef] = null
  ): IMetaGraphDef = {
    val __obj = js.Dynamic.literal()
    if (assetFileDef != null) __obj.updateDynamic("assetFileDef")(assetFileDef.asInstanceOf[js.Any])
    if (collectionDef != null) __obj.updateDynamic("collectionDef")(collectionDef.asInstanceOf[js.Any])
    if (graphDef != null) __obj.updateDynamic("graphDef")(graphDef.asInstanceOf[js.Any])
    if (metaInfoDef != null) __obj.updateDynamic("metaInfoDef")(metaInfoDef.asInstanceOf[js.Any])
    if (saverDef != null) __obj.updateDynamic("saverDef")(saverDef.asInstanceOf[js.Any])
    if (signatureDef != null) __obj.updateDynamic("signatureDef")(signatureDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMetaGraphDef]
  }
}

