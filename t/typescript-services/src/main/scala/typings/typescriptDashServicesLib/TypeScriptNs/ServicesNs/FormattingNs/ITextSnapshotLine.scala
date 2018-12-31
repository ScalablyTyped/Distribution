package typings
package typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextSnapshotLine extends js.Object {
  def end(): SnapshotPoint
  def endIncludingLineBreak(): SnapshotPoint
  def endIncludingLineBreakPosition(): scala.Double
  def endPosition(): scala.Double
  def getText(): java.lang.String
  def length(): scala.Double
  def lineNumber(): scala.Double
  def snapshot(): ITextSnapshot
  def start(): SnapshotPoint
  def startPosition(): scala.Double
}

