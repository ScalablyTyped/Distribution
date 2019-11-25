package typings.superstruct.umdStructDashErrorMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Failure
  extends /**
  * Failures can also be augmented with any of your on custom properties.
  */
/* key */ StringDictionary[js.Any] {
  /**
    * The branch of values following a path down from the root.
    */
  var branch: Branch
  /**
    * The path of indices to retrieve the failing value from the root.
    */
  var path: Path
  /**
    * The expected type description of the failing value, or `undefined` if it
    * didn't have an expected type.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * The failing value.
    */
  var value: js.Any
}

object Failure {
  @scala.inline
  def apply(
    branch: Branch,
    path: Path,
    value: js.Any,
    StringDictionary: /**
    * Failures can also be augmented with any of your on custom properties.
    */
  /* key */ StringDictionary[js.Any] = null,
    `type`: String = null
  ): Failure = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Failure]
  }
}

