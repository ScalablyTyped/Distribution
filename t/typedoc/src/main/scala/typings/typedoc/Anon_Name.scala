package typings.typedoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name[K /* <: String */] extends js.Object {
  var name: K
}

object Anon_Name {
  @scala.inline
  def apply[K /* <: String */](name: K): Anon_Name[K] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Name[K]]
  }
}

