package typings.webgme.GmeConfig

import typings.webgme.Blobs.ObjectBlob
import typings.webgme.GmeCommon.Dictionary
import typings.webgme.anon.AllowBrowserExecution
import typings.webgme.anon.AllowDuplication
import typings.webgme.anon.AllowGuests
import typings.webgme.anon.AutoMerge
import typings.webgme.anon.BasePaths
import typings.webgme.anon.BehindSecureProxy
import typings.webgme.anon.ClearOldDataAtStartUp
import typings.webgme.anon.Components
import typings.webgme.anon.DecoratorPaths
import typings.webgme.anon.EnableCustomConstraints
import typings.webgme.anon.Log
import typings.webgme.anon.Manager
import typings.webgme.anon.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GmeConfig extends js.Object {
  /**  Add-on related settings. */
  var addOns: BasePaths
  /**  Authentication related settings. */
  var authentication: AllowGuests
  /** Bin script related settings. */
  var bin: Log
  /** Blob related settings. */
  var blob: ObjectBlob
  /** Client related settings. */
  var client: ClientOptions
  /** Client related settings. */
  var core: EnableCustomConstraints
  /**
    * If true will add extra debug messages and also 
    * enable experimental Visualizers, (URL equivalent (only on client side) ?debug=true).
    */
  var debug: Boolean
  /** Executor related settings. */
  var executor: ClearOldDataAtStartUp
  /** Mongo database related settings. */
  var mongo: Uri
  /** Plugin related settings. */
  var plugin: AllowBrowserExecution
  /** Additional paths to for requirejs. 
    * Custom paths that will be added to the 
    * paths of requirejs configuration. 
    * Paths added here will also be served under the given key, 
    * i.e. {myPath: './aPath/aSubPath/'} 
    * will expose files via <host>/myPath/someFile.js.
    */
  var requirejsPaths: Dictionary[String]
  /** REST related settings. */
  var rest: Components
  /** Seed related settings. */
  var seedProjects: AllowDuplication
  /** Server related settings. */
  var server: BehindSecureProxy
  /** Socket IO related settings. */
  var socketIO: typings.webgme.anon.ClientOptions
  /** Storage related settings. */
  var storage: AutoMerge
  /** Visualization related settings. */
  var visualization: DecoratorPaths
  var webhooks: Manager
  /**
    *  Serialize the configuration.
    * @returns {*} 
    * @memberOf GmeConfig
    */
  def serialize(): js.Any
}

object GmeConfig {
  @scala.inline
  def apply(
    addOns: BasePaths,
    authentication: AllowGuests,
    bin: Log,
    blob: ObjectBlob,
    client: ClientOptions,
    core: EnableCustomConstraints,
    debug: Boolean,
    executor: ClearOldDataAtStartUp,
    mongo: Uri,
    plugin: AllowBrowserExecution,
    requirejsPaths: Dictionary[String],
    rest: Components,
    seedProjects: AllowDuplication,
    serialize: () => js.Any,
    server: BehindSecureProxy,
    socketIO: typings.webgme.anon.ClientOptions,
    storage: AutoMerge,
    visualization: DecoratorPaths,
    webhooks: Manager
  ): GmeConfig = {
    val __obj = js.Dynamic.literal(addOns = addOns.asInstanceOf[js.Any], authentication = authentication.asInstanceOf[js.Any], bin = bin.asInstanceOf[js.Any], blob = blob.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], core = core.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], executor = executor.asInstanceOf[js.Any], mongo = mongo.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any], requirejsPaths = requirejsPaths.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any], seedProjects = seedProjects.asInstanceOf[js.Any], serialize = js.Any.fromFunction0(serialize), server = server.asInstanceOf[js.Any], socketIO = socketIO.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], visualization = visualization.asInstanceOf[js.Any], webhooks = webhooks.asInstanceOf[js.Any])
    __obj.asInstanceOf[GmeConfig]
  }
}

