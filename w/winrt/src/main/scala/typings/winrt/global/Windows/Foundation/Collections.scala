package typings.winrt.global.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Foundation.Collections")
@js.native
object Collections extends js.Object {
  
  @js.native
  object CollectionChange extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Foundation.Collections.CollectionChange with Double] = js.native
    
    /* 3 */ val itemChanged: typings.winrt.Windows.Foundation.Collections.CollectionChange.itemChanged with Double = js.native
    
    /* 1 */ val itemInserted: typings.winrt.Windows.Foundation.Collections.CollectionChange.itemInserted with Double = js.native
    
    /* 2 */ val itemRemoved: typings.winrt.Windows.Foundation.Collections.CollectionChange.itemRemoved with Double = js.native
    
    /* 0 */ val reset: typings.winrt.Windows.Foundation.Collections.CollectionChange.reset with Double = js.native
  }
  
  @js.native
  class PropertySet ()
    extends typings.winrt.Windows.Foundation.Collections.PropertySet
  
  @js.native
  class ValueSet ()
    extends typings.winrt.Windows.Foundation.Collections.ValueSet
}
