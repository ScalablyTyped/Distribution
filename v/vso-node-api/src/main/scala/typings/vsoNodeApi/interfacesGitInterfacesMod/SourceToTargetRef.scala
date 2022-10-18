package typings.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceToTargetRef extends StObject {
  
  /**
    * The source ref to copy. For example, refs/heads/master.
    */
  var sourceRef: String
  
  /**
    * The target ref to update. For example, refs/heads/master.
    */
  var targetRef: String
}
object SourceToTargetRef {
  
  inline def apply(sourceRef: String, targetRef: String): SourceToTargetRef = {
    val __obj = js.Dynamic.literal(sourceRef = sourceRef.asInstanceOf[js.Any], targetRef = targetRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceToTargetRef]
  }
  
  extension [Self <: SourceToTargetRef](x: Self) {
    
    inline def setSourceRef(value: String): Self = StObject.set(x, "sourceRef", value.asInstanceOf[js.Any])
    
    inline def setTargetRef(value: String): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
  }
}
