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
    
    @scala.inline
    def apply(appId: String): AppId = {
      val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppId]
    }
    
    @scala.inline
    implicit class AppIdMutableBuilder[Self <: AppId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    }
  }
  
  trait Scale extends StObject {
    
    var scale: Double
  }
  object Scale {
    
    @scala.inline
    def apply(scale: Double): Scale = {
      val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
      __obj.asInstanceOf[Scale]
    }
    
    @scala.inline
    implicit class ScaleMutableBuilder[Self <: Scale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    }
  }
  
  trait TapIndex extends StObject {
    
    var tapIndex: Double
  }
  object TapIndex {
    
    @scala.inline
    def apply(tapIndex: Double): TapIndex = {
      val __obj = js.Dynamic.literal(tapIndex = tapIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[TapIndex]
    }
    
    @scala.inline
    implicit class TapIndexMutableBuilder[Self <: TapIndex] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTapIndex(value: Double): Self = StObject.set(x, "tapIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait Vetsion extends StObject {
    
    //  插件appId
    var appId: String
    
    //  插件版本号
    var vetsion: String
  }
  object Vetsion {
    
    @scala.inline
    def apply(appId: String, vetsion: String): Vetsion = {
      val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], vetsion = vetsion.asInstanceOf[js.Any])
      __obj.asInstanceOf[Vetsion]
    }
    
    @scala.inline
    implicit class VetsionMutableBuilder[Self <: Vetsion] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVetsion(value: String): Self = StObject.set(x, "vetsion", value.asInstanceOf[js.Any])
    }
  }
}
