package typings
package webpagetestLib.webpagetestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoOptions extends js.Object {
  /** frame comparison end point: [visual]=visually complete | all=last change | doc=document complete | full=fully loaded */
  var comparisonEndPoint: js.UndefOr[java.lang.String] = js.undefined
}

object VideoOptions {
  @scala.inline
  def apply(comparisonEndPoint: java.lang.String = null): VideoOptions = {
    val __obj = js.Dynamic.literal()
    if (comparisonEndPoint != null) __obj.updateDynamic("comparisonEndPoint")(comparisonEndPoint)
    __obj.asInstanceOf[VideoOptions]
  }
}

