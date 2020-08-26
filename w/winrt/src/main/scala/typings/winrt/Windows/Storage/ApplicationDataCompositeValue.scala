package typings.winrt.Windows.Storage

import typings.winrt.Windows.Foundation.Collections.IIterator
import typings.winrt.Windows.Foundation.Collections.IKeyValuePair
import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Foundation.Collections.IObservableMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationDataCompositeValue
  extends IObservableMap[String, js.Any]

object ApplicationDataCompositeValue {
  @scala.inline
  def apply(
    clear: () => Unit,
    first: () => IIterator[IKeyValuePair[String, js.Any]],
    getView: () => IMapView[String, js.Any],
    hasKey: String => Boolean,
    insert: (String, js.Any) => Boolean,
    lookup: String => js.Any,
    onmapchanged: js.Any,
    remove: String => Unit,
    size: Double
  ): ApplicationDataCompositeValue = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), first = js.Any.fromFunction0(first), getView = js.Any.fromFunction0(getView), hasKey = js.Any.fromFunction1(hasKey), insert = js.Any.fromFunction2(insert), lookup = js.Any.fromFunction1(lookup), onmapchanged = onmapchanged.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationDataCompositeValue]
  }
}

