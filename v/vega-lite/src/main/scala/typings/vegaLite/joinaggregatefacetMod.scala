package typings.vegaLite

import typings.vegaLite.dataflowMod.DataFlowNode
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.joinaggregateMod.JoinAggregateTransformNode
import typings.vegaLite.specFacetMod.FacetFieldDef
import typings.vegaLite.specFacetMod.FacetMapping
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object joinaggregatefacetMod {
  
  @JSImport("vega-lite/build/src/compile/data/joinaggregatefacet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeJoinAggregateFromFacet(parent: DataFlowNode, facet: FacetMapping[String, FacetFieldDef[String, ExprRef | SignalRef]]): JoinAggregateTransformNode = (^.asInstanceOf[js.Dynamic].applyDynamic("makeJoinAggregateFromFacet")(parent.asInstanceOf[js.Any], facet.asInstanceOf[js.Any])).asInstanceOf[JoinAggregateTransformNode]
}
