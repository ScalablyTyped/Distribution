package typings.vegaLite

import typings.vegaLite.dataMod.AncestorParse
import typings.vegaLite.dataMod.DataComponent
import typings.vegaLite.dataflowMod.DataFlowNode
import typings.vegaLite.modelMod.Model
import typings.vegaLite.sourceMod.SourceNode
import typings.vegaLite.srcDataMod.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataParseMod {
  
  @JSImport("vega-lite/build/src/compile/data/parse", "findSource")
  @js.native
  def findSource(data: Data, sources: js.Array[SourceNode]): SourceNode = js.native
  
  @JSImport("vega-lite/build/src/compile/data/parse", "parseData")
  @js.native
  def parseData(model: Model): DataComponent = js.native
  
  @JSImport("vega-lite/build/src/compile/data/parse", "parseTransformArray")
  @js.native
  def parseTransformArray(head: DataFlowNode, model: Model, ancestorParse: AncestorParse): DataFlowNode = js.native
}
