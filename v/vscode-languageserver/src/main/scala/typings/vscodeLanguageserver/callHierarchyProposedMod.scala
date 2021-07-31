package typings.vscodeLanguageserver

import typings.vscodeLanguageserver.anon.OnIncomingCalls
import typings.vscodeLanguageserver.mod.Feature
import typings.vscodeLanguageserver.mod._Languages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object callHierarchyProposedMod {
  
  @JSImport("vscode-languageserver/lib/callHierarchy.proposed", "CallHierarchyFeature")
  @js.native
  val CallHierarchyFeature: Feature[_Languages, CallHierarchy] = js.native
  
  trait CallHierarchy extends StObject {
    
    var callHierarchy: OnIncomingCalls
  }
  object CallHierarchy {
    
    @scala.inline
    def apply(callHierarchy: OnIncomingCalls): CallHierarchy = {
      val __obj = js.Dynamic.literal(callHierarchy = callHierarchy.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallHierarchy]
    }
    
    @scala.inline
    implicit class CallHierarchyMutableBuilder[Self <: CallHierarchy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallHierarchy(value: OnIncomingCalls): Self = StObject.set(x, "callHierarchy", value.asInstanceOf[js.Any])
    }
  }
}
