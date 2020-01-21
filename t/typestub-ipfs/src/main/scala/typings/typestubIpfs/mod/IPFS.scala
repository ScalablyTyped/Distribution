package typings.typestubIpfs.mod

import typings.node.eventsMod.EventEmitter
import typings.std.Error
import typings.typestubIpfs.AnonMessage
import typings.typestubIpfs.typestubIpfsStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPFS extends EventEmitter {
  var bitswap: Bitswap = js.native
  var block: js.Any = js.native
  var bootstrap: js.Any = js.native
  var config: js.Any = js.native
  var dag: DagAPI = js.native
  var files: FilesAPI = js.native
  var libp2p: js.Any = js.native
  var `object`: ObjectAPI = js.native
  var pubsub: Pubsub = js.native
  var repo: RepoAPI = js.native
  var swarm: SwarmAPI = js.native
  var types: Types = js.native
  def id(): js.Promise[Id] = js.native
  def id(callback: js.Function2[/* error */ Error, /* version */ Id, Unit]): Unit = js.native
  def id(options: js.Any): js.Promise[Id] = js.native
  def id(options: js.Any, callback: js.Function2[/* error */ Error, /* version */ Id, Unit]): Unit = js.native
  def init(callback: Callback[Boolean]): Unit = js.native
  def init(options: InitOptions, callback: Callback[Boolean]): Unit = js.native
  def isOnline(): Boolean = js.native
  def on(event: String, callback: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, callback: js.Function1[/* error */ AnonMessage, Unit]): this.type = js.native
  def once(event: String, callback: js.Function0[Unit]): this.type = js.native
  def ping(): js.Promise[Unit] = js.native
  def ping(callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  def preStart(callback: Callback[_]): Unit = js.native
  def start(): Unit = js.native
  def start(callback: Callback[_]): Unit = js.native
  def stop(): Unit = js.native
  def stop(callback: js.Function1[/* error */ js.UndefOr[Error], Unit]): Unit = js.native
  def version(): js.Promise[Version] = js.native
  def version(callback: js.Function2[/* error */ Error, /* version */ Version, Unit]): Unit = js.native
  def version(options: js.Any): js.Promise[Version] = js.native
  def version(options: js.Any, callback: js.Function2[/* error */ Error, /* version */ Version, Unit]): Unit = js.native
}

