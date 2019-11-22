package typings.webpackDashNodeDashExternals.webpackDashNodeDashExternalsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModulesFromFileType extends js.Object {
  var exclude: js.UndefOr[String | js.Array[String]] = js.undefined
  var include: js.UndefOr[String | js.Array[String]] = js.undefined
}

object ModulesFromFileType {
  @scala.inline
  def apply(exclude: String | js.Array[String] = null, include: String | js.Array[String] = null): ModulesFromFileType = {
    val __obj = js.Dynamic.literal()
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModulesFromFileType]
  }
}

