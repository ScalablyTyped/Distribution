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
  def getTab(index: scala.Double): winrtLib.Anon_Align
  def isEqual(format: ITextParagraphFormat): scala.Boolean
  def setClone(format: ITextParagraphFormat): scala.Unit
  def setIndents(start: scala.Double, left: scala.Double, right: scala.Double): scala.Unit
  def setLineSpacing(rule: LineSpacingRule, spacing: scala.Double): scala.Unit
}

object ITextParagraphFormat {
  @scala.inline
  def apply(
    addTab: js.Function3[scala.Double, TabAlignment, TabLeader, scala.Unit],
    alignment: ParagraphAlignment,
    clearAllTabs: js.Function0[scala.Unit],
    deleteTab: js.Function1[scala.Double, scala.Unit],
    firstLineIndent: scala.Double,
    getClone: js.Function0[ITextParagraphFormat],
    getTab: js.Function1[scala.Double, winrtLib.Anon_Align],
    isEqual: js.Function1[ITextParagraphFormat, scala.Boolean],
    keepTogether: FormatEffect,
    keepWithNext: FormatEffect,
    leftIndent: scala.Double,
    lineSpacing: scala.Double,
    lineSpacingRule: LineSpacingRule,
    listAlignment: MarkerAlignment,
    listLevelIndex: scala.Double,
    listStart: scala.Double,
    listStyle: MarkerStyle,
    listTab: scala.Double,
    listType: MarkerType,
    noLineNumber: FormatEffect,
    pageBreakBefore: FormatEffect,
    rightIndent: scala.Double,
    rightToLeft: FormatEffect,
    setClone: js.Function1[ITextParagraphFormat, scala.Unit],
    setIndents: js.Function3[scala.Double, scala.Double, scala.Double, scala.Unit],
    setLineSpacing: js.Function2[LineSpacingRule, scala.Double, scala.Unit],
    spaceAfter: scala.Double,
    spaceBefore: scala.Double,
    style: ParagraphStyle,
    tabCount: scala.Double,
    widowControl: FormatEffect
  ): ITextParagraphFormat = {
    val __obj = js.Dynamic.literal(addTab = addTab, alignment = alignment, clearAllTabs = clearAllTabs, deleteTab = deleteTab, firstLineIndent = firstLineIndent, getClone = getClone, getTab = getTab, isEqual = isEqual, keepTogether = keepTogether, keepWithNext = keepWithNext, leftIndent = leftIndent, lineSpacing = lineSpacing, lineSpacingRule = lineSpacingRule, listAlignment = listAlignment, listLevelIndex = listLevelIndex, listStart = listStart, listStyle = listStyle, listTab = listTab, listType = listType, noLineNumber = noLineNumber, pageBreakBefore = pageBreakBefore, rightIndent = rightIndent, rightToLeft = rightToLeft, setClone = setClone, setIndents = setIndents, setLineSpacing = setLineSpacing, spaceAfter = spaceAfter, spaceBefore = spaceBefore, style = style, tabCount = tabCount, widowControl = widowControl)
  
    __obj.asInstanceOf[ITextParagraphFormat]
  }
}

