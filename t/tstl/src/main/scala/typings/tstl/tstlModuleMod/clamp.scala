package typings.tstl.tstlModuleMod

import typings.tstl.comparatorMod.Comparator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/module", "clamp")
@js.native
object clamp extends js.Object {
  
  def apply[T](v: T, lo: T, hi: T): T = js.native
  def apply[T](v: T, lo: T, hi: T, comp: Comparator[T, T]): T = js.native
}
