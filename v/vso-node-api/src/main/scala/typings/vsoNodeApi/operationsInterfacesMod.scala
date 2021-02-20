package typings.vsoNodeApi

import typings.vsoNodeApi.anon.EnumValuesCancelledFailed
import typings.vsoNodeApi.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operationsInterfacesMod {
  
  @js.native
  sealed trait OperationStatus extends StObject
  @JSImport("vso-node-api/interfaces/common/OperationsInterfaces", "OperationStatus")
  @js.native
  object OperationStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[OperationStatus with Double] = js.native
    
    /**
      * The operation was cancelled by the user.
      */
    @js.native
    sealed trait Cancelled extends OperationStatus
    /* 3 */ val Cancelled: typings.vsoNodeApi.operationsInterfacesMod.OperationStatus.Cancelled with Double = js.native
    
    /**
      * The operation completed with a failure.
      */
    @js.native
    sealed trait Failed extends OperationStatus
    /* 5 */ val Failed: typings.vsoNodeApi.operationsInterfacesMod.OperationStatus.Failed with Double = js.native
    
    /**
      * The operation is in progress.
      */
    @js.native
    sealed trait InProgress extends OperationStatus
    /* 2 */ val InProgress: typings.vsoNodeApi.operationsInterfacesMod.OperationStatus.InProgress with Double = js.native
    
    /**
      * The operation object does not have the status set.
      */
    @js.native
    sealed trait NotSet extends OperationStatus
    /* 0 */ val NotSet: typings.vsoNodeApi.operationsInterfacesMod.OperationStatus.NotSet with Double = js.native
    
    /**
      * The operation has been queued.
      */
    @js.native
    sealed trait Queued extends OperationStatus
    /* 1 */ val Queued: typings.vsoNodeApi.operationsInterfacesMod.OperationStatus.Queued with Double = js.native
    
    /**
      * The operation completed successfully.
      */
    @js.native
    sealed trait Succeeded extends OperationStatus
    /* 4 */ val Succeeded: typings.vsoNodeApi.operationsInterfacesMod.OperationStatus.Succeeded with Double = js.native
  }
  
  object TypeInfo {
    
    @JSImport("vso-node-api/interfaces/common/OperationsInterfaces", "TypeInfo")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vso-node-api/interfaces/common/OperationsInterfaces", "TypeInfo.OperationReference")
    @js.native
    def OperationReference: Fields = js.native
    @scala.inline
    def OperationReference_=(x: Fields): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OperationReference")(x.asInstanceOf[js.Any])
    
    @JSImport("vso-node-api/interfaces/common/OperationsInterfaces", "TypeInfo.OperationStatus")
    @js.native
    def OperationStatus: EnumValuesCancelledFailed = js.native
    @scala.inline
    def OperationStatus_=(x: EnumValuesCancelledFailed): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OperationStatus")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait OperationReference extends StObject {
    
    /**
      * The identifier for this operation.
      */
    var id: String = js.native
    
    /**
      * The current status of the operation.
      */
    var status: OperationStatus = js.native
    
    /**
      * Url to get the full object.
      */
    var url: String = js.native
  }
  object OperationReference {
    
    @scala.inline
    def apply(id: String, status: OperationStatus, url: String): OperationReference = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[OperationReference]
    }
    
    @scala.inline
    implicit class OperationReferenceMutableBuilder[Self <: OperationReference] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: OperationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
