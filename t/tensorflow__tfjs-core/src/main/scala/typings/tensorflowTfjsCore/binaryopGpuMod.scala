package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.gpgpuMathMod.GPGPUProgram
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.`Linefeed  float s Equalssign signLeftparenthesisaRightparenthesis Asterisk signLeftparenthesisbRightparenthesisSemicolonLinefeed  int ia Equalssign roundLeftparenthesisaRightparenthesisSemicolonLinefeed  int ib Equalssign roundLeftparenthesisbRightparenthesisSemicolonLinefeed  if Leftparenthesisib ExclamationmarkEqualssign 0Rightparenthesis LeftcurlybracketLinefeed    SlashSlash Windows LeftparenthesisD3DRightparenthesis wants guaranteed non-zero int division at compile-timeDotLinefeed    return`
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.`Linefeedif Leftparenthesisa EqualssignEqualssign bRightparenthesis LeftcurlybracketLinefeed  return 1Dot0SemicolonLinefeedRightcurlybracketSemicolonLinefeedreturn a Slash bSemicolon`
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.`LinefeedifLeftparenthesisa Lessthansign 0Dot0 AmpersandAmpersand floorLeftparenthesisbRightparenthesis Lessthansign bRightparenthesisLeftcurlybracketLinefeed  return NANSemicolonLinefeedRightcurlybracketLinefeedif Leftparenthesisb EqualssignEqualssign 0Dot0Rightparenthesis LeftcurlybracketLinefeed  return 1Dot0SemicolonLinefeedRightcurlybracketLinefeedreturn LeftparenthesisroundLeftparenthesismodLeftparenthesisbComma 2Dot0RightparenthesisRightparenthesis ExclamationmarkEqualssign 1Rightparenthes`
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.`if Leftparenthesisb EqualssignEqualssign 0Dot0Rightparenthesis return NANSemicolonLinefeed  return modLeftparenthesisaComma bRightparenthesisSemicolon`
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.`return Leftparenthesisa - bRightparenthesis Asterisk Leftparenthesisa - bRightparenthesisSemicolon`
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.`return Leftparenthesisa Lessthansign 0DotRightparenthesis Questionmark b Asterisk a Colon aSemicolon`
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.`return Leftparenthesisb GreaterthansignEqualssign 1Dot0Rightparenthesis Questionmark a Colon a Asterisk Leftparenthesisb Plussign 1Dot0RightparenthesisSemicolon`
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.`return a - bSemicolon`
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.`return a Asterisk bSemicolon`
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.`return a Plussign bSemicolon`
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.`return floatLeftparenthesisa EqualssignEqualssign bRightparenthesisSemicolon`
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.`return floatLeftparenthesisa ExclamationmarkEqualssign bRightparenthesisSemicolon`
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.`return floatLeftparenthesisa Greaterthansign bRightparenthesisSemicolon`
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.`return floatLeftparenthesisa GreaterthansignEqualssign 1Dot0 AmpersandAmpersand b GreaterthansignEqualssign 1Dot0RightparenthesisSemicolon`
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.`return floatLeftparenthesisa GreaterthansignEqualssign 1Dot0 VerticallineVerticalline b GreaterthansignEqualssign 1Dot0RightparenthesisSemicolon`
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.`return floatLeftparenthesisa GreaterthansignEqualssign bRightparenthesisSemicolon`
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.`return floatLeftparenthesisa Lessthansign bRightparenthesisSemicolon`
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.`return floatLeftparenthesisa LessthansignEqualssign bRightparenthesisSemicolon`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/binaryop_gpu", JSImport.Namespace)
@js.native
object binaryopGpuMod extends js.Object {
  @js.native
  class BinaryOpProgram protected () extends GPGPUProgram {
    def this(op: String, aShape: js.Array[Double], bShape: js.Array[Double]) = this()
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
  }
  
