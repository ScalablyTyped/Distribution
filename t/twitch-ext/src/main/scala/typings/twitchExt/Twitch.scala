package typings.twitchExt

import typings.twitchExt.anon.HostedChannelId
import typings.twitchExt.twitchExtStrings.CURRENT_USER
import typings.twitchExt.twitchExtStrings.OTHER
import typings.twitchExt.twitchExtStrings.`chat-only`
import typings.twitchExt.twitchExtStrings.`false`
import typings.twitchExt.twitchExtStrings.`true`
import typings.twitchExt.twitchExtStrings.approved
import typings.twitchExt.twitchExtStrings.audio
import typings.twitchExt.twitchExtStrings.bits
import typings.twitchExt.twitchExtStrings.component
import typings.twitchExt.twitchExtStrings.config
import typings.twitchExt.twitchExtStrings.dark
import typings.twitchExt.twitchExtStrings.dashboard
import typings.twitchExt.twitchExtStrings.hosted_test
import typings.twitchExt.twitchExtStrings.in_review
import typings.twitchExt.twitchExtStrings.light
import typings.twitchExt.twitchExtStrings.mobile
import typings.twitchExt.twitchExtStrings.panel
import typings.twitchExt.twitchExtStrings.pending_action
import typings.twitchExt.twitchExtStrings.ready_for_review
import typings.twitchExt.twitchExtStrings.released
import typings.twitchExt.twitchExtStrings.remote
import typings.twitchExt.twitchExtStrings.testing
import typings.twitchExt.twitchExtStrings.uploading
import typings.twitchExt.twitchExtStrings.video
import typings.twitchExt.twitchExtStrings.video_overlay
import typings.twitchExt.twitchExtStrings.viewer
import typings.twitchExt.twitchExtStrings.web
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Twitch {
  
  object ext {
    
    /**
      * The result object as passed to the onAuthorized callback.
      *
      * @see onAuthorized
      */
    @js.native
    trait Authorized extends StObject {
      
      /**
        * Channel ID of the page where the extension is iframe embedded.
        */
      var channelId: String = js.native
      
      /**
        * Client ID of the extension.
        */
      var clientId: String = js.native
      
      /**
        * JWT that should be passed to any EBS call for authentication.
        */
      var token: String = js.native
      
      /**
        * Opaque user ID.
        */
      var userId: String = js.native
    }
    object Authorized {
      
      @scala.inline
      def apply(channelId: String, clientId: String, token: String, userId: String): Authorized = {
        val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
        __obj.asInstanceOf[Authorized]
      }
      
      @scala.inline
      implicit class AuthorizedMutableBuilder[Self <: Authorized] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait BitsProduct extends StObject {
      
      /**
        * Cost object.
        */
      var cost: BitsProductCost = js.native
      
      /**
        * Registered display name for the SKU.
        */
      var displayName: String = js.native
      
      /**
        * This field is returned only for extension versions that are not in the Released state.
        */
      var inDevelopment: js.UndefOr[Boolean] = js.native
      
      /**
        * Unique ID for the product.
        */
      var sku: String = js.native
    }
    object BitsProduct {
      
      @scala.inline
      def apply(cost: BitsProductCost, displayName: String, sku: String): BitsProduct = {
        val __obj = js.Dynamic.literal(cost = cost.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], sku = sku.asInstanceOf[js.Any])
        __obj.asInstanceOf[BitsProduct]
      }
      
      @scala.inline
      implicit class BitsProductMutableBuilder[Self <: BitsProduct] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCost(value: BitsProductCost): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInDevelopment(value: Boolean): Self = StObject.set(x, "inDevelopment", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInDevelopmentUndefined: Self = StObject.set(x, "inDevelopment", js.undefined)
        
        @scala.inline
        def setSku(value: String): Self = StObject.set(x, "sku", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait BitsProductCost extends StObject {
      
      /**
        * Number of Bits required for the product.
        */
      var amount: String = js.native
      
      /**
        * Always the string "bits". Reserved for future use.
        */
      var `type`: bits = js.native
    }
    object BitsProductCost {
      
      @scala.inline
      def apply(amount: String, `type`: bits): BitsProductCost = {
        val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[BitsProductCost]
      }
      
      @scala.inline
      implicit class BitsProductCostMutableBuilder[Self <: BitsProductCost] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setType(value: bits): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait BitsTransaction extends StObject {
      
      /**
        * Display name of the user who executed the Bits in Extensions transaction.
        */
      var displayName: String = js.native
      
      /**
        * Will be "twitch.ext" + your extension ID.
        */
      var domainID: String = js.native
      
      var initiator: CURRENT_USER | OTHER = js.native
      
      /**
        * Full product object from getProducts call
        */
      var product: BitsProduct = js.native
      
      /**
        * ID of the transaction.
        */
      var transactionID: String = js.native
      
      /**
        * JWT containing the following transaction information in the payload.
        * The JWT is a large, base64-encoded string. It can be verified using your developer secret.
        */
      var transactionReceipt: String = js.native
      
      /**
        * Twitch ID of the user who executed the transaction.
        */
      var userId: String = js.native
    }
    object BitsTransaction {
      
      @scala.inline
      def apply(
        displayName: String,
        domainID: String,
        initiator: CURRENT_USER | OTHER,
        product: BitsProduct,
        transactionID: String,
        transactionReceipt: String,
        userId: String
      ): BitsTransaction = {
        val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], domainID = domainID.asInstanceOf[js.Any], initiator = initiator.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any], transactionReceipt = transactionReceipt.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
        __obj.asInstanceOf[BitsTransaction]
      }
      
      @scala.inline
      implicit class BitsTransactionMutableBuilder[Self <: BitsTransaction] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDomainID(value: String): Self = StObject.set(x, "domainID", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInitiator(value: CURRENT_USER | OTHER): Self = StObject.set(x, "initiator", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProduct(value: BitsProduct): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTransactionID(value: String): Self = StObject.set(x, "transactionID", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTransactionReceipt(value: String): Self = StObject.set(x, "transactionReceipt", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The extension window receives the following query parameters, which indicate
      * information about the extension environment that isn’t subject to change over
      * the frame’s life cycle. Note that all parameters are encoded as strings here,
      * because they are always part of the URL.
      *
      * @see https://dev.twitch.tv/docs/extensions/reference/#client-query-parameters
      */
    @js.native
    trait ClientQueryParams extends StObject {
      
      /**
        * The type of the anchor in which the extension is activated.
        */
      var anchor: component | panel | video_overlay = js.native
      
      /**
        * The user’s language setting.
        *
        * @example "en"
        */
      var language: String = js.native
      
      /**
        * The user’s language locale.
        *
        * @example "en-US"
        */
      var locale: String = js.native
      
      /**
        * The extension’s mode.
        */
      var mode: config | dashboard | viewer = js.native
      
      /**
        * The platform on which the Twitch client is running.
        */
      var platform: mobile | web = js.native
      
      /**
        * Indicates whether the extension is popped out.
        */
      var popout: `true` | `false` = js.native
      
      /**
        * The release state of the extension.
        */
      var state: testing | hosted_test | approved | released | ready_for_review | in_review | pending_action | uploading = js.native
    }
    object ClientQueryParams {
      
      @scala.inline
      def apply(
        anchor: component | panel | video_overlay,
        language: String,
        locale: String,
        mode: config | dashboard | viewer,
        platform: mobile | web,
        popout: `true` | `false`,
        state: testing | hosted_test | approved | released | ready_for_review | in_review | pending_action | uploading
      ): ClientQueryParams = {
        val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], popout = popout.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
        __obj.asInstanceOf[ClientQueryParams]
      }
      
      @scala.inline
      implicit class ClientQueryParamsMutableBuilder[Self <: ClientQueryParams] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAnchor(value: component | panel | video_overlay): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMode(value: config | dashboard | viewer): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPlatform(value: mobile | web): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPopout(value: `true` | `false`): Self = StObject.set(x, "popout", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setState(
          value: testing | hosted_test | approved | released | ready_for_review | in_review | pending_action | uploading
        ): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The result object as passed to the onContext callback.
      *
      * @see onContext
      */
    @js.native
    trait Context extends StObject {
      
      /**
        * If true, player controls are visible (e.g., due to mouseover).
        * Do not use this for mobile extensions; it is not sent for mobile.
        */
      var arePlayerControlsVisible: Boolean = js.native
      
      /**
        * Bitrate of the broadcast.
        */
      var bitrate: Double = js.native
      
      /**
        * Buffer size of the broadcast.
        */
      var bufferSize: Double = js.native
      
      /**
        * Display size of the player.
        */
      var displayResolution: String = js.native
      
      /**
        * Game being broadcast.
        */
      var game: String = js.native
      
      /**
        * Number of seconds of latency between the broadcaster and viewer.
        */
      var hlsLatencyBroadcaster: Double = js.native
      
      /**
        * Information about the current channel’s hosting status, or undefined if the channel is not currently hosting.
        */
      var hostingInfo: js.UndefOr[HostedChannelId] = js.native
      
      /**
        * If true, the viewer is watching in fullscreen mode.
        * Do not use this for mobile extensions; it is not sent for mobile.
        */
      var isFullScreen: Boolean = js.native
      
      /**
        * If true, the viewer has muted the stream.
        */
      var isMuted: Boolean = js.native
      
      /**
        * If true, the viewer has paused the stream.
        */
      var isPaused: Boolean = js.native
      
      /**
        * If true, the viewer is watching in theater mode.
        * Do not use this for mobile extensions; it is not sent for mobile.
        */
      var isTheatreMode: Boolean = js.native
      
      /**
        * Language of the broadcast (e.g., "en").
        */
      var language: String = js.native
      
      /**
        * The mode the extension is currently run in.
        */
      var mode: viewer | dashboard | config = js.native
      
      /**
        * Indicates how the stream is being played.
        */
      var playbackMode: video | audio | remote | `chat-only` = js.native
      
      /**
        * The user’s theme setting on the Twitch website.
        */
      var theme: light | dark = js.native
      
      /**
        * Resolution of the broadcast.
        */
      var videoResolution: String = js.native
      
      /**
        * Currently selected player volume. Valid values: between 0 and 1.
        */
      var volume: Double = js.native
    }
    object Context {
      
      @scala.inline
      def apply(
        arePlayerControlsVisible: Boolean,
        bitrate: Double,
        bufferSize: Double,
        displayResolution: String,
        game: String,
        hlsLatencyBroadcaster: Double,
        isFullScreen: Boolean,
        isMuted: Boolean,
        isPaused: Boolean,
        isTheatreMode: Boolean,
        language: String,
        mode: viewer | dashboard | config,
        playbackMode: video | audio | remote | `chat-only`,
        theme: light | dark,
        videoResolution: String,
        volume: Double
      ): Context = {
        val __obj = js.Dynamic.literal(arePlayerControlsVisible = arePlayerControlsVisible.asInstanceOf[js.Any], bitrate = bitrate.asInstanceOf[js.Any], bufferSize = bufferSize.asInstanceOf[js.Any], displayResolution = displayResolution.asInstanceOf[js.Any], game = game.asInstanceOf[js.Any], hlsLatencyBroadcaster = hlsLatencyBroadcaster.asInstanceOf[js.Any], isFullScreen = isFullScreen.asInstanceOf[js.Any], isMuted = isMuted.asInstanceOf[js.Any], isPaused = isPaused.asInstanceOf[js.Any], isTheatreMode = isTheatreMode.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], playbackMode = playbackMode.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], videoResolution = videoResolution.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
        __obj.asInstanceOf[Context]
      }
      
      @scala.inline
      implicit class ContextMutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setArePlayerControlsVisible(value: Boolean): Self = StObject.set(x, "arePlayerControlsVisible", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBufferSize(value: Double): Self = StObject.set(x, "bufferSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisplayResolution(value: String): Self = StObject.set(x, "displayResolution", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGame(value: String): Self = StObject.set(x, "game", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHlsLatencyBroadcaster(value: Double): Self = StObject.set(x, "hlsLatencyBroadcaster", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHostingInfo(value: HostedChannelId): Self = StObject.set(x, "hostingInfo", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHostingInfoUndefined: Self = StObject.set(x, "hostingInfo", js.undefined)
        
        @scala.inline
        def setIsFullScreen(value: Boolean): Self = StObject.set(x, "isFullScreen", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsMuted(value: Boolean): Self = StObject.set(x, "isMuted", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsPaused(value: Boolean): Self = StObject.set(x, "isPaused", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsTheatreMode(value: Boolean): Self = StObject.set(x, "isTheatreMode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMode(value: viewer | dashboard | config): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPlaybackMode(value: video | audio | remote | `chat-only`): Self = StObject.set(x, "playbackMode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTheme(value: light | dark): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVideoResolution(value: String): Self = StObject.set(x, "videoResolution", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The developer rig object as available under window.Twitch.ext.rig.
      *
      * @see rig
      */
    @js.native
    trait Rig extends StObject {
      
      /**
        * Print a message to the developer rig console.
        *
        * @param message The message to print.
        * @see https://github.com/twitchdev/developer-rig#rig-console
        */
      def log(message: String): Unit = js.native
    }
    object Rig {
      
      @scala.inline
      def apply(log: String => Unit): Rig = {
        val __obj = js.Dynamic.literal(log = js.Any.fromFunction1(log))
        __obj.asInstanceOf[Rig]
      }
      
      @scala.inline
      implicit class RigMutableBuilder[Self <: Rig] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLog(value: String => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
      }
    }
    
    /**
      * @see viewer
      */
    @js.native
    trait Viewer extends StObject {
      
      /**
        * The Twitch ID of a linked viewer. null if the viewer has not opted to share their identity with the extension.
        */
      var id: String | Null = js.native
      
      /**
        * Provided as a convenience to check whether or not a user has shared their identity with their extension
        */
      var isLinked: Boolean = js.native
      
      /**
        * This function binds a callback will be invoked when the viewer’s status changes (e.g. if a viewer subscribes and
        * changes their subscription status).
        * @param callback The callback that is called whenever the viewer's status changes
        */
      def onChanged(callback: js.Function0[Unit]): Unit = js.native
      
      /**
        * The opaque id of the viewer.
        */
      var opaqueId: String = js.native
      
      /**
        * The role of the user. See the JWT schema for possible values.
        */
      var role: String = js.native
      
      /**
        * The encoded JWT. This is the same as the token property of the authData parameter that currently gets passed to
        * the onAuthorized callback.
        */
      var sessionToken: String = js.native
      
      /**
        * An object containing information about the viewer’s subscription. The value of subscriptionStatus will be null if
        * the user is either not a subscriber, or opting not to share their identity. The value will also be null if the
        * extension otherwise doesn't have subscription capabilities.
        */
      var subscriptionStatus: ViewerSubscriptionStatus | Null = js.native
    }
    object Viewer {
      
      @scala.inline
      def apply(
        isLinked: Boolean,
        onChanged: js.Function0[Unit] => Unit,
        opaqueId: String,
        role: String,
        sessionToken: String
      ): Viewer = {
        val __obj = js.Dynamic.literal(isLinked = isLinked.asInstanceOf[js.Any], onChanged = js.Any.fromFunction1(onChanged), opaqueId = opaqueId.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], sessionToken = sessionToken.asInstanceOf[js.Any])
        __obj.asInstanceOf[Viewer]
      }
      
      @scala.inline
      implicit class ViewerMutableBuilder[Self <: Viewer] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdNull: Self = StObject.set(x, "id", null)
        
        @scala.inline
        def setIsLinked(value: Boolean): Self = StObject.set(x, "isLinked", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnChanged(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "onChanged", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOpaqueId(value: String): Self = StObject.set(x, "opaqueId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSessionToken(value: String): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSubscriptionStatus(value: ViewerSubscriptionStatus): Self = StObject.set(x, "subscriptionStatus", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSubscriptionStatusNull: Self = StObject.set(x, "subscriptionStatus", null)
      }
    }
    
    @js.native
    trait ViewerSubscriptionStatus extends StObject {
      
      /**
        * This tier of the subscription.
        * Possible values are 1000, 200 and 300 for tier one, two and three subscriptions respectively.
        */
      var tier: String = js.native
    }
    object ViewerSubscriptionStatus {
      
      @scala.inline
      def apply(tier: String): ViewerSubscriptionStatus = {
        val __obj = js.Dynamic.literal(tier = tier.asInstanceOf[js.Any])
        __obj.asInstanceOf[ViewerSubscriptionStatus]
      }
      
      @scala.inline
      implicit class ViewerSubscriptionStatusMutableBuilder[Self <: ViewerSubscriptionStatus] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setTier(value: String): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * @see https://dev.twitch.tv/docs/extensions/reference/#helper-actions
      */
    object actions
    
    /**
      * @see https://dev.twitch.tv/docs/extensions/reference#helper-bits
      */
    object bits
    
    /**
      * @see https://dev.twitch.tv/docs/extensions/reference/#helper-configuration
      */
    object configuration
    
    /**
      * @see https://dev.twitch.tv/docs/extensions/reference/#twitch-extension-feature-flags
      */
    object features {
      
      /* Rewritten from type alias, can be one of: 
        - typings.twitchExt.twitchExtStrings.isBitsEnabled
        - typings.twitchExt.twitchExtStrings.isChatEnabled
        - typings.twitchExt.twitchExtStrings.isSubscriptionStatusAvailable
      */
      trait ChangedKey extends StObject
      object ChangedKey {
        
        @scala.inline
        def isBitsEnabled: typings.twitchExt.twitchExtStrings.isBitsEnabled = "isBitsEnabled".asInstanceOf[typings.twitchExt.twitchExtStrings.isBitsEnabled]
        
        @scala.inline
        def isChatEnabled: typings.twitchExt.twitchExtStrings.isChatEnabled = "isChatEnabled".asInstanceOf[typings.twitchExt.twitchExtStrings.isChatEnabled]
        
        @scala.inline
        def isSubscriptionStatusAvailable: typings.twitchExt.twitchExtStrings.isSubscriptionStatusAvailable = "isSubscriptionStatusAvailable".asInstanceOf[typings.twitchExt.twitchExtStrings.isSubscriptionStatusAvailable]
      }
    }
  }
}
