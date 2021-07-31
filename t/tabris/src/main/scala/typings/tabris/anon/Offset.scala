package typings.tabris.anon

import typings.tabris.mod.ConstraintLikeObject
import typings.tabris.mod.PercentValue
import typings.tabris.mod.SiblingReferenceValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Offset
  extends StObject
     with ConstraintLikeObject {
  
  var offset: js.UndefOr[typings.tabris.mod.Offset] = js.undefined
  
  var reference: SiblingReferenceValue | PercentValue
}
object Offset {
  
  @scala.inline
  def apply(reference: SiblingReferenceValue | PercentValue): Offset = {
    val __obj = js.Dynamic.literal(reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offset]
  }
  
  @scala.inline
  implicit class OffsetMutableBuilder[Self <: Offset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOffset(value: typings.tabris.mod.Offset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setReference(value: SiblingReferenceValue | PercentValue): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
  }
}
