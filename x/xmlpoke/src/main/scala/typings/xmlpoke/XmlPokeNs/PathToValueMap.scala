package typings.xmlpoke.XmlPokeNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathToValueMap
  extends /* xpath */ StringDictionary[Value]
     with _Value

object PathToValueMap {
  @scala.inline
  def apply(StringDictionary: /* xpath */ StringDictionary[Value] = null): PathToValueMap = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[PathToValueMap]
  }
}

