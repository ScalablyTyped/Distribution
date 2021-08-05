package typings.winstonDynamodb

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.std.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("winston-dynamodb", "DynamoDB")
  @js.native
  class DynamoDB ()
    extends StObject
       with Transport
       with DynamoDBTransportInstance {
    def this(options: DynamoDBTransportOptions) = this()
    
    var AWS: js.Any = js.native
    
    var db: js.Any = js.native
    
    var dynamoDoc: Boolean = js.native
    
    var level: String = js.native
    
    def log(level: js.Any, msg: js.Any, meta: js.Any, callback: js.Any): js.Any = js.native
    
    var name: String = js.native
    
    var region: String = js.native
    
    var regions: js.Array[String] = js.native
    
    var tableName: String = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransportInstance * / any */ @js.native
  trait DynamoDBTransportInstance
    extends StObject
       with Instantiable0[DynamoDBTransportInstance]
       with Instantiable1[/* options */ DynamoDBTransportOptions, DynamoDBTransportInstance]
  
  trait DynamoDBTransportOptions extends StObject {
    
    var accessKeyId: js.UndefOr[String] = js.undefined
    
    var dynamoDoc: js.UndefOr[Boolean] = js.undefined
    
    var level: String
    
    var region: js.UndefOr[String] = js.undefined
    
    var secretAccessKey: js.UndefOr[String] = js.undefined
    
    var tableName: String
    
    var useEnvironment: js.UndefOr[Boolean] = js.undefined
  }
  object DynamoDBTransportOptions {
    
    inline def apply(level: String, tableName: String): DynamoDBTransportOptions = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DynamoDBTransportOptions]
    }
    
    extension [Self <: DynamoDBTransportOptions](x: Self) {
      
      inline def setAccessKeyId(value: String): Self = StObject.set(x, "accessKeyId", value.asInstanceOf[js.Any])
      
      inline def setAccessKeyIdUndefined: Self = StObject.set(x, "accessKeyId", js.undefined)
      
      inline def setDynamoDoc(value: Boolean): Self = StObject.set(x, "dynamoDoc", value.asInstanceOf[js.Any])
      
      inline def setDynamoDocUndefined: Self = StObject.set(x, "dynamoDoc", js.undefined)
      
      inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setSecretAccessKey(value: String): Self = StObject.set(x, "secretAccessKey", value.asInstanceOf[js.Any])
      
      inline def setSecretAccessKeyUndefined: Self = StObject.set(x, "secretAccessKey", js.undefined)
      
      inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
      
      inline def setUseEnvironment(value: Boolean): Self = StObject.set(x, "useEnvironment", value.asInstanceOf[js.Any])
      
      inline def setUseEnvironmentUndefined: Self = StObject.set(x, "useEnvironment", js.undefined)
    }
  }
  
  /* augmented module */
  object winstonAugmentingMod {
    
    trait Transports extends StObject {
      
      var DynamoDB: typings.winstonDynamodb.mod.DynamoDB
    }
    object Transports {
      
      inline def apply(DynamoDB: DynamoDB): Transports = {
        val __obj = js.Dynamic.literal(DynamoDB = DynamoDB.asInstanceOf[js.Any])
        __obj.asInstanceOf[Transports]
      }
      
      extension [Self <: Transports](x: Self) {
        
        inline def setDynamoDB(value: DynamoDB): Self = StObject.set(x, "DynamoDB", value.asInstanceOf[js.Any])
      }
    }
  }
}
