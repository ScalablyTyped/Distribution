package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IText extends ISimpleText {
  
  def getLineFromLineNumber(lineNumber: Double): ITextLine = js.native
  
  def getLineFromPosition(position: Double): ITextLine = js.native
  
  def getLineNumberFromPosition(position: Double): Double = js.native
  
  def getLinePosition(position: Double): LineAndCharacter = js.native
  
  def lineCount(): Double = js.native
  
  def lines(): js.Array[ITextLine] = js.native
  
  def toString(span: TextSpan): String = js.native
}
