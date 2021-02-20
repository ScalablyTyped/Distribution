package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IScriptSnapshot extends StObject {
  
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
  implicit class IScriptSnapshotMutableBuilder[Self <: IScriptSnapshot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLineStartPositions(value: () => js.Array[Double]): Self = StObject.set(x, "getLineStartPositions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetText(value: (Double, Double) => String): Self = StObject.set(x, "getText", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetTextChangeRangeSinceVersion(value: Double => TextChangeRange): Self = StObject.set(x, "getTextChangeRangeSinceVersion", js.Any.fromFunction1(value))
  }
}
