package typings.urlDashMetadata.urlDashMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var `article:author`: js.UndefOr[String] = js.undefined
  var `article:expiration_time`: js.UndefOr[String] = js.undefined
  var `article:modified_time`: js.UndefOr[String] = js.undefined
  var `article:published_time`: js.UndefOr[String] = js.undefined
  var `article:section`: js.UndefOr[String] = js.undefined
  var `article:tag`: js.UndefOr[String] = js.undefined
  var author: String
  var canonical: String
  var description: String
  var image: String
  var keywords: String
  var `og:article:author`: js.UndefOr[String] = js.undefined
  var `og:article:expiration_time`: js.UndefOr[String] = js.undefined
  var `og:article:modified_time`: js.UndefOr[String] = js.undefined
  var `og:article:published_time`: js.UndefOr[String] = js.undefined
  var `og:article:section`: js.UndefOr[String] = js.undefined
  var `og:article:tag`: js.UndefOr[String] = js.undefined
  var `og:description`: String
  var `og:determiner`: String
  var `og:image`: String
  var `og:image:height`: String
  var `og:image:secure_url`: String
  var `og:image:type`: String
  var `og:image:width`: String
  var `og:locale`: String
  var `og:locale:alternate`: String
  var `og:site_name`: String
  var `og:title`: String
  var `og:type`: String
  var `og:url`: String
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
    `og:description`: String,
    `og:determiner`: String,
    `og:image`: String,
    `og:image:height`: String,
    `og:image:secure_url`: String,
    `og:image:type`: String,
    `og:image:width`: String,
    `og:locale`: String,
    `og:locale:alternate`: String,
    `og:site_name`: String,
    `og:title`: String,
    `og:type`: String,
    `og:url`: String,
    source: String,
    title: String,
    url: String,
    `article:author`: String = null,
    `article:expiration_time`: String = null,
    `article:modified_time`: String = null,
    `article:published_time`: String = null,
    `article:section`: String = null,
    `article:tag`: String = null,
    `og:article:author`: String = null,
    `og:article:expiration_time`: String = null,
    `og:article:modified_time`: String = null,
    `og:article:published_time`: String = null,
    `og:article:section`: String = null,
    `og:article:tag`: String = null
  ): Result = {
    val __obj = js.Dynamic.literal(author = author, canonical = canonical, description = description, image = image, keywords = keywords, source = source, title = title, url = url)
    __obj.updateDynamic("og:description")(`og:description`)
    __obj.updateDynamic("og:determiner")(`og:determiner`)
    __obj.updateDynamic("og:image")(`og:image`)
    __obj.updateDynamic("og:image:height")(`og:image:height`)
    __obj.updateDynamic("og:image:secure_url")(`og:image:secure_url`)
    __obj.updateDynamic("og:image:type")(`og:image:type`)
    __obj.updateDynamic("og:image:width")(`og:image:width`)
    __obj.updateDynamic("og:locale")(`og:locale`)
    __obj.updateDynamic("og:locale:alternate")(`og:locale:alternate`)
    __obj.updateDynamic("og:site_name")(`og:site_name`)
    __obj.updateDynamic("og:title")(`og:title`)
    __obj.updateDynamic("og:type")(`og:type`)
    __obj.updateDynamic("og:url")(`og:url`)
    if (`article:author` != null) __obj.updateDynamic("article:author")(`article:author`)
    if (`article:expiration_time` != null) __obj.updateDynamic("article:expiration_time")(`article:expiration_time`)
    if (`article:modified_time` != null) __obj.updateDynamic("article:modified_time")(`article:modified_time`)
    if (`article:published_time` != null) __obj.updateDynamic("article:published_time")(`article:published_time`)
    if (`article:section` != null) __obj.updateDynamic("article:section")(`article:section`)
    if (`article:tag` != null) __obj.updateDynamic("article:tag")(`article:tag`)
    if (`og:article:author` != null) __obj.updateDynamic("og:article:author")(`og:article:author`)
    if (`og:article:expiration_time` != null) __obj.updateDynamic("og:article:expiration_time")(`og:article:expiration_time`)
    if (`og:article:modified_time` != null) __obj.updateDynamic("og:article:modified_time")(`og:article:modified_time`)
    if (`og:article:published_time` != null) __obj.updateDynamic("og:article:published_time")(`og:article:published_time`)
    if (`og:article:section` != null) __obj.updateDynamic("og:article:section")(`og:article:section`)
    if (`og:article:tag` != null) __obj.updateDynamic("og:article:tag")(`og:article:tag`)
    __obj.asInstanceOf[Result]
  }
}

