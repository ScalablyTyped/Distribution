package typings.urlMetadata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
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
    url: String,
    articleColonauthor: String = null,
    articleColonexpiration_time: String = null,
    articleColonmodified_time: String = null,
    articleColonpublished_time: String = null,
    articleColonsection: String = null,
    articleColontag: String = null,
    ogColonarticleColonauthor: String = null,
    ogColonarticleColonexpiration_time: String = null,
    ogColonarticleColonmodified_time: String = null,
    ogColonarticleColonpublished_time: String = null,
    ogColonarticleColonsection: String = null,
    ogColonarticleColontag: String = null
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
    if (articleColonauthor != null) __obj.updateDynamic("article:author")(articleColonauthor.asInstanceOf[js.Any])
    if (articleColonexpiration_time != null) __obj.updateDynamic("article:expiration_time")(articleColonexpiration_time.asInstanceOf[js.Any])
    if (articleColonmodified_time != null) __obj.updateDynamic("article:modified_time")(articleColonmodified_time.asInstanceOf[js.Any])
    if (articleColonpublished_time != null) __obj.updateDynamic("article:published_time")(articleColonpublished_time.asInstanceOf[js.Any])
    if (articleColonsection != null) __obj.updateDynamic("article:section")(articleColonsection.asInstanceOf[js.Any])
    if (articleColontag != null) __obj.updateDynamic("article:tag")(articleColontag.asInstanceOf[js.Any])
    if (ogColonarticleColonauthor != null) __obj.updateDynamic("og:article:author")(ogColonarticleColonauthor.asInstanceOf[js.Any])
    if (ogColonarticleColonexpiration_time != null) __obj.updateDynamic("og:article:expiration_time")(ogColonarticleColonexpiration_time.asInstanceOf[js.Any])
    if (ogColonarticleColonmodified_time != null) __obj.updateDynamic("og:article:modified_time")(ogColonarticleColonmodified_time.asInstanceOf[js.Any])
    if (ogColonarticleColonpublished_time != null) __obj.updateDynamic("og:article:published_time")(ogColonarticleColonpublished_time.asInstanceOf[js.Any])
    if (ogColonarticleColonsection != null) __obj.updateDynamic("og:article:section")(ogColonarticleColonsection.asInstanceOf[js.Any])
    if (ogColonarticleColontag != null) __obj.updateDynamic("og:article:tag")(ogColonarticleColontag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
}

