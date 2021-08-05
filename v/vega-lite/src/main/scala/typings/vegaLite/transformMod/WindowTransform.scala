package typings.vegaLite.transformMod

import typings.vegaLite.channeldefMod.FieldName
import typings.vegaLite.sortMod.SortField
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowTransform
  extends StObject
     with Transform {
  
  /**
    * A frame specification as a two-element array indicating how the sliding window should proceed. The array entries should either be a number indicating the offset from the current data object, or null to indicate unbounded rows preceding or following the current data object. The default value is `[null, 0]`, indicating that the sliding window includes the current object and all preceding objects. The value `[-5, 5]` indicates that the window should include five objects preceding and five objects following the current object. Finally, `[null, null]` indicates that the window frame should always include all data objects. If you this frame and want to assign the same value to add objects, you can use the simpler [join aggregate transform](https://vega.github.io/vega-lite/docs/joinaggregate.html). The only operators affected are the aggregation operations and the `first_value`, `last_value`, and `nth_value` window operations. The other window operations are not affected by this.
    *
    * __Default value:__:  `[null, 0]` (includes the current object and all preceding objects)
    */
  var frame: js.UndefOr[js.Array[Null | Double]] = js.undefined
  
  /**
    * The data fields for partitioning the data objects into separate windows. If unspecified, all data points will be in a single window.
    */
  var groupby: js.UndefOr[js.Array[FieldName]] = js.undefined
  
  /**
    * Indicates if the sliding window frame should ignore peer values (data that are considered identical by the sort criteria). The default is false, causing the window frame to expand to include all peer values. If set to true, the window frame will be defined by offset values only. This setting only affects those operations that depend on the window frame, namely aggregation operations and the first_value, last_value, and nth_value window operations.
    *
    * __Default value:__ `false`
    */
  var ignorePeers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A sort field definition for sorting data objects within a window. If two data objects are considered equal by the comparator, they are considered "peer" values of equal rank. If sort is not specified, the order is undefined: data objects are processed in the order they are observed and none are considered peers (the ignorePeers parameter is ignored and treated as if set to `true`).
    */
  var sort: js.UndefOr[js.Array[SortField]] = js.undefined
  
  /**
    * The definition of the fields in the window, and what calculations to use.
    */
  var window: js.Array[WindowFieldDef]
}
object WindowTransform {
  
  inline def apply(window: js.Array[WindowFieldDef]): WindowTransform = {
    val __obj = js.Dynamic.literal(window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowTransform]
  }
  
  extension [Self <: WindowTransform](x: Self) {
    
    inline def setFrame(value: js.Array[Null | Double]): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
    
    inline def setFrameVarargs(value: (Null | Double)*): Self = StObject.set(x, "frame", js.Array(value :_*))
    
    inline def setGroupby(value: js.Array[FieldName]): Self = StObject.set(x, "groupby", value.asInstanceOf[js.Any])
    
    inline def setGroupbyUndefined: Self = StObject.set(x, "groupby", js.undefined)
    
    inline def setGroupbyVarargs(value: FieldName*): Self = StObject.set(x, "groupby", js.Array(value :_*))
    
    inline def setIgnorePeers(value: Boolean): Self = StObject.set(x, "ignorePeers", value.asInstanceOf[js.Any])
    
    inline def setIgnorePeersUndefined: Self = StObject.set(x, "ignorePeers", js.undefined)
    
    inline def setSort(value: js.Array[SortField]): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setSortVarargs(value: SortField*): Self = StObject.set(x, "sort", js.Array(value :_*))
    
    inline def setWindow(value: js.Array[WindowFieldDef]): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    
    inline def setWindowVarargs(value: WindowFieldDef*): Self = StObject.set(x, "window", js.Array(value :_*))
  }
}
