package typings.winrt.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUriRuntimeClassFactory extends js.Object {
  
  def createUri(baseUri: String, relativeUri: String): Uri = js.native
  def createUri(uri: String): Uri = js.native
}
