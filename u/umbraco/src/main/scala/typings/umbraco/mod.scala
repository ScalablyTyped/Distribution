package typings.umbraco

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object resources {
    
    /**
      * Can be Ascending or Descending - Default: Ascending
      */
    @JSImport("umbraco", "resources.Direction")
    @js.native
    object Direction extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.umbraco.umbraco.resources.Direction with Double] = js.native
      
      /* 0 */ val Ascending: typings.umbraco.umbraco.resources.Direction.Ascending with Double = js.native
      
      /* 1 */ val Descending: typings.umbraco.umbraco.resources.Direction.Descending with Double = js.native
    }
    
    /**
      * LogType
      */
    @JSImport("umbraco", "resources.LogType")
    @js.native
    object LogType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.umbraco.umbraco.resources.LogType with Double] = js.native
      
      /* 0 */ val Debug: typings.umbraco.umbraco.resources.LogType.Debug with Double = js.native
      
      /* 1 */ val Info: typings.umbraco.umbraco.resources.LogType.Info with Double = js.native
    }
    
    /**
      * Property to order items by, default: `SortOrder`
      */
    @JSImport("umbraco", "resources.OrderItemsBy")
    @js.native
    object OrderItemsBy extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.umbraco.umbraco.resources.OrderItemsBy with Double] = js.native
      
      /* 0 */ val SortOrder: typings.umbraco.umbraco.resources.OrderItemsBy.SortOrder with Double = js.native
    }
    
    @js.native
    trait IResourcePromise extends StObject {
      
      var data: js.Any = js.native
      
      var errorMsg: String = js.native
      
      var status: Double = js.native
    }
    object IResourcePromise {
      
      @scala.inline
      def apply(data: js.Any, errorMsg: String, status: Double): IResourcePromise = {
        val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], errorMsg = errorMsg.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
        __obj.asInstanceOf[IResourcePromise]
      }
      
      @scala.inline
      implicit class IResourcePromiseMutableBuilder[Self <: IResourcePromise] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setErrorMsg(value: String): Self = StObject.set(x, "errorMsg", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object services {
    
    /**
      * Notification Type
      */
    @JSImport("umbraco", "services.NotificationType")
    @js.native
    object NotificationType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.umbraco.umbraco.services.NotificationType with Double] = js.native
      
      /* 1 */ val error: typings.umbraco.umbraco.services.NotificationType.error with Double = js.native
      
      /* 3 */ val info: typings.umbraco.umbraco.services.NotificationType.info with Double = js.native
      
      /* 0 */ val success: typings.umbraco.umbraco.services.NotificationType.success with Double = js.native
      
      /* 2 */ val warning: typings.umbraco.umbraco.services.NotificationType.warning with Double = js.native
    }
  }
}
