package typings.vegaLite

import typings.vegaLite.buildSrcCompileDataDataflowMod.DataFlowNode
import typings.vegaLite.buildSrcCompileUnitMod.UnitModel
import typings.vegaTypings.typesSpecExprMod.ExprRef
import typings.vegaTypings.typesSpecTransformMod.GeoPointTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileDataGeopointMod {
  
  @JSImport("vega-lite/build/src/compile/data/geopoint", "GeoPointNode")
  @js.native
  open class GeoPointNode protected () extends DataFlowNode {
    def this(
      parent: DataFlowNode,
      projection: String,
      fields: js.Tuple2[String | ExprRef, String | ExprRef],
      as: js.Tuple2[String, String]
    ) = this()
    
    /* private */ var as: Any = js.native
    
    def assemble(): GeoPointTransform = js.native
    
    /* private */ var fields: Any = js.native
    
    /* private */ var projection: Any = js.native
  }
  /* static members */
  object GeoPointNode {
    
    @JSImport("vega-lite/build/src/compile/data/geopoint", "GeoPointNode")
    @js.native
    val ^ : js.Any = js.native
    
    inline def parseAll(parent: DataFlowNode, model: UnitModel): DataFlowNode = (^.asInstanceOf[js.Dynamic].applyDynamic("parseAll")(parent.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[DataFlowNode]
  }
}
