package typings.web3CoreSubscriptions

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.web3CoreSubscriptions.web3CoreSubscriptionsStrings.changed
import typings.web3CoreSubscriptions.web3CoreSubscriptionsStrings.connected
import typings.web3CoreSubscriptions.web3CoreSubscriptionsStrings.data
import typings.web3CoreSubscriptions.web3CoreSubscriptionsStrings.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("web3-core-subscriptions", "Subscription")
  @js.native
  class Subscription[T] protected () extends StObject {
    def this(options: SubscriptionOptions) = this()
    
    var arguments: js.Any = js.native
    
    def callback(): Unit = js.native
    
    var id: String = js.native
    
    var lastBlock: Double = js.native
    
    @JSName("on")
    def on_changed(`type`: changed, handler: js.Function1[/* data */ T, Unit]): Subscription[T] = js.native
    @JSName("on")
    def on_connected(`type`: connected, handler: js.Function1[/* subscriptionId */ String, Unit]): Subscription[T] = js.native
    @JSName("on")
    def on_data(`type`: data, handler: js.Function1[/* data */ T, Unit]): Subscription[T] = js.native
    @JSName("on")
    def on_error(`type`: error, handler: js.Function1[/* data */ Error, Unit]): Subscription[T] = js.native
    
    var options: SubscriptionOptions = js.native
    
    def subscribe(): Subscription[T] = js.native
    def subscribe(callback: js.Function2[/* error */ Error, /* result */ T, Unit]): Subscription[T] = js.native
    
    def unsubscribe(): js.Promise[js.UndefOr[Boolean]] = js.native
    def unsubscribe(callback: js.Function2[/* error */ Error, /* result */ Boolean, Unit]): js.Promise[js.UndefOr[Boolean]] = js.native
  }
  
  @JSImport("web3-core-subscriptions", "Subscriptions")
  @js.native
  class Subscriptions protected () extends StObject {
    def this(options: SubscriptionsOptions) = this()
    
    def attachToObject(obj: js.Any): Unit = js.native
    
    def buildCall(): js.Function0[_] = js.native
    
    var name: String = js.native
    
    val requestManager: js.Any = js.native
    
    def setRequestManager(requestManager: js.Any): Unit = js.native
    
    var subscriptions: SubscriptionsModel = js.native
    
    var `type`: String = js.native
  }
  
  @js.native
  trait SubscriptionModel extends StObject {
    
    var inputFormatter: js.Array[js.Function0[Unit]] = js.native
    
    def outputFormatter(): Unit = js.native
    
    var params: Double = js.native
    
    def subscriptionHandler(): Unit = js.native
    
    var subscriptionName: String = js.native
  }
  object SubscriptionModel {
    
    @scala.inline
    def apply(
      inputFormatter: js.Array[js.Function0[Unit]],
      outputFormatter: () => Unit,
      params: Double,
      subscriptionHandler: () => Unit,
      subscriptionName: String
    ): SubscriptionModel = {
      val __obj = js.Dynamic.literal(inputFormatter = inputFormatter.asInstanceOf[js.Any], outputFormatter = js.Any.fromFunction0(outputFormatter), params = params.asInstanceOf[js.Any], subscriptionHandler = js.Any.fromFunction0(subscriptionHandler), subscriptionName = subscriptionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscriptionModel]
    }
    
    @scala.inline
    implicit class SubscriptionModelMutableBuilder[Self <: SubscriptionModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInputFormatter(value: js.Array[js.Function0[Unit]]): Self = StObject.set(x, "inputFormatter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputFormatterVarargs(value: js.Function0[Unit]*): Self = StObject.set(x, "inputFormatter", js.Array(value :_*))
      
      @scala.inline
      def setOutputFormatter(value: () => Unit): Self = StObject.set(x, "outputFormatter", js.Any.fromFunction0(value))
      
      @scala.inline
      def setParams(value: Double): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscriptionHandler(value: () => Unit): Self = StObject.set(x, "subscriptionHandler", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSubscriptionName(value: String): Self = StObject.set(x, "subscriptionName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SubscriptionOptions extends StObject {
    
    var requestManager: js.Any = js.native
    
    var subscription: String = js.native
    
    var `type`: String = js.native
  }
  object SubscriptionOptions {
    
    @scala.inline
    def apply(requestManager: js.Any, subscription: String, `type`: String): SubscriptionOptions = {
      val __obj = js.Dynamic.literal(requestManager = requestManager.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscriptionOptions]
    }
    
    @scala.inline
    implicit class SubscriptionOptionsMutableBuilder[Self <: SubscriptionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequestManager(value: js.Any): Self = StObject.set(x, "requestManager", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type SubscriptionsModel = StringDictionary[SubscriptionModel]
  
  @js.native
  trait SubscriptionsOptions extends StObject {
    
    var name: String = js.native
    
    var subscriptions: SubscriptionsModel = js.native
    
    var `type`: String = js.native
  }
  object SubscriptionsOptions {
    
    @scala.inline
    def apply(name: String, subscriptions: SubscriptionsModel, `type`: String): SubscriptionsOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscriptionsOptions]
    }
    
    @scala.inline
    implicit class SubscriptionsOptionsMutableBuilder[Self <: SubscriptionsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscriptions(value: SubscriptionsModel): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
