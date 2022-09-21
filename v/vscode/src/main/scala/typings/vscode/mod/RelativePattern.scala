package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "RelativePattern")
@js.native
open class RelativePattern protected () extends StObject {
  def this(base: String, pattern: String) = this()
  def this(base: Uri, pattern: String) = this()
  /**
    * Creates a new relative pattern object with a base file path and pattern to match. This pattern
    * will be matched on file paths relative to the base.
    *
    * Example:
    * ```ts
    * const folder = vscode.workspace.workspaceFolders?.[0];
    * if (folder) {
    *
    *   // Match any TypeScript file in the root of this workspace folder
    *   const pattern1 = new vscode.RelativePattern(folder, '*.ts');
    *
    *   // Match any TypeScript file in `someFolder` inside this workspace folder
    *   const pattern2 = new vscode.RelativePattern(folder, 'someFolder/ *.ts');
    * }
    * ```
    *
    * @param base A base to which this pattern will be matched against relatively. It is recommended
    * to pass in a {@link WorkspaceFolder workspace folder} if the pattern should match inside the workspace.
    * Otherwise, a uri or string should only be used if the pattern is for a file path outside the workspace.
    * @param pattern A file glob pattern like `*.{ts,js}` that will be matched on paths relative to the base.
    */
  def this(base: WorkspaceFolder, pattern: String) = this()
  
  /**
    * A base file path to which this pattern will be matched against relatively.
    *
    * This matches the `fsPath` value of {@link RelativePattern.baseUri}.
    *
    * *Note:* updating this value will update {@link RelativePattern.baseUri} to
    * be a uri with `file` scheme.
    *
    * @deprecated This property is deprecated, please use {@link RelativePattern.baseUri} instead.
    */
  var base: String = js.native
  
  /**
    * A base file path to which this pattern will be matched against relatively.
    */
  var baseUri: Uri = js.native
  
  /**
    * A file glob pattern like `*.{ts,js}` that will be matched on file paths
    * relative to the base path.
    *
    * Example: Given a base of `/home/work/folder` and a file path of `/home/work/folder/index.js`,
    * the file glob pattern will match on `index.js`.
    */
  var pattern: String = js.native
}
