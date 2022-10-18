package typings.vegaLite

import typings.vegaLite.buildSrcCompileDataDataflowMod.DataFlowNode
import typings.vegaLite.buildSrcCompileDataMod.AncestorParse
import typings.vegaLite.buildSrcCompileModelMod.Model
import typings.vegaLite.buildSrcDataMod.Parse
import typings.vegaLite.buildSrcTransformMod.FilterTransform
import typings.vegaLite.buildSrcUtilMod.Dict
import typings.vegaTypings.typesSpecTransformMod.FormulaTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileDataFormatparseMod {
  
  @JSImport("vega-lite/build/src/compile/data/formatparse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vega-lite/build/src/compile/data/formatparse", "ParseNode")
  @js.native
  open class ParseNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, parse: Parse) = this()
    
    /* private */ var _parse: Any = js.native
    
    /**
      * Assemble an object for Vega's format.parse property.
      */
    def assembleFormatParse(): Dict[String] = js.native
    
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
    inline def makeExplicit(parent: DataFlowNode, model: Model, ancestorParse: AncestorParse): ParseNode = (^.asInstanceOf[js.Dynamic].applyDynamic("makeExplicit")(parent.asInstanceOf[js.Any], model.asInstanceOf[js.Any], ancestorParse.asInstanceOf[js.Any])).asInstanceOf[ParseNode]
    
    /**
      * Creates a parse node from "explicit" parse and "implicit" parse and updates ancestorParse.
      */
    inline def makeWithAncestors(parent: DataFlowNode, explicit: Parse, `implicit`: Parse, ancestorParse: AncestorParse): ParseNode = (^.asInstanceOf[js.Dynamic].applyDynamic("makeWithAncestors")(parent.asInstanceOf[js.Any], explicit.asInstanceOf[js.Any], `implicit`.asInstanceOf[js.Any], ancestorParse.asInstanceOf[js.Any])).asInstanceOf[ParseNode]
  }
  
  inline def getImplicitFromEncoding(model: Model): Dict[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getImplicitFromEncoding")(model.asInstanceOf[js.Any]).asInstanceOf[Dict[String]]
  
  inline def getImplicitFromFilterTransform(transform: FilterTransform): Dict[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getImplicitFromFilterTransform")(transform.asInstanceOf[js.Any]).asInstanceOf[Dict[String]]
  
  inline def getImplicitFromSelection(model: Model): Dict[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getImplicitFromSelection")(model.asInstanceOf[js.Any]).asInstanceOf[Dict[String]]
}
