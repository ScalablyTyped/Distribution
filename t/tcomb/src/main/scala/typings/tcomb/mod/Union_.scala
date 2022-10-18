package typings.tcomb.mod

import typings.tcomb.anon.Types
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
// union combinator
//
@js.native
trait Union_[T] extends Type[T] {
  
  def dispatch(x: scala.Any): Constructor[T] = js.native
  
  @JSName("meta")
  var meta_Union_ : Types[T] = js.native
  
  def update(instance: T, spec: UpdatePatch): T = js.native
  @JSName("update")
  var update_Original: Update_[T] = js.native
}
