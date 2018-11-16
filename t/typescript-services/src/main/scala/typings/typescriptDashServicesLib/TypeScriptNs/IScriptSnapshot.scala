package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IScriptSnapshot extends js.Object {
  def getLength(): scala.Double
  def getLineStartPositions(): js.Array[scala.Double]
  def getText(start: scala.Double, end: scala.Double): java.lang.String
  def getTextChangeRangeSinceVersion(scriptVersion: scala.Double): TextChangeRange
}

