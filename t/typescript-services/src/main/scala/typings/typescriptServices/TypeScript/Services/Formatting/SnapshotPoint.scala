package typings.typescriptServices.TypeScript.Services.Formatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapshotPoint extends js.Object {
  
  def add(offset: Double): SnapshotPoint = js.native
  
  def getContainingLine(): ITextSnapshotLine = js.native
  
  var position: Double = js.native
  
  var snapshot: ITextSnapshot = js.native
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
  implicit class SnapshotPointOps[Self <: SnapshotPoint] (val x: Self) extends AnyVal {
    
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
    def setAdd(value: Double => SnapshotPoint): Self = this.set("add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetContainingLine(value: () => ITextSnapshotLine): Self = this.set("getContainingLine", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshot(value: ITextSnapshot): Self = this.set("snapshot", value.asInstanceOf[js.Any])
  }
}
