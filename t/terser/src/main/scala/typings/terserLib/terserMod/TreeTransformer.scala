package typings
package terserLib.terserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("terser", "TreeTransformer")
@js.native
class TreeTransformer protected () extends TreeWalker {
  def this(visitor: visitor, after: visitor) = this()
}

