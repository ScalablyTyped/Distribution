package typings.watsonDeveloperCloud

import typings.ibmCloudSdkCore.mod.IamTokenManagerV1
import typings.ibmCloudSdkCore.v1Mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iamTokenManagerV1Mod {
  
  @JSImport("watson-developer-cloud/iam-token-manager/v1", JSImport.Namespace)
  @js.native
  class ^ protected () extends IamTokenManagerV1 {
    /**
      * IAM Token Manager Service
      *
      * Retreives, stores, and refreshes IAM tokens.
      *
      * @param {Object} options
      * @param {String} options.iamApikey
      * @param {String} options.iamAccessToken
      * @param {String} options.iamUrl - url of the iam api to retrieve tokens from
      * @constructor
      */
    def this(options: Options) = this()
  }
}
