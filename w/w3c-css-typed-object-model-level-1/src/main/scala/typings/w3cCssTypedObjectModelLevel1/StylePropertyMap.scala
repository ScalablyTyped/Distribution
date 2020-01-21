package typings.w3cCssTypedObjectModelLevel1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("StylePropertyMap")
@js.native
class StylePropertyMap () extends StylePropertyMapReadOnly {
  def append(property: String, values: (CSSStyleValue | String)*): Unit = js.native
  def clear(): Unit = js.native
  def delete(property: String): Unit = js.native
  def set(property: String, values: (CSSStyleValue | String)*): Unit = js.native
}

