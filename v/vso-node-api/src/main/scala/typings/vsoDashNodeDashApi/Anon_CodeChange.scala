package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CodeChange extends js.Object {
  var codeChange: Double
  var system: Double
  var text: Double
  var unknown: Double
}

object Anon_CodeChange {
  @scala.inline
  def apply(codeChange: Double, system: Double, text: Double, unknown: Double): Anon_CodeChange = {
    val __obj = js.Dynamic.literal(codeChange = codeChange, system = system, text = text, unknown = unknown)
  
    __obj.asInstanceOf[Anon_CodeChange]
  }
}

