package typings.typesettable.wrapperMod

import typings.typesettable.measurersMod.AbstractMeasurer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable/build/src/wrappers/wrapper", "Wrapper")
@js.native
class Wrapper () extends js.Object {
  var _allowBreakingWords: js.Any = js.native
  var _breakingCharacter: String = js.native
  var _maxLines: js.Any = js.native
  var _textTrimming: js.Any = js.native
  var _tokenizer: js.Any = js.native
  /* private */ def addEllipsis(line: js.Any, width: js.Any, measurer: js.Any): js.Any = js.native
  def allowBreakingWords(): Boolean = js.native
  def allowBreakingWords(allow: Boolean): Wrapper = js.native
  /* private */ def breakLineToFitWidth(state: js.Any, line: js.Any, hasNextLine: js.Any, measurer: js.Any): js.Any = js.native
  /**
    * Breaks single token to fit current line.
    * If token contains only whitespaces then they will not be populated to next line.
    */
  /* private */ def breakTokenToFitInWidth(token: js.Any, line: js.Any, availableWidth: js.Any, measurer: js.Any): js.Any = js.native
  /* private */ def breakTokenToFitInWidth(token: js.Any, line: js.Any, availableWidth: js.Any, measurer: js.Any, breakingCharacter: js.Any): js.Any = js.native
  /* private */ def canFitToken(token: js.Any, width: js.Any, measurer: js.Any): js.Any = js.native
  /* private */ def finishWrapping(token: js.Any, state: js.Any, measurer: js.Any): js.Any = js.native
  def maxLines(): Double = js.native
  def maxLines(noLines: Double): Wrapper = js.native
  def textTrimming(): String = js.native
  def textTrimming(option: String): Wrapper = js.native
  def wrap(text: String, measurer: AbstractMeasurer, width: Double): IWrappingResult = js.native
  def wrap(text: String, measurer: AbstractMeasurer, width: Double, height: Double): IWrappingResult = js.native
  /* private */ def wrapNextToken(token: js.Any, state: js.Any, measurer: js.Any): js.Any = js.native
}

