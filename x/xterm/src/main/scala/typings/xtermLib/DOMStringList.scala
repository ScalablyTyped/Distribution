package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DOMStringList
  extends /* index */ ScalablyTyped.runtime.NumberDictionary[java.lang.String] {
  /**
       * Returns the number of strings in strings.
       */
  val length: scala.Double
  /**
       * Returns true if strings contains string, and false
       * otherwise.
       */
  def contains(string: java.lang.String): scala.Boolean
  /**
       * Returns the string with index index from strings.
       */
  def item(index: scala.Double): java.lang.String | scala.Null
}

@JSGlobal("DOMStringList")
@js.native
object DOMStringList
  extends ScalablyTyped.runtime.Instantiable0[DOMStringList]

