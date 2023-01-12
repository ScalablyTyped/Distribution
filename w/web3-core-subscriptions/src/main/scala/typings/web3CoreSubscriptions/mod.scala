package typings.web3CoreSubscriptions

import org.scalablytyped.runtime.StringDictionary
import typings.web3CoreSubscriptions.web3CoreSubscriptionsStrings.changed
import typings.web3CoreSubscriptions.web3CoreSubscriptionsStrings.connected
import typings.web3CoreSubscriptions.web3CoreSubscriptionsStrings.data
import typings.web3CoreSubscriptions.web3CoreSubscriptionsStrings.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("web3-core-subscriptions", "Subscription")
  @js.native
  open class Subscription[T] protected () extends StObject {
    def this(options: SubscriptionOptions) = this()
    
    var arguments: Any = js.native
    
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
    def on_error(`type`: error, handler: js.Function1[/* data */ js.Error, Unit]): Subscription[T] = js.native
    
    var options: SubscriptionOptions = js.native
    
    def subscribe(): Subscription[T] = js.native
    def subscribe(callback: js.Function2[/* error */ js.Error, /* result */ T, Unit]): Subscription[T] = js.native
    
    def unsubscribe(): js.Promise[js.UndefOr[Boolean]] = js.native
    def unsubscribe(callback: js.Function2[/* error */ js.Error, /* result */ Boolean, Unit]): js.Promise[js.UndefOr[Boolean]] = js.native
  }
  
  @JSImport("web3-core-subscriptions", "Subscriptions")
  @js.native
  open class Subscriptions protected () extends StObject {
    def this(options: SubscriptionsOptions) = this()
    
    def attachToObject(obj: Any): Unit = js.native
    
    def buildCall(): js.Function0[Any] = js.native
    
    var name: String = js.native
    
    val requestManager: Any = js.native
    
    def setRequestManager(requestManager: Any): Unit = js.native
    
    var subscriptions: SubscriptionsModel = js.native
    
    var `type`: String = js.native
  }
  
  trait SubscriptionModel extends StObject {
    
    var inputFormatter: js.Array[js.Function0[Unit]]
    
    def outputFormatter(): Unit
    
    var params: Double
    
    def subscriptionHandler(): Unit
    
    var subscriptionName: String
  }
  object SubscriptionModel {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: SubscriptionModel] (val x: Self) extends AnyVal {
      
      inline def setInputFormatter(value: js.Array[js.Function0[Unit]]): Self = StObject.set(x, "inputFormatter", value.asInstanceOf[js.Any])
      
      inline def setInputFormatterVarargs(value: js.Function0[Unit]*): Self = StObject.set(x, "inputFormatter", js.Array(value*))
      
      inline def setOutputFormatter(value: () => Unit): Self = StObject.set(x, "outputFormatter", js.Any.fromFunction0(value))
      
      inline def setParams(value: Double): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionHandler(value: () => Unit): Self = StObject.set(x, "subscriptionHandler", js.Any.fromFunction0(value))
      
      inline def setSubscriptionName(value: String): Self = StObject.set(x, "subscriptionName", value.asInstanceOf[js.Any])
    }
  }
  
  trait SubscriptionOptions extends StObject {
    
    var requestManager: Any
    
    var subscription: String
    
    var `type`: String
  }
  object SubscriptionOptions {
    
    inline def apply(requestManager: Any, subscription: String, `type`: String): SubscriptionOptions = {
      val __obj = js.Dynamic.literal(requestManager = requestManager.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscriptionOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SubscriptionOptions] (val x: Self) extends AnyVal {
      
      inline def setRequestManager(value: Any): Self = StObject.set(x, "requestManager", value.asInstanceOf[js.Any])
      
      inline def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type SubscriptionsModel = StringDictionary[SubscriptionModel]
  
  trait SubscriptionsOptions extends StObject {
    
    var name: String
    
    var subscriptions: SubscriptionsModel
    
    var `type`: String
  }
  object SubscriptionsOptions {
    
    inline def apply(name: String, subscriptions: SubscriptionsModel, `type`: String): SubscriptionsOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscriptionsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SubscriptionsOptions] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSubscriptions(value: SubscriptionsModel): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
