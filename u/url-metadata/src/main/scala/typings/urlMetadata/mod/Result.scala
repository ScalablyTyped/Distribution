package typings.urlMetadata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Result extends js.Object {
  
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
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuthor(value: String): Self = this.set("author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanonical(value: String): Self = this.set("canonical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywords(value: String): Self = this.set("keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOgColondescription(value: String): Self = this.set("og:description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOgColondeterminer(value: String): Self = this.set("og:determiner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOgColonimage(value: String): Self = this.set("og:image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOgColonimageColonheight(value: String): Self = this.set("og:image:height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOgColonimageColonsecure_url(value: String): Self = this.set("og:image:secure_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOgColonimageColontype(value: String): Self = this.set("og:image:type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOgColonimageColonwidth(value: String): Self = this.set("og:image:width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOgColonlocale(value: String): Self = this.set("og:locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOgColonlocaleColonalternate(value: String): Self = this.set("og:locale:alternate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOgColonsite_name(value: String): Self = this.set("og:site_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOgColontitle(value: String): Self = this.set("og:title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOgColontype(value: String): Self = this.set("og:type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOgColonurl(value: String): Self = this.set("og:url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArticleColonauthor(value: String): Self = this.set("article:author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArticleColonauthor: Self = this.set("article:author", js.undefined)
    
    @scala.inline
    def setArticleColonexpiration_time(value: String): Self = this.set("article:expiration_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArticleColonexpiration_time: Self = this.set("article:expiration_time", js.undefined)
    
    @scala.inline
    def setArticleColonmodified_time(value: String): Self = this.set("article:modified_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArticleColonmodified_time: Self = this.set("article:modified_time", js.undefined)
    
    @scala.inline
    def setArticleColonpublished_time(value: String): Self = this.set("article:published_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArticleColonpublished_time: Self = this.set("article:published_time", js.undefined)
    
    @scala.inline
    def setArticleColonsection(value: String): Self = this.set("article:section", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArticleColonsection: Self = this.set("article:section", js.undefined)
    
    @scala.inline
    def setArticleColontag(value: String): Self = this.set("article:tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArticleColontag: Self = this.set("article:tag", js.undefined)
    
    @scala.inline
    def setOgColonarticleColonauthor(value: String): Self = this.set("og:article:author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOgColonarticleColonauthor: Self = this.set("og:article:author", js.undefined)
    
    @scala.inline
    def setOgColonarticleColonexpiration_time(value: String): Self = this.set("og:article:expiration_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOgColonarticleColonexpiration_time: Self = this.set("og:article:expiration_time", js.undefined)
    
    @scala.inline
    def setOgColonarticleColonmodified_time(value: String): Self = this.set("og:article:modified_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOgColonarticleColonmodified_time: Self = this.set("og:article:modified_time", js.undefined)
    
    @scala.inline
    def setOgColonarticleColonpublished_time(value: String): Self = this.set("og:article:published_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOgColonarticleColonpublished_time: Self = this.set("og:article:published_time", js.undefined)
    
    @scala.inline
    def setOgColonarticleColonsection(value: String): Self = this.set("og:article:section", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOgColonarticleColonsection: Self = this.set("og:article:section", js.undefined)
    
    @scala.inline
    def setOgColonarticleColontag(value: String): Self = this.set("og:article:tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOgColonarticleColontag: Self = this.set("og:article:tag", js.undefined)
  }
}
