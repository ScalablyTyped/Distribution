package typings.winstonDynamodb

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.std.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("winston-dynamodb", "DynamoDB")
  @js.native
  class DynamoDB ()
    extends Transport
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
    extends Instantiable0[DynamoDBTransportInstance]
       with Instantiable1[/* options */ DynamoDBTransportOptions, DynamoDBTransportInstance]
  
  @js.native
  trait DynamoDBTransportOptions extends StObject {
    
    var accessKeyId: js.UndefOr[String] = js.native
    
    var dynamoDoc: js.UndefOr[Boolean] = js.native
    
    var level: String = js.native
    
    var region: js.UndefOr[String] = js.native
    
    var secretAccessKey: js.UndefOr[String] = js.native
    
    var tableName: String = js.native
    
    var useEnvironment: js.UndefOr[Boolean] = js.native
  }
  object DynamoDBTransportOptions {
    
    @scala.inline
    def apply(level: String, tableName: String): DynamoDBTransportOptions = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DynamoDBTransportOptions]
    }
    
    @scala.inline
    implicit class DynamoDBTransportOptionsMutableBuilder[Self <: DynamoDBTransportOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessKeyId(value: String): Self = StObject.set(x, "accessKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessKeyIdUndefined: Self = StObject.set(x, "accessKeyId", js.undefined)
      
      @scala.inline
      def setDynamoDoc(value: Boolean): Self = StObject.set(x, "dynamoDoc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDynamoDocUndefined: Self = StObject.set(x, "dynamoDoc", js.undefined)
      
      @scala.inline
      def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      @scala.inline
      def setSecretAccessKey(value: String): Self = StObject.set(x, "secretAccessKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretAccessKeyUndefined: Self = StObject.set(x, "secretAccessKey", js.undefined)
      
      @scala.inline
      def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseEnvironment(value: Boolean): Self = StObject.set(x, "useEnvironment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseEnvironmentUndefined: Self = StObject.set(x, "useEnvironment", js.undefined)
    }
  }
  
  /* augmented module */
  object winstonAugmentingMod {
    
    @js.native
    trait Transports extends StObject {
      
      var DynamoDB: typings.winstonDynamodb.mod.DynamoDB = js.native
    }
    object Transports {
      
      @scala.inline
      def apply(DynamoDB: DynamoDB): Transports = {
        val __obj = js.Dynamic.literal(DynamoDB = DynamoDB.asInstanceOf[js.Any])
        __obj.asInstanceOf[Transports]
      }
      
      @scala.inline
      implicit class TransportsMutableBuilder[Self <: Transports] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDynamoDB(value: DynamoDB): Self = StObject.set(x, "DynamoDB", value.asInstanceOf[js.Any])
      }
    }
  }
}
