package typings.vanillaSwipe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type EventHandler = js.Function6[
    /* e */ typings.std.Event_, 
    /* deltaX */ scala.Double, 
    /* deltaY */ scala.Double, 
    /* absX */ scala.Double, 
    /* absY */ scala.Double, 
    /* duration */ scala.Double, 
    scala.Unit
  ]
}
