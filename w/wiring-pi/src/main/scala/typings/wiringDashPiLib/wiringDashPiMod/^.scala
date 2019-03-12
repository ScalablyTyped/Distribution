package typings
package wiringDashPiLib.wiringDashPiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wiring-pi", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DAC7678_VREF_MODE_FLEXIBLE_ALWAYS_OFF: scala.Double = js.native
  val DAC7678_VREF_MODE_FLEXIBLE_ALWAYS_ON: scala.Double = js.native
  val DAC7678_VREF_MODE_FLEXIBLE_ON: scala.Double = js.native
  val DAC7678_VREF_MODE_STATIC_OFF: scala.Double = js.native
  val DAC7678_VREF_MODE_STATIC_ON: scala.Double = js.native
  val FSEL_ALT0: scala.Double = js.native
  val FSEL_ALT1: scala.Double = js.native
  val FSEL_ALT2: scala.Double = js.native
  val FSEL_ALT3: scala.Double = js.native
  val FSEL_ALT4: scala.Double = js.native
  val FSEL_ALT5: scala.Double = js.native
  val FSEL_INPT: scala.Double = js.native
  val FSEL_OUTP: scala.Double = js.native
  val GPIO_CLOCK: scala.Double = js.native
  val HIGH: scala.Double = js.native
  val INPUT: scala.Double = js.native
  val INT_EDGE_BOTH: scala.Double = js.native
  val INT_EDGE_FALLING: scala.Double = js.native
  val INT_EDGE_RISING: scala.Double = js.native
  val INT_EDGE_SETUP: scala.Double = js.native
  val LOW: scala.Double = js.native
  val LSBFIRST: scala.Double = js.native
  val MAX_LCDS: scala.Double = js.native
  val MAX_NES_JOYSTICKS: scala.Double = js.native
  val MCP3422_GAIN_1: scala.Double = js.native
  val MCP3422_GAIN_2: scala.Double = js.native
  val MCP3422_GAIN_4: scala.Double = js.native
  val MCP3422_GAIN_8: scala.Double = js.native
  val MCP3422_SR_15: scala.Double = js.native
  val MCP3422_SR_240: scala.Double = js.native
  val MCP3422_SR_3_75: scala.Double = js.native
  val MCP3422_SR_60: scala.Double = js.native
  val MSBFIRST: scala.Double = js.native
  val NES_A: scala.Double = js.native
  val NES_B: scala.Double = js.native
  val NES_DOWN: scala.Double = js.native
  val NES_LEFT: scala.Double = js.native
  val NES_RIGHT: scala.Double = js.native
  val NES_SELECT: scala.Double = js.native
  val NES_START: scala.Double = js.native
  val NES_UP: scala.Double = js.native
  val OUTPUT: scala.Double = js.native
  val PIGLOW_BLUE: scala.Double = js.native
  val PIGLOW_GREEN: scala.Double = js.native
  val PIGLOW_ORANGE: scala.Double = js.native
  val PIGLOW_RED: scala.Double = js.native
  val PIGLOW_WHITE: scala.Double = js.native
  val PIGLOW_YELLOW: scala.Double = js.native
  val PI_MAKER_EGOMAN: scala.Double = js.native
  val PI_MAKER_MBEST: scala.Double = js.native
  val PI_MAKER_NAMES: js.Array[java.lang.String] = js.native
  val PI_MAKER_QISDA: scala.Double = js.native
  val PI_MAKER_SONY: scala.Double = js.native
  val PI_MAKER_UNKNOWN: scala.Double = js.native
  val PI_MODEL_2: scala.Double = js.native
  val PI_MODEL_A: scala.Double = js.native
  val PI_MODEL_AP: scala.Double = js.native
  val PI_MODEL_B: scala.Double = js.native
  val PI_MODEL_BP: scala.Double = js.native
  val PI_MODEL_CM: scala.Double = js.native
  val PI_MODEL_NAMES: js.Array[java.lang.String] = js.native
  val PI_MODEL_UNKNOWN: scala.Double = js.native
  val PI_REVISION_NAMES: js.Array[java.lang.String] = js.native
  val PI_VERSION_1: scala.Double = js.native
  val PI_VERSION_1_1: scala.Double = js.native
  val PI_VERSION_1_2: scala.Double = js.native
  val PI_VERSION_2: scala.Double = js.native
  val PI_VERSION_UNKNOWN: scala.Double = js.native
  val PUD_DOWN: scala.Double = js.native
  val PUD_OFF: scala.Double = js.native
  val PUD_UP: scala.Double = js.native
  val PWM_MODE_BAL: scala.Double = js.native
  val PWM_MODE_MS: scala.Double = js.native
  val PWM_OUTPUT: scala.Double = js.native
  val SOFT_PWM_OUTPUT: scala.Double = js.native
  val SOFT_TONE_OUTPUT: scala.Double = js.native
  val TCS34725_ATIME_101MS: scala.Double = js.native
  val TCS34725_ATIME_154MS: scala.Double = js.native
  val TCS34725_ATIME_24MS: scala.Double = js.native
  val TCS34725_ATIME_2_4MS: scala.Double = js.native
  val TCS34725_ATIME_50MS: scala.Double = js.native
  val TCS34725_ATIME_700MS: scala.Double = js.native
  val TCS34725_GAIN_1: scala.Double = js.native
  val TCS34725_GAIN_16: scala.Double = js.native
  val TCS34725_GAIN_4: scala.Double = js.native
  val TCS34725_GAIN_60: scala.Double = js.native
  val TCS34725_MAX_TCS34725: scala.Double = js.native
  val VERSION: java.lang.String = js.native
  val WPI_MODE_GPIO: scala.Double = js.native
  val WPI_MODE_GPIO_SYS: scala.Double = js.native
  val WPI_MODE_PHYS: scala.Double = js.native
  val WPI_MODE_PIFACE: scala.Double = js.native
  val WPI_MODE_PINS: scala.Double = js.native
  val WPI_MODE_UNINITIALISED: scala.Double = js.native
  def analogRead(pin: scala.Double): scala.Double = js.native
  def analogWrite(pin: scala.Double, value: scala.Double): scala.Unit = js.native
  def dac7678Setup(pinBase: scala.Double, i2cAddress: scala.Double, vrefMode: scala.Double): scala.Double = js.native
  def delay(ms: scala.Double): scala.Unit = js.native
  def delayMicroseconds(us: scala.Double): scala.Unit = js.native
  def digitalRead(pin: scala.Double): scala.Double = js.native
  def digitalWrite(pin: scala.Double, state: scala.Double): scala.Unit = js.native
  def digitalWriteByte(byte: scala.Double): scala.Unit = js.native
  def drcSerialSetup(pinBase: scala.Double, numPins: scala.Double, device: java.lang.String, baudrate: scala.Double): scala.Double = js.native
  def ds1302clockRead(): js.Array[scala.Double] = js.native
  def ds1302clockWrite(clcokData: js.Array[scala.Double]): scala.Unit = js.native
  def ds1302ramRead(address: scala.Double): scala.Double = js.native
  def ds1302ramWrite(address: scala.Double, data: scala.Double): scala.Unit = js.native
  def ds1302rtcRead(reg: scala.Double): scala.Double = js.native
  def ds1302rtcWrite(reg: scala.Double, data: scala.Double): scala.Unit = js.native
  def ds1302setup(clockPin: scala.Double, dataPin: scala.Double, csPin: scala.Double): scala.Unit = js.native
  def ds1302trickleCharge(diodes: scala.Double, resistors: scala.Double): scala.Unit = js.native
  def gertboardAnalogSetup(pinBase: scala.Double): scala.Double = js.native
  def getAlt(pin: scala.Double): scala.Double = js.native
  def gpioClockSet(pin: scala.Double, frequency: scala.Double): scala.Unit = js.native
  def lcd128x64circle(x: scala.Double, y: scala.Double, r: scala.Double, color: scala.Double, filled: scala.Double): scala.Unit = js.native
  def lcd128x64clear(color: scala.Double): scala.Unit = js.native
  def lcd128x64ellipse(
    cx: scala.Double,
    cy: scala.Double,
    xRadius: scala.Double,
    yRadius: scala.Double,
    color: scala.Double,
    filled: scala.Double
  ): scala.Unit = js.native
  def lcd128x64getScreenSize(): js.Array[scala.Double] = js.native
  def lcd128x64line(x0: scala.Double, y0: scala.Double, x1: scala.Double, y1: scala.Double, color: scala.Double): scala.Unit = js.native
  def lcd128x64lineTo(x: scala.Double, y: scala.Double, color: scala.Double): scala.Unit = js.native
  def lcd128x64orientCoordinates(): js.Array[scala.Double] = js.native
  def lcd128x64point(x: scala.Double, y: scala.Double, color: scala.Double): scala.Unit = js.native
  def lcd128x64putchar(x: scala.Double, y: scala.Double, c: scala.Double, bgColor: scala.Double, fgColor: scala.Double): scala.Unit = js.native
  def lcd128x64puts(
    x: scala.Double,
    y: scala.Double,
    data: java.lang.String,
    bgColor: scala.Double,
    fgColor: scala.Double
  ): scala.Unit = js.native
  def lcd128x64rectangle(
    x1: scala.Double,
    y1: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    color: scala.Double,
    filled: scala.Double
  ): scala.Unit = js.native
  def lcd128x64setOrientation(orientation: scala.Double): scala.Unit = js.native
  def lcd128x64setOrigin(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def lcd128x64setup(): scala.Double = js.native
  def lcd128x64update(): scala.Unit = js.native
  def lcdCharDef(fd: scala.Double, index: scala.Double, data: js.Array[scala.Double]): scala.Unit = js.native
  def lcdClear(fd: scala.Double): scala.Unit = js.native
  def lcdCursor(fd: scala.Double, state: scala.Double): scala.Unit = js.native
  def lcdCursorBlink(fd: scala.Double, state: scala.Double): scala.Unit = js.native
  def lcdDisplay(fd: scala.Double, state: scala.Double): scala.Unit = js.native
  def lcdHome(fd: scala.Double): scala.Unit = js.native
  def lcdInit(
    rows: scala.Double,
    cols: scala.Double,
    bits: scala.Double,
    rs: scala.Double,
    strb: scala.Double,
    d0: scala.Double,
    d1: scala.Double,
    d2: scala.Double,
    d3: scala.Double,
    d4: scala.Double,
    d5: scala.Double,
    d6: scala.Double,
    d7: scala.Double
  ): scala.Double = js.native
  def lcdPosition(fd: scala.Double, x: scala.Double, y: scala.Double): scala.Unit = js.native
  def lcdPrintf(fd: scala.Double, data: java.lang.String): scala.Unit = js.native
  def lcdPutchar(fd: scala.Double, data: scala.Double): scala.Unit = js.native
  def lcdPuts(fd: scala.Double, data: java.lang.String): scala.Unit = js.native
  def lcdSendCommand(fd: scala.Double, command: scala.Double): scala.Unit = js.native
  def max31855Setup(pinBase: scala.Double, spiChannel: scala.Double): scala.Double = js.native
  def max5322Setup(pinBase: scala.Double, spiChannel: scala.Double): scala.Double = js.native
  def maxDetectRead(pin: scala.Double): js.Array[scala.Double] = js.native
  def mcp23008Setup(pinBase: scala.Double, i2cAddress: scala.Double): scala.Double = js.native
  def mcp23s08Setup(pinBase: scala.Double, spiChannel: scala.Double, devId: scala.Double): scala.Double = js.native
  def mcp23s17Setup(pinBase: scala.Double, spiChannel: scala.Double, devId: scala.Double): scala.Double = js.native
  def mcp3002Setup(pinBase: scala.Double, spiChannel: scala.Double): scala.Double = js.native
  def mcp3004Setup(pinBase: scala.Double, spiChannel: scala.Double): scala.Double = js.native
  def mcp3422Setup(pinBase: scala.Double, i2cAddress: scala.Double, sampleRate: scala.Double, gain: scala.Double): scala.Double = js.native
  def mcp4802Setup(pinBase: scala.Double, spiChannel: scala.Double): scala.Double = js.native
  def micros(): scala.Double = js.native
  def millis(): scala.Double = js.native
  def mpc23016Setup(pinBase: scala.Double, i2cAddress: scala.Double): scala.Double = js.native
  def mpc23017Setup(pinBase: scala.Double, i2cAddress: scala.Double): scala.Double = js.native
  def pca9685Setuo(pinBase: scala.Double, i2cAddress: scala.Double, frequency: scala.Double): scala.Double = js.native
  def pcf8574Setup(pinBase: scala.Double, i2cAddress: scala.Double): scala.Double = js.native
  def pcf8591Setup(pinBase: scala.Double, i2cAddress: scala.Double): scala.Double = js.native
  def physPinToGpio(pin: scala.Double): scala.Double = js.native
  def piBoardId(): PiBoardId = js.native
  def piBoardRev(): scala.Double = js.native
  def piFaceSetup(pinBase: scala.Double): scala.Double = js.native
  def piGlow1(leg: scala.Double, ring: scala.Double, intensity: scala.Double): scala.Unit = js.native
  def piGlowLeg(leg: scala.Double, intensity: scala.Double): scala.Unit = js.native
  def piGlowRing(ring: scala.Double, intensity: scala.Double): scala.Unit = js.native
  def piGlowSetup(clear: scala.Double): scala.Unit = js.native
  def pinMode(pin: scala.Double, mode: scala.Double): scala.Unit = js.native
  def pinModeAlt(pin: scala.Double, mode: scala.Double): scala.Unit = js.native
  def pullUpDnControl(pin: scala.Double, pud: scala.Double): scala.Unit = js.native
  def pulseIn(pin: scala.Double, state: scala.Double): scala.Double = js.native
  def pwmSetClock(divisor: scala.Double): scala.Unit = js.native
  def pwmSetMode(mode: scala.Double): scala.Unit = js.native
  def pwmSetRange(range: scala.Double): scala.Unit = js.native
  def pwmToneWrite(pin: scala.Double, frequency: scala.Double): scala.Unit = js.native
  def pwmWrite(pin: scala.Double, value: scala.Double): scala.Unit = js.native
  def readNesJoystick(joystick: scala.Double): scala.Double = js.native
  def readRHT03(pin: scala.Double): js.Array[scala.Double] = js.native
  def serialClose(fd: scala.Double): scala.Unit = js.native
  def serialDataAvail(fd: scala.Double): scala.Double = js.native
  def serialFlush(fd: scala.Double): scala.Unit = js.native
  def serialGetchar(fd: scala.Double): scala.Double = js.native
  def serialOpen(device: java.lang.String, baudrate: scala.Double): scala.Double = js.native
  def serialPrintf(fd: scala.Double, data: java.lang.String): scala.Unit = js.native
  def serialPutChar(fd: scala.Double, character: scala.Double): scala.Unit = js.native
  def serialPuts(fd: scala.Double, data: java.lang.String): scala.Unit = js.native
  def setPadDrive(group: scala.Double, value: scala.Double): scala.Unit = js.native
  def setup(mode: java.lang.String): scala.Double = js.native
  def setupNesJoystick(dPin: scala.Double, cPin: scala.Double, lPin: scala.Double): scala.Double = js.native
  def shiftIn(dPin: scala.Double, cPin: scala.Double, order: scala.Double): scala.Double = js.native
  def shiftOut(dPin: scala.Double, cPin: scala.Double, order: scala.Double, value: scala.Double): scala.Unit = js.native
  def sn3218Setup(pinBase: scala.Double): scala.Double = js.native
  def softPwmCreate(pin: scala.Double, value: scala.Double, range: scala.Double): scala.Double = js.native
  def softPwmStop(pin: scala.Double): scala.Unit = js.native
  def softPwmWrite(pin: scala.Double, value: scala.Double): scala.Unit = js.native
  def softServoSetup(
    p0: scala.Double,
    p1: scala.Double,
    p2: scala.Double,
    p3: scala.Double,
    p4: scala.Double,
    p5: scala.Double,
    p6: scala.Double,
    p7: scala.Double
  ): scala.Double = js.native
  def softServoWrite(pin: scala.Double, value: scala.Double): scala.Unit = js.native
  def softToneCreate(pin: scala.Double): scala.Double = js.native
  def softToneStop(pin: scala.Double): scala.Unit = js.native
  def softToneWrite(pin: scala.Double, frequency: scala.Double): scala.Unit = js.native
  def sr595Setup(
    pinBase: scala.Double,
    numPins: scala.Double,
    dataPin: scala.Double,
    clockPin: scala.Double,
    latchPin: scala.Double
  ): scala.Double = js.native
  def tcs34725ClearInterrupt(id: scala.Double): scala.Unit = js.native
  def tcs34725Disable(id: scala.Double): scala.Unit = js.native
  def tcs34725Enable(id: scala.Double): scala.Unit = js.native
  def tcs34725GetCorrelatedColorTemperature(r: scala.Double, g: scala.Double, b: scala.Double): scala.Unit = js.native
  def tcs34725GetIlluminance(r: scala.Double, g: scala.Double, b: scala.Double): scala.Unit = js.native
  def tcs34725ReadHSV(id: scala.Double): tcs34725HSV = js.native
  def tcs34725ReadRGBC(id: scala.Double): tcs34725RGBC = js.native
  def tcs34725SetInterrupt(id: scala.Double, aien: scala.Double): scala.Unit = js.native
  def tcs34725SetInterruptLimits(id: scala.Double, low: scala.Double, high: scala.Double): scala.Unit = js.native
  def tcs34725Setup(i2cAddress: scala.Double, integrationTime: scala.Double, gain: scala.Double): scala.Double = js.native
  def wiringPiI2CClose(fd: scala.Double): scala.Unit = js.native
  def wiringPiI2CRead(fd: scala.Double): scala.Double = js.native
  def wiringPiI2CReadReg16(fd: scala.Double, reg: scala.Double): scala.Double = js.native
  def wiringPiI2CReadReg8(fd: scala.Double, reg: scala.Double): scala.Double = js.native
  def wiringPiI2CSetup(devId: scala.Double): scala.Double = js.native
  def wiringPiI2CSetupInterface(device: java.lang.String, devId: scala.Double): scala.Double = js.native
  def wiringPiI2CWrite(fd: scala.Double, data: scala.Double): scala.Double = js.native
  def wiringPiI2CWriteReg16(fd: scala.Double, reg: scala.Double, data: scala.Double): scala.Double = js.native
  def wiringPiI2CWriteReg8(fd: scala.Double, reg: scala.Double, data: scala.Double): scala.Double = js.native
  def wiringPiISR(
    pin: scala.Double,
    edgeType: scala.Double,
    callback: js.Function1[/* delta */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def wiringPiISRCancel(pin: scala.Double): scala.Unit = js.native
  def wiringPiSPIClose(fd: scala.Double): scala.Unit = js.native
  def wiringPiSPIDataRW(channel: scala.Double, data: nodeLib.Buffer): scala.Double = js.native
  def wiringPiSPIGetFd(channel: scala.Double): scala.Double = js.native
  def wiringPiSPISetup(channel: scala.Double, speed: scala.Double): scala.Double = js.native
  def wiringPiSPISetupMode(channel: scala.Double, speed: scala.Double, mode: scala.Double): scala.Double = js.native
  def wiringPiSetup(): scala.Double = js.native
  def wiringPiSetupGpio(): scala.Double = js.native
  def wiringPiSetupPhys(): scala.Double = js.native
  def wiringPiSetupSys(): scala.Double = js.native
  def wpiPinToGpio(pin: scala.Double): scala.Double = js.native
}

