package typings.vscodeLanguageserver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Files {
  
  @JSImport("vscode-languageserver", "Files")
  @js.native
  val ^ : js.Any = js.native
  
  /* was `typeof fm.resolve` */
  inline def resolve(
    moduleName: String,
    nodePath: String,
    cwd: String,
    tracer: js.Function2[/* message */ String, /* verbose */ js.UndefOr[String], Unit]
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(moduleName.asInstanceOf[js.Any], nodePath.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any], tracer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def resolve(
    moduleName: String,
    nodePath: String,
    cwd: Unit,
    tracer: js.Function2[/* message */ String, /* verbose */ js.UndefOr[String], Unit]
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(moduleName.asInstanceOf[js.Any], nodePath.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any], tracer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def resolve(
    moduleName: String,
    nodePath: Unit,
    cwd: String,
    tracer: js.Function2[/* message */ String, /* verbose */ js.UndefOr[String], Unit]
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(moduleName.asInstanceOf[js.Any], nodePath.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any], tracer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def resolve(
    moduleName: String,
    nodePath: Unit,
    cwd: Unit,
    tracer: js.Function2[/* message */ String, /* verbose */ js.UndefOr[String], Unit]
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(moduleName.asInstanceOf[js.Any], nodePath.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any], tracer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  /* was `typeof fm.resolveGlobalNodePath` */
  inline def resolveGlobalNodePath(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveGlobalNodePath")().asInstanceOf[js.UndefOr[String]]
  inline def resolveGlobalNodePath(tracer: js.Function1[/* message */ String, Unit]): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveGlobalNodePath")(tracer.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  /* was `typeof fm.resolveGlobalYarnPath` */
  inline def resolveGlobalYarnPath(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveGlobalYarnPath")().asInstanceOf[js.UndefOr[String]]
  inline def resolveGlobalYarnPath(tracer: js.Function1[/* message */ String, Unit]): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveGlobalYarnPath")(tracer.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  /* was `typeof fm.resolveModulePath` */
  inline def resolveModulePath(
    workspaceRoot: String,
    moduleName: String,
    nodePath: String,
    tracer: js.Function2[/* message */ String, /* verbose */ js.UndefOr[String], Unit]
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveModulePath")(workspaceRoot.asInstanceOf[js.Any], moduleName.asInstanceOf[js.Any], nodePath.asInstanceOf[js.Any], tracer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  /* was `typeof fm.uriToFilePath` */
  inline def uriToFilePath(uri: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("uriToFilePath")(uri.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
}
