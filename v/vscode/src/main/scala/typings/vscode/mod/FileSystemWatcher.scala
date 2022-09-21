package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystemWatcher extends Disposable {
  
  /**
    * true if this file system watcher has been created such that
    * it ignores change file system events.
    */
  val ignoreChangeEvents: Boolean = js.native
  
  /**
    * true if this file system watcher has been created such that
    * it ignores creation file system events.
    */
  val ignoreCreateEvents: Boolean = js.native
  
  /**
    * true if this file system watcher has been created such that
    * it ignores delete file system events.
    */
  val ignoreDeleteEvents: Boolean = js.native
  
  /**
    * An event which fires on file/folder change.
    */
  def onDidChange(listener: js.Function1[/* e */ Uri, Any]): Disposable = js.native
  def onDidChange(listener: js.Function1[/* e */ Uri, Any], thisArgs: Any): Disposable = js.native
  def onDidChange(listener: js.Function1[/* e */ Uri, Any], thisArgs: Any, disposables: js.Array[Disposable]): Disposable = js.native
  def onDidChange(listener: js.Function1[/* e */ Uri, Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
  
  /**
    * An event which fires on file/folder creation.
    */
  def onDidCreate(listener: js.Function1[/* e */ Uri, Any]): Disposable = js.native
  def onDidCreate(listener: js.Function1[/* e */ Uri, Any], thisArgs: Any): Disposable = js.native
  def onDidCreate(listener: js.Function1[/* e */ Uri, Any], thisArgs: Any, disposables: js.Array[Disposable]): Disposable = js.native
  def onDidCreate(listener: js.Function1[/* e */ Uri, Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
  
  /**
    * An event which fires on file/folder deletion.
    */
  def onDidDelete(listener: js.Function1[/* e */ Uri, Any]): Disposable = js.native
  def onDidDelete(listener: js.Function1[/* e */ Uri, Any], thisArgs: Any): Disposable = js.native
  def onDidDelete(listener: js.Function1[/* e */ Uri, Any], thisArgs: Any, disposables: js.Array[Disposable]): Disposable = js.native
  def onDidDelete(listener: js.Function1[/* e */ Uri, Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
}
