package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "Files")
@js.native
object Files extends js.Object {
  var resolve: js.Function4[
    /* moduleName */ String, 
    /* nodePath */ js.UndefOr[String], 
    /* cwd */ js.UndefOr[String], 
    /* tracer */ js.Function2[/* message */ String, /* verbose */ js.UndefOr[String], Unit], 
    Thenable[String]
  ] = js.native
  var resolveGlobalNodePath: js.Function1[
    /* tracer */ js.UndefOr[js.Function1[/* message */ String, Unit]], 
    js.UndefOr[String]
  ] = js.native
  var resolveGlobalYarnPath: js.Function1[
    /* tracer */ js.UndefOr[js.Function1[/* message */ String, Unit]], 
    js.UndefOr[String]
  ] = js.native
  var resolveModule: js.Function2[/* workspaceRoot */ String, /* moduleName */ String, Thenable[js.Any]] = js.native
  var resolveModule2: js.Function4[
    /* workspaceRoot */ String, 
    /* moduleName */ String, 
    /* nodePath */ String, 
    /* tracer */ js.Function2[/* message */ String, /* verbose */ js.UndefOr[String], Unit], 
    Thenable[js.Any]
  ] = js.native
  var resolveModulePath: js.Function4[
    /* workspaceRoot */ String, 
    /* moduleName */ String, 
    /* nodePath */ String, 
    /* tracer */ js.Function2[/* message */ String, /* verbose */ js.UndefOr[String], Unit], 
    Thenable[String]
  ] = js.native
  var uriToFilePath: js.Function1[/* uri */ String, js.UndefOr[String]] = js.native
}

