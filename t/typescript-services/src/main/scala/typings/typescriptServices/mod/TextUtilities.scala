package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.TextUtilities.ICharacterSequence
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextUtilities {
  
  @JSImport("typescript-services", "TextUtilities.getLengthOfLineBreak")
  @js.native
  def getLengthOfLineBreak(text: ICharacterSequence, index: Double): Double = js.native
  
  @JSImport("typescript-services", "TextUtilities.getLengthOfLineBreakSlow")
  @js.native
  def getLengthOfLineBreakSlow(text: ICharacterSequence, index: Double, c: Double): Double = js.native
  
  @JSImport("typescript-services", "TextUtilities.isAnyLineBreakCharacter")
  @js.native
  def isAnyLineBreakCharacter(c: Double): Boolean = js.native
  
  @JSImport("typescript-services", "TextUtilities.parseLineStarts")
  @js.native
  def parseLineStarts(text: ICharacterSequence): js.Array[Double] = js.native
}
