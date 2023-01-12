package typings.urlMetadata

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(url: String): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  inline def apply(url: String, options: Options): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  
  @JSImport("url-metadata", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var decode: js.UndefOr[js.Function1[/* v */ Buffer, String]] = js.undefined
    
    var descriptionLength: js.UndefOr[Double] = js.undefined
    
    var encode: js.UndefOr[js.Function1[/* v */ String, String]] = js.undefined
    
    var ensureSecureImageRequest: js.UndefOr[Boolean] = js.undefined
    
    var fromEmail: js.UndefOr[String] = js.undefined
    
    var maxRedirects: js.UndefOr[Double] = js.undefined
    
    var sourceMap: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var userAgent: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setDecode(value: /* v */ Buffer => String): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
      
      inline def setDecodeUndefined: Self = StObject.set(x, "decode", js.undefined)
      
      inline def setDescriptionLength(value: Double): Self = StObject.set(x, "descriptionLength", value.asInstanceOf[js.Any])
      
      inline def setDescriptionLengthUndefined: Self = StObject.set(x, "descriptionLength", js.undefined)
      
      inline def setEncode(value: /* v */ String => String): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
      
      inline def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
      
      inline def setEnsureSecureImageRequest(value: Boolean): Self = StObject.set(x, "ensureSecureImageRequest", value.asInstanceOf[js.Any])
      
      inline def setEnsureSecureImageRequestUndefined: Self = StObject.set(x, "ensureSecureImageRequest", js.undefined)
      
      inline def setFromEmail(value: String): Self = StObject.set(x, "fromEmail", value.asInstanceOf[js.Any])
      
      inline def setFromEmailUndefined: Self = StObject.set(x, "fromEmail", js.undefined)
      
      inline def setMaxRedirects(value: Double): Self = StObject.set(x, "maxRedirects", value.asInstanceOf[js.Any])
      
      inline def setMaxRedirectsUndefined: Self = StObject.set(x, "maxRedirects", js.undefined)
      
      inline def setSourceMap(value: StringDictionary[String]): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
    }
  }
  
  trait Result extends StObject {
    
    @JSName("article:author")
    var articleColonauthor: js.UndefOr[String] = js.undefined
    
    @JSName("article:expiration_time")
    var articleColonexpiration_time: js.UndefOr[String] = js.undefined
    
    @JSName("article:modified_time")
    var articleColonmodified_time: js.UndefOr[String] = js.undefined
    
    @JSName("article:published_time")
    var articleColonpublished_time: js.UndefOr[String] = js.undefined
    
    @JSName("article:section")
    var articleColonsection: js.UndefOr[String] = js.undefined
    
    @JSName("article:tag")
    var articleColontag: js.UndefOr[String] = js.undefined
    
    var author: String
    
    var availability: String
    
    var canonical: String
    
    var description: String
    
    var image: String
    
    var jsonld: Any
    
    var keywords: String
    
    @JSName("og:article:author")
    var ogColonarticleColonauthor: js.UndefOr[String] = js.undefined
    
    @JSName("og:article:expiration_time")
    var ogColonarticleColonexpiration_time: js.UndefOr[String] = js.undefined
    
    @JSName("og:article:modified_time")
    var ogColonarticleColonmodified_time: js.UndefOr[String] = js.undefined
    
    @JSName("og:article:published_time")
    var ogColonarticleColonpublished_time: js.UndefOr[String] = js.undefined
    
    @JSName("og:article:section")
    var ogColonarticleColonsection: js.UndefOr[String] = js.undefined
    
    @JSName("og:article:tag")
    var ogColonarticleColontag: js.UndefOr[String] = js.undefined
    
    @JSName("og:description")
    var ogColondescription: String
    
    @JSName("og:determiner")
    var ogColondeterminer: String
    
    @JSName("og:image")
    var ogColonimage: String
    
    @JSName("og:image:height")
    var ogColonimageColonheight: String
    
    @JSName("og:image:secure_url")
    var ogColonimageColonsecure_url: String
    
    @JSName("og:image:type")
    var ogColonimageColontype: String
    
    @JSName("og:image:width")
    var ogColonimageColonwidth: String
    
    @JSName("og:locale")
    var ogColonlocale: String
    
    @JSName("og:locale:alternate")
    var ogColonlocaleColonalternate: String
    
    @JSName("og:site_name")
    var ogColonsite_name: String
    
    @JSName("og:title")
    var ogColontitle: String
    
    @JSName("og:type")
    var ogColontype: String
    
    @JSName("og:url")
    var ogColonurl: String
    
    var price: String
    
    var priceCurrency: String
    
    var robots: String
    
    var source: String
    
    var title: String
    
    @JSName("twitter:account_id")
    var twitterColonaccount_id: String
    
    @JSName("twitter:card")
    var twitterColoncard: String
    
    @JSName("twitter:creator")
    var twitterColoncreator: String
    
    @JSName("twitter:creator:id")
    var twitterColoncreatorColonid: String
    
    @JSName("twitter:image")
    var twitterColonimage: String
    
    @JSName("twitter:image:alt")
    var twitterColonimageColonalt: String
    
    @JSName("twitter:player")
    var twitterColonplayer: String
    
    @JSName("twitter:player:height")
    var twitterColonplayerColonheight: String
    
    @JSName("twitter:player:stream")
    var twitterColonplayerColonstream: String
    
    @JSName("twitter:player:width")
    var twitterColonplayerColonwidth: String
    
    @JSName("twitter:site")
    var twitterColonsite: String
    
    @JSName("twitter:site:id")
    var twitterColonsiteColonid: String
    
    @JSName("twitter:title")
    var twitterColontitle: String
    
    var url: String
  }
  object Result {
    
    inline def apply(
      author: String,
      availability: String,
      canonical: String,
      description: String,
      image: String,
      jsonld: Any,
      keywords: String,
      ogColondescription: String,
      ogColondeterminer: String,
      ogColonimage: String,
      ogColonimageColonheight: String,
      ogColonimageColonsecure_url: String,
      ogColonimageColontype: String,
      ogColonimageColonwidth: String,
      ogColonlocale: String,
      ogColonlocaleColonalternate: String,
      ogColonsite_name: String,
      ogColontitle: String,
      ogColontype: String,
      ogColonurl: String,
      price: String,
      priceCurrency: String,
      robots: String,
      source: String,
      title: String,
      twitterColonaccount_id: String,
      twitterColoncard: String,
      twitterColoncreator: String,
      twitterColoncreatorColonid: String,
      twitterColonimage: String,
      twitterColonimageColonalt: String,
      twitterColonplayer: String,
      twitterColonplayerColonheight: String,
      twitterColonplayerColonstream: String,
      twitterColonplayerColonwidth: String,
      twitterColonsite: String,
      twitterColonsiteColonid: String,
      twitterColontitle: String,
      url: String
    ): Result = {
      val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], availability = availability.asInstanceOf[js.Any], canonical = canonical.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], jsonld = jsonld.asInstanceOf[js.Any], keywords = keywords.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], priceCurrency = priceCurrency.asInstanceOf[js.Any], robots = robots.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("og:description")(ogColondescription.asInstanceOf[js.Any])
      __obj.updateDynamic("og:determiner")(ogColondeterminer.asInstanceOf[js.Any])
      __obj.updateDynamic("og:image")(ogColonimage.asInstanceOf[js.Any])
      __obj.updateDynamic("og:image:height")(ogColonimageColonheight.asInstanceOf[js.Any])
      __obj.updateDynamic("og:image:secure_url")(ogColonimageColonsecure_url.asInstanceOf[js.Any])
      __obj.updateDynamic("og:image:type")(ogColonimageColontype.asInstanceOf[js.Any])
      __obj.updateDynamic("og:image:width")(ogColonimageColonwidth.asInstanceOf[js.Any])
      __obj.updateDynamic("og:locale")(ogColonlocale.asInstanceOf[js.Any])
      __obj.updateDynamic("og:locale:alternate")(ogColonlocaleColonalternate.asInstanceOf[js.Any])
      __obj.updateDynamic("og:site_name")(ogColonsite_name.asInstanceOf[js.Any])
      __obj.updateDynamic("og:title")(ogColontitle.asInstanceOf[js.Any])
      __obj.updateDynamic("og:type")(ogColontype.asInstanceOf[js.Any])
      __obj.updateDynamic("og:url")(ogColonurl.asInstanceOf[js.Any])
      __obj.updateDynamic("twitter:account_id")(twitterColonaccount_id.asInstanceOf[js.Any])
      __obj.updateDynamic("twitter:card")(twitterColoncard.asInstanceOf[js.Any])
      __obj.updateDynamic("twitter:creator")(twitterColoncreator.asInstanceOf[js.Any])
      __obj.updateDynamic("twitter:creator:id")(twitterColoncreatorColonid.asInstanceOf[js.Any])
      __obj.updateDynamic("twitter:image")(twitterColonimage.asInstanceOf[js.Any])
      __obj.updateDynamic("twitter:image:alt")(twitterColonimageColonalt.asInstanceOf[js.Any])
      __obj.updateDynamic("twitter:player")(twitterColonplayer.asInstanceOf[js.Any])
      __obj.updateDynamic("twitter:player:height")(twitterColonplayerColonheight.asInstanceOf[js.Any])
      __obj.updateDynamic("twitter:player:stream")(twitterColonplayerColonstream.asInstanceOf[js.Any])
      __obj.updateDynamic("twitter:player:width")(twitterColonplayerColonwidth.asInstanceOf[js.Any])
      __obj.updateDynamic("twitter:site")(twitterColonsite.asInstanceOf[js.Any])
      __obj.updateDynamic("twitter:site:id")(twitterColonsiteColonid.asInstanceOf[js.Any])
      __obj.updateDynamic("twitter:title")(twitterColontitle.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      inline def setArticleColonauthor(value: String): Self = StObject.set(x, "article:author", value.asInstanceOf[js.Any])
      
      inline def setArticleColonauthorUndefined: Self = StObject.set(x, "article:author", js.undefined)
      
      inline def setArticleColonexpiration_time(value: String): Self = StObject.set(x, "article:expiration_time", value.asInstanceOf[js.Any])
      
      inline def setArticleColonexpiration_timeUndefined: Self = StObject.set(x, "article:expiration_time", js.undefined)
      
      inline def setArticleColonmodified_time(value: String): Self = StObject.set(x, "article:modified_time", value.asInstanceOf[js.Any])
      
      inline def setArticleColonmodified_timeUndefined: Self = StObject.set(x, "article:modified_time", js.undefined)
      
      inline def setArticleColonpublished_time(value: String): Self = StObject.set(x, "article:published_time", value.asInstanceOf[js.Any])
      
      inline def setArticleColonpublished_timeUndefined: Self = StObject.set(x, "article:published_time", js.undefined)
      
      inline def setArticleColonsection(value: String): Self = StObject.set(x, "article:section", value.asInstanceOf[js.Any])
      
      inline def setArticleColonsectionUndefined: Self = StObject.set(x, "article:section", js.undefined)
      
      inline def setArticleColontag(value: String): Self = StObject.set(x, "article:tag", value.asInstanceOf[js.Any])
      
      inline def setArticleColontagUndefined: Self = StObject.set(x, "article:tag", js.undefined)
      
      inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setAvailability(value: String): Self = StObject.set(x, "availability", value.asInstanceOf[js.Any])
      
      inline def setCanonical(value: String): Self = StObject.set(x, "canonical", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setJsonld(value: Any): Self = StObject.set(x, "jsonld", value.asInstanceOf[js.Any])
      
      inline def setKeywords(value: String): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      inline def setOgColonarticleColonauthor(value: String): Self = StObject.set(x, "og:article:author", value.asInstanceOf[js.Any])
      
      inline def setOgColonarticleColonauthorUndefined: Self = StObject.set(x, "og:article:author", js.undefined)
      
      inline def setOgColonarticleColonexpiration_time(value: String): Self = StObject.set(x, "og:article:expiration_time", value.asInstanceOf[js.Any])
      
      inline def setOgColonarticleColonexpiration_timeUndefined: Self = StObject.set(x, "og:article:expiration_time", js.undefined)
      
      inline def setOgColonarticleColonmodified_time(value: String): Self = StObject.set(x, "og:article:modified_time", value.asInstanceOf[js.Any])
      
      inline def setOgColonarticleColonmodified_timeUndefined: Self = StObject.set(x, "og:article:modified_time", js.undefined)
      
      inline def setOgColonarticleColonpublished_time(value: String): Self = StObject.set(x, "og:article:published_time", value.asInstanceOf[js.Any])
      
      inline def setOgColonarticleColonpublished_timeUndefined: Self = StObject.set(x, "og:article:published_time", js.undefined)
      
      inline def setOgColonarticleColonsection(value: String): Self = StObject.set(x, "og:article:section", value.asInstanceOf[js.Any])
      
      inline def setOgColonarticleColonsectionUndefined: Self = StObject.set(x, "og:article:section", js.undefined)
      
      inline def setOgColonarticleColontag(value: String): Self = StObject.set(x, "og:article:tag", value.asInstanceOf[js.Any])
      
      inline def setOgColonarticleColontagUndefined: Self = StObject.set(x, "og:article:tag", js.undefined)
      
      inline def setOgColondescription(value: String): Self = StObject.set(x, "og:description", value.asInstanceOf[js.Any])
      
      inline def setOgColondeterminer(value: String): Self = StObject.set(x, "og:determiner", value.asInstanceOf[js.Any])
      
      inline def setOgColonimage(value: String): Self = StObject.set(x, "og:image", value.asInstanceOf[js.Any])
      
      inline def setOgColonimageColonheight(value: String): Self = StObject.set(x, "og:image:height", value.asInstanceOf[js.Any])
      
      inline def setOgColonimageColonsecure_url(value: String): Self = StObject.set(x, "og:image:secure_url", value.asInstanceOf[js.Any])
      
      inline def setOgColonimageColontype(value: String): Self = StObject.set(x, "og:image:type", value.asInstanceOf[js.Any])
      
      inline def setOgColonimageColonwidth(value: String): Self = StObject.set(x, "og:image:width", value.asInstanceOf[js.Any])
      
      inline def setOgColonlocale(value: String): Self = StObject.set(x, "og:locale", value.asInstanceOf[js.Any])
      
      inline def setOgColonlocaleColonalternate(value: String): Self = StObject.set(x, "og:locale:alternate", value.asInstanceOf[js.Any])
      
      inline def setOgColonsite_name(value: String): Self = StObject.set(x, "og:site_name", value.asInstanceOf[js.Any])
      
      inline def setOgColontitle(value: String): Self = StObject.set(x, "og:title", value.asInstanceOf[js.Any])
      
      inline def setOgColontype(value: String): Self = StObject.set(x, "og:type", value.asInstanceOf[js.Any])
      
      inline def setOgColonurl(value: String): Self = StObject.set(x, "og:url", value.asInstanceOf[js.Any])
      
      inline def setPrice(value: String): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      inline def setPriceCurrency(value: String): Self = StObject.set(x, "priceCurrency", value.asInstanceOf[js.Any])
      
      inline def setRobots(value: String): Self = StObject.set(x, "robots", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTwitterColonaccount_id(value: String): Self = StObject.set(x, "twitter:account_id", value.asInstanceOf[js.Any])
      
      inline def setTwitterColoncard(value: String): Self = StObject.set(x, "twitter:card", value.asInstanceOf[js.Any])
      
      inline def setTwitterColoncreator(value: String): Self = StObject.set(x, "twitter:creator", value.asInstanceOf[js.Any])
      
      inline def setTwitterColoncreatorColonid(value: String): Self = StObject.set(x, "twitter:creator:id", value.asInstanceOf[js.Any])
      
      inline def setTwitterColonimage(value: String): Self = StObject.set(x, "twitter:image", value.asInstanceOf[js.Any])
      
      inline def setTwitterColonimageColonalt(value: String): Self = StObject.set(x, "twitter:image:alt", value.asInstanceOf[js.Any])
      
      inline def setTwitterColonplayer(value: String): Self = StObject.set(x, "twitter:player", value.asInstanceOf[js.Any])
      
      inline def setTwitterColonplayerColonheight(value: String): Self = StObject.set(x, "twitter:player:height", value.asInstanceOf[js.Any])
      
      inline def setTwitterColonplayerColonstream(value: String): Self = StObject.set(x, "twitter:player:stream", value.asInstanceOf[js.Any])
      
      inline def setTwitterColonplayerColonwidth(value: String): Self = StObject.set(x, "twitter:player:width", value.asInstanceOf[js.Any])
      
      inline def setTwitterColonsite(value: String): Self = StObject.set(x, "twitter:site", value.asInstanceOf[js.Any])
      
      inline def setTwitterColonsiteColonid(value: String): Self = StObject.set(x, "twitter:site:id", value.asInstanceOf[js.Any])
      
      inline def setTwitterColontitle(value: String): Self = StObject.set(x, "twitter:title", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
