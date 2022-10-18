package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.libCommonClientMod.LanguageClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("vscode-languageclient", "BaseLanguageClient")
@js.native
open class BaseLanguageClient protected ()
  extends typings.vscodeLanguageclient.libCommonClientMod.BaseLanguageClient {
  def this(id: String, name: String, clientOptions: LanguageClientOptions) = this()
}
/* static members */
object BaseLanguageClient {
  
  @JSImport("vscode-languageclient", "BaseLanguageClient")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vscode-languageclient", "BaseLanguageClient.RequestsToCancelOnContentModified")
  @js.native
  def RequestsToCancelOnContentModified: Any = js.native
  inline def RequestsToCancelOnContentModified_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RequestsToCancelOnContentModified")(x.asInstanceOf[js.Any])
}
