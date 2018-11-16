package typings
package tweezerDotJsLib.tweezerDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  var duration: js.UndefOr[scala.Double] = js.undefined
  var easing: js.UndefOr[
    js.Function4[
      /* currentTime */ scala.Double, 
      /* beginningTime */ scala.Double, 
      /* changeInValue */ scala.Double, 
      /* duration */ scala.Double, 
      scala.Double
    ]
  ] = js.undefined
  var end: scala.Double
  var start: scala.Double
}

