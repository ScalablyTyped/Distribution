package typings.waterline.waterlineMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var adapters: StringDictionary[Adapter]
  var connections: StringDictionary[Connection]
}

object Config {
  @scala.inline
  def apply(adapters: StringDictionary[Adapter], connections: StringDictionary[Connection]): Config = {
    val __obj = js.Dynamic.literal(adapters = adapters.asInstanceOf[js.Any], connections = connections.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Config]
  }
}

