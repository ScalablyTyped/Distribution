package typings.yog2DashKernel.yog2DashKernelMod

import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.nodeDashRal.nodeDashRalMod.RALNs.RalRunner
import typings.yog2DashKernel.Anon_AppendExtPath
import typings.yog2DashKernel.Fn_Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request
  extends typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request[ParamsDictionary] {
  var CURRENT_APP: String = js.native
  @JSName("ralP")
  var ralP_Original: Fn_Name = js.native
  @JSName("ral")
  var ral_Original: Anon_AppendExtPath = js.native
  def ral(serviceName: String): RalRunner = js.native
  def ral(serviceName: String, options: js.Object): RalRunner = js.native
  def ralP[T](name: String): js.Promise[T] = js.native
  def ralP[T](name: String, options: js.Object): js.Promise[T] = js.native
}

