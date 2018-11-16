package typings
package threeLib.threeDashCanvasrendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SpriteCanvasMaterialParameters
  extends threeLib.threeDashCoreMod.MaterialParameters {
  var color: js.UndefOr[scala.Double] = js.undefined
  var program: js.UndefOr[
    js.Function2[
      /* context */ stdLib.CanvasRenderingContext2D, 
      /* color */ threeLib.threeDashCoreMod.Color, 
      scala.Unit
    ]
  ] = js.undefined
}

