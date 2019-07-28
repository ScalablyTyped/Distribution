package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceMapSource extends js.Object {
  var fileName: String
  var skipTrivia: js.UndefOr[js.Function1[/* pos */ Double, Double]] = js.undefined
  var text: String
  def getLineAndCharacterOfPosition(pos: Double): LineAndCharacter
}

object SourceMapSource {
  @scala.inline
  def apply(
    fileName: String,
    getLineAndCharacterOfPosition: Double => LineAndCharacter,
    text: String,
    skipTrivia: /* pos */ Double => Double = null
  ): SourceMapSource = {
    val __obj = js.Dynamic.literal(fileName = fileName, getLineAndCharacterOfPosition = js.Any.fromFunction1(getLineAndCharacterOfPosition), text = text)
    if (skipTrivia != null) __obj.updateDynamic("skipTrivia")(js.Any.fromFunction1(skipTrivia))
    __obj.asInstanceOf[SourceMapSource]
  }
}

