package typings.unsplashJs

import typings.std.Response
import typings.unsplashJs.anon.AppId
import typings.unsplashJs.anon.DownloadLocation_
import typings.unsplashJs.anon.OmitStrictPaginationParamOrderBy
import typings.unsplashJs.anon.Photos
import typings.unsplashJs.anon.PickPaginationParamspagep
import typings.unsplashJs.anon.ResponseResponse
import typings.unsplashJs.anon.Results
import typings.unsplashJs.anon.ResultsArray
import typings.unsplashJs.anon.ResultsTotal
import typings.unsplashJs.anon.Total
import typings.unsplashJs.anon.Url
import typings.unsplashJs.anon.statsbooleanundefinedOrie
import typings.unsplashJs.collectionsMod.CollectionId
import typings.unsplashJs.distTypesRequestMod.OrientationParam
import typings.unsplashJs.distTypesRequestMod.PaginationParams
import typings.unsplashJs.photosMod.PhotoId
import typings.unsplashJs.photosMod.RandomParams
import typings.unsplashJs.photosTypesMod.Full
import typings.unsplashJs.photosTypesMod.Random
import typings.unsplashJs.photosTypesMod.Stats
import typings.unsplashJs.requestMod.AdditionalFetchOptions
import typings.unsplashJs.requestMod.CompleteRequestParams
import typings.unsplashJs.requestMod.InitParams
import typings.unsplashJs.responseMod.HandleResponse
import typings.unsplashJs.searchMod.SearchParams
import typings.unsplashJs.searchMod.SearchPhotosParams
import typings.unsplashJs.topicsMod.TopicIdOrSlug
import typings.unsplashJs.typesResponseMod.Collections
import typings.unsplashJs.typesResponseMod.Users
import typings.unsplashJs.usersMod.Username
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unsplash-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("unsplash-js", "Language")
  @js.native
  object Language extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.unsplashJs.typesRequestMod.Language & String] = js.native
    
    /* "af" */ val Afrikaans: typings.unsplashJs.typesRequestMod.Language.Afrikaans & String = js.native
    
    /* "sq" */ val Albanian: typings.unsplashJs.typesRequestMod.Language.Albanian & String = js.native
    
    /* "am" */ val Amharic: typings.unsplashJs.typesRequestMod.Language.Amharic & String = js.native
    
    /* "ar" */ val Arabic: typings.unsplashJs.typesRequestMod.Language.Arabic & String = js.native
    
    /* "hy" */ val Armenian: typings.unsplashJs.typesRequestMod.Language.Armenian & String = js.native
    
    /* "az" */ val Azerbaijani: typings.unsplashJs.typesRequestMod.Language.Azerbaijani & String = js.native
    
    /* "eu" */ val Basque: typings.unsplashJs.typesRequestMod.Language.Basque & String = js.native
    
    /* "be" */ val Belarusian: typings.unsplashJs.typesRequestMod.Language.Belarusian & String = js.native
    
    /* "bn" */ val Bengali: typings.unsplashJs.typesRequestMod.Language.Bengali & String = js.native
    
    /* "bs" */ val Bosnian: typings.unsplashJs.typesRequestMod.Language.Bosnian & String = js.native
    
    /* "bg" */ val Bulgarian: typings.unsplashJs.typesRequestMod.Language.Bulgarian & String = js.native
    
    /* "ca" */ val Catalan: typings.unsplashJs.typesRequestMod.Language.Catalan & String = js.native
    
    /* "ceb" */ val Cebuano: typings.unsplashJs.typesRequestMod.Language.Cebuano & String = js.native
    
    /* "zh" */ val ChineseSimplified: typings.unsplashJs.typesRequestMod.Language.ChineseSimplified & String = js.native
    
    /* "zh-TW" */ val ChineseTraditional: typings.unsplashJs.typesRequestMod.Language.ChineseTraditional & String = js.native
    
    /* "co" */ val Corsican: typings.unsplashJs.typesRequestMod.Language.Corsican & String = js.native
    
    /* "hr" */ val Croatian: typings.unsplashJs.typesRequestMod.Language.Croatian & String = js.native
    
    /* "cs" */ val Czech: typings.unsplashJs.typesRequestMod.Language.Czech & String = js.native
    
    /* "da" */ val Danish: typings.unsplashJs.typesRequestMod.Language.Danish & String = js.native
    
    /* "nl" */ val Dutch: typings.unsplashJs.typesRequestMod.Language.Dutch & String = js.native
    
    /* "en" */ val English: typings.unsplashJs.typesRequestMod.Language.English & String = js.native
    
    /* "eo" */ val Esperanto: typings.unsplashJs.typesRequestMod.Language.Esperanto & String = js.native
    
    /* "et" */ val Estonian: typings.unsplashJs.typesRequestMod.Language.Estonian & String = js.native
    
    /* "tl" */ val Filipino: typings.unsplashJs.typesRequestMod.Language.Filipino & String = js.native
    
    /* "fi" */ val Finnish: typings.unsplashJs.typesRequestMod.Language.Finnish & String = js.native
    
    /* "fr" */ val French: typings.unsplashJs.typesRequestMod.Language.French & String = js.native
    
    /* "fy" */ val Frisian: typings.unsplashJs.typesRequestMod.Language.Frisian & String = js.native
    
    /* "gl" */ val Galician: typings.unsplashJs.typesRequestMod.Language.Galician & String = js.native
    
    /* "ka" */ val Georgian: typings.unsplashJs.typesRequestMod.Language.Georgian & String = js.native
    
    /* "de" */ val German: typings.unsplashJs.typesRequestMod.Language.German & String = js.native
    
    /* "el" */ val Greek: typings.unsplashJs.typesRequestMod.Language.Greek & String = js.native
    
    /* "gu" */ val Gujarati: typings.unsplashJs.typesRequestMod.Language.Gujarati & String = js.native
    
    /* "ht" */ val HaitianCreole: typings.unsplashJs.typesRequestMod.Language.HaitianCreole & String = js.native
    
    /* "ha" */ val Hausa: typings.unsplashJs.typesRequestMod.Language.Hausa & String = js.native
    
    /* "haw" */ val Hawaiian: typings.unsplashJs.typesRequestMod.Language.Hawaiian & String = js.native
    
    /* "iw" */ val Hebrew: typings.unsplashJs.typesRequestMod.Language.Hebrew & String = js.native
    
    /* "hi" */ val Hindi: typings.unsplashJs.typesRequestMod.Language.Hindi & String = js.native
    
    /* "hmn" */ val Hmong: typings.unsplashJs.typesRequestMod.Language.Hmong & String = js.native
    
    /* "hu" */ val Hungarian: typings.unsplashJs.typesRequestMod.Language.Hungarian & String = js.native
    
    /* "is" */ val Icelandic: typings.unsplashJs.typesRequestMod.Language.Icelandic & String = js.native
    
    /* "ig" */ val Igbo: typings.unsplashJs.typesRequestMod.Language.Igbo & String = js.native
    
    /* "id" */ val Indonesian: typings.unsplashJs.typesRequestMod.Language.Indonesian & String = js.native
    
    /* "ga" */ val Irish: typings.unsplashJs.typesRequestMod.Language.Irish & String = js.native
    
    /* "it" */ val Italian: typings.unsplashJs.typesRequestMod.Language.Italian & String = js.native
    
    /* "ja" */ val Japanese: typings.unsplashJs.typesRequestMod.Language.Japanese & String = js.native
    
    /* "jw" */ val Javanese: typings.unsplashJs.typesRequestMod.Language.Javanese & String = js.native
    
    /* "kn" */ val Kannada: typings.unsplashJs.typesRequestMod.Language.Kannada & String = js.native
    
    /* "kk" */ val Kazakh: typings.unsplashJs.typesRequestMod.Language.Kazakh & String = js.native
    
    /* "km" */ val Khmer: typings.unsplashJs.typesRequestMod.Language.Khmer & String = js.native
    
    /* "rw" */ val Kinyarwanda: typings.unsplashJs.typesRequestMod.Language.Kinyarwanda & String = js.native
    
    /* "ko" */ val Korean: typings.unsplashJs.typesRequestMod.Language.Korean & String = js.native
    
    /* "ku" */ val Kurdish: typings.unsplashJs.typesRequestMod.Language.Kurdish & String = js.native
    
    /* "ky" */ val Kyrgyz: typings.unsplashJs.typesRequestMod.Language.Kyrgyz & String = js.native
    
    /* "lo" */ val Lao: typings.unsplashJs.typesRequestMod.Language.Lao & String = js.native
    
    /* "la" */ val Latin: typings.unsplashJs.typesRequestMod.Language.Latin & String = js.native
    
    /* "lv" */ val Latvian: typings.unsplashJs.typesRequestMod.Language.Latvian & String = js.native
    
    /* "lt" */ val Lithuanian: typings.unsplashJs.typesRequestMod.Language.Lithuanian & String = js.native
    
    /* "lb" */ val Luxembourgish: typings.unsplashJs.typesRequestMod.Language.Luxembourgish & String = js.native
    
    /* "mk" */ val Macedonian: typings.unsplashJs.typesRequestMod.Language.Macedonian & String = js.native
    
    /* "mg" */ val Malagasy: typings.unsplashJs.typesRequestMod.Language.Malagasy & String = js.native
    
    /* "ms" */ val Malay: typings.unsplashJs.typesRequestMod.Language.Malay & String = js.native
    
    /* "ml" */ val Malayalam: typings.unsplashJs.typesRequestMod.Language.Malayalam & String = js.native
    
    /* "mt" */ val Maltese: typings.unsplashJs.typesRequestMod.Language.Maltese & String = js.native
    
    /* "mi" */ val Maori: typings.unsplashJs.typesRequestMod.Language.Maori & String = js.native
    
    /* "mr" */ val Marathi: typings.unsplashJs.typesRequestMod.Language.Marathi & String = js.native
    
    /* "mn" */ val Mongolian: typings.unsplashJs.typesRequestMod.Language.Mongolian & String = js.native
    
    /* "my" */ val Myanmar: typings.unsplashJs.typesRequestMod.Language.Myanmar & String = js.native
    
    /* "ne" */ val Nepali: typings.unsplashJs.typesRequestMod.Language.Nepali & String = js.native
    
    /* "no" */ val Norwegian: typings.unsplashJs.typesRequestMod.Language.Norwegian & String = js.native
    
    /* "ny" */ val Nyanja: typings.unsplashJs.typesRequestMod.Language.Nyanja & String = js.native
    
    /* "or" */ val Oriya: typings.unsplashJs.typesRequestMod.Language.Oriya & String = js.native
    
    /* "ps" */ val Pashto: typings.unsplashJs.typesRequestMod.Language.Pashto & String = js.native
    
    /* "fa" */ val Persian: typings.unsplashJs.typesRequestMod.Language.Persian & String = js.native
    
    /* "pl" */ val Polish: typings.unsplashJs.typesRequestMod.Language.Polish & String = js.native
    
    /* "pt" */ val Portuguese: typings.unsplashJs.typesRequestMod.Language.Portuguese & String = js.native
    
    /* "pa" */ val Punjabi: typings.unsplashJs.typesRequestMod.Language.Punjabi & String = js.native
    
    /* "ro" */ val Romanian: typings.unsplashJs.typesRequestMod.Language.Romanian & String = js.native
    
    /* "ru" */ val Russian: typings.unsplashJs.typesRequestMod.Language.Russian & String = js.native
    
    /* "sm" */ val Samoan: typings.unsplashJs.typesRequestMod.Language.Samoan & String = js.native
    
    /* "gd" */ val ScotsGaelic: typings.unsplashJs.typesRequestMod.Language.ScotsGaelic & String = js.native
    
    /* "sr" */ val Serbian: typings.unsplashJs.typesRequestMod.Language.Serbian & String = js.native
    
    /* "st" */ val Sesotho: typings.unsplashJs.typesRequestMod.Language.Sesotho & String = js.native
    
    /* "sn" */ val Shona: typings.unsplashJs.typesRequestMod.Language.Shona & String = js.native
    
    /* "sd" */ val Sindhi: typings.unsplashJs.typesRequestMod.Language.Sindhi & String = js.native
    
    /* "si" */ val Sinhala: typings.unsplashJs.typesRequestMod.Language.Sinhala & String = js.native
    
    /* "sk" */ val Slovak: typings.unsplashJs.typesRequestMod.Language.Slovak & String = js.native
    
    /* "sl" */ val Slovenian: typings.unsplashJs.typesRequestMod.Language.Slovenian & String = js.native
    
    /* "so" */ val Somali: typings.unsplashJs.typesRequestMod.Language.Somali & String = js.native
    
    /* "es" */ val Spanish: typings.unsplashJs.typesRequestMod.Language.Spanish & String = js.native
    
    /* "su" */ val Sundanese: typings.unsplashJs.typesRequestMod.Language.Sundanese & String = js.native
    
    /* "sw" */ val Swahili: typings.unsplashJs.typesRequestMod.Language.Swahili & String = js.native
    
    /* "sv" */ val Swedish: typings.unsplashJs.typesRequestMod.Language.Swedish & String = js.native
    
    /* "tg" */ val Tajik: typings.unsplashJs.typesRequestMod.Language.Tajik & String = js.native
    
    /* "ta" */ val Tamil: typings.unsplashJs.typesRequestMod.Language.Tamil & String = js.native
    
    /* "tt" */ val Tatar: typings.unsplashJs.typesRequestMod.Language.Tatar & String = js.native
    
    /* "te" */ val Telugu: typings.unsplashJs.typesRequestMod.Language.Telugu & String = js.native
    
    /* "th" */ val Thai: typings.unsplashJs.typesRequestMod.Language.Thai & String = js.native
    
    /* "tr" */ val Turkish: typings.unsplashJs.typesRequestMod.Language.Turkish & String = js.native
    
    /* "tk" */ val Turkmen: typings.unsplashJs.typesRequestMod.Language.Turkmen & String = js.native
    
    /* "ug" */ val Uighur: typings.unsplashJs.typesRequestMod.Language.Uighur & String = js.native
    
    /* "uk" */ val Ukrainian: typings.unsplashJs.typesRequestMod.Language.Ukrainian & String = js.native
    
    /* "ur" */ val Urdu: typings.unsplashJs.typesRequestMod.Language.Urdu & String = js.native
    
    /* "uz" */ val Uzbek: typings.unsplashJs.typesRequestMod.Language.Uzbek & String = js.native
    
    /* "vi" */ val Vietnamese: typings.unsplashJs.typesRequestMod.Language.Vietnamese & String = js.native
    
    /* "cy" */ val Welsh: typings.unsplashJs.typesRequestMod.Language.Welsh & String = js.native
    
    /* "xh" */ val Xhosa: typings.unsplashJs.typesRequestMod.Language.Xhosa & String = js.native
    
    /* "yi" */ val Yiddish: typings.unsplashJs.typesRequestMod.Language.Yiddish & String = js.native
    
    /* "yo" */ val Yoruba: typings.unsplashJs.typesRequestMod.Language.Yoruba & String = js.native
    
    /* "zu" */ val Zulu: typings.unsplashJs.typesRequestMod.Language.Zulu & String = js.native
  }
  
  @JSImport("unsplash-js", "OrderBy")
  @js.native
  object OrderBy extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.unsplashJs.distTypesRequestMod.OrderBy & String] = js.native
    
    /* "downloads" */ val DOWNLOADS: typings.unsplashJs.distTypesRequestMod.OrderBy.DOWNLOADS & String = js.native
    
    /* "latest" */ val LATEST: typings.unsplashJs.distTypesRequestMod.OrderBy.LATEST & String = js.native
    
    /* "oldest" */ val OLDEST: typings.unsplashJs.distTypesRequestMod.OrderBy.OLDEST & String = js.native
    
    /* "popular" */ val POPULAR: typings.unsplashJs.distTypesRequestMod.OrderBy.POPULAR & String = js.native
    
    /* "views" */ val VIEWS: typings.unsplashJs.distTypesRequestMod.OrderBy.VIEWS & String = js.native
  }
  
  inline def createApi(args: InitParams): Photos = ^.asInstanceOf[js.Dynamic].applyDynamic("createApi")(args.asInstanceOf[js.Any]).asInstanceOf[Photos]
  
  object internals {
    
    @JSImport("unsplash-js", "_internals")
    @js.native
    val ^ : js.Any = js.native
    
    object collections {
      
      object get {
        
        @JSImport("unsplash-js", "_internals.collections.get")
        @js.native
        val ^ : js.Any = js.native
        
        inline def getPathname(params: CollectionId): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
        
        inline def handleRequest(a: CollectionId): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
        inline def handleRequest(a: CollectionId, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
        
        @JSImport("unsplash-js", "_internals.collections.get.handleResponse")
        @js.native
        def handleResponse: HandleResponse[Any] = js.native
        inline def handleResponse(args: ResponseResponse): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
        inline def handleResponse_=(x: HandleResponse[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
      }
      
      object getPhotos {
        
        @JSImport("unsplash-js", "_internals.collections.getPhotos")
        @js.native
        val ^ : js.Any = js.native
        
        inline def getPathname(params: CollectionId): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
        
        inline def handleRequest(a: CollectionId & PaginationParams & OrientationParam): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
        inline def handleRequest(
          a: CollectionId & PaginationParams & OrientationParam,
          additionalFetchOptions: AdditionalFetchOptions
        ): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
        
        @JSImport("unsplash-js", "_internals.collections.getPhotos.handleResponse")
        @js.native
        def handleResponse: HandleResponse[Total] = js.native
        inline def handleResponse(args: ResponseResponse): js.Promise[Total] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Total]]
        inline def handleResponse_=(x: HandleResponse[Total]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
      }
      
      object getRelated {
        
        @JSImport("unsplash-js", "_internals.collections.getRelated")
        @js.native
        val ^ : js.Any = js.native
        
        inline def getPathname(params: CollectionId): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
        
        inline def handleRequest(a: CollectionId): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
        inline def handleRequest(a: CollectionId, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
        
        @JSImport("unsplash-js", "_internals.collections.getRelated.handleResponse")
        @js.native
        def handleResponse: HandleResponse[Any] = js.native
        inline def handleResponse(args: ResponseResponse): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
        inline def handleResponse_=(x: HandleResponse[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
      }
      
      object list {
        
        @JSImport("unsplash-js", "_internals.collections.list")
        @js.native
        val ^ : js.Any = js.native
        
        inline def getPathname(params: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
        
        inline def handleRequest(): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")().asInstanceOf[CompleteRequestParams]
        inline def handleRequest(a: Unit, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
        inline def handleRequest(a: PickPaginationParamspagep): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
        inline def handleRequest(a: PickPaginationParamspagep, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
        
        @JSImport("unsplash-js", "_internals.collections.list.handleResponse")
        @js.native
        def handleResponse: HandleResponse[Total] = js.native
        inline def handleResponse(args: ResponseResponse): js.Promise[Total] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Total]]
        inline def handleResponse_=(x: HandleResponse[Total]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
      }
    }
    
    object photos {
      
      object get {
        
        @JSImport("unsplash-js", "_internals.photos.get")
        @js.native
        val ^ : js.Any = js.native
        
        inline def getPathname(params: PhotoId): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
        
        inline def handleRequest(a: PhotoId): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
        inline def handleRequest(a: PhotoId, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
        
        @JSImport("unsplash-js", "_internals.photos.get.handleResponse")
        @js.native
        def handleResponse: HandleResponse[Full] = js.native
        inline def handleResponse(args: ResponseResponse): js.Promise[Full] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Full]]
        inline def handleResponse_=(x: HandleResponse[Full]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
      }
      
      object getRandom {
        
        @JSImport("unsplash-js", "_internals.photos.getRandom")
        @js.native
        val ^ : js.Any = js.native
        
        inline def getPathname(params: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
        
        inline def handleRequest(): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")().asInstanceOf[CompleteRequestParams]
        inline def handleRequest(a: Unit, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
        inline def handleRequest(a: RandomParams): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
        inline def handleRequest(a: RandomParams, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
        
        @JSImport("unsplash-js", "_internals.photos.getRandom.handleResponse")
        @js.native
        def handleResponse: HandleResponse[Random | js.Array[Random]] = js.native
        inline def handleResponse(args: ResponseResponse): js.Promise[Random | js.Array[Random]] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Random | js.Array[Random]]]
        inline def handleResponse_=(x: HandleResponse[Random | js.Array[Random]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
      }
      
      object getStats {
        
        @JSImport("unsplash-js", "_internals.photos.getStats")
        @js.native
        val ^ : js.Any = js.native
        
        inline def getPathname(params: PhotoId): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
        
        inline def handleRequest(a: PhotoId): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
        inline def handleRequest(a: PhotoId, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
        
        @JSImport("unsplash-js", "_internals.photos.getStats.handleResponse")
        @js.native
        def handleResponse: HandleResponse[Stats] = js.native
        inline def handleResponse(args: ResponseResponse): js.Promise[Stats] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Stats]]
        inline def handleResponse_=(x: HandleResponse[Stats]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
      }
      
      object list {
        
        @JSImport("unsplash-js", "_internals.photos.list")
        @js.native
        val ^ : js.Any = js.native
        
        inline def getPathname(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")().asInstanceOf[String]
        inline def getPathname(params: Unit): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
        
        inline def handleRequest(): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")().asInstanceOf[CompleteRequestParams]
        inline def handleRequest(a: Unit, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
        inline def handleRequest(a: PaginationParams): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
        inline def handleRequest(a: PaginationParams, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
        
        @JSImport("unsplash-js", "_internals.photos.list.handleResponse")
        @js.native
        def handleResponse: HandleResponse[ResultsTotal] = js.native
        inline def handleResponse(args: ResponseResponse): js.Promise[ResultsTotal] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultsTotal]]
        inline def handleResponse_=(x: HandleResponse[ResultsTotal]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
      }
      
      object trackDownload {
        
        @JSImport("unsplash-js", "_internals.photos.trackDownload")
        @js.native
        val ^ : js.Any = js.native
        
        inline def handleRequest(a: DownloadLocation_): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
        inline def handleRequest(a: DownloadLocation_, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
        
        @JSImport("unsplash-js", "_internals.photos.trackDownload.handleResponse")
        @js.native
        def handleResponse: HandleResponse[Url] = js.native
        inline def handleResponse(args: ResponseResponse): js.Promise[Url] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Url]]
        inline def handleResponse_=(x: HandleResponse[Url]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
      }
    }
    
    object search {
      
      object getCollections {
        
        @JSImport("unsplash-js", "_internals.search.getCollections")
        @js.native
        val ^ : js.Any = js.native
        
        inline def getPathname(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")().asInstanceOf[String]
        inline def getPathname(params: Unit): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
        
        inline def handleRequest(a: SearchParams): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
        inline def handleRequest(a: SearchParams, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
        
        @JSImport("unsplash-js", "_internals.search.getCollections.handleResponse")
        @js.native
        def handleResponse: HandleResponse[Collections] = js.native
        inline def handleResponse(args: ResponseResponse): js.Promise[Collections] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Collections]]
        inline def handleResponse_=(x: HandleResponse[Collections]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
      }
      
      object getPhotos {
        
        @JSImport("unsplash-js", "_internals.search.getPhotos")
        @js.native
        val ^ : js.Any = js.native
        
        inline def getPathname(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")().asInstanceOf[String]
        inline def getPathname(params: Unit): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
        
        inline def handleRequest(a: SearchPhotosParams): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
        inline def handleRequest(a: SearchPhotosParams, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
        
        @JSImport("unsplash-js", "_internals.search.getPhotos.handleResponse")
        @js.native
        def handleResponse: HandleResponse[typings.unsplashJs.typesResponseMod.Photos] = js.native
        inline def handleResponse(args: ResponseResponse): js.Promise[typings.unsplashJs.typesResponseMod.Photos] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.unsplashJs.typesResponseMod.Photos]]
        inline def handleResponse_=(x: HandleResponse[typings.unsplashJs.typesResponseMod.Photos]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
      }
      
      object getUsers {
        
        @JSImport("unsplash-js", "_internals.search.getUsers")
        @js.native
        val ^ : js.Any = js.native
        
        inline def getPathname(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")().asInstanceOf[String]
        inline def getPathname(params: Unit): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
        
        inline def handleRequest(a: SearchParams): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
        inline def handleRequest(a: SearchParams, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
        
        @JSImport("unsplash-js", "_internals.search.getUsers.handleResponse")
        @js.native
        def handleResponse: HandleResponse[Users] = js.native
        inline def handleResponse(args: ResponseResponse): js.Promise[Users] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Users]]
        inline def handleResponse_=(x: HandleResponse[Users]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
      }
    }
    
    object topics {
      
      object get {
        
        @JSImport("unsplash-js", "_internals.topics.get")
        @js.native
        val ^ : js.Any = js.native
        
        inline def getPathname(params: TopicIdOrSlug): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
        
        inline def handleRequest(a: TopicIdOrSlug): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
        inline def handleRequest(a: TopicIdOrSlug, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
        
        @JSImport("unsplash-js", "_internals.topics.get.handleResponse")
        @js.native
        def handleResponse: HandleResponse[typings.unsplashJs.topicsTypesMod.Full] = js.native
        inline def handleResponse(args: ResponseResponse): js.Promise[typings.unsplashJs.topicsTypesMod.Full] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.unsplashJs.topicsTypesMod.Full]]
        inline def handleResponse_=(x: HandleResponse[typings.unsplashJs.topicsTypesMod.Full]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
      }
      
      object getPhotos {
        
        @JSImport("unsplash-js", "_internals.topics.getPhotos")
        @js.native
        val ^ : js.Any = js.native
        
        inline def getPathname(params: TopicIdOrSlug): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
        
        inline def handleRequest(a: TopicIdOrSlug & PaginationParams & OrientationParam): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
        inline def handleRequest(
          a: TopicIdOrSlug & PaginationParams & OrientationParam,
          additionalFetchOptions: AdditionalFetchOptions
        ): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
        
        @JSImport("unsplash-js", "_internals.topics.getPhotos.handleResponse")
        @js.native
        def handleResponse: HandleResponse[ResultsTotal] = js.native
        inline def handleResponse(args: ResponseResponse): js.Promise[ResultsTotal] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultsTotal]]
        inline def handleResponse_=(x: HandleResponse[ResultsTotal]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
      }
      
      object list {
        
        @JSImport("unsplash-js", "_internals.topics.list")
        @js.native
        val ^ : js.Any = js.native
        
        inline def getPathname(params: TopicIdOrSlug): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
        
        inline def handleRequest(a: OmitStrictPaginationParamOrderBy): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
        inline def handleRequest(a: OmitStrictPaginationParamOrderBy, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
        
        @JSImport("unsplash-js", "_internals.topics.list.handleResponse")
        @js.native
        def handleResponse: HandleResponse[Results] = js.native
        inline def handleResponse(args: ResponseResponse): js.Promise[Results] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Results]]
        inline def handleResponse_=(x: HandleResponse[Results]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
      }
    }
    
    inline def trackNonHotLinkedPhotoView(hasAppId: AppId): js.Function1[/* hasPhotoId */ typings.unsplashJs.anon.PhotoId, js.Promise[Response]] = ^.asInstanceOf[js.Dynamic].applyDynamic("trackNonHotLinkedPhotoView")(hasAppId.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* hasPhotoId */ typings.unsplashJs.anon.PhotoId, js.Promise[Response]]]
    
    object users {
      
      object get {
        
        @JSImport("unsplash-js", "_internals.users.get")
        @js.native
        val ^ : js.Any = js.native
        
        inline def getPathname(params: Username): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
        
        inline def handleRequest(a: Username): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
        inline def handleRequest(a: Username, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
        
        @JSImport("unsplash-js", "_internals.users.get.handleResponse")
        @js.native
        def handleResponse: HandleResponse[typings.unsplashJs.usersTypesMod.Full] = js.native
        inline def handleResponse(args: ResponseResponse): js.Promise[typings.unsplashJs.usersTypesMod.Full] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.unsplashJs.usersTypesMod.Full]]
        inline def handleResponse_=(x: HandleResponse[typings.unsplashJs.usersTypesMod.Full]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
      }
      
      object getCollections {
        
        @JSImport("unsplash-js", "_internals.users.getCollections")
        @js.native
        val ^ : js.Any = js.native
        
        inline def getPathname(params: Username): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
        
        inline def handleRequest(a: Username & PaginationParams): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
        inline def handleRequest(a: Username & PaginationParams, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
        
        @JSImport("unsplash-js", "_internals.users.getCollections.handleResponse")
        @js.native
        def handleResponse: HandleResponse[ResultsArray] = js.native
        inline def handleResponse(args: ResponseResponse): js.Promise[ResultsArray] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultsArray]]
        inline def handleResponse_=(x: HandleResponse[ResultsArray]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
      }
      
      object getLikes {
        
        @JSImport("unsplash-js", "_internals.users.getLikes")
        @js.native
        val ^ : js.Any = js.native
        
        inline def getPathname(params: Username): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
        
        inline def handleRequest(a: OrientationParam & Username & PaginationParams): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
        inline def handleRequest(a: OrientationParam & Username & PaginationParams, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
        
        @JSImport("unsplash-js", "_internals.users.getLikes.handleResponse")
        @js.native
        def handleResponse: HandleResponse[ResultsTotal] = js.native
        inline def handleResponse(args: ResponseResponse): js.Promise[ResultsTotal] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultsTotal]]
        inline def handleResponse_=(x: HandleResponse[ResultsTotal]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
      }
      
      object getPhotos {
        
        @JSImport("unsplash-js", "_internals.users.getPhotos")
        @js.native
        val ^ : js.Any = js.native
        
        inline def getPathname(params: Username): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
        
        inline def handleRequest(a: statsbooleanundefinedOrie): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
        inline def handleRequest(a: statsbooleanundefinedOrie, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
        
        @JSImport("unsplash-js", "_internals.users.getPhotos.handleResponse")
        @js.native
        def handleResponse: HandleResponse[ResultsTotal] = js.native
        inline def handleResponse(args: ResponseResponse): js.Promise[ResultsTotal] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultsTotal]]
        inline def handleResponse_=(x: HandleResponse[ResultsTotal]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
      }
    }
  }
}
