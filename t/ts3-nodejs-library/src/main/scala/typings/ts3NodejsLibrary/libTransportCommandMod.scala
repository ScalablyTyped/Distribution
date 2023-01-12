package typings.ts3NodejsLibrary

import typings.std.Record
import typings.ts3NodejsLibrary.anon.Instantiable
import typings.ts3NodejsLibrary.anon.Key
import typings.ts3NodejsLibrary.anon.PickParserArgumentraw
import typings.ts3NodejsLibrary.libExceptionResponseErrorMod.ResponseError
import typings.ts3NodejsLibrary.libTransportCommandMod.Command.ParserCallback
import typings.ts3NodejsLibrary.libTransportCommandMod.Command.flags
import typings.ts3NodejsLibrary.libTransportCommandMod.Command.multiOpts
import typings.ts3NodejsLibrary.libTransportCommandMod.Command.options
import typings.ts3NodejsLibrary.libTransportTeamSpeakQueryMod.TeamSpeakQuery.Response
import typings.ts3NodejsLibrary.libTransportTeamSpeakQueryMod.TeamSpeakQuery.ValueTypes
import typings.ts3NodejsLibrary.libTypesResponseTypesMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTransportCommandMod {
  
  @JSImport("ts3-nodejs-library/lib/transport/Command", "Command")
  @js.native
  open class Command () extends StObject {
    
    /** runs the parser of this instance */
    def build(): String = js.native
    
    /** builds the query string for flags */
    def buildFlags(): String = js.native
    
    /** builds the query string for options */
    def buildOption(options: Record[String, Any]): String = js.native
    
    /**
      * builds the query string for options
      * @return the parsed String which is readable by the TeamSpeak Querytt
      */
    def buildOptions(): String = js.native
    
    /* private */ var cmd: Any = js.native
    
    /* private */ var error: Any = js.native
    
    /* private */ var flags: Any = js.native
    
    /** get the parsed error object which has been received from the TeamSpeak Query */
    def getError(): ResponseError | Null = js.native
    
    /**
      * retrieves the current set options for this command
      */
    def getOptions(): options = js.native
    
    /** get the parsed response object which has been received from the TeamSpeak Query */
    def getResponse(): Response = js.native
    
    /** checks if a error has been received */
    def hasError(): Boolean = js.native
    
    /** checks wether there are flags used with this command */
    def hasFlags(): Boolean = js.native
    
    /** checks wether there are options used with this command */
    def hasMultiOptions(): Boolean = js.native
    
    /** checks wether there are options used with this command */
    def hasOptions(): Boolean = js.native
    
    /* private */ var multiOpts: Any = js.native
    
    /* private */ var options: Any = js.native
    
    /** runs the parser of this instance */
    def parse(raw: String): Response = js.native
    
    /* private */ var requestParser: Any = js.native
    
    /** Initializes the Respone with default values */
    def reset(): Command = js.native
    
    /* private */ var response: Any = js.native
    
    /* private */ var responseParser: Any = js.native
    
    /** Sets the main command to send */
    def setCommand(cmd: String): Command = js.native
    
    /**
      * Set the error line which has been received from the TeamSpeak Query
      * @param error the error line which has been received from the TeamSpeak Query
      */
    def setError(raw: String): Command = js.native
    
    /**
      * set TeamSpeak flags
      * @param flags sets the flags which should get sent to the teamspeak query
      */
    def setFlags(flags: flags): Command = js.native
    
    /**
      * Sets the TeamSpeak Key Value Pairs
      * @param opts sets the Object with the key value pairs which should get sent to the TeamSpeak Query
      */
    def setMultiOptions(options: multiOpts): Command = js.native
    
    /**
      * Sets the TeamSpeak Key Value Pairs
      * @param opts sets the Object with the key value pairs which should get sent to the TeamSpeak Query
      */
    def setOptions(options: options): Command = js.native
    
    /**
      * adds a customparser
      * @param parsers
      */
    def setParser(parsers: ParserCallback): this.type = js.native
    
    /**
      * set the Line which has been received from the TeamSpeak Query
      * @param line the line which has been received from the teamSpeak query
      */
    def setResponse(line: String): Command = js.native
    
    /* private */ var stack: Any = js.native
  }
  /* static members */
  object Command {
    
    @JSImport("ts3-nodejs-library/lib/transport/Command", "Command")
    @js.native
    val ^ : js.Any = js.native
    
    object Identifier {
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.apikey")
      @js.native
      def apikey: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def apikey_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("apikey")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.averageSpeed")
      @js.native
      def averageSpeed: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def averageSpeed_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("averageSpeed")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.banid")
      @js.native
      def banid: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def banid_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("banid")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.build")
      @js.native
      def build: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def build_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("build")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.cfid")
      @js.native
      def cfid: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def cfid_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cfid")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.cgid")
      @js.native
      def cgid: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def cgid_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cgid")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.channelBannerGfxUrl")
      @js.native
      def channelBannerGfxUrl: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def channelBannerGfxUrl_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("channelBannerGfxUrl")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.channelBannerMode")
      @js.native
      def channelBannerMode: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def channelBannerMode_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("channelBannerMode")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.channelCodec")
      @js.native
      def channelCodec: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.channelCodecIsUnencrypted")
      @js.native
      def channelCodecIsUnencrypted: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def channelCodecIsUnencrypted_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("channelCodecIsUnencrypted")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.channelCodecLatencyFactor")
      @js.native
      def channelCodecLatencyFactor: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def channelCodecLatencyFactor_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("channelCodecLatencyFactor")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.channelCodecQuality")
      @js.native
      def channelCodecQuality: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def channelCodecQuality_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("channelCodecQuality")(x.asInstanceOf[js.Any])
      
      inline def channelCodec_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("channelCodec")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.channelDeleteDelay")
      @js.native
      def channelDeleteDelay: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def channelDeleteDelay_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("channelDeleteDelay")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.channelDescription")
      @js.native
      def channelDescription: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def channelDescription_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("channelDescription")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.channelFilepath")
      @js.native
      def channelFilepath: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def channelFilepath_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("channelFilepath")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.channelFlagDefault")
      @js.native
      def channelFlagDefault: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseBoolean */ Any = js.native
      inline def channelFlagDefault_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseBoolean */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("channelFlagDefault")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.channelFlagMaxclientsUnlimited")
      @js.native
      def channelFlagMaxclientsUnlimited: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseBoolean */ Any = js.native
      inline def channelFlagMaxclientsUnlimited_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseBoolean */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("channelFlagMaxclientsUnlimited")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.channelFlagMaxfamilyclientsInherited")
      @js.native
      def channelFlagMaxfamilyclientsInherited: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseBoolean */ Any = js.native
      inline def channelFlagMaxfamilyclientsInherited_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseBoolean */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("channelFlagMaxfamilyclientsInherited")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.channelFlagMaxfamilyclientsUnlimited")
      @js.native
      def channelFlagMaxfamilyclientsUnlimited: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseBoolean */ Any = js.native
      inline def channelFlagMaxfamilyclientsUnlimited_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseBoolean */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("channelFlagMaxfamilyclientsUnlimited")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.channelFlagPassword")
      @js.native
      def channelFlagPassword: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseBoolean */ Any = js.native
      inline def channelFlagPassword_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseBoolean */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("channelFlagPassword")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.channelFlagPermanent")
      @js.native
      def channelFlagPermanent: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseBoolean */ Any = js.native
      inline def channelFlagPermanent_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseBoolean */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("channelFlagPermanent")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.channelFlagPrivate")
      @js.native
      def channelFlagPrivate: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseBoolean */ Any = js.native
      inline def channelFlagPrivate_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseBoolean */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("channelFlagPrivate")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.channelFlagSemiPermanent")
      @js.native
      def channelFlagSemiPermanent: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseBoolean */ Any = js.native
      inline def channelFlagSemiPermanent_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseBoolean */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("channelFlagSemiPermanent")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.channelFlagTemporary")
      @js.native
      def channelFlagTemporary: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseBoolean */ Any = js.native
      inline def channelFlagTemporary_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseBoolean */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("channelFlagTemporary")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.channelForcedSilence")
      @js.native
      def channelForcedSilence: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def channelForcedSilence_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("channelForcedSilence")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.channelIconId")
      @js.native
      def channelIconId: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def channelIconId_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("channelIconId")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.channelMaxclients")
      @js.native
      def channelMaxclients: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def channelMaxclients_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("channelMaxclients")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.channelMaxfamilyclients")
      @js.native
      def channelMaxfamilyclients: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def channelMaxfamilyclients_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("channelMaxfamilyclients")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.channelName")
      @js.native
      def channelName: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.channelNamePhonetic")
      @js.native
      def channelNamePhonetic: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def channelNamePhonetic_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("channelNamePhonetic")(x.asInstanceOf[js.Any])
      
      inline def channelName_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("channelName")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.channelNeededSubscribePower")
      @js.native
      def channelNeededSubscribePower: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def channelNeededSubscribePower_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("channelNeededSubscribePower")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.channelNeededTalkPower")
      @js.native
      def channelNeededTalkPower: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def channelNeededTalkPower_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("channelNeededTalkPower")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.channelOrder")
      @js.native
      def channelOrder: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def channelOrder_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("channelOrder")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.channelPassword")
      @js.native
      def channelPassword: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def channelPassword_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("channelPassword")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.channelSecuritySalt")
      @js.native
      def channelSecuritySalt: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def channelSecuritySalt_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("channelSecuritySalt")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.channelTopic")
      @js.native
      def channelTopic: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def channelTopic_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("channelTopic")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.cid")
      @js.native
      def cid: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def cid_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cid")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.cldbid")
      @js.native
      def cldbid: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def cldbid_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cldbid")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clid")
      @js.native
      def clid: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def clid_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clid")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientAway")
      @js.native
      def clientAway: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseBoolean */ Any = js.native
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientAwayMessage")
      @js.native
      def clientAwayMessage: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def clientAwayMessage_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientAwayMessage")(x.asInstanceOf[js.Any])
      
      inline def clientAway_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseBoolean */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientAway")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientBadges")
      @js.native
      def clientBadges: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def clientBadges_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientBadges")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientBase64HashClientUID")
      @js.native
      def clientBase64HashClientUID: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def clientBase64HashClientUID_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientBase64HashClientUID")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientChannelGroupId")
      @js.native
      def clientChannelGroupId: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def clientChannelGroupId_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientChannelGroupId")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientChannelGroupInheritedChannelId")
      @js.native
      def clientChannelGroupInheritedChannelId: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def clientChannelGroupInheritedChannelId_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientChannelGroupInheritedChannelId")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientChannelId")
      @js.native
      def clientChannelId: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def clientChannelId_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientChannelId")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientCountry")
      @js.native
      def clientCountry: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def clientCountry_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientCountry")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientCreated")
      @js.native
      def clientCreated: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def clientCreated_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientCreated")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientDatabaseId")
      @js.native
      def clientDatabaseId: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def clientDatabaseId_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientDatabaseId")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientDefaultChannel")
      @js.native
      def clientDefaultChannel: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def clientDefaultChannel_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientDefaultChannel")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientDefaultToken")
      @js.native
      def clientDefaultToken: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def clientDefaultToken_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientDefaultToken")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientDescription")
      @js.native
      def clientDescription: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def clientDescription_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientDescription")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientEstimatedLocation")
      @js.native
      def clientEstimatedLocation: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def clientEstimatedLocation_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientEstimatedLocation")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientFlagAvatar")
      @js.native
      def clientFlagAvatar: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def clientFlagAvatar_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientFlagAvatar")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientFlagTalking")
      @js.native
      def clientFlagTalking: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseBoolean */ Any = js.native
      inline def clientFlagTalking_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseBoolean */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientFlagTalking")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientIconId")
      @js.native
      def clientIconId: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def clientIconId_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientIconId")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientId")
      @js.native
      def clientId: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def clientId_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientId")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientIdleTime")
      @js.native
      def clientIdleTime: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def clientIdleTime_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientIdleTime")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientInputHardware")
      @js.native
      def clientInputHardware: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseBoolean */ Any = js.native
      inline def clientInputHardware_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseBoolean */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientInputHardware")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientInputMuted")
      @js.native
      def clientInputMuted: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseBoolean */ Any = js.native
      inline def clientInputMuted_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseBoolean */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientInputMuted")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientIntegrations")
      @js.native
      def clientIntegrations: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def clientIntegrations_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientIntegrations")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientIsChannelCommander")
      @js.native
      def clientIsChannelCommander: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseBoolean */ Any = js.native
      inline def clientIsChannelCommander_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseBoolean */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientIsChannelCommander")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientIsPrioritySpeaker")
      @js.native
      def clientIsPrioritySpeaker: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def clientIsPrioritySpeaker_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientIsPrioritySpeaker")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientIsRecording")
      @js.native
      def clientIsRecording: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseBoolean */ Any = js.native
      inline def clientIsRecording_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseBoolean */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientIsRecording")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientIsTalker")
      @js.native
      def clientIsTalker: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseBoolean */ Any = js.native
      inline def clientIsTalker_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseBoolean */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientIsTalker")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientLastconnected")
      @js.native
      def clientLastconnected: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def clientLastconnected_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientLastconnected")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientLastip")
      @js.native
      def clientLastip: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def clientLastip_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientLastip")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientLoginName")
      @js.native
      def clientLoginName: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def clientLoginName_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientLoginName")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientLoginPassword")
      @js.native
      def clientLoginPassword: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def clientLoginPassword_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientLoginPassword")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientMetaData")
      @js.native
      def clientMetaData: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def clientMetaData_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientMetaData")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientMonthBytesDownloaded")
      @js.native
      def clientMonthBytesDownloaded: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def clientMonthBytesDownloaded_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientMonthBytesDownloaded")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientMonthBytesUploaded")
      @js.native
      def clientMonthBytesUploaded: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def clientMonthBytesUploaded_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientMonthBytesUploaded")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientMyteamspeakAvatar")
      @js.native
      def clientMyteamspeakAvatar: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def clientMyteamspeakAvatar_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientMyteamspeakAvatar")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientMyteamspeakId")
      @js.native
      def clientMyteamspeakId: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def clientMyteamspeakId_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientMyteamspeakId")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientNeededServerqueryViewPower")
      @js.native
      def clientNeededServerqueryViewPower: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def clientNeededServerqueryViewPower_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientNeededServerqueryViewPower")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientNickname")
      @js.native
      def clientNickname: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientNicknamePhonetic")
      @js.native
      def clientNicknamePhonetic: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def clientNicknamePhonetic_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientNicknamePhonetic")(x.asInstanceOf[js.Any])
      
      inline def clientNickname_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientNickname")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientOriginServerId")
      @js.native
      def clientOriginServerId: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def clientOriginServerId_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientOriginServerId")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientOutputHardware")
      @js.native
      def clientOutputHardware: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseBoolean */ Any = js.native
      inline def clientOutputHardware_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseBoolean */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientOutputHardware")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientOutputMuted")
      @js.native
      def clientOutputMuted: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseBoolean */ Any = js.native
      inline def clientOutputMuted_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseBoolean */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientOutputMuted")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientOutputonlyMuted")
      @js.native
      def clientOutputonlyMuted: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def clientOutputonlyMuted_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientOutputonlyMuted")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientPlatform")
      @js.native
      def clientPlatform: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def clientPlatform_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientPlatform")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientSecurityHash")
      @js.native
      def clientSecurityHash: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def clientSecurityHash_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientSecurityHash")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientServergroups")
      @js.native
      def clientServergroups: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseStringArray */ Any = js.native
      inline def clientServergroups_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseStringArray */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientServergroups")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientSignedBadges")
      @js.native
      def clientSignedBadges: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def clientSignedBadges_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientSignedBadges")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientTalkPower")
      @js.native
      def clientTalkPower: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def clientTalkPower_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientTalkPower")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientTalkRequest")
      @js.native
      def clientTalkRequest: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseBoolean */ Any = js.native
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientTalkRequestMsg")
      @js.native
      def clientTalkRequestMsg: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def clientTalkRequestMsg_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientTalkRequestMsg")(x.asInstanceOf[js.Any])
      
      inline def clientTalkRequest_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseBoolean */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientTalkRequest")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientTotalBytesDownloaded")
      @js.native
      def clientTotalBytesDownloaded: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def clientTotalBytesDownloaded_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientTotalBytesDownloaded")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientTotalBytesUploaded")
      @js.native
      def clientTotalBytesUploaded: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def clientTotalBytesUploaded_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientTotalBytesUploaded")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientTotalconnections")
      @js.native
      def clientTotalconnections: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def clientTotalconnections_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientTotalconnections")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientType")
      @js.native
      def clientType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def clientType_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientType")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientUniqueIdentifier")
      @js.native
      def clientUniqueIdentifier: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def clientUniqueIdentifier_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientUniqueIdentifier")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientVersion")
      @js.native
      def clientVersion: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientVersionSign")
      @js.native
      def clientVersionSign: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def clientVersionSign_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientVersionSign")(x.asInstanceOf[js.Any])
      
      inline def clientVersion_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientVersion")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.clientftfid")
      @js.native
      def clientftfid: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def clientftfid_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientftfid")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.cluid")
      @js.native
      def cluid: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def cluid_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cluid")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.connectionBandwidthReceivedLastMinuteTotal")
      @js.native
      def connectionBandwidthReceivedLastMinuteTotal: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def connectionBandwidthReceivedLastMinuteTotal_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionBandwidthReceivedLastMinuteTotal")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.connectionBandwidthReceivedLastSecondTotal")
      @js.native
      def connectionBandwidthReceivedLastSecondTotal: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def connectionBandwidthReceivedLastSecondTotal_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionBandwidthReceivedLastSecondTotal")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.connectionBandwidthSentLastMinuteTotal")
      @js.native
      def connectionBandwidthSentLastMinuteTotal: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def connectionBandwidthSentLastMinuteTotal_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionBandwidthSentLastMinuteTotal")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.connectionBandwidthSentLastSecondTotal")
      @js.native
      def connectionBandwidthSentLastSecondTotal: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def connectionBandwidthSentLastSecondTotal_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionBandwidthSentLastSecondTotal")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.connectionBytesReceivedControl")
      @js.native
      def connectionBytesReceivedControl: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def connectionBytesReceivedControl_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionBytesReceivedControl")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.connectionBytesReceivedKeepalive")
      @js.native
      def connectionBytesReceivedKeepalive: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def connectionBytesReceivedKeepalive_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionBytesReceivedKeepalive")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.connectionBytesReceivedSpeech")
      @js.native
      def connectionBytesReceivedSpeech: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def connectionBytesReceivedSpeech_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionBytesReceivedSpeech")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.connectionBytesReceivedTotal")
      @js.native
      def connectionBytesReceivedTotal: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def connectionBytesReceivedTotal_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionBytesReceivedTotal")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.connectionBytesSentControl")
      @js.native
      def connectionBytesSentControl: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def connectionBytesSentControl_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionBytesSentControl")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.connectionBytesSentKeepalive")
      @js.native
      def connectionBytesSentKeepalive: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def connectionBytesSentKeepalive_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionBytesSentKeepalive")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.connectionBytesSentSpeech")
      @js.native
      def connectionBytesSentSpeech: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def connectionBytesSentSpeech_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionBytesSentSpeech")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.connectionBytesSentTotal")
      @js.native
      def connectionBytesSentTotal: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def connectionBytesSentTotal_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionBytesSentTotal")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.connectionClientIp")
      @js.native
      def connectionClientIp: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def connectionClientIp_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionClientIp")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.connectionConnectedTime")
      @js.native
      def connectionConnectedTime: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def connectionConnectedTime_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionConnectedTime")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.connectionFiletransferBandwidthReceived")
      @js.native
      def connectionFiletransferBandwidthReceived: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def connectionFiletransferBandwidthReceived_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionFiletransferBandwidthReceived")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.connectionFiletransferBandwidthSent")
      @js.native
      def connectionFiletransferBandwidthSent: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def connectionFiletransferBandwidthSent_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionFiletransferBandwidthSent")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.connectionFiletransferBytesReceivedTotal")
      @js.native
      def connectionFiletransferBytesReceivedTotal: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def connectionFiletransferBytesReceivedTotal_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionFiletransferBytesReceivedTotal")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.connectionFiletransferBytesSentTotal")
      @js.native
      def connectionFiletransferBytesSentTotal: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def connectionFiletransferBytesSentTotal_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionFiletransferBytesSentTotal")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.connectionPacketlossTotal")
      @js.native
      def connectionPacketlossTotal: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def connectionPacketlossTotal_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionPacketlossTotal")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.connectionPacketsReceivedControl")
      @js.native
      def connectionPacketsReceivedControl: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def connectionPacketsReceivedControl_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionPacketsReceivedControl")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.connectionPacketsReceivedKeepalive")
      @js.native
      def connectionPacketsReceivedKeepalive: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def connectionPacketsReceivedKeepalive_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionPacketsReceivedKeepalive")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.connectionPacketsReceivedSpeech")
      @js.native
      def connectionPacketsReceivedSpeech: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def connectionPacketsReceivedSpeech_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionPacketsReceivedSpeech")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.connectionPacketsReceivedTotal")
      @js.native
      def connectionPacketsReceivedTotal: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def connectionPacketsReceivedTotal_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionPacketsReceivedTotal")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.connectionPacketsSentControl")
      @js.native
      def connectionPacketsSentControl: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def connectionPacketsSentControl_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionPacketsSentControl")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.connectionPacketsSentKeepalive")
      @js.native
      def connectionPacketsSentKeepalive: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def connectionPacketsSentKeepalive_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionPacketsSentKeepalive")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.connectionPacketsSentSpeech")
      @js.native
      def connectionPacketsSentSpeech: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def connectionPacketsSentSpeech_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionPacketsSentSpeech")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.connectionPacketsSentTotal")
      @js.native
      def connectionPacketsSentTotal: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def connectionPacketsSentTotal_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionPacketsSentTotal")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.connectionPing")
      @js.native
      def connectionPing: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def connectionPing_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionPing")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.count")
      @js.native
      def count: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def count_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("count")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.cpid")
      @js.native
      def cpid: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def cpid_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cpid")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.created")
      @js.native
      def created: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.createdAt")
      @js.native
      def createdAt: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def createdAt_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(x.asInstanceOf[js.Any])
      
      inline def created_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("created")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.ctid")
      @js.native
      def ctid: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def ctid_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ctid")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.currentSpeed")
      @js.native
      def currentSpeed: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def currentSpeed_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentSpeed")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.datetime")
      @js.native
      def datetime: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def datetime_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("datetime")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.desc")
      @js.native
      def desc: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def desc_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("desc")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.duration")
      @js.native
      def duration: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def duration_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("duration")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.end")
      @js.native
      def end: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def end_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("end")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.enforcements")
      @js.native
      def enforcements: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def enforcements_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enforcements")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.expiresAt")
      @js.native
      def expiresAt: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def expiresAt_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expiresAt")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.extraMsg")
      @js.native
      def extraMsg: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def extraMsg_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extraMsg")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.failedPermid")
      @js.native
      def failedPermid: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def failedPermid_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("failedPermid")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.fcldbid")
      @js.native
      def fcldbid: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def fcldbid_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fcldbid")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.fileSize")
      @js.native
      def fileSize: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def fileSize_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fileSize")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.flagRead")
      @js.native
      def flagRead: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseBoolean */ Any = js.native
      inline def flagRead_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseBoolean */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flagRead")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.fname")
      @js.native
      def fname: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def fname_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fname")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.ftkey")
      @js.native
      def ftkey: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def ftkey_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ftkey")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.hash")
      @js.native
      def hash: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def hash_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hash")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.hostTimestampUtc")
      @js.native
      def hostTimestampUtc: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def hostTimestampUtc_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hostTimestampUtc")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.iconid")
      @js.native
      def iconid: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def iconid_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("iconid")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.id")
      @js.native
      def id: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.id1")
      @js.native
      def id1: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def id1_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id1")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.id2")
      @js.native
      def id2: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def id2_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id2")(x.asInstanceOf[js.Any])
      
      inline def id_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.ident")
      @js.native
      def ident: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def ident_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ident")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.instanceUptime")
      @js.native
      def instanceUptime: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def instanceUptime_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("instanceUptime")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.invokercldbid")
      @js.native
      def invokercldbid: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def invokercldbid_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invokercldbid")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.invokerid")
      @js.native
      def invokerid: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def invokerid_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invokerid")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.invokername")
      @js.native
      def invokername: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def invokername_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invokername")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.invokeruid")
      @js.native
      def invokeruid: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def invokeruid_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invokeruid")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.ip")
      @js.native
      def ip: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def ip_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ip")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.l")
      @js.native
      def l: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def l_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("l")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.lastPos")
      @js.native
      def lastPos: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def lastPos_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lastPos")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.lastnickname")
      @js.native
      def lastnickname: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def lastnickname_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lastnickname")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.message")
      @js.native
      def message: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def message_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("message")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.msg")
      @js.native
      def msg: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def msg_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("msg")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.msgid")
      @js.native
      def msgid: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def msgid_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("msgid")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.mytsid")
      @js.native
      def mytsid: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def mytsid_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mytsid")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.n")
      @js.native
      def n: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.nMemberAddp")
      @js.native
      def nMemberAddp: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def nMemberAddp_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nMemberAddp")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.nMemberRemovep")
      @js.native
      def nMemberRemovep: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def nMemberRemovep_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nMemberRemovep")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.nModifyp")
      @js.native
      def nModifyp: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def nModifyp_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nModifyp")(x.asInstanceOf[js.Any])
      
      inline def n_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("n")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.name")
      @js.native
      def name: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def name_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.namemode")
      @js.native
      def namemode: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def namemode_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("namemode")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.nickname")
      @js.native
      def nickname: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def nickname_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nickname")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.order")
      @js.native
      def order: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def order_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("order")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.p")
      @js.native
      def p: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def p_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("p")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.path")
      @js.native
      def path: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def path_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("path")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.permdesc")
      @js.native
      def permdesc: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def permdesc_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("permdesc")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.permid")
      @js.native
      def permid: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def permid_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("permid")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.permname")
      @js.native
      def permname: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def permname_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("permname")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.permnegated")
      @js.native
      def permnegated: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseBoolean */ Any = js.native
      inline def permnegated_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseBoolean */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("permnegated")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.permsid")
      @js.native
      def permsid: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def permsid_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("permsid")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.permskip")
      @js.native
      def permskip: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseBoolean */ Any = js.native
      inline def permskip_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseBoolean */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("permskip")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.permvalue")
      @js.native
      def permvalue: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def permvalue_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("permvalue")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.pid")
      @js.native
      def pid: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def pid_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pid")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.platform")
      @js.native
      def platform: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def platform_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("platform")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.port")
      @js.native
      def port: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def port_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("port")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.proto")
      @js.native
      def proto: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def proto_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("proto")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.pwClear")
      @js.native
      def pwClear: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def pwClear_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pwClear")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.reason")
      @js.native
      def reason: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def reason_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reason")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.reasonid")
      @js.native
      def reasonid: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def reasonid_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reasonid")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.reasonmsg")
      @js.native
      def reasonmsg: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def reasonmsg_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reasonmsg")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.runtime")
      @js.native
      def runtime: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def runtime_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("runtime")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.s")
      @js.native
      def s: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def s_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("s")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.salt")
      @js.native
      def salt: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def salt_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("salt")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.savedb")
      @js.native
      def savedb: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def savedb_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("savedb")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.scope")
      @js.native
      def scope: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def scope_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scope")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.secondsEmpty")
      @js.native
      def secondsEmpty: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def secondsEmpty_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secondsEmpty")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.sender")
      @js.native
      def sender: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def sender_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sender")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.serverId")
      @js.native
      def serverId: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def serverId_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serverId")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.serverftfid")
      @js.native
      def serverftfid: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def serverftfid_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serverftfid")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.serverinstanceDatabaseVersion")
      @js.native
      def serverinstanceDatabaseVersion: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def serverinstanceDatabaseVersion_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serverinstanceDatabaseVersion")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.serverinstanceFiletransferPort")
      @js.native
      def serverinstanceFiletransferPort: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def serverinstanceFiletransferPort_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serverinstanceFiletransferPort")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.serverinstanceGuestServerqueryGroup")
      @js.native
      def serverinstanceGuestServerqueryGroup: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def serverinstanceGuestServerqueryGroup_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serverinstanceGuestServerqueryGroup")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.serverinstanceMaxDownloadTotalBandwidth")
      @js.native
      def serverinstanceMaxDownloadTotalBandwidth: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def serverinstanceMaxDownloadTotalBandwidth_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serverinstanceMaxDownloadTotalBandwidth")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.serverinstanceMaxUploadTotalBandwidth")
      @js.native
      def serverinstanceMaxUploadTotalBandwidth: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def serverinstanceMaxUploadTotalBandwidth_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serverinstanceMaxUploadTotalBandwidth")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.serverinstancePendingConnectionsPerIp")
      @js.native
      def serverinstancePendingConnectionsPerIp: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def serverinstancePendingConnectionsPerIp_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serverinstancePendingConnectionsPerIp")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.serverinstancePermissionsVersion")
      @js.native
      def serverinstancePermissionsVersion: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def serverinstancePermissionsVersion_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serverinstancePermissionsVersion")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.serverinstanceServerqueryFloodBanTime")
      @js.native
      def serverinstanceServerqueryFloodBanTime: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def serverinstanceServerqueryFloodBanTime_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serverinstanceServerqueryFloodBanTime")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.serverinstanceServerqueryFloodCommands")
      @js.native
      def serverinstanceServerqueryFloodCommands: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def serverinstanceServerqueryFloodCommands_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serverinstanceServerqueryFloodCommands")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.serverinstanceServerqueryFloodTime")
      @js.native
      def serverinstanceServerqueryFloodTime: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def serverinstanceServerqueryFloodTime_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serverinstanceServerqueryFloodTime")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.serverinstanceServerqueryMaxConnectionsPerIp")
      @js.native
      def serverinstanceServerqueryMaxConnectionsPerIp: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def serverinstanceServerqueryMaxConnectionsPerIp_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serverinstanceServerqueryMaxConnectionsPerIp")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.serverinstanceTemplateChanneladminGroup")
      @js.native
      def serverinstanceTemplateChanneladminGroup: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def serverinstanceTemplateChanneladminGroup_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serverinstanceTemplateChanneladminGroup")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.serverinstanceTemplateChanneldefaultGroup")
      @js.native
      def serverinstanceTemplateChanneldefaultGroup: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def serverinstanceTemplateChanneldefaultGroup_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serverinstanceTemplateChanneldefaultGroup")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.serverinstanceTemplateServeradminGroup")
      @js.native
      def serverinstanceTemplateServeradminGroup: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def serverinstanceTemplateServeradminGroup_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serverinstanceTemplateServeradminGroup")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.serverinstanceTemplateServerdefaultGroup")
      @js.native
      def serverinstanceTemplateServerdefaultGroup: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def serverinstanceTemplateServerdefaultGroup_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serverinstanceTemplateServerdefaultGroup")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.sgid")
      @js.native
      def sgid: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def sgid_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sgid")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.sid")
      @js.native
      def sid: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def sid_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sid")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.size")
      @js.native
      def size: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def size_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.sizedone")
      @js.native
      def sizedone: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def sizedone_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sizedone")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.snapshot")
      @js.native
      def snapshot: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def snapshot_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("snapshot")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.sortid")
      @js.native
      def sortid: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def sortid_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sortid")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.start")
      @js.native
      def start: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def start_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("start")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.status")
      @js.native
      def status: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def status_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("status")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.subject")
      @js.native
      def subject: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def subject_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("subject")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.t")
      @js.native
      def t: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def t_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("t")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.target")
      @js.native
      def target: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def target_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("target")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.targetmode")
      @js.native
      def targetmode: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def targetmode_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("targetmode")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.tcid")
      @js.native
      def tcid: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def tcid_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tcid")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.tcldbid")
      @js.native
      def tcldbid: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def tcldbid_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tcldbid")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.timeLeft")
      @js.native
      def timeLeft: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def timeLeft_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeLeft")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.timestamp")
      @js.native
      def timestamp: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def timestamp_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.tname")
      @js.native
      def tname: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def tname_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tname")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.token")
      @js.native
      def token: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.token1")
      @js.native
      def token1: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def token1_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("token1")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.token2")
      @js.native
      def token2: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def token2_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("token2")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.tokenCreated")
      @js.native
      def tokenCreated: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def tokenCreated_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tokenCreated")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.tokenCustomset")
      @js.native
      def tokenCustomset_ : /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseRecursive */ Any = js.native
      
      inline def tokenCustomset__=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseRecursive */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tokenCustomset")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.tokenDescription")
      @js.native
      def tokenDescription: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def tokenDescription_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tokenDescription")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.tokenId1")
      @js.native
      def tokenId1: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def tokenId1_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tokenId1")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.tokenId2")
      @js.native
      def tokenId2: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def tokenId2_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tokenId2")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.tokenType")
      @js.native
      def tokenType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def tokenType_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tokenType")(x.asInstanceOf[js.Any])
      
      inline def token_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("token")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.tokencustomset")
      @js.native
      def tokencustomset: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseRecursive */ Any = js.native
      inline def tokencustomset_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseRecursive */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tokencustomset")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.totalClients")
      @js.native
      def totalClients: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.totalClientsFamily")
      @js.native
      def totalClientsFamily: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def totalClientsFamily_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("totalClientsFamily")(x.asInstanceOf[js.Any])
      
      inline def totalClients_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("totalClients")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.type")
      @js.native
      val `type`: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.uid")
      @js.native
      def uid: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def uid_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uid")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.v")
      @js.native
      def v: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def v_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.value")
      @js.native
      def value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def value_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.version")
      @js.native
      def version: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def version_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverAntifloodPointsNeededCommandBlock")
      @js.native
      def virtualserverAntifloodPointsNeededCommandBlock: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def virtualserverAntifloodPointsNeededCommandBlock_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverAntifloodPointsNeededCommandBlock")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverAntifloodPointsNeededIpBlock")
      @js.native
      def virtualserverAntifloodPointsNeededIpBlock: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def virtualserverAntifloodPointsNeededIpBlock_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverAntifloodPointsNeededIpBlock")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverAntifloodPointsNeededPluginBlock")
      @js.native
      def virtualserverAntifloodPointsNeededPluginBlock: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def virtualserverAntifloodPointsNeededPluginBlock_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverAntifloodPointsNeededPluginBlock")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverAntifloodPointsTickReduce")
      @js.native
      def virtualserverAntifloodPointsTickReduce: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def virtualserverAntifloodPointsTickReduce_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverAntifloodPointsTickReduce")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverAskForPrivilegekey")
      @js.native
      def virtualserverAskForPrivilegekey: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def virtualserverAskForPrivilegekey_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverAskForPrivilegekey")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverAutostart")
      @js.native
      def virtualserverAutostart: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def virtualserverAutostart_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverAutostart")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverChannelTempDeleteDelayDefault")
      @js.native
      def virtualserverChannelTempDeleteDelayDefault: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def virtualserverChannelTempDeleteDelayDefault_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverChannelTempDeleteDelayDefault")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverChannelsonline")
      @js.native
      def virtualserverChannelsonline: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def virtualserverChannelsonline_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverChannelsonline")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverClientConnections")
      @js.native
      def virtualserverClientConnections: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def virtualserverClientConnections_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverClientConnections")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverClientsonline")
      @js.native
      def virtualserverClientsonline: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def virtualserverClientsonline_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverClientsonline")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverCodecEncryptionMode")
      @js.native
      def virtualserverCodecEncryptionMode: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def virtualserverCodecEncryptionMode_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverCodecEncryptionMode")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverComplainAutobanCount")
      @js.native
      def virtualserverComplainAutobanCount: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def virtualserverComplainAutobanCount_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverComplainAutobanCount")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverComplainAutobanTime")
      @js.native
      def virtualserverComplainAutobanTime: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def virtualserverComplainAutobanTime_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverComplainAutobanTime")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverComplainRemoveTime")
      @js.native
      def virtualserverComplainRemoveTime: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def virtualserverComplainRemoveTime_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverComplainRemoveTime")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverCreated")
      @js.native
      def virtualserverCreated: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def virtualserverCreated_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverCreated")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverDefaultChannelAdminGroup")
      @js.native
      def virtualserverDefaultChannelAdminGroup: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def virtualserverDefaultChannelAdminGroup_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverDefaultChannelAdminGroup")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverDefaultChannelGroup")
      @js.native
      def virtualserverDefaultChannelGroup: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def virtualserverDefaultChannelGroup_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverDefaultChannelGroup")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverDefaultServerGroup")
      @js.native
      def virtualserverDefaultServerGroup: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def virtualserverDefaultServerGroup_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverDefaultServerGroup")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverDownloadQuota")
      @js.native
      def virtualserverDownloadQuota: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def virtualserverDownloadQuota_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverDownloadQuota")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverFilebase")
      @js.native
      def virtualserverFilebase: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def virtualserverFilebase_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverFilebase")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverFlagPassword")
      @js.native
      def virtualserverFlagPassword: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseBoolean */ Any = js.native
      inline def virtualserverFlagPassword_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseBoolean */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverFlagPassword")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverHostbannerGfxInterval")
      @js.native
      def virtualserverHostbannerGfxInterval: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def virtualserverHostbannerGfxInterval_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverHostbannerGfxInterval")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverHostbannerGfxUrl")
      @js.native
      def virtualserverHostbannerGfxUrl: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def virtualserverHostbannerGfxUrl_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverHostbannerGfxUrl")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverHostbannerMode")
      @js.native
      def virtualserverHostbannerMode: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def virtualserverHostbannerMode_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverHostbannerMode")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverHostbannerUrl")
      @js.native
      def virtualserverHostbannerUrl: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def virtualserverHostbannerUrl_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverHostbannerUrl")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverHostbuttonGfxUrl")
      @js.native
      def virtualserverHostbuttonGfxUrl: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def virtualserverHostbuttonGfxUrl_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverHostbuttonGfxUrl")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverHostbuttonTooltip")
      @js.native
      def virtualserverHostbuttonTooltip: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def virtualserverHostbuttonTooltip_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverHostbuttonTooltip")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverHostbuttonUrl")
      @js.native
      def virtualserverHostbuttonUrl: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def virtualserverHostbuttonUrl_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverHostbuttonUrl")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverHostmessage")
      @js.native
      def virtualserverHostmessage: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverHostmessageMode")
      @js.native
      def virtualserverHostmessageMode: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def virtualserverHostmessageMode_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverHostmessageMode")(x.asInstanceOf[js.Any])
      
      inline def virtualserverHostmessage_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverHostmessage")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverIconId")
      @js.native
      def virtualserverIconId: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def virtualserverIconId_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverIconId")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverId")
      @js.native
      def virtualserverId: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def virtualserverId_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverId")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverIp")
      @js.native
      def virtualserverIp: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseStringArray */ Any = js.native
      inline def virtualserverIp_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseStringArray */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverIp")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverLogChannel")
      @js.native
      def virtualserverLogChannel: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def virtualserverLogChannel_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverLogChannel")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverLogClient")
      @js.native
      def virtualserverLogClient: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def virtualserverLogClient_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverLogClient")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverLogFiletransfer")
      @js.native
      def virtualserverLogFiletransfer: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def virtualserverLogFiletransfer_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverLogFiletransfer")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverLogPermissions")
      @js.native
      def virtualserverLogPermissions: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def virtualserverLogPermissions_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverLogPermissions")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverLogQuery")
      @js.native
      def virtualserverLogQuery: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def virtualserverLogQuery_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverLogQuery")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverLogServer")
      @js.native
      def virtualserverLogServer: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def virtualserverLogServer_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverLogServer")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverMachineId")
      @js.native
      def virtualserverMachineId: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def virtualserverMachineId_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverMachineId")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverMaxDownloadTotalBandwidth")
      @js.native
      def virtualserverMaxDownloadTotalBandwidth: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def virtualserverMaxDownloadTotalBandwidth_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverMaxDownloadTotalBandwidth")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverMaxUploadTotalBandwidth")
      @js.native
      def virtualserverMaxUploadTotalBandwidth: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def virtualserverMaxUploadTotalBandwidth_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverMaxUploadTotalBandwidth")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverMaxclients")
      @js.native
      def virtualserverMaxclients: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def virtualserverMaxclients_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverMaxclients")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverMinAndroidVersion")
      @js.native
      def virtualserverMinAndroidVersion: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def virtualserverMinAndroidVersion_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverMinAndroidVersion")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverMinClientVersion")
      @js.native
      def virtualserverMinClientVersion: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def virtualserverMinClientVersion_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverMinClientVersion")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverMinClientsInChannelBeforeForcedSilence")
      @js.native
      def virtualserverMinClientsInChannelBeforeForcedSilence: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def virtualserverMinClientsInChannelBeforeForcedSilence_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverMinClientsInChannelBeforeForcedSilence")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverMinIosVersion")
      @js.native
      def virtualserverMinIosVersion: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def virtualserverMinIosVersion_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverMinIosVersion")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverMonthBytesDownloaded")
      @js.native
      def virtualserverMonthBytesDownloaded: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def virtualserverMonthBytesDownloaded_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverMonthBytesDownloaded")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverMonthBytesUploaded")
      @js.native
      def virtualserverMonthBytesUploaded: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def virtualserverMonthBytesUploaded_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverMonthBytesUploaded")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverName")
      @js.native
      def virtualserverName: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverNamePhonetic")
      @js.native
      def virtualserverNamePhonetic: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def virtualserverNamePhonetic_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverNamePhonetic")(x.asInstanceOf[js.Any])
      
      inline def virtualserverName_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverName")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverNeededIdentitySecurityLevel")
      @js.native
      def virtualserverNeededIdentitySecurityLevel: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def virtualserverNeededIdentitySecurityLevel_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverNeededIdentitySecurityLevel")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverNickname")
      @js.native
      def virtualserverNickname: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def virtualserverNickname_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverNickname")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverPassword")
      @js.native
      def virtualserverPassword: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def virtualserverPassword_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverPassword")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverPlatform")
      @js.native
      def virtualserverPlatform: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def virtualserverPlatform_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverPlatform")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverPort")
      @js.native
      def virtualserverPort: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def virtualserverPort_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverPort")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverPrioritySpeakerDimmModificator")
      @js.native
      def virtualserverPrioritySpeakerDimmModificator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def virtualserverPrioritySpeakerDimmModificator_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverPrioritySpeakerDimmModificator")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverQueryClientConnections")
      @js.native
      def virtualserverQueryClientConnections: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def virtualserverQueryClientConnections_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverQueryClientConnections")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverQueryclientsonline")
      @js.native
      def virtualserverQueryclientsonline: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def virtualserverQueryclientsonline_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverQueryclientsonline")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverReservedSlots")
      @js.native
      def virtualserverReservedSlots: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def virtualserverReservedSlots_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverReservedSlots")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverStatus")
      @js.native
      def virtualserverStatus: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def virtualserverStatus_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverStatus")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverTotalBytesDownloaded")
      @js.native
      def virtualserverTotalBytesDownloaded: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def virtualserverTotalBytesDownloaded_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverTotalBytesDownloaded")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverTotalBytesUploaded")
      @js.native
      def virtualserverTotalBytesUploaded: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def virtualserverTotalBytesUploaded_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverTotalBytesUploaded")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverTotalPacketlossControl")
      @js.native
      def virtualserverTotalPacketlossControl: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def virtualserverTotalPacketlossControl_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverTotalPacketlossControl")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverTotalPacketlossKeepalive")
      @js.native
      def virtualserverTotalPacketlossKeepalive: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def virtualserverTotalPacketlossKeepalive_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverTotalPacketlossKeepalive")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverTotalPacketlossSpeech")
      @js.native
      def virtualserverTotalPacketlossSpeech: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def virtualserverTotalPacketlossSpeech_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverTotalPacketlossSpeech")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverTotalPacketlossTotal")
      @js.native
      def virtualserverTotalPacketlossTotal: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def virtualserverTotalPacketlossTotal_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverTotalPacketlossTotal")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverTotalPing")
      @js.native
      def virtualserverTotalPing: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def virtualserverTotalPing_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverTotalPing")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverUniqueIdentifier")
      @js.native
      def virtualserverUniqueIdentifier: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def virtualserverUniqueIdentifier_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverUniqueIdentifier")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverUploadQuota")
      @js.native
      def virtualserverUploadQuota: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def virtualserverUploadQuota_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverUploadQuota")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverUptime")
      @js.native
      def virtualserverUptime: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def virtualserverUptime_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverUptime")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverVersion")
      @js.native
      def virtualserverVersion: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def virtualserverVersion_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverVersion")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverWeblistEnabled")
      @js.native
      def virtualserverWeblistEnabled: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def virtualserverWeblistEnabled_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverWeblistEnabled")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserverWelcomemessage")
      @js.native
      def virtualserverWelcomemessage: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any = js.native
      inline def virtualserverWelcomemessage_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseString */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserverWelcomemessage")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserversRunningTotal")
      @js.native
      def virtualserversRunningTotal: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def virtualserversRunningTotal_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserversRunningTotal")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserversTotalChannelsOnline")
      @js.native
      def virtualserversTotalChannelsOnline: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def virtualserversTotalChannelsOnline_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserversTotalChannelsOnline")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserversTotalClientsOnline")
      @js.native
      def virtualserversTotalClientsOnline: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def virtualserversTotalClientsOnline_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserversTotalClientsOnline")(x.asInstanceOf[js.Any])
      
      @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.Identifier.virtualserversTotalMaxclients")
      @js.native
      def virtualserversTotalMaxclients: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any = js.native
      inline def virtualserversTotalMaxclients_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Command.parseNumber */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualserversTotalMaxclients")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("ts3-nodejs-library/lib/transport/Command", "Command.SNAKE_CASE_IDENTIFIER")
    @js.native
    def SNAKE_CASE_IDENTIFIER: String = js.native
    inline def SNAKE_CASE_IDENTIFIER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SNAKE_CASE_IDENTIFIER")(x.asInstanceOf[js.Any])
    
    /**
      * Checks if a error has been received
      * @return The parsed String which is readable by the TeamSpeak Query
      */
    inline def build(command: Command): String = ^.asInstanceOf[js.Dynamic].applyDynamic("build")(command.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * the custom snapshot request parser
      * @param data snapshot string
      * @param cmd command object
      */
    inline def buildSnapshotDeploy(data: String, cmd: Command, param2: Version): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSnapshotDeploy")(data.asInstanceOf[js.Any], cmd.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def buildSnapshotDeploy(data: String, cmd: Command, param2: Version, snapshotVersion: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSnapshotDeploy")(data.asInstanceOf[js.Any], cmd.asInstanceOf[js.Any], param2.asInstanceOf[js.Any], snapshotVersion.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /** escapes a string */
    inline def escape(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escape")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * escapes a key value pair
      * @param {string} key the key used
      * @param {string|string[]} value the value or an array of values
      * @return the parsed String which is readable by the TeamSpeak Query
      */
    inline def escapeKeyValue(key: String, value: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("escapeKeyValue")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def escapeKeyValue(key: String, value: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("escapeKeyValue")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def escapeKeyValue(key: String, value: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("escapeKeyValue")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * retrieves the key value pair from a string
      * @param str the key value pair to unescape eg foo=bar
      */
    inline def getKeyValue(str: String): Key = ^.asInstanceOf[js.Dynamic].applyDynamic("getKeyValue")(str.asInstanceOf[js.Any]).asInstanceOf[Key]
    
    /**
      * retrieves the default parsers
      */
    inline def getParsers(): Parsers = ^.asInstanceOf[js.Dynamic].applyDynamic("getParsers")().asInstanceOf[Parsers]
    
    /**
      * checks if a version string has a minimum of x
      * @param minimum minimum the version string should have
      * @param version version string to compare
      */
    inline def minVersion(minimum: String, version: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("minVersion")(minimum.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * parses a query response
      * @param data the query response received
      */
    inline def parse(param0: PickParserArgumentraw): Response = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(param0.asInstanceOf[js.Any]).asInstanceOf[Response]
    
    /**
      * parses a number
      * @param value string to parse
      */
    inline def parseBoolean(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("parseBoolean")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * parses a number
      * @param value string to parse
      */
    inline def parseNumber(value: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parseNumber")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * parses a number array
      * @param value string to parse
      */
    inline def parseNumberArray(value: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseNumberArray")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
    
    inline def parseRecursive(value: String): Response = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRecursive")(value.asInstanceOf[js.Any]).asInstanceOf[Response]
    
    /**
      * parses a snapshot create request
      * @param param0 the custom snapshot response parser
      */
    inline def parseSnapshotCreate(param0: PickParserArgumentraw): Response = ^.asInstanceOf[js.Dynamic].applyDynamic("parseSnapshotCreate")(param0.asInstanceOf[js.Any]).asInstanceOf[Response]
    
    /**
      * parses a string value
      * @param value string to parse
      */
    inline def parseString(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseString")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * parses a string array
      * @param value string to parse
      */
    inline def parseStringArray(value: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseStringArray")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    /**
      * Parses a value to the type which the key represents
      * @param k the key which should get looked up
      * @param v the value which should get parsed
      */
    inline def parseValue(k: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseValue")(k.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def parseValue(k: String, v: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parseValue")(k.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /** converts a string to camel case */
    inline def toCamelCase(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toCamelCase")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /** converts a string to snake case */
    inline def toSnakeCase(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toSnakeCase")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /** unescapes a string */
    inline def unescape(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescape")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    trait ParserArgument extends StObject {
      
      var cmd: Instantiable
      
      var raw: String
    }
    object ParserArgument {
      
      inline def apply(cmd: Instantiable, raw: String): ParserArgument = {
        val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
        __obj.asInstanceOf[ParserArgument]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ParserArgument] (val x: Self) extends AnyVal {
        
        inline def setCmd(value: Instantiable): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
        
        inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      }
    }
    
    type ParserCallback = js.Function1[/* parser */ Parsers, Parsers]
    
    trait Parsers extends StObject {
      
      def request(cmd: Command): String
      @JSName("request")
      var request_Original: RequestParser
      
      def response(data: ParserArgument): Response
      @JSName("response")
      var response_Original: ResponseParser
    }
    object Parsers {
      
      inline def apply(request: /* cmd */ Command => String, response: /* data */ ParserArgument => Response): Parsers = {
        val __obj = js.Dynamic.literal(request = js.Any.fromFunction1(request), response = js.Any.fromFunction1(response))
        __obj.asInstanceOf[Parsers]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Parsers] (val x: Self) extends AnyVal {
        
        inline def setRequest(value: /* cmd */ Command => String): Self = StObject.set(x, "request", js.Any.fromFunction1(value))
        
        inline def setResponse(value: /* data */ ParserArgument => Response): Self = StObject.set(x, "response", js.Any.fromFunction1(value))
      }
    }
    
    type RequestParser = js.Function1[/* cmd */ Command, String]
    
    type ResponseParser = js.Function1[/* data */ ParserArgument, Response]
    
    type flags = js.Array[Double | String | Null]
    
    type multiOpts = js.Array[options]
    
    type options = Record[String, ValueTypes]
  }
}
