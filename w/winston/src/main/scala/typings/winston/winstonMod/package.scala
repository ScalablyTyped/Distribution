package typings.winston

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object winstonMod {
  type LogCallback = js.Function4[
    /* error */ js.UndefOr[js.Any], 
    /* level */ js.UndefOr[String], 
    /* message */ js.UndefOr[String], 
    /* meta */ js.UndefOr[js.Any], 
    Unit
  ]
}
