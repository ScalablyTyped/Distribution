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
    getLineAndCharacterOfPosition: js.Function1[scala.Double, LineAndCharacter],
    text: java.lang.String,
    skipTrivia: js.Function1[/* pos */ scala.Double, scala.Double] = null
  ): SourceMapSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fileName")(fileName)
    __obj.updateDynamic("getLineAndCharacterOfPosition")(getLineAndCharacterOfPosition)
    __obj.updateDynamic("text")(text)
    if (skipTrivia != null) __obj.updateDynamic("skipTrivia")(skipTrivia)
    __obj.asInstanceOf[SourceMapSource]
  }
}

