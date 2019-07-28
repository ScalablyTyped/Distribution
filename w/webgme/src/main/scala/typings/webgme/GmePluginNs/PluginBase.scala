package typings.webgme.GmePluginNs

import typings.std.TemplateStringsArray
import typings.webgme.BlobsNs.BlobClient
import typings.webgme.CoreNs.DataObject
import typings.webgme.CoreNs.Node
import typings.webgme.Fn_CallbackMessageDataObject
import typings.webgme.GlobalNs.GmeLogger
import typings.webgme.GmeClassesNs.Core
import typings.webgme.GmeClassesNs.Project
import typings.webgme.GmeClassesNs.Result
import typings.webgme.GmeCommonNs.Metadata
import typings.webgme.GmeCommonNs.Promisable
import typings.webgme.GmeCommonNs.ResultCallback
import typings.webgme.GmeConfigNs.ConfigItem
import typings.webgme.GmeConfigNs.GmeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  The base plugin object from which all plugins should inherit.
  */
@JSGlobal("GmePlugin.PluginBase")
@js.native
class PluginBase () extends js.Object {
  /**
    * The resolved META nodes based on the active namespace. Index by the fully qualified meta node names
    * with the namespace stripped off at the start.
    *
    * For example, if a project has a library A with a library B. If the project and the libraries all have
    * two meta nodes named a and b. Depending on the namespace the META will have the following keys:
    *
    * 1) namespace = '' -> ['a', 'b', 'A.a', 'A.b', 'A.B.a', 'A.B.b']
    * 2) namespace = 'A' -> ['a', 'b', 'B.a', 'B.b']
    * 3) namespace = 'A.B' -> ['a', 'b']
    *
    * (n.b. 'a' and 'b' in example 3) are pointing to the meta nodes defined in A.B.)
    */
  var META: js.Any = js.native
  var activeNode: Node = js.native
  var activeSelection: js.Array[Node] = js.native
  var blobClient: BlobClient = js.native
  var core: Core = js.native
  var gmeConfig: GmeConfig = js.native
  var isConfigured: Boolean = js.native
  var logger: GmeLogger = js.native
  /**
    * The namespace the META nodes are coming from (set by invoker).
    * The default is the full meta, i.e. the empty string namespace.
    * For example, if a project has a library A with a library B. The possible namespaces are:
    * '', 'A' and 'A.B'.
    */
  var namespace: String = js.native
  var notificationHandlers: js.Array[_] = js.native
  var pluginMetadata: Metadata = js.native
  var project: Project = js.native
  var result: Result = js.native
  var rootNode: Node = js.native
   // returns a promise?
  @JSName("sendNotification")
  var sendNotification_Original: Fn_CallbackMessageDataObject = js.native
  def addCommitToResult(status: String): Unit = js.native
  def baseIsMeta(node: js.Any): Boolean = js.native
  def configure(config: GmeConfig): Unit = js.native
  def createMessage(node: js.Any, message: String, serverity: String): Unit = js.native
  /**
    * Gets the configuration structure for the plugin.
    * The ConfigurationStructure defines the configuration for the plugin
    * and will be used to populate the GUI when invoking the plugin from webGME.
    */
  def getConfigStructure(): js.Array[ConfigItem] = js.native
  def getCurrentConfig(): GmeConfig = js.native
  def getDefaultConfig(): GmeConfig = js.native
  /**
    * Gets the description of the plugin.
    */
  def getDescription(): String = js.native
  def getMetaType(node: js.Any): js.Any = js.native
  def getMetadata(): js.Any = js.native
  /**
    * Gets the name of the plugin.
    */
  def getName(): String = js.native
  /**
    * Gets the semantic version (semver.org) of the plugin.
    */
  def getVersion(): String = js.native
  def initialize(logger: GmeLogger, blobClient: BlobClient, gmeConfig: GmeConfig): Unit = js.native
  def isInvalidActiveNode(pluginId: js.Any): js.Any = js.native
  def isMetaTypeOf(node: js.Any, metaNode: js.Any): Boolean = js.native
  /**
    Main function for the plugin to execute.
    Notes:
    - Always log with the provided logger.[error,warning,info,debug].
    - Do NOT put any user interaction logic UI, etc. inside this method.
    - handler always has to be called even if error happened.
    
    When this runs the core api is used to extract the essential
    meta-model and the model-instance, these are then written to the mega-model.
    The mega-model contains all of the models used to describe the target system.
    
    https://github.com/ptaoussanis/sente
    and https://github.com/cognitect/transit-format
    will be used to connect to the
    graph database (immortals) where the mega-model is stored.
    
    @param {function(string, plugin.PluginResult)} handler - the result handler
    */
  def main(callback: ResultCallback[Result]): Unit = js.native
  def save(): Promisable = js.native
  def save(message: String): Promisable = js.native
   // returns a promise?
  def sendNotification(message: String): js.Promise[DataObject] = js.native
   // returns a promise?
  def sendNotification(message: String, callback: ResultCallback[DataObject]): Unit = js.native
  def setCurrentConfig(newConfig: GmeConfig): Unit = js.native
  def updateMeta(generatedMeta: js.Any): Unit = js.native
  def updateSuccess(value: Boolean, message: TemplateStringsArray): Unit = js.native
}

