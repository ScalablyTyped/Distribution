package typings.three

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesMathOperatorNodeMod {
  
  @JSImport("three/examples/jsm/nodes/math/OperatorNode", JSImport.Default)
  @js.native
  open class default protected () extends OperatorNode {
    def this(
      op: OperatorNodeOp,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type [Node, Node, ...Array<Node>] is not an array type */ params: Array[typings.three.examplesJsmNodesCoreNodeMod.default]
    ) = this()
  }
  
  @js.native
  trait OperatorNode
    extends typings.three.examplesJsmNodesCoreTempNodeMod.default {
    
    var aNode: typings.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    var bNode: typings.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    var op: OperatorNodeOp = js.native
  }
  
  object OperatorNodeOp {
    
    inline def ^ : "^" = "^".asInstanceOf["^"]
    
    inline def Ampersand: "&" = "&".asInstanceOf["&"]
    
    inline def AmpersandAmpersand: "&&" = "&&".asInstanceOf["&&"]
    
    inline def Asterisk: "*" = "*".asInstanceOf["*"]
    
    inline def Equalssign: "=" = "=".asInstanceOf["="]
    
    inline def EqualssignEqualssign: "==" = "==".asInstanceOf["=="]
    
    inline def Greaterthansign: ">" = ">".asInstanceOf[">"]
    
    inline def GreaterthansignEqualssign: ">=" = ">=".asInstanceOf[">="]
    
    inline def GreaterthansignGreaterthansign: ">>" = ">>".asInstanceOf[">>"]
    
    inline def Lessthansign: "<" = "<".asInstanceOf["<"]
    
    inline def LessthansignEqualssign: "<=" = "<=".asInstanceOf["<="]
    
    inline def LessthansignLessthansign: "<<" = "<<".asInstanceOf["<<"]
    
    inline def Percentsign: "%" = "%".asInstanceOf["%"]
    
    inline def Plussign: "+" = "+".asInstanceOf["+"]
    
    inline def Slash: "/" = "/".asInstanceOf["/"]
    
    inline def Verticalline: "|" = "|".asInstanceOf["|"]
    
    inline def VerticallineVerticalline: "||" = "||".asInstanceOf["||"]
    
    inline def `^^`: "^^" = "^^".asInstanceOf["^^"]
    
    inline def _dash: "-" = "-".asInstanceOf["-"]
  }
  type OperatorNodeOp = "=" | "%" | "&" | "|" | "^" | ">>" | "<<" | "==" | "&&" | "||" | "^^" | "<" | ">" | "<=" | ">=" | "+" | "-" | "*" | "/"
}
