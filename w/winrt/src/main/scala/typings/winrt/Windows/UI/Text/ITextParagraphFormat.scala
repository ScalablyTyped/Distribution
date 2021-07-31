package typings.winrt.Windows.UI.Text

import typings.winrt.anon.Align
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITextParagraphFormat extends StObject {
  
  def addTab(position: Double, align: TabAlignment, leader: TabLeader): Unit
  
  var alignment: ParagraphAlignment
  
  def clearAllTabs(): Unit
  
  def deleteTab(position: Double): Unit
  
  var firstLineIndent: Double
  
  def getClone(): ITextParagraphFormat
  
  def getTab(index: Double): Align
  
  def isEqual(format: ITextParagraphFormat): Boolean
  
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
  
  def setClone(format: ITextParagraphFormat): Unit
  
  def setIndents(start: Double, left: Double, right: Double): Unit
  
  def setLineSpacing(rule: LineSpacingRule, spacing: Double): Unit
  
  var spaceAfter: Double
  
  var spaceBefore: Double
  
  var style: ParagraphStyle
  
  var tabCount: Double
  
  var widowControl: FormatEffect
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
  
  @scala.inline
  implicit class ITextParagraphFormatMutableBuilder[Self <: ITextParagraphFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddTab(value: (Double, TabAlignment, TabLeader) => Unit): Self = StObject.set(x, "addTab", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAlignment(value: ParagraphAlignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearAllTabs(value: () => Unit): Self = StObject.set(x, "clearAllTabs", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDeleteTab(value: Double => Unit): Self = StObject.set(x, "deleteTab", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFirstLineIndent(value: Double): Self = StObject.set(x, "firstLineIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetClone(value: () => ITextParagraphFormat): Self = StObject.set(x, "getClone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTab(value: Double => Align): Self = StObject.set(x, "getTab", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsEqual(value: ITextParagraphFormat => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeepTogether(value: FormatEffect): Self = StObject.set(x, "keepTogether", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepWithNext(value: FormatEffect): Self = StObject.set(x, "keepWithNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftIndent(value: Double): Self = StObject.set(x, "leftIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineSpacing(value: Double): Self = StObject.set(x, "lineSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineSpacingRule(value: LineSpacingRule): Self = StObject.set(x, "lineSpacingRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListAlignment(value: MarkerAlignment): Self = StObject.set(x, "listAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListLevelIndex(value: Double): Self = StObject.set(x, "listLevelIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListStart(value: Double): Self = StObject.set(x, "listStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListStyle(value: MarkerStyle): Self = StObject.set(x, "listStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListTab(value: Double): Self = StObject.set(x, "listTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListType(value: MarkerType): Self = StObject.set(x, "listType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoLineNumber(value: FormatEffect): Self = StObject.set(x, "noLineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageBreakBefore(value: FormatEffect): Self = StObject.set(x, "pageBreakBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightIndent(value: Double): Self = StObject.set(x, "rightIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightToLeft(value: FormatEffect): Self = StObject.set(x, "rightToLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetClone(value: ITextParagraphFormat => Unit): Self = StObject.set(x, "setClone", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIndents(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "setIndents", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetLineSpacing(value: (LineSpacingRule, Double) => Unit): Self = StObject.set(x, "setLineSpacing", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSpaceAfter(value: Double): Self = StObject.set(x, "spaceAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceBefore(value: Double): Self = StObject.set(x, "spaceBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: ParagraphStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabCount(value: Double): Self = StObject.set(x, "tabCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidowControl(value: FormatEffect): Self = StObject.set(x, "widowControl", value.asInstanceOf[js.Any])
  }
}
