package typings.tern.inferMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn extends Obj {
  
  val argNames: js.UndefOr[js.Array[String]] = js.native
  
  val args: js.UndefOr[js.Array[AVal]] = js.native
  
  /**
    * Asks the AVal if it contains a function type. Useful when
    * you aren’t interested in other kinds of types.
    */
  def getFunctionType(): Fn = js.native
  
  def isArrowFn(): Boolean = js.native
  
  val retval: AVal = js.native
  
  var self: js.UndefOr[Type] = js.native
}
@JSImport("tern/lib/infer", "Fn")
@js.native
object Fn extends TopLevel[FnConstructor]
