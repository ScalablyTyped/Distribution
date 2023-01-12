package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaControllerAbilityChangeCallback extends StObject {
  
  /**
    * Event triggered when server's display mode ability is updated.
    *
    * @param server Server which triggered the event.
    * @param abilities Object with current state of display mode abilities on the media controller server.
    */
  def ondisplaymodeabilitychanged(server: MediaControllerServerInfo, abilities: MediaControllerDisplayModeAbilitiesInfo): Unit
  
  /**
    * Event triggered when server's display rotation is updated.
    *
    * @param server Server which triggered the event.
    * @param abilities Object with current state of display mode abilities on the media controller server.
    */
  def ondisplayrotationabilitychanged(server: MediaControllerServerInfo, abilities: MediaControllerDisplayRotationAbilitiesInfo): Unit
  
  /**
    * Event triggered when server's playback ability is updated.
    *
    * @param server Server which triggered the event.
    * @param abilities Object with current state of playback abilities on the media controller server.
    */
  def onplaybackabilitychanged(server: MediaControllerServerInfo, abilities: MediaControllerPlaybackAbilitiesInfo): Unit
  
  /**
    * Event triggered when server's simple ability is updated.
    *
    * @param server Server which triggered the event.
    * @param type Type of simple ability.
    * @param support Ability value which was set on the media controller server.
    */
  def onsimpleabilitychanged(
    server: MediaControllerServerInfo,
    `type`: MediaControllerSimpleAbility,
    support: MediaControllerAbilitySupport
  ): Unit
}
object MediaControllerAbilityChangeCallback {
  
  inline def apply(
    ondisplaymodeabilitychanged: (MediaControllerServerInfo, MediaControllerDisplayModeAbilitiesInfo) => Unit,
    ondisplayrotationabilitychanged: (MediaControllerServerInfo, MediaControllerDisplayRotationAbilitiesInfo) => Unit,
    onplaybackabilitychanged: (MediaControllerServerInfo, MediaControllerPlaybackAbilitiesInfo) => Unit,
    onsimpleabilitychanged: (MediaControllerServerInfo, MediaControllerSimpleAbility, MediaControllerAbilitySupport) => Unit
  ): MediaControllerAbilityChangeCallback = {
    val __obj = js.Dynamic.literal(ondisplaymodeabilitychanged = js.Any.fromFunction2(ondisplaymodeabilitychanged), ondisplayrotationabilitychanged = js.Any.fromFunction2(ondisplayrotationabilitychanged), onplaybackabilitychanged = js.Any.fromFunction2(onplaybackabilitychanged), onsimpleabilitychanged = js.Any.fromFunction3(onsimpleabilitychanged))
    __obj.asInstanceOf[MediaControllerAbilityChangeCallback]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaControllerAbilityChangeCallback] (val x: Self) extends AnyVal {
    
    inline def setOndisplaymodeabilitychanged(value: (MediaControllerServerInfo, MediaControllerDisplayModeAbilitiesInfo) => Unit): Self = StObject.set(x, "ondisplaymodeabilitychanged", js.Any.fromFunction2(value))
    
    inline def setOndisplayrotationabilitychanged(value: (MediaControllerServerInfo, MediaControllerDisplayRotationAbilitiesInfo) => Unit): Self = StObject.set(x, "ondisplayrotationabilitychanged", js.Any.fromFunction2(value))
    
    inline def setOnplaybackabilitychanged(value: (MediaControllerServerInfo, MediaControllerPlaybackAbilitiesInfo) => Unit): Self = StObject.set(x, "onplaybackabilitychanged", js.Any.fromFunction2(value))
    
    inline def setOnsimpleabilitychanged(
      value: (MediaControllerServerInfo, MediaControllerSimpleAbility, MediaControllerAbilitySupport) => Unit
    ): Self = StObject.set(x, "onsimpleabilitychanged", js.Any.fromFunction3(value))
  }
}
