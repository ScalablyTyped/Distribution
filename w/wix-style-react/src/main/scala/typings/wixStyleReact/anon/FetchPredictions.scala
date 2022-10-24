package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchPredictions extends StObject {
  
  /** callback that fetches predictions from Atlas
    * @param {string} value Input text we want predictions for.
    * @param {AtlasRequestOptions} requestOptions (optional) Options to customize predictions: {
    *  @property { filterType: "zip_code" | "country_code", filterValue: string } filterBy
    (optional) filter results by country or zip code;
    *  @property {latitude: number, longitude: number} location
    (optional) the point around which you wish to retrieve place information;
    *  @property {latitude: number, longitude: number} origin
    (optional) the origin point from which to calculate straight-line distance to the destination;
    *  @property {number} radius (optional) the distance (in meters) within which to return place results;
    * }
    * @returns {Promise<Prediction[]>} */
  def fetchPredictions(value: Any, requestOptions: Any): js.Promise[
    js.UndefOr[
      js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_types.V2Prediction */ Any
      ]
    ]
  ]
  
  /** callback that fetches details for a place given its atlas `searchId`
    * @param {string} searchId identifier for atlas prediction result we want to get additional details for
    * @returns {Promise<Address>} */
  def getAddress(searchId: Any): js.Promise[Any]
  
  /** whether component is ready */
  var ready: Boolean
  
  /** callback that searches for addresses matching given value
    * @param {string} query Input text to search address for
    * @returns {Promise<Address[]>}
    */
  def searchAddresses(query: Any): js.Promise[
    js.Array[
      js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_types.CommonAddress */ Any
      ]
    ]
  ]
}
object FetchPredictions {
  
  inline def apply(
    fetchPredictions: (Any, Any) => js.Promise[
      js.UndefOr[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_types.V2Prediction */ Any
        ]
      ]
    ],
    getAddress: Any => js.Promise[Any],
    ready: Boolean,
    searchAddresses: Any => js.Promise[
      js.Array[
        js.UndefOr[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_types.CommonAddress */ Any
        ]
      ]
    ]
  ): FetchPredictions = {
    val __obj = js.Dynamic.literal(fetchPredictions = js.Any.fromFunction2(fetchPredictions), getAddress = js.Any.fromFunction1(getAddress), ready = ready.asInstanceOf[js.Any], searchAddresses = js.Any.fromFunction1(searchAddresses))
    __obj.asInstanceOf[FetchPredictions]
  }
  
  extension [Self <: FetchPredictions](x: Self) {
    
    inline def setFetchPredictions(
      value: (Any, Any) => js.Promise[
          js.UndefOr[
            js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_types.V2Prediction */ Any
            ]
          ]
        ]
    ): Self = StObject.set(x, "fetchPredictions", js.Any.fromFunction2(value))
    
    inline def setGetAddress(value: Any => js.Promise[Any]): Self = StObject.set(x, "getAddress", js.Any.fromFunction1(value))
    
    inline def setReady(value: Boolean): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
    
    inline def setSearchAddresses(
      value: Any => js.Promise[
          js.Array[
            js.UndefOr[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_types.CommonAddress */ Any
            ]
          ]
        ]
    ): Self = StObject.set(x, "searchAddresses", js.Any.fromFunction1(value))
  }
}
