package typings.wikidataDashSdk.wikidataDashSdkMod

import typings.wikidataDashSdk.Anon_AddUrl
import typings.wikidataDashSdk.defObjectLanguageDashBaseDashStringMod.WikidataLanguageBaseArrayString
import typings.wikidataDashSdk.defObjectLanguageDashBaseDashStringMod.WikidataLanguageBaseArrayStringSimplify
import typings.wikidataDashSdk.defObjectLanguageDashBaseDashStringMod.WikidataLanguageBaseString
import typings.wikidataDashSdk.defObjectLanguageDashBaseDashStringMod.WikidataLanguageBaseStringSimplify
import typings.wikidataDashSdk.defObjectSitelinkMod.WikidataSiteLink
import typings.wikidataDashSdk.defObjectSitelinkMod.WikidataSiteLinkSimplify
import typings.wikidataDashSdk.defObjectSitelinkMod.WikidataSiteLinkWithUrlSimplify
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wikidata-sdk", "simplify")
@js.native
object simplify extends js.Object {
  /**
    * Make alias simplifier and easier to understand
    *
    * @param aliases alias object, you will receive this from getEntities method
    *
    * @example
    *
    * const alias = simplify.aliases("{ pl: [ { language: 'pl', value: 'Tom' }, { language: 'pl', value: 'Tomik' } ] }");
    * console.log(alias) // { pl: [ 'Tom', 'Tomik' ] }
    *
    * @see {@link https://github.com/maxlath/wikidata-sdk/blob/master/docs/simplify_entities_data.md#simplify-aliases | Github[simplify-aliases]}
    */
  def aliases(aliases: WikidataLanguageBaseArrayString): WikidataLanguageBaseArrayStringSimplify = js.native
  /**
    * Make description simplifier and easier to understand
    *
    * @param descriptions description object, you will receive this from getEntities method
    *
    * @example
    *
    * const desc = simplify.descriptions("{ pl: { language: 'pl', value: 'dokument piśmienniczy [...]' } }");
    * console.log(desc) // { pl: 'dokument piśmienniczy [...]' }
    *
    * @see {@link https://github.com/maxlath/wikidata-sdk/blob/master/docs/simplify_entities_data.md#simplify-descriptions | Github[simplify-descriptions]}
    */
  def descriptions(descriptions: WikidataLanguageBaseString): WikidataLanguageBaseStringSimplify = js.native
  /**
    * This is a same of {@link entity} method except this input as multiple array of entities.
    *
    * @param entities entities from {@link getEntities} APIs
    * @param opt simlify option. currently only simplify claims and simplify sitelinks.
    *
    * @see {@link https://github.com/maxlath/wikidata-sdk/blob/master/docs/simplify_entities_data.md#simplify-entities | Github[simplify-entities]}
    */
  def entities[T](entities: js.Array[T]): js.Array[T] = js.native
  def entities[T](entities: js.Array[T], opt: SimplifyOption): js.Array[T] = js.native
  /**
    * Applying all simplifiers at once: labels, descriptions, aliases, claims, sitelinks. See next sections for details.
    * You can also pass options as a second argument, that will then be passed the subfunctions:
    *
    * @param entity the entity that receive from {@link getEntities} APIs
    * @param opt simlify option. currently only simplify claims and simplify sitelinks.
    *
    * @see {@link https://github.com/maxlath/wikidata-sdk/blob/master/docs/simplify_entities_data.md#simplify-entity | Github[simplify-entity]}
    */
  def entity[T](entity: T): T = js.native
  def entity[T](entity: T, opt: SimplifyOption): T = js.native
  /**
    * Make label simplifier and easier to understand
    *
    * @param labels label object, you will receive this from getEntities method
    *
    * @example
    *
    * const label = simplify.labels("{ pl: { language: 'pl', value: 'książka' } }");
    * console.log(label) // { pl: 'książka' }
    *
    * @see {@link https://github.com/maxlath/wikidata-sdk/blob/master/docs/simplify_entities_data.md#simplify-labels | Github[simplify-labels]}
    */
  def labels(labels: WikidataLanguageBaseString): WikidataLanguageBaseStringSimplify = js.native
  /**
    * Make sitelink simplifier and easier to understand
    *
    * @param sitelinks sitelink object, you will receive this from getEntities method
    *
    * @example
    *
    * const site = simplify.sitelinks("{ plwiki: { site: 'plwiki', title: 'Książka', badges: [] } }");
    * console.log(site) // { plwiki: 'Książka' }
    *
    * @see {@link https://github.com/maxlath/wikidata-sdk/blob/master/docs/simplify_entities_data.md#simplify-sitelinks | Github[simplify-sitelinks]}
    */
  def sitelinks(sitelinks: WikidataSiteLink): WikidataSiteLinkSimplify = js.native
  /**
    * Make sitelink simplifier and easier to understand. include URL in the result.
    *
    * @param sitelinks sitelink object, you will receive this from getEntities method
    * @param options add url to a result
    *
    * @example
    *
    * const site = simplify.sitelinks("{ plwiki: { site: 'plwiki', title: 'Książka', badges: [] } }", {addUrl: true});
    * console.log(site) // { plwiki: { title: 'Książka', url: 'https://pl.wikipedia.org/wiki/Książka' } }
    *
    * @see {@link https://github.com/maxlath/wikidata-sdk/blob/master/docs/simplify_entities_data.md#add-sitelinks-urls | Github[simplify-sitelinks-with-url]}
    */
  def sitelinks(sitelinks: WikidataSiteLink, options: Anon_AddUrl): WikidataSiteLinkWithUrlSimplify = js.native
}

