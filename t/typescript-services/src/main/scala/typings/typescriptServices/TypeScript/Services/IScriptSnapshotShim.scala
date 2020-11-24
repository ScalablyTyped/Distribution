package typings.typescriptServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IScriptSnapshotShim extends js.Object {
  
  def getLength(): Double = js.native
  
  def getLineStartPositions(): String = js.native
  
  def getText(start: Double, end: Double): String = js.native
  
  def getTextChangeRangeSinceVersion(scriptVersion: Double): String = js.native
}
object IScriptSnapshotShim {
  
  @scala.inline
  def apply(
    getLength: () => Double,
    getLineStartPositions: () => String,
    getText: (Double, Double) => String,
    getTextChangeRangeSinceVersion: Double => String
  ): IScriptSnapshotShim = {
    val __obj = js.Dynamic.literal(getLength = js.Any.fromFunction0(getLength), getLineStartPositions = js.Any.fromFunction0(getLineStartPositions), getText = js.Any.fromFunction2(getText), getTextChangeRangeSinceVersion = js.Any.fromFunction1(getTextChangeRangeSinceVersion))
    __obj.asInstanceOf[IScriptSnapshotShim]
  }
  
  @scala.inline
  implicit class IScriptSnapshotShimOps[Self <: IScriptSnapshotShim] (val x: Self) extends AnyVal {
    
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
    def setGetLineStartPositions(value: () => String): Self = this.set("getLineStartPositions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetText(value: (Double, Double) => String): Self = this.set("getText", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetTextChangeRangeSinceVersion(value: Double => String): Self = this.set("getTextChangeRangeSinceVersion", js.Any.fromFunction1(value))
  }
}
