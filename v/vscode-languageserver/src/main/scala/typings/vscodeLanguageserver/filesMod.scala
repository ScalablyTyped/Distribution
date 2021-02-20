package typings.vscodeLanguageserver

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filesMod {
  
  object FileSystem {
    
    @JSImport("vscode-languageserver/lib/files", "FileSystem.isCaseSensitive")
    @js.native
    def isCaseSensitive(): Boolean = js.native
    
    @JSImport("vscode-languageserver/lib/files", "FileSystem.isParent")
    @js.native
    def isParent(parent: String, child: String): Boolean = js.native
  }
  
  @JSImport("vscode-languageserver/lib/files", "resolve")
  @js.native
  def resolve(
    moduleName: String,
    nodePath: js.UndefOr[scala.Nothing],
    cwd: js.UndefOr[scala.Nothing],
    tracer: js.Function2[/* message */ String, /* verbose */ js.UndefOr[String], Unit]
  ): js.Promise[String] = js.native
  @JSImport("vscode-languageserver/lib/files", "resolve")
  @js.native
  def resolve(
    moduleName: String,
    nodePath: js.UndefOr[scala.Nothing],
    cwd: String,
    tracer: js.Function2[/* message */ String, /* verbose */ js.UndefOr[String], Unit]
  ): js.Promise[String] = js.native
  @JSImport("vscode-languageserver/lib/files", "resolve")
  @js.native
  def resolve(
    moduleName: String,
    nodePath: String,
    cwd: js.UndefOr[scala.Nothing],
    tracer: js.Function2[/* message */ String, /* verbose */ js.UndefOr[String], Unit]
  ): js.Promise[String] = js.native
  @JSImport("vscode-languageserver/lib/files", "resolve")
  @js.native
  def resolve(
    moduleName: String,
    nodePath: String,
    cwd: String,
    tracer: js.Function2[/* message */ String, /* verbose */ js.UndefOr[String], Unit]
  ): js.Promise[String] = js.native
  
  @JSImport("vscode-languageserver/lib/files", "resolveGlobalNodePath")
  @js.native
  def resolveGlobalNodePath(): js.UndefOr[String] = js.native
  @JSImport("vscode-languageserver/lib/files", "resolveGlobalNodePath")
  @js.native
  def resolveGlobalNodePath(tracer: js.Function1[/* message */ String, Unit]): js.UndefOr[String] = js.native
  
  @JSImport("vscode-languageserver/lib/files", "resolveGlobalYarnPath")
  @js.native
  def resolveGlobalYarnPath(): js.UndefOr[String] = js.native
  @JSImport("vscode-languageserver/lib/files", "resolveGlobalYarnPath")
  @js.native
  def resolveGlobalYarnPath(tracer: js.Function1[/* message */ String, Unit]): js.UndefOr[String] = js.native
  
  @JSImport("vscode-languageserver/lib/files", "resolveModulePath")
  @js.native
  def resolveModulePath(
    workspaceRoot: String,
    moduleName: String,
    nodePath: String,
    tracer: js.Function2[/* message */ String, /* verbose */ js.UndefOr[String], Unit]
  ): js.Promise[String] = js.native
  
  @JSImport("vscode-languageserver/lib/files", "uriToFilePath")
  @js.native
  def uriToFilePath(uri: String): js.UndefOr[String] = js.native
}
