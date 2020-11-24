package typings.vexflow.Vex.Flow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeSignature extends StaveModifier {
  
  def addEndModifier(stave: Stave): Unit = js.native
  
  def addModifier(stave: Stave): Unit = js.native
  
  def getTimeSig(): typings.vexflow.anon.Glyph = js.native
  
  def makeTimeSignatureGlyph(topNums: js.Array[Double], botNums: js.Array[Double]): Glyph = js.native
  
  def parseTimeSpec(timeSpec: String): typings.vexflow.anon.Glyph = js.native
}
