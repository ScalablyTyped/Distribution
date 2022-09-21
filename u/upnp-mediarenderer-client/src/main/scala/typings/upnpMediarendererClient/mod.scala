package typings.upnpMediarendererClient

import typings.upnpMediarendererClient.upnpMediarendererClientStrings.loading
import typings.upnpMediarendererClient.upnpMediarendererClientStrings.paused
import typings.upnpMediarendererClient.upnpMediarendererClientStrings.playing
import typings.upnpMediarendererClient.upnpMediarendererClientStrings.speedChanged
import typings.upnpMediarendererClient.upnpMediarendererClientStrings.status
import typings.upnpMediarendererClient.upnpMediarendererClientStrings.stopped
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("upnp-mediarenderer-client", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with MediaRendererClient {
    def this(url: String) = this()
  }
  
  @js.native
  trait MediaRendererClient extends StObject {
    
    def getDuration(callback: js.Function2[/* err */ js.Error, /* result */ Any, Unit]): Unit = js.native
    
    def getPosition(callback: js.Function2[/* err */ js.Error, /* result */ Any, Unit]): Unit = js.native
    
    def getVolume(): Unit = js.native
    def getVolume(callback: js.Function2[/* err */ js.Error, /* result */ Double, Unit]): Unit = js.native
    
    def load(url: String, options: Any): Unit = js.native
    def load(url: String, options: Any, callback: js.Function2[/* err */ js.Error, /* result */ Any, Unit]): Unit = js.native
    
    def on(
      event: status | loading | playing | paused | stopped | speedChanged,
      callback: js.Function1[/* value */ Any, Unit]
    ): Unit = js.native
    
    def pause(): Unit = js.native
    def pause(callback: js.Function2[/* err */ js.Error, /* result */ Any, Unit]): Unit = js.native
    
    def play(): Unit = js.native
    def play(callback: js.Function2[/* err */ js.Error, /* result */ Any, Unit]): Unit = js.native
    
    def seek(seconds: Double): Unit = js.native
    def seek(seconds: Double, callback: js.Function2[/* err */ js.Error, /* result */ Any, Unit]): Unit = js.native
    
    def setVolume(volume: Double): Unit = js.native
    def setVolume(volume: Double, callback: js.Function2[/* err */ js.Error, /* result */ Any, Unit]): Unit = js.native
    
    def stop(): Unit = js.native
    def stop(callback: js.Function2[/* err */ js.Error, /* result */ Any, Unit]): Unit = js.native
  }
}