  val ADD: `return a Plussign bSemicolon` = js.native
  val ATAN2: String = js.native
  val DIV: `Linefeedif Leftparenthesisa EqualssignEqualssign bRightparenthesis LeftcurlybracketLinefeed  return 1Dot0SemicolonLinefeedRightcurlybracketSemicolonLinefeedreturn a Slash bSemicolon` = js.native
  val ELU_DER: `return Leftparenthesisb GreaterthansignEqualssign 1Dot0Rightparenthesis Questionmark a Colon a Asterisk Leftparenthesisb Plussign 1Dot0RightparenthesisSemicolon` = js.native
  val EQUAL: `return floatLeftparenthesisa EqualssignEqualssign bRightparenthesisSemicolon` = js.native
  val GREATER: `return floatLeftparenthesisa Greaterthansign bRightparenthesisSemicolon` = js.native
  val GREATER_EQUAL: `return floatLeftparenthesisa GreaterthansignEqualssign bRightparenthesisSemicolon` = js.native
  val INT_DIV: `Linefeed  float s Equalssign signLeftparenthesisaRightparenthesis Asterisk signLeftparenthesisbRightparenthesisSemicolonLinefeed  int ia Equalssign roundLeftparenthesisaRightparenthesisSemicolonLinefeed  int ib Equalssign roundLeftparenthesisbRightparenthesisSemicolonLinefeed  if Leftparenthesisib ExclamationmarkEqualssign 0Rightparenthesis LeftcurlybracketLinefeed    SlashSlash Windows LeftparenthesisD3DRightparenthesis wants guaranteed non-zero int division at compile-timeDotLinefeed    return` = js.native
  val LESS: `return floatLeftparenthesisa Lessthansign bRightparenthesisSemicolon` = js.native
  val LESS_EQUAL: `return floatLeftparenthesisa LessthansignEqualssign bRightparenthesisSemicolon` = js.native
  val LOGICAL_AND: `return floatLeftparenthesisa GreaterthansignEqualssign 1Dot0 AmpersandAmpersand b GreaterthansignEqualssign 1Dot0RightparenthesisSemicolon` = js.native
  val LOGICAL_OR: `return floatLeftparenthesisa GreaterthansignEqualssign 1Dot0 VerticallineVerticalline b GreaterthansignEqualssign 1Dot0RightparenthesisSemicolon` = js.native
  val MAX: String = js.native
  val MIN: String = js.native
  val MOD: `if Leftparenthesisb EqualssignEqualssign 0Dot0Rightparenthesis return NANSemicolonLinefeed  return modLeftparenthesisaComma bRightparenthesisSemicolon` = js.native
  val MUL: `return a Asterisk bSemicolon` = js.native
  val NOT_EQUAL: `return floatLeftparenthesisa ExclamationmarkEqualssign bRightparenthesisSemicolon` = js.native
  val POW: `LinefeedifLeftparenthesisa Lessthansign 0Dot0 AmpersandAmpersand floorLeftparenthesisbRightparenthesis Lessthansign bRightparenthesisLeftcurlybracketLinefeed  return NANSemicolonLinefeedRightcurlybracketLinefeedif Leftparenthesisb EqualssignEqualssign 0Dot0Rightparenthesis LeftcurlybracketLinefeed  return 1Dot0SemicolonLinefeedRightcurlybracketLinefeedreturn LeftparenthesisroundLeftparenthesismodLeftparenthesisbComma 2Dot0RightparenthesisRightparenthesis ExclamationmarkEqualssign 1Rightparenthes` = js.native
  val PRELU: `return Leftparenthesisa Lessthansign 0DotRightparenthesis Questionmark b Asterisk a Colon aSemicolon` = js.native
  val SQUARED_DIFFERENCE: `return Leftparenthesisa - bRightparenthesis Asterisk Leftparenthesisa - bRightparenthesisSemicolon` = js.native
  val SUB: `return a - bSemicolon` = js.native
}

