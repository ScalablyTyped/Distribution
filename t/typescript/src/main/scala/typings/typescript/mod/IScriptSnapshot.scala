package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an immutable snapshot of a script at a specified time.Once acquired, the
  * snapshot is observably immutable. i.e. the same calls with the same parameters will return
  * the same values.
  */
@js.native
trait IScriptSnapshot extends StObject {
  
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
  implicit class IScriptSnapshotMutableBuilder[Self <: IScriptSnapshot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisposeUndefined: Self = StObject.set(x, "dispose", js.undefined)
    
    @scala.inline
    def setGetChangeRange(value: IScriptSnapshot => js.UndefOr[TextChangeRange]): Self = StObject.set(x, "getChangeRange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetText(value: (Double, Double) => java.lang.String): Self = StObject.set(x, "getText", js.Any.fromFunction2(value))
  }
}
