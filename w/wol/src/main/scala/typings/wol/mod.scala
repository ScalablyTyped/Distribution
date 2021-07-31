package typings.wol

import typings.node.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("wol", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createMagicPacket(mac: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("createMagicPacket")(mac.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  @scala.inline
  def wake(mac: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("wake")(mac.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  @scala.inline
  def wake(mac: String, callback: WakeCallback): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("wake")(mac.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  @scala.inline
  def wake(mac: String, options: Unit, callback: WakeCallback): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("wake")(mac.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  @scala.inline
  def wake(mac: String, options: WakeOptions): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("wake")(mac.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  @scala.inline
  def wake(mac: String, options: WakeOptions, callback: WakeCallback): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("wake")(mac.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  type WakeCallback = js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[Boolean], Unit]
  
  trait WakeOptions extends StObject {
    
    var address: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
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
