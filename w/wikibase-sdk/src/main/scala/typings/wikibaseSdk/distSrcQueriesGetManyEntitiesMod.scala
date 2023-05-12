package typings.wikibaseSdk

import typings.wikibaseSdk.distSrcQueriesGetEntitiesMod.GetEntitiesOptions
import typings.wikibaseSdk.distSrcTypesEntityMod.EntityId
import typings.wikibaseSdk.distSrcTypesOptionsMod.Url
import typings.wikibaseSdk.distSrcUtilsBuildUrlMod.BuildUrlFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcQueriesGetManyEntitiesMod {
  
  @JSImport("wikibase-sdk/dist/src/queries/get_many_entities", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getManyEntitiesFactory(buildUrl: BuildUrlFunction): js.Function1[/* param0 */ GetManyEntitiesOptions, js.Array[Url]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getManyEntitiesFactory")(buildUrl.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* param0 */ GetManyEntitiesOptions, js.Array[Url]]]
  
  trait GetManyEntitiesOptions
    extends StObject
       with GetEntitiesOptions {
    
    @JSName("ids")
    var ids_GetManyEntitiesOptions: js.Array[EntityId]
  }
  object GetManyEntitiesOptions {
    
    inline def apply(ids: js.Array[EntityId]): GetManyEntitiesOptions = {
      val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetManyEntitiesOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetManyEntitiesOptions] (val x: Self) extends AnyVal {
      
      inline def setIds(value: js.Array[EntityId]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      inline def setIdsVarargs(value: EntityId*): Self = StObject.set(x, "ids", js.Array(value*))
    }
  }
}
