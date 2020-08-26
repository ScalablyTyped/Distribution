package typings.winrt.Windows.Foundation.Collections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObservableMap[K, V] extends IMap[K, V] {
  var onmapchanged: js.Any = js.native
}

object IObservableMap {
  @scala.inline
  def apply[K, V](
    clear: () => Unit,
    first: () => IIterator[IKeyValuePair[K, V]],
    getView: () => IMapView[K, V],
    hasKey: K => Boolean,
    insert: (K, V) => Boolean,
    lookup: K => V,
    onmapchanged: js.Any,
    remove: K => Unit,
    size: Double
  ): IObservableMap[K, V] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), first = js.Any.fromFunction0(first), getView = js.Any.fromFunction0(getView), hasKey = js.Any.fromFunction1(hasKey), insert = js.Any.fromFunction2(insert), lookup = js.Any.fromFunction1(lookup), onmapchanged = onmapchanged.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObservableMap[K, V]]
  }
  @scala.inline
  implicit class IObservableMapOps[Self <: IObservableMap[_, _], K, V] (val x: Self with (IObservableMap[K, V])) extends AnyVal {
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
    def setOnmapchanged(value: js.Any): Self = this.set("onmapchanged", value.asInstanceOf[js.Any])
  }
  
}

