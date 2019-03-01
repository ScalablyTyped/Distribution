package typings
package umbracoLib.umbracoNs.servicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Iconpicker dialog options object
  */
trait ITreePickerOptions extends js.Object {
  /*callback function*/
  var callback: angularLib.angularMod.Global.Function
  /*should the tree pick one or multiple items before returning*/
  var multiPicker: scala.Boolean
  /*tree section to display*/
  var section: java.lang.String
  /*specific tree to display*/
  var treeAlias: java.lang.String
}

object ITreePickerOptions {
  @scala.inline
  def apply(
    callback: angularLib.angularMod.Global.Function,
    multiPicker: scala.Boolean,
    section: java.lang.String,
    treeAlias: java.lang.String
  ): ITreePickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("callback")(callback)
    __obj.updateDynamic("multiPicker")(multiPicker)
    __obj.updateDynamic("section")(section)
    __obj.updateDynamic("treeAlias")(treeAlias)
    __obj.asInstanceOf[ITreePickerOptions]
  }
}

