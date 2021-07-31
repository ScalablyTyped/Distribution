package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.TextUtilities.ICharacterSequence
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextUtilities {
  
  @JSGlobal("TypeScript.TextUtilities")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getLengthOfLineBreak(text: ICharacterSequence, index: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getLengthOfLineBreak")(text.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getLengthOfLineBreakSlow(text: ICharacterSequence, index: Double, c: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getLengthOfLineBreakSlow")(text.asInstanceOf[js.Any], index.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def isAnyLineBreakCharacter(c: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAnyLineBreakCharacter")(c.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def parseLineStarts(text: ICharacterSequence): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseLineStarts")(text.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
}
