package typings
package atUirouterCoreLib.libCommonCoreservicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait $InjectorLike extends js.Object {
  var strictDi: js.UndefOr[scala.Boolean] = js.native
  def annotate(fn: atUirouterCoreLib.libCommonCommonMod.IInjectable): js.Array[_] = js.native
  def annotate(fn: atUirouterCoreLib.libCommonCommonMod.IInjectable, strictDi: scala.Boolean): js.Array[_] = js.native
  def get(token: js.Any): js.Any = js.native
  @JSName("get")
  def get_TT[T](token: js.Any): T = js.native
  def has(token: js.Any): scala.Boolean = js.native
  def invoke(fn: atUirouterCoreLib.libCommonCommonMod.IInjectable): js.Any = js.native
  def invoke(fn: atUirouterCoreLib.libCommonCommonMod.IInjectable, context: js.Any): js.Any = js.native
  def invoke(
    fn: atUirouterCoreLib.libCommonCommonMod.IInjectable,
    context: js.Any,
    locals: atUirouterCoreLib.libCommonCommonMod.Obj
  ): js.Any = js.native
}

