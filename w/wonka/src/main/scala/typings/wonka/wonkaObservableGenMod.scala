package typings.wonka

import typings.wonka.wonkaTypesGenMod.sourceT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonka/dist/types/src/web/Wonka_observable.gen", JSImport.Namespace)
@js.native
object wonkaObservableGenMod extends js.Object {
  def fromObservable[a](input: observableT[a]): sourceT[a] = js.native
  def toObservable[a](source: sourceT[a]): observableT[a] = js.native
  type observableObserverT[a] = typings.wonka.jsShimMod.observableObserverT[a]
  type observableSubscriptionT = typings.wonka.jsShimMod.observableSubscriptionT
  type observableT[a] = typings.wonka.jsShimMod.observableT[a]
}

