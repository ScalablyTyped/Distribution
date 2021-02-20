package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PullInstantiationHelpers {
  
  @js.native
  trait MutableTypeArgumentMap extends StObject {
    
    var createdDuplicateTypeArgumentMap: Boolean = js.native
    
    def ensureTypeArgumentCopy(): Unit = js.native
    
    var typeParameterArgumentMap: TypeArgumentMap = js.native
  }
  object MutableTypeArgumentMap {
    
    @scala.inline
    def apply(
      createdDuplicateTypeArgumentMap: Boolean,
      ensureTypeArgumentCopy: () => Unit,
      typeParameterArgumentMap: TypeArgumentMap
    ): MutableTypeArgumentMap = {
      val __obj = js.Dynamic.literal(createdDuplicateTypeArgumentMap = createdDuplicateTypeArgumentMap.asInstanceOf[js.Any], ensureTypeArgumentCopy = js.Any.fromFunction0(ensureTypeArgumentCopy), typeParameterArgumentMap = typeParameterArgumentMap.asInstanceOf[js.Any])
      __obj.asInstanceOf[MutableTypeArgumentMap]
    }
    
    @scala.inline
    implicit class MutableTypeArgumentMapMutableBuilder[Self <: MutableTypeArgumentMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreatedDuplicateTypeArgumentMap(value: Boolean): Self = StObject.set(x, "createdDuplicateTypeArgumentMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnsureTypeArgumentCopy(value: () => Unit): Self = StObject.set(x, "ensureTypeArgumentCopy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTypeParameterArgumentMap(value: TypeArgumentMap): Self = StObject.set(x, "typeParameterArgumentMap", value.asInstanceOf[js.Any])
    }
  }
}
