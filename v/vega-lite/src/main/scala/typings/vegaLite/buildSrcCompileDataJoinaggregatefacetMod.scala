package typings.vegaLite

import typings.vegaLite.buildSrcCompileDataDataflowMod.DataFlowNode
import typings.vegaLite.buildSrcCompileDataJoinaggregateMod.JoinAggregateTransformNode
import typings.vegaLite.buildSrcExprMod.ExprRef
import typings.vegaLite.buildSrcSpecFacetMod.FacetFieldDef
import typings.vegaLite.buildSrcSpecFacetMod.FacetMapping
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileDataJoinaggregatefacetMod {
  
  @JSImport("vega-lite/build/src/compile/data/joinaggregatefacet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeJoinAggregateFromFacet(parent: DataFlowNode, facet: FacetMapping[String, FacetFieldDef[String, ExprRef | SignalRef]]): JoinAggregateTransformNode = (^.asInstanceOf[js.Dynamic].applyDynamic("makeJoinAggregateFromFacet")(parent.asInstanceOf[js.Any], facet.asInstanceOf[js.Any])).asInstanceOf[JoinAggregateTransformNode]
}
