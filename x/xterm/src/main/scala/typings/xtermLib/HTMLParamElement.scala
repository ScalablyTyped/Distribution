package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLParamElement extends HTMLElement {
  /**
       * Sets or retrieves the name of an input parameter for an element.
       */
  var name: java.lang.String = js.native
  /**
       * Sets or retrieves the content type of the resource designated by the value attribute.
       */
  /** @deprecated */
  var `type`: java.lang.String = js.native
  /**
       * Sets or retrieves the value of an input parameter for an element.
       */
  var value: java.lang.String = js.native
  /**
       * Sets or retrieves the data type of the value attribute.
       */
  /** @deprecated */
  var valueType: java.lang.String = js.native
}

@JSGlobal("HTMLParamElement")
@js.native
object HTMLParamElement
  extends org.scalablytyped.runtime.Instantiable0[HTMLParamElement]

