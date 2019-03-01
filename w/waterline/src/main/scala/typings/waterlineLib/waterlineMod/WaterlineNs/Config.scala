package typings
package waterlineLib.waterlineMod.WaterlineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var adapters: org.scalablytyped.runtime.StringDictionary[Adapter]
  var connections: org.scalablytyped.runtime.StringDictionary[Connection]
}

object Config {
  @scala.inline
  def apply(
    adapters: org.scalablytyped.runtime.StringDictionary[Adapter],
    connections: org.scalablytyped.runtime.StringDictionary[Connection]
  ): Config = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("adapters")(adapters)
    __obj.updateDynamic("connections")(connections)
    __obj.asInstanceOf[Config]
  }
}

