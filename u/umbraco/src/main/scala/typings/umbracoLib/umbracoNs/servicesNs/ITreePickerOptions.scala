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
  var callback: js.Function
  /*should the tree pick one or multiple items before returning*/
  var multiPicker: scala.Boolean
  /*tree section to display*/
  var section: java.lang.String
  /*specific tree to display*/
  var treeAlias: java.lang.String
}

