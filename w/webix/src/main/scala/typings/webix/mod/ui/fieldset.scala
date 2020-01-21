package typings.webix.mod.ui

import typings.webix.mod.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webix", "ui.fieldset")
@js.native
class fieldset ()
  extends typings.webix.webix.ui.baseview {
  @JSName("$scope")
  var $scope: js.Any = js.native
  @JSName("$skin")
  var $skin_Original_fieldset: WebixCallback = js.native
  @JSName("config")
  var config_fieldset: fieldsetConfig = js.native
  def getBody(): js.Any = js.native
  def resizeChildren(): Unit = js.native
}

