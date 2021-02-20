package typings.winrt.Windows.UI.Text

import typings.winrt.Windows.Foundation.Point
import typings.winrt.Windows.Storage.Streams.IRandomAccessStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITextDocument extends StObject {
  
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
  implicit class ITextDocumentMutableBuilder[Self <: ITextDocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplyDisplayUpdates(value: () => Double): Self = StObject.set(x, "applyDisplayUpdates", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBatchDisplayUpdates(value: () => Double): Self = StObject.set(x, "batchDisplayUpdates", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBeginUndoGroup(value: () => Unit): Self = StObject.set(x, "beginUndoGroup", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCanCopy(value: () => Boolean): Self = StObject.set(x, "canCopy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCanPaste(value: () => Boolean): Self = StObject.set(x, "canPaste", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCanRedo(value: () => Boolean): Self = StObject.set(x, "canRedo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCanUndo(value: () => Boolean): Self = StObject.set(x, "canUndo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCaretType(value: CaretType): Self = StObject.set(x, "caretType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultTabStop(value: Double): Self = StObject.set(x, "defaultTabStop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndoGroup(value: () => Unit): Self = StObject.set(x, "endUndoGroup", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDefaultCharacterFormat(value: () => ITextCharacterFormat): Self = StObject.set(x, "getDefaultCharacterFormat", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDefaultParagraphFormat(value: () => ITextParagraphFormat): Self = StObject.set(x, "getDefaultParagraphFormat", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRange(value: (Double, Double) => ITextRange): Self = StObject.set(x, "getRange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetRangeFromPoint(value: (Point, PointOptions) => ITextRange): Self = StObject.set(x, "getRangeFromPoint", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetText(value: TextGetOptions => String): Self = StObject.set(x, "getText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoadFromStream(value: (TextSetOptions, IRandomAccessStream) => Unit): Self = StObject.set(x, "loadFromStream", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRedo(value: () => Unit): Self = StObject.set(x, "redo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSaveToStream(value: (TextGetOptions, IRandomAccessStream) => Unit): Self = StObject.set(x, "saveToStream", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSelection(value: ITextSelection): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetDefaultCharacterFormat(value: ITextCharacterFormat => Unit): Self = StObject.set(x, "setDefaultCharacterFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDefaultParagraphFormat(value: ITextParagraphFormat => Unit): Self = StObject.set(x, "setDefaultParagraphFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetText(value: (TextSetOptions, String) => Unit): Self = StObject.set(x, "setText", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUndo(value: () => Unit): Self = StObject.set(x, "undo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUndoLimit(value: Double): Self = StObject.set(x, "undoLimit", value.asInstanceOf[js.Any])
  }
}
