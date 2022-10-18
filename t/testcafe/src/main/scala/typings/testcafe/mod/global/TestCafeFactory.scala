package typings.testcafe.mod.global

import typings.testcafe.anon.PartialTestCafeConfigurat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestCafeFactory extends StObject {
  
  def apply(configuration: PartialTestCafeConfigurat): js.Promise[TestCafe] = js.native
  // NOTE: Positional arguments support is left only for backward compatibility.
  // It should be removed in future TestCafe versions.
  // All new APIs should be enabled trough the configuration object in the upper clause.
  // Please do not add new APIs here.
  def apply(
    hostname: js.UndefOr[String],
    port1: js.UndefOr[Double],
    port2: js.UndefOr[Double],
    sslOptions: js.UndefOr[TlsOptions],
    developmentMode: js.UndefOr[Boolean],
    retryTestPages: js.UndefOr[Boolean],
    cache: js.UndefOr[Boolean],
    configFile: js.UndefOr[String]
  ): js.Promise[TestCafe] = js.native
}
