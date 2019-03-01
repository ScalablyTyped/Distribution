package typings
package atUirouterCoreLib.libViewViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewTuple extends js.Object {
  var uiView: atUirouterCoreLib.libViewInterfaceMod.ActiveUIView
  var viewConfig: atUirouterCoreLib.libViewInterfaceMod.ViewConfig
}

object ViewTuple {
  @scala.inline
  def apply(
    uiView: atUirouterCoreLib.libViewInterfaceMod.ActiveUIView,
    viewConfig: atUirouterCoreLib.libViewInterfaceMod.ViewConfig
  ): ViewTuple = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("uiView")(uiView)
    __obj.updateDynamic("viewConfig")(viewConfig)
    __obj.asInstanceOf[ViewTuple]
  }
}

