package typings.umbraco

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object umbraco extends js.Object {
    
    @js.native
    object resources extends js.Object {
      
      /**
        * Can be Ascending or Descending - Default: Ascending
        */
      @js.native
      object Direction extends js.Object {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typings.umbraco.umbraco.resources.Direction with Double] = js.native
        
        /* 0 */ val Ascending: typings.umbraco.umbraco.resources.Direction.Ascending with Double = js.native
        
        /* 1 */ val Descending: typings.umbraco.umbraco.resources.Direction.Descending with Double = js.native
      }
      
      /**
        * LogType
        */
      @js.native
      object LogType extends js.Object {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typings.umbraco.umbraco.resources.LogType with Double] = js.native
        
        /* 0 */ val Debug: typings.umbraco.umbraco.resources.LogType.Debug with Double = js.native
        
        /* 1 */ val Info: typings.umbraco.umbraco.resources.LogType.Info with Double = js.native
      }
      
      /**
        * Property to order items by, default: `SortOrder`
        */
      @js.native
      object OrderItemsBy extends js.Object {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typings.umbraco.umbraco.resources.OrderItemsBy with Double] = js.native
        
        /* 0 */ val SortOrder: typings.umbraco.umbraco.resources.OrderItemsBy.SortOrder with Double = js.native
      }
    }
    
    @js.native
    object services extends js.Object {
      
      /**
        * Notification Type
        */
      @js.native
      object NotificationType extends js.Object {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typings.umbraco.umbraco.services.NotificationType with Double] = js.native
        
        /* 1 */ val error: typings.umbraco.umbraco.services.NotificationType.error with Double = js.native
        
        /* 3 */ val info: typings.umbraco.umbraco.services.NotificationType.info with Double = js.native
        
        /* 0 */ val success: typings.umbraco.umbraco.services.NotificationType.success with Double = js.native
        
        /* 2 */ val warning: typings.umbraco.umbraco.services.NotificationType.warning with Double = js.native
      }
    }
  }
}
