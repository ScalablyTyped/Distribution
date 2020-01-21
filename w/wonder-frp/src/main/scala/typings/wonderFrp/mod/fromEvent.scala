package typings.wonderFrp.mod

import org.scalablytyped.runtime.TopLevel
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "fromEvent")
@js.native
object fromEvent
  extends TopLevel[
      js.Function2[
        /* dom */ HTMLElement, 
        /* eventName */ String, 
        typings.wonderFrp.fromEventPatternStreamMod.FromEventPatternStream
      ]
    ]

