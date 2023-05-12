package typings.wikibaseSdk

import typings.std.ReturnType
import typings.wikibaseSdk.distSrcHelpersTimeMod.TimeInputValue
import typings.wikibaseSdk.distSrcQueriesCirrusSearchMod.CirrusSearchPagesOptions
import typings.wikibaseSdk.distSrcQueriesGetEntitiesFromSitelinksMod.GetEntitiesFromSitelinksOptions
import typings.wikibaseSdk.distSrcQueriesGetEntitiesMod.GetEntitiesOptions
import typings.wikibaseSdk.distSrcQueriesGetEntityRevisionMod.GetEntityRevisionOptions
import typings.wikibaseSdk.distSrcQueriesGetManyEntitiesMod.GetManyEntitiesOptions
import typings.wikibaseSdk.distSrcQueriesGetReverseClaimsMod.GetReverseClaimsOptions
import typings.wikibaseSdk.distSrcQueriesGetRevisionsMod.GetRevisionsOptions
import typings.wikibaseSdk.distSrcQueriesSearchEntitiesMod.SearchEntitiesOptions
import typings.wikibaseSdk.distSrcTypesOptionsMod.InstanceConfig
import typings.wikibaseSdk.distSrcTypesOptionsMod.Url
import typings.wikibaseSdk.distSrcUtilsBuildUrlMod.BuildUrlFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcWikibaseSdkMod {
  
  @JSImport("wikibase-sdk/dist/src/wikibase-sdk", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def WBK_(config: InstanceConfig): Wbk = ^.asInstanceOf[js.Dynamic].applyDynamic("WBK")(config.asInstanceOf[js.Any]).asInstanceOf[Wbk]
  
  trait ApiQueries extends StObject {
    
    val cirrusSearchPages: ReturnType[
        js.Function1[
          /* buildUrl */ BuildUrlFunction, 
          js.Function1[/* options */ CirrusSearchPagesOptions, Url]
        ]
      ]
    
    val getEntities: ReturnType[
        js.Function1[
          /* buildUrl */ BuildUrlFunction, 
          js.Function1[/* param0 */ GetEntitiesOptions, Url]
        ]
      ]
    
    val getEntitiesFromSitelinks: ReturnType[
        js.Function1[
          /* buildUrl */ BuildUrlFunction, 
          js.Function1[/* param0 */ GetEntitiesFromSitelinksOptions, Url]
        ]
      ]
    
    val getEntityRevision: ReturnType[
        js.Function2[
          /* instance */ Url, 
          /* wgScriptPath */ String, 
          js.Function1[/* param0 */ GetEntityRevisionOptions, Url]
        ]
      ]
    
    val getManyEntities: ReturnType[
        js.Function1[
          /* buildUrl */ BuildUrlFunction, 
          js.Function1[/* param0 */ GetManyEntitiesOptions, js.Array[Url]]
        ]
      ]
    
    val getRevisions: ReturnType[
        js.Function1[
          /* buildUrl */ BuildUrlFunction, 
          js.Function1[/* param0 */ GetRevisionsOptions, String]
        ]
      ]
    
    val searchEntities: ReturnType[
        js.Function1[
          /* buildUrl */ BuildUrlFunction, 
          js.Function1[/* param0 */ SearchEntitiesOptions, Url]
        ]
      ]
  }
  object ApiQueries {
    
    inline def apply(
      cirrusSearchPages: ReturnType[
          js.Function1[
            /* buildUrl */ BuildUrlFunction, 
            js.Function1[/* options */ CirrusSearchPagesOptions, Url]
          ]
        ],
      getEntities: ReturnType[
          js.Function1[
            /* buildUrl */ BuildUrlFunction, 
            js.Function1[/* param0 */ GetEntitiesOptions, Url]
          ]
        ],
      getEntitiesFromSitelinks: ReturnType[
          js.Function1[
            /* buildUrl */ BuildUrlFunction, 
            js.Function1[/* param0 */ GetEntitiesFromSitelinksOptions, Url]
          ]
        ],
      getEntityRevision: ReturnType[
          js.Function2[
            /* instance */ Url, 
            /* wgScriptPath */ String, 
            js.Function1[/* param0 */ GetEntityRevisionOptions, Url]
          ]
        ],
      getManyEntities: ReturnType[
          js.Function1[
            /* buildUrl */ BuildUrlFunction, 
            js.Function1[/* param0 */ GetManyEntitiesOptions, js.Array[Url]]
          ]
        ],
      getRevisions: ReturnType[
          js.Function1[
            /* buildUrl */ BuildUrlFunction, 
            js.Function1[/* param0 */ GetRevisionsOptions, String]
          ]
        ],
      searchEntities: ReturnType[
          js.Function1[
            /* buildUrl */ BuildUrlFunction, 
            js.Function1[/* param0 */ SearchEntitiesOptions, Url]
          ]
        ]
    ): ApiQueries = {
      val __obj = js.Dynamic.literal(cirrusSearchPages = cirrusSearchPages.asInstanceOf[js.Any], getEntities = getEntities.asInstanceOf[js.Any], getEntitiesFromSitelinks = getEntitiesFromSitelinks.asInstanceOf[js.Any], getEntityRevision = getEntityRevision.asInstanceOf[js.Any], getManyEntities = getManyEntities.asInstanceOf[js.Any], getRevisions = getRevisions.asInstanceOf[js.Any], searchEntities = searchEntities.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApiQueries]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ApiQueries] (val x: Self) extends AnyVal {
      
      inline def setCirrusSearchPages(
        value: ReturnType[
              js.Function1[
                /* buildUrl */ BuildUrlFunction, 
                js.Function1[/* options */ CirrusSearchPagesOptions, Url]
              ]
            ]
      ): Self = StObject.set(x, "cirrusSearchPages", value.asInstanceOf[js.Any])
      
      inline def setGetEntities(
        value: ReturnType[
              js.Function1[
                /* buildUrl */ BuildUrlFunction, 
                js.Function1[/* param0 */ GetEntitiesOptions, Url]
              ]
            ]
      ): Self = StObject.set(x, "getEntities", value.asInstanceOf[js.Any])
      
      inline def setGetEntitiesFromSitelinks(
        value: ReturnType[
              js.Function1[
                /* buildUrl */ BuildUrlFunction, 
                js.Function1[/* param0 */ GetEntitiesFromSitelinksOptions, Url]
              ]
            ]
      ): Self = StObject.set(x, "getEntitiesFromSitelinks", value.asInstanceOf[js.Any])
      
      inline def setGetEntityRevision(
        value: ReturnType[
              js.Function2[
                /* instance */ Url, 
                /* wgScriptPath */ String, 
                js.Function1[/* param0 */ GetEntityRevisionOptions, Url]
              ]
            ]
      ): Self = StObject.set(x, "getEntityRevision", value.asInstanceOf[js.Any])
      
      inline def setGetManyEntities(
        value: ReturnType[
              js.Function1[
                /* buildUrl */ BuildUrlFunction, 
                js.Function1[/* param0 */ GetManyEntitiesOptions, js.Array[Url]]
              ]
            ]
      ): Self = StObject.set(x, "getManyEntities", value.asInstanceOf[js.Any])
      
      inline def setGetRevisions(
        value: ReturnType[
              js.Function1[
                /* buildUrl */ BuildUrlFunction, 
                js.Function1[/* param0 */ GetRevisionsOptions, String]
              ]
            ]
      ): Self = StObject.set(x, "getRevisions", value.asInstanceOf[js.Any])
      
      inline def setSearchEntities(
        value: ReturnType[
              js.Function1[
                /* buildUrl */ BuildUrlFunction, 
                js.Function1[/* param0 */ SearchEntitiesOptions, Url]
              ]
            ]
      ): Self = StObject.set(x, "searchEntities", value.asInstanceOf[js.Any])
    }
  }
  
  trait Instance extends StObject {
    
    val apiEndpoint: Url
    
    val root: Url
  }
  object Instance {
    
    inline def apply(apiEndpoint: Url, root: Url): Instance = {
      val __obj = js.Dynamic.literal(apiEndpoint = apiEndpoint.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[Instance]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Instance] (val x: Self) extends AnyVal {
      
      inline def setApiEndpoint(value: Url): Self = StObject.set(x, "apiEndpoint", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: Url): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
  
  trait SparqlQueries extends StObject {
    
    val getReverseClaims: ReturnType[
        js.Function1[/* sparqlEndpoint */ Url, js.Function1[/* options */ GetReverseClaimsOptions, Url]]
      ]
    
    val sparqlQuery: ReturnType[js.Function1[/* sparqlEndpoint */ Url, js.Function1[/* sparql */ String, Url]]]
  }
  object SparqlQueries {
    
    inline def apply(
      getReverseClaims: ReturnType[
          js.Function1[/* sparqlEndpoint */ Url, js.Function1[/* options */ GetReverseClaimsOptions, Url]]
        ],
      sparqlQuery: ReturnType[js.Function1[/* sparqlEndpoint */ Url, js.Function1[/* sparql */ String, Url]]]
    ): SparqlQueries = {
      val __obj = js.Dynamic.literal(getReverseClaims = getReverseClaims.asInstanceOf[js.Any], sparqlQuery = sparqlQuery.asInstanceOf[js.Any])
      __obj.asInstanceOf[SparqlQueries]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SparqlQueries] (val x: Self) extends AnyVal {
      
      inline def setGetReverseClaims(
        value: ReturnType[
              js.Function1[/* sparqlEndpoint */ Url, js.Function1[/* options */ GetReverseClaimsOptions, Url]]
            ]
      ): Self = StObject.set(x, "getReverseClaims", value.asInstanceOf[js.Any])
      
      inline def setSparqlQuery(value: ReturnType[js.Function1[/* sparqlEndpoint */ Url, js.Function1[/* sparql */ String, Url]]]): Self = StObject.set(x, "sparqlQuery", value.asInstanceOf[js.Any])
    }
  }
  
  trait Wbk
    extends StObject
       with ApiQueries
       with SparqlQueries {
    
    val instance: Instance
    
    def isEntityId(id: String): /* is wikibase-sdk.wikibase-sdk/dist/src/types/entity.EntityId */ Boolean
    
    def isEntitySchemaId(id: String): /* is / * template literal string: E${number} * / string */ Boolean
    
    def isFormId(id: String): /* is / * template literal string: L${number}-F${number} * / string */ Boolean
    
    def isGuid(id: String): /* is string */ Boolean
    
    def isHash(id: String): /* is string */ Boolean
    
    def isItemId(id: String): /* is / * template literal string: Q${number} * / string */ Boolean
    
    def isLexemeId(id: String): /* is / * template literal string: L${number} * / string */ Boolean
    
    def isMediaInfoId(id: String): /* is / * template literal string: M${number} * / string */ Boolean
    
    def isNonNestedEntityId(id: String): /* is wikibase-sdk.wikibase-sdk/dist/src/types/entity.NonNestedEntityId */ Boolean
    
    def isNumericId(id: String): /* is / * template literal string: ${number} * / string */ Boolean
    
    def isPropertyId(id: String): /* is / * template literal string: P${number} * / string */ Boolean
    
    def isRevisionId(id: String): /* is / * template literal string: ${number} * / string */ Boolean
    
    def isSenseId(id: String): /* is / * template literal string: L${number}-S${number} * / string */ Boolean
    
    def isSitelinkKey(site: String): Boolean
    
    def wikibaseTimeToEpochTime(value: TimeInputValue): String | Double
    
    def wikibaseTimeToISOString(value: TimeInputValue): String
    
    def wikibaseTimeToSimpleDay(value: TimeInputValue): String
    
    val wikimediaLanguageCodes: js.Array[Any]
  }
  object Wbk {
    
    inline def apply(
      cirrusSearchPages: ReturnType[
          js.Function1[
            /* buildUrl */ BuildUrlFunction, 
            js.Function1[/* options */ CirrusSearchPagesOptions, Url]
          ]
        ],
      getEntities: ReturnType[
          js.Function1[
            /* buildUrl */ BuildUrlFunction, 
            js.Function1[/* param0 */ GetEntitiesOptions, Url]
          ]
        ],
      getEntitiesFromSitelinks: ReturnType[
          js.Function1[
            /* buildUrl */ BuildUrlFunction, 
            js.Function1[/* param0 */ GetEntitiesFromSitelinksOptions, Url]
          ]
        ],
      getEntityRevision: ReturnType[
          js.Function2[
            /* instance */ Url, 
            /* wgScriptPath */ String, 
            js.Function1[/* param0 */ GetEntityRevisionOptions, Url]
          ]
        ],
      getManyEntities: ReturnType[
          js.Function1[
            /* buildUrl */ BuildUrlFunction, 
            js.Function1[/* param0 */ GetManyEntitiesOptions, js.Array[Url]]
          ]
        ],
      getReverseClaims: ReturnType[
          js.Function1[/* sparqlEndpoint */ Url, js.Function1[/* options */ GetReverseClaimsOptions, Url]]
        ],
      getRevisions: ReturnType[
          js.Function1[
            /* buildUrl */ BuildUrlFunction, 
            js.Function1[/* param0 */ GetRevisionsOptions, String]
          ]
        ],
      instance: Instance,
      isEntityId: String => /* is wikibase-sdk.wikibase-sdk/dist/src/types/entity.EntityId */ Boolean,
      isEntitySchemaId: String => /* is / * template literal string: E${number} * / string */ Boolean,
      isFormId: String => /* is / * template literal string: L${number}-F${number} * / string */ Boolean,
      isGuid: String => /* is string */ Boolean,
      isHash: String => /* is string */ Boolean,
      isItemId: String => /* is / * template literal string: Q${number} * / string */ Boolean,
      isLexemeId: String => /* is / * template literal string: L${number} * / string */ Boolean,
      isMediaInfoId: String => /* is / * template literal string: M${number} * / string */ Boolean,
      isNonNestedEntityId: String => /* is wikibase-sdk.wikibase-sdk/dist/src/types/entity.NonNestedEntityId */ Boolean,
      isNumericId: String => /* is / * template literal string: ${number} * / string */ Boolean,
      isPropertyId: String => /* is / * template literal string: P${number} * / string */ Boolean,
      isRevisionId: String => /* is / * template literal string: ${number} * / string */ Boolean,
      isSenseId: String => /* is / * template literal string: L${number}-S${number} * / string */ Boolean,
      isSitelinkKey: String => Boolean,
      searchEntities: ReturnType[
          js.Function1[
            /* buildUrl */ BuildUrlFunction, 
            js.Function1[/* param0 */ SearchEntitiesOptions, Url]
          ]
        ],
      sparqlQuery: ReturnType[js.Function1[/* sparqlEndpoint */ Url, js.Function1[/* sparql */ String, Url]]],
      wikibaseTimeToEpochTime: TimeInputValue => String | Double,
      wikibaseTimeToISOString: TimeInputValue => String,
      wikibaseTimeToSimpleDay: TimeInputValue => String,
      wikimediaLanguageCodes: js.Array[Any]
    ): Wbk = {
      val __obj = js.Dynamic.literal(cirrusSearchPages = cirrusSearchPages.asInstanceOf[js.Any], getEntities = getEntities.asInstanceOf[js.Any], getEntitiesFromSitelinks = getEntitiesFromSitelinks.asInstanceOf[js.Any], getEntityRevision = getEntityRevision.asInstanceOf[js.Any], getManyEntities = getManyEntities.asInstanceOf[js.Any], getReverseClaims = getReverseClaims.asInstanceOf[js.Any], getRevisions = getRevisions.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], isEntityId = js.Any.fromFunction1(isEntityId), isEntitySchemaId = js.Any.fromFunction1(isEntitySchemaId), isFormId = js.Any.fromFunction1(isFormId), isGuid = js.Any.fromFunction1(isGuid), isHash = js.Any.fromFunction1(isHash), isItemId = js.Any.fromFunction1(isItemId), isLexemeId = js.Any.fromFunction1(isLexemeId), isMediaInfoId = js.Any.fromFunction1(isMediaInfoId), isNonNestedEntityId = js.Any.fromFunction1(isNonNestedEntityId), isNumericId = js.Any.fromFunction1(isNumericId), isPropertyId = js.Any.fromFunction1(isPropertyId), isRevisionId = js.Any.fromFunction1(isRevisionId), isSenseId = js.Any.fromFunction1(isSenseId), isSitelinkKey = js.Any.fromFunction1(isSitelinkKey), searchEntities = searchEntities.asInstanceOf[js.Any], sparqlQuery = sparqlQuery.asInstanceOf[js.Any], wikibaseTimeToEpochTime = js.Any.fromFunction1(wikibaseTimeToEpochTime), wikibaseTimeToISOString = js.Any.fromFunction1(wikibaseTimeToISOString), wikibaseTimeToSimpleDay = js.Any.fromFunction1(wikibaseTimeToSimpleDay), wikimediaLanguageCodes = wikimediaLanguageCodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Wbk]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Wbk] (val x: Self) extends AnyVal {
      
      inline def setInstance(value: Instance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      inline def setIsEntityId(value: String => /* is wikibase-sdk.wikibase-sdk/dist/src/types/entity.EntityId */ Boolean): Self = StObject.set(x, "isEntityId", js.Any.fromFunction1(value))
      
      inline def setIsEntitySchemaId(value: String => /* is / * template literal string: E${number} * / string */ Boolean): Self = StObject.set(x, "isEntitySchemaId", js.Any.fromFunction1(value))
      
      inline def setIsFormId(value: String => /* is / * template literal string: L${number}-F${number} * / string */ Boolean): Self = StObject.set(x, "isFormId", js.Any.fromFunction1(value))
      
      inline def setIsGuid(value: String => /* is string */ Boolean): Self = StObject.set(x, "isGuid", js.Any.fromFunction1(value))
      
      inline def setIsHash(value: String => /* is string */ Boolean): Self = StObject.set(x, "isHash", js.Any.fromFunction1(value))
      
      inline def setIsItemId(value: String => /* is / * template literal string: Q${number} * / string */ Boolean): Self = StObject.set(x, "isItemId", js.Any.fromFunction1(value))
      
      inline def setIsLexemeId(value: String => /* is / * template literal string: L${number} * / string */ Boolean): Self = StObject.set(x, "isLexemeId", js.Any.fromFunction1(value))
      
      inline def setIsMediaInfoId(value: String => /* is / * template literal string: M${number} * / string */ Boolean): Self = StObject.set(x, "isMediaInfoId", js.Any.fromFunction1(value))
      
      inline def setIsNonNestedEntityId(
        value: String => /* is wikibase-sdk.wikibase-sdk/dist/src/types/entity.NonNestedEntityId */ Boolean
      ): Self = StObject.set(x, "isNonNestedEntityId", js.Any.fromFunction1(value))
      
      inline def setIsNumericId(value: String => /* is / * template literal string: ${number} * / string */ Boolean): Self = StObject.set(x, "isNumericId", js.Any.fromFunction1(value))
      
      inline def setIsPropertyId(value: String => /* is / * template literal string: P${number} * / string */ Boolean): Self = StObject.set(x, "isPropertyId", js.Any.fromFunction1(value))
      
      inline def setIsRevisionId(value: String => /* is / * template literal string: ${number} * / string */ Boolean): Self = StObject.set(x, "isRevisionId", js.Any.fromFunction1(value))
      
      inline def setIsSenseId(value: String => /* is / * template literal string: L${number}-S${number} * / string */ Boolean): Self = StObject.set(x, "isSenseId", js.Any.fromFunction1(value))
      
      inline def setIsSitelinkKey(value: String => Boolean): Self = StObject.set(x, "isSitelinkKey", js.Any.fromFunction1(value))
      
      inline def setWikibaseTimeToEpochTime(value: TimeInputValue => String | Double): Self = StObject.set(x, "wikibaseTimeToEpochTime", js.Any.fromFunction1(value))
      
      inline def setWikibaseTimeToISOString(value: TimeInputValue => String): Self = StObject.set(x, "wikibaseTimeToISOString", js.Any.fromFunction1(value))
      
      inline def setWikibaseTimeToSimpleDay(value: TimeInputValue => String): Self = StObject.set(x, "wikibaseTimeToSimpleDay", js.Any.fromFunction1(value))
      
      inline def setWikimediaLanguageCodes(value: js.Array[Any]): Self = StObject.set(x, "wikimediaLanguageCodes", value.asInstanceOf[js.Any])
      
      inline def setWikimediaLanguageCodesVarargs(value: Any*): Self = StObject.set(x, "wikimediaLanguageCodes", js.Array(value*))
    }
  }
}
