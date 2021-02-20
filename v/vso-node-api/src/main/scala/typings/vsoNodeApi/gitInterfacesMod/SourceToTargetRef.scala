package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceToTargetRef extends StObject {
  
  /**
    * The source ref to copy. For example, refs/heads/master.
    */
  var sourceRef: String = js.native
  
  /**
    * The target ref to update. For example, refs/heads/master.
    */
  var targetRef: String = js.native
}
object SourceToTargetRef {
  
  @scala.inline
  def apply(sourceRef: String, targetRef: String): SourceToTargetRef = {
    val __obj = js.Dynamic.literal(sourceRef = sourceRef.asInstanceOf[js.Any], targetRef = targetRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceToTargetRef]
  }
  
  @scala.inline
  implicit class SourceToTargetRefMutableBuilder[Self <: SourceToTargetRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSourceRef(value: String): Self = StObject.set(x, "sourceRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetRef(value: String): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
  }
}
