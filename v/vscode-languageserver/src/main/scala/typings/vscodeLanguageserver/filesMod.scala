package typings.vscodeLanguageserver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver/lib/files", JSImport.Namespace)
@js.native
object filesMod extends js.Object {
  def resolve(
    moduleName: String,
    nodePath: js.UndefOr[String],
    cwd: js.UndefOr[String],
    tracer: js.Function2[/* message */ String, /* verbose */ js.UndefOr[String], Unit]
  ): js.Promise[String] = js.native
  def resolveGlobalNodePath(): js.UndefOr[String] = js.native
  def resolveGlobalNodePath(tracer: js.Function1[/* message */ String, Unit]): js.UndefOr[String] = js.native
  def resolveGlobalYarnPath(): js.UndefOr[String] = js.native
  def resolveGlobalYarnPath(tracer: js.Function1[/* message */ String, Unit]): js.UndefOr[String] = js.native
  def resolveModulePath(
    workspaceRoot: String,
    moduleName: String,
    nodePath: String,
    tracer: js.Function2[/* message */ String, /* verbose */ js.UndefOr[String], Unit]
  ): js.Promise[String] = js.native
  def uriToFilePath(uri: String): js.UndefOr[String] = js.native
  @js.native
  object FileSystem extends js.Object {
    def isCaseSensitive(): Boolean = js.native
    def isParent(parent: String, child: String): Boolean = js.native
  }
  
}

