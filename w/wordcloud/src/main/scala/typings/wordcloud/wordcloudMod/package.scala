package typings.wordcloud

import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wordcloudMod {
  type EventCallback = js.Function3[/* item */ ListEntry, /* dimension */ Dimension, /* event */ MouseEvent, Unit]
  type ListEntry = js.Tuple2[String, Double]
}
