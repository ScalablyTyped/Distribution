package typings.typescriptServices.TypeScript.Services.Formatting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotPoint extends StObject {
  
  def add(offset: Double): SnapshotPoint
  
  def getContainingLine(): ITextSnapshotLine
  
  var position: Double
  
  var snapshot: ITextSnapshot
}
object SnapshotPoint {
  
  @scala.inline
  def apply(
    add: Double => SnapshotPoint,
    getContainingLine: () => ITextSnapshotLine,
    position: Double,
    snapshot: ITextSnapshot
  ): SnapshotPoint = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), getContainingLine = js.Any.fromFunction0(getContainingLine), position = position.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotPoint]
  }
  
  @scala.inline
  implicit class SnapshotPointMutableBuilder[Self <: SnapshotPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: Double => SnapshotPoint): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetContainingLine(value: () => ITextSnapshotLine): Self = StObject.set(x, "getContainingLine", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshot(value: ITextSnapshot): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
  }
}
