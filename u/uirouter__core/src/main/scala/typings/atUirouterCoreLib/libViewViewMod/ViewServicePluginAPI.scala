package typings
package atUirouterCoreLib.libViewViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewServicePluginAPI extends js.Object {
  def _activeViewConfigs(): js.Array[atUirouterCoreLib.libViewInterfaceMod.ViewConfig] = js.native
  def _onSync(listener: ViewSyncListener): js.Function = js.native
  /** @param id router.$id + "." + uiView.id */
  def _registeredUIView(id: java.lang.String): atUirouterCoreLib.libViewInterfaceMod.ActiveUIView = js.native
  def _registeredUIViews(): js.Array[atUirouterCoreLib.libViewInterfaceMod.ActiveUIView] = js.native
  def _rootViewContext(): atUirouterCoreLib.libViewInterfaceMod.ViewContext = js.native
  def _rootViewContext(context: atUirouterCoreLib.libViewInterfaceMod.ViewContext): atUirouterCoreLib.libViewInterfaceMod.ViewContext = js.native
  def _viewConfigFactory(viewType: java.lang.String, factory: ViewConfigFactory): js.Any = js.native
}

