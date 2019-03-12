package typings
package unzipperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Size extends js.Object {
  var stream: nodeLib.streamMod.Readable
  def size(): js.Promise[scala.Double]
}

object Anon_Size {
  @scala.inline
  def apply(size: () => js.Promise[scala.Double], stream: nodeLib.streamMod.Readable): Anon_Size = {
    val __obj = js.Dynamic.literal(size = js.Any.fromFunction0(size), stream = stream)
  
    __obj.asInstanceOf[Anon_Size]
  }
}

