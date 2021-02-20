package typings.wol

import typings.node.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("wol", "createMagicPacket")
  @js.native
  def createMagicPacket(mac: String): Buffer = js.native
  
  @JSImport("wol", "wake")
  @js.native
  def wake(mac: String): js.Promise[Boolean] = js.native
  @JSImport("wol", "wake")
  @js.native
  def wake(mac: String, callback: WakeCallback): js.Promise[Boolean] = js.native
  @JSImport("wol", "wake")
  @js.native
  def wake(mac: String, options: js.UndefOr[scala.Nothing], callback: WakeCallback): js.Promise[Boolean] = js.native
  @JSImport("wol", "wake")
  @js.native
  def wake(mac: String, options: WakeOptions): js.Promise[Boolean] = js.native
  @JSImport("wol", "wake")
  @js.native
  def wake(mac: String, options: WakeOptions, callback: WakeCallback): js.Promise[Boolean] = js.native
  
  type WakeCallback = js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[Boolean], Unit]
  
  @js.native
  trait WakeOptions extends StObject {
    
    var address: js.UndefOr[String] = js.native
    
    var port: js.UndefOr[Double] = js.native
  }
  object WakeOptions {
    
    @scala.inline
    def apply(): WakeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WakeOptions]
    }
    
    @scala.inline
    implicit class WakeOptionsMutableBuilder[Self <: WakeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
}
