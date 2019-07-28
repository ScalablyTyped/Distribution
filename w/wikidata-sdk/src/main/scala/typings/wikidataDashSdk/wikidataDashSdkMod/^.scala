package typings.wikidataDashSdk.wikidataDashSdkMod

import typings.std.Date
import typings.wikidataDashSdk.Anon_CaseInsensitive
import typings.wikidataDashSdk.Anon_Format
import typings.wikidataDashSdk.Anon_FormatIds
import typings.wikidataDashSdk.Anon_FormatLanguages
import typings.wikidataDashSdk.Anon_Site
import typings.wikidataDashSdk.defObjectClaimMod.WikidataClaim
import typings.wikidataDashSdk.defTypeFormatMod.UrlResultFormat
import typings.wikidataDashSdk.defTypeLanguageMod.WikidataLanguage
import typings.wikidataDashSdk.defTypePropertyMod.WikidataProperty
import typings.wikidataDashSdk.defTypeSiteMod.WikidataSite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wikidata-sdk", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getEntities(a: Anon_FormatIds): String = js.native
  def getEntities(ids: String): String = js.native
  def getEntities(ids: String, languages: js.Array[WikidataLanguage]): String = js.native
  def getEntities(ids: String, languages: js.Array[WikidataLanguage], props: js.Array[WikidataProperty]): String = js.native
  def getEntities(
    ids: String,
    languages: js.Array[WikidataLanguage],
    props: js.Array[WikidataProperty],
    format: UrlResultFormat
  ): String = js.native
  def getEntities(ids: String, languages: js.Array[WikidataLanguage], props: WikidataProperty): String = js.native
  def getEntities(
    ids: String,
    languages: js.Array[WikidataLanguage],
    props: WikidataProperty,
    format: UrlResultFormat
  ): String = js.native
  def getEntities(ids: String, languages: WikidataLanguage): String = js.native
  def getEntities(ids: String, languages: WikidataLanguage, props: js.Array[WikidataProperty]): String = js.native
  def getEntities(
    ids: String,
    languages: WikidataLanguage,
    props: js.Array[WikidataProperty],
    format: UrlResultFormat
  ): String = js.native
  def getEntities(ids: String, languages: WikidataLanguage, props: WikidataProperty): String = js.native
  def getEntities(ids: String, languages: WikidataLanguage, props: WikidataProperty, format: UrlResultFormat): String = js.native
  def getEntities(ids: js.Array[String]): String = js.native
  def getEntities(ids: js.Array[String], languages: js.Array[WikidataLanguage]): String = js.native
  def getEntities(ids: js.Array[String], languages: js.Array[WikidataLanguage], props: js.Array[WikidataProperty]): String = js.native
  def getEntities(
    ids: js.Array[String],
    languages: js.Array[WikidataLanguage],
    props: js.Array[WikidataProperty],
    format: UrlResultFormat
  ): String = js.native
  def getEntities(ids: js.Array[String], languages: js.Array[WikidataLanguage], props: WikidataProperty): String = js.native
  def getEntities(
    ids: js.Array[String],
    languages: js.Array[WikidataLanguage],
    props: WikidataProperty,
    format: UrlResultFormat
  ): String = js.native
  def getEntities(ids: js.Array[String], languages: WikidataLanguage): String = js.native
  def getEntities(ids: js.Array[String], languages: WikidataLanguage, props: js.Array[WikidataProperty]): String = js.native
  def getEntities(
    ids: js.Array[String],
    languages: WikidataLanguage,
    props: js.Array[WikidataProperty],
    format: UrlResultFormat
  ): String = js.native
  def getEntities(ids: js.Array[String], languages: WikidataLanguage, props: WikidataProperty): String = js.native
  def getEntities(
    ids: js.Array[String],
    languages: WikidataLanguage,
    props: WikidataProperty,
    format: UrlResultFormat
  ): String = js.native
  def getImageUrl(a: String): String = js.native
  def getImageUrl(a: String, width: Double): String = js.native
  def getManyEntities(a: Anon_FormatIds): js.Array[String] = js.native
  def getManyEntities(ids: String): js.Array[String] = js.native
  def getManyEntities(ids: String, languages: js.Array[WikidataLanguage]): js.Array[String] = js.native
  def getManyEntities(ids: String, languages: js.Array[WikidataLanguage], props: js.Array[WikidataProperty]): js.Array[String] = js.native
  def getManyEntities(
    ids: String,
    languages: js.Array[WikidataLanguage],
    props: js.Array[WikidataProperty],
    format: UrlResultFormat
  ): js.Array[String] = js.native
  def getManyEntities(ids: String, languages: js.Array[WikidataLanguage], props: WikidataProperty): js.Array[String] = js.native
  def getManyEntities(
    ids: String,
    languages: js.Array[WikidataLanguage],
    props: WikidataProperty,
    format: UrlResultFormat
  ): js.Array[String] = js.native
  def getManyEntities(ids: String, languages: WikidataLanguage): js.Array[String] = js.native
  def getManyEntities(ids: String, languages: WikidataLanguage, props: js.Array[WikidataProperty]): js.Array[String] = js.native
  def getManyEntities(
    ids: String,
    languages: WikidataLanguage,
    props: js.Array[WikidataProperty],
    format: UrlResultFormat
  ): js.Array[String] = js.native
  def getManyEntities(ids: String, languages: WikidataLanguage, props: WikidataProperty): js.Array[String] = js.native
  def getManyEntities(ids: String, languages: WikidataLanguage, props: WikidataProperty, format: UrlResultFormat): js.Array[String] = js.native
  def getManyEntities(ids: js.Array[String]): js.Array[String] = js.native
  def getManyEntities(ids: js.Array[String], languages: js.Array[WikidataLanguage]): js.Array[String] = js.native
  def getManyEntities(ids: js.Array[String], languages: js.Array[WikidataLanguage], props: js.Array[WikidataProperty]): js.Array[String] = js.native
  def getManyEntities(
    ids: js.Array[String],
    languages: js.Array[WikidataLanguage],
    props: js.Array[WikidataProperty],
    format: UrlResultFormat
  ): js.Array[String] = js.native
  def getManyEntities(ids: js.Array[String], languages: js.Array[WikidataLanguage], props: WikidataProperty): js.Array[String] = js.native
  def getManyEntities(
    ids: js.Array[String],
    languages: js.Array[WikidataLanguage],
    props: WikidataProperty,
    format: UrlResultFormat
  ): js.Array[String] = js.native
  def getManyEntities(ids: js.Array[String], languages: WikidataLanguage): js.Array[String] = js.native
  def getManyEntities(ids: js.Array[String], languages: WikidataLanguage, props: js.Array[WikidataProperty]): js.Array[String] = js.native
  def getManyEntities(
    ids: js.Array[String],
    languages: WikidataLanguage,
    props: js.Array[WikidataProperty],
    format: UrlResultFormat
  ): js.Array[String] = js.native
  def getManyEntities(ids: js.Array[String], languages: WikidataLanguage, props: WikidataProperty): js.Array[String] = js.native
  def getManyEntities(
    ids: js.Array[String],
    languages: WikidataLanguage,
    props: WikidataProperty,
    format: UrlResultFormat
  ): js.Array[String] = js.native
  def getNumericId(a: String): Boolean = js.native
  def getReverseClaims(property: String, value: String): String = js.native
  def getReverseClaims(property: String, value: String, options: Anon_CaseInsensitive): String = js.native
  def getReverseClaims(property: String, value: js.Array[String]): String = js.native
  def getReverseClaims(property: String, value: js.Array[String], options: Anon_CaseInsensitive): String = js.native
  def getReverseClaims(property: js.Array[String], value: String): String = js.native
  def getReverseClaims(property: js.Array[String], value: String, options: Anon_CaseInsensitive): String = js.native
  def getReverseClaims(property: js.Array[String], value: js.Array[String]): String = js.native
  def getReverseClaims(property: js.Array[String], value: js.Array[String], options: Anon_CaseInsensitive): String = js.native
  def getSitelinkData(a: String): SitelinkData = js.native
  def getSitelinkUrl(a: Anon_Site): String = js.native
  def getSitelinkUrl(site: WikidataSite, title: String): String = js.native
  def getWikidataIdsFromSitelinks(): Unit = js.native
  def getWikidataIdsFromWikipediaTitles(a: Anon_FormatLanguages): String = js.native
  def getWikidataIdsFromWikipediaTitles(titles: String): String = js.native
  def getWikidataIdsFromWikipediaTitles(titles: String, sites: WikidataSite): String = js.native
  def getWikidataIdsFromWikipediaTitles(titles: String, sites: WikidataSite, languages: js.Array[WikidataLanguage]): String = js.native
  def getWikidataIdsFromWikipediaTitles(
    titles: String,
    sites: WikidataSite,
    languages: js.Array[WikidataLanguage],
    props: js.Array[WikidataProperty]
  ): String = js.native
  def getWikidataIdsFromWikipediaTitles(
    titles: String,
    sites: WikidataSite,
    languages: js.Array[WikidataLanguage],
    props: js.Array[WikidataProperty],
    format: UrlResultFormat
  ): String = js.native
  def getWikidataIdsFromWikipediaTitles(
    titles: String,
    sites: WikidataSite,
    languages: js.Array[WikidataLanguage],
    props: WikidataProperty
  ): String = js.native
  def getWikidataIdsFromWikipediaTitles(
    titles: String,
    sites: WikidataSite,
    languages: js.Array[WikidataLanguage],
    props: WikidataProperty,
    format: UrlResultFormat
  ): String = js.native
  def getWikidataIdsFromWikipediaTitles(titles: String, sites: WikidataSite, languages: WikidataLanguage): String = js.native
  def getWikidataIdsFromWikipediaTitles(
    titles: String,
    sites: WikidataSite,
    languages: WikidataLanguage,
    props: js.Array[WikidataProperty]
  ): String = js.native
  def getWikidataIdsFromWikipediaTitles(
    titles: String,
    sites: WikidataSite,
    languages: WikidataLanguage,
    props: js.Array[WikidataProperty],
    format: UrlResultFormat
  ): String = js.native
  def getWikidataIdsFromWikipediaTitles(titles: String, sites: WikidataSite, languages: WikidataLanguage, props: WikidataProperty): String = js.native
  def getWikidataIdsFromWikipediaTitles(
    titles: String,
    sites: WikidataSite,
    languages: WikidataLanguage,
    props: WikidataProperty,
    format: UrlResultFormat
  ): String = js.native
  def getWikidataIdsFromWikipediaTitles(titles: js.Array[String]): String = js.native
  def getWikidataIdsFromWikipediaTitles(titles: js.Array[String], sites: WikidataSite): String = js.native
  def getWikidataIdsFromWikipediaTitles(titles: js.Array[String], sites: WikidataSite, languages: js.Array[WikidataLanguage]): String = js.native
  def getWikidataIdsFromWikipediaTitles(
    titles: js.Array[String],
    sites: WikidataSite,
    languages: js.Array[WikidataLanguage],
    props: js.Array[WikidataProperty]
  ): String = js.native
  def getWikidataIdsFromWikipediaTitles(
    titles: js.Array[String],
    sites: WikidataSite,
    languages: js.Array[WikidataLanguage],
    props: js.Array[WikidataProperty],
    format: UrlResultFormat
  ): String = js.native
  def getWikidataIdsFromWikipediaTitles(
    titles: js.Array[String],
    sites: WikidataSite,
    languages: js.Array[WikidataLanguage],
    props: WikidataProperty
  ): String = js.native
  def getWikidataIdsFromWikipediaTitles(
    titles: js.Array[String],
    sites: WikidataSite,
    languages: js.Array[WikidataLanguage],
    props: WikidataProperty,
    format: UrlResultFormat
  ): String = js.native
  def getWikidataIdsFromWikipediaTitles(titles: js.Array[String], sites: WikidataSite, languages: WikidataLanguage): String = js.native
  def getWikidataIdsFromWikipediaTitles(
    titles: js.Array[String],
    sites: WikidataSite,
    languages: WikidataLanguage,
    props: js.Array[WikidataProperty]
  ): String = js.native
  def getWikidataIdsFromWikipediaTitles(
    titles: js.Array[String],
    sites: WikidataSite,
    languages: WikidataLanguage,
    props: js.Array[WikidataProperty],
    format: UrlResultFormat
  ): String = js.native
  def getWikidataIdsFromWikipediaTitles(
    titles: js.Array[String],
    sites: WikidataSite,
    languages: WikidataLanguage,
    props: WikidataProperty
  ): String = js.native
  def getWikidataIdsFromWikipediaTitles(
    titles: js.Array[String],
    sites: WikidataSite,
    languages: WikidataLanguage,
    props: WikidataProperty,
    format: UrlResultFormat
  ): String = js.native
  def isEntityId(a: String): Boolean = js.native
  def isGuid(a: String): Boolean = js.native
  def isItemId(a: String): Boolean = js.native
  def isNumericId(a: String): Boolean = js.native
  def isPropertyId(a: String): Boolean = js.native
  def isSitelinkKey(a: String): Boolean = js.native
  def searchEntities(opt: Anon_Format): String = js.native
  def searchEntities(search: String): String = js.native
  def searchEntities(search: String, language: WikidataLanguage): String = js.native
  def searchEntities(search: String, language: WikidataLanguage, limit: String): String = js.native
  def searchEntities(search: String, language: WikidataLanguage, limit: String, format: UrlResultFormat): String = js.native
  def searchEntities(
    search: String,
    language: WikidataLanguage,
    limit: String,
    format: UrlResultFormat,
    uselang: WikidataLanguage
  ): String = js.native
  def searchEntities(search: String, language: WikidataLanguage, limit: Double): String = js.native
  def searchEntities(search: String, language: WikidataLanguage, limit: Double, format: UrlResultFormat): String = js.native
  def searchEntities(
    search: String,
    language: WikidataLanguage,
    limit: Double,
    format: UrlResultFormat,
    uselang: WikidataLanguage
  ): String = js.native
  def sparqlQuery(a: String): String = js.native
  def truthyClaims(claims: WikidataClaim): WikidataClaim = js.native
  def truthyPropertyClaims(claims: js.Array[WikidataClaim]): js.Array[WikidataClaim] = js.native
  def wikidataTimeToDateObject(a: String): Date = js.native
  def wikidataTimeToEpochTime(a: String): String = js.native
  def wikidataTimeToISOString(a: String): String = js.native
  def wikidataTimeToSimpleDay(a: String): String = js.native
  def wikidataTimeToSimpleDay(a: Json): String = js.native
}

