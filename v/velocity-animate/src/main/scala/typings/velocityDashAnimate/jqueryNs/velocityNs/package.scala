package typings.velocityDashAnimate.jqueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object velocityNs {
  import typings.std.HTMLElement
  import typings.std.NodeListOf

  type Easing = String | js.Array[Double]
  type EffectCall = js.Array[Properties] | (js.Tuple2[Properties, Double | EffectCallOptions]) | (js.Tuple3[Properties, Double, EffectCallOptions])
  type ElementCallback = js.Function1[/* elements */ NodeListOf[HTMLElement], Unit]
  type ProgressCallback = js.Function5[
    /* elements */ NodeListOf[HTMLElement], 
    /* percentComplete */ Double, 
    /* timeRemaining */ Double, 
    /* timeStart */ Double, 
    /* tweenValue */ Double, 
    Unit
  ]
  type Properties = js.Object
}
