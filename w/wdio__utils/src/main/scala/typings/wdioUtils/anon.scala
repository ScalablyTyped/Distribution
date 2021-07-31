package typings.wdioUtils

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var value: js.UndefOr[Record[String, js.Any]] = js.undefined
  }
  object `0` {
    
    @scala.inline
    def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: Record[String, js.Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait Call extends StObject {
    
    def apply(sessionId: String): js.Any = js.native
    def apply(sessionId: String, commandWrapper: js.Function): js.Any = js.native
    
    def lift(name: String, func: js.Function, proto: Record[String, js.Any]): Unit = js.native
    def lift(name: String, func: js.Function, proto: Record[String, js.Any], origCommand: js.Function): Unit = js.native
  }
  
  trait Capabilities extends StObject {
    
    var capabilities: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ js.Any
      ] = js.undefined
    
    var requestedCapabilities: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ js.Any
      ] = js.undefined
  }
  object Capabilities {
    
    @scala.inline
    def apply(): Capabilities = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Capabilities]
    }
    
    @scala.inline
    implicit class CapabilitiesMutableBuilder[Self <: Capabilities] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCapabilities(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ js.Any
      ): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
      
      @scala.inline
      def setRequestedCapabilities(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ js.Any
      ): Self = StObject.set(x, "requestedCapabilities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestedCapabilitiesUndefined: Self = StObject.set(x, "requestedCapabilities", js.undefined)
    }
  }
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var __elementOverrides__ : js.UndefOr[ValueAny] = js.undefined
  }
  object Dictkey {
    
    @scala.inline
    def apply(): Dictkey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit class DictkeyMutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set__elementOverrides__(value: ValueAny): Self = StObject.set(x, "__elementOverrides__", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set__elementOverrides__Undefined: Self = StObject.set(x, "__elementOverrides__", js.undefined)
    }
  }
  
  trait File extends StObject {
    
    var file: js.UndefOr[String] = js.undefined
  }
  object File {
    
    @scala.inline
    def apply(): File = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[File]
    }
    
    @scala.inline
    implicit class FileMutableBuilder[Self <: File] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[T](): js.Promise[js.Array[Error | T]] = js.native
    def apply[T](hooks: js.Array[js.Function]): js.Promise[js.Array[Error | T]] = js.native
    def apply[T](hooks: js.Array[js.Function], args: js.Any): js.Promise[js.Array[Error | T]] = js.native
    def apply[T](hooks: js.Array[js.Function], args: js.Array[js.Any]): js.Promise[js.Array[Error | T]] = js.native
    def apply[T](hooks: js.Function): js.Promise[js.Array[Error | T]] = js.native
    def apply[T](hooks: js.Function, args: js.Any): js.Promise[js.Array[Error | T]] = js.native
    def apply[T](hooks: js.Function, args: js.Array[js.Any]): js.Promise[js.Array[Error | T]] = js.native
    def apply[T](hooks: Unit, args: js.Any): js.Promise[js.Array[Error | T]] = js.native
    def apply[T](hooks: Unit, args: js.Array[js.Any]): js.Promise[js.Array[Error | T]] = js.native
  }
  
  trait IgnoredWorkerServices extends StObject {
    
    var ignoredWorkerServices: js.Array[String]
    
    var launcherServices: js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.ServiceInstance */ js.Any
      ]
  }
  object IgnoredWorkerServices {
    
    @scala.inline
    def apply(
      ignoredWorkerServices: js.Array[String],
      launcherServices: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.ServiceInstance */ js.Any
        ]
    ): IgnoredWorkerServices = {
      val __obj = js.Dynamic.literal(ignoredWorkerServices = ignoredWorkerServices.asInstanceOf[js.Any], launcherServices = launcherServices.asInstanceOf[js.Any])
      __obj.asInstanceOf[IgnoredWorkerServices]
    }
    
    @scala.inline
    implicit class IgnoredWorkerServicesMutableBuilder[Self <: IgnoredWorkerServices] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIgnoredWorkerServices(value: js.Array[String]): Self = StObject.set(x, "ignoredWorkerServices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoredWorkerServicesVarargs(value: String*): Self = StObject.set(x, "ignoredWorkerServices", js.Array(value :_*))
      
      @scala.inline
      def setLauncherServices(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.ServiceInstance */ js.Any
            ]
      ): Self = StObject.set(x, "launcherServices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLauncherServicesVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.ServiceInstance */ js.Any)*
      ): Self = StObject.set(x, "launcherServices", js.Array(value :_*))
    }
  }
  
  trait IsAndroid extends StObject {
    
    var isAndroid: Boolean
    
    var isChrome: Boolean
    
    var isIOS: Boolean
    
    var isMobile: Boolean
    
    var isSauce: Boolean
  }
  object IsAndroid {
    
    @scala.inline
    def apply(isAndroid: Boolean, isChrome: Boolean, isIOS: Boolean, isMobile: Boolean, isSauce: Boolean): IsAndroid = {
      val __obj = js.Dynamic.literal(isAndroid = isAndroid.asInstanceOf[js.Any], isChrome = isChrome.asInstanceOf[js.Any], isIOS = isIOS.asInstanceOf[js.Any], isMobile = isMobile.asInstanceOf[js.Any], isSauce = isSauce.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsAndroid]
    }
    
    @scala.inline
    implicit class IsAndroidMutableBuilder[Self <: IsAndroid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsAndroid(value: Boolean): Self = StObject.set(x, "isAndroid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsChrome(value: Boolean): Self = StObject.set(x, "isChrome", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsIOS(value: Boolean): Self = StObject.set(x, "isIOS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMobile(value: Boolean): Self = StObject.set(x, "isMobile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSauce(value: Boolean): Self = StObject.set(x, "isSauce", value.asInstanceOf[js.Any])
    }
  }
  
  trait IsChrome extends StObject {
    
    var isAndroid: Boolean
    
    var isChrome: Boolean
    
    var isIOS: Boolean
    
    var isMobile: Boolean
    
    var isSauce: Boolean
    
    var isSeleniumStandalone: Boolean
    
    var isW3C: Boolean
  }
  object IsChrome {
    
    @scala.inline
    def apply(
      isAndroid: Boolean,
      isChrome: Boolean,
      isIOS: Boolean,
      isMobile: Boolean,
      isSauce: Boolean,
      isSeleniumStandalone: Boolean,
      isW3C: Boolean
    ): IsChrome = {
      val __obj = js.Dynamic.literal(isAndroid = isAndroid.asInstanceOf[js.Any], isChrome = isChrome.asInstanceOf[js.Any], isIOS = isIOS.asInstanceOf[js.Any], isMobile = isMobile.asInstanceOf[js.Any], isSauce = isSauce.asInstanceOf[js.Any], isSeleniumStandalone = isSeleniumStandalone.asInstanceOf[js.Any], isW3C = isW3C.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsChrome]
    }
    
    @scala.inline
    implicit class IsChromeMutableBuilder[Self <: IsChrome] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsAndroid(value: Boolean): Self = StObject.set(x, "isAndroid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsChrome(value: Boolean): Self = StObject.set(x, "isChrome", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsIOS(value: Boolean): Self = StObject.set(x, "isIOS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMobile(value: Boolean): Self = StObject.set(x, "isMobile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSauce(value: Boolean): Self = StObject.set(x, "isSauce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSeleniumStandalone(value: Boolean): Self = StObject.set(x, "isSeleniumStandalone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsW3C(value: Boolean): Self = StObject.set(x, "isW3C", value.asInstanceOf[js.Any])
    }
  }
  
  trait IsDevTools extends StObject {
    
    var isAndroid: Boolean
    
    var isChrome: Boolean
    
    var isDevTools: Boolean
    
    var isIOS: Boolean
    
    var isMobile: Boolean
    
    var isSauce: Boolean
    
    var isSeleniumStandalone: Boolean
    
    var isW3C: Boolean
  }
  object IsDevTools {
    
    @scala.inline
    def apply(
      isAndroid: Boolean,
      isChrome: Boolean,
      isDevTools: Boolean,
      isIOS: Boolean,
      isMobile: Boolean,
      isSauce: Boolean,
      isSeleniumStandalone: Boolean,
      isW3C: Boolean
    ): IsDevTools = {
      val __obj = js.Dynamic.literal(isAndroid = isAndroid.asInstanceOf[js.Any], isChrome = isChrome.asInstanceOf[js.Any], isDevTools = isDevTools.asInstanceOf[js.Any], isIOS = isIOS.asInstanceOf[js.Any], isMobile = isMobile.asInstanceOf[js.Any], isSauce = isSauce.asInstanceOf[js.Any], isSeleniumStandalone = isSeleniumStandalone.asInstanceOf[js.Any], isW3C = isW3C.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsDevTools]
    }
    
    @scala.inline
    implicit class IsDevToolsMutableBuilder[Self <: IsDevTools] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsAndroid(value: Boolean): Self = StObject.set(x, "isAndroid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsChrome(value: Boolean): Self = StObject.set(x, "isChrome", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDevTools(value: Boolean): Self = StObject.set(x, "isDevTools", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsIOS(value: Boolean): Self = StObject.set(x, "isIOS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMobile(value: Boolean): Self = StObject.set(x, "isMobile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSauce(value: Boolean): Self = StObject.set(x, "isSauce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSeleniumStandalone(value: Boolean): Self = StObject.set(x, "isSeleniumStandalone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsW3C(value: Boolean): Self = StObject.set(x, "isW3C", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value extends StObject {
    
    var value: js.Array[String]
  }
  object Value {
    
    @scala.inline
    def apply(value: js.Array[String]): Value = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: js.Array[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  trait ValueAny extends StObject {
    
    var value: js.Any
  }
  object ValueAny {
    
    @scala.inline
    def apply(value: js.Any): ValueAny = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueAny]
    }
    
    @scala.inline
    implicit class ValueAnyMutableBuilder[Self <: ValueAny] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ValueRecord extends StObject {
    
    var value: Record[String, js.Any]
  }
  object ValueRecord {
    
    @scala.inline
    def apply(value: Record[String, js.Any]): ValueRecord = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueRecord]
    }
    
    @scala.inline
    implicit class ValueRecordMutableBuilder[Self <: ValueRecord] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: Record[String, js.Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
