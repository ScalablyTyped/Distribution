package typings.uirouterAngularjs.viewDirectiveMod

import typings.uirouterAngularjs.viewsMod.Ng1ViewConfig
import typings.uirouterCore.viewInterfaceMod.ActiveUIView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIViewData extends js.Object {
  @JSName("$cfg")
  var $cfg: Ng1ViewConfig
  @JSName("$uiView")
  var $uiView: ActiveUIView
}

object UIViewData {
  @scala.inline
  def apply($cfg: Ng1ViewConfig, $uiView: ActiveUIView): UIViewData = {
    val __obj = js.Dynamic.literal($cfg = $cfg.asInstanceOf[js.Any], $uiView = $uiView.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIViewData]
  }
}

