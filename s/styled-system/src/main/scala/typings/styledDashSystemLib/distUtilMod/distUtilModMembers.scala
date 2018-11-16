package typings
package styledDashSystemLib.distUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("styled-system/dist/util", JSImport.Namespace)
@js.native
object distUtilModMembers extends js.Object {
  val defaultBreakpoints: js.Array[java.lang.String] = js.native
  def cloneFunc(fn: js.Function1[/* repeated */js.Any, _]): js.Function1[/* repeated */js.Any, _] = js.native
  def compose(funcs: (js.Function1[/* repeated */js.Any, _])*): js.Function1[/* repeated */js.Any, _] = js.native
  def createMediaQuery(n: java.lang.String): java.lang.String = js.native
  def get(obj: js.Any, paths: (java.lang.String | scala.Double)*): js.Any = js.native
  def is(n: js.Any): scala.Boolean = js.native
  def merge(a: js.Any, b: js.Any): js.Any = js.native
  def num(n: js.Any): scala.Boolean = js.native
  def px(n: js.Any): java.lang.String = js.native
  def style(args: LowLevelStylefunctionArguments): js.Any = js.native
  def themeGet(keys: java.lang.String): js.Any = js.native
  def themeGet(keys: java.lang.String, fallback: java.lang.String): js.Any = js.native
}

