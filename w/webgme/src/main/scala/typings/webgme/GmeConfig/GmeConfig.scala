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

@js.native
trait GmeConfig extends js.Object {
  /**  Add-on related settings. */
  var addOns: BasePaths = js.native
  /**  Authentication related settings. */
  var authentication: AllowGuests = js.native
  /** Bin script related settings. */
  var bin: Log = js.native
  /** Blob related settings. */
  var blob: ObjectBlob = js.native
  /** Client related settings. */
  var client: ClientOptions = js.native
  /** Client related settings. */
  var core: EnableCustomConstraints = js.native
  /**
    * If true will add extra debug messages and also 
    * enable experimental Visualizers, (URL equivalent (only on client side) ?debug=true).
    */
  var debug: Boolean = js.native
  /** Executor related settings. */
  var executor: ClearOldDataAtStartUp = js.native
  /** Mongo database related settings. */
  var mongo: Uri = js.native
  /** Plugin related settings. */
  var plugin: AllowBrowserExecution = js.native
  /** Additional paths to for requirejs. 
    * Custom paths that will be added to the 
    * paths of requirejs configuration. 
    * Paths added here will also be served under the given key, 
    * i.e. {myPath: './aPath/aSubPath/'} 
    * will expose files via <host>/myPath/someFile.js.
    */
  var requirejsPaths: Dictionary[String] = js.native
  /** REST related settings. */
  var rest: Components = js.native
  /** Seed related settings. */
  var seedProjects: AllowDuplication = js.native
  /** Server related settings. */
  var server: BehindSecureProxy = js.native
  /** Socket IO related settings. */
  var socketIO: typings.webgme.anon.ClientOptions = js.native
  /** Storage related settings. */
  var storage: AutoMerge = js.native
  /** Visualization related settings. */
  var visualization: DecoratorPaths = js.native
  var webhooks: Manager = js.native
  /**
    *  Serialize the configuration.
    * @returns {*} 
    * @memberOf GmeConfig
    */
  def serialize(): js.Any = js.native
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
  @scala.inline
  implicit class GmeConfigOps[Self <: typings.webgme.GmeConfig.GmeConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddOns(value: BasePaths): Self = this.set("addOns", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthentication(value: AllowGuests): Self = this.set("authentication", value.asInstanceOf[js.Any])
    @scala.inline
    def setBin(value: Log): Self = this.set("bin", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlob(value: ObjectBlob): Self = this.set("blob", value.asInstanceOf[js.Any])
    @scala.inline
    def setClient(value: ClientOptions): Self = this.set("client", value.asInstanceOf[js.Any])
    @scala.inline
    def setCore(value: EnableCustomConstraints): Self = this.set("core", value.asInstanceOf[js.Any])
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def setExecutor(value: ClearOldDataAtStartUp): Self = this.set("executor", value.asInstanceOf[js.Any])
    @scala.inline
    def setMongo(value: Uri): Self = this.set("mongo", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlugin(value: AllowBrowserExecution): Self = this.set("plugin", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequirejsPaths(value: Dictionary[String]): Self = this.set("requirejsPaths", value.asInstanceOf[js.Any])
    @scala.inline
    def setRest(value: Components): Self = this.set("rest", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeedProjects(value: AllowDuplication): Self = this.set("seedProjects", value.asInstanceOf[js.Any])
    @scala.inline
    def setSerialize(value: () => js.Any): Self = this.set("serialize", js.Any.fromFunction0(value))
    @scala.inline
    def setServer(value: BehindSecureProxy): Self = this.set("server", value.asInstanceOf[js.Any])
    @scala.inline
    def setSocketIO(value: typings.webgme.anon.ClientOptions): Self = this.set("socketIO", value.asInstanceOf[js.Any])
    @scala.inline
    def setStorage(value: AutoMerge): Self = this.set("storage", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisualization(value: DecoratorPaths): Self = this.set("visualization", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebhooks(value: Manager): Self = this.set("webhooks", value.asInstanceOf[js.Any])
  }
  
}

