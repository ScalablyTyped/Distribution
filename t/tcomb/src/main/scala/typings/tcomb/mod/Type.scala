package typings.tcomb.mod

import typings.tcomb.anon.Identity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Type[T]
  extends js.Function {
  
  def apply(value: T): T = js.native
  
  var displayName: java.lang.String = js.native
  
  def is(x: js.Any): /* is T */ scala.Boolean = js.native
  @JSName("is")
  var is_Original: TypeGuardPredicate[T] = js.native
  
  var meta: Identity = js.native
  
  var t: T = js.native
}
