package typings.uikit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type UIkitElement = js.Object | typings.std.HTMLElement | java.lang.String
  type UIkitNode = typings.std.Node
  type UIkitNodes = typings.std.NodeList | typings.std.HTMLCollection | typings.uikit.mod.UIkitNode
}
