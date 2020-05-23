package typings.webgme.pluginConfigMod

import typings.webgme.Blobs.ObjectBlob
import typings.webgme.GmeCommon.Dictionary
import typings.webgme.GmeConfig.ClientOptions
import typings.webgme.GmeConfig.PluginConfig
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

@JSImport("plugin/PluginConfig", JSImport.Namespace)
@js.native
class ^ () extends PluginConfig {
  /**  Add-on related settings. */
  /* CompleteClass */
  override var addOns: BasePaths = js.native
  /**  Authentication related settings. */
  /* CompleteClass */
  override var authentication: AllowGuests = js.native
  /** Bin script related settings. */
  /* CompleteClass */
  override var bin: Log = js.native
  /** Blob related settings. */
  /* CompleteClass */
  override var blob: ObjectBlob = js.native
  /** Client related settings. */
  /* CompleteClass */
  override var client: ClientOptions = js.native
  /** Client related settings. */
  /* CompleteClass */
  override var core: EnableCustomConstraints = js.native
  /**
    * If true will add extra debug messages and also 
    * enable experimental Visualizers, (URL equivalent (only on client side) ?debug=true).
    */
  /* CompleteClass */
  override var debug: Boolean = js.native
  /** Executor related settings. */
  /* CompleteClass */
  override var executor: ClearOldDataAtStartUp = js.native
  /** Mongo database related settings. */
  /* CompleteClass */
  override var mongo: Uri = js.native
  /** Plugin related settings. */
  /* CompleteClass */
  override var plugin: AllowBrowserExecution = js.native
  /** Additional paths to for requirejs. 
    * Custom paths that will be added to the 
    * paths of requirejs configuration. 
    * Paths added here will also be served under the given key, 
    * i.e. {myPath: './aPath/aSubPath/'} 
    * will expose files via <host>/myPath/someFile.js.
    */
  /* CompleteClass */
  override var requirejsPaths: Dictionary[String] = js.native
  /** REST related settings. */
  /* CompleteClass */
  override var rest: Components = js.native
  /** Seed related settings. */
  /* CompleteClass */
  override var seedProjects: AllowDuplication = js.native
  /** Server related settings. */
  /* CompleteClass */
  override var server: BehindSecureProxy = js.native
  /** Socket IO related settings. */
  /* CompleteClass */
  override var socketIO: typings.webgme.anon.ClientOptions = js.native
  /** Storage related settings. */
  /* CompleteClass */
  override var storage: AutoMerge = js.native
  /** Visualization related settings. */
  /* CompleteClass */
  override var visualization: DecoratorPaths = js.native
  /* CompleteClass */
  override var webhooks: Manager = js.native
  /**
    *  Serialize the configuration.
    * @returns {*} 
    * @memberOf GmeConfig
    */
  /* CompleteClass */
  override def serialize(): js.Any = js.native
}

