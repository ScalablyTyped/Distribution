package typings.twilio

import typings.twilio.libInterfacesMod.HttpMethod
import typings.twilio.libRestPreviewHostedNumbersAuthorizationDocumentDependentHostedNumberOrderMod.DependentHostedNumberOrderStatus
import typings.twilio.libRestPreviewHostedNumbersAuthorizationDocumentDependentHostedNumberOrderMod.DependentHostedNumberOrderVerificationType
import typings.twilio.libRestPreviewHostedNumbersAuthorizationDocumentMod.AuthorizationDocumentStatus
import typings.twilio.libRestPreviewHostedNumbersHostedNumberOrderMod.HostedNumberOrderStatus
import typings.twilio.libRestPreviewHostedNumbersHostedNumberOrderMod.HostedNumberOrderVerificationType
import typings.twilio.libRestPreviewSyncServiceSyncListSyncListItemMod.SyncListItemQueryFromBoundType
import typings.twilio.libRestPreviewSyncServiceSyncListSyncListItemMod.SyncListItemQueryResultOrder
import typings.twilio.libRestPreviewSyncServiceSyncMapSyncMapItemMod.SyncMapItemQueryFromBoundType
import typings.twilio.libRestPreviewSyncServiceSyncMapSyncMapItemMod.SyncMapItemQueryResultOrder
import typings.twilio.libRestPreviewUnderstandAssistantModelBuildMod.ModelBuildStatus
import typings.twilio.libTwimlFaxResponseMod.ReceiveMediaType
import typings.twilio.libTwimlFaxResponseMod.ReceivePageSize
import typings.twilio.libTwimlVoiceResponseMod.ApplicationEvent
import typings.twilio.libTwimlVoiceResponseMod.ClientEvent
import typings.twilio.libTwimlVoiceResponseMod.ConferenceBeep
import typings.twilio.libTwimlVoiceResponseMod.ConferenceEvent
import typings.twilio.libTwimlVoiceResponseMod.ConferenceJitterBufferSize
import typings.twilio.libTwimlVoiceResponseMod.ConferenceRecord
import typings.twilio.libTwimlVoiceResponseMod.ConferenceRecordingEvent
import typings.twilio.libTwimlVoiceResponseMod.ConferenceRegion
import typings.twilio.libTwimlVoiceResponseMod.ConferenceTrim
import typings.twilio.libTwimlVoiceResponseMod.ConversationEvent
import typings.twilio.libTwimlVoiceResponseMod.ConversationRecord
import typings.twilio.libTwimlVoiceResponseMod.ConversationRecordingEvent
import typings.twilio.libTwimlVoiceResponseMod.ConversationTrim
import typings.twilio.libTwimlVoiceResponseMod.DialRecord
import typings.twilio.libTwimlVoiceResponseMod.DialRecordingEvent
import typings.twilio.libTwimlVoiceResponseMod.DialRecordingTrack
import typings.twilio.libTwimlVoiceResponseMod.DialRingTone
import typings.twilio.libTwimlVoiceResponseMod.DialTrim
import typings.twilio.libTwimlVoiceResponseMod.GatherInput
import typings.twilio.libTwimlVoiceResponseMod.GatherLanguage
import typings.twilio.libTwimlVoiceResponseMod.GatherSpeechModel
import typings.twilio.libTwimlVoiceResponseMod.NumberEvent
import typings.twilio.libTwimlVoiceResponseMod.PayBankAccountType
import typings.twilio.libTwimlVoiceResponseMod.PayLanguage
import typings.twilio.libTwimlVoiceResponseMod.PayPaymentMethod
import typings.twilio.libTwimlVoiceResponseMod.PayStatusCallbackMethod
import typings.twilio.libTwimlVoiceResponseMod.PayTokenType
import typings.twilio.libTwimlVoiceResponseMod.PayValidCardTypes
import typings.twilio.libTwimlVoiceResponseMod.PromptCardType
import typings.twilio.libTwimlVoiceResponseMod.PromptErrorType
import typings.twilio.libTwimlVoiceResponseMod.PromptFor
import typings.twilio.libTwimlVoiceResponseMod.RecordRecordingEvent
import typings.twilio.libTwimlVoiceResponseMod.RecordTrim
import typings.twilio.libTwimlVoiceResponseMod.RejectReason
import typings.twilio.libTwimlVoiceResponseMod.SayLanguage
import typings.twilio.libTwimlVoiceResponseMod.SayVoice
import typings.twilio.libTwimlVoiceResponseMod.SipEvent
import typings.twilio.libTwimlVoiceResponseMod.SiprecTrack
import typings.twilio.libTwimlVoiceResponseMod.SsmlBreakStrength
import typings.twilio.libTwimlVoiceResponseMod.SsmlEmphasisLevel
import typings.twilio.libTwimlVoiceResponseMod.SsmlLangXmlLang
import typings.twilio.libTwimlVoiceResponseMod.SsmlPhonemeAlphabet
import typings.twilio.libTwimlVoiceResponseMod.SsmlSayAsFormat
import typings.twilio.libTwimlVoiceResponseMod.SsmlSayAsInterpretAs
import typings.twilio.libTwimlVoiceResponseMod.StreamStatusCallbackMethod
import typings.twilio.libTwimlVoiceResponseMod.StreamTrack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object twilioStrings {
  
  @js.native
  sealed trait default
    extends StObject
       with GatherSpeechModel
  inline def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait Asterisk extends StObject
  inline def Asterisk: Asterisk = "*".asInstanceOf[Asterisk]
  
  @js.native
  sealed trait GET
    extends StObject
       with PayStatusCallbackMethod
       with StreamStatusCallbackMethod
  inline def GET: GET = "GET".asInstanceOf[GET]
  
  @js.native
  sealed trait HS256 extends StObject
  inline def HS256: HS256 = "HS256".asInstanceOf[HS256]
  
  @js.native
  sealed trait HS384 extends StObject
  inline def HS384: HS384 = "HS384".asInstanceOf[HS384]
  
  @js.native
  sealed trait HS512 extends StObject
  inline def HS512: HS512 = "HS512".asInstanceOf[HS512]
  
  @js.native
  sealed trait POST
    extends StObject
       with PayStatusCallbackMethod
       with StreamStatusCallbackMethod
  inline def POST: POST = "POST".asInstanceOf[POST]
  
  @js.native
  sealed trait PollyDotAditi
    extends StObject
       with SayVoice
  inline def PollyDotAditi: PollyDotAditi = "Polly.Aditi".asInstanceOf[PollyDotAditi]
  
  @js.native
  sealed trait `PollyDotAdriano-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotAdriano-Neural`: `PollyDotAdriano-Neural` = "Polly.Adriano-Neural".asInstanceOf[`PollyDotAdriano-Neural`]
  
  @js.native
  sealed trait PollyDotAmy
    extends StObject
       with SayVoice
  inline def PollyDotAmy: PollyDotAmy = "Polly.Amy".asInstanceOf[PollyDotAmy]
  
  @js.native
  sealed trait `PollyDotAmy-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotAmy-Neural`: `PollyDotAmy-Neural` = "Polly.Amy-Neural".asInstanceOf[`PollyDotAmy-Neural`]
  
  @js.native
  sealed trait `PollyDotAndres-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotAndres-Neural`: `PollyDotAndres-Neural` = "Polly.Andres-Neural".asInstanceOf[`PollyDotAndres-Neural`]
  
  @js.native
  sealed trait `PollyDotAria-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotAria-Neural`: `PollyDotAria-Neural` = "Polly.Aria-Neural".asInstanceOf[`PollyDotAria-Neural`]
  
  @js.native
  sealed trait `PollyDotArlet-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotArlet-Neural`: `PollyDotArlet-Neural` = "Polly.Arlet-Neural".asInstanceOf[`PollyDotArlet-Neural`]
  
  @js.native
  sealed trait `PollyDotArthur-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotArthur-Neural`: `PollyDotArthur-Neural` = "Polly.Arthur-Neural".asInstanceOf[`PollyDotArthur-Neural`]
  
  @js.native
  sealed trait PollyDotAstrid
    extends StObject
       with SayVoice
  inline def PollyDotAstrid: PollyDotAstrid = "Polly.Astrid".asInstanceOf[PollyDotAstrid]
  
  @js.native
  sealed trait `PollyDotAyanda-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotAyanda-Neural`: `PollyDotAyanda-Neural` = "Polly.Ayanda-Neural".asInstanceOf[`PollyDotAyanda-Neural`]
  
  @js.native
  sealed trait PollyDotBianca
    extends StObject
       with SayVoice
  inline def PollyDotBianca: PollyDotBianca = "Polly.Bianca".asInstanceOf[PollyDotBianca]
  
  @js.native
  sealed trait `PollyDotBianca-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotBianca-Neural`: `PollyDotBianca-Neural` = "Polly.Bianca-Neural".asInstanceOf[`PollyDotBianca-Neural`]
  
  @js.native
  sealed trait PollyDotBrian
    extends StObject
       with SayVoice
  inline def PollyDotBrian: PollyDotBrian = "Polly.Brian".asInstanceOf[PollyDotBrian]
  
  @js.native
  sealed trait `PollyDotBrian-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotBrian-Neural`: `PollyDotBrian-Neural` = "Polly.Brian-Neural".asInstanceOf[`PollyDotBrian-Neural`]
  
  @js.native
  sealed trait PollyDotCamila
    extends StObject
       with SayVoice
  inline def PollyDotCamila: PollyDotCamila = "Polly.Camila".asInstanceOf[PollyDotCamila]
  
  @js.native
  sealed trait `PollyDotCamila-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotCamila-Neural`: `PollyDotCamila-Neural` = "Polly.Camila-Neural".asInstanceOf[`PollyDotCamila-Neural`]
  
  @js.native
  sealed trait PollyDotCarla
    extends StObject
       with SayVoice
  inline def PollyDotCarla: PollyDotCarla = "Polly.Carla".asInstanceOf[PollyDotCarla]
  
  @js.native
  sealed trait PollyDotCarmen
    extends StObject
       with SayVoice
  inline def PollyDotCarmen: PollyDotCarmen = "Polly.Carmen".asInstanceOf[PollyDotCarmen]
  
  @js.native
  sealed trait PollyDotCeline
    extends StObject
       with SayVoice
  inline def PollyDotCeline: PollyDotCeline = "Polly.Celine".asInstanceOf[PollyDotCeline]
  
  @js.native
  sealed trait PollyDotChantal
    extends StObject
       with SayVoice
  inline def PollyDotChantal: PollyDotChantal = "Polly.Chantal".asInstanceOf[PollyDotChantal]
  
  @js.native
  sealed trait PollyDotConchita
    extends StObject
       with SayVoice
  inline def PollyDotConchita: PollyDotConchita = "Polly.Conchita".asInstanceOf[PollyDotConchita]
  
  @js.native
  sealed trait PollyDotCristiano
    extends StObject
       with SayVoice
  inline def PollyDotCristiano: PollyDotCristiano = "Polly.Cristiano".asInstanceOf[PollyDotCristiano]
  
  @js.native
  sealed trait `PollyDotDaniel-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotDaniel-Neural`: `PollyDotDaniel-Neural` = "Polly.Daniel-Neural".asInstanceOf[`PollyDotDaniel-Neural`]
  
  @js.native
  sealed trait PollyDotDora
    extends StObject
       with SayVoice
  inline def PollyDotDora: PollyDotDora = "Polly.Dora".asInstanceOf[PollyDotDora]
  
  @js.native
  sealed trait `PollyDotElin-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotElin-Neural`: `PollyDotElin-Neural` = "Polly.Elin-Neural".asInstanceOf[`PollyDotElin-Neural`]
  
  @js.native
  sealed trait PollyDotEmma
    extends StObject
       with SayVoice
  inline def PollyDotEmma: PollyDotEmma = "Polly.Emma".asInstanceOf[PollyDotEmma]
  
  @js.native
  sealed trait `PollyDotEmma-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotEmma-Neural`: `PollyDotEmma-Neural` = "Polly.Emma-Neural".asInstanceOf[`PollyDotEmma-Neural`]
  
  @js.native
  sealed trait PollyDotEnrique
    extends StObject
       with SayVoice
  inline def PollyDotEnrique: PollyDotEnrique = "Polly.Enrique".asInstanceOf[PollyDotEnrique]
  
  @js.native
  sealed trait PollyDotEwa
    extends StObject
       with SayVoice
  inline def PollyDotEwa: PollyDotEwa = "Polly.Ewa".asInstanceOf[PollyDotEwa]
  
  @js.native
  sealed trait PollyDotFiliz
    extends StObject
       with SayVoice
  inline def PollyDotFiliz: PollyDotFiliz = "Polly.Filiz".asInstanceOf[PollyDotFiliz]
  
  @js.native
  sealed trait `PollyDotGabrielle-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotGabrielle-Neural`: `PollyDotGabrielle-Neural` = "Polly.Gabrielle-Neural".asInstanceOf[`PollyDotGabrielle-Neural`]
  
  @js.native
  sealed trait PollyDotGeraint
    extends StObject
       with SayVoice
  inline def PollyDotGeraint: PollyDotGeraint = "Polly.Geraint".asInstanceOf[PollyDotGeraint]
  
  @js.native
  sealed trait PollyDotGiorgio
    extends StObject
       with SayVoice
  inline def PollyDotGiorgio: PollyDotGiorgio = "Polly.Giorgio".asInstanceOf[PollyDotGiorgio]
  
  @js.native
  sealed trait PollyDotGwyneth
    extends StObject
       with SayVoice
  inline def PollyDotGwyneth: PollyDotGwyneth = "Polly.Gwyneth".asInstanceOf[PollyDotGwyneth]
  
  @js.native
  sealed trait `PollyDotHala-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotHala-Neural`: `PollyDotHala-Neural` = "Polly.Hala-Neural".asInstanceOf[`PollyDotHala-Neural`]
  
  @js.native
  sealed trait `PollyDotHannah-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotHannah-Neural`: `PollyDotHannah-Neural` = "Polly.Hannah-Neural".asInstanceOf[`PollyDotHannah-Neural`]
  
  @js.native
  sealed trait PollyDotHans
    extends StObject
       with SayVoice
  inline def PollyDotHans: PollyDotHans = "Polly.Hans".asInstanceOf[PollyDotHans]
  
  @js.native
  sealed trait `PollyDotHiujin-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotHiujin-Neural`: `PollyDotHiujin-Neural` = "Polly.Hiujin-Neural".asInstanceOf[`PollyDotHiujin-Neural`]
  
  @js.native
  sealed trait `PollyDotIda-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotIda-Neural`: `PollyDotIda-Neural` = "Polly.Ida-Neural".asInstanceOf[`PollyDotIda-Neural`]
  
  @js.native
  sealed trait PollyDotInes
    extends StObject
       with SayVoice
  inline def PollyDotInes: PollyDotInes = "Polly.Ines".asInstanceOf[PollyDotInes]
  
  @js.native
  sealed trait `PollyDotInes-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotInes-Neural`: `PollyDotInes-Neural` = "Polly.Ines-Neural".asInstanceOf[`PollyDotInes-Neural`]
  
  @js.native
  sealed trait PollyDotIvy
    extends StObject
       with SayVoice
  inline def PollyDotIvy: PollyDotIvy = "Polly.Ivy".asInstanceOf[PollyDotIvy]
  
  @js.native
  sealed trait `PollyDotIvy-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotIvy-Neural`: `PollyDotIvy-Neural` = "Polly.Ivy-Neural".asInstanceOf[`PollyDotIvy-Neural`]
  
  @js.native
  sealed trait PollyDotJacek
    extends StObject
       with SayVoice
  inline def PollyDotJacek: PollyDotJacek = "Polly.Jacek".asInstanceOf[PollyDotJacek]
  
  @js.native
  sealed trait PollyDotJan
    extends StObject
       with SayVoice
  inline def PollyDotJan: PollyDotJan = "Polly.Jan".asInstanceOf[PollyDotJan]
  
  @js.native
  sealed trait PollyDotJoanna
    extends StObject
       with SayVoice
  inline def PollyDotJoanna: PollyDotJoanna = "Polly.Joanna".asInstanceOf[PollyDotJoanna]
  
  @js.native
  sealed trait `PollyDotJoanna-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotJoanna-Neural`: `PollyDotJoanna-Neural` = "Polly.Joanna-Neural".asInstanceOf[`PollyDotJoanna-Neural`]
  
  @js.native
  sealed trait PollyDotJoey
    extends StObject
       with SayVoice
  inline def PollyDotJoey: PollyDotJoey = "Polly.Joey".asInstanceOf[PollyDotJoey]
  
  @js.native
  sealed trait `PollyDotJoey-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotJoey-Neural`: `PollyDotJoey-Neural` = "Polly.Joey-Neural".asInstanceOf[`PollyDotJoey-Neural`]
  
  @js.native
  sealed trait PollyDotJustin
    extends StObject
       with SayVoice
  inline def PollyDotJustin: PollyDotJustin = "Polly.Justin".asInstanceOf[PollyDotJustin]
  
  @js.native
  sealed trait `PollyDotJustin-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotJustin-Neural`: `PollyDotJustin-Neural` = "Polly.Justin-Neural".asInstanceOf[`PollyDotJustin-Neural`]
  
  @js.native
  sealed trait `PollyDotKajal-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotKajal-Neural`: `PollyDotKajal-Neural` = "Polly.Kajal-Neural".asInstanceOf[`PollyDotKajal-Neural`]
  
  @js.native
  sealed trait PollyDotKarl
    extends StObject
       with SayVoice
  inline def PollyDotKarl: PollyDotKarl = "Polly.Karl".asInstanceOf[PollyDotKarl]
  
  @js.native
  sealed trait `PollyDotKazuha-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotKazuha-Neural`: `PollyDotKazuha-Neural` = "Polly.Kazuha-Neural".asInstanceOf[`PollyDotKazuha-Neural`]
  
  @js.native
  sealed trait PollyDotKendra
    extends StObject
       with SayVoice
  inline def PollyDotKendra: PollyDotKendra = "Polly.Kendra".asInstanceOf[PollyDotKendra]
  
  @js.native
  sealed trait `PollyDotKendra-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotKendra-Neural`: `PollyDotKendra-Neural` = "Polly.Kendra-Neural".asInstanceOf[`PollyDotKendra-Neural`]
  
  @js.native
  sealed trait `PollyDotKevin-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotKevin-Neural`: `PollyDotKevin-Neural` = "Polly.Kevin-Neural".asInstanceOf[`PollyDotKevin-Neural`]
  
  @js.native
  sealed trait PollyDotKimberly
    extends StObject
       with SayVoice
  inline def PollyDotKimberly: PollyDotKimberly = "Polly.Kimberly".asInstanceOf[PollyDotKimberly]
  
  @js.native
  sealed trait `PollyDotKimberly-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotKimberly-Neural`: `PollyDotKimberly-Neural` = "Polly.Kimberly-Neural".asInstanceOf[`PollyDotKimberly-Neural`]
  
  @js.native
  sealed trait `PollyDotLaura-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotLaura-Neural`: `PollyDotLaura-Neural` = "Polly.Laura-Neural".asInstanceOf[`PollyDotLaura-Neural`]
  
  @js.native
  sealed trait PollyDotLea
    extends StObject
       with SayVoice
  inline def PollyDotLea: PollyDotLea = "Polly.Lea".asInstanceOf[PollyDotLea]
  
  @js.native
  sealed trait `PollyDotLea-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotLea-Neural`: `PollyDotLea-Neural` = "Polly.Lea-Neural".asInstanceOf[`PollyDotLea-Neural`]
  
  @js.native
  sealed trait `PollyDotLiam-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotLiam-Neural`: `PollyDotLiam-Neural` = "Polly.Liam-Neural".asInstanceOf[`PollyDotLiam-Neural`]
  
  @js.native
  sealed trait PollyDotLiv
    extends StObject
       with SayVoice
  inline def PollyDotLiv: PollyDotLiv = "Polly.Liv".asInstanceOf[PollyDotLiv]
  
  @js.native
  sealed trait PollyDotLotte
    extends StObject
       with SayVoice
  inline def PollyDotLotte: PollyDotLotte = "Polly.Lotte".asInstanceOf[PollyDotLotte]
  
  @js.native
  sealed trait PollyDotLucia
    extends StObject
       with SayVoice
  inline def PollyDotLucia: PollyDotLucia = "Polly.Lucia".asInstanceOf[PollyDotLucia]
  
  @js.native
  sealed trait `PollyDotLucia-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotLucia-Neural`: `PollyDotLucia-Neural` = "Polly.Lucia-Neural".asInstanceOf[`PollyDotLucia-Neural`]
  
  @js.native
  sealed trait PollyDotLupe
    extends StObject
       with SayVoice
  inline def PollyDotLupe: PollyDotLupe = "Polly.Lupe".asInstanceOf[PollyDotLupe]
  
  @js.native
  sealed trait `PollyDotLupe-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotLupe-Neural`: `PollyDotLupe-Neural` = "Polly.Lupe-Neural".asInstanceOf[`PollyDotLupe-Neural`]
  
  @js.native
  sealed trait PollyDotMads
    extends StObject
       with SayVoice
  inline def PollyDotMads: PollyDotMads = "Polly.Mads".asInstanceOf[PollyDotMads]
  
  @js.native
  sealed trait PollyDotMaja
    extends StObject
       with SayVoice
  inline def PollyDotMaja: PollyDotMaja = "Polly.Maja".asInstanceOf[PollyDotMaja]
  
  @js.native
  sealed trait PollyDotMarlene
    extends StObject
       with SayVoice
  inline def PollyDotMarlene: PollyDotMarlene = "Polly.Marlene".asInstanceOf[PollyDotMarlene]
  
  @js.native
  sealed trait PollyDotMathieu
    extends StObject
       with SayVoice
  inline def PollyDotMathieu: PollyDotMathieu = "Polly.Mathieu".asInstanceOf[PollyDotMathieu]
  
  @js.native
  sealed trait PollyDotMatthew
    extends StObject
       with SayVoice
  inline def PollyDotMatthew: PollyDotMatthew = "Polly.Matthew".asInstanceOf[PollyDotMatthew]
  
  @js.native
  sealed trait `PollyDotMatthew-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotMatthew-Neural`: `PollyDotMatthew-Neural` = "Polly.Matthew-Neural".asInstanceOf[`PollyDotMatthew-Neural`]
  
  @js.native
  sealed trait PollyDotMaxim
    extends StObject
       with SayVoice
  inline def PollyDotMaxim: PollyDotMaxim = "Polly.Maxim".asInstanceOf[PollyDotMaxim]
  
  @js.native
  sealed trait PollyDotMia
    extends StObject
       with SayVoice
  inline def PollyDotMia: PollyDotMia = "Polly.Mia".asInstanceOf[PollyDotMia]
  
  @js.native
  sealed trait `PollyDotMia-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotMia-Neural`: `PollyDotMia-Neural` = "Polly.Mia-Neural".asInstanceOf[`PollyDotMia-Neural`]
  
  @js.native
  sealed trait PollyDotMiguel
    extends StObject
       with SayVoice
  inline def PollyDotMiguel: PollyDotMiguel = "Polly.Miguel".asInstanceOf[PollyDotMiguel]
  
  @js.native
  sealed trait PollyDotMizuki
    extends StObject
       with SayVoice
  inline def PollyDotMizuki: PollyDotMizuki = "Polly.Mizuki".asInstanceOf[PollyDotMizuki]
  
  @js.native
  sealed trait PollyDotNaja
    extends StObject
       with SayVoice
  inline def PollyDotNaja: PollyDotNaja = "Polly.Naja".asInstanceOf[PollyDotNaja]
  
  @js.native
  sealed trait PollyDotNicole
    extends StObject
       with SayVoice
  inline def PollyDotNicole: PollyDotNicole = "Polly.Nicole".asInstanceOf[PollyDotNicole]
  
  @js.native
  sealed trait `PollyDotOla-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotOla-Neural`: `PollyDotOla-Neural` = "Polly.Ola-Neural".asInstanceOf[`PollyDotOla-Neural`]
  
  @js.native
  sealed trait `PollyDotOlivia-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotOlivia-Neural`: `PollyDotOlivia-Neural` = "Polly.Olivia-Neural".asInstanceOf[`PollyDotOlivia-Neural`]
  
  @js.native
  sealed trait `PollyDotPedro-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotPedro-Neural`: `PollyDotPedro-Neural` = "Polly.Pedro-Neural".asInstanceOf[`PollyDotPedro-Neural`]
  
  @js.native
  sealed trait PollyDotPenelope
    extends StObject
       with SayVoice
  inline def PollyDotPenelope: PollyDotPenelope = "Polly.Penelope".asInstanceOf[PollyDotPenelope]
  
  @js.native
  sealed trait PollyDotRaveena
    extends StObject
       with SayVoice
  inline def PollyDotRaveena: PollyDotRaveena = "Polly.Raveena".asInstanceOf[PollyDotRaveena]
  
  @js.native
  sealed trait `PollyDotRemi-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotRemi-Neural`: `PollyDotRemi-Neural` = "Polly.Remi-Neural".asInstanceOf[`PollyDotRemi-Neural`]
  
  @js.native
  sealed trait PollyDotRicardo
    extends StObject
       with SayVoice
  inline def PollyDotRicardo: PollyDotRicardo = "Polly.Ricardo".asInstanceOf[PollyDotRicardo]
  
  @js.native
  sealed trait PollyDotRuben
    extends StObject
       with SayVoice
  inline def PollyDotRuben: PollyDotRuben = "Polly.Ruben".asInstanceOf[PollyDotRuben]
  
  @js.native
  sealed trait PollyDotRussell
    extends StObject
       with SayVoice
  inline def PollyDotRussell: PollyDotRussell = "Polly.Russell".asInstanceOf[PollyDotRussell]
  
  @js.native
  sealed trait `PollyDotRuth-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotRuth-Neural`: `PollyDotRuth-Neural` = "Polly.Ruth-Neural".asInstanceOf[`PollyDotRuth-Neural`]
  
  @js.native
  sealed trait PollyDotSalli
    extends StObject
       with SayVoice
  inline def PollyDotSalli: PollyDotSalli = "Polly.Salli".asInstanceOf[PollyDotSalli]
  
  @js.native
  sealed trait `PollyDotSalli-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotSalli-Neural`: `PollyDotSalli-Neural` = "Polly.Salli-Neural".asInstanceOf[`PollyDotSalli-Neural`]
  
  @js.native
  sealed trait PollyDotSeoyeon
    extends StObject
       with SayVoice
  inline def PollyDotSeoyeon: PollyDotSeoyeon = "Polly.Seoyeon".asInstanceOf[PollyDotSeoyeon]
  
  @js.native
  sealed trait `PollyDotSeoyeon-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotSeoyeon-Neural`: `PollyDotSeoyeon-Neural` = "Polly.Seoyeon-Neural".asInstanceOf[`PollyDotSeoyeon-Neural`]
  
  @js.native
  sealed trait `PollyDotSergio-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotSergio-Neural`: `PollyDotSergio-Neural` = "Polly.Sergio-Neural".asInstanceOf[`PollyDotSergio-Neural`]
  
  @js.native
  sealed trait `PollyDotStephen-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotStephen-Neural`: `PollyDotStephen-Neural` = "Polly.Stephen-Neural".asInstanceOf[`PollyDotStephen-Neural`]
  
  @js.native
  sealed trait `PollyDotSuvi-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotSuvi-Neural`: `PollyDotSuvi-Neural` = "Polly.Suvi-Neural".asInstanceOf[`PollyDotSuvi-Neural`]
  
  @js.native
  sealed trait PollyDotTakumi
    extends StObject
       with SayVoice
  inline def PollyDotTakumi: PollyDotTakumi = "Polly.Takumi".asInstanceOf[PollyDotTakumi]
  
  @js.native
  sealed trait `PollyDotTakumi-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotTakumi-Neural`: `PollyDotTakumi-Neural` = "Polly.Takumi-Neural".asInstanceOf[`PollyDotTakumi-Neural`]
  
  @js.native
  sealed trait PollyDotTatyana
    extends StObject
       with SayVoice
  inline def PollyDotTatyana: PollyDotTatyana = "Polly.Tatyana".asInstanceOf[PollyDotTatyana]
  
  @js.native
  sealed trait `PollyDotThiago-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotThiago-Neural`: `PollyDotThiago-Neural` = "Polly.Thiago-Neural".asInstanceOf[`PollyDotThiago-Neural`]
  
  @js.native
  sealed trait `PollyDotTomoko-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotTomoko-Neural`: `PollyDotTomoko-Neural` = "Polly.Tomoko-Neural".asInstanceOf[`PollyDotTomoko-Neural`]
  
  @js.native
  sealed trait PollyDotVicki
    extends StObject
       with SayVoice
  inline def PollyDotVicki: PollyDotVicki = "Polly.Vicki".asInstanceOf[PollyDotVicki]
  
  @js.native
  sealed trait `PollyDotVicki-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotVicki-Neural`: `PollyDotVicki-Neural` = "Polly.Vicki-Neural".asInstanceOf[`PollyDotVicki-Neural`]
  
  @js.native
  sealed trait PollyDotVitoria
    extends StObject
       with SayVoice
  inline def PollyDotVitoria: PollyDotVitoria = "Polly.Vitoria".asInstanceOf[PollyDotVitoria]
  
  @js.native
  sealed trait `PollyDotVitoria-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotVitoria-Neural`: `PollyDotVitoria-Neural` = "Polly.Vitoria-Neural".asInstanceOf[`PollyDotVitoria-Neural`]
  
  @js.native
  sealed trait PollyDotZeina
    extends StObject
       with SayVoice
  inline def PollyDotZeina: PollyDotZeina = "Polly.Zeina".asInstanceOf[PollyDotZeina]
  
  @js.native
  sealed trait PollyDotZhiyu
    extends StObject
       with SayVoice
  inline def PollyDotZhiyu: PollyDotZhiyu = "Polly.Zhiyu".asInstanceOf[PollyDotZhiyu]
  
  @js.native
  sealed trait `PollyDotZhiyu-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotZhiyu-Neural`: `PollyDotZhiyu-Neural` = "Polly.Zhiyu-Neural".asInstanceOf[`PollyDotZhiyu-Neural`]
  
  @js.native
  sealed trait a4
    extends StObject
       with ReceivePageSize
  inline def a4: a4 = "a4".asInstanceOf[a4]
  
  @js.native
  sealed trait absent
    extends StObject
       with ConferenceRecordingEvent
       with ConversationRecordingEvent
       with DialRecordingEvent
       with RecordRecordingEvent
  inline def absent: absent = "absent".asInstanceOf[absent]
  
  @js.native
  sealed trait `ach-debit`
    extends StObject
       with PayPaymentMethod
  inline def `ach-debit`: `ach-debit` = "ach-debit".asInstanceOf[`ach-debit`]
  
  @js.native
  sealed trait `action-required`
    extends StObject
       with DependentHostedNumberOrderStatus
       with HostedNumberOrderStatus
  inline def `action-required`: `action-required` = "action-required".asInstanceOf[`action-required`]
  
  @js.native
  sealed trait address
    extends StObject
       with SsmlSayAsInterpretAs
  inline def address: address = "address".asInstanceOf[address]
  
  @js.native
  sealed trait `af-ZA`
    extends StObject
       with GatherLanguage
  inline def `af-ZA`: `af-ZA` = "af-ZA".asInstanceOf[`af-ZA`]
  
  @js.native
  sealed trait alice
    extends StObject
       with SayVoice
  inline def alice: alice = "alice".asInstanceOf[alice]
  
  @js.native
  sealed trait `am-ET`
    extends StObject
       with GatherLanguage
  inline def `am-ET`: `am-ET` = "am-ET".asInstanceOf[`am-ET`]
  
  @js.native
  sealed trait amex
    extends StObject
       with PayValidCardTypes
       with PromptCardType
  inline def amex: amex = "amex".asInstanceOf[amex]
  
  @js.native
  sealed trait announcement
    extends StObject
       with ConferenceEvent
  inline def announcement: announcement = "announcement".asInstanceOf[announcement]
  
  @js.native
  sealed trait answered
    extends StObject
       with ApplicationEvent
       with ClientEvent
       with NumberEvent
       with SipEvent
  inline def answered: answered = "answered".asInstanceOf[answered]
  
  @js.native
  sealed trait applicationSlashpdf
    extends StObject
       with ReceiveMediaType
  inline def applicationSlashpdf: applicationSlashpdf = "application/pdf".asInstanceOf[applicationSlashpdf]
  
  @js.native
  sealed trait `ar-AE`
    extends StObject
       with GatherLanguage
       with SsmlLangXmlLang
  inline def `ar-AE`: `ar-AE` = "ar-AE".asInstanceOf[`ar-AE`]
  
  @js.native
  sealed trait `ar-BH`
    extends StObject
       with GatherLanguage
  inline def `ar-BH`: `ar-BH` = "ar-BH".asInstanceOf[`ar-BH`]
  
  @js.native
  sealed trait `ar-DZ`
    extends StObject
       with GatherLanguage
  inline def `ar-DZ`: `ar-DZ` = "ar-DZ".asInstanceOf[`ar-DZ`]
  
  @js.native
  sealed trait `ar-EG`
    extends StObject
       with GatherLanguage
  inline def `ar-EG`: `ar-EG` = "ar-EG".asInstanceOf[`ar-EG`]
  
  @js.native
  sealed trait `ar-IL`
    extends StObject
       with GatherLanguage
  inline def `ar-IL`: `ar-IL` = "ar-IL".asInstanceOf[`ar-IL`]
  
  @js.native
  sealed trait `ar-IQ`
    extends StObject
       with GatherLanguage
  inline def `ar-IQ`: `ar-IQ` = "ar-IQ".asInstanceOf[`ar-IQ`]
  
  @js.native
  sealed trait `ar-JO`
    extends StObject
       with GatherLanguage
  inline def `ar-JO`: `ar-JO` = "ar-JO".asInstanceOf[`ar-JO`]
  
  @js.native
  sealed trait `ar-KW`
    extends StObject
       with GatherLanguage
  inline def `ar-KW`: `ar-KW` = "ar-KW".asInstanceOf[`ar-KW`]
  
  @js.native
  sealed trait `ar-LB`
    extends StObject
       with GatherLanguage
  inline def `ar-LB`: `ar-LB` = "ar-LB".asInstanceOf[`ar-LB`]
  
  @js.native
  sealed trait `ar-MA`
    extends StObject
       with GatherLanguage
  inline def `ar-MA`: `ar-MA` = "ar-MA".asInstanceOf[`ar-MA`]
  
  @js.native
  sealed trait `ar-OM`
    extends StObject
       with GatherLanguage
  inline def `ar-OM`: `ar-OM` = "ar-OM".asInstanceOf[`ar-OM`]
  
  @js.native
  sealed trait `ar-PS`
    extends StObject
       with GatherLanguage
  inline def `ar-PS`: `ar-PS` = "ar-PS".asInstanceOf[`ar-PS`]
  
  @js.native
  sealed trait `ar-QA`
    extends StObject
       with GatherLanguage
  inline def `ar-QA`: `ar-QA` = "ar-QA".asInstanceOf[`ar-QA`]
  
  @js.native
  sealed trait `ar-SA`
    extends StObject
       with GatherLanguage
  inline def `ar-SA`: `ar-SA` = "ar-SA".asInstanceOf[`ar-SA`]
  
  @js.native
  sealed trait `ar-TN`
    extends StObject
       with GatherLanguage
  inline def `ar-TN`: `ar-TN` = "ar-TN".asInstanceOf[`ar-TN`]
  
  @js.native
  sealed trait arb
    extends StObject
       with SayLanguage
       with SsmlLangXmlLang
  inline def arb: arb = "arb".asInstanceOf[arb]
  
  @js.native
  sealed trait asc
    extends StObject
       with SyncListItemQueryResultOrder
       with SyncMapItemQueryResultOrder
  inline def asc: asc = "asc".asInstanceOf[asc]
  
  @js.native
  sealed trait at
    extends StObject
       with DialRingTone
  inline def at: at = "at".asInstanceOf[at]
  
  @js.native
  sealed trait au
    extends StObject
       with DialRingTone
  inline def au: au = "au".asInstanceOf[au]
  
  @js.native
  sealed trait au1
    extends StObject
       with ConferenceRegion
  inline def au1: au1 = "au1".asInstanceOf[au1]
  
  @js.native
  sealed trait `az-AZ`
    extends StObject
       with GatherLanguage
  inline def `az-AZ`: `az-AZ` = "az-AZ".asInstanceOf[`az-AZ`]
  
  @js.native
  sealed trait `bank-account-number`
    extends StObject
       with PromptFor
  inline def `bank-account-number`: `bank-account-number` = "bank-account-number".asInstanceOf[`bank-account-number`]
  
  @js.native
  sealed trait `bank-routing-number`
    extends StObject
       with PromptFor
  inline def `bank-routing-number`: `bank-routing-number` = "bank-routing-number".asInstanceOf[`bank-routing-number`]
  
  @js.native
  sealed trait be
    extends StObject
       with DialRingTone
  inline def be: be = "be".asInstanceOf[be]
  
  @js.native
  sealed trait bg
    extends StObject
       with DialRingTone
  inline def bg: bg = "bg".asInstanceOf[bg]
  
  @js.native
  sealed trait `bg-BG`
    extends StObject
       with GatherLanguage
  inline def `bg-BG`: `bg-BG` = "bg-BG".asInstanceOf[`bg-BG`]
  
  @js.native
  sealed trait `bn-BD`
    extends StObject
       with GatherLanguage
  inline def `bn-BD`: `bn-BD` = "bn-BD".asInstanceOf[`bn-BD`]
  
  @js.native
  sealed trait `bn-IN`
    extends StObject
       with GatherLanguage
  inline def `bn-IN`: `bn-IN` = "bn-IN".asInstanceOf[`bn-IN`]
  
  @js.native
  sealed trait both
    extends StObject
       with DialRecordingTrack
  inline def both: both = "both".asInstanceOf[both]
  
  @js.native
  sealed trait both_tracks
    extends StObject
       with SiprecTrack
       with StreamTrack
  inline def both_tracks: both_tracks = "both_tracks".asInstanceOf[both_tracks]
  
  @js.native
  sealed trait br
    extends StObject
       with DialRingTone
  inline def br: br = "br".asInstanceOf[br]
  
  @js.native
  sealed trait br1
    extends StObject
       with ConferenceRegion
  inline def br1: br1 = "br1".asInstanceOf[br1]
  
  @js.native
  sealed trait building
    extends StObject
       with ModelBuildStatus
  inline def building: building = "building".asInstanceOf[building]
  
  @js.native
  sealed trait busy
    extends StObject
       with RejectReason
  inline def busy: busy = "busy".asInstanceOf[busy]
  
  @js.native
  sealed trait `ca-ES`
    extends StObject
       with GatherLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `ca-ES`: `ca-ES` = "ca-ES".asInstanceOf[`ca-ES`]
  
  @js.native
  sealed trait `call-answered`
    extends StObject
       with ConversationEvent
  inline def `call-answered`: `call-answered` = "call-answered".asInstanceOf[`call-answered`]
  
  @js.native
  sealed trait `call-completed`
    extends StObject
       with ConversationEvent
  inline def `call-completed`: `call-completed` = "call-completed".asInstanceOf[`call-completed`]
  
  @js.native
  sealed trait `call-initiated`
    extends StObject
       with ConversationEvent
  inline def `call-initiated`: `call-initiated` = "call-initiated".asInstanceOf[`call-initiated`]
  
  @js.native
  sealed trait `call-ringing`
    extends StObject
       with ConversationEvent
  inline def `call-ringing`: `call-ringing` = "call-ringing".asInstanceOf[`call-ringing`]
  
  @js.native
  sealed trait canceled
    extends StObject
       with AuthorizationDocumentStatus
       with ModelBuildStatus
  inline def canceled: canceled = "canceled".asInstanceOf[canceled]
  
  @js.native
  sealed trait cardinal
    extends StObject
       with SsmlSayAsInterpretAs
  inline def cardinal: cardinal = "cardinal".asInstanceOf[cardinal]
  
  @js.native
  sealed trait `carrier-processing`
    extends StObject
       with DependentHostedNumberOrderStatus
       with HostedNumberOrderStatus
  inline def `carrier-processing`: `carrier-processing` = "carrier-processing".asInstanceOf[`carrier-processing`]
  
  @js.native
  sealed trait ch
    extends StObject
       with DialRingTone
  inline def ch: ch = "ch".asInstanceOf[ch]
  
  @js.native
  sealed trait characters
    extends StObject
       with SsmlSayAsInterpretAs
  inline def characters: characters = "characters".asInstanceOf[characters]
  
  @js.native
  sealed trait chat extends StObject
  inline def chat: chat = "chat".asInstanceOf[chat]
  
  @js.native
  sealed trait cl
    extends StObject
       with DialRingTone
  inline def cl: cl = "cl".asInstanceOf[cl]
  
  @js.native
  sealed trait `cmn-CN`
    extends StObject
       with SsmlLangXmlLang
  inline def `cmn-CN`: `cmn-CN` = "cmn-CN".asInstanceOf[`cmn-CN`]
  
  @js.native
  sealed trait `cmn-Hans-CN`
    extends StObject
       with GatherLanguage
  inline def `cmn-Hans-CN`: `cmn-Hans-CN` = "cmn-Hans-CN".asInstanceOf[`cmn-Hans-CN`]
  
  @js.native
  sealed trait `cmn-Hant-TW`
    extends StObject
       with GatherLanguage
  inline def `cmn-Hant-TW`: `cmn-Hant-TW` = "cmn-Hant-TW".asInstanceOf[`cmn-Hant-TW`]
  
  @js.native
  sealed trait cn
    extends StObject
       with DialRingTone
  inline def cn: cn = "cn".asInstanceOf[cn]
  
  @js.native
  sealed trait `commercial-checking`
    extends StObject
       with PayBankAccountType
  inline def `commercial-checking`: `commercial-checking` = "commercial-checking".asInstanceOf[`commercial-checking`]
  
  @js.native
  sealed trait `commercial-savings`
    extends StObject
       with PayBankAccountType
  inline def `commercial-savings`: `commercial-savings` = "commercial-savings".asInstanceOf[`commercial-savings`]
  
  @js.native
  sealed trait completed
    extends StObject
       with ApplicationEvent
       with ClientEvent
       with ConferenceRecordingEvent
       with ConversationRecordingEvent
       with DependentHostedNumberOrderStatus
       with DialRecordingEvent
       with HostedNumberOrderStatus
       with ModelBuildStatus
       with NumberEvent
       with RecordRecordingEvent
       with SipEvent
  inline def completed: completed = "completed".asInstanceOf[completed]
  
  @js.native
  sealed trait `consumer-checking`
    extends StObject
       with PayBankAccountType
  inline def `consumer-checking`: `consumer-checking` = "consumer-checking".asInstanceOf[`consumer-checking`]
  
  @js.native
  sealed trait `consumer-savings`
    extends StObject
       with PayBankAccountType
  inline def `consumer-savings`: `consumer-savings` = "consumer-savings".asInstanceOf[`consumer-savings`]
  
  @js.native
  sealed trait `credit-card`
    extends StObject
       with PayPaymentMethod
  inline def `credit-card`: `credit-card` = "credit-card".asInstanceOf[`credit-card`]
  
  @js.native
  sealed trait `cs-CZ`
    extends StObject
       with GatherLanguage
  inline def `cs-CZ`: `cs-CZ` = "cs-CZ".asInstanceOf[`cs-CZ`]
  
  @js.native
  sealed trait `cy-GB`
    extends StObject
       with SayLanguage
       with SsmlLangXmlLang
  inline def `cy-GB`: `cy-GB` = "cy-GB".asInstanceOf[`cy-GB`]
  
  @js.native
  sealed trait cz
    extends StObject
       with DialRingTone
  inline def cz: cz = "cz".asInstanceOf[cz]
  
  @js.native
  sealed trait d
    extends StObject
       with SsmlSayAsFormat
  inline def d: d = "d".asInstanceOf[d]
  
  @js.native
  sealed trait `da-DK`
    extends StObject
       with GatherLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `da-DK`: `da-DK` = "da-DK".asInstanceOf[`da-DK`]
  
  @js.native
  sealed trait data_sync extends StObject
  inline def data_sync: data_sync = "data_sync".asInstanceOf[data_sync]
  
  @js.native
  sealed trait date
    extends StObject
       with SsmlSayAsInterpretAs
  inline def date: date = "date".asInstanceOf[date]
  
  @js.native
  sealed trait de
    extends StObject
       with DialRingTone
  inline def de: de = "de".asInstanceOf[de]
  
  @js.native
  sealed trait `de-AT`
    extends StObject
       with SayLanguage
       with SsmlLangXmlLang
  inline def `de-AT`: `de-AT` = "de-AT".asInstanceOf[`de-AT`]
  
  @js.native
  sealed trait `de-DE`
    extends StObject
       with GatherLanguage
       with PayLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `de-DE`: `de-DE` = "de-DE".asInstanceOf[`de-DE`]
  
  @js.native
  sealed trait de1
    extends StObject
       with ConferenceRegion
  inline def de1: de1 = "de1".asInstanceOf[de1]
  
  @js.native
  sealed trait delete
    extends StObject
       with HttpMethod
  inline def delete: delete = "delete".asInstanceOf[delete]
  
  @js.native
  sealed trait desc
    extends StObject
       with SyncListItemQueryResultOrder
       with SyncMapItemQueryResultOrder
  inline def desc: desc = "desc".asInstanceOf[desc]
  
  @js.native
  sealed trait digits
    extends StObject
       with SsmlSayAsInterpretAs
  inline def digits: digits = "digits".asInstanceOf[digits]
  
  @js.native
  sealed trait `diners-club`
    extends StObject
       with PayValidCardTypes
       with PromptCardType
  inline def `diners-club`: `diners-club` = "diners-club".asInstanceOf[`diners-club`]
  
  @js.native
  sealed trait discover
    extends StObject
       with PayValidCardTypes
       with PromptCardType
  inline def discover: discover = "discover".asInstanceOf[discover]
  
  @js.native
  sealed trait dk
    extends StObject
       with DialRingTone
  inline def dk: dk = "dk".asInstanceOf[dk]
  
  @js.native
  sealed trait dm
    extends StObject
       with SsmlSayAsFormat
  inline def dm: dm = "dm".asInstanceOf[dm]
  
  @js.native
  sealed trait dmy
    extends StObject
       with SsmlSayAsFormat
  inline def dmy: dmy = "dmy".asInstanceOf[dmy]
  
  @js.native
  sealed trait `do-not-record`
    extends StObject
       with ConferenceRecord
       with ConversationRecord
       with DialRecord
  inline def `do-not-record`: `do-not-record` = "do-not-record".asInstanceOf[`do-not-record`]
  
  @js.native
  sealed trait `do-not-trim`
    extends StObject
       with ConferenceTrim
       with ConversationTrim
       with DialTrim
       with RecordTrim
  inline def `do-not-trim`: `do-not-trim` = "do-not-trim".asInstanceOf[`do-not-trim`]
  
  @js.native
  sealed trait dtmf
    extends StObject
       with GatherInput
  inline def dtmf: dtmf = "dtmf".asInstanceOf[dtmf]
  
  @js.native
  sealed trait ee
    extends StObject
       with DialRingTone
  inline def ee: ee = "ee".asInstanceOf[ee]
  
  @js.native
  sealed trait `el-GR`
    extends StObject
       with GatherLanguage
  inline def `el-GR`: `el-GR` = "el-GR".asInstanceOf[`el-GR`]
  
  @js.native
  sealed trait `en-AU`
    extends StObject
       with GatherLanguage
       with PayLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `en-AU`: `en-AU` = "en-AU".asInstanceOf[`en-AU`]
  
  @js.native
  sealed trait `en-CA`
    extends StObject
       with GatherLanguage
       with PayLanguage
       with SayLanguage
  inline def `en-CA`: `en-CA` = "en-CA".asInstanceOf[`en-CA`]
  
  @js.native
  sealed trait `en-GB`
    extends StObject
       with GatherLanguage
       with PayLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `en-GB`: `en-GB` = "en-GB".asInstanceOf[`en-GB`]
  
  @js.native
  sealed trait `en-GB-WLS`
    extends StObject
       with SayLanguage
       with SsmlLangXmlLang
  inline def `en-GB-WLS`: `en-GB-WLS` = "en-GB-WLS".asInstanceOf[`en-GB-WLS`]
  
  @js.native
  sealed trait `en-GH`
    extends StObject
       with GatherLanguage
  inline def `en-GH`: `en-GH` = "en-GH".asInstanceOf[`en-GH`]
  
  @js.native
  sealed trait `en-IE`
    extends StObject
       with GatherLanguage
       with PayLanguage
  inline def `en-IE`: `en-IE` = "en-IE".asInstanceOf[`en-IE`]
  
  @js.native
  sealed trait `en-IN`
    extends StObject
       with GatherLanguage
       with PayLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `en-IN`: `en-IN` = "en-IN".asInstanceOf[`en-IN`]
  
  @js.native
  sealed trait `en-KE`
    extends StObject
       with GatherLanguage
  inline def `en-KE`: `en-KE` = "en-KE".asInstanceOf[`en-KE`]
  
  @js.native
  sealed trait `en-NG`
    extends StObject
       with GatherLanguage
  inline def `en-NG`: `en-NG` = "en-NG".asInstanceOf[`en-NG`]
  
  @js.native
  sealed trait `en-NZ`
    extends StObject
       with GatherLanguage
       with PayLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `en-NZ`: `en-NZ` = "en-NZ".asInstanceOf[`en-NZ`]
  
  @js.native
  sealed trait `en-PH`
    extends StObject
       with GatherLanguage
       with PayLanguage
  inline def `en-PH`: `en-PH` = "en-PH".asInstanceOf[`en-PH`]
  
  @js.native
  sealed trait `en-SG`
    extends StObject
       with GatherLanguage
  inline def `en-SG`: `en-SG` = "en-SG".asInstanceOf[`en-SG`]
  
  @js.native
  sealed trait `en-TZ`
    extends StObject
       with GatherLanguage
  inline def `en-TZ`: `en-TZ` = "en-TZ".asInstanceOf[`en-TZ`]
  
  @js.native
  sealed trait `en-US`
    extends StObject
       with GatherLanguage
       with PayLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `en-US`: `en-US` = "en-US".asInstanceOf[`en-US`]
  
  @js.native
  sealed trait `en-ZA`
    extends StObject
       with GatherLanguage
       with PayLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `en-ZA`: `en-ZA` = "en-ZA".asInstanceOf[`en-ZA`]
  
  @js.native
  sealed trait end
    extends StObject
       with ConferenceEvent
  inline def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait enqueued
    extends StObject
       with ModelBuildStatus
  inline def enqueued: enqueued = "enqueued".asInstanceOf[enqueued]
  
  @js.native
  sealed trait enroute
    extends StObject
       with PayValidCardTypes
       with PromptCardType
  inline def enroute: enroute = "enroute".asInstanceOf[enroute]
  
  @js.native
  sealed trait es
    extends StObject
       with DialRingTone
  inline def es: es = "es".asInstanceOf[es]
  
  @js.native
  sealed trait `es-AR`
    extends StObject
       with GatherLanguage
  inline def `es-AR`: `es-AR` = "es-AR".asInstanceOf[`es-AR`]
  
  @js.native
  sealed trait `es-BO`
    extends StObject
       with GatherLanguage
  inline def `es-BO`: `es-BO` = "es-BO".asInstanceOf[`es-BO`]
  
  @js.native
  sealed trait `es-CL`
    extends StObject
       with GatherLanguage
  inline def `es-CL`: `es-CL` = "es-CL".asInstanceOf[`es-CL`]
  
  @js.native
  sealed trait `es-CO`
    extends StObject
       with GatherLanguage
  inline def `es-CO`: `es-CO` = "es-CO".asInstanceOf[`es-CO`]
  
  @js.native
  sealed trait `es-CR`
    extends StObject
       with GatherLanguage
  inline def `es-CR`: `es-CR` = "es-CR".asInstanceOf[`es-CR`]
  
  @js.native
  sealed trait `es-DO`
    extends StObject
       with GatherLanguage
  inline def `es-DO`: `es-DO` = "es-DO".asInstanceOf[`es-DO`]
  
  @js.native
  sealed trait `es-EC`
    extends StObject
       with GatherLanguage
  inline def `es-EC`: `es-EC` = "es-EC".asInstanceOf[`es-EC`]
  
  @js.native
  sealed trait `es-ES`
    extends StObject
       with GatherLanguage
       with PayLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `es-ES`: `es-ES` = "es-ES".asInstanceOf[`es-ES`]
  
  @js.native
  sealed trait `es-GT`
    extends StObject
       with GatherLanguage
  inline def `es-GT`: `es-GT` = "es-GT".asInstanceOf[`es-GT`]
  
  @js.native
  sealed trait `es-HN`
    extends StObject
       with GatherLanguage
  inline def `es-HN`: `es-HN` = "es-HN".asInstanceOf[`es-HN`]
  
  @js.native
  sealed trait `es-MX`
    extends StObject
       with GatherLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `es-MX`: `es-MX` = "es-MX".asInstanceOf[`es-MX`]
  
  @js.native
  sealed trait `es-NI`
    extends StObject
       with GatherLanguage
  inline def `es-NI`: `es-NI` = "es-NI".asInstanceOf[`es-NI`]
  
  @js.native
  sealed trait `es-PA`
    extends StObject
       with GatherLanguage
  inline def `es-PA`: `es-PA` = "es-PA".asInstanceOf[`es-PA`]
  
  @js.native
  sealed trait `es-PE`
    extends StObject
       with GatherLanguage
  inline def `es-PE`: `es-PE` = "es-PE".asInstanceOf[`es-PE`]
  
  @js.native
  sealed trait `es-PR`
    extends StObject
       with GatherLanguage
  inline def `es-PR`: `es-PR` = "es-PR".asInstanceOf[`es-PR`]
  
  @js.native
  sealed trait `es-PY`
    extends StObject
       with GatherLanguage
  inline def `es-PY`: `es-PY` = "es-PY".asInstanceOf[`es-PY`]
  
  @js.native
  sealed trait `es-SV`
    extends StObject
       with GatherLanguage
  inline def `es-SV`: `es-SV` = "es-SV".asInstanceOf[`es-SV`]
  
  @js.native
  sealed trait `es-US`
    extends StObject
       with GatherLanguage
       with PayLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `es-US`: `es-US` = "es-US".asInstanceOf[`es-US`]
  
  @js.native
  sealed trait `es-UY`
    extends StObject
       with GatherLanguage
  inline def `es-UY`: `es-UY` = "es-UY".asInstanceOf[`es-UY`]
  
  @js.native
  sealed trait `es-VE`
    extends StObject
       with GatherLanguage
  inline def `es-VE`: `es-VE` = "es-VE".asInstanceOf[`es-VE`]
  
  @js.native
  sealed trait `et-EE`
    extends StObject
       with GatherLanguage
  inline def `et-EE`: `et-EE` = "et-EE".asInstanceOf[`et-EE`]
  
  @js.native
  sealed trait `eu-ES`
    extends StObject
       with GatherLanguage
  inline def `eu-ES`: `eu-ES` = "eu-ES".asInstanceOf[`eu-ES`]
  
  @js.native
  sealed trait exclusive
    extends StObject
       with SyncListItemQueryFromBoundType
       with SyncMapItemQueryFromBoundType
  inline def exclusive: exclusive = "exclusive".asInstanceOf[exclusive]
  
  @js.native
  sealed trait experimental_conversations
    extends StObject
       with GatherSpeechModel
  inline def experimental_conversations: experimental_conversations = "experimental_conversations".asInstanceOf[experimental_conversations]
  
  @js.native
  sealed trait experimental_utterances
    extends StObject
       with GatherSpeechModel
  inline def experimental_utterances: experimental_utterances = "experimental_utterances".asInstanceOf[experimental_utterances]
  
  @js.native
  sealed trait `expiration-date`
    extends StObject
       with PromptFor
  inline def `expiration-date`: `expiration-date` = "expiration-date".asInstanceOf[`expiration-date`]
  
  @js.native
  sealed trait expletive
    extends StObject
       with SsmlSayAsInterpretAs
  inline def expletive: expletive = "expletive".asInstanceOf[expletive]
  
  @js.native
  sealed trait `fa-IR`
    extends StObject
       with GatherLanguage
  inline def `fa-IR`: `fa-IR` = "fa-IR".asInstanceOf[`fa-IR`]
  
  @js.native
  sealed trait failed
    extends StObject
       with AuthorizationDocumentStatus
       with DependentHostedNumberOrderStatus
       with HostedNumberOrderStatus
       with ModelBuildStatus
  inline def failed: failed = "failed".asInstanceOf[failed]
  
  @js.native
  sealed trait `false`
    extends StObject
       with ConferenceBeep
       with ConversationRecord
  inline def `false`: `false` = "false".asInstanceOf[`false`]
  
  @js.native
  sealed trait fi
    extends StObject
       with DialRingTone
  inline def fi: fi = "fi".asInstanceOf[fi]
  
  @js.native
  sealed trait `fi-FI`
    extends StObject
       with GatherLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `fi-FI`: `fi-FI` = "fi-FI".asInstanceOf[`fi-FI`]
  
  @js.native
  sealed trait fifo extends StObject
  inline def fifo: fifo = "fifo".asInstanceOf[fifo]
  
  @js.native
  sealed trait `fil-PH`
    extends StObject
       with GatherLanguage
  inline def `fil-PH`: `fil-PH` = "fil-PH".asInstanceOf[`fil-PH`]
  
  @js.native
  sealed trait fr
    extends StObject
       with DialRingTone
  inline def fr: fr = "fr".asInstanceOf[fr]
  
  @js.native
  sealed trait `fr-CA`
    extends StObject
       with GatherLanguage
       with PayLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `fr-CA`: `fr-CA` = "fr-CA".asInstanceOf[`fr-CA`]
  
  @js.native
  sealed trait `fr-FR`
    extends StObject
       with GatherLanguage
       with PayLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `fr-FR`: `fr-FR` = "fr-FR".asInstanceOf[`fr-FR`]
  
  @js.native
  sealed trait fraction
    extends StObject
       with SsmlSayAsInterpretAs
  inline def fraction: fraction = "fraction".asInstanceOf[fraction]
  
  @js.native
  sealed trait get_
    extends StObject
       with HttpMethod
  inline def get_ : get_ = "get".asInstanceOf[get_]
  
  @js.native
  sealed trait `gl-ES`
    extends StObject
       with GatherLanguage
  inline def `gl-ES`: `gl-ES` = "gl-ES".asInstanceOf[`gl-ES`]
  
  @js.native
  sealed trait gr
    extends StObject
       with DialRingTone
  inline def gr: gr = "gr".asInstanceOf[gr]
  
  @js.native
  sealed trait `gu-IN`
    extends StObject
       with GatherLanguage
  inline def `gu-IN`: `gu-IN` = "gu-IN".asInstanceOf[`gu-IN`]
  
  @js.native
  sealed trait `he-IL`
    extends StObject
       with GatherLanguage
  inline def `he-IL`: `he-IL` = "he-IL".asInstanceOf[`he-IL`]
  
  @js.native
  sealed trait `hi-IN`
    extends StObject
       with GatherLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `hi-IN`: `hi-IN` = "hi-IN".asInstanceOf[`hi-IN`]
  
  @js.native
  sealed trait hold
    extends StObject
       with ConferenceEvent
  inline def hold: hold = "hold".asInstanceOf[hold]
  
  @js.native
  sealed trait `hr-HR`
    extends StObject
       with GatherLanguage
  inline def `hr-HR`: `hr-HR` = "hr-HR".asInstanceOf[`hr-HR`]
  
  @js.native
  sealed trait hu
    extends StObject
       with DialRingTone
  inline def hu: hu = "hu".asInstanceOf[hu]
  
  @js.native
  sealed trait `hu-HU`
    extends StObject
       with GatherLanguage
  inline def `hu-HU`: `hu-HU` = "hu-HU".asInstanceOf[`hu-HU`]
  
  @js.native
  sealed trait `hy-AM`
    extends StObject
       with GatherLanguage
  inline def `hy-AM`: `hy-AM` = "hy-AM".asInstanceOf[`hy-AM`]
  
  @js.native
  sealed trait `id-ID`
    extends StObject
       with GatherLanguage
  inline def `id-ID`: `id-ID` = "id-ID".asInstanceOf[`id-ID`]
  
  @js.native
  sealed trait ie1
    extends StObject
       with ConferenceRegion
  inline def ie1: ie1 = "ie1".asInstanceOf[ie1]
  
  @js.native
  sealed trait il
    extends StObject
       with DialRingTone
  inline def il: il = "il".asInstanceOf[il]
  
  @js.native
  sealed trait imageSlashtiff
    extends StObject
       with ReceiveMediaType
  inline def imageSlashtiff: imageSlashtiff = "image/tiff".asInstanceOf[imageSlashtiff]
  
  @js.native
  sealed trait in
    extends StObject
       with DialRingTone
  inline def in: in = "in".asInstanceOf[in]
  
  @js.native
  sealed trait `in-progress`
    extends StObject
       with ConferenceRecordingEvent
       with ConversationRecordingEvent
       with DialRecordingEvent
       with RecordRecordingEvent
  inline def `in-progress`: `in-progress` = "in-progress".asInstanceOf[`in-progress`]
  
  @js.native
  sealed trait inbound
    extends StObject
       with DialRecordingTrack
  inline def inbound: inbound = "inbound".asInstanceOf[inbound]
  
  @js.native
  sealed trait inbound_track
    extends StObject
       with SiprecTrack
       with StreamTrack
  inline def inbound_track: inbound_track = "inbound_track".asInstanceOf[inbound_track]
  
  @js.native
  sealed trait inclusive
    extends StObject
       with SyncListItemQueryFromBoundType
       with SyncMapItemQueryFromBoundType
  inline def inclusive: inclusive = "inclusive".asInstanceOf[inclusive]
  
  @js.native
  sealed trait initiated
    extends StObject
       with ApplicationEvent
       with ClientEvent
       with NumberEvent
       with SipEvent
  inline def initiated: initiated = "initiated".asInstanceOf[initiated]
  
  @js.native
  sealed trait `input-matching-failed`
    extends StObject
       with PromptErrorType
  inline def `input-matching-failed`: `input-matching-failed` = "input-matching-failed".asInstanceOf[`input-matching-failed`]
  
  @js.native
  sealed trait `internal-error`
    extends StObject
       with PromptErrorType
  inline def `internal-error`: `internal-error` = "internal-error".asInstanceOf[`internal-error`]
  
  @js.native
  sealed trait `invalid-card-number`
    extends StObject
       with PromptErrorType
  inline def `invalid-card-number`: `invalid-card-number` = "invalid-card-number".asInstanceOf[`invalid-card-number`]
  
  @js.native
  sealed trait `invalid-card-type`
    extends StObject
       with PromptErrorType
  inline def `invalid-card-type`: `invalid-card-type` = "invalid-card-type".asInstanceOf[`invalid-card-type`]
  
  @js.native
  sealed trait `invalid-date`
    extends StObject
       with PromptErrorType
  inline def `invalid-date`: `invalid-date` = "invalid-date".asInstanceOf[`invalid-date`]
  
  @js.native
  sealed trait `invalid-security-code`
    extends StObject
       with PromptErrorType
  inline def `invalid-security-code`: `invalid-security-code` = "invalid-security-code".asInstanceOf[`invalid-security-code`]
  
  @js.native
  sealed trait ipa
    extends StObject
       with SsmlPhonemeAlphabet
  inline def ipa: ipa = "ipa".asInstanceOf[ipa]
  
  @js.native
  sealed trait `is-IS`
    extends StObject
       with GatherLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `is-IS`: `is-IS` = "is-IS".asInstanceOf[`is-IS`]
  
  @js.native
  sealed trait it
    extends StObject
       with DialRingTone
  inline def it: it = "it".asInstanceOf[it]
  
  @js.native
  sealed trait `it-IT`
    extends StObject
       with GatherLanguage
       with PayLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `it-IT`: `it-IT` = "it-IT".asInstanceOf[`it-IT`]
  
  @js.native
  sealed trait `ja-JP`
    extends StObject
       with GatherLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `ja-JP`: `ja-JP` = "ja-JP".asInstanceOf[`ja-JP`]
  
  @js.native
  sealed trait jcb
    extends StObject
       with PayValidCardTypes
       with PromptCardType
  inline def jcb: jcb = "jcb".asInstanceOf[jcb]
  
  @js.native
  sealed trait join
    extends StObject
       with ConferenceEvent
  inline def join: join = "join".asInstanceOf[join]
  
  @js.native
  sealed trait jp
    extends StObject
       with DialRingTone
  inline def jp: jp = "jp".asInstanceOf[jp]
  
  @js.native
  sealed trait jp1
    extends StObject
       with ConferenceRegion
  inline def jp1: jp1 = "jp1".asInstanceOf[jp1]
  
  @js.native
  sealed trait `jv-ID`
    extends StObject
       with GatherLanguage
  inline def `jv-ID`: `jv-ID` = "jv-ID".asInstanceOf[`jv-ID`]
  
  @js.native
  sealed trait `ka-GE`
    extends StObject
       with GatherLanguage
  inline def `ka-GE`: `ka-GE` = "ka-GE".asInstanceOf[`ka-GE`]
  
  @js.native
  sealed trait `km-KH`
    extends StObject
       with GatherLanguage
  inline def `km-KH`: `km-KH` = "km-KH".asInstanceOf[`km-KH`]
  
  @js.native
  sealed trait `kn-IN`
    extends StObject
       with GatherLanguage
  inline def `kn-IN`: `kn-IN` = "kn-IN".asInstanceOf[`kn-IN`]
  
  @js.native
  sealed trait `ko-KR`
    extends StObject
       with GatherLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `ko-KR`: `ko-KR` = "ko-KR".asInstanceOf[`ko-KR`]
  
  @js.native
  sealed trait large
    extends StObject
       with ConferenceJitterBufferSize
  inline def large: large = "large".asInstanceOf[large]
  
  @js.native
  sealed trait leave
    extends StObject
       with ConferenceEvent
  inline def leave: leave = "leave".asInstanceOf[leave]
  
  @js.native
  sealed trait legal
    extends StObject
       with ReceivePageSize
  inline def legal: legal = "legal".asInstanceOf[legal]
  
  @js.native
  sealed trait letter
    extends StObject
       with ReceivePageSize
  inline def letter: letter = "letter".asInstanceOf[letter]
  
  @js.native
  sealed trait lifo extends StObject
  inline def lifo: lifo = "lifo".asInstanceOf[lifo]
  
  @js.native
  sealed trait `lo-LA`
    extends StObject
       with GatherLanguage
  inline def `lo-LA`: `lo-LA` = "lo-LA".asInstanceOf[`lo-LA`]
  
  @js.native
  sealed trait lt
    extends StObject
       with DialRingTone
  inline def lt: lt = "lt".asInstanceOf[lt]
  
  @js.native
  sealed trait `lt-LT`
    extends StObject
       with GatherLanguage
  inline def `lt-LT`: `lt-LT` = "lt-LT".asInstanceOf[`lt-LT`]
  
  @js.native
  sealed trait `lv-LV`
    extends StObject
       with GatherLanguage
  inline def `lv-LV`: `lv-LV` = "lv-LV".asInstanceOf[`lv-LV`]
  
  @js.native
  sealed trait m
    extends StObject
       with SsmlSayAsFormat
  inline def m: m = "m".asInstanceOf[m]
  
  @js.native
  sealed trait maestro
    extends StObject
       with PayValidCardTypes
       with PromptCardType
  inline def maestro: maestro = "maestro".asInstanceOf[maestro]
  
  @js.native
  sealed trait man
    extends StObject
       with SayVoice
  inline def man: man = "man".asInstanceOf[man]
  
  @js.native
  sealed trait mastercard
    extends StObject
       with PayValidCardTypes
       with PromptCardType
  inline def mastercard: mastercard = "mastercard".asInstanceOf[mastercard]
  
  @js.native
  sealed trait md
    extends StObject
       with SsmlSayAsFormat
  inline def md: md = "md".asInstanceOf[md]
  
  @js.native
  sealed trait mdy
    extends StObject
       with SsmlSayAsFormat
  inline def mdy: mdy = "mdy".asInstanceOf[mdy]
  
  @js.native
  sealed trait medium
    extends StObject
       with ConferenceJitterBufferSize
       with SsmlBreakStrength
  inline def medium: medium = "medium".asInstanceOf[medium]
  
  @js.native
  sealed trait `mk-MK`
    extends StObject
       with GatherLanguage
  inline def `mk-MK`: `mk-MK` = "mk-MK".asInstanceOf[`mk-MK`]
  
  @js.native
  sealed trait `ml-IN`
    extends StObject
       with GatherLanguage
  inline def `ml-IN`: `ml-IN` = "ml-IN".asInstanceOf[`ml-IN`]
  
  @js.native
  sealed trait `mn-MN`
    extends StObject
       with GatherLanguage
  inline def `mn-MN`: `mn-MN` = "mn-MN".asInstanceOf[`mn-MN`]
  
  @js.native
  sealed trait moderate
    extends StObject
       with SsmlEmphasisLevel
  inline def moderate: moderate = "moderate".asInstanceOf[moderate]
  
  @js.native
  sealed trait modify
    extends StObject
       with ConferenceEvent
  inline def modify: modify = "modify".asInstanceOf[modify]
  
  @js.native
  sealed trait `mr-IN`
    extends StObject
       with GatherLanguage
  inline def `mr-IN`: `mr-IN` = "mr-IN".asInstanceOf[`mr-IN`]
  
  @js.native
  sealed trait `ms-MY`
    extends StObject
       with GatherLanguage
  inline def `ms-MY`: `ms-MY` = "ms-MY".asInstanceOf[`ms-MY`]
  
  @js.native
  sealed trait mute
    extends StObject
       with ConferenceEvent
  inline def mute: mute = "mute".asInstanceOf[mute]
  
  @js.native
  sealed trait mx
    extends StObject
       with DialRingTone
  inline def mx: mx = "mx".asInstanceOf[mx]
  
  @js.native
  sealed trait my
    extends StObject
       with DialRingTone
       with SsmlSayAsFormat
  inline def my: my = "my".asInstanceOf[my]
  
  @js.native
  sealed trait `my-MM`
    extends StObject
       with GatherLanguage
  inline def `my-MM`: `my-MM` = "my-MM".asInstanceOf[`my-MM`]
  
  @js.native
  sealed trait `nar-IQ`
    extends StObject
       with GatherLanguage
  inline def `nar-IQ`: `nar-IQ` = "nar-IQ".asInstanceOf[`nar-IQ`]
  
  @js.native
  sealed trait `nb-NO`
    extends StObject
       with GatherLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `nb-NO`: `nb-NO` = "nb-NO".asInstanceOf[`nb-NO`]
  
  @js.native
  sealed trait `ne-NP`
    extends StObject
       with GatherLanguage
  inline def `ne-NP`: `ne-NP` = "ne-NP".asInstanceOf[`ne-NP`]
  
  @js.native
  sealed trait nl
    extends StObject
       with DialRingTone
  inline def nl: nl = "nl".asInstanceOf[nl]
  
  @js.native
  sealed trait `nl-BE`
    extends StObject
       with GatherLanguage
  inline def `nl-BE`: `nl-BE` = "nl-BE".asInstanceOf[`nl-BE`]
  
  @js.native
  sealed trait `nl-NL`
    extends StObject
       with GatherLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `nl-NL`: `nl-NL` = "nl-NL".asInstanceOf[`nl-NL`]
  
  @js.native
  sealed trait no
    extends StObject
       with DialRingTone
  inline def no: no = "no".asInstanceOf[no]
  
  @js.native
  sealed trait none
    extends StObject
       with SsmlBreakStrength
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait number
    extends StObject
       with SsmlSayAsInterpretAs
  inline def number: number = "number".asInstanceOf[number]
  
  @js.native
  sealed trait numbers_and_commands
    extends StObject
       with GatherSpeechModel
  inline def numbers_and_commands: numbers_and_commands = "numbers_and_commands".asInstanceOf[numbers_and_commands]
  
  @js.native
  sealed trait nz
    extends StObject
       with DialRingTone
  inline def nz: nz = "nz".asInstanceOf[nz]
  
  @js.native
  sealed trait off
    extends StObject
       with ConferenceJitterBufferSize
  inline def off: off = "off".asInstanceOf[off]
  
  @js.native
  sealed trait onEnter
    extends StObject
       with ConferenceBeep
  inline def onEnter: onEnter = "onEnter".asInstanceOf[onEnter]
  
  @js.native
  sealed trait onExit
    extends StObject
       with ConferenceBeep
  inline def onExit: onExit = "onExit".asInstanceOf[onExit]
  
  @js.native
  sealed trait `one-time`
    extends StObject
       with PayTokenType
  inline def `one-time`: `one-time` = "one-time".asInstanceOf[`one-time`]
  
  @js.native
  sealed trait opened
    extends StObject
       with AuthorizationDocumentStatus
  inline def opened: opened = "opened".asInstanceOf[opened]
  
  @js.native
  sealed trait optima
    extends StObject
       with PayValidCardTypes
       with PromptCardType
  inline def optima: optima = "optima".asInstanceOf[optima]
  
  @js.native
  sealed trait ordinal
    extends StObject
       with SsmlSayAsInterpretAs
  inline def ordinal: ordinal = "ordinal".asInstanceOf[ordinal]
  
  @js.native
  sealed trait outbound
    extends StObject
       with DialRecordingTrack
  inline def outbound: outbound = "outbound".asInstanceOf[outbound]
  
  @js.native
  sealed trait outbound_track
    extends StObject
       with SiprecTrack
       with StreamTrack
  inline def outbound_track: outbound_track = "outbound_track".asInstanceOf[outbound_track]
  
  @js.native
  sealed trait `pa-guru-IN`
    extends StObject
       with GatherLanguage
  inline def `pa-guru-IN`: `pa-guru-IN` = "pa-guru-IN".asInstanceOf[`pa-guru-IN`]
  
  @js.native
  sealed trait patch
    extends StObject
       with HttpMethod
  inline def patch: patch = "patch".asInstanceOf[patch]
  
  @js.native
  sealed trait `payment-card-number`
    extends StObject
       with PromptFor
  inline def `payment-card-number`: `payment-card-number` = "payment-card-number".asInstanceOf[`payment-card-number`]
  
  @js.native
  sealed trait `payment-processing`
    extends StObject
       with PromptFor
  inline def `payment-processing`: `payment-processing` = "payment-processing".asInstanceOf[`payment-processing`]
  
  @js.native
  sealed trait `pending-loa`
    extends StObject
       with DependentHostedNumberOrderStatus
       with HostedNumberOrderStatus
  inline def `pending-loa`: `pending-loa` = "pending-loa".asInstanceOf[`pending-loa`]
  
  @js.native
  sealed trait `pending-verification`
    extends StObject
       with DependentHostedNumberOrderStatus
       with HostedNumberOrderStatus
  inline def `pending-verification`: `pending-verification` = "pending-verification".asInstanceOf[`pending-verification`]
  
  @js.native
  sealed trait ph
    extends StObject
       with DialRingTone
  inline def ph: ph = "ph".asInstanceOf[ph]
  
  @js.native
  sealed trait `phone-bill`
    extends StObject
       with DependentHostedNumberOrderVerificationType
       with HostedNumberOrderVerificationType
  inline def `phone-bill`: `phone-bill` = "phone-bill".asInstanceOf[`phone-bill`]
  
  @js.native
  sealed trait `phone-call`
    extends StObject
       with DependentHostedNumberOrderVerificationType
       with HostedNumberOrderVerificationType
  inline def `phone-call`: `phone-call` = "phone-call".asInstanceOf[`phone-call`]
  
  @js.native
  sealed trait phone_call
    extends StObject
       with GatherSpeechModel
  inline def phone_call: phone_call = "phone_call".asInstanceOf[phone_call]
  
  @js.native
  sealed trait pl
    extends StObject
       with DialRingTone
  inline def pl: pl = "pl".asInstanceOf[pl]
  
  @js.native
  sealed trait `pl-PL`
    extends StObject
       with GatherLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `pl-PL`: `pl-PL` = "pl-PL".asInstanceOf[`pl-PL`]
  
  @js.native
  sealed trait player extends StObject
  inline def player: player = "player".asInstanceOf[player]
  
  @js.native
  sealed trait post_
    extends StObject
       with HttpMethod
  inline def post_ : post_ = "post".asInstanceOf[post_]
  
  @js.native
  sealed trait `postal-code`
    extends StObject
       with PromptFor
  inline def `postal-code`: `postal-code` = "postal-code".asInstanceOf[`postal-code`]
  
  @js.native
  sealed trait pt
    extends StObject
       with DialRingTone
  inline def pt: pt = "pt".asInstanceOf[pt]
  
  @js.native
  sealed trait `pt-BR`
    extends StObject
       with GatherLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `pt-BR`: `pt-BR` = "pt-BR".asInstanceOf[`pt-BR`]
  
  @js.native
  sealed trait `pt-PT`
    extends StObject
       with GatherLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `pt-PT`: `pt-PT` = "pt-PT".asInstanceOf[`pt-PT`]
  
  @js.native
  sealed trait put
    extends StObject
       with HttpMethod
  inline def put: put = "put".asInstanceOf[put]
  
  @js.native
  sealed trait received
    extends StObject
       with DependentHostedNumberOrderStatus
       with HostedNumberOrderStatus
  inline def received: received = "received".asInstanceOf[received]
  
  @js.native
  sealed trait `record-from-answer`
    extends StObject
       with ConversationRecord
       with DialRecord
  inline def `record-from-answer`: `record-from-answer` = "record-from-answer".asInstanceOf[`record-from-answer`]
  
  @js.native
  sealed trait `record-from-answer-dual`
    extends StObject
       with ConversationRecord
       with DialRecord
  inline def `record-from-answer-dual`: `record-from-answer-dual` = "record-from-answer-dual".asInstanceOf[`record-from-answer-dual`]
  
  @js.native
  sealed trait `record-from-ringing`
    extends StObject
       with ConversationRecord
       with DialRecord
  inline def `record-from-ringing`: `record-from-ringing` = "record-from-ringing".asInstanceOf[`record-from-ringing`]
  
  @js.native
  sealed trait `record-from-ringing-dual`
    extends StObject
       with ConversationRecord
       with DialRecord
  inline def `record-from-ringing-dual`: `record-from-ringing-dual` = "record-from-ringing-dual".asInstanceOf[`record-from-ringing-dual`]
  
  @js.native
  sealed trait `record-from-start`
    extends StObject
       with ConferenceRecord
  inline def `record-from-start`: `record-from-start` = "record-from-start".asInstanceOf[`record-from-start`]
  
  @js.native
  sealed trait reduced
    extends StObject
       with SsmlEmphasisLevel
  inline def reduced: reduced = "reduced".asInstanceOf[reduced]
  
  @js.native
  sealed trait rejected
    extends StObject
       with RejectReason
  inline def rejected: rejected = "rejected".asInstanceOf[rejected]
  
  @js.native
  sealed trait reusable
    extends StObject
       with PayTokenType
  inline def reusable: reusable = "reusable".asInstanceOf[reusable]
  
  @js.native
  sealed trait ringing
    extends StObject
       with ApplicationEvent
       with ClientEvent
       with NumberEvent
       with SipEvent
  inline def ringing: ringing = "ringing".asInstanceOf[ringing]
  
  @js.native
  sealed trait `ro-RO`
    extends StObject
       with GatherLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `ro-RO`: `ro-RO` = "ro-RO".asInstanceOf[`ro-RO`]
  
  @js.native
  sealed trait ru
    extends StObject
       with DialRingTone
  inline def ru: ru = "ru".asInstanceOf[ru]
  
  @js.native
  sealed trait `ru-RU`
    extends StObject
       with GatherLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `ru-RU`: `ru-RU` = "ru-RU".asInstanceOf[`ru-RU`]
  
  @js.native
  sealed trait se
    extends StObject
       with DialRingTone
  inline def se: se = "se".asInstanceOf[se]
  
  @js.native
  sealed trait `security-code`
    extends StObject
       with PromptFor
  inline def `security-code`: `security-code` = "security-code".asInstanceOf[`security-code`]
  
  @js.native
  sealed trait sg
    extends StObject
       with DialRingTone
  inline def sg: sg = "sg".asInstanceOf[sg]
  
  @js.native
  sealed trait sg1
    extends StObject
       with ConferenceRegion
  inline def sg1: sg1 = "sg1".asInstanceOf[sg1]
  
  @js.native
  sealed trait `si-LK`
    extends StObject
       with GatherLanguage
  inline def `si-LK`: `si-LK` = "si-LK".asInstanceOf[`si-LK`]
  
  @js.native
  sealed trait signed
    extends StObject
       with AuthorizationDocumentStatus
  inline def signed: signed = "signed".asInstanceOf[signed]
  
  @js.native
  sealed trait signing
    extends StObject
       with AuthorizationDocumentStatus
  inline def signing: signing = "signing".asInstanceOf[signing]
  
  @js.native
  sealed trait `sk-SK`
    extends StObject
       with GatherLanguage
  inline def `sk-SK`: `sk-SK` = "sk-SK".asInstanceOf[`sk-SK`]
  
  @js.native
  sealed trait `sl-SI`
    extends StObject
       with GatherLanguage
  inline def `sl-SI`: `sl-SI` = "sl-SI".asInstanceOf[`sl-SI`]
  
  @js.native
  sealed trait small
    extends StObject
       with ConferenceJitterBufferSize
  inline def small: small = "small".asInstanceOf[small]
  
  @js.native
  sealed trait speaker
    extends StObject
       with ConferenceEvent
  inline def speaker: speaker = "speaker".asInstanceOf[speaker]
  
  @js.native
  sealed trait speech
    extends StObject
       with GatherInput
  inline def speech: speech = "speech".asInstanceOf[speech]
  
  @js.native
  sealed trait `spell-out`
    extends StObject
       with SsmlSayAsInterpretAs
  inline def `spell-out`: `spell-out` = "spell-out".asInstanceOf[`spell-out`]
  
  @js.native
  sealed trait `sq-AL`
    extends StObject
       with GatherLanguage
  inline def `sq-AL`: `sq-AL` = "sq-AL".asInstanceOf[`sq-AL`]
  
  @js.native
  sealed trait `sr-RS`
    extends StObject
       with GatherLanguage
  inline def `sr-RS`: `sr-RS` = "sr-RS".asInstanceOf[`sr-RS`]
  
  @js.native
  sealed trait start
    extends StObject
       with ConferenceEvent
  inline def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait strong
    extends StObject
       with SsmlBreakStrength
       with SsmlEmphasisLevel
  inline def strong: strong = "strong".asInstanceOf[strong]
  
  @js.native
  sealed trait `su-ID`
    extends StObject
       with GatherLanguage
  inline def `su-ID`: `su-ID` = "su-ID".asInstanceOf[`su-ID`]
  
  @js.native
  sealed trait `sv-SE`
    extends StObject
       with GatherLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `sv-SE`: `sv-SE` = "sv-SE".asInstanceOf[`sv-SE`]
  
  @js.native
  sealed trait `sw-KE`
    extends StObject
       with GatherLanguage
  inline def `sw-KE`: `sw-KE` = "sw-KE".asInstanceOf[`sw-KE`]
  
  @js.native
  sealed trait `sw-TZ`
    extends StObject
       with GatherLanguage
  inline def `sw-TZ`: `sw-TZ` = "sw-TZ".asInstanceOf[`sw-TZ`]
  
  @js.native
  sealed trait `ta-IN`
    extends StObject
       with GatherLanguage
  inline def `ta-IN`: `ta-IN` = "ta-IN".asInstanceOf[`ta-IN`]
  
  @js.native
  sealed trait `ta-LK`
    extends StObject
       with GatherLanguage
  inline def `ta-LK`: `ta-LK` = "ta-LK".asInstanceOf[`ta-LK`]
  
  @js.native
  sealed trait `ta-MY`
    extends StObject
       with GatherLanguage
  inline def `ta-MY`: `ta-MY` = "ta-MY".asInstanceOf[`ta-MY`]
  
  @js.native
  sealed trait `ta-SG`
    extends StObject
       with GatherLanguage
  inline def `ta-SG`: `ta-SG` = "ta-SG".asInstanceOf[`ta-SG`]
  
  @js.native
  sealed trait task_router extends StObject
  inline def task_router: task_router = "task_router".asInstanceOf[task_router]
  
  @js.native
  sealed trait `te-IN`
    extends StObject
       with GatherLanguage
  inline def `te-IN`: `te-IN` = "te-IN".asInstanceOf[`te-IN`]
  
  @js.native
  sealed trait telephone
    extends StObject
       with SsmlSayAsInterpretAs
  inline def telephone: telephone = "telephone".asInstanceOf[telephone]
  
  @js.native
  sealed trait testing
    extends StObject
       with DependentHostedNumberOrderStatus
       with HostedNumberOrderStatus
  inline def testing: testing = "testing".asInstanceOf[testing]
  
  @js.native
  sealed trait th
    extends StObject
       with DialRingTone
  inline def th: th = "th".asInstanceOf[th]
  
  @js.native
  sealed trait `th-TH`
    extends StObject
       with GatherLanguage
  inline def `th-TH`: `th-TH` = "th-TH".asInstanceOf[`th-TH`]
  
  @js.native
  sealed trait time
    extends StObject
       with SsmlSayAsInterpretAs
  inline def time: time = "time".asInstanceOf[time]
  
  @js.native
  sealed trait timeout
    extends StObject
       with PromptErrorType
  inline def timeout: timeout = "timeout".asInstanceOf[timeout]
  
  @js.native
  sealed trait `tr-TR`
    extends StObject
       with GatherLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `tr-TR`: `tr-TR` = "tr-TR".asInstanceOf[`tr-TR`]
  
  @js.native
  sealed trait `trim-silence`
    extends StObject
       with ConferenceTrim
       with ConversationTrim
       with DialTrim
       with RecordTrim
  inline def `trim-silence`: `trim-silence` = "trim-silence".asInstanceOf[`trim-silence`]
  
  @js.native
  sealed trait `true`
    extends StObject
       with ConferenceBeep
       with ConversationRecord
  inline def `true`: `true` = "true".asInstanceOf[`true`]
  
  @js.native
  sealed trait tw
    extends StObject
       with DialRingTone
  inline def tw: tw = "tw".asInstanceOf[tw]
  
  @js.native
  sealed trait uk
    extends StObject
       with DialRingTone
  inline def uk: uk = "uk".asInstanceOf[uk]
  
  @js.native
  sealed trait `uk-UA`
    extends StObject
       with GatherLanguage
  inline def `uk-UA`: `uk-UA` = "uk-UA".asInstanceOf[`uk-UA`]
  
  @js.native
  sealed trait unit
    extends StObject
       with SsmlSayAsInterpretAs
  inline def unit: unit = "unit".asInstanceOf[unit]
  
  @js.native
  sealed trait `ur-IN`
    extends StObject
       with GatherLanguage
  inline def `ur-IN`: `ur-IN` = "ur-IN".asInstanceOf[`ur-IN`]
  
  @js.native
  sealed trait `ur-PK`
    extends StObject
       with GatherLanguage
  inline def `ur-PK`: `ur-PK` = "ur-PK".asInstanceOf[`ur-PK`]
  
  @js.native
  sealed trait us
    extends StObject
       with DialRingTone
  inline def us: us = "us".asInstanceOf[us]
  
  @js.native
  sealed trait `us-old`
    extends StObject
       with DialRingTone
  inline def `us-old`: `us-old` = "us-old".asInstanceOf[`us-old`]
  
  @js.native
  sealed trait us1
    extends StObject
       with ConferenceRegion
  inline def us1: us1 = "us1".asInstanceOf[us1]
  
  @js.native
  sealed trait `uz-UZ`
    extends StObject
       with GatherLanguage
  inline def `uz-UZ`: `uz-UZ` = "uz-UZ".asInstanceOf[`uz-UZ`]
  
  @js.native
  sealed trait ve
    extends StObject
       with DialRingTone
  inline def ve: ve = "ve".asInstanceOf[ve]
  
  @js.native
  sealed trait verified
    extends StObject
       with DependentHostedNumberOrderStatus
       with HostedNumberOrderStatus
  inline def verified: verified = "verified".asInstanceOf[verified]
  
  @js.native
  sealed trait `vi-VN`
    extends StObject
       with GatherLanguage
  inline def `vi-VN`: `vi-VN` = "vi-VN".asInstanceOf[`vi-VN`]
  
  @js.native
  sealed trait video extends StObject
  inline def video: video = "video".asInstanceOf[video]
  
  @js.native
  sealed trait visa
    extends StObject
       with PayValidCardTypes
       with PromptCardType
  inline def visa: visa = "visa".asInstanceOf[visa]
  
  @js.native
  sealed trait voice extends StObject
  inline def voice: voice = "voice".asInstanceOf[voice]
  
  @js.native
  sealed trait weak
    extends StObject
       with SsmlBreakStrength
  inline def weak: weak = "weak".asInstanceOf[weak]
  
  @js.native
  sealed trait woman
    extends StObject
       with SayVoice
  inline def woman: woman = "woman".asInstanceOf[woman]
  
  @js.native
  sealed trait `x-amazon-jyutping`
    extends StObject
       with SsmlPhonemeAlphabet
  inline def `x-amazon-jyutping`: `x-amazon-jyutping` = "x-amazon-jyutping".asInstanceOf[`x-amazon-jyutping`]
  
  @js.native
  sealed trait `x-amazon-pinyin`
    extends StObject
       with SsmlPhonemeAlphabet
  inline def `x-amazon-pinyin`: `x-amazon-pinyin` = "x-amazon-pinyin".asInstanceOf[`x-amazon-pinyin`]
  
  @js.native
  sealed trait `x-amazon-pron-kana`
    extends StObject
       with SsmlPhonemeAlphabet
  inline def `x-amazon-pron-kana`: `x-amazon-pron-kana` = "x-amazon-pron-kana".asInstanceOf[`x-amazon-pron-kana`]
  
  @js.native
  sealed trait `x-amazon-yomigana`
    extends StObject
       with SsmlPhonemeAlphabet
  inline def `x-amazon-yomigana`: `x-amazon-yomigana` = "x-amazon-yomigana".asInstanceOf[`x-amazon-yomigana`]
  
  @js.native
  sealed trait `x-sampa`
    extends StObject
       with SsmlPhonemeAlphabet
  inline def `x-sampa`: `x-sampa` = "x-sampa".asInstanceOf[`x-sampa`]
  
  @js.native
  sealed trait `x-strong`
    extends StObject
       with SsmlBreakStrength
  inline def `x-strong`: `x-strong` = "x-strong".asInstanceOf[`x-strong`]
  
  @js.native
  sealed trait `x-weak`
    extends StObject
       with SsmlBreakStrength
  inline def `x-weak`: `x-weak` = "x-weak".asInstanceOf[`x-weak`]
  
  @js.native
  sealed trait y
    extends StObject
       with SsmlSayAsFormat
  inline def y: y = "y".asInstanceOf[y]
  
  @js.native
  sealed trait ym
    extends StObject
       with SsmlSayAsFormat
  inline def ym: ym = "ym".asInstanceOf[ym]
  
  @js.native
  sealed trait ymd
    extends StObject
       with SsmlSayAsFormat
  inline def ymd: ymd = "ymd".asInstanceOf[ymd]
  
  @js.native
  sealed trait `yue-CN`
    extends StObject
       with SsmlLangXmlLang
  inline def `yue-CN`: `yue-CN` = "yue-CN".asInstanceOf[`yue-CN`]
  
  @js.native
  sealed trait `yue-Hant-HK`
    extends StObject
       with GatherLanguage
  inline def `yue-Hant-HK`: `yue-Hant-HK` = "yue-Hant-HK".asInstanceOf[`yue-Hant-HK`]
  
  @js.native
  sealed trait yyyymmdd
    extends StObject
       with SsmlSayAsFormat
  inline def yyyymmdd: yyyymmdd = "yyyymmdd".asInstanceOf[yyyymmdd]
  
  @js.native
  sealed trait za
    extends StObject
       with DialRingTone
  inline def za: za = "za".asInstanceOf[za]
  
  @js.native
  sealed trait zh
    extends StObject
       with GatherLanguage
  inline def zh: zh = "zh".asInstanceOf[zh]
  
  @js.native
  sealed trait `zh-CN`
    extends StObject
       with SayLanguage
  inline def `zh-CN`: `zh-CN` = "zh-CN".asInstanceOf[`zh-CN`]
  
  @js.native
  sealed trait `zh-HK`
    extends StObject
       with SayLanguage
  inline def `zh-HK`: `zh-HK` = "zh-HK".asInstanceOf[`zh-HK`]
  
  @js.native
  sealed trait `zh-TW`
    extends StObject
       with GatherLanguage
       with SayLanguage
  inline def `zh-TW`: `zh-TW` = "zh-TW".asInstanceOf[`zh-TW`]
  
  @js.native
  sealed trait `zu-ZA`
    extends StObject
       with GatherLanguage
  inline def `zu-ZA`: `zu-ZA` = "zu-ZA".asInstanceOf[`zu-ZA`]
}
