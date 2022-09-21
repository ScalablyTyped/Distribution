package typings.winrt.global.Windows.Foundation

import typings.winrt.Windows.Foundation.Collections.IIterator
import typings.winrt.Windows.Foundation.Collections.IKeyValuePair
import typings.winrt.Windows.Foundation.Collections.IMapView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Collections {
  
  @JSGlobal("Windows.Foundation.Collections.CollectionChange")
  @js.native
  object CollectionChange extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Foundation.Collections.CollectionChange & Double] = js.native
    
    /* 3 */ val itemChanged: typings.winrt.Windows.Foundation.Collections.CollectionChange.itemChanged & Double = js.native
    
    /* 1 */ val itemInserted: typings.winrt.Windows.Foundation.Collections.CollectionChange.itemInserted & Double = js.native
    
    /* 2 */ val itemRemoved: typings.winrt.Windows.Foundation.Collections.CollectionChange.itemRemoved & Double = js.native
    
    /* 0 */ val reset: typings.winrt.Windows.Foundation.Collections.CollectionChange.reset & Double = js.native
  }
  
  @JSGlobal("Windows.Foundation.Collections.PropertySet")
  @js.native
  open class PropertySet ()
    extends StObject
       with typings.winrt.Windows.Foundation.Collections.PropertySet {
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    override def first(): IIterator[IKeyValuePair[String, Any]] = js.native
    
    /* CompleteClass */
    override def getView(): IMapView[String, Any] = js.native
    
    /* CompleteClass */
    override def hasKey(key: String): Boolean = js.native
    
    /* CompleteClass */
    override def insert(key: String, value: Any): Boolean = js.native
    
    /* CompleteClass */
    override def lookup(key: String): Any = js.native
    
    /* CompleteClass */
    var onmapchanged: Any = js.native
    
    /* CompleteClass */
    override def remove(key: String): Unit = js.native
    
    /* CompleteClass */
    var size: Double = js.native
  }
  
  @JSGlobal("Windows.Foundation.Collections.ValueSet")
  @js.native
  open class ValueSet ()
    extends StObject
       with typings.winrt.Windows.Foundation.Collections.ValueSet {
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    override def first(): IIterator[IKeyValuePair[String, Any]] = js.native
    
    /* CompleteClass */
    override def getView(): IMapView[String, Any] = js.native
    
    /* CompleteClass */
    override def hasKey(key: String): Boolean = js.native
    
    /* CompleteClass */
    override def insert(key: String, value: Any): Boolean = js.native
    
    /* CompleteClass */
    override def lookup(key: String): Any = js.native
    
    /* CompleteClass */
    var onmapchanged: Any = js.native
    
    /* CompleteClass */
    override def remove(key: String): Unit = js.native
    
    /* CompleteClass */
    var size: Double = js.native
  }
}
