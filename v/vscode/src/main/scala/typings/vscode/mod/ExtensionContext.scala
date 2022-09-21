package typings.vscode.mod

import typings.vscode.anon.Dispose
import typings.vscode.anon.MementosetKeysForSynckeys
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionContext extends StObject {
  
  /**
    * Get the absolute path of a resource contained in the extension.
    *
    * *Note* that an absolute uri can be constructed via {@linkcode Uri.joinPath} and
    * {@linkcode ExtensionContext.extensionUri extensionUri}, e.g. `vscode.Uri.joinPath(context.extensionUri, relativePath);`
    *
    * @param relativePath A relative path to a resource contained in the extension.
    * @return The absolute path of the resource.
    */
  def asAbsolutePath(relativePath: String): String
  
  /**
    * Gets the extension's environment variable collection for this workspace, enabling changes
    * to be applied to terminal environment variables.
    */
  val environmentVariableCollection: EnvironmentVariableCollection
  
  /**
    * The current `Extension` instance.
    */
  val `extension`: Extension[Any]
  
  /**
    * The mode the extension is running in. This is specific to the current
    * extension. One extension may be in `ExtensionMode.Development` while
    * other extensions in the host run in `ExtensionMode.Release`.
    */
  val extensionMode: ExtensionMode
  
  /**
    * The absolute file path of the directory containing the extension. Shorthand
    * notation for {@link TextDocument.uri ExtensionContext.extensionUri.fsPath} (independent of the uri scheme).
    */
  val extensionPath: String
  
  /**
    * The uri of the directory containing the extension.
    */
  val extensionUri: Uri
  
  /**
    * A memento object that stores state independent
    * of the current opened {@link workspace.workspaceFolders workspace}.
    */
  val globalState: MementosetKeysForSynckeys
  
  /**
    * An absolute file path in which the extension can store global state.
    * The directory might not exist on disk and creation is
    * up to the extension. However, the parent directory is guaranteed to be existent.
    *
    * Use {@linkcode ExtensionContext.globalState globalState} to store key value data.
    *
    * @deprecated Use {@link ExtensionContext.globalStorageUri globalStorageUri} instead.
    */
  val globalStoragePath: String
  
  /**
    * The uri of a directory in which the extension can store global state.
    * The directory might not exist on disk and creation is
    * up to the extension. However, the parent directory is guaranteed to be existent.
    *
    * Use {@linkcode ExtensionContext.globalState globalState} to store key value data.
    *
    * @see {@linkcode FileSystem workspace.fs} for how to read and write files and folders from
    *  an uri.
    */
  val globalStorageUri: Uri
  
  /**
    * An absolute file path of a directory in which the extension can create log files.
    * The directory might not exist on disk and creation is up to the extension. However,
    * the parent directory is guaranteed to be existent.
    *
    * @deprecated Use {@link ExtensionContext.logUri logUri} instead.
    */
  val logPath: String
  
  /**
    * The uri of a directory in which the extension can create log files.
    * The directory might not exist on disk and creation is up to the extension. However,
    * the parent directory is guaranteed to be existent.
    *
    * @see {@linkcode FileSystem workspace.fs} for how to read and write files and folders from
    *  an uri.
    */
  val logUri: Uri
  
  /**
    * A storage utility for secrets. Secrets are persisted across reloads and are independent of the
    * current opened {@link workspace.workspaceFolders workspace}.
    */
  val secrets: SecretStorage
  
  /**
    * An absolute file path of a workspace specific directory in which the extension
    * can store private state. The directory might not exist on disk and creation is
    * up to the extension. However, the parent directory is guaranteed to be existent.
    *
    * Use {@linkcode ExtensionContext.workspaceState workspaceState} or
    * {@linkcode ExtensionContext.globalState globalState} to store key value data.
    *
    * @deprecated Use {@link ExtensionContext.storageUri storageUri} instead.
    */
  val storagePath: js.UndefOr[String] = js.undefined
  
  /**
    * The uri of a workspace specific directory in which the extension
    * can store private state. The directory might not exist and creation is
    * up to the extension. However, the parent directory is guaranteed to be existent.
    * The value is `undefined` when no workspace nor folder has been opened.
    *
    * Use {@linkcode ExtensionContext.workspaceState workspaceState} or
    * {@linkcode ExtensionContext.globalState globalState} to store key value data.
    *
    * @see {@linkcode FileSystem workspace.fs} for how to read and write files and folders from
    *  an uri.
    */
  val storageUri: js.UndefOr[Uri] = js.undefined
  
  /**
    * An array to which disposables can be added. When this
    * extension is deactivated the disposables will be disposed.
    *
    * *Note* that asynchronous dispose-functions aren't awaited.
    */
  val subscriptions: js.Array[Dispose]
  
  /**
    * A memento object that stores state in the context
    * of the currently opened {@link workspace.workspaceFolders workspace}.
    */
  val workspaceState: Memento
}
object ExtensionContext {
  
