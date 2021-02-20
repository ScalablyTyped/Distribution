package typings.symphonyApiClientNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signalsClientMod {
  
  @JSImport("symphony-api-client-node/SignalsClient", "createSignal")
  @js.native
  def createSignal(name: String, query: String, visibleOnProfile: Boolean, companyWide: Boolean, sessionToken: String): js.Promise[Signal] = js.native
  
  @JSImport("symphony-api-client-node/SignalsClient", "deleteSignal")
  @js.native
  def deleteSignal(id: String, sessionToken: String): js.Promise[DeleteOperationResult] = js.native
  
  @JSImport("symphony-api-client-node/SignalsClient", "getSignal")
  @js.native
  def getSignal(id: String, sessionToken: String): js.Promise[Signal] = js.native
  
  @JSImport("symphony-api-client-node/SignalsClient", "getSignalSubscribers")
  @js.native
  def getSignalSubscribers(id: String, skip: Double, limit: Double, sessionToken: String): js.Promise[SignalSubscribersResponse] = js.native
  
  @JSImport("symphony-api-client-node/SignalsClient", "listSignals")
  @js.native
  def listSignals(skip: Double, limit: Double, sessionToken: String): js.Promise[js.Array[Signal]] = js.native
  
  @JSImport("symphony-api-client-node/SignalsClient", "subscribeSignal")
  @js.native
  def subscribeSignal(id: String, userIds: js.Array[Double], userCanUnsubscribe: Boolean, sessionToken: String): js.Promise[SignalSubscriptionResult] = js.native
  
  @JSImport("symphony-api-client-node/SignalsClient", "unsubscribeSignal")
  @js.native
  def unsubscribeSignal(id: String, userIds: js.Array[Double], sessionToken: String): js.Promise[SignalSubscriptionResult] = js.native
  
  @JSImport("symphony-api-client-node/SignalsClient", "updateSignal")
  @js.native
  def updateSignal(id: String): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node/SignalsClient", "updateSignal")
  @js.native
  def updateSignal(
    id: String,
    name: js.UndefOr[scala.Nothing],
    query: js.UndefOr[scala.Nothing],
    visibleOnProfile: js.UndefOr[scala.Nothing],
    companyWide: js.UndefOr[scala.Nothing],
    sessionToken: String
  ): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node/SignalsClient", "updateSignal")
  @js.native
  def updateSignal(
    id: String,
    name: js.UndefOr[scala.Nothing],
    query: js.UndefOr[scala.Nothing],
    visibleOnProfile: js.UndefOr[scala.Nothing],
    companyWide: Boolean
  ): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node/SignalsClient", "updateSignal")
  @js.native
  def updateSignal(
    id: String,
    name: js.UndefOr[scala.Nothing],
    query: js.UndefOr[scala.Nothing],
    visibleOnProfile: js.UndefOr[scala.Nothing],
    companyWide: Boolean,
    sessionToken: String
  ): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node/SignalsClient", "updateSignal")
  @js.native
  def updateSignal(
    id: String,
    name: js.UndefOr[scala.Nothing],
    query: js.UndefOr[scala.Nothing],
    visibleOnProfile: Boolean
  ): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node/SignalsClient", "updateSignal")
  @js.native
  def updateSignal(
    id: String,
    name: js.UndefOr[scala.Nothing],
    query: js.UndefOr[scala.Nothing],
    visibleOnProfile: Boolean,
    companyWide: js.UndefOr[scala.Nothing],
    sessionToken: String
  ): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node/SignalsClient", "updateSignal")
  @js.native
  def updateSignal(
    id: String,
    name: js.UndefOr[scala.Nothing],
    query: js.UndefOr[scala.Nothing],
    visibleOnProfile: Boolean,
    companyWide: Boolean
  ): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node/SignalsClient", "updateSignal")
  @js.native
  def updateSignal(
    id: String,
    name: js.UndefOr[scala.Nothing],
    query: js.UndefOr[scala.Nothing],
    visibleOnProfile: Boolean,
    companyWide: Boolean,
    sessionToken: String
  ): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node/SignalsClient", "updateSignal")
  @js.native
  def updateSignal(id: String, name: js.UndefOr[scala.Nothing], query: String): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node/SignalsClient", "updateSignal")
  @js.native
  def updateSignal(
    id: String,
    name: js.UndefOr[scala.Nothing],
    query: String,
    visibleOnProfile: js.UndefOr[scala.Nothing],
    companyWide: js.UndefOr[scala.Nothing],
    sessionToken: String
  ): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node/SignalsClient", "updateSignal")
  @js.native
  def updateSignal(
    id: String,
    name: js.UndefOr[scala.Nothing],
    query: String,
    visibleOnProfile: js.UndefOr[scala.Nothing],
    companyWide: Boolean
  ): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node/SignalsClient", "updateSignal")
  @js.native
  def updateSignal(
    id: String,
    name: js.UndefOr[scala.Nothing],
    query: String,
    visibleOnProfile: js.UndefOr[scala.Nothing],
    companyWide: Boolean,
    sessionToken: String
  ): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node/SignalsClient", "updateSignal")
  @js.native
  def updateSignal(id: String, name: js.UndefOr[scala.Nothing], query: String, visibleOnProfile: Boolean): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node/SignalsClient", "updateSignal")
  @js.native
  def updateSignal(
    id: String,
    name: js.UndefOr[scala.Nothing],
    query: String,
    visibleOnProfile: Boolean,
    companyWide: js.UndefOr[scala.Nothing],
    sessionToken: String
  ): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node/SignalsClient", "updateSignal")
  @js.native
  def updateSignal(
    id: String,
    name: js.UndefOr[scala.Nothing],
    query: String,
    visibleOnProfile: Boolean,
    companyWide: Boolean
  ): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node/SignalsClient", "updateSignal")
  @js.native
  def updateSignal(
    id: String,
    name: js.UndefOr[scala.Nothing],
    query: String,
    visibleOnProfile: Boolean,
    companyWide: Boolean,
    sessionToken: String
  ): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node/SignalsClient", "updateSignal")
  @js.native
  def updateSignal(id: String, name: String): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node/SignalsClient", "updateSignal")
  @js.native
  def updateSignal(
    id: String,
    name: String,
    query: js.UndefOr[scala.Nothing],
    visibleOnProfile: js.UndefOr[scala.Nothing],
    companyWide: js.UndefOr[scala.Nothing],
    sessionToken: String
  ): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node/SignalsClient", "updateSignal")
  @js.native
  def updateSignal(
    id: String,
    name: String,
    query: js.UndefOr[scala.Nothing],
    visibleOnProfile: js.UndefOr[scala.Nothing],
    companyWide: Boolean
  ): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node/SignalsClient", "updateSignal")
  @js.native
  def updateSignal(
    id: String,
    name: String,
    query: js.UndefOr[scala.Nothing],
    visibleOnProfile: js.UndefOr[scala.Nothing],
    companyWide: Boolean,
    sessionToken: String
  ): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node/SignalsClient", "updateSignal")
  @js.native
  def updateSignal(id: String, name: String, query: js.UndefOr[scala.Nothing], visibleOnProfile: Boolean): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node/SignalsClient", "updateSignal")
  @js.native
  def updateSignal(
    id: String,
    name: String,
    query: js.UndefOr[scala.Nothing],
    visibleOnProfile: Boolean,
    companyWide: js.UndefOr[scala.Nothing],
    sessionToken: String
  ): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node/SignalsClient", "updateSignal")
  @js.native
  def updateSignal(
    id: String,
    name: String,
    query: js.UndefOr[scala.Nothing],
    visibleOnProfile: Boolean,
    companyWide: Boolean
  ): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node/SignalsClient", "updateSignal")
  @js.native
  def updateSignal(
    id: String,
    name: String,
    query: js.UndefOr[scala.Nothing],
    visibleOnProfile: Boolean,
    companyWide: Boolean,
    sessionToken: String
  ): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node/SignalsClient", "updateSignal")
  @js.native
  def updateSignal(id: String, name: String, query: String): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node/SignalsClient", "updateSignal")
  @js.native
  def updateSignal(
    id: String,
    name: String,
    query: String,
    visibleOnProfile: js.UndefOr[scala.Nothing],
    companyWide: js.UndefOr[scala.Nothing],
    sessionToken: String
  ): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node/SignalsClient", "updateSignal")
  @js.native
  def updateSignal(
    id: String,
    name: String,
    query: String,
    visibleOnProfile: js.UndefOr[scala.Nothing],
    companyWide: Boolean
  ): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node/SignalsClient", "updateSignal")
  @js.native
  def updateSignal(
    id: String,
    name: String,
    query: String,
    visibleOnProfile: js.UndefOr[scala.Nothing],
    companyWide: Boolean,
    sessionToken: String
  ): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node/SignalsClient", "updateSignal")
  @js.native
  def updateSignal(id: String, name: String, query: String, visibleOnProfile: Boolean): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node/SignalsClient", "updateSignal")
  @js.native
  def updateSignal(
    id: String,
    name: String,
    query: String,
    visibleOnProfile: Boolean,
    companyWide: js.UndefOr[scala.Nothing],
    sessionToken: String
  ): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node/SignalsClient", "updateSignal")
  @js.native
  def updateSignal(id: String, name: String, query: String, visibleOnProfile: Boolean, companyWide: Boolean): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node/SignalsClient", "updateSignal")
  @js.native
  def updateSignal(
    id: String,
    name: String,
    query: String,
    visibleOnProfile: Boolean,
    companyWide: Boolean,
    sessionToken: String
  ): js.Promise[Signal] = js.native
  
  @js.native
  trait DeleteOperationResult extends StObject {
    
    var format: String = js.native
    
    var message: String = js.native
  }
  object DeleteOperationResult {
    
    @scala.inline
    def apply(format: String, message: String): DeleteOperationResult = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteOperationResult]
    }
    
    @scala.inline
    implicit class DeleteOperationResultMutableBuilder[Self <: DeleteOperationResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Signal extends StObject {
    
    var companyWide: Boolean = js.native
    
    var id: String = js.native
    
    var name: String = js.native
    
    var query: String = js.native
    
    var timestamp: Double = js.native
    
    var visibleOnProfile: Boolean = js.native
  }
  object Signal {
    
    @scala.inline
    def apply(
      companyWide: Boolean,
      id: String,
      name: String,
      query: String,
      timestamp: Double,
      visibleOnProfile: Boolean
    ): Signal = {
      val __obj = js.Dynamic.literal(companyWide = companyWide.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], visibleOnProfile = visibleOnProfile.asInstanceOf[js.Any])
      __obj.asInstanceOf[Signal]
    }
    
    @scala.inline
    implicit class SignalMutableBuilder[Self <: Signal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompanyWide(value: Boolean): Self = StObject.set(x, "companyWide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleOnProfile(value: Boolean): Self = StObject.set(x, "visibleOnProfile", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SignalSubscriber extends StObject {
    
    var owner: Boolean = js.native
    
    var pushed: Boolean = js.native
    
    var subscriberName: String = js.native
    
    var timestamp: Double = js.native
    
    var userId: Double = js.native
  }
  object SignalSubscriber {
    
    @scala.inline
    def apply(owner: Boolean, pushed: Boolean, subscriberName: String, timestamp: Double, userId: Double): SignalSubscriber = {
      val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], pushed = pushed.asInstanceOf[js.Any], subscriberName = subscriberName.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignalSubscriber]
    }
    
    @scala.inline
    implicit class SignalSubscriberMutableBuilder[Self <: SignalSubscriber] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOwner(value: Boolean): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPushed(value: Boolean): Self = StObject.set(x, "pushed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscriberName(value: String): Self = StObject.set(x, "subscriberName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserId(value: Double): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SignalSubscribersResponse extends StObject {
    
    var data: js.Array[SignalSubscriber] = js.native
    
    var hasMore: Boolean = js.native
    
    var offset: Double = js.native
    
    var total: Double = js.native
  }
  object SignalSubscribersResponse {
    
    @scala.inline
    def apply(data: js.Array[SignalSubscriber], hasMore: Boolean, offset: Double, total: Double): SignalSubscribersResponse = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], hasMore = hasMore.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignalSubscribersResponse]
    }
    
    @scala.inline
    implicit class SignalSubscribersResponseMutableBuilder[Self <: SignalSubscribersResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Array[SignalSubscriber]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: SignalSubscriber*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setHasMore(value: Boolean): Self = StObject.set(x, "hasMore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SignalSubscriptionResult extends StObject {
    
    var failedSubscription: Double = js.native
    
    var requestedSubscription: Double = js.native
    
    var subscriptionErrors: js.Array[_] = js.native
    
    var successfulSubscription: Double = js.native
  }
  object SignalSubscriptionResult {
    
    @scala.inline
    def apply(
      failedSubscription: Double,
      requestedSubscription: Double,
      subscriptionErrors: js.Array[_],
      successfulSubscription: Double
    ): SignalSubscriptionResult = {
      val __obj = js.Dynamic.literal(failedSubscription = failedSubscription.asInstanceOf[js.Any], requestedSubscription = requestedSubscription.asInstanceOf[js.Any], subscriptionErrors = subscriptionErrors.asInstanceOf[js.Any], successfulSubscription = successfulSubscription.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignalSubscriptionResult]
    }
    
    @scala.inline
    implicit class SignalSubscriptionResultMutableBuilder[Self <: SignalSubscriptionResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFailedSubscription(value: Double): Self = StObject.set(x, "failedSubscription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestedSubscription(value: Double): Self = StObject.set(x, "requestedSubscription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscriptionErrors(value: js.Array[_]): Self = StObject.set(x, "subscriptionErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscriptionErrorsVarargs(value: js.Any*): Self = StObject.set(x, "subscriptionErrors", js.Array(value :_*))
      
      @scala.inline
      def setSuccessfulSubscription(value: Double): Self = StObject.set(x, "successfulSubscription", value.asInstanceOf[js.Any])
    }
  }
}
