package typings.svgDotJs.svgDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transform extends js.Object {
   // 1,0,0,1,0,0
  var a: js.UndefOr[Double] = js.undefined
   // direct digits of matrix
  var b: js.UndefOr[Double] = js.undefined
  var c: js.UndefOr[Double] = js.undefined
  var cx: js.UndefOr[Double] = js.undefined
  var cy: js.UndefOr[Double] = js.undefined
  var d: js.UndefOr[Double] = js.undefined
  var e: js.UndefOr[Double] = js.undefined
  var f: js.UndefOr[Double] = js.undefined
  var matrix: js.UndefOr[Matrix] = js.undefined
  var rotation: js.UndefOr[Double] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
  var scaleX: js.UndefOr[Double] = js.undefined
  var scaleY: js.UndefOr[Double] = js.undefined
  var skewX: js.UndefOr[Double] = js.undefined
  var skewY: js.UndefOr[Double] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object Transform {
  @scala.inline
  def apply(
    a: Int | Double = null,
    b: Int | Double = null,
    c: Int | Double = null,
    cx: Int | Double = null,
    cy: Int | Double = null,
    d: Int | Double = null,
    e: Int | Double = null,
    f: Int | Double = null,
    matrix: Matrix = null,
    rotation: Int | Double = null,
    scale: Int | Double = null,
    scaleX: Int | Double = null,
    scaleY: Int | Double = null,
    skewX: Int | Double = null,
    skewY: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): Transform = {
    val __obj = js.Dynamic.literal()
    if (a != null) __obj.updateDynamic("a")(a.asInstanceOf[js.Any])
    if (b != null) __obj.updateDynamic("b")(b.asInstanceOf[js.Any])
    if (c != null) __obj.updateDynamic("c")(c.asInstanceOf[js.Any])
    if (cx != null) __obj.updateDynamic("cx")(cx.asInstanceOf[js.Any])
    if (cy != null) __obj.updateDynamic("cy")(cy.asInstanceOf[js.Any])
    if (d != null) __obj.updateDynamic("d")(d.asInstanceOf[js.Any])
    if (e != null) __obj.updateDynamic("e")(e.asInstanceOf[js.Any])
    if (f != null) __obj.updateDynamic("f")(f.asInstanceOf[js.Any])
    if (matrix != null) __obj.updateDynamic("matrix")(matrix)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (scaleX != null) __obj.updateDynamic("scaleX")(scaleX.asInstanceOf[js.Any])
    if (scaleY != null) __obj.updateDynamic("scaleY")(scaleY.asInstanceOf[js.Any])
    if (skewX != null) __obj.updateDynamic("skewX")(skewX.asInstanceOf[js.Any])
    if (skewY != null) __obj.updateDynamic("skewY")(skewY.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transform]
  }
}

