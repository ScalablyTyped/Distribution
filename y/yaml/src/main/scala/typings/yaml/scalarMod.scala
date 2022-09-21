package typings.yaml

import typings.yaml.cstMod.BlockScalar
import typings.yaml.cstMod.FlowScalar
import typings.yaml.nodeMod.NodeBase
import typings.yaml.nodeMod.Range
import typings.yaml.nodeMod._Node
import typings.yaml.nodeMod._ParsedNode
import typings.yaml.scalarMod.Scalar.Type
import typings.yaml.toJSMod.ToJSContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scalarMod {
  
  @JSImport("yaml/dist/nodes/Scalar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yaml/dist/nodes/Scalar", "Scalar")
  @js.native
  open class Scalar[T] protected ()
    extends NodeBase
       with _Node[T] {
    def this(value: T) = this()
    
    /** An optional anchor on this node. Used by alias nodes. */
    var anchor: js.UndefOr[String] = js.native
    
    /**
      * By default (undefined), numbers use decimal notation.
      * The YAML 1.2 core schema only supports 'HEX' and 'OCT'.
      * The YAML 1.1 schema also supports 'BIN' and 'TIME'
      */
    var format: js.UndefOr[String] = js.native
    
    /** If `value` is a number, use this value when stringifying this node. */
    var minFractionDigits: js.UndefOr[Double] = js.native
    
    /** Set during parsing to the source string value */
    var source: js.UndefOr[String] = js.native
    
    def toJSON(arg: Any): Any = js.native
    def toJSON(arg: Any, ctx: ToJSContext): Any = js.native
    def toJSON(arg: Unit, ctx: ToJSContext): Any = js.native
    
    /** The scalar style used for the node's string representation */
    var `type`: js.UndefOr[Type] = js.native
    
    var value: T = js.native
  }
  /* static members */
  object Scalar {
    
    @JSImport("yaml/dist/nodes/Scalar", "Scalar.BLOCK_FOLDED")
    @js.native
    val BLOCK_FOLDED: /* "BLOCK_FOLDED" */ String = js.native
    type BLOCK_FOLDED = typings.yaml.yamlStrings.BLOCK_FOLDED
    
    @JSImport("yaml/dist/nodes/Scalar", "Scalar.BLOCK_LITERAL")
    @js.native
    val BLOCK_LITERAL: /* "BLOCK_LITERAL" */ String = js.native
    type BLOCK_LITERAL = typings.yaml.yamlStrings.BLOCK_LITERAL
    
    @JSImport("yaml/dist/nodes/Scalar", "Scalar.PLAIN")
    @js.native
    val PLAIN: /* "PLAIN" */ String = js.native
    type PLAIN = typings.yaml.yamlStrings.PLAIN
    
    @JSImport("yaml/dist/nodes/Scalar", "Scalar.QUOTE_DOUBLE")
    @js.native
    val QUOTE_DOUBLE: /* "QUOTE_DOUBLE" */ String = js.native
    type QUOTE_DOUBLE = typings.yaml.yamlStrings.QUOTE_DOUBLE
    
    @JSImport("yaml/dist/nodes/Scalar", "Scalar.QUOTE_SINGLE")
    @js.native
    val QUOTE_SINGLE: /* "QUOTE_SINGLE" */ String = js.native
    type QUOTE_SINGLE = typings.yaml.yamlStrings.QUOTE_SINGLE
    
    @js.native
    trait Parsed
      extends Scalar[Any]
         with _ParsedNode {
      
      @JSName("range")
      var range_Parsed: Range = js.native
      
      @JSName("source")
      var source_Parsed: String = js.native
      
      @JSName("srcToken")
      var srcToken_Parsed: js.UndefOr[FlowScalar | BlockScalar] = js.native
    }
    
    type Type = typings.yaml.scalarMod.Scalar.BLOCK_FOLDED | typings.yaml.scalarMod.Scalar.BLOCK_LITERAL | typings.yaml.scalarMod.Scalar.PLAIN | typings.yaml.scalarMod.Scalar.QUOTE_DOUBLE | typings.yaml.scalarMod.Scalar.QUOTE_SINGLE
  }
  
  inline def isScalarValue(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isScalarValue")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
