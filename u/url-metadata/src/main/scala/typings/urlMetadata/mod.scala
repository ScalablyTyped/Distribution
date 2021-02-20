package typings.urlMetadata

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("url-metadata", JSImport.Namespace)
  @js.native
  def apply(url: String): js.Promise[Result] = js.native
  @JSImport("url-metadata", JSImport.Namespace)
  @js.native
  def apply(url: String, options: Options): js.Promise[Result] = js.native
  
  @js.native
  trait Options extends StObject {
    
    var descriptionLength: js.UndefOr[Double] = js.native
    
    var encode: js.UndefOr[js.Function0[Unit]] = js.native
    
    var ensureSecureImageRequest: js.UndefOr[Boolean] = js.native
    
    var fromEmail: js.UndefOr[String] = js.native
    
    var maxRedirects: js.UndefOr[Double] = js.native
    
    var sourceMap: js.UndefOr[StringDictionary[String]] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
    
    var userAgent: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescriptionLength(value: Double): Self = StObject.set(x, "descriptionLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionLengthUndefined: Self = StObject.set(x, "descriptionLength", js.undefined)
      
      @scala.inline
      def setEncode(value: () => Unit): Self = StObject.set(x, "encode", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
      
      @scala.inline
      def setEnsureSecureImageRequest(value: Boolean): Self = StObject.set(x, "ensureSecureImageRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnsureSecureImageRequestUndefined: Self = StObject.set(x, "ensureSecureImageRequest", js.undefined)
      
      @scala.inline
      def setFromEmail(value: String): Self = StObject.set(x, "fromEmail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromEmailUndefined: Self = StObject.set(x, "fromEmail", js.undefined)
      
      @scala.inline
      def setMaxRedirects(value: Double): Self = StObject.set(x, "maxRedirects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRedirectsUndefined: Self = StObject.set(x, "maxRedirects", js.undefined)
      
      @scala.inline
      def setSourceMap(value: StringDictionary[String]): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
    }
  }
  
  @js.native
  trait Result extends StObject {
    
    @JSName("article:author")
    var articleColonauthor: js.UndefOr[String] = js.native
    
    @JSName("article:expiration_time")
    var articleColonexpiration_time: js.UndefOr[String] = js.native
    
    @JSName("article:modified_time")
    var articleColonmodified_time: js.UndefOr[String] = js.native
    
    @JSName("article:published_time")
    var articleColonpublished_time: js.UndefOr[String] = js.native
    
    @JSName("article:section")
    var articleColonsection: js.UndefOr[String] = js.native
    
    @JSName("article:tag")
    var articleColontag: js.UndefOr[String] = js.native
    
    var author: String = js.native
    
    var canonical: String = js.native
    
    var description: String = js.native
    
    var image: String = js.native
    
    var keywords: String = js.native
    
    @JSName("og:article:author")
    var ogColonarticleColonauthor: js.UndefOr[String] = js.native
    
    @JSName("og:article:expiration_time")
    var ogColonarticleColonexpiration_time: js.UndefOr[String] = js.native
    
    @JSName("og:article:modified_time")
    var ogColonarticleColonmodified_time: js.UndefOr[String] = js.native
    
    @JSName("og:article:published_time")
    var ogColonarticleColonpublished_time: js.UndefOr[String] = js.native
    
    @JSName("og:article:section")
    var ogColonarticleColonsection: js.UndefOr[String] = js.native
    
    @JSName("og:article:tag")
    var ogColonarticleColontag: js.UndefOr[String] = js.native
    
    @JSName("og:description")
    var ogColondescription: String = js.native
    
    @JSName("og:determiner")
    var ogColondeterminer: String = js.native
    
    @JSName("og:image")
    var ogColonimage: String = js.native
    
    @JSName("og:image:height")
    var ogColonimageColonheight: String = js.native
    
    @JSName("og:image:secure_url")
    var ogColonimageColonsecure_url: String = js.native
    
    @JSName("og:image:type")
    var ogColonimageColontype: String = js.native
    
    @JSName("og:image:width")
    var ogColonimageColonwidth: String = js.native
    
    @JSName("og:locale")
    var ogColonlocale: String = js.native
    
    @JSName("og:locale:alternate")
    var ogColonlocaleColonalternate: String = js.native
    
    @JSName("og:site_name")
    var ogColonsite_name: String = js.native
    
    @JSName("og:title")
    var ogColontitle: String = js.native
    
    @JSName("og:type")
    var ogColontype: String = js.native
    
    @JSName("og:url")
    var ogColonurl: String = js.native
    
    var source: String = js.native
    
    var title: String = js.native
    
    var url: String = js.native
  }
  object Result {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArticleColonauthor(value: String): Self = StObject.set(x, "article:author", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArticleColonauthorUndefined: Self = StObject.set(x, "article:author", js.undefined)
      
      @scala.inline
      def setArticleColonexpiration_time(value: String): Self = StObject.set(x, "article:expiration_time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArticleColonexpiration_timeUndefined: Self = StObject.set(x, "article:expiration_time", js.undefined)
      
      @scala.inline
      def setArticleColonmodified_time(value: String): Self = StObject.set(x, "article:modified_time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArticleColonmodified_timeUndefined: Self = StObject.set(x, "article:modified_time", js.undefined)
      
      @scala.inline
      def setArticleColonpublished_time(value: String): Self = StObject.set(x, "article:published_time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArticleColonpublished_timeUndefined: Self = StObject.set(x, "article:published_time", js.undefined)
      
      @scala.inline
      def setArticleColonsection(value: String): Self = StObject.set(x, "article:section", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArticleColonsectionUndefined: Self = StObject.set(x, "article:section", js.undefined)
      
      @scala.inline
      def setArticleColontag(value: String): Self = StObject.set(x, "article:tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArticleColontagUndefined: Self = StObject.set(x, "article:tag", js.undefined)
      
      @scala.inline
      def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanonical(value: String): Self = StObject.set(x, "canonical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeywords(value: String): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOgColonarticleColonauthor(value: String): Self = StObject.set(x, "og:article:author", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOgColonarticleColonauthorUndefined: Self = StObject.set(x, "og:article:author", js.undefined)
      
      @scala.inline
      def setOgColonarticleColonexpiration_time(value: String): Self = StObject.set(x, "og:article:expiration_time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOgColonarticleColonexpiration_timeUndefined: Self = StObject.set(x, "og:article:expiration_time", js.undefined)
      
      @scala.inline
      def setOgColonarticleColonmodified_time(value: String): Self = StObject.set(x, "og:article:modified_time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOgColonarticleColonmodified_timeUndefined: Self = StObject.set(x, "og:article:modified_time", js.undefined)
      
      @scala.inline
      def setOgColonarticleColonpublished_time(value: String): Self = StObject.set(x, "og:article:published_time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOgColonarticleColonpublished_timeUndefined: Self = StObject.set(x, "og:article:published_time", js.undefined)
      
      @scala.inline
      def setOgColonarticleColonsection(value: String): Self = StObject.set(x, "og:article:section", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOgColonarticleColonsectionUndefined: Self = StObject.set(x, "og:article:section", js.undefined)
      
      @scala.inline
      def setOgColonarticleColontag(value: String): Self = StObject.set(x, "og:article:tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOgColonarticleColontagUndefined: Self = StObject.set(x, "og:article:tag", js.undefined)
      
      @scala.inline
      def setOgColondescription(value: String): Self = StObject.set(x, "og:description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOgColondeterminer(value: String): Self = StObject.set(x, "og:determiner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOgColonimage(value: String): Self = StObject.set(x, "og:image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOgColonimageColonheight(value: String): Self = StObject.set(x, "og:image:height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOgColonimageColonsecure_url(value: String): Self = StObject.set(x, "og:image:secure_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOgColonimageColontype(value: String): Self = StObject.set(x, "og:image:type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOgColonimageColonwidth(value: String): Self = StObject.set(x, "og:image:width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOgColonlocale(value: String): Self = StObject.set(x, "og:locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOgColonlocaleColonalternate(value: String): Self = StObject.set(x, "og:locale:alternate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOgColonsite_name(value: String): Self = StObject.set(x, "og:site_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOgColontitle(value: String): Self = StObject.set(x, "og:title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOgColontype(value: String): Self = StObject.set(x, "og:type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOgColonurl(value: String): Self = StObject.set(x, "og:url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
