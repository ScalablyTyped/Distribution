package typings.tabris.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.tabris.anon.Offset
  - typings.tabris.anon.Reference
*/
trait ConstraintLikeObject
  extends StObject
     with _ConstraintValue
object ConstraintLikeObject {
  
  @scala.inline
  def Offset(reference: SiblingReferenceValue | PercentValue): typings.tabris.anon.Offset = {
    val __obj = js.Dynamic.literal(reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.tabris.anon.Offset]
  }
  
  @scala.inline
  def Reference(offset: Offset): typings.tabris.anon.Reference = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.tabris.anon.Reference]
  }
}
