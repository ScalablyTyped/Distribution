package typings.websequencediagrams

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object websequencediagramsMod {
  type diagramCallback = js.Function3[
    /* error */ Error | Null, 
    /* buffer */ js.UndefOr[Buffer], 
    /* mimeType */ js.UndefOr[String], 
    Unit
  ]
  type diagramUrlCallback = js.Function2[/* error */ Error | Null, /* url */ js.UndefOr[String], Unit]
}
