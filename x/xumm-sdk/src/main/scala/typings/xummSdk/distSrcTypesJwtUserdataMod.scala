package typings.xummSdk

import typings.xummSdk.distSrcTypesMetaAnyJsonMod.AnyJson
import typings.xummSdk.xummSdkStrings.LIST
import typings.xummSdk.xummSdkStrings.PERSIST
import typings.xummSdk.xummSdkStrings.REMOVE
import typings.xummSdk.xummSdkStrings.RETRIEVE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesJwtUserdataMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait JwtUserdataDelete extends StObject {
    
    var operation: REMOVE
    
    var persisted: Boolean
  }
  object JwtUserdataDelete {
    
    inline def apply(persisted: Boolean): JwtUserdataDelete = {
      val __obj = js.Dynamic.literal(operation = "REMOVE", persisted = persisted.asInstanceOf[js.Any])
      __obj.asInstanceOf[JwtUserdataDelete]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JwtUserdataDelete] (val x: Self) extends AnyVal {
      
      inline def setOperation(value: REMOVE): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
      
      inline def setPersisted(value: Boolean): Self = StObject.set(x, "persisted", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait JwtUserdataGet extends StObject {
    
    var count: Double
    
    var data: AnyJson
    
    var keys: js.Array[String]
    
    var operation: RETRIEVE
  }
  object JwtUserdataGet {
    
    inline def apply(count: Double, data: AnyJson, keys: js.Array[String]): JwtUserdataGet = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], operation = "RETRIEVE")
      __obj.asInstanceOf[JwtUserdataGet]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JwtUserdataGet] (val x: Self) extends AnyVal {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setData(value: AnyJson): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value*))
      
      inline def setOperation(value: RETRIEVE): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait JwtUserdataList extends StObject {
    
    var count: Double
    
    var keys: js.Array[String]
    
    var operation: LIST
  }
  object JwtUserdataList {
    
    inline def apply(count: Double, keys: js.Array[String]): JwtUserdataList = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], operation = "LIST")
      __obj.asInstanceOf[JwtUserdataList]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JwtUserdataList] (val x: Self) extends AnyVal {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value*))
      
      inline def setOperation(value: LIST): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait JwtUserdataSet extends StObject {
    
    var operation: PERSIST
    
    var persisted: Boolean
  }
  object JwtUserdataSet {
    
    inline def apply(persisted: Boolean): JwtUserdataSet = {
      val __obj = js.Dynamic.literal(operation = "PERSIST", persisted = persisted.asInstanceOf[js.Any])
      __obj.asInstanceOf[JwtUserdataSet]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JwtUserdataSet] (val x: Self) extends AnyVal {
      
      inline def setOperation(value: PERSIST): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
      
      inline def setPersisted(value: Boolean): Self = StObject.set(x, "persisted", value.asInstanceOf[js.Any])
    }
  }
}
