package typings.tsMockito

import typings.tsMockito.methodStubMod.MethodStub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object methodStubCollectionMod {
  
  @JSImport("ts-mockito/lib/MethodStubCollection", "MethodStubCollection")
  @js.native
  class MethodStubCollection () extends StObject {
    
    def add(item: MethodStub): Unit = js.native
    
    /* private */ var getFirstMatchingFromGroup: js.Any = js.native
    
    def getFirstMatchingFromGroupAndRemoveIfNotLast(groupIndex: Double, args: js.Array[js.Any]): MethodStub = js.native
    
    /* private */ var getFirstMatchingIndexFromGroup: js.Any = js.native
    
    /* private */ var getItemsCountInGroup: js.Any = js.native
    
    def getLastMatchingGroupIndex(args: js.Any): Double = js.native
    
    def hasMatchingInAnyGroup(args: js.Array[js.Any]): Boolean = js.native
    
    /* private */ var items: js.Any = js.native
    
    /* private */ var removeIfNotLast: js.Any = js.native
  }
}
