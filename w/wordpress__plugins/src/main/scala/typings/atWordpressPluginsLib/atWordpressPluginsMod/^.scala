package typings
package atWordpressPluginsLib.atWordpressPluginsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/plugins", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val PluginArea: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentType */ js.Any = js.native
  def getPlugin(name: java.lang.String): js.UndefOr[Plugin] = js.native
  def getPlugins(): js.Array[Plugin] = js.native
  def registerPlugin(name: java.lang.String, settings: PluginSettings): PluginSettings = js.native
  def unregisterPlugin(name: java.lang.String): js.UndefOr[Plugin] = js.native
  def withPluginContext[CP, OP](mapContextToProps: js.Function2[/* context */ PluginContext, /* props */ OP, CP]): js.Function1[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentType<CP & OP> */ /* Component */ js.Any, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentType<OP> */ _
  ] = js.native
}

