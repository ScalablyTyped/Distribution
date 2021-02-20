package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object ui {
  
  @scala.inline
  def apply(config: js.Any): typings.webix.webix.ui.baseview = typings.webix.mod.ui.^.asInstanceOf[js.Dynamic].applyDynamic("ui")(config.asInstanceOf[js.Any]).asInstanceOf[typings.webix.webix.ui.baseview]
  @scala.inline
  def apply(config: js.Any, parent: js.UndefOr[scala.Nothing], replacement: js.Any): typings.webix.webix.ui.baseview = (typings.webix.mod.ui.^.asInstanceOf[js.Dynamic].applyDynamic("ui")(config.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[typings.webix.webix.ui.baseview]
  @scala.inline
  def apply(config: js.Any, parent: js.Any): typings.webix.webix.ui.baseview = (typings.webix.mod.ui.^.asInstanceOf[js.Dynamic].applyDynamic("ui")(config.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[typings.webix.webix.ui.baseview]
  @scala.inline
  def apply(config: js.Any, parent: js.Any, replacement: js.Any): typings.webix.webix.ui.baseview = (typings.webix.mod.ui.^.asInstanceOf[js.Dynamic].applyDynamic("ui")(config.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[typings.webix.webix.ui.baseview]
  
  @scala.inline
  def delay(config: js.Any): scala.Unit = typings.webix.mod.ui.^.asInstanceOf[js.Dynamic].applyDynamic("delay")(config.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def fullScreen(): scala.Unit = typings.webix.mod.ui.^.asInstanceOf[js.Dynamic].applyDynamic("fullScreen")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def hasMethod(name: java.lang.String, method_name: java.lang.String): scala.Boolean = (typings.webix.mod.ui.^.asInstanceOf[js.Dynamic].applyDynamic("hasMethod")(name.asInstanceOf[js.Any], method_name.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def resize(): scala.Unit = typings.webix.mod.ui.^.asInstanceOf[js.Dynamic].applyDynamic("resize")().asInstanceOf[scala.Unit]
  
  type resizerEventName = typings.webix.webixStrings.onViewShow
  
  @scala.inline
  def scrollSize: scala.Double = typings.webix.mod.ui.^.asInstanceOf[js.Dynamic].selectDynamic("scrollSize").asInstanceOf[scala.Double]
  @scala.inline
  def scrollSize_=(x: scala.Double): scala.Unit = typings.webix.mod.ui.^.asInstanceOf[js.Dynamic].updateDynamic("scrollSize")(x.asInstanceOf[js.Any])
  
  type vscrollEventName = typings.webix.webixStrings.onScroll
  
  @scala.inline
  def zIndex(): scala.Double = typings.webix.mod.ui.^.asInstanceOf[js.Dynamic].applyDynamic("zIndex")().asInstanceOf[scala.Double]
  
  @scala.inline
  def zIndexBase: scala.Double = typings.webix.mod.ui.^.asInstanceOf[js.Dynamic].selectDynamic("zIndexBase").asInstanceOf[scala.Double]
  @scala.inline
  def zIndexBase_=(x: scala.Double): scala.Unit = typings.webix.mod.ui.^.asInstanceOf[js.Dynamic].updateDynamic("zIndexBase")(x.asInstanceOf[js.Any])
}
