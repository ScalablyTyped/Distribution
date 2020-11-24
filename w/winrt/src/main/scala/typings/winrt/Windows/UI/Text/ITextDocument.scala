package typings.winrt.Windows.UI.Text

import typings.winrt.Windows.Foundation.Point
import typings.winrt.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITextDocument extends js.Object {
  
  def applyDisplayUpdates(): Double = js.native
  
  def batchDisplayUpdates(): Double = js.native
  
  def beginUndoGroup(): Unit = js.native
  
  def canCopy(): Boolean = js.native
  
  def canPaste(): Boolean = js.native
  
  def canRedo(): Boolean = js.native
  
  def canUndo(): Boolean = js.native
  
  var caretType: CaretType = js.native
  
  var defaultTabStop: Double = js.native
  
  def endUndoGroup(): Unit = js.native
  
  def getDefaultCharacterFormat(): ITextCharacterFormat = js.native
  
  def getDefaultParagraphFormat(): ITextParagraphFormat = js.native
  
  def getRange(startPosition: Double, endPosition: Double): ITextRange = js.native
  
  def getRangeFromPoint(point: Point, options: PointOptions): ITextRange = js.native
  
  def getText(options: TextGetOptions): String = js.native
  
  def loadFromStream(options: TextSetOptions, value: IRandomAccessStream): Unit = js.native
  
  def redo(): Unit = js.native
  
  def saveToStream(options: TextGetOptions, value: IRandomAccessStream): Unit = js.native
  
  var selection: ITextSelection = js.native
  
  def setDefaultCharacterFormat(value: ITextCharacterFormat): Unit = js.native
  
  def setDefaultParagraphFormat(value: ITextParagraphFormat): Unit = js.native
  
  def setText(options: TextSetOptions, value: String): Unit = js.native
  
  def undo(): Unit = js.native
  
  var undoLimit: Double = js.native
}
object ITextDocument {
  
  @scala.inline
  def apply(
    applyDisplayUpdates: () => Double,
    batchDisplayUpdates: () => Double,
    beginUndoGroup: () => Unit,
    canCopy: () => Boolean,
    canPaste: () => Boolean,
    canRedo: () => Boolean,
    canUndo: () => Boolean,
    caretType: CaretType,
    defaultTabStop: Double,
    endUndoGroup: () => Unit,
    getDefaultCharacterFormat: () => ITextCharacterFormat,
    getDefaultParagraphFormat: () => ITextParagraphFormat,
    getRange: (Double, Double) => ITextRange,
    getRangeFromPoint: (Point, PointOptions) => ITextRange,
    getText: TextGetOptions => String,
    loadFromStream: (TextSetOptions, IRandomAccessStream) => Unit,
    redo: () => Unit,
    saveToStream: (TextGetOptions, IRandomAccessStream) => Unit,
    selection: ITextSelection,
    setDefaultCharacterFormat: ITextCharacterFormat => Unit,
    setDefaultParagraphFormat: ITextParagraphFormat => Unit,
    setText: (TextSetOptions, String) => Unit,
    undo: () => Unit,
    undoLimit: Double
  ): ITextDocument = {
    val __obj = js.Dynamic.literal(applyDisplayUpdates = js.Any.fromFunction0(applyDisplayUpdates), batchDisplayUpdates = js.Any.fromFunction0(batchDisplayUpdates), beginUndoGroup = js.Any.fromFunction0(beginUndoGroup), canCopy = js.Any.fromFunction0(canCopy), canPaste = js.Any.fromFunction0(canPaste), canRedo = js.Any.fromFunction0(canRedo), canUndo = js.Any.fromFunction0(canUndo), caretType = caretType.asInstanceOf[js.Any], defaultTabStop = defaultTabStop.asInstanceOf[js.Any], endUndoGroup = js.Any.fromFunction0(endUndoGroup), getDefaultCharacterFormat = js.Any.fromFunction0(getDefaultCharacterFormat), getDefaultParagraphFormat = js.Any.fromFunction0(getDefaultParagraphFormat), getRange = js.Any.fromFunction2(getRange), getRangeFromPoint = js.Any.fromFunction2(getRangeFromPoint), getText = js.Any.fromFunction1(getText), loadFromStream = js.Any.fromFunction2(loadFromStream), redo = js.Any.fromFunction0(redo), saveToStream = js.Any.fromFunction2(saveToStream), selection = selection.asInstanceOf[js.Any], setDefaultCharacterFormat = js.Any.fromFunction1(setDefaultCharacterFormat), setDefaultParagraphFormat = js.Any.fromFunction1(setDefaultParagraphFormat), setText = js.Any.fromFunction2(setText), undo = js.Any.fromFunction0(undo), undoLimit = undoLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextDocument]
  }
  
  @scala.inline
  implicit class ITextDocumentOps[Self <: ITextDocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplyDisplayUpdates(value: () => Double): Self = this.set("applyDisplayUpdates", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBatchDisplayUpdates(value: () => Double): Self = this.set("batchDisplayUpdates", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBeginUndoGroup(value: () => Unit): Self = this.set("beginUndoGroup", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCanCopy(value: () => Boolean): Self = this.set("canCopy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCanPaste(value: () => Boolean): Self = this.set("canPaste", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCanRedo(value: () => Boolean): Self = this.set("canRedo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCanUndo(value: () => Boolean): Self = this.set("canUndo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCaretType(value: CaretType): Self = this.set("caretType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultTabStop(value: Double): Self = this.set("defaultTabStop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndoGroup(value: () => Unit): Self = this.set("endUndoGroup", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDefaultCharacterFormat(value: () => ITextCharacterFormat): Self = this.set("getDefaultCharacterFormat", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDefaultParagraphFormat(value: () => ITextParagraphFormat): Self = this.set("getDefaultParagraphFormat", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRange(value: (Double, Double) => ITextRange): Self = this.set("getRange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetRangeFromPoint(value: (Point, PointOptions) => ITextRange): Self = this.set("getRangeFromPoint", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetText(value: TextGetOptions => String): Self = this.set("getText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoadFromStream(value: (TextSetOptions, IRandomAccessStream) => Unit): Self = this.set("loadFromStream", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRedo(value: () => Unit): Self = this.set("redo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSaveToStream(value: (TextGetOptions, IRandomAccessStream) => Unit): Self = this.set("saveToStream", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSelection(value: ITextSelection): Self = this.set("selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetDefaultCharacterFormat(value: ITextCharacterFormat => Unit): Self = this.set("setDefaultCharacterFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDefaultParagraphFormat(value: ITextParagraphFormat => Unit): Self = this.set("setDefaultParagraphFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetText(value: (TextSetOptions, String) => Unit): Self = this.set("setText", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUndo(value: () => Unit): Self = this.set("undo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUndoLimit(value: Double): Self = this.set("undoLimit", value.asInstanceOf[js.Any])
  }
}
