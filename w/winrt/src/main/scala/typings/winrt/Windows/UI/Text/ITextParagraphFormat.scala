package typings.winrt.Windows.UI.Text

import typings.winrt.anon.Align
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextParagraphFormat extends js.Object {
  var alignment: ParagraphAlignment
  var firstLineIndent: Double
  var keepTogether: FormatEffect
  var keepWithNext: FormatEffect
  var leftIndent: Double
  var lineSpacing: Double
  var lineSpacingRule: LineSpacingRule
  var listAlignment: MarkerAlignment
  var listLevelIndex: Double
  var listStart: Double
  var listStyle: MarkerStyle
  var listTab: Double
  var listType: MarkerType
  var noLineNumber: FormatEffect
  var pageBreakBefore: FormatEffect
  var rightIndent: Double
  var rightToLeft: FormatEffect
  var spaceAfter: Double
  var spaceBefore: Double
  var style: ParagraphStyle
  var tabCount: Double
  var widowControl: FormatEffect
  def addTab(position: Double, align: TabAlignment, leader: TabLeader): Unit
  def clearAllTabs(): Unit
  def deleteTab(position: Double): Unit
  def getClone(): ITextParagraphFormat
  def getTab(index: Double): Align
  def isEqual(format: ITextParagraphFormat): Boolean
  def setClone(format: ITextParagraphFormat): Unit
  def setIndents(start: Double, left: Double, right: Double): Unit
  def setLineSpacing(rule: LineSpacingRule, spacing: Double): Unit
}

object ITextParagraphFormat {
  @scala.inline
  def apply(
    addTab: (Double, TabAlignment, TabLeader) => Unit,
    alignment: ParagraphAlignment,
    clearAllTabs: () => Unit,
    deleteTab: Double => Unit,
    firstLineIndent: Double,
    getClone: () => ITextParagraphFormat,
    getTab: Double => Align,
    isEqual: ITextParagraphFormat => Boolean,
    keepTogether: FormatEffect,
    keepWithNext: FormatEffect,
    leftIndent: Double,
    lineSpacing: Double,
    lineSpacingRule: LineSpacingRule,
    listAlignment: MarkerAlignment,
    listLevelIndex: Double,
    listStart: Double,
    listStyle: MarkerStyle,
    listTab: Double,
    listType: MarkerType,
    noLineNumber: FormatEffect,
    pageBreakBefore: FormatEffect,
    rightIndent: Double,
    rightToLeft: FormatEffect,
    setClone: ITextParagraphFormat => Unit,
    setIndents: (Double, Double, Double) => Unit,
    setLineSpacing: (LineSpacingRule, Double) => Unit,
    spaceAfter: Double,
    spaceBefore: Double,
    style: ParagraphStyle,
    tabCount: Double,
    widowControl: FormatEffect
  ): ITextParagraphFormat = {
    val __obj = js.Dynamic.literal(addTab = js.Any.fromFunction3(addTab), alignment = alignment.asInstanceOf[js.Any], clearAllTabs = js.Any.fromFunction0(clearAllTabs), deleteTab = js.Any.fromFunction1(deleteTab), firstLineIndent = firstLineIndent.asInstanceOf[js.Any], getClone = js.Any.fromFunction0(getClone), getTab = js.Any.fromFunction1(getTab), isEqual = js.Any.fromFunction1(isEqual), keepTogether = keepTogether.asInstanceOf[js.Any], keepWithNext = keepWithNext.asInstanceOf[js.Any], leftIndent = leftIndent.asInstanceOf[js.Any], lineSpacing = lineSpacing.asInstanceOf[js.Any], lineSpacingRule = lineSpacingRule.asInstanceOf[js.Any], listAlignment = listAlignment.asInstanceOf[js.Any], listLevelIndex = listLevelIndex.asInstanceOf[js.Any], listStart = listStart.asInstanceOf[js.Any], listStyle = listStyle.asInstanceOf[js.Any], listTab = listTab.asInstanceOf[js.Any], listType = listType.asInstanceOf[js.Any], noLineNumber = noLineNumber.asInstanceOf[js.Any], pageBreakBefore = pageBreakBefore.asInstanceOf[js.Any], rightIndent = rightIndent.asInstanceOf[js.Any], rightToLeft = rightToLeft.asInstanceOf[js.Any], setClone = js.Any.fromFunction1(setClone), setIndents = js.Any.fromFunction3(setIndents), setLineSpacing = js.Any.fromFunction2(setLineSpacing), spaceAfter = spaceAfter.asInstanceOf[js.Any], spaceBefore = spaceBefore.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], tabCount = tabCount.asInstanceOf[js.Any], widowControl = widowControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextParagraphFormat]
  }
}

