package typings.webgme.GmeConfig

import org.scalablytyped.runtime.StringDictionary
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
trait PluginConfig
  extends typings.webgme.GmeConfig.GmeConfig
     with /* propName */ StringDictionary[js.Any]

object PluginConfig {
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
  ): PluginConfig = {
    val __obj = js.Dynamic.literal(addOns = addOns.asInstanceOf[js.Any], authentication = authentication.asInstanceOf[js.Any], bin = bin.asInstanceOf[js.Any], blob = blob.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], core = core.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], executor = executor.asInstanceOf[js.Any], mongo = mongo.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any], requirejsPaths = requirejsPaths.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any], seedProjects = seedProjects.asInstanceOf[js.Any], serialize = js.Any.fromFunction0(serialize), server = server.asInstanceOf[js.Any], socketIO = socketIO.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], visualization = visualization.asInstanceOf[js.Any], webhooks = webhooks.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginConfig]
  }
}

