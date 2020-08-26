package typings.winrtUwp.Windows.Foundation.Collections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a collection of key-value pairs, correlating several other collection interfaces. */
@js.native
trait IPropertySet
  extends IMap[String, js.Any]

object IPropertySet {
  @scala.inline
  def apply(
    clear: () => Unit,
    first: () => IIterator[IKeyValuePair[js.Any, js.Any]],
    getView: () => IMapView[String, js.Any],
    hasKey: String => Boolean,
    insert: (String, js.Any) => Boolean,
    lookup: String => js.Any,
    remove: String => Unit,
    size: Double
  ): IPropertySet = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), first = js.Any.fromFunction0(first), getView = js.Any.fromFunction0(getView), hasKey = js.Any.fromFunction1(hasKey), insert = js.Any.fromFunction2(insert), lookup = js.Any.fromFunction1(lookup), remove = js.Any.fromFunction1(remove), size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertySet]
  }
}

