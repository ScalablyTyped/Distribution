package typings
package webpackLib.webpackMod.webpackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugin
  extends tapableLib.tapableMod.TapableNs.Plugin {
  @JSName("apply")
  def apply(compiler: Compiler): scala.Unit
}

