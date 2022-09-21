package typings.tsMockito

import typings.tsMockito.methodStubMod.MethodStub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object methodStubCollectionMod {
  
  @JSImport("ts-mockito/lib/MethodStubCollection", "MethodStubCollection")
  @js.native
  open class MethodStubCollection () extends StObject {
    
    def add(item: MethodStub): Unit = js.native
    
    /* private */ var getFirstMatchingFromGroup: Any = js.native
    
    def getFirstMatchingFromGroupAndRemoveIfNotLast(groupIndex: Double, args: js.Array[Any]): MethodStub = js.native
    
    /* private */ var getFirstMatchingIndexFromGroup: Any = js.native
    
    /* private */ var getItemsCountInGroup: Any = js.native
    
    def getLastMatchingGroupIndex(args: Any): Double = js.native
    
    def hasMatchingInAnyGroup(args: js.Array[Any]): Boolean = js.native
    
    /* private */ var items: Any = js.native
    
    /* private */ var removeIfNotLast: Any = js.native
  }
}
