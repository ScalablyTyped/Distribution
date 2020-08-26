package typings.vscodeNotebookRenderer.mod

import typings.vscodeNotebookRenderer.anon.Element
import typings.vscodeNotebookRenderer.anon.OutputId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotebookRendererApi[T] extends js.Object {
  /**
    * Fired when an output is rendered. The `outputId` provided is the same
    * as the one given in `NotebookOutputRenderer.render` in the extension
    * API, and `onWillDestroyOutput`.
    */
  @JSName("onDidCreateOutput")
  var onDidCreateOutput_Original: VSCodeEvent[Element] = js.native
  /**
    * Called when the renderer uses `postMessage` on the NotebookCommunication
    * instance for this renderer.
    */
  @JSName("onDidReceiveMessage")
  var onDidReceiveMessage_Original: VSCodeEvent[_] = js.native
  /**
    * Fired before an output is destroyed, with its output ID, or undefined if
    * all cells are about to unmount.
    */
  @JSName("onWillDestroyOutput")
  var onWillDestroyOutput_Original: VSCodeEvent[js.UndefOr[OutputId]] = js.native
  def getState(): js.UndefOr[T] = js.native
  /**
    * Fired when an output is rendered. The `outputId` provided is the same
    * as the one given in `NotebookOutputRenderer.render` in the extension
    * API, and `onWillDestroyOutput`.
    */
  def onDidCreateOutput(listener: js.Function1[/* e */ Element, _]): Disposable = js.native
  def onDidCreateOutput(
    listener: js.Function1[/* e */ Element, _],
    thisArgs: js.UndefOr[scala.Nothing],
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onDidCreateOutput(listener: js.Function1[/* e */ Element, _], thisArgs: js.Any): Disposable = js.native
  def onDidCreateOutput(listener: js.Function1[/* e */ Element, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
  /**
    * Called when the renderer uses `postMessage` on the NotebookCommunication
    * instance for this renderer.
    */
  def onDidReceiveMessage(listener: js.Function1[/* e */ js.Any, _]): Disposable = js.native
  def onDidReceiveMessage(
    listener: js.Function1[/* e */ js.Any, _],
    thisArgs: js.UndefOr[scala.Nothing],
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onDidReceiveMessage(listener: js.Function1[/* e */ js.Any, _], thisArgs: js.Any): Disposable = js.native
  def onDidReceiveMessage(listener: js.Function1[/* e */ js.Any, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
  /**
    * Fired before an output is destroyed, with its output ID, or undefined if
    * all cells are about to unmount.
    */
  def onWillDestroyOutput(listener: js.Function1[/* e */ js.UndefOr[OutputId], _]): Disposable = js.native
  def onWillDestroyOutput(
    listener: js.Function1[/* e */ js.UndefOr[OutputId], _],
    thisArgs: js.UndefOr[scala.Nothing],
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onWillDestroyOutput(listener: js.Function1[/* e */ js.UndefOr[OutputId], _], thisArgs: js.Any): Disposable = js.native
  def onWillDestroyOutput(
    listener: js.Function1[/* e */ js.UndefOr[OutputId], _],
    thisArgs: js.Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  /**
    * Sends a message to the renderer extension code. Can be received in
    * the `onDidReceiveMessage` event in `NotebookCommunication`.
    */
  def postMessage(msg: js.Any): Unit = js.native
  def setState(value: T): Unit = js.native
}

