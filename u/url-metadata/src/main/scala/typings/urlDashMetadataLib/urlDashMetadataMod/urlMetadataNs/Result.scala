package typings
package urlDashMetadataLib.urlDashMetadataMod.urlMetadataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var `article:author`: js.UndefOr[java.lang.String] = js.undefined
  var `article:expiration_time`: js.UndefOr[java.lang.String] = js.undefined
  var `article:modified_time`: js.UndefOr[java.lang.String] = js.undefined
  var `article:published_time`: js.UndefOr[java.lang.String] = js.undefined
  var `article:section`: js.UndefOr[java.lang.String] = js.undefined
  var `article:tag`: js.UndefOr[java.lang.String] = js.undefined
  var author: java.lang.String
  var canonical: java.lang.String
  var description: java.lang.String
  var image: java.lang.String
  var keywords: java.lang.String
  var `og:article:author`: js.UndefOr[java.lang.String] = js.undefined
  var `og:article:expiration_time`: js.UndefOr[java.lang.String] = js.undefined
  var `og:article:modified_time`: js.UndefOr[java.lang.String] = js.undefined
  var `og:article:published_time`: js.UndefOr[java.lang.String] = js.undefined
  var `og:article:section`: js.UndefOr[java.lang.String] = js.undefined
  var `og:article:tag`: js.UndefOr[java.lang.String] = js.undefined
  var `og:description`: java.lang.String
  var `og:determiner`: java.lang.String
  var `og:image`: java.lang.String
  var `og:image:height`: java.lang.String
  var `og:image:secure_url`: java.lang.String
  var `og:image:type`: java.lang.String
  var `og:image:width`: java.lang.String
  var `og:locale`: java.lang.String
  var `og:locale:alternate`: java.lang.String
  var `og:site_name`: java.lang.String
  var `og:title`: java.lang.String
  var `og:type`: java.lang.String
  var `og:url`: java.lang.String
  var source: java.lang.String
  var title: java.lang.String
  var url: java.lang.String
}

object Result {
  @scala.inline
  def apply(
    author: java.lang.String,
    canonical: java.lang.String,
    description: java.lang.String,
    image: java.lang.String,
    keywords: java.lang.String,
    `og:description`: java.lang.String,
    `og:determiner`: java.lang.String,
    `og:image`: java.lang.String,
    `og:image:height`: java.lang.String,
    `og:image:secure_url`: java.lang.String,
    `og:image:type`: java.lang.String,
    `og:image:width`: java.lang.String,
    `og:locale`: java.lang.String,
    `og:locale:alternate`: java.lang.String,
    `og:site_name`: java.lang.String,
    `og:title`: java.lang.String,
    `og:type`: java.lang.String,
    `og:url`: java.lang.String,
    source: java.lang.String,
    title: java.lang.String,
    url: java.lang.String,
    `article:author`: java.lang.String = null,
    `article:expiration_time`: java.lang.String = null,
    `article:modified_time`: java.lang.String = null,
    `article:published_time`: java.lang.String = null,
    `article:section`: java.lang.String = null,
    `article:tag`: java.lang.String = null,
    `og:article:author`: java.lang.String = null,
    `og:article:expiration_time`: java.lang.String = null,
    `og:article:modified_time`: java.lang.String = null,
    `og:article:published_time`: java.lang.String = null,
    `og:article:section`: java.lang.String = null,
    `og:article:tag`: java.lang.String = null
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

