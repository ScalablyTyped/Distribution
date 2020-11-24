package typings.vscodeLanguageserver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver", "Files")
@js.native
object Files extends js.Object {
  
  var resolve: js.Function4[
    /* moduleName */ String, 
    /* nodePath */ js.UndefOr[String], 
    /* cwd */ js.UndefOr[String], 
    /* tracer */ js.Function2[/* message */ String, /* verbose */ js.UndefOr[String], Unit], 
    js.Promise[String]
  ] = js.native
  
  var resolveGlobalNodePath: js.Function1[
    /* tracer */ js.UndefOr[js.Function1[/* message */ String, Unit]], 
    js.UndefOr[String]
  ] = js.native
  
  var resolveGlobalYarnPath: js.Function1[
    /* tracer */ js.UndefOr[js.Function1[/* message */ String, Unit]], 
    js.UndefOr[String]
  ] = js.native
  
  var resolveModulePath: js.Function4[
    /* workspaceRoot */ String, 
    /* moduleName */ String, 
    /* nodePath */ String, 
    /* tracer */ js.Function2[/* message */ String, /* verbose */ js.UndefOr[String], Unit], 
    js.Promise[String]
  ] = js.native
  
  var uriToFilePath: js.Function1[/* uri */ String, js.UndefOr[String]] = js.native
}
