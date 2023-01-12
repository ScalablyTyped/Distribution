package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemInfoDeviceCapability extends StObject {
  
  /**
    * Indicates whether the device supports accelerometer.
    */
  val accelerometer: Boolean
  
  /**
    * Indicates whether the device supports accelerometer wake-up feature.
    *
    * @since 2.1
    */
  val accelerometerWakeup: Boolean
  
  /**
    * Indicates whether the device supports auto rotation.
    *
    * @since 2.1
    */
  val autoRotation: Boolean
  
  /**
    * Indicates whether the device supports barometer.
    */
  val barometer: Boolean
  
  /**
    * Indicates whether the device supports barometer wake-up feature.
    *
    * @since 2.1
    */
  val barometerWakeup: Boolean
  
  /**
    * Indicates whether the device supports Bluetooth.
    */
  val bluetooth: Boolean
  
  /**
    * Indicates whether the device supports camera.
    *
    * @since 2.1
    */
  val camera: Boolean
  
  /**
    * Indicates whether the device supports back-side camera.
    */
  val cameraBack: Boolean
  
  /**
    * Indicates whether the device supports flash on the back-side camera.
    */
  val cameraBackFlash: Boolean
  
  /**
    * Indicates whether the device supports front camera.
    */
  val cameraFront: Boolean
  
  /**
    * Indicates whether the device supports flash on the front camera.
    */
  val cameraFrontFlash: Boolean
  
  /**
    * Indicates whether the device supports data encryption.
    *
    * @since 2.1
    */
  val dataEncryption: Boolean
  
  /**
    * Indicates the Tizen ID, not device's unique ID since Tizen 2.3.
    *
    * @remark Tizen ID is a randomly generated value based on the model name.
    * It is recommended to use tizen.systeminfo.getCapability("http://tizen.org/system/tizenid") since Tizen 2.3 instead.
    */
  val duid: String
  
  /**
    * Indicates whether the device supports FM radio.
    */
  val fmRadio: Boolean
  
  /**
    * Indicates whether the device supports hardware acceleration for 2D/3D graphics.
    *
    * @since 2.1
    */
  val graphicsAcceleration: Boolean
  
  /**
    * Indicates whether the device supports gyroscope.
    */
  val gyroscope: Boolean
  
  /**
    * Indicates whether the device supports gyroscope wake-up feature.
    *
    * @since 2.1
    */
  val gyroscopeWakeup: Boolean
  
  /**
    * Indicates whether the device supports the built-in keyboard.
    */
  val inputKeyboard: Boolean
  
  /**
    * Indicates whether the device supports the built-in keyboard layout.
    *
    * @since 2.1
    */
  val inputKeyboardLayout: Boolean
  
  /**
    * Indicates whether the device supports GPS or not.
    */
  val location: Boolean
  
  /**
    * Indicates whether the device supports GPS based location feature.
    */
  val locationGps: Boolean
  
  /**
    * Indicates whether the device supports WPS based location feature.
    */
  val locationWps: Boolean
  
  /**
    * Indicates whether the device supports magnetometer.
    */
  val magnetometer: Boolean
  
  /**
    * Indicates whether the device supports magnetometer wake-up feature.
    *
    * @since 2.1
    */
  val magnetometerWakeup: Boolean
  
  /**
    * Indicates whether the device supports microphone.
    */
  val microphone: Boolean
  
  /**
    * The number of point in Multi-point touch.
    */
  val multiTouchCount: Double
  
  /**
    * The version of the Native API in the _\[Major\].\[Minor\].\[Patch Version\]_ format.
    *
    * For example, 1.0.0 represents a Native API version where the major version is 1 and the minor and build versions are 0.
    * _\[Patch Version\]_ is optional. The Tizen platform strictly follows this versioning system and this format must be preserved.
    * Manufacturers may add more parts (dot followed by number or text) after the preserved format.
    * If a version is not versioned as \[Major\].\[Minor\].\[Patch Version\], the unused digits must be taken as 0.
    * So for example, version 2.3 is 2.3.0 and manufacturers must add parts after 2.3.0 such as 2.3.0.1.
    *
    * @since 2.1
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/system
    *
    * @throw WebAPIException with error type SecurityError, if this attribute is not allowed.
    */
  val nativeApiVersion: String
  
  /**
    * Indicates whether the device supports native OSP API.
    *
    * @since 2.1
    */
  val nativeOspCompatible: Boolean
  
  /**
    * Indicates whether the device supports NFC.
    */
  val nfc: Boolean
  
  /**
    * Indicates whether the device supports NFC reserved push.
    *
    * @since 2.1
    */
  val nfcReservedPush: Boolean
  
  /**
    * Indicates whether the device supports OpenGL-ES.
    *
    * @since 2.1
    */
  val opengles: Boolean
  
  /**
    * Indicates whether the device supports OpenGL-ES version 1.1.
    */
  val openglesVersion1_1: Boolean
  
  /**
    * Indicates whether the device supports OpenGL-ES version 2.0.
    */
  val openglesVersion2_0: Boolean
  
  /**
    * The device 3DC texture format for OpenGL-ES.
    *
    * One example of possible output is as follows: "3dc/atc/etc/ptc/pvrtc/utc"
    *
    * @since 2.1
    */
  val openglestextureFormat: String
  
  /**
    * Indicates whether the device supports photometer.
    *
    * @since 2.1
    */
  val photometer: Boolean
  
  /**
    * Indicates whether the device supports photometer wake-up feature.
    *
    * @since 2.1
    */
  val photometerWakeup: Boolean
  
  /**
    * The device CPU architecture.
    *
    * The possible values for this attribute are: armv6, armv7, x86.
    */
  val platformCoreCpuArch: String
  
  /**
    * The device FPU architecture.
    *
    * The possible values for this attribute are: vfpv3, sse2, sse3 and ssse3.
    */
  val platformCoreFpuArch: String
  
  /**
    * The name of the platform.
    */
  val platformName: String
  
  /**
    * The version of the platform in the _\[Major\].\[Minor\].\[Patch Version\]_ format.
    *
    * For example, 1.0.0 represents a platform version where the major version is 1 and the minor and build versions are 0.
    * _\[Patch Version\]_ is optional. The Tizen platform strictly follows this versioning system and this format must be preserved.
    * Manufacturers may add more parts (dot followed by number or text) after the preserved format.
    * If a version is not versioned as \[Major\].\[Minor\].\[Patch Version\], the unused digits must be taken as 0.
    * So for example, version 2.3 is 2.3.0 and manufacturers must add parts after 2.3.0 such as 2.3.0.1.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/system
    *
    * @throw WebAPIException with error type SecurityError, if this attribute is not allowed.
    */
  val platformVersion: String
  
  /**
    * Represents the profile of the current device.
    *
    * @since 2.2
    */
  val profile: SystemInfoProfile
  
  /**
    * Indicates whether the device supports proximity.
    */
  val proximity: Boolean
  
  /**
    * Indicates whether the device supports proximity wake-up feature.
    *
    * @since 2.1
    */
  val proximityWakeup: Boolean
  
  /**
    * Indicates whether the device supports push service.
    *
    * @since 2.1
    */
  val push: Boolean
  
  /**
    * Indicates whether the device supports HDMI output.
    */
  val screenOutputHdmi: Boolean
  
  /**
    * Indicates whether the device supports RCA output.
    */
  val screenOutputRca: Boolean
  
  /**
    * Indicates whether the device supports the 480 \* 800 screen size.
    *
    * @since 2.1
    */
  val screenSize480_800: Boolean
  
  /**
    * Indicates whether the device supports the 720 \* 1280 screen size.
    *
    * @since 2.1
    */
  val screenSize720_1280: Boolean
  
  /**
    * Indicates whether the device supports the screen normal size.
    *
    * @since 2.1
    */
  val screenSizeNormal: Boolean
  
  /**
    * Indicates whether the device supports secure element.
    *
    * @since 2.1
    */
  val secureElement: Boolean
  
  /**
    * Indicates whether the device supports shell app widget (dynamic box).
    *
    * @since 2.1
    */
  val shellAppWidget: Boolean
  
  /**
    * Indicates whether the device supports VOIP.
    */
  val sipVoip: Boolean
  
  /**
    * Indicates whether the device supports speech recognition.
    */
  val speechRecognition: Boolean
  
  /**
    * Indicates whether the device supports speech synthesis.
    *
    * @since 2.1
    */
  val speechSynthesis: Boolean
  
  /**
    * Indicates whether the device supports the telephony feature.
    *
    * @since 2.1
    */
  val telephony: Boolean
  
  /**
    * Indicates whether the device supports the MMS feature.
    *
    * @since 2.1
    */
  val telephonyMms: Boolean
  
  /**
    * Indicates whether the device supports the SMS feature.
    *
    * @since 2.1
    */
  val telephonySms: Boolean
  
  /**
    * Indicates whether the device supports tiltmeter.
    *
    * @since 2.1
    */
  val tiltmeter: Boolean
  
  /**
    * Indicates whether the device supports tiltmeter wake-up feature.
    *
    * @since 2.1
    */
  val tiltmeterWakeup: Boolean
  
  /**
    * Indicates whether the device supports USB accessory.
    */
  val usbAccessory: Boolean
  
  /**
    * Indicates whether the device supports USB host.
    */
  val usbHost: Boolean
  
  /**
    * Indicates whether the device supports vision face recognition.
    *
    * @since 2.1
    */
  val visionFaceRecognition: Boolean
  
  /**
    * Indicates whether the device supports vision image recognition.
    *
    * @since 2.1
    */
  val visionImageRecognition: Boolean
  
  /**
    * Indicates whether the device supports vision QR code generation.
    *
    * @since 2.1
    */
  val visionQrcodeGeneration: Boolean
  
  /**
    * Indicates whether the device supports vision QR code recognition.
    *
    * @since 2.1
    */
  val visionQrcodeRecognition: Boolean
  
  /**
    * The version of the Web API in the _\[Major\].\[Minor\].\[Patch Version\]_ format.
    *
    * For example, 1.0.0 represents a Web API version where the major version is 1 and the minor and build versions are 0.
    * _\[Patch Version\]_ is optional. The Tizen platform strictly follows this versioning system and this format must be preserved.
    * Manufacturers may add more parts (dot followed by number or text) after the preserved format.
    * If a version is not versioned as \[Major\].\[Minor\].\[Patch Version\], the unused digits must be taken as 0.
    * So for example, version 2.3 is 2.3.0 and manufacturers must add parts after 2.3.0 such as 2.3.0.1.
    *
    * @since 2.1
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/system
    *
    * @throw WebAPIException with error type SecurityError, if this attribute is not allowed.
    */
  val webApiVersion: String
  
  /**
    * Indicates whether the device supports Wi-Fi.
    */
  val wifi: Boolean
  
  /**
    * Indicates whether the device supports Wi-Fi Direct.
    */
  val wifiDirect: Boolean
}
object SystemInfoDeviceCapability {
  
