package typings.tcomb.mod

import typings.tcomb.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
// intersection combinator
//
@js.native
trait Intersection_[T] extends Type[T] {
  
  @JSName("meta")
  var meta_Intersection_ : Name = js.native
  
  def update(instance: T, spec: UpdatePatch): T = js.native
  @JSName("update")
  var update_Original: Update_[T] = js.native
}
