package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceMapSource extends js.Object {
  var fileName: java.lang.String
  var skipTrivia: js.UndefOr[js.Function1[/* pos */ Double, Double]] = js.undefined
  var text: java.lang.String
  def getLineAndCharacterOfPosition(pos: Double): LineAndCharacter
}

object SourceMapSource {
  @scala.inline
  def apply(
    fileName: java.lang.String,
    getLineAndCharacterOfPosition: Double => LineAndCharacter,
    text: java.lang.String,
    skipTrivia: /* pos */ Double => Double = null
  ): SourceMapSource = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], getLineAndCharacterOfPosition = js.Any.fromFunction1(getLineAndCharacterOfPosition), text = text.asInstanceOf[js.Any])
    if (skipTrivia != null) __obj.updateDynamic("skipTrivia")(js.Any.fromFunction1(skipTrivia))
    __obj.asInstanceOf[SourceMapSource]
  }
}

