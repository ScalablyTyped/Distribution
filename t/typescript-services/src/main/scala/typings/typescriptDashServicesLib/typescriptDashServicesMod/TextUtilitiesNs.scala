package typings
package typescriptDashServicesLib.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "TextUtilities")
@js.native
object TextUtilitiesNs extends js.Object {
  def getLengthOfLineBreak(
    text: typescriptDashServicesLib.TypeScriptNs.TextUtilitiesNs.ICharacterSequence,
    index: scala.Double
  ): scala.Double = js.native
  def getLengthOfLineBreakSlow(
    text: typescriptDashServicesLib.TypeScriptNs.TextUtilitiesNs.ICharacterSequence,
    index: scala.Double,
    c: scala.Double
  ): scala.Double = js.native
  def isAnyLineBreakCharacter(c: scala.Double): scala.Boolean = js.native
  def parseLineStarts(text: typescriptDashServicesLib.TypeScriptNs.TextUtilitiesNs.ICharacterSequence): js.Array[scala.Double] = js.native
}

