package typings.three

import typings.three.threeStrings.`-_`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorNodeMod {
  
  @JSImport("three/examples/jsm/nodes/math/OperatorNode", JSImport.Default)
  @js.native
  open class default protected () extends OperatorNode {
    def this(
      op: OperatorNodeOp,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type [Node, Node, ...Array<Node>] is not an array type */ params: Array[typings.three.nodeMod.default]
    ) = this()
  }
  
  @js.native
  trait OperatorNode
    extends typings.three.tempNodeMod.default {
    
    var aNode: typings.three.nodeMod.default = js.native
    
    var bNode: typings.three.nodeMod.default = js.native
    
    var op: OperatorNodeOp = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.three.threeStrings.Equalssign
    - typings.three.threeStrings.Percentsign
    - typings.three.threeStrings.Ampersand
    - typings.three.threeStrings.Verticalline
    - typings.three.threeStrings.^
    - typings.three.threeStrings.GreaterthansignGreaterthansign
    - typings.three.threeStrings.LessthansignLessthansign
    - typings.three.threeStrings.EqualssignEqualssign
    - typings.three.threeStrings.AmpersandAmpersand
    - typings.three.threeStrings.VerticallineVerticalline
    - typings.three.threeStrings.`^^`
    - typings.three.threeStrings.Lessthansign
    - typings.three.threeStrings.Greaterthansign
    - typings.three.threeStrings.LessthansignEqualssign
    - typings.three.threeStrings.GreaterthansignEqualssign
    - typings.three.threeStrings.Plussign
    - typings.three.threeStrings.`-_`
    - typings.three.threeStrings.Asterisk
    - typings.three.threeStrings.Slash
  */
  trait OperatorNodeOp extends StObject
  object OperatorNodeOp {
    
    inline def ^ : typings.three.threeStrings.^ = "^".asInstanceOf[typings.three.threeStrings.^]
    
    inline def Ampersand: typings.three.threeStrings.Ampersand = "&".asInstanceOf[typings.three.threeStrings.Ampersand]
    
    inline def AmpersandAmpersand: typings.three.threeStrings.AmpersandAmpersand = "&&".asInstanceOf[typings.three.threeStrings.AmpersandAmpersand]
    
    inline def Asterisk: typings.three.threeStrings.Asterisk = "*".asInstanceOf[typings.three.threeStrings.Asterisk]
    
    inline def Equalssign: typings.three.threeStrings.Equalssign = "=".asInstanceOf[typings.three.threeStrings.Equalssign]
    
    inline def EqualssignEqualssign: typings.three.threeStrings.EqualssignEqualssign = "==".asInstanceOf[typings.three.threeStrings.EqualssignEqualssign]
    
    inline def Greaterthansign: typings.three.threeStrings.Greaterthansign = ">".asInstanceOf[typings.three.threeStrings.Greaterthansign]
    
    inline def GreaterthansignEqualssign: typings.three.threeStrings.GreaterthansignEqualssign = ">=".asInstanceOf[typings.three.threeStrings.GreaterthansignEqualssign]
    
    inline def GreaterthansignGreaterthansign: typings.three.threeStrings.GreaterthansignGreaterthansign = ">>".asInstanceOf[typings.three.threeStrings.GreaterthansignGreaterthansign]
    
    inline def Lessthansign: typings.three.threeStrings.Lessthansign = "<".asInstanceOf[typings.three.threeStrings.Lessthansign]
    
    inline def LessthansignEqualssign: typings.three.threeStrings.LessthansignEqualssign = "<=".asInstanceOf[typings.three.threeStrings.LessthansignEqualssign]
    
    inline def LessthansignLessthansign: typings.three.threeStrings.LessthansignLessthansign = "<<".asInstanceOf[typings.three.threeStrings.LessthansignLessthansign]
    
    inline def Percentsign: typings.three.threeStrings.Percentsign = "%".asInstanceOf[typings.three.threeStrings.Percentsign]
    
    inline def Plussign: typings.three.threeStrings.Plussign = "+".asInstanceOf[typings.three.threeStrings.Plussign]
    
    inline def Slash: typings.three.threeStrings.Slash = "/".asInstanceOf[typings.three.threeStrings.Slash]
    
    inline def Verticalline: typings.three.threeStrings.Verticalline = "|".asInstanceOf[typings.three.threeStrings.Verticalline]
    
    inline def VerticallineVerticalline: typings.three.threeStrings.VerticallineVerticalline = "||".asInstanceOf[typings.three.threeStrings.VerticallineVerticalline]
    
    inline def `^^`: typings.three.threeStrings.`^^` = "^^".asInstanceOf[typings.three.threeStrings.`^^`]
    
    inline def _dash: `-_` = "-".asInstanceOf[`-_`]
  }
}
