package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an immutable snapshot of a script at a specified time.Once acquired, the
  * snapshot is observably immutable. i.e. the same calls with the same parameters will return
  * the same values.
  */
trait IScriptSnapshot extends js.Object {
  /** Releases all resources held by this script snapshot */
  var dispose: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Gets the TextChangeRange that describe how the text changed between this text and
    * an older version.  This information is used by the incremental parser to determine
    * what sections of the script need to be re-parsed.  'undefined' can be returned if the
    * change range cannot be determined.  However, in that case, incremental parsing will
    * not happen and the entire document will be re - parsed.
    */
  def getChangeRange(oldSnapshot: IScriptSnapshot): js.UndefOr[TextChangeRange]
  /** Gets the length of this script snapshot. */
  def getLength(): scala.Double
  /** Gets a portion of the script snapshot specified by [start, end). */
  def getText(start: scala.Double, end: scala.Double): java.lang.String
}

object IScriptSnapshot {
  @scala.inline
  def apply(
    getChangeRange: IScriptSnapshot => js.UndefOr[TextChangeRange],
    getLength: () => scala.Double,
    getText: (scala.Double, scala.Double) => java.lang.String,
    dispose: () => scala.Unit = null
  ): IScriptSnapshot = {
    val __obj = js.Dynamic.literal(getChangeRange = js.Any.fromFunction1(getChangeRange), getLength = js.Any.fromFunction0(getLength), getText = js.Any.fromFunction2(getText))
    if (dispose != null) __obj.updateDynamic("dispose")(js.Any.fromFunction0(dispose))
    __obj.asInstanceOf[IScriptSnapshot]
  }
}

