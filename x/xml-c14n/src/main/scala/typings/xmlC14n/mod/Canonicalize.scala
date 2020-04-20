package typings.xmlC14n.mod

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Canonicalize extends js.Object {
  def _processInner(node: Node): String
  def canonicalise(node: Node, cb: canonicaliseCb): Unit
  def name(): String
}

object Canonicalize {
  @scala.inline
  def apply(_processInner: Node => String, canonicalise: (Node, canonicaliseCb) => Unit, name: () => String): Canonicalize = {
    val __obj = js.Dynamic.literal(_processInner = js.Any.fromFunction1(_processInner), canonicalise = js.Any.fromFunction2(canonicalise), name = js.Any.fromFunction0(name))
    __obj.asInstanceOf[Canonicalize]
  }
}

