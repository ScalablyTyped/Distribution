package typings
package xstateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context[TContext] extends js.Object {
  var context: TContext
  var value: xstateLib.libTypesMod.StateValue
}

object Anon_Context {
  @scala.inline
  def apply[TContext](context: TContext, value: xstateLib.libTypesMod.StateValue): Anon_Context[TContext] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Context[TContext]]
  }
}

