package typings.vegaLite

import typings.vegaLite.dataflowMod.DataFlowNode
import typings.vegaLite.unitMod.UnitModel
import typings.vegaTypings.exprMod.ExprRef
import typings.vegaTypings.transformMod.GeoJSONTransform
import typings.vegaTypings.utilMod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geojsonMod {
  
  @JSImport("vega-lite/build/src/compile/data/geojson", "GeoJSONNode")
  @js.native
  class GeoJSONNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode) = this()
    def this(parent: DataFlowNode, fields: Vector2[String | ExprRef]) = this()
    def this(parent: DataFlowNode, fields: Unit, geojson: String) = this()
    def this(parent: DataFlowNode, fields: Vector2[String | ExprRef], geojson: String) = this()
    def this(parent: DataFlowNode, fields: Unit, geojson: String, signal: String) = this()
    def this(parent: DataFlowNode, fields: Unit, geojson: Unit, signal: String) = this()
    def this(parent: DataFlowNode, fields: Vector2[String | ExprRef], geojson: String, signal: String) = this()
    def this(parent: DataFlowNode, fields: Vector2[String | ExprRef], geojson: Unit, signal: String) = this()
    
    def assemble(): GeoJSONTransform = js.native
    
    var fields: js.Any = js.native
    
    var geojson: js.Any = js.native
    
    var signal: js.Any = js.native
  }
  /* static members */
  object GeoJSONNode {
    
    @JSImport("vega-lite/build/src/compile/data/geojson", "GeoJSONNode")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def parseAll(parent: DataFlowNode, model: UnitModel): DataFlowNode = (^.asInstanceOf[js.Dynamic].applyDynamic("parseAll")(parent.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[DataFlowNode]
  }
}
