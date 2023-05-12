package typings.wikibaseSdk

import typings.wikibaseSdk.distSrcTypesEntityMod.EntityId
import typings.wikibaseSdk.distSrcTypesEntityMod.RevisionId
import typings.wikibaseSdk.distSrcTypesOptionsMod.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcQueriesGetEntityRevisionMod {
  
  @JSImport("wikibase-sdk/dist/src/queries/get_entity_revision", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEntityRevisionFactory(instance: Url, wgScriptPath: String): js.Function1[/* param0 */ GetEntityRevisionOptions, Url] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEntityRevisionFactory")(instance.asInstanceOf[js.Any], wgScriptPath.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* param0 */ GetEntityRevisionOptions, Url]]
  
  trait GetEntityRevisionOptions extends StObject {
    
    var id: EntityId
    
    var revision: RevisionId
  }
  object GetEntityRevisionOptions {
    
    inline def apply(id: EntityId, revision: RevisionId): GetEntityRevisionOptions = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetEntityRevisionOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetEntityRevisionOptions] (val x: Self) extends AnyVal {
      
      inline def setId(value: EntityId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setRevision(value: RevisionId): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    }
  }
}
