package typings.watsonDeveloperCloud

import typings.ibmCloudSdkCore.mod.BaseService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1Mod {
  
  @JSImport("watson-developer-cloud/authorization/v1", JSImport.Namespace)
  @js.native
  class ^ protected () extends AuthorizationV1 {
    /**
      * Authorization Service
      *
      * Generates temporary auth tokens for use in untrusted environments.
      * Tokens expire after one hour.
      *
      * @param {Object} options
      * @param {String} options.username
      * @param {String} options.password
      * @param {String} [options.url] url of the service for which auth tokens are being generated
      * @constructor
      */
    def this(options: js.Any) = this()
  }
  @JSImport("watson-developer-cloud/authorization/v1", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("watson-developer-cloud/authorization/v1", "URL")
  @js.native
  def URL: String = js.native
  @scala.inline
  def URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("URL")(x.asInstanceOf[js.Any])
  
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
}
