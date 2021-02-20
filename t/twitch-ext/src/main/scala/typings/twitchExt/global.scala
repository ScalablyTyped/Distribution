package typings.twitchExt

import typings.twitchExt.Twitch.ext.Authorized
import typings.twitchExt.Twitch.ext.BitsProduct
import typings.twitchExt.Twitch.ext.BitsTransaction
import typings.twitchExt.Twitch.ext.Rig
import typings.twitchExt.Twitch.ext.Viewer
import typings.twitchExt.Twitch.ext.features.ChangedKey
import typings.twitchExt.anon.Content
import typings.twitchExt.anon.PartialContext
import typings.twitchExt.anon.X
import typings.twitchExt.twitchExtBooleans.`false`
import typings.twitchExt.twitchExtBooleans.`true`
import typings.twitchExt.twitchExtStrings.arePlayerControlsVisible
import typings.twitchExt.twitchExtStrings.bitrate
import typings.twitchExt.twitchExtStrings.bufferSize
import typings.twitchExt.twitchExtStrings.displayResolution
import typings.twitchExt.twitchExtStrings.game
import typings.twitchExt.twitchExtStrings.hlsLatencyBroadcaster
import typings.twitchExt.twitchExtStrings.hostingInfo
import typings.twitchExt.twitchExtStrings.isFullScreen
import typings.twitchExt.twitchExtStrings.isMuted
import typings.twitchExt.twitchExtStrings.isPaused
import typings.twitchExt.twitchExtStrings.isTheatreMode
import typings.twitchExt.twitchExtStrings.language
import typings.twitchExt.twitchExtStrings.mode
import typings.twitchExt.twitchExtStrings.playbackMode
import typings.twitchExt.twitchExtStrings.production
import typings.twitchExt.twitchExtStrings.theme
import typings.twitchExt.twitchExtStrings.videoResolution
import typings.twitchExt.twitchExtStrings.volume
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Twitch {
    
    object ext {
      
      /**
        * @see https://dev.twitch.tv/docs/extensions/reference/#helper-actions
        */
      object actions {
        
        /**
          * This function prompts users to follow the specified channel, with a dialog controlled by Twitch.
          *
          * @see https://dev.twitch.tv/docs/extensions/reference/#followchannel
          */
        @JSGlobal("Twitch.ext.actions.followChannel")
        @js.native
        def followChannel(channelName: String): Unit = js.native
        
        /**
          * This function causes your video-component or video-overlay extension to be minimized.
          *
          * @see https://dev.twitch.tv/docs/extensions/reference/#minimize
          */
        @JSGlobal("Twitch.ext.actions.minimize")
        @js.native
        def minimize(): Unit = js.native
        
        /**
          * This function registers a callback that is invoked whenever a user completes an interaction prompted by the followChannel action.
          *
          * @see https://dev.twitch.tv/docs/extensions/reference/#onfollow
          */
        @JSGlobal("Twitch.ext.actions.onFollow")
        @js.native
        def onFollow(callback: js.Function2[/* didFollow */ Boolean, /* channelName */ String, Unit]): Unit = js.native
        
        /**
          * This function opens a prompt for users to share their identity.
          * After a successful identity link, the Twitch.ext.onAuthorized callback is invoked with the user’s ID.
          *
          * @see https://dev.twitch.tv/docs/extensions/reference/#requestidshare
          */
        @JSGlobal("Twitch.ext.actions.requestIdShare")
        @js.native
        def requestIdShare(): Unit = js.native
      }
      
      /**
        * @see https://dev.twitch.tv/docs/extensions/reference#helper-bits
        */
      object bits {
        
        /**
          * This function returns a promise which resolves to an array of products available for Bits,
          * for the extension, if the context supports Bits in Extensions actions. Otherwise, the
          * promise rejects with an error; this can occur, for instance, if the extension is running in
          * an older version of the developer rig or the mobile app, which does not support Bits in
          * Extensions actions.
          *
          * @see https://dev.twitch.tv/docs/extensions/bits/#getproducts
          */
        @JSGlobal("Twitch.ext.bits.getProducts")
        @js.native
        def getProducts(): js.Promise[js.Array[BitsProduct]] = js.native
        
        /**
          * This function takes a callback that is fired whenever a transaction is cancelled.
          * @param callback The callback that is fired whenever a transaction is cancelled.
          *
          * @see https://dev.twitch.tv/docs/extensions/bits/#ontransactioncancelledcallback
          */
        @JSGlobal("Twitch.ext.bits.onTransactionCancelled")
        @js.native
        def onTransactionCancelled(callback: js.Function0[Unit]): Unit = js.native
        
        /**
          * This function registers a callback that is fired whenever a Bits in Extensions transaction
          * is completed.
          * @param callback The callback that is fired.
          *
          * @see https://dev.twitch.tv/docs/extensions/bits/#ontransactioncompletecallbacktransactionobject
          */
        @JSGlobal("Twitch.ext.bits.onTransactionComplete")
        @js.native
        def onTransactionComplete(callback: js.Function1[/* transaction */ BitsTransaction, Unit]): Unit = js.native
        
        /**
          * This function sets the state of the extension helper, so it does not call live services for
          * usage of Bits. Instead, it does a local loopback to the completion handler, after a fixed
          * delay to simulate user approval and process latency.
          * @param useLoopback Whether to use local looback.
          *
          * @see https://dev.twitch.tv/docs/extensions/bits/#setuseloopbackboolean
          */
        @JSGlobal("Twitch.ext.bits.setUseLoopback")
        @js.native
        def setUseLoopback(useLoopback: Boolean): Unit = js.native
        
        /**
          * Call this function when the viewer hovers over a product in your extension UI, to cause the
          * Twitch UI to display a dialog showing the viewer’s Bits balance.
          * The dialog displays for 1.5 seconds, unless your extension calls showBitsBalance again, in
          * which case the 1.5-second timer resets.
          *
          * This is a “fire-and-forget” function: the extension developer does not need to tell Twitch
          * when the viewer stops hovering over the product.
          *
          * On mobile, this function is ignored.
          *
          * @see https://dev.twitch.tv/docs/extensions/bits/#showbitsbalance
          */
        @JSGlobal("Twitch.ext.bits.showBitsBalance")
        @js.native
        def showBitsBalance(): Unit = js.native
        
        /**
          * This function redeems a product with the specified SKU for the number of Bits specified in
          * the catalog entry of that product.
          * @param sku
          *
          * @see https://dev.twitch.tv/docs/extensions/bits/#usebitssku
          * @see https://dev.twitch.tv/docs/extensions/bits/#exchanging-bits-for-a-product
          */
        @JSGlobal("Twitch.ext.bits.useBits")
        @js.native
        def useBits(sku: String): Unit = js.native
      }
      
      /**
        * @see https://dev.twitch.tv/docs/extensions/reference/#helper-configuration
        */
      object configuration {
        
        /**
          * This property returns the record for the broadcaster segment if one is found; otherwise, undefined.
          */
        @JSGlobal("Twitch.ext.configuration.broadcaster")
        @js.native
        val broadcaster: js.UndefOr[Content] = js.native
        
        /**
          * This property returns the record for the developer segment if one is found; otherwise, undefined.
          */
        @JSGlobal("Twitch.ext.configuration.developer")
        @js.native
        val developer: js.UndefOr[Content] = js.native
        
        /**
          * This property returns the record for the global segment if one is found; otherwise, undefined.
          */
        @JSGlobal("Twitch.ext.configuration.global")
        @js.native
        val global: js.UndefOr[Content] = js.native
        
        /**
          * This function registers a callback that is called whenever an extension configuration is received.
          * The callback function takes no input and returns nothing. After this is called for the first time,
          * the records for the global, developer and broadcaster segments will be set if the data is available.
          * @param callback The callback that is fired.
          */
        @JSGlobal("Twitch.ext.configuration.onChanged")
        @js.native
        def onChanged(callback: js.Function0[Unit]): Unit = js.native
        
        /**
          * This function can be called by the front end to set an extension configuration.
          * @param segment The configuration segment to set. Valid value. "broadcaster".
          * @param version The version of configuration with which the segment is stored.
          * @param content The string-encoded configuration.
          */
        @JSGlobal("Twitch.ext.configuration.set")
        @js.native
        def set_broadcaster(segment: typings.twitchExt.twitchExtStrings.broadcaster, version: String, content: String): Unit = js.native
      }
      
      /**
        * This encodes the environment. For external users, this is always production.
        */
      @JSGlobal("Twitch.ext.environment")
      @js.native
      val environment: production = js.native
      
      /**
        * @see https://dev.twitch.tv/docs/extensions/reference/#twitch-extension-feature-flags
        */
      object features {
        
        /**
          * If this flag is true, Bits in Extensions features will work in your extension on the current channel.
          * If this flag is false, disable or hide the Bits in Extensions features in your extension.
          */
        @JSGlobal("Twitch.ext.features.isBitsEnabled")
        @js.native
        val isBitsEnabled: Boolean = js.native
        
        /**
          * If this flag is true, you can send a chat message to the current channel using Send Extension Chat Message
          * (subject to the authentication requirements documented for that endpoint).
          */
        @JSGlobal("Twitch.ext.features.isChatEnabled")
        @js.native
        val isChatEnabled: Boolean = js.native
        
        /**
          * If this flag is true, your extension has the ability to get the subscription status of identity-linked viewers
          * from both the helper in the twitch.ext.viewer.subscriptionStatus object and via the Twitch API.
          */
        @JSGlobal("Twitch.ext.features.isSubscriptionStatusAvailable")
        @js.native
        val isSubscriptionStatusAvailable: Boolean = js.native
        
        /**
          * This function enables you to receive real-time updates to changes of the features object.
          * If this callback is invoked, you should re-check the Twitch.ext.features object for a change
          * to any feature flag your extension cares about.
          *
          * @param callback The callback is called with an array of feature flags which were updated.
          */
        @JSGlobal("Twitch.ext.features.onChanged")
        @js.native
        def onChanged(callback: js.Function1[/* changed */ js.Array[ChangedKey], Unit]): Unit = js.native
      }
      
      /**
        * This function binds the callback to listen to the target topic.
        *
        * @param target Target topic. Often this is "broadcast" but it might be "whisper-<userId>".
        * @param callback These fields correspond to the values in the send() message, except the message is always a string.
        * @see https://dev.twitch.tv/docs/extensions/reference/#listen
        */
      @JSGlobal("Twitch.ext.listen")
      @js.native
      def listen(
        target: String,
        callback: js.Function3[/* target */ String, /* contentType */ String, /* message */ String, Unit]
      ): Unit = js.native
      
      /**
        * This function binds the callback to the initial values and changes to the authorization data.
        *
        * @param authCallback This callback is fired each time the JWT is refreshed.
        * @see https://dev.twitch.tv/docs/extensions/reference/#onauthorized
        */
      @JSGlobal("Twitch.ext.onAuthorized")
      @js.native
      def onAuthorized(authCallback: js.Function1[/* auth */ Authorized, Unit]): Unit = js.native
      
      /**
        * This function binds the callback to the initial values and changes to the context.
        *
        * @param contextCallback This callback is fired when the context of an extension is fired.
        * @see https://dev.twitch.tv/docs/extensions/reference/#oncontext
        */
      @JSGlobal("Twitch.ext.onContext")
      @js.native
      def onContext(
        contextCallback: js.Function2[
              /* context */ PartialContext, 
              /* changed */ js.Array[
                /* keyof twitch-ext.anon.PartialContext */ playbackMode | videoResolution | hostingInfo | isFullScreen | volume | isTheatreMode | theme | hlsLatencyBroadcaster | arePlayerControlsVisible | language | bitrate | isPaused | bufferSize | displayResolution | mode | game | isMuted
              ], 
              Unit
            ]
      ): Unit = js.native
      
      /**
        * This function binds the callback to any internal error.
        *
        * @param errorCallback This callback is fired if any errors are generated by the extension helper.
        * @see https://dev.twitch.tv/docs/extensions/reference/#onerror
        */
      @JSGlobal("Twitch.ext.onError")
      @js.native
      def onError(errorCallback: js.Function1[/* errorValue */ js.Any, Unit]): Unit = js.native
      
      /**
        * This function allows an extension to adjust its visibility when the viewer highlights the extension by hovering
        * over the extension’s menu icon or open menu, in the video player. The function applies only to video-overlay and
        * component Extensions.
        *
        * @param callback This callback is called whenever the extension is or is no longer highlighted by the user.
        * @see https://dev.twitch.tv/docs/extensions/reference/#onhighlightchanged
        */
      @JSGlobal("Twitch.ext.onHighlightChanged")
      @js.native
      def onHighlightChanged(callback: js.Function1[/* isHighlighted */ Boolean, Unit]): Unit = js.native
      
      /**
        * This function registers a callback that gets called whenever an extension changes position in the player. This
        * occurs only for video-component extensions. This also is triggered as the extension loads.
        *
        * @param callback This callback is called whenever an extension changes position in the player.
        * @see https://dev.twitch.tv/docs/extensions/reference/#onpositionchanged
        */
      @JSGlobal("Twitch.ext.onPositionChanged")
      @js.native
      def onPositionChanged(callback: js.Function1[/* position */ X, Unit]): Unit = js.native
      
      /**
        * This function registers a callback that gets called whenever an extension is hidden/re-shown. (This occurs only
        * for mobile or component extensions.) When an extension is not visible in the mobile app, it does not receive
        * onContext updates and must perform only minimal work in the background.
        *
        * @param callback This callback is called whenever an extension is hidden/re-shown.
        * @see https://dev.twitch.tv/docs/extensions/reference/#onvisibilitychanged
        */
      @JSGlobal("Twitch.ext.onVisibilityChanged")
      @js.native
      def onVisibilityChanged_false(callback: js.Function1[`false`, Unit]): Unit = js.native
      @JSGlobal("Twitch.ext.onVisibilityChanged")
      @js.native
      def onVisibilityChanged_true(callback: js.Function2[`true`, /* context */ PartialContext, Unit]): Unit = js.native
      
      /**
        * Helper methods for the Twitch Extension rig.
        * @see https://github.com/twitchdev/developer-rig
        */
      @JSGlobal("Twitch.ext.rig")
      @js.native
      val rig: Rig = js.native
      
      @JSGlobal("Twitch.ext.send")
      @js.native
      def send(target: String, contentType: String, message: String): Unit = js.native
      /**
        * This function can be called by the front end to send directly to PubSub.
        *
        * @param target Target topic. Often this is "broadcast" but it might be "whisper-<userId>".
        * @param contentType type of the serialized message; for example, "application/json".
        * @param message Either an object that will be automatically serialized as JSON or a string.
        * @see https://dev.twitch.tv/docs/extensions/reference/#send
        */
      @JSGlobal("Twitch.ext.send")
      @js.native
      def send(target: String, contentType: String, message: js.Object): Unit = js.native
      
      /**
        * This function unbinds the listen callback from the target.
        *
        * @param target Target topic. Often this is "broadcast" but it might be "whisper-<userId>".
        * @param callback These fields correspond to the values in the send() message, except the message is always a string.
        * @see https://dev.twitch.tv/docs/extensions/reference/#unlisten
        */
      @JSGlobal("Twitch.ext.unlisten")
      @js.native
      def unlisten(
        target: String,
        callback: js.Function3[/* target */ String, /* contentType */ String, /* message */ String, Unit]
      ): Unit = js.native
      
      /**
        * This encodes the Helper version in 1.1.1 (semantic versioning) format.
        */
      @JSGlobal("Twitch.ext.version")
      @js.native
      val version: String = js.native
      
      /**
        * @see https://dev.twitch.tv/docs/extensions/reference#helper-viewer
        */
      @JSGlobal("Twitch.ext.viewer")
      @js.native
      val viewer: Viewer = js.native
    }
  }
}
