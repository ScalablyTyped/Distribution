package typings.vegaLite

import typings.std.Record
import typings.vegaLite.dataMod.AncestorParse
import typings.vegaLite.dataflowMod.DataFlowNode
import typings.vegaLite.modelMod.Model
import typings.vegaLite.srcDataMod.Parse
import typings.vegaLite.transformMod.FilterTransform
import typings.vegaTypings.transformMod.FormulaTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatparseMod {
  
  @JSImport("vega-lite/build/src/compile/data/formatparse", "ParseNode")
  @js.native
  class ParseNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, parse: Parse) = this()
    
    var _parse: js.Any = js.native
    
    /**
      * Assemble an object for Vega's format.parse property.
      */
    def assembleFormatParse(): Record[String, String] = js.native
    
    def assembleTransforms(): js.Array[FormulaTransform] = js.native
    def assembleTransforms(onlyNested: Boolean): js.Array[FormulaTransform] = js.native
    
    def merge(other: ParseNode): Unit = js.native
    
    def parse: Parse = js.native
  }
  /* static members */
  object ParseNode {
    
    /**
      * Creates a parse node from a data.format.parse and updates ancestorParse.
      */
    @JSImport("vega-lite/build/src/compile/data/formatparse", "ParseNode.makeExplicit")
    @js.native
    def makeExplicit(parent: DataFlowNode, model: Model, ancestorParse: AncestorParse): ParseNode = js.native
    
    /**
      * Creates a parse node from "explicit" parse and "implicit" parse and updates ancestorParse.
      */
    @JSImport("vega-lite/build/src/compile/data/formatparse", "ParseNode.makeWithAncestors")
    @js.native
    def makeWithAncestors(parent: DataFlowNode, explicit: Parse, `implicit`: Parse, ancestorParse: AncestorParse): ParseNode = js.native
  }
  
  @JSImport("vega-lite/build/src/compile/data/formatparse", "getImplicitFromEncoding")
  @js.native
  def getImplicitFromEncoding(model: Model): Record[String, String] = js.native
  
  @JSImport("vega-lite/build/src/compile/data/formatparse", "getImplicitFromFilterTransform")
  @js.native
  def getImplicitFromFilterTransform(transform: FilterTransform): Record[String, String] = js.native
  
  @JSImport("vega-lite/build/src/compile/data/formatparse", "getImplicitFromSelection")
  @js.native
  def getImplicitFromSelection(model: Model): Record[String, String] = js.native
}
