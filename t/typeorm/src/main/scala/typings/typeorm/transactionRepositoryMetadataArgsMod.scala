package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transactionRepositoryMetadataArgsMod {
  
  trait TransactionRepositoryMetadataArgs extends StObject {
    
    /**
      * Argument of generic Repository<T> class if it's not custom repository class.
      */
    val entityType: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Index of the parameter on which decorator is used.
      */
    val index: Double
    
    /**
      * Method on which decorator is used.
      */
    val methodName: String
    
    /**
      * Type of the repository class (Repository, TreeRepository or MongoRepository) or custom repository class.
      */
    val repositoryType: js.Function
    
    /**
      * Target class on which decorator is used.
      */
    val target: js.Function
  }
  object TransactionRepositoryMetadataArgs {
    
    inline def apply(index: Double, methodName: String, repositoryType: js.Function, target: js.Function): TransactionRepositoryMetadataArgs = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any], repositoryType = repositoryType.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransactionRepositoryMetadataArgs]
    }
    
    extension [Self <: TransactionRepositoryMetadataArgs](x: Self) {
      
      inline def setEntityType(value: js.Function): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
      
      inline def setEntityTypeUndefined: Self = StObject.set(x, "entityType", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
      
      inline def setRepositoryType(value: js.Function): Self = StObject.set(x, "repositoryType", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: js.Function): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
