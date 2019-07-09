package typings
package atTensorflowTfjsDashCoreLib.distIoHttpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/io/http", "HTTPRequest")
@js.native
class HTTPRequest protected ()
  extends atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler {
  def this(path: java.lang.String) = this()
  def this(path: java.lang.String, loadOptions: atTensorflowTfjsDashCoreLib.distIoTypesMod.LoadOptions) = this()
  val DEFAULT_METHOD: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.POST = js.native
  val fetch: js.Any = js.native
  var loadWeights: js.Any = js.native
  val onProgress: js.Any = js.native
  val path: java.lang.String = js.native
  val requestInit: stdLib.RequestInit = js.native
  val weightPathPrefix: js.Any = js.native
  /**
    * Load model artifacts via HTTP request(s).
    *
    * See the documentation to `tf.io.http` for details on the saved
    * artifacts.
    *
    * @returns The loaded model artifacts (if loading succeeds).
    */
  @JSName("load")
  def load_MHTTPRequest(): js.Promise[atTensorflowTfjsDashCoreLib.distIoTypesMod.ModelArtifacts] = js.native
  @JSName("save")
  def save_MHTTPRequest(modelArtifacts: atTensorflowTfjsDashCoreLib.distIoTypesMod.ModelArtifacts): js.Promise[atTensorflowTfjsDashCoreLib.distIoTypesMod.SaveResult] = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-core/dist/io/http", "HTTPRequest")
@js.native
object HTTPRequest extends js.Object {
  val URL_SCHEME_REGEX: stdLib.RegExp = js.native
}

