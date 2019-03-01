package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DotsDurationType extends js.Object {
  var dots: js.UndefOr[scala.Double] = js.undefined
  var duration: java.lang.String
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_DotsDurationType {
  @scala.inline
  def apply(duration: java.lang.String, dots: scala.Int | scala.Double = null, `type`: java.lang.String = null): Anon_DotsDurationType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("duration")(duration)
    if (dots != null) __obj.updateDynamic("dots")(dots.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_DotsDurationType]
  }
}

