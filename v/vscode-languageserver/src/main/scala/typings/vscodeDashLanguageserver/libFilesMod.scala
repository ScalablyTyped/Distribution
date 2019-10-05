package typings.vscodeDashLanguageserver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver/lib/files", JSImport.Namespace)
@js.native
object libFilesMod extends js.Object {
  def resolve(
    moduleName: String,
    nodePath: js.UndefOr[scala.Nothing],
    cwd: js.UndefOr[scala.Nothing],
    tracer: js.Function2[/* message */ String, /* verbose */ js.UndefOr[String], Unit]
  ): Thenable[String] = js.native
  def resolve(
    moduleName: String,
    nodePath: js.UndefOr[scala.Nothing],
    cwd: String,
    tracer: js.Function2[/* message */ String, /* verbose */ js.UndefOr[String], Unit]
  ): Thenable[String] = js.native
  def resolve(
    moduleName: String,
    nodePath: String,
    cwd: js.UndefOr[scala.Nothing],
    tracer: js.Function2[/* message */ String, /* verbose */ js.UndefOr[String], Unit]
  ): Thenable[String] = js.native
  def resolve(
    moduleName: String,
    nodePath: String,
    cwd: String,
    tracer: js.Function2[/* message */ String, /* verbose */ js.UndefOr[String], Unit]
  ): Thenable[String] = js.native
  def resolveGlobalNodePath(): js.UndefOr[String] = js.native
  def resolveGlobalNodePath(tracer: js.Function1[/* message */ String, Unit]): js.UndefOr[String] = js.native
  def resolveGlobalYarnPath(): js.UndefOr[String] = js.native
  def resolveGlobalYarnPath(tracer: js.Function1[/* message */ String, Unit]): js.UndefOr[String] = js.native
  def resolveModule(workspaceRoot: String, moduleName: String): Thenable[_] = js.native
  def resolveModule2(
    workspaceRoot: String,
    moduleName: String,
    nodePath: String,
    tracer: js.Function2[/* message */ String, /* verbose */ js.UndefOr[String], Unit]
  ): Thenable[_] = js.native
  def resolveModulePath(
    workspaceRoot: String,
    moduleName: String,
    nodePath: String,
    tracer: js.Function2[/* message */ String, /* verbose */ js.UndefOr[String], Unit]
  ): Thenable[String] = js.native
  def uriToFilePath(uri: String): js.UndefOr[String] = js.native
  @js.native
  object FileSystem extends js.Object {
    def isCaseSensitive(): Boolean = js.native
    def isParent(parent: String, child: String): Boolean = js.native
  }
  
}

