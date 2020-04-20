package typings.tabris.JSX

import typings.tabris.AnonChildren
import typings.tabris.AnonHref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrinsicElements extends js.Object {
  var a: AnonHref
  var b: AnonChildren
  var big: AnonChildren
  var del: AnonChildren
  var i: AnonChildren
  var ins: AnonChildren
  var small: AnonChildren
  var span: AnonChildren
  var strong: AnonChildren
}

object IntrinsicElements {
  @scala.inline
  def apply(
    a: AnonHref,
    b: AnonChildren,
    big: AnonChildren,
    del: AnonChildren,
    i: AnonChildren,
    ins: AnonChildren,
    small: AnonChildren,
    span: AnonChildren,
    strong: AnonChildren
  ): IntrinsicElements = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], big = big.asInstanceOf[js.Any], del = del.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], ins = ins.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], strong = strong.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrinsicElements]
  }
}

