package typings
package vscodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dispose extends js.Object {
  def dispose(): js.Any
}

object Anon_Dispose {
  @scala.inline
  def apply(dispose: () => js.Any): Anon_Dispose = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose))
  
    __obj.asInstanceOf[Anon_Dispose]
  }
}

