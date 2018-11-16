package typings
package virtualDashDomLib.VirtualDOMNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait VNode extends js.Object {
  var children: js.Array[VTree]
  var count: scala.Double
  var descendantHooks: js.Array[_]
  var hasThunks: scala.Boolean
  var hasWidgets: scala.Boolean
  var hooks: js.Array[_]
  var key: js.UndefOr[java.lang.String] = js.undefined
  var namespace: js.UndefOr[java.lang.String] = js.undefined
  var properties: VProperties
  var tagName: java.lang.String
  var `type`: java.lang.String
  var version: java.lang.String
}

