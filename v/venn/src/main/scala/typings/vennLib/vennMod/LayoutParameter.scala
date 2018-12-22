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

