package typings
package typescriptDashServicesLib.TypeScriptNs.ServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IScriptSnapshotShim extends js.Object {
  def getLength(): scala.Double
  def getLineStartPositions(): java.lang.String
  def getText(start: scala.Double, end: scala.Double): java.lang.String
  def getTextChangeRangeSinceVersion(scriptVersion: scala.Double): java.lang.String
}

