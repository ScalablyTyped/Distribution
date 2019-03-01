package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Keyframe
  extends /* property */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double | scala.Null]] {
  var composite: js.UndefOr[CompositeOperationOrAuto] = js.undefined
  var easing: js.UndefOr[java.lang.String] = js.undefined
  var offset: js.UndefOr[scala.Double | scala.Null] = js.undefined
}

object Keyframe {
  @scala.inline
  def apply(
    StringDictionary: /* property */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double | scala.Null]] = null,
    composite: CompositeOperationOrAuto = null,
    easing: java.lang.String = null,
    offset: scala.Int | scala.Double = null
  ): Keyframe = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (composite != null) __obj.updateDynamic("composite")(composite)
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Keyframe]
  }
}

