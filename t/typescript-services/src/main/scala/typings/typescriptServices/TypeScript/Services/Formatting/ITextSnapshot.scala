package typings.typescriptServices.TypeScript.Services.Formatting

import typings.typescriptServices.TypeScript.TextSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITextSnapshot extends js.Object {
  
  def getLineFromLineNumber(lineNumber: Double): ITextSnapshotLine = js.native
  
  def getLineFromPosition(position: Double): ITextSnapshotLine = js.native
  
  def getLineNumberFromPosition(position: Double): Double = js.native
  
  def getText(span: TextSpan): String = js.native
}
object ITextSnapshot {
  
  @scala.inline
  def apply(
    getLineFromLineNumber: Double => ITextSnapshotLine,
    getLineFromPosition: Double => ITextSnapshotLine,
    getLineNumberFromPosition: Double => Double,
    getText: TextSpan => String
  ): ITextSnapshot = {
    val __obj = js.Dynamic.literal(getLineFromLineNumber = js.Any.fromFunction1(getLineFromLineNumber), getLineFromPosition = js.Any.fromFunction1(getLineFromPosition), getLineNumberFromPosition = js.Any.fromFunction1(getLineNumberFromPosition), getText = js.Any.fromFunction1(getText))
    __obj.asInstanceOf[ITextSnapshot]
  }
  
  @scala.inline
  implicit class ITextSnapshotOps[Self <: ITextSnapshot] (val x: Self) extends AnyVal {
    
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
    def setGetLineFromLineNumber(value: Double => ITextSnapshotLine): Self = this.set("getLineFromLineNumber", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLineFromPosition(value: Double => ITextSnapshotLine): Self = this.set("getLineFromPosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLineNumberFromPosition(value: Double => Double): Self = this.set("getLineNumberFromPosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetText(value: TextSpan => String): Self = this.set("getText", js.Any.fromFunction1(value))
  }
}
