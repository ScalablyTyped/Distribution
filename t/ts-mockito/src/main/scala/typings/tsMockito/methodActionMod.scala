package typings.tsMockito

import typings.tsMockito.matcherMod.Matcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object methodActionMod {
  
  @JSImport("ts-mockito/lib/MethodAction", "MethodAction")
  @js.native
  class MethodAction protected () extends StObject {
    def this(methodName: String, args: js.Array[js.Any]) = this()
    
    var args: js.Array[js.Any] = js.native
    
    /* private */ var callIndex: js.Any = js.native
    
    def getCallIndex(): Double = js.native
    
    def hasBeenCalledBefore(action: MethodAction): Boolean = js.native
    
    def isApplicable(methodName: String, matchers: js.Array[Matcher]): Boolean = js.native
    
    var methodName: String = js.native
  }
  /* static members */
  object MethodAction {
    
    @JSImport("ts-mockito/lib/MethodAction", "MethodAction")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ts-mockito/lib/MethodAction", "MethodAction.globalCallIndex")
    @js.native
    def globalCallIndex: js.Any = js.native
    inline def globalCallIndex_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("globalCallIndex")(x.asInstanceOf[js.Any])
  }
}
