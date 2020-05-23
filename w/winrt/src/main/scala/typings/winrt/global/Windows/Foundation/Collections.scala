package typings.winrt.global.Windows.Foundation

import typings.winrt.Windows.Foundation.Collections.IIterator
import typings.winrt.Windows.Foundation.Collections.IKeyValuePair
import typings.winrt.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Foundation.Collections")
@js.native
object Collections extends js.Object {
  @js.native
  class PropertySet ()
    extends typings.winrt.Windows.Foundation.Collections.PropertySet {
    /* CompleteClass */
    override var onmapchanged: js.Any = js.native
    /* CompleteClass */
    override var size: Double = js.native
    /* CompleteClass */
    override def clear(): Unit = js.native
    /* CompleteClass */
    override def first(): IIterator[IKeyValuePair[String, js.Any]] = js.native
    /* CompleteClass */
    override def getView(): IMapView[String, js.Any] = js.native
    /* CompleteClass */
    override def hasKey(key: String): Boolean = js.native
    /* CompleteClass */
    override def insert(key: String, value: js.Any): Boolean = js.native
    /* CompleteClass */
    override def lookup(key: String): js.Any = js.native
    /* CompleteClass */
    override def remove(key: String): Unit = js.native
  }
  
  @js.native
  class ValueSet ()
    extends typings.winrt.Windows.Foundation.Collections.ValueSet {
    /* CompleteClass */
    override var onmapchanged: js.Any = js.native
    /* CompleteClass */
    override var size: Double = js.native
    /* CompleteClass */
    override def clear(): Unit = js.native
    /* CompleteClass */
    override def first(): IIterator[IKeyValuePair[String, js.Any]] = js.native
    /* CompleteClass */
    override def getView(): IMapView[String, js.Any] = js.native
    /* CompleteClass */
    override def hasKey(key: String): Boolean = js.native
    /* CompleteClass */
    override def insert(key: String, value: js.Any): Boolean = js.native
    /* CompleteClass */
    override def lookup(key: String): js.Any = js.native
    /* CompleteClass */
    override def remove(key: String): Unit = js.native
  }
  
  @js.native
  object CollectionChange extends js.Object {
    /* 3 */ val itemChanged: typings.winrt.Windows.Foundation.Collections.CollectionChange.itemChanged with Double = js.native
    /* 1 */ val itemInserted: typings.winrt.Windows.Foundation.Collections.CollectionChange.itemInserted with Double = js.native
    /* 2 */ val itemRemoved: typings.winrt.Windows.Foundation.Collections.CollectionChange.itemRemoved with Double = js.native
    /* 0 */ val reset: typings.winrt.Windows.Foundation.Collections.CollectionChange.reset with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Foundation.Collections.CollectionChange with Double] = js.native
  }
  
}

