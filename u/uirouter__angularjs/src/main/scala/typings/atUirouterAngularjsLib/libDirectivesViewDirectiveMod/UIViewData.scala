package typings
package atUirouterAngularjsLib.libDirectivesViewDirectiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIViewData extends js.Object {
  @JSName("$cfg")
  var $cfg: atUirouterAngularjsLib.libStatebuildersViewsMod.Ng1ViewConfig
  @JSName("$uiView")
  var $uiView: atUirouterCoreLib.libViewInterfaceMod.ActiveUIView
}

object UIViewData {
  @scala.inline
  def apply(
    $cfg: atUirouterAngularjsLib.libStatebuildersViewsMod.Ng1ViewConfig,
    $uiView: atUirouterCoreLib.libViewInterfaceMod.ActiveUIView
  ): UIViewData = {
    val __obj = js.Dynamic.literal($cfg = $cfg, $uiView = $uiView)
  
    __obj.asInstanceOf[UIViewData]
  }
}

