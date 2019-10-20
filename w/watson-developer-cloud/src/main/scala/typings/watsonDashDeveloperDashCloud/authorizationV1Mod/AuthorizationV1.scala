package typings.watsonDashDeveloperDashCloud.authorizationV1Mod

import typings.ibmDashCloudDashSdkDashCore.ibmDashCloudDashSdkDashCoreMod.BaseService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizationV1 extends BaseService {
  /**
    * If using an RC service, get an IAM access token. If using a CF service,
    * get a percent-encoded authorization token based on resource query string param
    *
    * @param {Object} [options]
    * @param {String} [options.url] defaults to url supplied to constructor (if any)
    * @param {Function(err, token)} callback - called with a %-encoded token if CF
    */
  def getToken(params: js.Any, callback: js.Any): js.Any = js.native
}

