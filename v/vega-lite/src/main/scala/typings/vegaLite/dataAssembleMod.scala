package typings.vegaLite

import typings.vegaLite.dataMod.DataComponent
import typings.vegaLite.facetMod.FacetNode
import typings.vegaLite.srcDataMod.InlineDataset
import typings.vegaLite.utilMod.Dict
import typings.vegaLite.vegaSchemaMod.VgData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataAssembleMod {
  
  @JSImport("vega-lite/build/src/compile/data/assemble", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def assembleFacetData(root: FacetNode): js.Array[VgData] = ^.asInstanceOf[js.Dynamic].applyDynamic("assembleFacetData")(root.asInstanceOf[js.Any]).asInstanceOf[js.Array[VgData]]
  
  @scala.inline
  def assembleRootData(dataComponent: DataComponent, datasets: Dict[InlineDataset]): js.Array[VgData] = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleRootData")(dataComponent.asInstanceOf[js.Any], datasets.asInstanceOf[js.Any])).asInstanceOf[js.Array[VgData]]
}
