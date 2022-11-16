package typings.tcomb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type Update = (instance : T, spec : tcomb.tcomb.UpdatePatch): T
}}}
to avoid circular code involving: 
- tcomb.tcomb.Update
- tcomb.tcomb.UpdatePatch
*/
@js.native
trait Update_[T] extends StObject {
  
  def apply(instance: T, spec: UpdatePatch): T = js.native
}
