package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLOptionElement extends HTMLElement {
  /**
    * Sets or retrieves the status of an option.
    */
  var defaultSelected: scala.Boolean = js.native
  var disabled: scala.Boolean = js.native
  /**
    * Retrieves a reference to the form that the object is embedded in.
    */
  val form: HTMLFormElement | scala.Null = js.native
  /**
    * Sets or retrieves the ordinal position of an option in a list box.
    */
  val index: scala.Double = js.native
  /**
    * Sets or retrieves a value that you can use to implement your own label functionality for the object.
    */
  var label: java.lang.String = js.native
  /**
    * Sets or retrieves whether the option in the list box is the default item.
    */
  var selected: scala.Boolean = js.native
  /**
    * Sets or retrieves the text string specified by the option tag.
    */
  var text: java.lang.String = js.native
  /**
    * Sets or retrieves the value which is returned to the server when the form control is submitted.
    */
  var value: java.lang.String = js.native
}

@JSGlobal("HTMLOptionElement")
@js.native
object HTMLOptionElement
  extends org.scalablytyped.runtime.Instantiable0[HTMLOptionElement]

