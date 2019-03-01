package typings
package xrmLib.XrmNs.ProcessFlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a key-value pair, where the key is the Process Flow's ID, and the value is the name thereof.
  */
trait ProcessDictionary
  extends /* index */ org.scalablytyped.runtime.StringDictionary[java.lang.String]

object ProcessDictionary {
  @scala.inline
  def apply(StringDictionary: /* index */ org.scalablytyped.runtime.StringDictionary[java.lang.String] = null): ProcessDictionary = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ProcessDictionary]
  }
}

