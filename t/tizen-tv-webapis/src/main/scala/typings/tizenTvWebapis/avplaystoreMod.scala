package typings.tizenTvWebapis

import typings.tizenTvWebapis.avplayMod.AVPlayManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object avplaystoreMod {
  
  trait AVPlayStoreManager extends StObject {
    
    /**
      * Creates a player instance that can be used for parallel pre-buffering. Up to 4 player instances can exist simultaneously.
      * @returns AVPlayManagerObject Created AVPlayManagerObject object
      * @throw WebAPIException QUOTA_EXCEEDED_ERR (Max player count reached)
      * @note You can create player instances using the open method or the getPlayer method. The getPlayer method allows you to create player instances that can pre-buffer simultaneously, so you can switch between player instances smoothly. For example, while playing an advertisement video, you can pre-buffer movie content so that movie playback begins immediately after the advertisement ends. You can call the getPlayer method multiple times to create multiple player instances. The instances can buffer simultaneously, but only 1 can be playing at a time.
      */
    def getPlayer(): AVPlayManager
  }
  object AVPlayStoreManager {
    
    inline def apply(getPlayer: () => AVPlayManager): AVPlayStoreManager = {
      val __obj = js.Dynamic.literal(getPlayer = js.Any.fromFunction0(getPlayer))
      __obj.asInstanceOf[AVPlayStoreManager]
    }
    
    extension [Self <: AVPlayStoreManager](x: Self) {
      
      inline def setGetPlayer(value: () => AVPlayManager): Self = StObject.set(x, "getPlayer", js.Any.fromFunction0(value))
    }
  }
}
