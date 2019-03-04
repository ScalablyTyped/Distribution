package typings
package webpackLib.webpackMod.webpackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvePlugin
  extends tapableLib.tapableMod.TapableNs.Plugin {
  @JSName("apply")
  def apply(resolver: js.Any): scala.Unit
}

object ResolvePlugin {
  @scala.inline
  def apply(apply: js.Function1[js.Any, scala.Unit]): ResolvePlugin = {
    val __obj = js.Dynamic.literal(apply = apply)
  
    __obj.asInstanceOf[ResolvePlugin]
  }
}

