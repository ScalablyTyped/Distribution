package typings.vegaLite

import typings.vegaLite.dataMod.AncestorParse
import typings.vegaLite.dataMod.DataComponent
import typings.vegaLite.dataflowMod.DataFlowNode
import typings.vegaLite.modelMod.Model
import typings.vegaLite.sourceMod.SourceNode
import typings.vegaLite.srcDataMod.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataParseMod {
  
  @JSImport("vega-lite/build/src/compile/data/parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findSource(data: Data, sources: js.Array[SourceNode]): SourceNode = (^.asInstanceOf[js.Dynamic].applyDynamic("findSource")(data.asInstanceOf[js.Any], sources.asInstanceOf[js.Any])).asInstanceOf[SourceNode]
  
  inline def parseData(model: Model): DataComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("parseData")(model.asInstanceOf[js.Any]).asInstanceOf[DataComponent]
  
  inline def parseTransformArray(head: DataFlowNode, model: Model, ancestorParse: AncestorParse): DataFlowNode = (^.asInstanceOf[js.Dynamic].applyDynamic("parseTransformArray")(head.asInstanceOf[js.Any], model.asInstanceOf[js.Any], ancestorParse.asInstanceOf[js.Any])).asInstanceOf[DataFlowNode]
}
