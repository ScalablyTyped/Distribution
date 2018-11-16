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

