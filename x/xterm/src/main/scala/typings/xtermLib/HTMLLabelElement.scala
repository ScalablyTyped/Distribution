package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLLabelElement extends HTMLElement {
  val control: HTMLElement | scala.Null = js.native
  /**
       * Retrieves a reference to the form that the object is embedded in.
       */
  val form: HTMLFormElement | scala.Null = js.native
  /**
       * Sets or retrieves the object to which the given label object is assigned.
       */
  var htmlFor: java.lang.String = js.native
}

@JSGlobal("HTMLLabelElement")
@js.native
object HTMLLabelElement
  extends ScalablyTyped.runtime.Instantiable0[HTMLLabelElement]

