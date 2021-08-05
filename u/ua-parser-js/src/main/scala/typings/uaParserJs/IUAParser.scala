package typings.uaParserJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IUAParser {
  
  trait BROWSER extends StObject {
    
    /**
      * @deprecated
      */
    var MAJOR: String
    
    var NAME: String
    
    var VERSION: String
  }
  object BROWSER {
    
    inline def apply(MAJOR: String, NAME: String, VERSION: String): BROWSER = {
      val __obj = js.Dynamic.literal(MAJOR = MAJOR.asInstanceOf[js.Any], NAME = NAME.asInstanceOf[js.Any], VERSION = VERSION.asInstanceOf[js.Any])
      __obj.asInstanceOf[BROWSER]
    }
    
    extension [Self <: BROWSER](x: Self) {
      
      inline def setMAJOR(value: String): Self = StObject.set(x, "MAJOR", value.asInstanceOf[js.Any])
      
      inline def setNAME(value: String): Self = StObject.set(x, "NAME", value.asInstanceOf[js.Any])
      
      inline def setVERSION(value: String): Self = StObject.set(x, "VERSION", value.asInstanceOf[js.Any])
    }
  }
  
  trait CPU extends StObject {
    
    var ARCHITECTURE: String
  }
  object CPU {
    
    inline def apply(ARCHITECTURE: String): CPU = {
      val __obj = js.Dynamic.literal(ARCHITECTURE = ARCHITECTURE.asInstanceOf[js.Any])
      __obj.asInstanceOf[CPU]
    }
    
    extension [Self <: CPU](x: Self) {
      
      inline def setARCHITECTURE(value: String): Self = StObject.set(x, "ARCHITECTURE", value.asInstanceOf[js.Any])
    }
  }
  
  trait DEVICE extends StObject {
    
    var CONSOLE: String
    
    var EMBEDDED: String
    
    var MOBILE: String
    
    var MODEL: String
    
    var SMARTTV: String
    
    var TABLET: String
    
    var TYPE: String
    
    var VENDOR: String
    
    var WEARABLE: String
  }
  object DEVICE {
    
    inline def apply(
      CONSOLE: String,
      EMBEDDED: String,
      MOBILE: String,
      MODEL: String,
      SMARTTV: String,
      TABLET: String,
      TYPE: String,
      VENDOR: String,
      WEARABLE: String
    ): DEVICE = {
      val __obj = js.Dynamic.literal(CONSOLE = CONSOLE.asInstanceOf[js.Any], EMBEDDED = EMBEDDED.asInstanceOf[js.Any], MOBILE = MOBILE.asInstanceOf[js.Any], MODEL = MODEL.asInstanceOf[js.Any], SMARTTV = SMARTTV.asInstanceOf[js.Any], TABLET = TABLET.asInstanceOf[js.Any], TYPE = TYPE.asInstanceOf[js.Any], VENDOR = VENDOR.asInstanceOf[js.Any], WEARABLE = WEARABLE.asInstanceOf[js.Any])
      __obj.asInstanceOf[DEVICE]
    }
    
    extension [Self <: DEVICE](x: Self) {
      
      inline def setCONSOLE(value: String): Self = StObject.set(x, "CONSOLE", value.asInstanceOf[js.Any])
      
      inline def setEMBEDDED(value: String): Self = StObject.set(x, "EMBEDDED", value.asInstanceOf[js.Any])
      
      inline def setMOBILE(value: String): Self = StObject.set(x, "MOBILE", value.asInstanceOf[js.Any])
      
      inline def setMODEL(value: String): Self = StObject.set(x, "MODEL", value.asInstanceOf[js.Any])
      
      inline def setSMARTTV(value: String): Self = StObject.set(x, "SMARTTV", value.asInstanceOf[js.Any])
      
      inline def setTABLET(value: String): Self = StObject.set(x, "TABLET", value.asInstanceOf[js.Any])
      
      inline def setTYPE(value: String): Self = StObject.set(x, "TYPE", value.asInstanceOf[js.Any])
      
      inline def setVENDOR(value: String): Self = StObject.set(x, "VENDOR", value.asInstanceOf[js.Any])
      
      inline def setWEARABLE(value: String): Self = StObject.set(x, "WEARABLE", value.asInstanceOf[js.Any])
    }
  }
  
  trait ENGINE extends StObject {
    
    var NAME: String
    
    var VERSION: String
  }
  object ENGINE {
    
    inline def apply(NAME: String, VERSION: String): ENGINE = {
      val __obj = js.Dynamic.literal(NAME = NAME.asInstanceOf[js.Any], VERSION = VERSION.asInstanceOf[js.Any])
      __obj.asInstanceOf[ENGINE]
    }
    
    extension [Self <: ENGINE](x: Self) {
      
      inline def setNAME(value: String): Self = StObject.set(x, "NAME", value.asInstanceOf[js.Any])
      
      inline def setVERSION(value: String): Self = StObject.set(x, "VERSION", value.asInstanceOf[js.Any])
    }
  }
  
  trait IBrowser extends StObject {
    
    /**
      * Determined dynamically
      * @deprecated
      */
    var major: js.UndefOr[String] = js.undefined
    
    /**
      * Possible values :
      * Amaya, Android Browser, Arora, Avant, Baidu, Blazer, Bolt, Camino, Chimera, Chrome,
      * Chromium, Comodo Dragon, Conkeror, Dillo, Dolphin, Doris, Edge, Epiphany, Fennec,
      * Firebird, Firefox, Flock, GoBrowser, iCab, ICE Browser, IceApe, IceCat, IceDragon,
      * Iceweasel, IE [Mobile], Iron, Jasmine, K-Meleon, Konqueror, Kindle, Links,
      * Lunascape, Lynx, Maemo, Maxthon, Midori, Minimo, MIUI Browser, [Mobile] Safari,
      * Mosaic, Mozilla, Netfront, Netscape, NetSurf, Nokia, OmniWeb, Opera [Mini/Mobi/Tablet],
      * Phoenix, Polaris, QQBrowser, RockMelt, Silk, Skyfire, SeaMonkey, SlimBrowser, Swiftfox,
      * Tizen, UCBrowser, Vivaldi, w3m, Yandex
      *
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Determined dynamically
      */
    var version: js.UndefOr[String] = js.undefined
  }
  object IBrowser {
    
    inline def apply(): IBrowser = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBrowser]
    }
    
    extension [Self <: IBrowser](x: Self) {
      
      inline def setMajor(value: String): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
      
      inline def setMajorUndefined: Self = StObject.set(x, "major", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait ICPU extends StObject {
    
    /**
      * Possible architecture:
      *  68k, amd64, arm, arm64, avr, ia32, ia64, irix, irix64, mips, mips64, pa-risc,
      *  ppc, sparc, sparc64
      */
    var architecture: js.UndefOr[String] = js.undefined
  }
  object ICPU {
    
    inline def apply(): ICPU = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICPU]
    }
    
    extension [Self <: ICPU](x: Self) {
      
      inline def setArchitecture(value: String): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
      
      inline def setArchitectureUndefined: Self = StObject.set(x, "architecture", js.undefined)
    }
  }
  
  trait IDevice extends StObject {
    
    /**
      * Determined dynamically
      */
    var model: js.UndefOr[String] = js.undefined
    
    /**
      * Possible type:
      * console, mobile, tablet, smarttv, wearable, embedded
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /**
      * Possible vendor:
      * Acer, Alcatel, Amazon, Apple, Archos, Asus, BenQ, BlackBerry, Dell, GeeksPhone,
      * Google, HP, HTC, Huawei, Jolla, Lenovo, LG, Meizu, Microsoft, Motorola, Nexian,
      * Nintendo, Nokia, Nvidia, Ouya, Palm, Panasonic, Polytron, RIM, Samsung, Sharp,
      * Siemens, Sony-Ericsson, Sprint, Xbox, ZTE
      */
    var vendor: js.UndefOr[String] = js.undefined
  }
  object IDevice {
    
    inline def apply(): IDevice = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDevice]
    }
    
    extension [Self <: IDevice](x: Self) {
      
      inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
      
      inline def setVendorUndefined: Self = StObject.set(x, "vendor", js.undefined)
    }
  }
  
  trait IEngine extends StObject {
    
    /**
      * Possible name:
      * Amaya, EdgeHTML, Gecko, iCab, KHTML, Links, Lynx, NetFront, NetSurf, Presto,
      * Tasman, Trident, w3m, WebKit
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Determined dynamically
      */
    var version: js.UndefOr[String] = js.undefined
  }
  object IEngine {
    
    inline def apply(): IEngine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IEngine]
    }
    
    extension [Self <: IEngine](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait IOS extends StObject {
    
    /**
      * Possible 'os.name'
      * AIX, Amiga OS, Android, Arch, Bada, BeOS, BlackBerry, CentOS, Chromium OS, Contiki,
      * Fedora, Firefox OS, FreeBSD, Debian, DragonFly, Gentoo, GNU, Haiku, Hurd, iOS,
      * Joli, Linpus, Linux, Mac OS, Mageia, Mandriva, MeeGo, Minix, Mint, Morph OS, NetBSD,
      * Nintendo, OpenBSD, OpenVMS, OS/2, Palm, PCLinuxOS, Plan9, Playstation, QNX, RedHat,
      * RIM Tablet OS, RISC OS, Sailfish, Series40, Slackware, Solaris, SUSE, Symbian, Tizen,
      * Ubuntu, UNIX, VectorLinux, WebOS, Windows [Phone/Mobile], Zenwalk
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Determined dynamically
      */
    var version: js.UndefOr[String] = js.undefined
  }
  object IOS {
    
    inline def apply(): IOS = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOS]
    }
    
    extension [Self <: IOS](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait IResult extends StObject {
    
    var browser: IBrowser
    
    var cpu: ICPU
    
    var device: IDevice
    
    var engine: IEngine
    
    var os: IOS
    
    var ua: String
  }
  object IResult {
    
    inline def apply(browser: IBrowser, cpu: ICPU, device: IDevice, engine: IEngine, os: IOS, ua: String): IResult = {
      val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], cpu = cpu.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], ua = ua.asInstanceOf[js.Any])
      __obj.asInstanceOf[IResult]
    }
    
    extension [Self <: IResult](x: Self) {
      
      inline def setBrowser(value: IBrowser): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setCpu(value: ICPU): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
      
      inline def setDevice(value: IDevice): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      inline def setEngine(value: IEngine): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      inline def setOs(value: IOS): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      inline def setUa(value: String): Self = StObject.set(x, "ua", value.asInstanceOf[js.Any])
    }
  }
  
  trait OS extends StObject {
    
    var NAME: String
    
    var VERSION: String
  }
  object OS {
    
    inline def apply(NAME: String, VERSION: String): OS = {
      val __obj = js.Dynamic.literal(NAME = NAME.asInstanceOf[js.Any], VERSION = VERSION.asInstanceOf[js.Any])
      __obj.asInstanceOf[OS]
    }
    
    extension [Self <: OS](x: Self) {
      
      inline def setNAME(value: String): Self = StObject.set(x, "NAME", value.asInstanceOf[js.Any])
      
      inline def setVERSION(value: String): Self = StObject.set(x, "VERSION", value.asInstanceOf[js.Any])
    }
  }
}
