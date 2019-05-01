package typings
package typestubDashIpfsLib.typestubDashIpfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPFS
  extends nodeLib.eventsMod.EventEmitter {
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
  def id(callback: js.Function2[/* error */ stdLib.Error, /* version */ Id, scala.Unit]): scala.Unit = js.native
  def id(options: js.Any): js.Promise[Id] = js.native
  def id(options: js.Any, callback: js.Function2[/* error */ stdLib.Error, /* version */ Id, scala.Unit]): scala.Unit = js.native
  def init(callback: Callback[scala.Boolean]): scala.Unit = js.native
  def init(options: InitOptions, callback: Callback[scala.Boolean]): scala.Unit = js.native
  def isOnline(): scala.Boolean = js.native
  def on(event: java.lang.String, callback: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_error(
    event: typestubDashIpfsLib.typestubDashIpfsLibStrings.error,
    callback: js.Function1[/* error */ typestubDashIpfsLib.Anon_Message, scala.Unit]
  ): this.type = js.native
  def once(event: java.lang.String, callback: js.Function0[scala.Unit]): this.type = js.native
  def ping(): js.Promise[scala.Unit] = js.native
  def ping(callback: js.Function1[/* error */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def preStart(callback: Callback[_]): scala.Unit = js.native
  def start(): scala.Unit = js.native
  def start(callback: Callback[_]): scala.Unit = js.native
  def stop(): scala.Unit = js.native
  def stop(callback: js.Function1[/* error */ js.UndefOr[stdLib.Error], scala.Unit]): scala.Unit = js.native
  def version(): js.Promise[Version] = js.native
  def version(callback: js.Function2[/* error */ stdLib.Error, /* version */ Version, scala.Unit]): scala.Unit = js.native
  def version(options: js.Any): js.Promise[Version] = js.native
  def version(
    options: js.Any,
    callback: js.Function2[/* error */ stdLib.Error, /* version */ Version, scala.Unit]
  ): scala.Unit = js.native
}

