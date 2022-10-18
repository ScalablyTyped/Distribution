package typings.sx127xDriver

import typings.sx127xDriver.sx127xDriverStrings.`10Dot4E3`
import typings.sx127xDriver.sx127xDriverStrings.`125E3`
import typings.sx127xDriver.sx127xDriverStrings.`15Dot6E3`
import typings.sx127xDriver.sx127xDriverStrings.`20Dot8E3`
import typings.sx127xDriver.sx127xDriverStrings.`250E3`
import typings.sx127xDriver.sx127xDriverStrings.`31Dot25E3`
import typings.sx127xDriver.sx127xDriverStrings.`41Dot7E3`
import typings.sx127xDriver.sx127xDriverStrings.`433E6`
import typings.sx127xDriver.sx127xDriverStrings.`4Slash5`
import typings.sx127xDriver.sx127xDriverStrings.`4Slash6`
import typings.sx127xDriver.sx127xDriverStrings.`4Slash7`
import typings.sx127xDriver.sx127xDriverStrings.`4Slash8`
import typings.sx127xDriver.sx127xDriverStrings.`500E3`
import typings.sx127xDriver.sx127xDriverStrings.`62Dot5E3`
import typings.sx127xDriver.sx127xDriverStrings.`7Dot8E3`
import typings.sx127xDriver.sx127xDriverStrings.`866E6`
import typings.sx127xDriver.sx127xDriverStrings.`915E6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sx127x-driver", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with SX127x {
    def this(options: SX127xOptions) = this()
    
    /* CompleteClass */
    override def available(): js.Promise[Boolean] = js.native
    
    /**
      * Close the device
      */
    /* CompleteClass */
    override def close(): js.Promise[Unit] = js.native
    
    /**
      * Open and configure the device
      */
    /* CompleteClass */
    override def open(): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def read(): js.Promise[Double] = js.native
    
    /* CompleteClass */
    override def receiveSingle(): js.Promise[Double] = js.native
    
    /**
      * Supported values are 4/5, 4/6, 4/7 and 4/8
      * @param codingRate
      */
    /* CompleteClass */
    override def setCodingRate(codingRate: `4Slash5` | `4Slash6` | `4Slash7` | `4Slash8`): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def setContinuousReceiveMode(): js.Promise[Unit] = js.native
    
    /**
      * true to enable CRC, false to disable
      * @param crc
      */
    /* CompleteClass */
    override def setCrc(crc: Boolean): js.Promise[Unit] = js.native
    
    /**
      * frequency in Hz (433E6, 866E6, 915E6)
      * @param frequency
      */
    /* CompleteClass */
    override def setFrequency(frequency: `433E6` | `866E6` | `915E6`): js.Promise[Unit] = js.native
    
    /**
      * Supported values are between 6 and 65535.
      * @param preambleLength
      */
    /* CompleteClass */
    override def setPreambleLength(preambleLength: Double): js.Promise[Unit] = js.native
    
    /**
      * Supported values are 7.8E3, 10.4E3, 15.6E3, 20.8E3, 31.25E3, 41.7E3, 62.5E3, 125E3, 250E3 and 500E3
      * @param signalBandwidth
      */
    /* CompleteClass */
    override def setSignalBandwidth(
      signalBandwidth: `7Dot8E3` | `10Dot4E3` | `15Dot6E3` | `20Dot8E3` | `31Dot25E3` | `41Dot7E3` | `62Dot5E3` | `125E3` | `250E3` | `500E3`
    ): js.Promise[Unit] = js.native
    
    /**
      * Supported values are between 6 and 12. If a spreading factor of 6 is set, implicit header mode must be used to transmit and receive packets
      * @param spreadingFactor
      */
    /* CompleteClass */
    override def setSpreadingFactor(spreadingFactor: Double): js.Promise[Unit] = js.native
    
    /**
      * Byte value to use as the sync word
      * @param syncWord
      */
    /* CompleteClass */
    override def setSyncWord(syncWord: String): js.Promise[Unit] = js.native
    
    /**
      * Supported values are between 2 and 17.
      * @param txPower
      */
    /* CompleteClass */
    override def setTxPower(txPower: Double): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def sleep(): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def standBy(): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def write(buffer: js.typedarray.ArrayBuffer): js.Promise[Unit] = js.native
  }
  
  trait SX127x extends StObject {
    
    def available(): js.Promise[Boolean]
    
    /**
      * Close the device
      */
    def close(): js.Promise[Unit]
    
    /**
      * Open and configure the device
      */
    def open(): js.Promise[Unit]
    
    def read(): js.Promise[Double]
    
    def receiveSingle(): js.Promise[Double]
    
    /**
      * Supported values are 4/5, 4/6, 4/7 and 4/8
      * @param codingRate
      */
    def setCodingRate(codingRate: `4Slash5` | `4Slash6` | `4Slash7` | `4Slash8`): js.Promise[Unit]
    
    def setContinuousReceiveMode(): js.Promise[Unit]
    
    /**
      * true to enable CRC, false to disable
      * @param crc
      */
    def setCrc(crc: Boolean): js.Promise[Unit]
    
    /**
      * frequency in Hz (433E6, 866E6, 915E6)
      * @param frequency
      */
    def setFrequency(frequency: `433E6` | `866E6` | `915E6`): js.Promise[Unit]
    
    /**
      * Supported values are between 6 and 65535.
      * @param preambleLength
      */
    def setPreambleLength(preambleLength: Double): js.Promise[Unit]
    
    /**
      * Supported values are 7.8E3, 10.4E3, 15.6E3, 20.8E3, 31.25E3, 41.7E3, 62.5E3, 125E3, 250E3 and 500E3
      * @param signalBandwidth
      */
    def setSignalBandwidth(
      signalBandwidth: `7Dot8E3` | `10Dot4E3` | `15Dot6E3` | `20Dot8E3` | `31Dot25E3` | `41Dot7E3` | `62Dot5E3` | `125E3` | `250E3` | `500E3`
    ): js.Promise[Unit]
    
    /**
      * Supported values are between 6 and 12. If a spreading factor of 6 is set, implicit header mode must be used to transmit and receive packets
      * @param spreadingFactor
      */
    def setSpreadingFactor(spreadingFactor: Double): js.Promise[Unit]
    
    /**
      * Byte value to use as the sync word
      * @param syncWord
      */
    def setSyncWord(syncWord: String): js.Promise[Unit]
    
    /**
      * Supported values are between 2 and 17.
      * @param txPower
      */
    def setTxPower(txPower: Double): js.Promise[Unit]
    
    def sleep(): js.Promise[Unit]
    
    def standBy(): js.Promise[Unit]
    
    def write(buffer: js.typedarray.ArrayBuffer): js.Promise[Unit]
  }
  object SX127x {
    
    inline def apply(
      available: () => js.Promise[Boolean],
      close: () => js.Promise[Unit],
      open: () => js.Promise[Unit],
      read: () => js.Promise[Double],
      receiveSingle: () => js.Promise[Double],
      setCodingRate: `4Slash5` | `4Slash6` | `4Slash7` | `4Slash8` => js.Promise[Unit],
      setContinuousReceiveMode: () => js.Promise[Unit],
      setCrc: Boolean => js.Promise[Unit],
      setFrequency: `433E6` | `866E6` | `915E6` => js.Promise[Unit],
      setPreambleLength: Double => js.Promise[Unit],
      setSignalBandwidth: `7Dot8E3` | `10Dot4E3` | `15Dot6E3` | `20Dot8E3` | `31Dot25E3` | `41Dot7E3` | `62Dot5E3` | `125E3` | `250E3` | `500E3` => js.Promise[Unit],
      setSpreadingFactor: Double => js.Promise[Unit],
      setSyncWord: String => js.Promise[Unit],
      setTxPower: Double => js.Promise[Unit],
      sleep: () => js.Promise[Unit],
      standBy: () => js.Promise[Unit],
      write: js.typedarray.ArrayBuffer => js.Promise[Unit]
    ): SX127x = {
      val __obj = js.Dynamic.literal(available = js.Any.fromFunction0(available), close = js.Any.fromFunction0(close), open = js.Any.fromFunction0(open), read = js.Any.fromFunction0(read), receiveSingle = js.Any.fromFunction0(receiveSingle), setCodingRate = js.Any.fromFunction1(setCodingRate), setContinuousReceiveMode = js.Any.fromFunction0(setContinuousReceiveMode), setCrc = js.Any.fromFunction1(setCrc), setFrequency = js.Any.fromFunction1(setFrequency), setPreambleLength = js.Any.fromFunction1(setPreambleLength), setSignalBandwidth = js.Any.fromFunction1(setSignalBandwidth), setSpreadingFactor = js.Any.fromFunction1(setSpreadingFactor), setSyncWord = js.Any.fromFunction1(setSyncWord), setTxPower = js.Any.fromFunction1(setTxPower), sleep = js.Any.fromFunction0(sleep), standBy = js.Any.fromFunction0(standBy), write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[SX127x]
    }
    
    extension [Self <: SX127x](x: Self) {
      
      inline def setAvailable(value: () => js.Promise[Boolean]): Self = StObject.set(x, "available", js.Any.fromFunction0(value))
      
      inline def setClose(value: () => js.Promise[Unit]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setOpen(value: () => js.Promise[Unit]): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
      
      inline def setRead(value: () => js.Promise[Double]): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
      
      inline def setReceiveSingle(value: () => js.Promise[Double]): Self = StObject.set(x, "receiveSingle", js.Any.fromFunction0(value))
      
      inline def setSetCodingRate(value: `4Slash5` | `4Slash6` | `4Slash7` | `4Slash8` => js.Promise[Unit]): Self = StObject.set(x, "setCodingRate", js.Any.fromFunction1(value))
      
      inline def setSetContinuousReceiveMode(value: () => js.Promise[Unit]): Self = StObject.set(x, "setContinuousReceiveMode", js.Any.fromFunction0(value))
      
      inline def setSetCrc(value: Boolean => js.Promise[Unit]): Self = StObject.set(x, "setCrc", js.Any.fromFunction1(value))
      
      inline def setSetFrequency(value: `433E6` | `866E6` | `915E6` => js.Promise[Unit]): Self = StObject.set(x, "setFrequency", js.Any.fromFunction1(value))
      
      inline def setSetPreambleLength(value: Double => js.Promise[Unit]): Self = StObject.set(x, "setPreambleLength", js.Any.fromFunction1(value))
      
      inline def setSetSignalBandwidth(
        value: `7Dot8E3` | `10Dot4E3` | `15Dot6E3` | `20Dot8E3` | `31Dot25E3` | `41Dot7E3` | `62Dot5E3` | `125E3` | `250E3` | `500E3` => js.Promise[Unit]
      ): Self = StObject.set(x, "setSignalBandwidth", js.Any.fromFunction1(value))
      
      inline def setSetSpreadingFactor(value: Double => js.Promise[Unit]): Self = StObject.set(x, "setSpreadingFactor", js.Any.fromFunction1(value))
      
      inline def setSetSyncWord(value: String => js.Promise[Unit]): Self = StObject.set(x, "setSyncWord", js.Any.fromFunction1(value))
      
      inline def setSetTxPower(value: Double => js.Promise[Unit]): Self = StObject.set(x, "setTxPower", js.Any.fromFunction1(value))
      
      inline def setSleep(value: () => js.Promise[Unit]): Self = StObject.set(x, "sleep", js.Any.fromFunction0(value))
      
      inline def setStandBy(value: () => js.Promise[Unit]): Self = StObject.set(x, "standBy", js.Any.fromFunction0(value))
      
      inline def setWrite(value: js.typedarray.ArrayBuffer => js.Promise[Unit]): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
  
  trait SX127xOptions extends StObject {
    
    /**
      * Coding rate of radio
      * Default: 4/5
      */
    var codingRate: js.UndefOr[`4Slash5` | `4Slash6` | `4Slash7` | `4Slash8`] = js.undefined
    
    /**
      * Enable or disable CRC usage
      * Default: false
      */
    var crc: js.UndefOr[Boolean] = js.undefined
    
    /**
      * enable / disable debug output
      * Default: false
      */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Frequency of radio in Hz (make sure your chip supports the frequency you chose)
      * Default: 915E6
      */
    var frequency: js.UndefOr[`433E6` | `866E6` | `915E6`] = js.undefined
    
    /**
      * Inverts IQ register on call to open()
      * Default: false
      */
    var invertIqReg: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Preamble length of radio
      * Supported values are between 6 and 65535
      * Default: 8
      */
    var preambleLength: js.UndefOr[Double] = js.undefined
    
    /**
      * GPIO pin number of reset pin
      * Default: 24
      */
    var resetPin: js.UndefOr[Double] = js.undefined
    
    /**
      * Signal bandwidth of radio in Hz
      * Default: 125E3
      */
    var signalBandwidth: js.UndefOr[
        `7Dot8E3` | `10Dot4E3` | `15Dot6E3` | `20Dot8E3` | `31Dot25E3` | `41Dot7E3` | `62Dot5E3` | `125E3` | `250E3` | `500E3`
      ] = js.undefined
    
    /**
      * SPI bus to use
      * Default: 0
      */
    var spiBus: js.UndefOr[Double] = js.undefined
    
    /**
      * SPI chip select/enable to use
      * Default: 0
      */
    var spiDevice: js.UndefOr[Double] = js.undefined
    
    /**
      * Spreading factor of radio (spreading factors are orthogonal, so make sure they match when trying to communicate from one chip to another)
      * Supported values are between 6 and 12. If a spreading factor of 6 is set, implicit header mode must be used to transmit and receive packets.
      * Default: 7
      */
    var spreadingFactor: js.UndefOr[Double] = js.undefined
    
    /**
      * Sync word of radio
      * Byte value to use as the sync word
      * Default: 0x12
      */
    var syncWord: js.UndefOr[String] = js.undefined
    
    /**
      * Compensation factor for temperature measurements in degrees celsius (+- some degrees)
      * Default: false
      */
    var tempCompensationFactor: js.UndefOr[Boolean] = js.undefined
    
    /**
      * TX power of radio
      * Supported values are between 2 and 17
      * Default: 7
      */
    var txPower: js.UndefOr[Double] = js.undefined
  }
  object SX127xOptions {
    
    inline def apply(): SX127xOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SX127xOptions]
    }
    
    extension [Self <: SX127xOptions](x: Self) {
      
      inline def setCodingRate(value: `4Slash5` | `4Slash6` | `4Slash7` | `4Slash8`): Self = StObject.set(x, "codingRate", value.asInstanceOf[js.Any])
      
      inline def setCodingRateUndefined: Self = StObject.set(x, "codingRate", js.undefined)
      
      inline def setCrc(value: Boolean): Self = StObject.set(x, "crc", value.asInstanceOf[js.Any])
      
      inline def setCrcUndefined: Self = StObject.set(x, "crc", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setFrequency(value: `433E6` | `866E6` | `915E6`): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
      
      inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
      
      inline def setInvertIqReg(value: Boolean): Self = StObject.set(x, "invertIqReg", value.asInstanceOf[js.Any])
      
      inline def setInvertIqRegUndefined: Self = StObject.set(x, "invertIqReg", js.undefined)
      
      inline def setPreambleLength(value: Double): Self = StObject.set(x, "preambleLength", value.asInstanceOf[js.Any])
      
      inline def setPreambleLengthUndefined: Self = StObject.set(x, "preambleLength", js.undefined)
      
      inline def setResetPin(value: Double): Self = StObject.set(x, "resetPin", value.asInstanceOf[js.Any])
      
      inline def setResetPinUndefined: Self = StObject.set(x, "resetPin", js.undefined)
      
      inline def setSignalBandwidth(
        value: `7Dot8E3` | `10Dot4E3` | `15Dot6E3` | `20Dot8E3` | `31Dot25E3` | `41Dot7E3` | `62Dot5E3` | `125E3` | `250E3` | `500E3`
      ): Self = StObject.set(x, "signalBandwidth", value.asInstanceOf[js.Any])
      
      inline def setSignalBandwidthUndefined: Self = StObject.set(x, "signalBandwidth", js.undefined)
      
      inline def setSpiBus(value: Double): Self = StObject.set(x, "spiBus", value.asInstanceOf[js.Any])
      
      inline def setSpiBusUndefined: Self = StObject.set(x, "spiBus", js.undefined)
      
      inline def setSpiDevice(value: Double): Self = StObject.set(x, "spiDevice", value.asInstanceOf[js.Any])
      
      inline def setSpiDeviceUndefined: Self = StObject.set(x, "spiDevice", js.undefined)
      
      inline def setSpreadingFactor(value: Double): Self = StObject.set(x, "spreadingFactor", value.asInstanceOf[js.Any])
      
      inline def setSpreadingFactorUndefined: Self = StObject.set(x, "spreadingFactor", js.undefined)
      
      inline def setSyncWord(value: String): Self = StObject.set(x, "syncWord", value.asInstanceOf[js.Any])
      
      inline def setSyncWordUndefined: Self = StObject.set(x, "syncWord", js.undefined)
      
      inline def setTempCompensationFactor(value: Boolean): Self = StObject.set(x, "tempCompensationFactor", value.asInstanceOf[js.Any])
      
      inline def setTempCompensationFactorUndefined: Self = StObject.set(x, "tempCompensationFactor", js.undefined)
      
      inline def setTxPower(value: Double): Self = StObject.set(x, "txPower", value.asInstanceOf[js.Any])
      
      inline def setTxPowerUndefined: Self = StObject.set(x, "txPower", js.undefined)
    }
  }
}
