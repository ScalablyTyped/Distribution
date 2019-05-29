package typings
package velocityDashAnimateLib.jqueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object velocityNs {
  type Easing = java.lang.String | js.Array[scala.Double]
  type EffectCall = js.Array[Properties] | (js.Tuple2[Properties, scala.Double | EffectCallOptions]) | (js.Tuple3[Properties, scala.Double, EffectCallOptions])
  type ElementCallback = js.Function1[/* elements */ stdLib.NodeListOf[stdLib.HTMLElement], scala.Unit]
  type ProgressCallback = js.Function5[
    /* elements */ stdLib.NodeListOf[stdLib.HTMLElement], 
    /* percentComplete */ scala.Double, 
    /* timeRemaining */ scala.Double, 
    /* timeStart */ scala.Double, 
    /* tweenValue */ scala.Double, 
    scala.Unit
  ]
  type Properties = js.Object
}
