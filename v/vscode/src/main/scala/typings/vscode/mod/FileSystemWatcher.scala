package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystemWatcher extends Disposable {
  
  /**
    * true if this file system watcher has been created such that
    * it ignores change file system events.
    */
  var ignoreChangeEvents: Boolean = js.native
  
  /**
    * true if this file system watcher has been created such that
    * it ignores creation file system events.
    */
  var ignoreCreateEvents: Boolean = js.native
  
  /**
    * true if this file system watcher has been created such that
    * it ignores delete file system events.
    */
  var ignoreDeleteEvents: Boolean = js.native
  
  /**
    * An event which fires on file/folder change.
    */
  def onDidChange(listener: js.Function1[/* e */ Uri, _]): Disposable = js.native
  def onDidChange(
    listener: js.Function1[/* e */ Uri, _],
    thisArgs: js.UndefOr[scala.Nothing],
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onDidChange(listener: js.Function1[/* e */ Uri, _], thisArgs: js.Any): Disposable = js.native
  def onDidChange(listener: js.Function1[/* e */ Uri, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
  /**
    * An event which fires on file/folder change.
    */
  @JSName("onDidChange")
  var onDidChange_Original: Event[Uri] = js.native
  
  /**
    * An event which fires on file/folder creation.
    */
  def onDidCreate(listener: js.Function1[/* e */ Uri, _]): Disposable = js.native
  def onDidCreate(
    listener: js.Function1[/* e */ Uri, _],
    thisArgs: js.UndefOr[scala.Nothing],
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onDidCreate(listener: js.Function1[/* e */ Uri, _], thisArgs: js.Any): Disposable = js.native
  def onDidCreate(listener: js.Function1[/* e */ Uri, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
  /**
    * An event which fires on file/folder creation.
    */
  @JSName("onDidCreate")
  var onDidCreate_Original: Event[Uri] = js.native
  
  /**
    * An event which fires on file/folder deletion.
    */
  def onDidDelete(listener: js.Function1[/* e */ Uri, _]): Disposable = js.native
  def onDidDelete(
    listener: js.Function1[/* e */ Uri, _],
    thisArgs: js.UndefOr[scala.Nothing],
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onDidDelete(listener: js.Function1[/* e */ Uri, _], thisArgs: js.Any): Disposable = js.native
  def onDidDelete(listener: js.Function1[/* e */ Uri, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
  /**
    * An event which fires on file/folder deletion.
    */
  @JSName("onDidDelete")
  var onDidDelete_Original: Event[Uri] = js.native
}
