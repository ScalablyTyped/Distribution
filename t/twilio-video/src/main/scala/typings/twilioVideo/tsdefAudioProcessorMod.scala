package typings.twilioVideo

import typings.std.MediaStreamTrack
import typings.twilioVideo.tsdefTypesMod.NoiseCancellationVendor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsdefAudioProcessorMod {
  
  trait AudioProcessor extends StObject {
    
    /**
      * connects and cleans given stream
      * @returns {MediaStreamTrack} clean track
      */
    def connect(sourceTrack: MediaStreamTrack): MediaStreamTrack
    
    /**
      * destroys the processor freeing up any resources
      * @returns {void}
      */
    def destroy(): Unit
    
    /**
      * disables noise cancellation.
      * @returns {void}
      */
    def disable(): Unit
    
    /**
      * stops processing previously connected stream
      * @returns {void}
      */
    def disconnect(): Unit
    
    /**
      * enables noise cancellation.
      * @returns {void}
      */
    def enable(): Unit
    
    /**
      * checks if AudioProcessor is connected to a stream
      * @returns {boolean} true if a stream is connected.
      */
    def isConnected(): Boolean
    
    /**
      * checks if AudioProcessor is currently enabled
      * @returns {boolean} true if audio processor is enabled.
      */
    def isEnabled(): Boolean
    
    /**
      * checks if AudioProcessor is initialized (not destroyed)
      * @returns {boolean} true if audio processor is initialized.
      */
    def isInitialized(): Boolean
    
    /**
      * enables/disables logging
      * @param {boolean} [enable] - Specify true to enable logging
      * @returns {void}
      */
    def setLogging(enable: Boolean): Unit
    
    /**
      * @property {NoiseCancellationVendor} vendor
      */
    var vendor: NoiseCancellationVendor
  }
  object AudioProcessor {
    
    inline def apply(
      connect: MediaStreamTrack => MediaStreamTrack,
      destroy: () => Unit,
      disable: () => Unit,
      disconnect: () => Unit,
      enable: () => Unit,
      isConnected: () => Boolean,
      isEnabled: () => Boolean,
      isInitialized: () => Boolean,
      setLogging: Boolean => Unit,
      vendor: NoiseCancellationVendor
    ): AudioProcessor = {
      val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect), destroy = js.Any.fromFunction0(destroy), disable = js.Any.fromFunction0(disable), disconnect = js.Any.fromFunction0(disconnect), enable = js.Any.fromFunction0(enable), isConnected = js.Any.fromFunction0(isConnected), isEnabled = js.Any.fromFunction0(isEnabled), isInitialized = js.Any.fromFunction0(isInitialized), setLogging = js.Any.fromFunction1(setLogging), vendor = vendor.asInstanceOf[js.Any])
      __obj.asInstanceOf[AudioProcessor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AudioProcessor] (val x: Self) extends AnyVal {
      
      inline def setConnect(value: MediaStreamTrack => MediaStreamTrack): Self = StObject.set(x, "connect", js.Any.fromFunction1(value))
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setDisable(value: () => Unit): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
      
      inline def setDisconnect(value: () => Unit): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
      
      inline def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
      
      inline def setIsConnected(value: () => Boolean): Self = StObject.set(x, "isConnected", js.Any.fromFunction0(value))
      
      inline def setIsEnabled(value: () => Boolean): Self = StObject.set(x, "isEnabled", js.Any.fromFunction0(value))
      
      inline def setIsInitialized(value: () => Boolean): Self = StObject.set(x, "isInitialized", js.Any.fromFunction0(value))
      
      inline def setSetLogging(value: Boolean => Unit): Self = StObject.set(x, "setLogging", js.Any.fromFunction1(value))
      
      inline def setVendor(value: NoiseCancellationVendor): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
    }
  }
}