  inline def apply(
    asAbsolutePath: String => String,
    environmentVariableCollection: EnvironmentVariableCollection,
    `extension`: Extension[Any],
    extensionMode: ExtensionMode,
    extensionPath: String,
    extensionUri: Uri,
    globalState: MementosetKeysForSynckeys,
    globalStoragePath: String,
    globalStorageUri: Uri,
    logPath: String,
    logUri: Uri,
    secrets: SecretStorage,
    subscriptions: js.Array[Dispose],
    workspaceState: Memento
  ): ExtensionContext = {
    val __obj = js.Dynamic.literal(asAbsolutePath = js.Any.fromFunction1(asAbsolutePath), environmentVariableCollection = environmentVariableCollection.asInstanceOf[js.Any], extensionMode = extensionMode.asInstanceOf[js.Any], extensionPath = extensionPath.asInstanceOf[js.Any], extensionUri = extensionUri.asInstanceOf[js.Any], globalState = globalState.asInstanceOf[js.Any], globalStoragePath = globalStoragePath.asInstanceOf[js.Any], globalStorageUri = globalStorageUri.asInstanceOf[js.Any], logPath = logPath.asInstanceOf[js.Any], logUri = logUri.asInstanceOf[js.Any], secrets = secrets.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any], workspaceState = workspaceState.asInstanceOf[js.Any])
    __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionContext]
  }
  
  extension [Self <: ExtensionContext](x: Self) {
    
    inline def setAsAbsolutePath(value: String => String): Self = StObject.set(x, "asAbsolutePath", js.Any.fromFunction1(value))
    
    inline def setEnvironmentVariableCollection(value: EnvironmentVariableCollection): Self = StObject.set(x, "environmentVariableCollection", value.asInstanceOf[js.Any])
    
    inline def setExtension(value: Extension[Any]): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setExtensionMode(value: ExtensionMode): Self = StObject.set(x, "extensionMode", value.asInstanceOf[js.Any])
    
    inline def setExtensionPath(value: String): Self = StObject.set(x, "extensionPath", value.asInstanceOf[js.Any])
    
    inline def setExtensionUri(value: Uri): Self = StObject.set(x, "extensionUri", value.asInstanceOf[js.Any])
    
    inline def setGlobalState(value: MementosetKeysForSynckeys): Self = StObject.set(x, "globalState", value.asInstanceOf[js.Any])
    
    inline def setGlobalStoragePath(value: String): Self = StObject.set(x, "globalStoragePath", value.asInstanceOf[js.Any])
    
    inline def setGlobalStorageUri(value: Uri): Self = StObject.set(x, "globalStorageUri", value.asInstanceOf[js.Any])
    
    inline def setLogPath(value: String): Self = StObject.set(x, "logPath", value.asInstanceOf[js.Any])
    
    inline def setLogUri(value: Uri): Self = StObject.set(x, "logUri", value.asInstanceOf[js.Any])
    
    inline def setSecrets(value: SecretStorage): Self = StObject.set(x, "secrets", value.asInstanceOf[js.Any])
    
    inline def setStoragePath(value: String): Self = StObject.set(x, "storagePath", value.asInstanceOf[js.Any])
    
    inline def setStoragePathUndefined: Self = StObject.set(x, "storagePath", js.undefined)
    
    inline def setStorageUri(value: Uri): Self = StObject.set(x, "storageUri", value.asInstanceOf[js.Any])
    
    inline def setStorageUriUndefined: Self = StObject.set(x, "storageUri", js.undefined)
    
    inline def setSubscriptions(value: js.Array[Dispose]): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionsVarargs(value: Dispose*): Self = StObject.set(x, "subscriptions", js.Array(value*))
    
    inline def setWorkspaceState(value: Memento): Self = StObject.set(x, "workspaceState", value.asInstanceOf[js.Any])
  }
}
