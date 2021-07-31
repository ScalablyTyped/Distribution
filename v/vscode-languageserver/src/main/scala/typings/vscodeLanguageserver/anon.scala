package typings.vscodeLanguageserver

import typings.vscodeLanguageserver.mod.RemoteWindow
import typings.vscodeLanguageserver.mod.ServerRequestHandler
import typings.vscodeLanguageserverProtocol.mod.Proposed.CallHierarchyIncomingCall
import typings.vscodeLanguageserverProtocol.mod.Proposed.CallHierarchyIncomingCallsParams
import typings.vscodeLanguageserverProtocol.mod.Proposed.CallHierarchyItem
import typings.vscodeLanguageserverProtocol.mod.Proposed.CallHierarchyOutgoingCall
import typings.vscodeLanguageserverProtocol.mod.Proposed.CallHierarchyOutgoingCallsParams
import typings.vscodeLanguageserverProtocol.mod.Proposed.CallHierarchyPrepareParams
import typings.vscodeLanguageserverProtocol.mod.Proposed.SemanticTokens
import typings.vscodeLanguageserverProtocol.mod.Proposed.SemanticTokensEdits
import typings.vscodeLanguageserverProtocol.mod.Proposed.SemanticTokensEditsParams
import typings.vscodeLanguageserverProtocol.mod.Proposed.SemanticTokensEditsPartialResult
import typings.vscodeLanguageserverProtocol.mod.Proposed.SemanticTokensParams
import typings.vscodeLanguageserverProtocol.mod.Proposed.SemanticTokensPartialResult
import typings.vscodeLanguageserverProtocol.mod.Proposed.SemanticTokensRangeParams
import typings.vscodeLanguageserverTypes.mod.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait On extends StObject {
    
    def on(
      handler: ServerRequestHandler[SemanticTokensParams, SemanticTokens, SemanticTokensPartialResult, Unit]
    ): Unit
    
    def onEdits(
      handler: ServerRequestHandler[
          SemanticTokensEditsParams, 
          SemanticTokensEdits | SemanticTokens, 
          SemanticTokensEditsPartialResult, 
          Unit
        ]
    ): Unit
    
    def onRange(
      handler: ServerRequestHandler[SemanticTokensRangeParams, SemanticTokens, SemanticTokensPartialResult, Unit]
    ): Unit
  }
  object On {
    
    @scala.inline
    def apply(
      on: ServerRequestHandler[SemanticTokensParams, SemanticTokens, SemanticTokensPartialResult, Unit] => Unit,
      onEdits: ServerRequestHandler[
          SemanticTokensEditsParams, 
          SemanticTokensEdits | SemanticTokens, 
          SemanticTokensEditsPartialResult, 
          Unit
        ] => Unit,
      onRange: ServerRequestHandler[SemanticTokensRangeParams, SemanticTokens, SemanticTokensPartialResult, Unit] => Unit
    ): On = {
      val __obj = js.Dynamic.literal(on = js.Any.fromFunction1(on), onEdits = js.Any.fromFunction1(onEdits), onRange = js.Any.fromFunction1(onRange))
      __obj.asInstanceOf[On]
    }
    
    @scala.inline
    implicit class OnMutableBuilder[Self <: On] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOn(
        value: ServerRequestHandler[SemanticTokensParams, SemanticTokens, SemanticTokensPartialResult, Unit] => Unit
      ): Self = StObject.set(x, "on", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEdits(
        value: ServerRequestHandler[
              SemanticTokensEditsParams, 
              SemanticTokensEdits | SemanticTokens, 
              SemanticTokensEditsPartialResult, 
              Unit
            ] => Unit
      ): Self = StObject.set(x, "onEdits", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRange(
        value: ServerRequestHandler[SemanticTokensRangeParams, SemanticTokens, SemanticTokensPartialResult, Unit] => Unit
      ): Self = StObject.set(x, "onRange", js.Any.fromFunction1(value))
    }
  }
  
  trait OnIncomingCalls extends StObject {
    
    def onIncomingCalls(
      handler: ServerRequestHandler[
          CallHierarchyIncomingCallsParams, 
          js.Array[CallHierarchyIncomingCall] | Null, 
          js.Array[CallHierarchyIncomingCall], 
          Unit
        ]
    ): Unit
    
    def onOutgoingCalls(
      handler: ServerRequestHandler[
          CallHierarchyOutgoingCallsParams, 
          js.Array[CallHierarchyOutgoingCall] | Null, 
          js.Array[CallHierarchyOutgoingCall], 
          Unit
        ]
    ): Unit
    
    def onPrepare(
      handler: ServerRequestHandler[CallHierarchyPrepareParams, js.Array[CallHierarchyItem] | Null, scala.Nothing, Unit]
    ): Unit
  }
  object OnIncomingCalls {
    
    @scala.inline
    def apply(
      onIncomingCalls: ServerRequestHandler[
          CallHierarchyIncomingCallsParams, 
          js.Array[CallHierarchyIncomingCall] | Null, 
          js.Array[CallHierarchyIncomingCall], 
          Unit
        ] => Unit,
      onOutgoingCalls: ServerRequestHandler[
          CallHierarchyOutgoingCallsParams, 
          js.Array[CallHierarchyOutgoingCall] | Null, 
          js.Array[CallHierarchyOutgoingCall], 
          Unit
        ] => Unit,
      onPrepare: ServerRequestHandler[CallHierarchyPrepareParams, js.Array[CallHierarchyItem] | Null, scala.Nothing, Unit] => Unit
    ): OnIncomingCalls = {
      val __obj = js.Dynamic.literal(onIncomingCalls = js.Any.fromFunction1(onIncomingCalls), onOutgoingCalls = js.Any.fromFunction1(onOutgoingCalls), onPrepare = js.Any.fromFunction1(onPrepare))
      __obj.asInstanceOf[OnIncomingCalls]
    }
    
    @scala.inline
    implicit class OnIncomingCallsMutableBuilder[Self <: OnIncomingCalls] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnIncomingCalls(
        value: ServerRequestHandler[
              CallHierarchyIncomingCallsParams, 
              js.Array[CallHierarchyIncomingCall] | Null, 
              js.Array[CallHierarchyIncomingCall], 
              Unit
            ] => Unit
      ): Self = StObject.set(x, "onIncomingCalls", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOutgoingCalls(
        value: ServerRequestHandler[
              CallHierarchyOutgoingCallsParams, 
              js.Array[CallHierarchyOutgoingCall] | Null, 
              js.Array[CallHierarchyOutgoingCall], 
              Unit
            ] => Unit
      ): Self = StObject.set(x, "onOutgoingCalls", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPrepare(
        value: ServerRequestHandler[CallHierarchyPrepareParams, js.Array[CallHierarchyItem] | Null, scala.Nothing, Unit] => Unit
      ): Self = StObject.set(x, "onPrepare", js.Any.fromFunction1(value))
    }
  }
  
  trait Placeholder extends StObject {
    
    var placeholder: String
    
    var range: Range
  }
  object Placeholder {
    
    @scala.inline
    def apply(placeholder: String, range: Range): Placeholder = {
      val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
      __obj.asInstanceOf[Placeholder]
    }
    
    @scala.inline
    implicit class PlaceholderMutableBuilder[Self <: Placeholder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    }
  }
  
  trait Window extends StObject {
    
    var window: RemoteWindow
  }
  object Window {
    
    @scala.inline
    def apply(window: RemoteWindow): Window = {
      val __obj = js.Dynamic.literal(window = window.asInstanceOf[js.Any])
      __obj.asInstanceOf[Window]
    }
    
    @scala.inline
    implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWindow(value: RemoteWindow): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    }
  }
}
