package typings
package svg4everybodyLib.svg4everybodyMod.svg4everybodyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Svg4everybodyOpts extends js.Object {
  var fallback: js.UndefOr[
    js.Function3[
      /* src */ java.lang.String, 
      /* svg */ stdLib.SVGElement, 
      /* use */ stdLib.SVGUseElement, 
      java.lang.String
    ]
  ] = js.undefined
  var nosvg: js.UndefOr[scala.Boolean] = js.undefined
  var polyfill: js.UndefOr[scala.Boolean] = js.undefined
  var validate: js.UndefOr[
    js.Function3[
      /* src */ java.lang.String, 
      /* svg */ stdLib.SVGElement, 
      /* use */ stdLib.SVGUseElement, 
      scala.Boolean
    ]
  ] = js.undefined
}

