package typings
package wallabyjsLib.wallabyjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWallabyConfig extends js.Object {
  var compilers: js.UndefOr[IWallabyCompilers] = js.undefined
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var env: js.UndefOr[IWallabyEnvironment] = js.undefined
  var files: js.Array[java.lang.String] | js.Array[IWallabyFilePattern]
  var postprocessor: js.UndefOr[IWallabyProcessor] = js.undefined
  var preprocessors: js.UndefOr[IWallabyProcessor] = js.undefined
  var testFramework: js.UndefOr[java.lang.String] = js.undefined
  var tests: js.Array[java.lang.String] | js.Array[IWallabyFilePattern]
  var workers: js.UndefOr[IWallabyWorkers] = js.undefined
}

