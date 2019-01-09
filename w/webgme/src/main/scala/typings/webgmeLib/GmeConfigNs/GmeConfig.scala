package typings
package webgmeLib.GmeConfigNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GmeConfig.GmeConfig")
@js.native
class GmeConfig () extends js.Object {
  /**  Add-on related settings. */
  var addOns: webgmeLib.Anon_BasePaths = js.native
  /**  Authentication related settings. */
  var authentication: webgmeLib.Anon_AllowGuests = js.native
  /** Bin script related settings. */
  var bin: webgmeLib.Anon_Log = js.native
  /** Blob related settings. */
  var blob: webgmeLib.BlobsNs.ObjectBlob = js.native
  /** Client related settings. */
  var client: ClientOptions = js.native
  /** Client related settings. */
  var core: webgmeLib.Anon_EnableCustomConstraints = js.native
  /**
    * If true will add extra debug messages and also 
    * enable experimental Visualizers, (URL equivalent (only on client side) ?debug=true).
    */
  var debug: scala.Boolean = js.native
  /** Executor related settings. */
  var executor: webgmeLib.Anon_ClearOldDataAtStartUp = js.native
  /** Mongo database related settings. */
  var mongo: webgmeLib.Anon_OptionsUri = js.native
  /** Plugin related settings. */
  var plugin: webgmeLib.Anon_AllowBrowserExecution = js.native
  /** Additional paths to for requirejs. 
    * Custom paths that will be added to the 
    * paths of requirejs configuration. 
    * Paths added here will also be served under the given key, 
    * i.e. {myPath: './aPath/aSubPath/'} 
    * will expose files via <host>/myPath/someFile.js.
    */
  var requirejsPaths: webgmeLib.GmeCommonNs.Dictionary[java.lang.String] = js.native
  /** REST related settings. */
  var rest: webgmeLib.Anon_Components = js.native
  /** Seed related settings. */
  var seedProjects: webgmeLib.Anon_AllowDuplication = js.native
  /** Server related settings. */
  var server: webgmeLib.Anon_BehindSecureProxy = js.native
  /** Socket IO related settings. */
  var socketIO: webgmeLib.Anon_ClientOptions = js.native
  /** Storage related settings. */
  var storage: webgmeLib.Anon_AutoMerge = js.native
  /** Visualization related settings. */
  var visualization: webgmeLib.Anon_DecoratorPaths = js.native
  var webhooks: webgmeLib.Anon_EnableManager = js.native
  /**
    *  Serialize the configuration.
    * @returns {*} 
    * @memberOf GmeConfig
    */
  def serialize(): js.Any = js.native
}

