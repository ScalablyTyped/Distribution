package typings
package xrmLib.XrmNs.ControlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for Result value of AutoCompleteResultSet
  */
trait AutoCompleteResult extends js.Object {
  /**
    * Display value(s) for this auto-complete option
    */
  var fields: js.Array[java.lang.String]
  /**
    * Url of the icon to display
    */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The Identifier
    */
  var id: java.lang.String | scala.Double
}

