package typings.urlMetadata

import org.scalablytyped.runtime.StringDictionary
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
    
    var descriptionLength: js.UndefOr[Double] = js.undefined
    
    var encode: js.UndefOr[js.Function0[Unit]] = js.undefined
    
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
    
    extension [Self <: Options](x: Self) {
      
      inline def setDescriptionLength(value: Double): Self = StObject.set(x, "descriptionLength", value.asInstanceOf[js.Any])
      
      inline def setDescriptionLengthUndefined: Self = StObject.set(x, "descriptionLength", js.undefined)
      
      inline def setEncode(value: () => Unit): Self = StObject.set(x, "encode", js.Any.fromFunction0(value))
      
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
    
    var canonical: String
    
    var description: String
    
    var image: String
    
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
    
    var source: String
    
    var title: String
    
    var url: String
  }
  object Result {
    
    inline def apply(
      author: String,
      canonical: String,
      description: String,
      image: String,
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
      source: String,
      title: String,
      url: String
    ): Result = {
      val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], canonical = canonical.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], keywords = keywords.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
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
      __obj.asInstanceOf[Result]
    }
    
    extension [Self <: Result](x: Self) {
      
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
      
      inline def setCanonical(value: String): Self = StObject.set(x, "canonical", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
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
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
