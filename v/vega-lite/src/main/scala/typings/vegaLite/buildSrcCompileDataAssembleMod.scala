package typings.vegaLite

import typings.vegaLite.buildSrcCompileDataFacetMod.FacetNode
import typings.vegaLite.buildSrcCompileDataMod.DataComponent
import typings.vegaLite.buildSrcDataMod.InlineDataset
import typings.vegaLite.buildSrcUtilMod.Dict
import typings.vegaLite.buildSrcVegaDotschemaMod.VgData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileDataAssembleMod {
  
  @JSImport("vega-lite/build/src/compile/data/assemble", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assembleFacetData(root: FacetNode): js.Array[VgData] = ^.asInstanceOf[js.Dynamic].applyDynamic("assembleFacetData")(root.asInstanceOf[js.Any]).asInstanceOf[js.Array[VgData]]
  
  inline def assembleRootData(dataComponent: DataComponent, datasets: Dict[InlineDataset]): js.Array[VgData] = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleRootData")(dataComponent.asInstanceOf[js.Any], datasets.asInstanceOf[js.Any])).asInstanceOf[js.Array[VgData]]
}
