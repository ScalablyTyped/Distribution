package typings.vscodeNotebookRenderer

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import typings.vscodeNotebookRenderer.anon.OutputId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object global {
    
    @scala.inline
    def acquireNotebookRendererApi(rendererId: String): NotebookRendererApi[js.Any] = js.Dynamic.global.applyDynamic("acquireNotebookRendererApi")(rendererId.asInstanceOf[js.Any]).asInstanceOf[NotebookRendererApi[js.Any]]
  }
  
  trait Disposable extends StObject {
    
    def dispose(): Unit
  }
  object Disposable {
    
    @scala.inline
    def apply(dispose: () => Unit): Disposable = {
      val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose))
      __obj.asInstanceOf[Disposable]
    }
    
    @scala.inline
    implicit class DisposableMutableBuilder[Self <: Disposable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    }
  }
  
  trait NotebookCellOutputMetadata extends StObject {
    
    /**
      * Additional attributes of a cell metadata.
      */
    var custom: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  }
  object NotebookCellOutputMetadata {
    
    @scala.inline
    def apply(): NotebookCellOutputMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotebookCellOutputMetadata]
    }
    
    @scala.inline
    implicit class NotebookCellOutputMetadataMutableBuilder[Self <: NotebookCellOutputMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustom(value: StringDictionary[js.Any]): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    }
  }
  
  trait NotebookOutput extends StObject {
    
    var data: StringDictionary[js.Any]
    
    var metadata: js.UndefOr[NotebookCellOutputMetadata] = js.undefined
  }
  object NotebookOutput {
    
    @scala.inline
    def apply(data: StringDictionary[js.Any]): NotebookOutput = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotebookOutput]
    }
    
    @scala.inline
    implicit class NotebookOutputMutableBuilder[Self <: NotebookOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: StringDictionary[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: NotebookCellOutputMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    }
  }
  
  trait NotebookOutputEventParams extends StObject {
    
    var element: HTMLElement
    
    var mimeType: String
    
    var output: NotebookOutput
    
    var outputId: String
  }
  object NotebookOutputEventParams {
    
    @scala.inline
    def apply(element: HTMLElement, mimeType: String, output: NotebookOutput, outputId: String): NotebookOutputEventParams = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], outputId = outputId.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotebookOutputEventParams]
    }
    
    @scala.inline
    implicit class NotebookOutputEventParamsMutableBuilder[Self <: NotebookOutputEventParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutput(value: NotebookOutput): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputId(value: String): Self = StObject.set(x, "outputId", value.asInstanceOf[js.Any])
    }
  }
  
  trait NotebookRendererApi[T] extends StObject {
    
    def getState(): js.UndefOr[T]
    
    /**
      * Fired when an output is rendered. The `outputId` provided is the same
      * as the one given in `NotebookOutputRenderer.render` in the extension
      * API, and `onWillDestroyOutput`.
      */
    def onDidCreateOutput(listener: js.Function1[/* e */ NotebookOutputEventParams, js.Any]): Disposable
    def onDidCreateOutput(listener: js.Function1[/* e */ NotebookOutputEventParams, js.Any], thisArgs: js.Any): Disposable
    def onDidCreateOutput(
      listener: js.Function1[/* e */ NotebookOutputEventParams, js.Any],
      thisArgs: js.Any,
      disposables: js.Array[Disposable]
    ): Disposable
    def onDidCreateOutput(
      listener: js.Function1[/* e */ NotebookOutputEventParams, js.Any],
      thisArgs: Unit,
      disposables: js.Array[Disposable]
    ): Disposable
    /**
      * Fired when an output is rendered. The `outputId` provided is the same
      * as the one given in `NotebookOutputRenderer.render` in the extension
      * API, and `onWillDestroyOutput`.
      */
    @JSName("onDidCreateOutput")
    var onDidCreateOutput_Original: VSCodeEvent[NotebookOutputEventParams]
    
    /**
      * Called when the renderer uses `postMessage` on the NotebookCommunication
      * instance for this renderer.
      */
    def onDidReceiveMessage(listener: js.Function1[/* e */ js.Any, js.Any]): Disposable
    def onDidReceiveMessage(listener: js.Function1[/* e */ js.Any, js.Any], thisArgs: js.Any): Disposable
    def onDidReceiveMessage(
      listener: js.Function1[/* e */ js.Any, js.Any],
      thisArgs: js.Any,
      disposables: js.Array[Disposable]
    ): Disposable
    def onDidReceiveMessage(listener: js.Function1[/* e */ js.Any, js.Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable
    /**
      * Called when the renderer uses `postMessage` on the NotebookCommunication
      * instance for this renderer.
      */
    @JSName("onDidReceiveMessage")
    var onDidReceiveMessage_Original: VSCodeEvent[js.Any]
    
    /**
      * Fired before an output is destroyed, with its output ID, or undefined if
      * all cells are about to unmount.
      */
    def onWillDestroyOutput(listener: js.Function1[/* e */ js.UndefOr[OutputId], js.Any]): Disposable
    def onWillDestroyOutput(listener: js.Function1[/* e */ js.UndefOr[OutputId], js.Any], thisArgs: js.Any): Disposable
    def onWillDestroyOutput(
      listener: js.Function1[/* e */ js.UndefOr[OutputId], js.Any],
      thisArgs: js.Any,
      disposables: js.Array[Disposable]
    ): Disposable
    def onWillDestroyOutput(
      listener: js.Function1[/* e */ js.UndefOr[OutputId], js.Any],
      thisArgs: Unit,
      disposables: js.Array[Disposable]
    ): Disposable
    /**
      * Fired before an output is destroyed, with its output ID, or undefined if
      * all cells are about to unmount.
      */
    @JSName("onWillDestroyOutput")
    var onWillDestroyOutput_Original: VSCodeEvent[js.UndefOr[OutputId]]
    
    /**
      * Sends a message to the renderer extension code. Can be received in
      * the `onDidReceiveMessage` event in `NotebookCommunication`.
      */
    def postMessage(msg: js.Any): Unit
    
    def setState(value: T): Unit
  }
  object NotebookRendererApi {
    
    @scala.inline
    def apply[T](
      getState: () => js.UndefOr[T],
      onDidCreateOutput: (/* listener */ js.Function1[NotebookOutputEventParams, js.Any], /* thisArgs */ js.UndefOr[js.Any], /* disposables */ js.UndefOr[js.Array[Disposable]]) => Disposable,
      onDidReceiveMessage: (/* listener */ js.Function1[js.Any, js.Any], /* thisArgs */ js.UndefOr[js.Any], /* disposables */ js.UndefOr[js.Array[Disposable]]) => Disposable,
      onWillDestroyOutput: (/* listener */ js.Function1[js.UndefOr[OutputId], js.Any], /* thisArgs */ js.UndefOr[js.Any], /* disposables */ js.UndefOr[js.Array[Disposable]]) => Disposable,
      postMessage: js.Any => Unit,
      setState: T => Unit
    ): NotebookRendererApi[T] = {
      val __obj = js.Dynamic.literal(getState = js.Any.fromFunction0(getState), onDidCreateOutput = js.Any.fromFunction3(onDidCreateOutput), onDidReceiveMessage = js.Any.fromFunction3(onDidReceiveMessage), onWillDestroyOutput = js.Any.fromFunction3(onWillDestroyOutput), postMessage = js.Any.fromFunction1(postMessage), setState = js.Any.fromFunction1(setState))
      __obj.asInstanceOf[NotebookRendererApi[T]]
    }
    
    @scala.inline
    implicit class NotebookRendererApiMutableBuilder[Self <: NotebookRendererApi[?], T] (val x: Self & NotebookRendererApi[T]) extends AnyVal {
      
      @scala.inline
      def setGetState(value: () => js.UndefOr[T]): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDidCreateOutput(
        value: (/* listener */ js.Function1[NotebookOutputEventParams, js.Any], /* thisArgs */ js.UndefOr[js.Any], /* disposables */ js.UndefOr[js.Array[Disposable]]) => Disposable
      ): Self = StObject.set(x, "onDidCreateOutput", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnDidReceiveMessage(
        value: (/* listener */ js.Function1[js.Any, js.Any], /* thisArgs */ js.UndefOr[js.Any], /* disposables */ js.UndefOr[js.Array[Disposable]]) => Disposable
      ): Self = StObject.set(x, "onDidReceiveMessage", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnWillDestroyOutput(
        value: (/* listener */ js.Function1[js.UndefOr[OutputId], js.Any], /* thisArgs */ js.UndefOr[js.Any], /* disposables */ js.UndefOr[js.Array[Disposable]]) => Disposable
      ): Self = StObject.set(x, "onWillDestroyOutput", js.Any.fromFunction3(value))
      
      @scala.inline
      def setPostMessage(value: js.Any => Unit): Self = StObject.set(x, "postMessage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetState(value: T => Unit): Self = StObject.set(x, "setState", js.Any.fromFunction1(value))
    }
  }
  
  type VSCodeEvent[T] = js.Function3[
    /* listener */ js.Function1[/* e */ T, js.Any], 
    /* thisArgs */ js.UndefOr[js.Any], 
    /* disposables */ js.UndefOr[js.Array[Disposable]], 
    Disposable
  ]
}
