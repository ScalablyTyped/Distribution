package typings.svgJs.mod

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
    a: js.UndefOr[Double] = js.undefined,
    b: js.UndefOr[Double] = js.undefined,
    c: js.UndefOr[Double] = js.undefined,
    cx: js.UndefOr[Double] = js.undefined,
    cy: js.UndefOr[Double] = js.undefined,
    d: js.UndefOr[Double] = js.undefined,
    e: js.UndefOr[Double] = js.undefined,
    f: js.UndefOr[Double] = js.undefined,
    matrix: Matrix = null,
    rotation: js.UndefOr[Double] = js.undefined,
    scale: js.UndefOr[Double] = js.undefined,
    scaleX: js.UndefOr[Double] = js.undefined,
    scaleY: js.UndefOr[Double] = js.undefined,
    skewX: js.UndefOr[Double] = js.undefined,
    skewY: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): Transform = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(a)) __obj.updateDynamic("a")(a.get.asInstanceOf[js.Any])
    if (!js.isUndefined(b)) __obj.updateDynamic("b")(b.get.asInstanceOf[js.Any])
    if (!js.isUndefined(c)) __obj.updateDynamic("c")(c.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cx)) __obj.updateDynamic("cx")(cx.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cy)) __obj.updateDynamic("cy")(cy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(d)) __obj.updateDynamic("d")(d.get.asInstanceOf[js.Any])
    if (!js.isUndefined(e)) __obj.updateDynamic("e")(e.get.asInstanceOf[js.Any])
    if (!js.isUndefined(f)) __obj.updateDynamic("f")(f.get.asInstanceOf[js.Any])
    if (matrix != null) __obj.updateDynamic("matrix")(matrix.asInstanceOf[js.Any])
    if (!js.isUndefined(rotation)) __obj.updateDynamic("rotation")(rotation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleX)) __obj.updateDynamic("scaleX")(scaleX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleY)) __obj.updateDynamic("scaleY")(scaleY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skewX)) __obj.updateDynamic("skewX")(skewX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skewY)) __obj.updateDynamic("skewY")(skewY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transform]
  }
}

