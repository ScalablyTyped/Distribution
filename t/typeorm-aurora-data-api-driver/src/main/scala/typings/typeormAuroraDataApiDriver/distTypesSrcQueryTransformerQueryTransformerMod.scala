package typings.typeormAuroraDataApiDriver

import typings.typeormAuroraDataApiDriver.anon.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSrcQueryTransformerQueryTransformerMod {
  
  /* note: abstract class */ @JSImport("typeorm-aurora-data-api-driver/dist/types/src/query-transformer/query-transformer", "QueryTransformer")
  @js.native
  open class QueryTransformer () extends StObject {
    def this(transformOptions: Any) = this()
    
    def prepareHydratedValue(
      value: Any,
      metadata: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColumnMetadata */ Any
    ): Any = js.native
    
    def preparePersistentValue(
      value: Any,
      metadata: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColumnMetadata */ Any
    ): Any = js.native
    
    /* protected */ var transformOptions: js.UndefOr[Any] = js.native
    
    /* protected */ def transformParameters(): js.UndefOr[js.Array[Any]] = js.native
    /* protected */ def transformParameters(srcParameters: js.Array[Any]): js.UndefOr[js.Array[Any]] = js.native
    
    /* protected */ def transformQuery(query: String, srcParameters: js.Array[Any]): String = js.native
    
    def transformQueryAndParameters(query: String): Parameters = js.native
    def transformQueryAndParameters(query: String, srcParameters: js.Array[Any]): Parameters = js.native
  }
  
  trait QueryTransformationResult extends StObject {
    
    var parameters: js.Array[Any]
    
    var queryString: String
  }
  object QueryTransformationResult {
    
    inline def apply(parameters: js.Array[Any], queryString: String): QueryTransformationResult = {
      val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryTransformationResult]
    }
    
    extension [Self <: QueryTransformationResult](x: Self) {
      
      inline def setParameters(value: js.Array[Any]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersVarargs(value: Any*): Self = StObject.set(x, "parameters", js.Array(value*))
      
      inline def setQueryString(value: String): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    }
  }
}
