package typings.wonderDashFrp.distEs2015StreamBaseStreamMod

import typings.wonderDashFrp.distEs2015CoreObserverMod.Observer
import typings.wonderDashFrp.distEs2015CoreStreamMod.Stream
import typings.wonderDashFrp.distEs2015DisposableIDisposableMod.IDisposable
import typings.wonderDashFrp.distEs2015ObserverIObserverMod.IObserver
import typings.wonderDashFrp.distEs2015SubjectSubjectMod.Subject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/stream/BaseStream", "BaseStream")
@js.native
abstract class BaseStream () extends Stream {
  def subscribe(arg1: js.Function, onError: js.Any): IDisposable = js.native
  def subscribe(arg1: js.Function, onError: js.Any, onCompleted: js.Any): IDisposable = js.native
  def subscribe(arg1: Observer, onError: js.Any): IDisposable = js.native
  def subscribe(arg1: Observer, onError: js.Any, onCompleted: js.Any): IDisposable = js.native
  def subscribe(arg1: Subject, onError: js.Any): IDisposable = js.native
  def subscribe(arg1: Subject, onError: js.Any, onCompleted: js.Any): IDisposable = js.native
  def subscribeCore(observer: IObserver): IDisposable = js.native
}

