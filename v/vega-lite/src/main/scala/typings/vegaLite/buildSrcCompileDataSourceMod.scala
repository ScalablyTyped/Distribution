package typings.vegaLite

import typings.vegaLite.anon.PartialVgData
import typings.vegaLite.buildSrcCompileDataDataflowMod.DataFlowNode
import typings.vegaLite.buildSrcDataMod.Data
import typings.vegaLite.buildSrcVegaDotschemaMod.VgData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileDataSourceMod {
  
  @JSImport("vega-lite/build/src/compile/data/source", "SourceNode")
  @js.native
  open class SourceNode protected () extends DataFlowNode {
    def this(data: Data) = this()
    
    /* private */ var _data: Any = js.native
    
    /* private */ var _generator: Any = js.native
    
    /* private */ var _name: Any = js.native
    
    def assemble(): VgData = js.native
    
    def data: PartialVgData = js.native
    
    def dataName: String = js.native
    def dataName_=(name: String): Unit = js.native
    
    def hasName(): Boolean = js.native
    
    def isGenerator: Boolean = js.native
  }
}