  inline def apply(
    accelerometer: Boolean,
    accelerometerWakeup: Boolean,
    autoRotation: Boolean,
    barometer: Boolean,
    barometerWakeup: Boolean,
    bluetooth: Boolean,
    camera: Boolean,
    cameraBack: Boolean,
    cameraBackFlash: Boolean,
    cameraFront: Boolean,
    cameraFrontFlash: Boolean,
    dataEncryption: Boolean,
    duid: String,
    fmRadio: Boolean,
    graphicsAcceleration: Boolean,
    gyroscope: Boolean,
    gyroscopeWakeup: Boolean,
    inputKeyboard: Boolean,
    inputKeyboardLayout: Boolean,
    location: Boolean,
    locationGps: Boolean,
    locationWps: Boolean,
    magnetometer: Boolean,
    magnetometerWakeup: Boolean,
    microphone: Boolean,
    multiTouchCount: Double,
    nativeApiVersion: String,
    nativeOspCompatible: Boolean,
    nfc: Boolean,
    nfcReservedPush: Boolean,
    opengles: Boolean,
    openglesVersion1_1: Boolean,
    openglesVersion2_0: Boolean,
    openglestextureFormat: String,
    photometer: Boolean,
    photometerWakeup: Boolean,
    platformCoreCpuArch: String,
    platformCoreFpuArch: String,
    platformName: String,
    platformVersion: String,
    profile: SystemInfoProfile,
    proximity: Boolean,
    proximityWakeup: Boolean,
    push: Boolean,
    screenOutputHdmi: Boolean,
    screenOutputRca: Boolean,
    screenSize480_800: Boolean,
    screenSize720_1280: Boolean,
    screenSizeNormal: Boolean,
    secureElement: Boolean,
    shellAppWidget: Boolean,
    sipVoip: Boolean,
    speechRecognition: Boolean,
    speechSynthesis: Boolean,
    telephony: Boolean,
    telephonyMms: Boolean,
    telephonySms: Boolean,
    tiltmeter: Boolean,
    tiltmeterWakeup: Boolean,
    usbAccessory: Boolean,
    usbHost: Boolean,
    visionFaceRecognition: Boolean,
    visionImageRecognition: Boolean,
    visionQrcodeGeneration: Boolean,
    visionQrcodeRecognition: Boolean,
    webApiVersion: String,
    wifi: Boolean,
    wifiDirect: Boolean
  ): SystemInfoDeviceCapability = {
    val __obj = js.Dynamic.literal(accelerometer = accelerometer.asInstanceOf[js.Any], accelerometerWakeup = accelerometerWakeup.asInstanceOf[js.Any], autoRotation = autoRotation.asInstanceOf[js.Any], barometer = barometer.asInstanceOf[js.Any], barometerWakeup = barometerWakeup.asInstanceOf[js.Any], bluetooth = bluetooth.asInstanceOf[js.Any], camera = camera.asInstanceOf[js.Any], cameraBack = cameraBack.asInstanceOf[js.Any], cameraBackFlash = cameraBackFlash.asInstanceOf[js.Any], cameraFront = cameraFront.asInstanceOf[js.Any], cameraFrontFlash = cameraFrontFlash.asInstanceOf[js.Any], dataEncryption = dataEncryption.asInstanceOf[js.Any], duid = duid.asInstanceOf[js.Any], fmRadio = fmRadio.asInstanceOf[js.Any], graphicsAcceleration = graphicsAcceleration.asInstanceOf[js.Any], gyroscope = gyroscope.asInstanceOf[js.Any], gyroscopeWakeup = gyroscopeWakeup.asInstanceOf[js.Any], inputKeyboard = inputKeyboard.asInstanceOf[js.Any], inputKeyboardLayout = inputKeyboardLayout.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], locationGps = locationGps.asInstanceOf[js.Any], locationWps = locationWps.asInstanceOf[js.Any], magnetometer = magnetometer.asInstanceOf[js.Any], magnetometerWakeup = magnetometerWakeup.asInstanceOf[js.Any], microphone = microphone.asInstanceOf[js.Any], multiTouchCount = multiTouchCount.asInstanceOf[js.Any], nativeApiVersion = nativeApiVersion.asInstanceOf[js.Any], nativeOspCompatible = nativeOspCompatible.asInstanceOf[js.Any], nfc = nfc.asInstanceOf[js.Any], nfcReservedPush = nfcReservedPush.asInstanceOf[js.Any], opengles = opengles.asInstanceOf[js.Any], openglesVersion1_1 = openglesVersion1_1.asInstanceOf[js.Any], openglesVersion2_0 = openglesVersion2_0.asInstanceOf[js.Any], openglestextureFormat = openglestextureFormat.asInstanceOf[js.Any], photometer = photometer.asInstanceOf[js.Any], photometerWakeup = photometerWakeup.asInstanceOf[js.Any], platformCoreCpuArch = platformCoreCpuArch.asInstanceOf[js.Any], platformCoreFpuArch = platformCoreFpuArch.asInstanceOf[js.Any], platformName = platformName.asInstanceOf[js.Any], platformVersion = platformVersion.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], proximity = proximity.asInstanceOf[js.Any], proximityWakeup = proximityWakeup.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any], screenOutputHdmi = screenOutputHdmi.asInstanceOf[js.Any], screenOutputRca = screenOutputRca.asInstanceOf[js.Any], screenSize480_800 = screenSize480_800.asInstanceOf[js.Any], screenSize720_1280 = screenSize720_1280.asInstanceOf[js.Any], screenSizeNormal = screenSizeNormal.asInstanceOf[js.Any], secureElement = secureElement.asInstanceOf[js.Any], shellAppWidget = shellAppWidget.asInstanceOf[js.Any], sipVoip = sipVoip.asInstanceOf[js.Any], speechRecognition = speechRecognition.asInstanceOf[js.Any], speechSynthesis = speechSynthesis.asInstanceOf[js.Any], telephony = telephony.asInstanceOf[js.Any], telephonyMms = telephonyMms.asInstanceOf[js.Any], telephonySms = telephonySms.asInstanceOf[js.Any], tiltmeter = tiltmeter.asInstanceOf[js.Any], tiltmeterWakeup = tiltmeterWakeup.asInstanceOf[js.Any], usbAccessory = usbAccessory.asInstanceOf[js.Any], usbHost = usbHost.asInstanceOf[js.Any], visionFaceRecognition = visionFaceRecognition.asInstanceOf[js.Any], visionImageRecognition = visionImageRecognition.asInstanceOf[js.Any], visionQrcodeGeneration = visionQrcodeGeneration.asInstanceOf[js.Any], visionQrcodeRecognition = visionQrcodeRecognition.asInstanceOf[js.Any], webApiVersion = webApiVersion.asInstanceOf[js.Any], wifi = wifi.asInstanceOf[js.Any], wifiDirect = wifiDirect.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfoDeviceCapability]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SystemInfoDeviceCapability] (val x: Self) extends AnyVal {
    
    inline def setAccelerometer(value: Boolean): Self = StObject.set(x, "accelerometer", value.asInstanceOf[js.Any])
    
    inline def setAccelerometerWakeup(value: Boolean): Self = StObject.set(x, "accelerometerWakeup", value.asInstanceOf[js.Any])
    
    inline def setAutoRotation(value: Boolean): Self = StObject.set(x, "autoRotation", value.asInstanceOf[js.Any])
    
    inline def setBarometer(value: Boolean): Self = StObject.set(x, "barometer", value.asInstanceOf[js.Any])
    
    inline def setBarometerWakeup(value: Boolean): Self = StObject.set(x, "barometerWakeup", value.asInstanceOf[js.Any])
    
    inline def setBluetooth(value: Boolean): Self = StObject.set(x, "bluetooth", value.asInstanceOf[js.Any])
    
    inline def setCamera(value: Boolean): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    inline def setCameraBack(value: Boolean): Self = StObject.set(x, "cameraBack", value.asInstanceOf[js.Any])
    
    inline def setCameraBackFlash(value: Boolean): Self = StObject.set(x, "cameraBackFlash", value.asInstanceOf[js.Any])
    
    inline def setCameraFront(value: Boolean): Self = StObject.set(x, "cameraFront", value.asInstanceOf[js.Any])
    
    inline def setCameraFrontFlash(value: Boolean): Self = StObject.set(x, "cameraFrontFlash", value.asInstanceOf[js.Any])
    
    inline def setDataEncryption(value: Boolean): Self = StObject.set(x, "dataEncryption", value.asInstanceOf[js.Any])
    
    inline def setDuid(value: String): Self = StObject.set(x, "duid", value.asInstanceOf[js.Any])
    
    inline def setFmRadio(value: Boolean): Self = StObject.set(x, "fmRadio", value.asInstanceOf[js.Any])
    
    inline def setGraphicsAcceleration(value: Boolean): Self = StObject.set(x, "graphicsAcceleration", value.asInstanceOf[js.Any])
    
    inline def setGyroscope(value: Boolean): Self = StObject.set(x, "gyroscope", value.asInstanceOf[js.Any])
    
    inline def setGyroscopeWakeup(value: Boolean): Self = StObject.set(x, "gyroscopeWakeup", value.asInstanceOf[js.Any])
    
    inline def setInputKeyboard(value: Boolean): Self = StObject.set(x, "inputKeyboard", value.asInstanceOf[js.Any])
    
    inline def setInputKeyboardLayout(value: Boolean): Self = StObject.set(x, "inputKeyboardLayout", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: Boolean): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationGps(value: Boolean): Self = StObject.set(x, "locationGps", value.asInstanceOf[js.Any])
    
    inline def setLocationWps(value: Boolean): Self = StObject.set(x, "locationWps", value.asInstanceOf[js.Any])
    
    inline def setMagnetometer(value: Boolean): Self = StObject.set(x, "magnetometer", value.asInstanceOf[js.Any])
    
    inline def setMagnetometerWakeup(value: Boolean): Self = StObject.set(x, "magnetometerWakeup", value.asInstanceOf[js.Any])
    
    inline def setMicrophone(value: Boolean): Self = StObject.set(x, "microphone", value.asInstanceOf[js.Any])
    
    inline def setMultiTouchCount(value: Double): Self = StObject.set(x, "multiTouchCount", value.asInstanceOf[js.Any])
    
    inline def setNativeApiVersion(value: String): Self = StObject.set(x, "nativeApiVersion", value.asInstanceOf[js.Any])
    
    inline def setNativeOspCompatible(value: Boolean): Self = StObject.set(x, "nativeOspCompatible", value.asInstanceOf[js.Any])
    
    inline def setNfc(value: Boolean): Self = StObject.set(x, "nfc", value.asInstanceOf[js.Any])
    
    inline def setNfcReservedPush(value: Boolean): Self = StObject.set(x, "nfcReservedPush", value.asInstanceOf[js.Any])
    
    inline def setOpengles(value: Boolean): Self = StObject.set(x, "opengles", value.asInstanceOf[js.Any])
    
    inline def setOpenglesVersion1_1(value: Boolean): Self = StObject.set(x, "openglesVersion1_1", value.asInstanceOf[js.Any])
    
    inline def setOpenglesVersion2_0(value: Boolean): Self = StObject.set(x, "openglesVersion2_0", value.asInstanceOf[js.Any])
    
    inline def setOpenglestextureFormat(value: String): Self = StObject.set(x, "openglestextureFormat", value.asInstanceOf[js.Any])
    
    inline def setPhotometer(value: Boolean): Self = StObject.set(x, "photometer", value.asInstanceOf[js.Any])
    
    inline def setPhotometerWakeup(value: Boolean): Self = StObject.set(x, "photometerWakeup", value.asInstanceOf[js.Any])
    
    inline def setPlatformCoreCpuArch(value: String): Self = StObject.set(x, "platformCoreCpuArch", value.asInstanceOf[js.Any])
    
    inline def setPlatformCoreFpuArch(value: String): Self = StObject.set(x, "platformCoreFpuArch", value.asInstanceOf[js.Any])
    
    inline def setPlatformName(value: String): Self = StObject.set(x, "platformName", value.asInstanceOf[js.Any])
    
    inline def setPlatformVersion(value: String): Self = StObject.set(x, "platformVersion", value.asInstanceOf[js.Any])
    
    inline def setProfile(value: SystemInfoProfile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProximity(value: Boolean): Self = StObject.set(x, "proximity", value.asInstanceOf[js.Any])
    
    inline def setProximityWakeup(value: Boolean): Self = StObject.set(x, "proximityWakeup", value.asInstanceOf[js.Any])
    
    inline def setPush(value: Boolean): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
    
    inline def setScreenOutputHdmi(value: Boolean): Self = StObject.set(x, "screenOutputHdmi", value.asInstanceOf[js.Any])
    
    inline def setScreenOutputRca(value: Boolean): Self = StObject.set(x, "screenOutputRca", value.asInstanceOf[js.Any])
    
    inline def setScreenSize480_800(value: Boolean): Self = StObject.set(x, "screenSize480_800", value.asInstanceOf[js.Any])
    
    inline def setScreenSize720_1280(value: Boolean): Self = StObject.set(x, "screenSize720_1280", value.asInstanceOf[js.Any])
    
    inline def setScreenSizeNormal(value: Boolean): Self = StObject.set(x, "screenSizeNormal", value.asInstanceOf[js.Any])
    
    inline def setSecureElement(value: Boolean): Self = StObject.set(x, "secureElement", value.asInstanceOf[js.Any])
    
    inline def setShellAppWidget(value: Boolean): Self = StObject.set(x, "shellAppWidget", value.asInstanceOf[js.Any])
    
    inline def setSipVoip(value: Boolean): Self = StObject.set(x, "sipVoip", value.asInstanceOf[js.Any])
    
    inline def setSpeechRecognition(value: Boolean): Self = StObject.set(x, "speechRecognition", value.asInstanceOf[js.Any])
    
    inline def setSpeechSynthesis(value: Boolean): Self = StObject.set(x, "speechSynthesis", value.asInstanceOf[js.Any])
    
    inline def setTelephony(value: Boolean): Self = StObject.set(x, "telephony", value.asInstanceOf[js.Any])
    
    inline def setTelephonyMms(value: Boolean): Self = StObject.set(x, "telephonyMms", value.asInstanceOf[js.Any])
    
    inline def setTelephonySms(value: Boolean): Self = StObject.set(x, "telephonySms", value.asInstanceOf[js.Any])
    
    inline def setTiltmeter(value: Boolean): Self = StObject.set(x, "tiltmeter", value.asInstanceOf[js.Any])
    
    inline def setTiltmeterWakeup(value: Boolean): Self = StObject.set(x, "tiltmeterWakeup", value.asInstanceOf[js.Any])
    
    inline def setUsbAccessory(value: Boolean): Self = StObject.set(x, "usbAccessory", value.asInstanceOf[js.Any])
    
    inline def setUsbHost(value: Boolean): Self = StObject.set(x, "usbHost", value.asInstanceOf[js.Any])
    
    inline def setVisionFaceRecognition(value: Boolean): Self = StObject.set(x, "visionFaceRecognition", value.asInstanceOf[js.Any])
    
    inline def setVisionImageRecognition(value: Boolean): Self = StObject.set(x, "visionImageRecognition", value.asInstanceOf[js.Any])
    
    inline def setVisionQrcodeGeneration(value: Boolean): Self = StObject.set(x, "visionQrcodeGeneration", value.asInstanceOf[js.Any])
    
    inline def setVisionQrcodeRecognition(value: Boolean): Self = StObject.set(x, "visionQrcodeRecognition", value.asInstanceOf[js.Any])
    
    inline def setWebApiVersion(value: String): Self = StObject.set(x, "webApiVersion", value.asInstanceOf[js.Any])
    
    inline def setWifi(value: Boolean): Self = StObject.set(x, "wifi", value.asInstanceOf[js.Any])
    
    inline def setWifiDirect(value: Boolean): Self = StObject.set(x, "wifiDirect", value.asInstanceOf[js.Any])
  }
}
