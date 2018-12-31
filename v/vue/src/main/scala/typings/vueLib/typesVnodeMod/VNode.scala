package typings
package vueLib.typesVnodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VNode extends js.Object {
  var children: js.UndefOr[js.Array[VNode]] = js.undefined
  var componentInstance: js.UndefOr[vueLib.typesVueMod.Vue] = js.undefined
  var componentOptions: js.UndefOr[VNodeComponentOptions] = js.undefined
  var context: js.UndefOr[vueLib.typesVueMod.Vue] = js.undefined
  var data: js.UndefOr[VNodeData] = js.undefined
  var elm: js.UndefOr[stdLib.Node] = js.undefined
  var isComment: scala.Boolean
  var isRootInsert: scala.Boolean
  var isStatic: js.UndefOr[scala.Boolean] = js.undefined
  var key: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var ns: js.UndefOr[java.lang.String] = js.undefined
  var parent: js.UndefOr[VNode] = js.undefined
  var raw: js.UndefOr[scala.Boolean] = js.undefined
  var tag: js.UndefOr[java.lang.String] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
}

