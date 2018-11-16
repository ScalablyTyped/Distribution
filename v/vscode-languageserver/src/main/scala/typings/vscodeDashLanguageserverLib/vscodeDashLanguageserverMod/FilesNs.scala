package typings
package vscodeDashLanguageserverLib.vscodeDashLanguageserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "Files")
@js.native
object FilesNs extends js.Object {
  var resolve: js.Function4[
    /* moduleName */ java.lang.String, 
    /* nodePath */ js.UndefOr[java.lang.String], 
    /* cwd */ js.UndefOr[java.lang.String], 
    /* tracer */ js.Function2[
      /* message */ java.lang.String, 
      /* verbose */ js.UndefOr[java.lang.String], 
      scala.Unit
    ], 
    vscodeDashLanguageserverLib.Thenable[java.lang.String]
  ] = js.native
  var resolveGlobalNodePath: js.Function1[
    /* tracer */ js.UndefOr[js.Function1[/* message */ java.lang.String, scala.Unit]], 
    js.UndefOr[java.lang.String]
  ] = js.native
  var resolveGlobalYarnPath: js.Function1[
    /* tracer */ js.UndefOr[js.Function1[/* message */ java.lang.String, scala.Unit]], 
    js.UndefOr[java.lang.String]
  ] = js.native
  var resolveModule: js.Function2[
    /* workspaceRoot */ java.lang.String, 
    /* moduleName */ java.lang.String, 
    vscodeDashLanguageserverLib.Thenable[js.Any]
  ] = js.native
  var resolveModule2: js.Function4[
    /* workspaceRoot */ java.lang.String, 
    /* moduleName */ java.lang.String, 
    /* nodePath */ java.lang.String, 
    /* tracer */ js.Function2[
      /* message */ java.lang.String, 
      /* verbose */ js.UndefOr[java.lang.String], 
      scala.Unit
    ], 
    vscodeDashLanguageserverLib.Thenable[js.Any]
  ] = js.native
  var resolveModulePath: js.Function4[
    /* workspaceRoot */ java.lang.String, 
    /* moduleName */ java.lang.String, 
    /* nodePath */ java.lang.String, 
    /* tracer */ js.Function2[
      /* message */ java.lang.String, 
      /* verbose */ js.UndefOr[java.lang.String], 
      scala.Unit
    ], 
    vscodeDashLanguageserverLib.Thenable[java.lang.String]
  ] = js.native
  var uriToFilePath: js.Function1[/* uri */ java.lang.String, js.UndefOr[java.lang.String]] = js.native
}

