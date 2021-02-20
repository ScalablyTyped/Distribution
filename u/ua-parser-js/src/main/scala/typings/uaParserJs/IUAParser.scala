package typings.uaParserJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IUAParser {
  
  @js.native
  trait BROWSER extends StObject {
    
    /**
      * @deprecated
      */
    var MAJOR: String = js.native
    
    var NAME: String = js.native
    
    var VERSION: String = js.native
  }
  object BROWSER {
    
    @scala.inline
    def apply(MAJOR: String, NAME: String, VERSION: String): BROWSER = {
      val __obj = js.Dynamic.literal(MAJOR = MAJOR.asInstanceOf[js.Any], NAME = NAME.asInstanceOf[js.Any], VERSION = VERSION.asInstanceOf[js.Any])
      __obj.asInstanceOf[BROWSER]
    }
    
    @scala.inline
    implicit class BROWSERMutableBuilder[Self <: BROWSER] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMAJOR(value: String): Self = StObject.set(x, "MAJOR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNAME(value: String): Self = StObject.set(x, "NAME", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVERSION(value: String): Self = StObject.set(x, "VERSION", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CPU extends StObject {
    
    var ARCHITECTURE: String = js.native
  }
  object CPU {
    
    @scala.inline
    def apply(ARCHITECTURE: String): CPU = {
      val __obj = js.Dynamic.literal(ARCHITECTURE = ARCHITECTURE.asInstanceOf[js.Any])
      __obj.asInstanceOf[CPU]
    }
    
    @scala.inline
    implicit class CPUMutableBuilder[Self <: CPU] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setARCHITECTURE(value: String): Self = StObject.set(x, "ARCHITECTURE", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DEVICE extends StObject {
    
    var CONSOLE: String = js.native
    
    var EMBEDDED: String = js.native
    
    var MOBILE: String = js.native
    
    var MODEL: String = js.native
    
    var SMARTTV: String = js.native
    
    var TABLET: String = js.native
    
    var TYPE: String = js.native
    
    var VENDOR: String = js.native
    
    var WEARABLE: String = js.native
  }
  object DEVICE {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class DEVICEMutableBuilder[Self <: DEVICE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCONSOLE(value: String): Self = StObject.set(x, "CONSOLE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEMBEDDED(value: String): Self = StObject.set(x, "EMBEDDED", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMOBILE(value: String): Self = StObject.set(x, "MOBILE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMODEL(value: String): Self = StObject.set(x, "MODEL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSMARTTV(value: String): Self = StObject.set(x, "SMARTTV", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTABLET(value: String): Self = StObject.set(x, "TABLET", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTYPE(value: String): Self = StObject.set(x, "TYPE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVENDOR(value: String): Self = StObject.set(x, "VENDOR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWEARABLE(value: String): Self = StObject.set(x, "WEARABLE", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ENGINE extends StObject {
    
    var NAME: String = js.native
    
    var VERSION: String = js.native
  }
  object ENGINE {
    
    @scala.inline
    def apply(NAME: String, VERSION: String): ENGINE = {
      val __obj = js.Dynamic.literal(NAME = NAME.asInstanceOf[js.Any], VERSION = VERSION.asInstanceOf[js.Any])
      __obj.asInstanceOf[ENGINE]
    }
    
    @scala.inline
    implicit class ENGINEMutableBuilder[Self <: ENGINE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNAME(value: String): Self = StObject.set(x, "NAME", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVERSION(value: String): Self = StObject.set(x, "VERSION", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IBrowser extends StObject {
    
    /**
      * Determined dynamically
      * @deprecated
      */
    var major: js.UndefOr[String] = js.native
    
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
    var name: js.UndefOr[String] = js.native
    
    /**
      * Determined dynamically
      */
    var version: js.UndefOr[String] = js.native
  }
  object IBrowser {
    
    @scala.inline
    def apply(): IBrowser = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBrowser]
    }
    
    @scala.inline
    implicit class IBrowserMutableBuilder[Self <: IBrowser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMajor(value: String): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMajorUndefined: Self = StObject.set(x, "major", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait ICPU extends StObject {
    
    /**
      * Possible architecture:
      *  68k, amd64, arm, arm64, avr, ia32, ia64, irix, irix64, mips, mips64, pa-risc,
      *  ppc, sparc, sparc64
      */
    var architecture: js.UndefOr[String] = js.native
  }
  object ICPU {
    
    @scala.inline
    def apply(): ICPU = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICPU]
    }
    
    @scala.inline
    implicit class ICPUMutableBuilder[Self <: ICPU] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArchitecture(value: String): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArchitectureUndefined: Self = StObject.set(x, "architecture", js.undefined)
    }
  }
  
  @js.native
  trait IDevice extends StObject {
    
    /**
      * Determined dynamically
      */
    var model: js.UndefOr[String] = js.native
    
    /**
      * Possible type:
      * console, mobile, tablet, smarttv, wearable, embedded
      */
    var `type`: js.UndefOr[String] = js.native
    
    /**
      * Possible vendor:
      * Acer, Alcatel, Amazon, Apple, Archos, Asus, BenQ, BlackBerry, Dell, GeeksPhone,
      * Google, HP, HTC, Huawei, Jolla, Lenovo, LG, Meizu, Microsoft, Motorola, Nexian,
      * Nintendo, Nokia, Nvidia, Ouya, Palm, Panasonic, Polytron, RIM, Samsung, Sharp,
      * Siemens, Sony-Ericsson, Sprint, Xbox, ZTE
      */
    var vendor: js.UndefOr[String] = js.native
  }
  object IDevice {
    
    @scala.inline
    def apply(): IDevice = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDevice]
    }
    
    @scala.inline
    implicit class IDeviceMutableBuilder[Self <: IDevice] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVendorUndefined: Self = StObject.set(x, "vendor", js.undefined)
    }
  }
  
  @js.native
  trait IEngine extends StObject {
    
    /**
      * Possible name:
      * Amaya, EdgeHTML, Gecko, iCab, KHTML, Links, Lynx, NetFront, NetSurf, Presto,
      * Tasman, Trident, w3m, WebKit
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * Determined dynamically
      */
    var version: js.UndefOr[String] = js.native
  }
  object IEngine {
    
    @scala.inline
    def apply(): IEngine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IEngine]
    }
    
    @scala.inline
    implicit class IEngineMutableBuilder[Self <: IEngine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
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
    var name: js.UndefOr[String] = js.native
    
    /**
      * Determined dynamically
      */
    var version: js.UndefOr[String] = js.native
  }
  object IOS {
    
    @scala.inline
    def apply(): IOS = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOS]
    }
    
    @scala.inline
    implicit class IOSMutableBuilder[Self <: IOS] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait IResult extends StObject {
    
    var browser: IBrowser = js.native
    
    var cpu: ICPU = js.native
    
    var device: IDevice = js.native
    
    var engine: IEngine = js.native
    
    var os: IOS = js.native
    
    var ua: String = js.native
  }
  object IResult {
    
    @scala.inline
    def apply(browser: IBrowser, cpu: ICPU, device: IDevice, engine: IEngine, os: IOS, ua: String): IResult = {
      val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], cpu = cpu.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], ua = ua.asInstanceOf[js.Any])
      __obj.asInstanceOf[IResult]
    }
    
    @scala.inline
    implicit class IResultMutableBuilder[Self <: IResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrowser(value: IBrowser): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCpu(value: ICPU): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevice(value: IDevice): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngine(value: IEngine): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOs(value: IOS): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUa(value: String): Self = StObject.set(x, "ua", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OS extends StObject {
    
    var NAME: String = js.native
    
    var VERSION: String = js.native
  }
  object OS {
    
    @scala.inline
    def apply(NAME: String, VERSION: String): OS = {
      val __obj = js.Dynamic.literal(NAME = NAME.asInstanceOf[js.Any], VERSION = VERSION.asInstanceOf[js.Any])
      __obj.asInstanceOf[OS]
    }
    
    @scala.inline
    implicit class OSMutableBuilder[Self <: OS] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNAME(value: String): Self = StObject.set(x, "NAME", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVERSION(value: String): Self = StObject.set(x, "VERSION", value.asInstanceOf[js.Any])
    }
  }
}
