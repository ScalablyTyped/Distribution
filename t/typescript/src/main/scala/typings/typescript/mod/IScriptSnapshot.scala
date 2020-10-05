package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an immutable snapshot of a script at a specified time.Once acquired, the
  * snapshot is observably immutable. i.e. the same calls with the same parameters will return
  * the same values.
  */
@js.native
trait IScriptSnapshot extends js.Object {
  /** Releases all resources held by this script snapshot */
  var dispose: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Gets the TextChangeRange that describe how the text changed between this text and
    * an older version.  This information is used by the incremental parser to determine
    * what sections of the script need to be re-parsed.  'undefined' can be returned if the
    * change range cannot be determined.  However, in that case, incremental parsing will
    * not happen and the entire document will be re - parsed.
    */
  def getChangeRange(oldSnapshot: IScriptSnapshot): js.UndefOr[TextChangeRange] = js.native
  /** Gets the length of this script snapshot. */
  def getLength(): Double = js.native
  /** Gets a portion of the script snapshot specified by [start, end). */
  def getText(start: Double, end: Double): java.lang.String = js.native
}

object IScriptSnapshot {
  @scala.inline
  def apply(
    getChangeRange: IScriptSnapshot => js.UndefOr[TextChangeRange],
    getLength: () => Double,
    getText: (Double, Double) => java.lang.String
  ): IScriptSnapshot = {
    val __obj = js.Dynamic.literal(getChangeRange = js.Any.fromFunction1(getChangeRange), getLength = js.Any.fromFunction0(getLength), getText = js.Any.fromFunction2(getText))
    __obj.asInstanceOf[IScriptSnapshot]
  }
  @scala.inline
  implicit class IScriptSnapshotOps[Self <: IScriptSnapshot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetChangeRange(value: IScriptSnapshot => js.UndefOr[TextChangeRange]): Self = this.set("getChangeRange", js.Any.fromFunction1(value))
    @scala.inline
    def setGetLength(value: () => Double): Self = this.set("getLength", js.Any.fromFunction0(value))
    @scala.inline
    def setGetText(value: (Double, Double) => java.lang.String): Self = this.set("getText", js.Any.fromFunction2(value))
    @scala.inline
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDispose: Self = this.set("dispose", js.undefined)
  }
  
}

