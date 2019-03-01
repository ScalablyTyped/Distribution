package typings
package webpackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Exclude extends js.Object {
  var exclude: js.UndefOr[
    webpackLib.webpackMod.webpackNs.Condition | js.Array[webpackLib.webpackMod.webpackNs.Condition]
  ] = js.undefined
  var include: js.UndefOr[
    webpackLib.webpackMod.webpackNs.Condition | js.Array[webpackLib.webpackMod.webpackNs.Condition]
  ] = js.undefined
  var test: js.UndefOr[
    webpackLib.webpackMod.webpackNs.Condition | js.Array[webpackLib.webpackMod.webpackNs.Condition]
  ] = js.undefined
}

object Anon_Exclude {
  @scala.inline
  def apply(
    exclude: webpackLib.webpackMod.webpackNs.Condition | js.Array[webpackLib.webpackMod.webpackNs.Condition] = null,
    include: webpackLib.webpackMod.webpackNs.Condition | js.Array[webpackLib.webpackMod.webpackNs.Condition] = null,
    test: webpackLib.webpackMod.webpackNs.Condition | js.Array[webpackLib.webpackMod.webpackNs.Condition] = null
  ): Anon_Exclude = {
    val __obj = js.Dynamic.literal()
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Exclude]
  }
}

