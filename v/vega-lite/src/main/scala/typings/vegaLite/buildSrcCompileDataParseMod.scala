package typings.vegaLite

import typings.vegaLite.buildSrcCompileDataDataflowMod.DataFlowNode
import typings.vegaLite.buildSrcCompileDataMod.AncestorParse
import typings.vegaLite.buildSrcCompileDataMod.DataComponent
import typings.vegaLite.buildSrcCompileDataSourceMod.SourceNode
import typings.vegaLite.buildSrcCompileModelMod.Model
import typings.vegaLite.buildSrcDataMod.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileDataParseMod {
  
  @JSImport("vega-lite/build/src/compile/data/parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findSource(data: Data, sources: js.Array[SourceNode]): SourceNode = (^.asInstanceOf[js.Dynamic].applyDynamic("findSource")(data.asInstanceOf[js.Any], sources.asInstanceOf[js.Any])).asInstanceOf[SourceNode]
  
  inline def parseData(model: Model): DataComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("parseData")(model.asInstanceOf[js.Any]).asInstanceOf[DataComponent]
  
  inline def parseTransformArray(head: DataFlowNode, model: Model, ancestorParse: AncestorParse): DataFlowNode = (^.asInstanceOf[js.Dynamic].applyDynamic("parseTransformArray")(head.asInstanceOf[js.Any], model.asInstanceOf[js.Any], ancestorParse.asInstanceOf[js.Any])).asInstanceOf[DataFlowNode]
}
