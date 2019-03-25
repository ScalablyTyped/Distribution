package typings
package webdriverDashManagerLib.distLibProviderProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProviderInterface extends js.Object {
  var cleanFiles: js.UndefOr[js.Function0[java.lang.String]] = js.native
  var getBinaryPath: js.UndefOr[
    js.Function1[/* version */ js.UndefOr[java.lang.String], java.lang.String | scala.Null]
  ] = js.native
  var getStatus: js.UndefOr[js.Function0[java.lang.String | scala.Null]] = js.native
  var osType: js.UndefOr[java.lang.String] = js.native
  var seleniumFlag: js.UndefOr[java.lang.String] = js.native
  def updateBinary(): js.Promise[scala.Unit] = js.native
  def updateBinary(version: java.lang.String): js.Promise[scala.Unit] = js.native
}

