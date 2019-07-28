package typings.wiringDashPi.wiringDashPiMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wiring-pi", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DAC7678_VREF_MODE_FLEXIBLE_ALWAYS_OFF: Double = js.native
  val DAC7678_VREF_MODE_FLEXIBLE_ALWAYS_ON: Double = js.native
  val DAC7678_VREF_MODE_FLEXIBLE_ON: Double = js.native
  val DAC7678_VREF_MODE_STATIC_OFF: Double = js.native
  val DAC7678_VREF_MODE_STATIC_ON: Double = js.native
  val FSEL_ALT0: Double = js.native
  val FSEL_ALT1: Double = js.native
  val FSEL_ALT2: Double = js.native
  val FSEL_ALT3: Double = js.native
  val FSEL_ALT4: Double = js.native
  val FSEL_ALT5: Double = js.native
  val FSEL_INPT: Double = js.native
  val FSEL_OUTP: Double = js.native
  val GPIO_CLOCK: Double = js.native
  val HIGH: Double = js.native
  val INPUT: Double = js.native
  val INT_EDGE_BOTH: Double = js.native
  val INT_EDGE_FALLING: Double = js.native
  val INT_EDGE_RISING: Double = js.native
  val INT_EDGE_SETUP: Double = js.native
  val LOW: Double = js.native
  val LSBFIRST: Double = js.native
  val MAX_LCDS: Double = js.native
  val MAX_NES_JOYSTICKS: Double = js.native
  val MCP3422_GAIN_1: Double = js.native
  val MCP3422_GAIN_2: Double = js.native
  val MCP3422_GAIN_4: Double = js.native
  val MCP3422_GAIN_8: Double = js.native
  val MCP3422_SR_15: Double = js.native
  val MCP3422_SR_240: Double = js.native
  val MCP3422_SR_3_75: Double = js.native
  val MCP3422_SR_60: Double = js.native
  val MSBFIRST: Double = js.native
  val NES_A: Double = js.native
  val NES_B: Double = js.native
  val NES_DOWN: Double = js.native
  val NES_LEFT: Double = js.native
  val NES_RIGHT: Double = js.native
  val NES_SELECT: Double = js.native
  val NES_START: Double = js.native
  val NES_UP: Double = js.native
  val OUTPUT: Double = js.native
  val PIGLOW_BLUE: Double = js.native
  val PIGLOW_GREEN: Double = js.native
  val PIGLOW_ORANGE: Double = js.native
  val PIGLOW_RED: Double = js.native
  val PIGLOW_WHITE: Double = js.native
  val PIGLOW_YELLOW: Double = js.native
  val PI_MAKER_EGOMAN: Double = js.native
  val PI_MAKER_MBEST: Double = js.native
  val PI_MAKER_NAMES: js.Array[String] = js.native
  val PI_MAKER_QISDA: Double = js.native
  val PI_MAKER_SONY: Double = js.native
  val PI_MAKER_UNKNOWN: Double = js.native
  val PI_MODEL_2: Double = js.native
  val PI_MODEL_A: Double = js.native
  val PI_MODEL_AP: Double = js.native
  val PI_MODEL_B: Double = js.native
  val PI_MODEL_BP: Double = js.native
  val PI_MODEL_CM: Double = js.native
  val PI_MODEL_NAMES: js.Array[String] = js.native
  val PI_MODEL_UNKNOWN: Double = js.native
  val PI_REVISION_NAMES: js.Array[String] = js.native
  val PI_VERSION_1: Double = js.native
  val PI_VERSION_1_1: Double = js.native
  val PI_VERSION_1_2: Double = js.native
  val PI_VERSION_2: Double = js.native
  val PI_VERSION_UNKNOWN: Double = js.native
  val PUD_DOWN: Double = js.native
  val PUD_OFF: Double = js.native
  val PUD_UP: Double = js.native
  val PWM_MODE_BAL: Double = js.native
  val PWM_MODE_MS: Double = js.native
  val PWM_OUTPUT: Double = js.native
  val SOFT_PWM_OUTPUT: Double = js.native
  val SOFT_TONE_OUTPUT: Double = js.native
  val TCS34725_ATIME_101MS: Double = js.native
  val TCS34725_ATIME_154MS: Double = js.native
  val TCS34725_ATIME_24MS: Double = js.native
  val TCS34725_ATIME_2_4MS: Double = js.native
  val TCS34725_ATIME_50MS: Double = js.native
  val TCS34725_ATIME_700MS: Double = js.native
  val TCS34725_GAIN_1: Double = js.native
  val TCS34725_GAIN_16: Double = js.native
  val TCS34725_GAIN_4: Double = js.native
  val TCS34725_GAIN_60: Double = js.native
  val TCS34725_MAX_TCS34725: Double = js.native
  val VERSION: String = js.native
  val WPI_MODE_GPIO: Double = js.native
  val WPI_MODE_GPIO_SYS: Double = js.native
  val WPI_MODE_PHYS: Double = js.native
  val WPI_MODE_PIFACE: Double = js.native
  val WPI_MODE_PINS: Double = js.native
  val WPI_MODE_UNINITIALISED: Double = js.native
  def analogRead(pin: Double): Double = js.native
  def analogWrite(pin: Double, value: Double): Unit = js.native
  def dac7678Setup(pinBase: Double, i2cAddress: Double, vrefMode: Double): Double = js.native
  def delay(ms: Double): Unit = js.native
  def delayMicroseconds(us: Double): Unit = js.native
  def digitalRead(pin: Double): Double = js.native
  def digitalWrite(pin: Double, state: Double): Unit = js.native
  def digitalWriteByte(byte: Double): Unit = js.native
  def drcSerialSetup(pinBase: Double, numPins: Double, device: String, baudrate: Double): Double = js.native
  def ds1302clockRead(): js.Array[Double] = js.native
  def ds1302clockWrite(clcokData: js.Array[Double]): Unit = js.native
  def ds1302ramRead(address: Double): Double = js.native
  def ds1302ramWrite(address: Double, data: Double): Unit = js.native
  def ds1302rtcRead(reg: Double): Double = js.native
  def ds1302rtcWrite(reg: Double, data: Double): Unit = js.native
  def ds1302setup(clockPin: Double, dataPin: Double, csPin: Double): Unit = js.native
  def ds1302trickleCharge(diodes: Double, resistors: Double): Unit = js.native
  def gertboardAnalogSetup(pinBase: Double): Double = js.native
  def getAlt(pin: Double): Double = js.native
  def gpioClockSet(pin: Double, frequency: Double): Unit = js.native
  def lcd128x64circle(x: Double, y: Double, r: Double, color: Double, filled: Double): Unit = js.native
  def lcd128x64clear(color: Double): Unit = js.native
  def lcd128x64ellipse(cx: Double, cy: Double, xRadius: Double, yRadius: Double, color: Double, filled: Double): Unit = js.native
  def lcd128x64getScreenSize(): js.Array[Double] = js.native
  def lcd128x64line(x0: Double, y0: Double, x1: Double, y1: Double, color: Double): Unit = js.native
  def lcd128x64lineTo(x: Double, y: Double, color: Double): Unit = js.native
  def lcd128x64orientCoordinates(): js.Array[Double] = js.native
  def lcd128x64point(x: Double, y: Double, color: Double): Unit = js.native
  def lcd128x64putchar(x: Double, y: Double, c: Double, bgColor: Double, fgColor: Double): Unit = js.native
  def lcd128x64puts(x: Double, y: Double, data: String, bgColor: Double, fgColor: Double): Unit = js.native
  def lcd128x64rectangle(x1: Double, y1: Double, x2: Double, y2: Double, color: Double, filled: Double): Unit = js.native
  def lcd128x64setOrientation(orientation: Double): Unit = js.native
  def lcd128x64setOrigin(x: Double, y: Double): Unit = js.native
  def lcd128x64setup(): Double = js.native
  def lcd128x64update(): Unit = js.native
  def lcdCharDef(fd: Double, index: Double, data: js.Array[Double]): Unit = js.native
  def lcdClear(fd: Double): Unit = js.native
  def lcdCursor(fd: Double, state: Double): Unit = js.native
  def lcdCursorBlink(fd: Double, state: Double): Unit = js.native
  def lcdDisplay(fd: Double, state: Double): Unit = js.native
  def lcdHome(fd: Double): Unit = js.native
  def lcdInit(
    rows: Double,
    cols: Double,
    bits: Double,
    rs: Double,
    strb: Double,
    d0: Double,
    d1: Double,
    d2: Double,
    d3: Double,
    d4: Double,
    d5: Double,
    d6: Double,
    d7: Double
  ): Double = js.native
  def lcdPosition(fd: Double, x: Double, y: Double): Unit = js.native
  def lcdPrintf(fd: Double, data: String): Unit = js.native
  def lcdPutchar(fd: Double, data: Double): Unit = js.native
  def lcdPuts(fd: Double, data: String): Unit = js.native
  def lcdSendCommand(fd: Double, command: Double): Unit = js.native
  def max31855Setup(pinBase: Double, spiChannel: Double): Double = js.native
  def max5322Setup(pinBase: Double, spiChannel: Double): Double = js.native
  def maxDetectRead(pin: Double): js.Array[Double] = js.native
  def mcp23008Setup(pinBase: Double, i2cAddress: Double): Double = js.native
  def mcp23s08Setup(pinBase: Double, spiChannel: Double, devId: Double): Double = js.native
  def mcp23s17Setup(pinBase: Double, spiChannel: Double, devId: Double): Double = js.native
  def mcp3002Setup(pinBase: Double, spiChannel: Double): Double = js.native
  def mcp3004Setup(pinBase: Double, spiChannel: Double): Double = js.native
  def mcp3422Setup(pinBase: Double, i2cAddress: Double, sampleRate: Double, gain: Double): Double = js.native
  def mcp4802Setup(pinBase: Double, spiChannel: Double): Double = js.native
  def micros(): Double = js.native
  def millis(): Double = js.native
  def mpc23016Setup(pinBase: Double, i2cAddress: Double): Double = js.native
  def mpc23017Setup(pinBase: Double, i2cAddress: Double): Double = js.native
  def pca9685Setuo(pinBase: Double, i2cAddress: Double, frequency: Double): Double = js.native
  def pcf8574Setup(pinBase: Double, i2cAddress: Double): Double = js.native
  def pcf8591Setup(pinBase: Double, i2cAddress: Double): Double = js.native
  def physPinToGpio(pin: Double): Double = js.native
  def piBoardId(): PiBoardId = js.native
  def piBoardRev(): Double = js.native
  def piFaceSetup(pinBase: Double): Double = js.native
  def piGlow1(leg: Double, ring: Double, intensity: Double): Unit = js.native
  def piGlowLeg(leg: Double, intensity: Double): Unit = js.native
  def piGlowRing(ring: Double, intensity: Double): Unit = js.native
  def piGlowSetup(clear: Double): Unit = js.native
  def pinMode(pin: Double, mode: Double): Unit = js.native
  def pinModeAlt(pin: Double, mode: Double): Unit = js.native
  def pullUpDnControl(pin: Double, pud: Double): Unit = js.native
  def pulseIn(pin: Double, state: Double): Double = js.native
  def pwmSetClock(divisor: Double): Unit = js.native
  def pwmSetMode(mode: Double): Unit = js.native
  def pwmSetRange(range: Double): Unit = js.native
  def pwmToneWrite(pin: Double, frequency: Double): Unit = js.native
  def pwmWrite(pin: Double, value: Double): Unit = js.native
  def readNesJoystick(joystick: Double): Double = js.native
  def readRHT03(pin: Double): js.Array[Double] = js.native
  def serialClose(fd: Double): Unit = js.native
  def serialDataAvail(fd: Double): Double = js.native
  def serialFlush(fd: Double): Unit = js.native
  def serialGetchar(fd: Double): Double = js.native
  def serialOpen(device: String, baudrate: Double): Double = js.native
  def serialPrintf(fd: Double, data: String): Unit = js.native
  def serialPutChar(fd: Double, character: Double): Unit = js.native
  def serialPuts(fd: Double, data: String): Unit = js.native
  def setPadDrive(group: Double, value: Double): Unit = js.native
  def setup(mode: String): Double = js.native
  def setupNesJoystick(dPin: Double, cPin: Double, lPin: Double): Double = js.native
  def shiftIn(dPin: Double, cPin: Double, order: Double): Double = js.native
  def shiftOut(dPin: Double, cPin: Double, order: Double, value: Double): Unit = js.native
  def sn3218Setup(pinBase: Double): Double = js.native
  def softPwmCreate(pin: Double, value: Double, range: Double): Double = js.native
  def softPwmStop(pin: Double): Unit = js.native
  def softPwmWrite(pin: Double, value: Double): Unit = js.native
  def softServoSetup(p0: Double, p1: Double, p2: Double, p3: Double, p4: Double, p5: Double, p6: Double, p7: Double): Double = js.native
  def softServoWrite(pin: Double, value: Double): Unit = js.native
  def softToneCreate(pin: Double): Double = js.native
  def softToneStop(pin: Double): Unit = js.native
  def softToneWrite(pin: Double, frequency: Double): Unit = js.native
  def sr595Setup(pinBase: Double, numPins: Double, dataPin: Double, clockPin: Double, latchPin: Double): Double = js.native
  def tcs34725ClearInterrupt(id: Double): Unit = js.native
  def tcs34725Disable(id: Double): Unit = js.native
  def tcs34725Enable(id: Double): Unit = js.native
  def tcs34725GetCorrelatedColorTemperature(r: Double, g: Double, b: Double): Unit = js.native
  def tcs34725GetIlluminance(r: Double, g: Double, b: Double): Unit = js.native
  def tcs34725ReadHSV(id: Double): tcs34725HSV = js.native
  def tcs34725ReadRGBC(id: Double): tcs34725RGBC = js.native
  def tcs34725SetInterrupt(id: Double, aien: Double): Unit = js.native
  def tcs34725SetInterruptLimits(id: Double, low: Double, high: Double): Unit = js.native
  def tcs34725Setup(i2cAddress: Double, integrationTime: Double, gain: Double): Double = js.native
  def wiringPiI2CClose(fd: Double): Unit = js.native
  def wiringPiI2CRead(fd: Double): Double = js.native
  def wiringPiI2CReadReg16(fd: Double, reg: Double): Double = js.native
  def wiringPiI2CReadReg8(fd: Double, reg: Double): Double = js.native
  def wiringPiI2CSetup(devId: Double): Double = js.native
  def wiringPiI2CSetupInterface(device: String, devId: Double): Double = js.native
  def wiringPiI2CWrite(fd: Double, data: Double): Double = js.native
  def wiringPiI2CWriteReg16(fd: Double, reg: Double, data: Double): Double = js.native
  def wiringPiI2CWriteReg8(fd: Double, reg: Double, data: Double): Double = js.native
  def wiringPiISR(pin: Double, edgeType: Double, callback: js.Function1[/* delta */ Double, Unit]): Unit = js.native
  def wiringPiISRCancel(pin: Double): Unit = js.native
  def wiringPiSPIClose(fd: Double): Unit = js.native
  def wiringPiSPIDataRW(channel: Double, data: Buffer): Double = js.native
  def wiringPiSPIGetFd(channel: Double): Double = js.native
  def wiringPiSPISetup(channel: Double, speed: Double): Double = js.native
  def wiringPiSPISetupMode(channel: Double, speed: Double, mode: Double): Double = js.native
  def wiringPiSetup(): Double = js.native
  def wiringPiSetupGpio(): Double = js.native
  def wiringPiSetupPhys(): Double = js.native
  def wiringPiSetupSys(): Double = js.native
  def wpiPinToGpio(pin: Double): Double = js.native
}

