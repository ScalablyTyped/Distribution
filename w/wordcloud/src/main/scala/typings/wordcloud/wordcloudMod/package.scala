package typings.wordcloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wordcloudMod {
  import typings.std.MouseEvent

  type EventCallback = js.Function3[/* item */ ListEntry, /* dimension */ Dimension, /* event */ MouseEvent, Unit]
  type ListEntry = js.Tuple2[String, Double]
}
