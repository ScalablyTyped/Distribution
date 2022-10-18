package typings.vegaLite

import typings.vegaLite.buildSrcCompileDataDataflowMod.DataFlowNode
import typings.vegaLite.buildSrcCompileUnitMod.UnitModel
import typings.vegaTypings.typesSpecExprMod.ExprRef
import typings.vegaTypings.typesSpecTransformMod.Transforms
import typings.vegaTypings.typesSpecUtilMod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileDataGeojsonMod {
  
  @JSImport("vega-lite/build/src/compile/data/geojson", "GeoJSONNode")
  @js.native
  open class GeoJSONNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode) = this()
    def this(parent: DataFlowNode, fields: Vector2[String | ExprRef]) = this()
    def this(parent: DataFlowNode, fields: Unit, geojson: String) = this()
    def this(parent: DataFlowNode, fields: Vector2[String | ExprRef], geojson: String) = this()
    def this(parent: DataFlowNode, fields: Unit, geojson: String, signal: String) = this()
    def this(parent: DataFlowNode, fields: Unit, geojson: Unit, signal: String) = this()
    def this(parent: DataFlowNode, fields: Vector2[String | ExprRef], geojson: String, signal: String) = this()
    def this(parent: DataFlowNode, fields: Vector2[String | ExprRef], geojson: Unit, signal: String) = this()
    
    def assemble(): js.Array[Transforms] = js.native
    
    /* private */ var fields: Any = js.native
    
    /* private */ var geojson: Any = js.native
    
    /* private */ var signal: Any = js.native
  }
  /* static members */
  object GeoJSONNode {
    
    @JSImport("vega-lite/build/src/compile/data/geojson", "GeoJSONNode")
    @js.native
    val ^ : js.Any = js.native
    
    inline def parseAll(parent: DataFlowNode, model: UnitModel): DataFlowNode = (^.asInstanceOf[js.Dynamic].applyDynamic("parseAll")(parent.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[DataFlowNode]
  }
}
