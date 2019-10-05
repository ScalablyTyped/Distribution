package typings.webgme.GmeConfig

import typings.webgme.Anon_AllowBrowserExecution
import typings.webgme.Anon_AllowDuplication
import typings.webgme.Anon_AllowGuests
import typings.webgme.Anon_AutoMerge
import typings.webgme.Anon_BasePaths
import typings.webgme.Anon_BehindSecureProxy
import typings.webgme.Anon_ClearOldDataAtStartUp
import typings.webgme.Anon_ClientOptions
import typings.webgme.Anon_Components
import typings.webgme.Anon_DecoratorPaths
import typings.webgme.Anon_EnableCustomConstraints
import typings.webgme.Anon_EnableManager
import typings.webgme.Anon_Log
import typings.webgme.Anon_OptionsUri
import typings.webgme.Blobs.ObjectBlob
import typings.webgme.GmeCommon.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GmeConfig.GmeConfig")
@js.native
class GmeConfig () extends js.Object {
  /**  Add-on related settings. */
  var addOns: Anon_BasePaths = js.native
  /**  Authentication related settings. */
  var authentication: Anon_AllowGuests = js.native
  /** Bin script related settings. */
  var bin: Anon_Log = js.native
  /** Blob related settings. */
  var blob: ObjectBlob = js.native
  /** Client related settings. */
  var client: ClientOptions = js.native
  /** Client related settings. */
  var core: Anon_EnableCustomConstraints = js.native
  /**
    * If true will add extra debug messages and also 
    * enable experimental Visualizers, (URL equivalent (only on client side) ?debug=true).
    */
  var debug: Boolean = js.native
  /** Executor related settings. */
  var executor: Anon_ClearOldDataAtStartUp = js.native
  /** Mongo database related settings. */
  var mongo: Anon_OptionsUri = js.native
  /** Plugin related settings. */
  var plugin: Anon_AllowBrowserExecution = js.native
  /** Additional paths to for requirejs. 
    * Custom paths that will be added to the 
    * paths of requirejs configuration. 
    * Paths added here will also be served under the given key, 
    * i.e. {myPath: './aPath/aSubPath/'} 
    * will expose files via <host>/myPath/someFile.js.
    */
  var requirejsPaths: Dictionary[String] = js.native
  /** REST related settings. */
  var rest: Anon_Components = js.native
  /** Seed related settings. */
  var seedProjects: Anon_AllowDuplication = js.native
  /** Server related settings. */
  var server: Anon_BehindSecureProxy = js.native
  /** Socket IO related settings. */
  var socketIO: Anon_ClientOptions = js.native
  /** Storage related settings. */
  var storage: Anon_AutoMerge = js.native
  /** Visualization related settings. */
  var visualization: Anon_DecoratorPaths = js.native
  var webhooks: Anon_EnableManager = js.native
  /**
    *  Serialize the configuration.
    * @returns {*} 
    * @memberOf GmeConfig
    */
  def serialize(): js.Any = js.native
}

