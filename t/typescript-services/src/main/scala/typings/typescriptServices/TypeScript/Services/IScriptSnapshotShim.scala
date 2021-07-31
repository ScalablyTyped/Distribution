package typings.typescriptServices.TypeScript.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IScriptSnapshotShim extends StObject {
  
  def getLength(): Double
  
  def getLineStartPositions(): String
  
  def getText(start: Double, end: Double): String
  
  def getTextChangeRangeSinceVersion(scriptVersion: Double): String
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
  implicit class IScriptSnapshotShimMutableBuilder[Self <: IScriptSnapshotShim] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLineStartPositions(value: () => String): Self = StObject.set(x, "getLineStartPositions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetText(value: (Double, Double) => String): Self = StObject.set(x, "getText", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetTextChangeRangeSinceVersion(value: Double => String): Self = StObject.set(x, "getTextChangeRangeSinceVersion", js.Any.fromFunction1(value))
  }
}
