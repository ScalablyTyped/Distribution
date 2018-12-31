package typings
package winrtLib.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextParagraphFormat extends js.Object {
  var alignment: ParagraphAlignment
  var firstLineIndent: scala.Double
  var keepTogether: FormatEffect
  var keepWithNext: FormatEffect
  var leftIndent: scala.Double
  var lineSpacing: scala.Double
  var lineSpacingRule: LineSpacingRule
  var listAlignment: MarkerAlignment
  var listLevelIndex: scala.Double
  var listStart: scala.Double
  var listStyle: MarkerStyle
  var listTab: scala.Double
  var listType: MarkerType
  var noLineNumber: FormatEffect
  var pageBreakBefore: FormatEffect
  var rightIndent: scala.Double
  var rightToLeft: FormatEffect
  var spaceAfter: scala.Double
  var spaceBefore: scala.Double
  var style: ParagraphStyle
  var tabCount: scala.Double
  var widowControl: FormatEffect
  def addTab(position: scala.Double, align: TabAlignment, leader: TabLeader): scala.Unit
  def clearAllTabs(): scala.Unit
  def deleteTab(position: scala.Double): scala.Unit
  def getClone(): ITextParagraphFormat
  def getTab(index: scala.Double): winrtLib.Anon_Position
  def isEqual(format: ITextParagraphFormat): scala.Boolean
  def setClone(format: ITextParagraphFormat): scala.Unit
  def setIndents(start: scala.Double, left: scala.Double, right: scala.Double): scala.Unit
  def setLineSpacing(rule: LineSpacingRule, spacing: scala.Double): scala.Unit
}

