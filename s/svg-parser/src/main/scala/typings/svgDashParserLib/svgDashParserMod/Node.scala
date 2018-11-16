package typings
package svgDashParserLib.svgDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Node extends js.Object {
  var attributes: stdLib.Record[java.lang.String, java.lang.String | scala.Double]
  var children: js.Array[Node]
  var metadata: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
}

