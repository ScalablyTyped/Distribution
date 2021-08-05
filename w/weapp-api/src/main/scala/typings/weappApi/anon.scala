package typings.weappApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AppId extends StObject {
    
    //  小程序appId
    var appId: String
  }
  object AppId {
    
    inline def apply(appId: String): AppId = {
      val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppId]
    }
    
    extension [Self <: AppId](x: Self) {
      
      inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    }
  }
  
  trait Scale extends StObject {
    
    var scale: Double
  }
  object Scale {
    
    inline def apply(scale: Double): Scale = {
      val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
      __obj.asInstanceOf[Scale]
    }
    
    extension [Self <: Scale](x: Self) {
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    }
  }
  
  trait TapIndex extends StObject {
    
    var tapIndex: Double
  }
  object TapIndex {
    
    inline def apply(tapIndex: Double): TapIndex = {
      val __obj = js.Dynamic.literal(tapIndex = tapIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[TapIndex]
    }
    
    extension [Self <: TapIndex](x: Self) {
      
      inline def setTapIndex(value: Double): Self = StObject.set(x, "tapIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait Vetsion extends StObject {
    
    //  插件appId
    var appId: String
    
    //  插件版本号
    var vetsion: String
  }
  object Vetsion {
    
    inline def apply(appId: String, vetsion: String): Vetsion = {
      val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], vetsion = vetsion.asInstanceOf[js.Any])
      __obj.asInstanceOf[Vetsion]
    }
    
    extension [Self <: Vetsion](x: Self) {
      
      inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      inline def setVetsion(value: String): Self = StObject.set(x, "vetsion", value.asInstanceOf[js.Any])
    }
  }
}
