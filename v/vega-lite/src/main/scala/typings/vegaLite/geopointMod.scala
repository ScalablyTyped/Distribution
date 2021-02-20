package typings.vegaLite

import typings.vegaLite.dataflowMod.DataFlowNode
import typings.vegaLite.unitMod.UnitModel
import typings.vegaTypings.exprMod.ExprRef
import typings.vegaTypings.transformMod.GeoPointTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geopointMod {
  
  @JSImport("vega-lite/build/src/compile/data/geopoint", "GeoPointNode")
  @js.native
  class GeoPointNode protected () extends DataFlowNode {
    def this(
      parent: DataFlowNode,
      projection: String,
      fields: js.Tuple2[String | ExprRef, String | ExprRef],
      as: js.Tuple2[String, String]
    ) = this()
    
    var as: js.Any = js.native
    
    def assemble(): GeoPointTransform = js.native
    
    var fields: js.Any = js.native
    
    var projection: js.Any = js.native
  }
  /* static members */
  object GeoPointNode {
    
    @JSImport("vega-lite/build/src/compile/data/geopoint", "GeoPointNode.parseAll")
    @js.native
    def parseAll(parent: DataFlowNode, model: UnitModel): DataFlowNode = js.native
  }
}
