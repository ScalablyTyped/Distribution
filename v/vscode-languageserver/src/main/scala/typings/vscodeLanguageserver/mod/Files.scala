package typings.vscodeLanguageserver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Files {
  
  @JSImport("vscode-languageserver", "Files.resolve")
  @js.native
  def resolve(
    moduleName: String,
    nodePath: js.UndefOr[scala.Nothing],
    cwd: js.UndefOr[scala.Nothing],
    tracer: js.Function2[/* message */ String, /* verbose */ js.UndefOr[String], Unit]
  ): js.Promise[String] = js.native
  @JSImport("vscode-languageserver", "Files.resolve")
  @js.native
  def resolve(
    moduleName: String,
    nodePath: js.UndefOr[scala.Nothing],
    cwd: String,
    tracer: js.Function2[/* message */ String, /* verbose */ js.UndefOr[String], Unit]
  ): js.Promise[String] = js.native
  @JSImport("vscode-languageserver", "Files.resolve")
  @js.native
  def resolve(
    moduleName: String,
    nodePath: String,
    cwd: js.UndefOr[scala.Nothing],
    tracer: js.Function2[/* message */ String, /* verbose */ js.UndefOr[String], Unit]
  ): js.Promise[String] = js.native
  /* was `typeof fm.resolve` */
  @JSImport("vscode-languageserver", "Files.resolve")
  @js.native
  def resolve(
    moduleName: String,
    nodePath: String,
    cwd: String,
    tracer: js.Function2[/* message */ String, /* verbose */ js.UndefOr[String], Unit]
  ): js.Promise[String] = js.native
  
  /* was `typeof fm.resolveGlobalNodePath` */
  @JSImport("vscode-languageserver", "Files.resolveGlobalNodePath")
  @js.native
  def resolveGlobalNodePath(): js.UndefOr[String] = js.native
  @JSImport("vscode-languageserver", "Files.resolveGlobalNodePath")
  @js.native
  def resolveGlobalNodePath(tracer: js.Function1[/* message */ String, Unit]): js.UndefOr[String] = js.native
  
  /* was `typeof fm.resolveGlobalYarnPath` */
  @JSImport("vscode-languageserver", "Files.resolveGlobalYarnPath")
  @js.native
  def resolveGlobalYarnPath(): js.UndefOr[String] = js.native
  @JSImport("vscode-languageserver", "Files.resolveGlobalYarnPath")
  @js.native
  def resolveGlobalYarnPath(tracer: js.Function1[/* message */ String, Unit]): js.UndefOr[String] = js.native
  
  /* was `typeof fm.resolveModulePath` */
  @JSImport("vscode-languageserver", "Files.resolveModulePath")
  @js.native
  def resolveModulePath(
    workspaceRoot: String,
    moduleName: String,
    nodePath: String,
    tracer: js.Function2[/* message */ String, /* verbose */ js.UndefOr[String], Unit]
  ): js.Promise[String] = js.native
  
  /* was `typeof fm.uriToFilePath` */
  @JSImport("vscode-languageserver", "Files.uriToFilePath")
  @js.native
  def uriToFilePath(uri: String): js.UndefOr[String] = js.native
}
