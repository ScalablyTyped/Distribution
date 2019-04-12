package typings
package vscodeDashLanguageserverLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver/lib/files", JSImport.Namespace)
@js.native
object libFilesMod extends js.Object {
  def resolve(
    moduleName: java.lang.String,
    nodePath: java.lang.String,
    cwd: java.lang.String,
    tracer: js.Function2[
      /* message */ java.lang.String, 
      /* verbose */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): vscodeDashLanguageserverLib.Thenable[java.lang.String] = js.native
  def resolve(
    moduleName: java.lang.String,
    nodePath: java.lang.String,
    cwd: js.UndefOr[scala.Nothing],
    tracer: js.Function2[
      /* message */ java.lang.String, 
      /* verbose */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): vscodeDashLanguageserverLib.Thenable[java.lang.String] = js.native
  def resolve(
    moduleName: java.lang.String,
    nodePath: js.UndefOr[scala.Nothing],
    cwd: java.lang.String,
    tracer: js.Function2[
      /* message */ java.lang.String, 
      /* verbose */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): vscodeDashLanguageserverLib.Thenable[java.lang.String] = js.native
  def resolve(
    moduleName: java.lang.String,
    nodePath: js.UndefOr[scala.Nothing],
    cwd: js.UndefOr[scala.Nothing],
    tracer: js.Function2[
      /* message */ java.lang.String, 
      /* verbose */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): vscodeDashLanguageserverLib.Thenable[java.lang.String] = js.native
  def resolveGlobalNodePath(): js.UndefOr[java.lang.String] = js.native
  def resolveGlobalNodePath(tracer: js.Function1[/* message */ java.lang.String, scala.Unit]): js.UndefOr[java.lang.String] = js.native
  def resolveGlobalYarnPath(): js.UndefOr[java.lang.String] = js.native
  def resolveGlobalYarnPath(tracer: js.Function1[/* message */ java.lang.String, scala.Unit]): js.UndefOr[java.lang.String] = js.native
  def resolveModulePath(
    workspaceRoot: java.lang.String,
    moduleName: java.lang.String,
    nodePath: java.lang.String,
    tracer: js.Function2[
      /* message */ java.lang.String, 
      /* verbose */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): vscodeDashLanguageserverLib.Thenable[java.lang.String] = js.native
  def uriToFilePath(uri: java.lang.String): js.UndefOr[java.lang.String] = js.native
  @JSName("FileSystem")
  @js.native
  object FileSystemNs extends js.Object {
    def isCaseSensitive(): scala.Boolean = js.native
    def isParent(parent: java.lang.String, child: java.lang.String): scala.Boolean = js.native
  }
  
}

