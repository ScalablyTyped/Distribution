package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * initCloudOptions 的 env 参数，可以指定各个服务的默认环境
  */
trait InitCloudEnvOptions extends StObject {
  
  /**
    * 数据库 API 默认环境配置
    * 默认值： default
    */
  var database: js.UndefOr[String] = js.undefined
  
  /**
    * 云函数 API 默认环境配置
    * 默认值： default
    */
  var functions: js.UndefOr[String] = js.undefined
  
  /**
    * 存储 API 默认环境配置
    * 默认值： default
    */
  var storage: js.UndefOr[String] = js.undefined
}
object InitCloudEnvOptions {
  
  inline def apply(): InitCloudEnvOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitCloudEnvOptions]
  }
  
  extension [Self <: InitCloudEnvOptions](x: Self) {
    
    inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    inline def setFunctions(value: String): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
    
    inline def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
    
    inline def setStorage(value: String): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    inline def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
  }
}
