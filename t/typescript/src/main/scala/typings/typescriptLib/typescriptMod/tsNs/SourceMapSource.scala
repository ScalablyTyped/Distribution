package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceMapSource extends js.Object {
  var fileName: java.lang.String
  var skipTrivia: js.UndefOr[js.Function1[/* pos */ scala.Double, scala.Double]] = js.undefined
  var text: java.lang.String
  def getLineAndCharacterOfPosition(pos: scala.Double): LineAndCharacter
}

object SourceMapSource {
  @scala.inline
  def apply(
    fileName: java.lang.String,
    getLineAndCharacterOfPosition: scala.Double => LineAndCharacter,
    text: java.lang.String,
    skipTrivia: /* pos */ scala.Double => scala.Double = null
  ): SourceMapSource = {
    val __obj = js.Dynamic.literal(fileName = fileName, getLineAndCharacterOfPosition = js.Any.fromFunction1(getLineAndCharacterOfPosition), text = text)
    if (skipTrivia != null) __obj.updateDynamic("skipTrivia")(js.Any.fromFunction1(skipTrivia))
    __obj.asInstanceOf[SourceMapSource]
  }
}

