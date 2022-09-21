package typings.tizenTvWebapis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AVPlayStoreManager extends StObject {
  
  /**
    * Creates a player instance that can be used for parallel pre-buffering. Up to 4 player instances can exist simultaneously.
    *
    * @returns AVPlayManagerObject Created AVPlayManagerObject object
    *
    * @privilegeLevel Non-privilege
    *
    * @privilegeName None
    *
    * @throw WebAPIException with error type QUOTA_EXCEEDED_ERR (Max player count reached) if there is insufficient memory to create the instance, or the number of player instances exceeds 4.
    *
    * @version 1.0
    *
    * @since 2.3
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
