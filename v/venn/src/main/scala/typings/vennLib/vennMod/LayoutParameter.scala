package typings
package vennLib.vennMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutParameter extends js.Object {
  var lossFunction: js.UndefOr[
    js.Function2[
      /* sets */ org.scalablytyped.runtime.StringDictionary[Circle], 
      /* overlaps */ js.Array[Overlap], 
      scala.Double
    ]
  ] = js.undefined
  var restarts: js.UndefOr[scala.Double] = js.undefined
}

object LayoutParameter {
  @scala.inline
  def apply(
    lossFunction: js.Function2[
      /* sets */ org.scalablytyped.runtime.StringDictionary[Circle], 
      /* overlaps */ js.Array[Overlap], 
      scala.Double
    ] = null,
    restarts: scala.Int | scala.Double = null
  ): LayoutParameter = {
    val __obj = js.Dynamic.literal()
    if (lossFunction != null) __obj.updateDynamic("lossFunction")(lossFunction)
    if (restarts != null) __obj.updateDynamic("restarts")(restarts.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutParameter]
  }
}

