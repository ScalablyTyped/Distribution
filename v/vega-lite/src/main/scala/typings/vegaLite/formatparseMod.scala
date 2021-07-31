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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatparseMod {
  
  @JSImport("vega-lite/build/src/compile/data/formatparse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
    
    @JSImport("vega-lite/build/src/compile/data/formatparse", "ParseNode")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a parse node from a data.format.parse and updates ancestorParse.
      */
    @scala.inline
    def makeExplicit(parent: DataFlowNode, model: Model, ancestorParse: AncestorParse): ParseNode = (^.asInstanceOf[js.Dynamic].applyDynamic("makeExplicit")(parent.asInstanceOf[js.Any], model.asInstanceOf[js.Any], ancestorParse.asInstanceOf[js.Any])).asInstanceOf[ParseNode]
    
    /**
      * Creates a parse node from "explicit" parse and "implicit" parse and updates ancestorParse.
      */
    @scala.inline
    def makeWithAncestors(parent: DataFlowNode, explicit: Parse, `implicit`: Parse, ancestorParse: AncestorParse): ParseNode = (^.asInstanceOf[js.Dynamic].applyDynamic("makeWithAncestors")(parent.asInstanceOf[js.Any], explicit.asInstanceOf[js.Any], `implicit`.asInstanceOf[js.Any], ancestorParse.asInstanceOf[js.Any])).asInstanceOf[ParseNode]
  }
  
  @scala.inline
  def getImplicitFromEncoding(model: Model): Record[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getImplicitFromEncoding")(model.asInstanceOf[js.Any]).asInstanceOf[Record[String, String]]
  
  @scala.inline
  def getImplicitFromFilterTransform(transform: FilterTransform): Record[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getImplicitFromFilterTransform")(transform.asInstanceOf[js.Any]).asInstanceOf[Record[String, String]]
  
  @scala.inline
  def getImplicitFromSelection(model: Model): Record[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getImplicitFromSelection")(model.asInstanceOf[js.Any]).asInstanceOf[Record[String, String]]
}
