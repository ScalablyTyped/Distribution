package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IScriptSnapshot extends js.Object {
  
  def getLength(): Double = js.native
  
  def getLineStartPositions(): js.Array[Double] = js.native
  
  def getText(start: Double, end: Double): String = js.native
  
  def getTextChangeRangeSinceVersion(scriptVersion: Double): TextChangeRange = js.native
}
object IScriptSnapshot {
  
  @scala.inline
  def apply(
    getLength: () => Double,
    getLineStartPositions: () => js.Array[Double],
    getText: (Double, Double) => String,
    getTextChangeRangeSinceVersion: Double => TextChangeRange
  ): IScriptSnapshot = {
    val __obj = js.Dynamic.literal(getLength = js.Any.fromFunction0(getLength), getLineStartPositions = js.Any.fromFunction0(getLineStartPositions), getText = js.Any.fromFunction2(getText), getTextChangeRangeSinceVersion = js.Any.fromFunction1(getTextChangeRangeSinceVersion))
    __obj.asInstanceOf[IScriptSnapshot]
  }
  
  @scala.inline
  implicit class IScriptSnapshotOps[Self <: IScriptSnapshot] (val x: Self) extends AnyVal {
    
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
    def setGetLength(value: () => Double): Self = this.set("getLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLineStartPositions(value: () => js.Array[Double]): Self = this.set("getLineStartPositions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetText(value: (Double, Double) => String): Self = this.set("getText", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetTextChangeRangeSinceVersion(value: Double => TextChangeRange): Self = this.set("getTextChangeRangeSinceVersion", js.Any.fromFunction1(value))
  }
}
