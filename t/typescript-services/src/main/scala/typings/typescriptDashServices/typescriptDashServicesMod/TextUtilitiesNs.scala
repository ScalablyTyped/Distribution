package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScriptNs.TextUtilitiesNs.ICharacterSequence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "TextUtilities")
@js.native
object TextUtilitiesNs extends js.Object {
  def getLengthOfLineBreak(text: ICharacterSequence, index: Double): Double = js.native
  def getLengthOfLineBreakSlow(text: ICharacterSequence, index: Double, c: Double): Double = js.native
  def isAnyLineBreakCharacter(c: Double): Boolean = js.native
  def parseLineStarts(text: ICharacterSequence): js.Array[Double] = js.native
}

