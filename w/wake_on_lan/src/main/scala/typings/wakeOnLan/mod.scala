package typings.wakeOnLan

import org.scalablytyped.runtime.Shortcut
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("wake_on_lan", JSImport.Namespace)
  @js.native
  val ^ : Wol = js.native
  
  type ErrorCallback = js.Function1[/* Error */ js.Any, Unit]
  
  trait WakeOptions extends StObject {
    
    /**
      * The ip address to which the packet is send  (default: 255.255.255.255)
      */
    var address: js.UndefOr[String] = js.undefined
    
    /**
      * The interval between packets (default: 100ms)
      */
    var interval: js.UndefOr[Double] = js.undefined
    
    /**
      * Number of packets to send (default: 3)
      */
    var num_packets: js.UndefOr[Double] = js.undefined
    
    /**
      * The port to send to (default: 9)
      */
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
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setNum_packets(value: Double): Self = StObject.set(x, "num_packets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNum_packetsUndefined: Self = StObject.set(x, "num_packets", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
  
  @js.native
  trait Wol extends StObject {
    
    /**
      * Creates a buffer with a magic packet for the given MAC address.
      *
      * @param {string} macAddress mac address of the target device
      * @return {Buffer} the magic packet
      */
    def createMagicPacket(macAddress: String): Buffer = js.native
    
    /**
      * Send a sequence of Wake-on-LAN magic packets to the given MAC address.
      *
      * @param {string} macAddress the mac address of the target device
      */
    def wake(macAddress: String): Unit = js.native
    /**
      * Send a sequence of Wake-on-LAN magic packets to the given MAC address.
      *
      * @param {string} macAddress the mac address of the target device
      * @param {ErrorCallback} callback is called when all packets have been sent or an error occurs.
      */
    def wake(macAddress: String, callback: ErrorCallback): Unit = js.native
    /**
      * Send a sequence of Wake-on-LAN magic packets to the given MAC address.
      *
      * @param {string} macAddress the mac address of the target device
      * @param {WakeOptions} opts additional options to send the packet
      * @param {ErrorCallback} callback is called when all packets have been sent or an error occurs.
      */
    def wake(macAddress: String, opts: WakeOptions): Unit = js.native
    def wake(macAddress: String, opts: WakeOptions, callback: js.Function): Unit = js.native
  }
  
  type _To = Wol
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Wol = ^
}
