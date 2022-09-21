package typings.twitterAutohook

import typings.std.Error
import typings.twitterAutohook.anon.Consumerkey
import typings.twitterAutohook.anon.Oauthtoken
import typings.twitterAutohook.anon.Responsetoken
import typings.twitterAutohook.twitterAutohookBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("twitter-autohook", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twitter-autohook", "Autohook")
  @js.native
  open class Autohook ()
    extends typings.node.eventsMod.^ {
    def this(configuration: Consumerkey) = this()
    
    /** @async */
    def getWebhooks(): js.Promise[Any] = js.native
    
    /** @async */
    def removeWebhook(webhook: Any): js.Promise[Unit] = js.native
    
    /**
      * Removes existing webhooks
      * @async
      */
    def removeWebhooks(): js.Promise[Unit] = js.native
    
    /** @async */
    def setWebhook(webhookUrl: String): js.Promise[Any] = js.native
    
    /**
      * Starts a server and adds a new webhook
      * @async
      */
    def start(): js.Promise[Unit] = js.native
    def start(webhookUrl: String): js.Promise[Unit] = js.native
    
    def startServer(): Unit = js.native
    
    /**
      * Subscribes to a user's activity
      * @async
      */
    def subscribe(options: Oauthtoken): js.Promise[`true`] = js.native
    
    /** @async */
    def unsubscribe(userId: String): js.Promise[`true`] = js.native
  }
  
  @JSImport("twitter-autohook", "TooManySubscriptionsError")
  @js.native
  open class TooManySubscriptionsError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("twitter-autohook", "UserSubscriptionError")
  @js.native
  open class UserSubscriptionError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("twitter-autohook", "WebhookURIError")
  @js.native
  open class WebhookURIError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def validateSignature(header: js.Object, auth: js.Object, body: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validateSignature")(header.asInstanceOf[js.Any], auth.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def validateWebhook(token: String, auth: Any): Responsetoken = (^.asInstanceOf[js.Dynamic].applyDynamic("validateWebhook")(token.asInstanceOf[js.Any], auth.asInstanceOf[js.Any])).asInstanceOf[Responsetoken]
  
  type TwitterError = js.Error
}
