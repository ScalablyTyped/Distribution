package typings.updateNotifier

import typings.boxen.mod.Options
import typings.configstore.mod.^
import typings.updateNotifier.updateNotifierStrings.build
import typings.updateNotifier.updateNotifierStrings.latest
import typings.updateNotifier.updateNotifierStrings.major
import typings.updateNotifier.updateNotifierStrings.minor
import typings.updateNotifier.updateNotifierStrings.patch
import typings.updateNotifier.updateNotifierStrings.prerelease
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /** Checks if there is an available update */
  @JSImport("update-notifier", JSImport.Namespace)
  @js.native
  def apply(): UpdateNotifier = js.native
  @JSImport("update-notifier", JSImport.Namespace)
  @js.native
  def apply(settings: Settings): UpdateNotifier = js.native
  
  @JSImport("update-notifier", "UpdateNotifier")
  @js.native
  class UpdateNotifier () extends StObject {
    def this(settings: Settings) = this()
    
    def check(): Unit = js.native
    
    val config: ^ = js.native
    
    /**
      * Check update information
      * @async
      */
    def fetchInfo(): UpdateInfo | js.Promise[UpdateInfo] = js.native
    
    def notify(customMessage: NotifyOptions): Unit = js.native
    
    val update: js.UndefOr[UpdateInfo] = js.native
  }
  
  @js.native
  trait NotifyOptions extends StObject {
    
    /**
      * Options object that will be passed to `boxen`
      * See https://github.com/sindresorhus/boxen/blob/master/index.d.ts
      */
    var boxenOptions: js.UndefOr[Options] = js.native
    
    /** Defer showing the notification to after the process has exited */
    var defer: js.UndefOr[Boolean] = js.native
    
    /** Include the -g argument in the default message's npm i recommendation */
    var isGlobal: js.UndefOr[Boolean] = js.native
    
    /** Message that will be shown when an update is available */
    var message: js.UndefOr[String] = js.native
  }
  object NotifyOptions {
    
    @scala.inline
    def apply(): NotifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotifyOptions]
    }
    
    @scala.inline
    implicit class NotifyOptionsMutableBuilder[Self <: NotifyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBoxenOptions(value: Options): Self = StObject.set(x, "boxenOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoxenOptionsUndefined: Self = StObject.set(x, "boxenOptions", js.undefined)
      
      @scala.inline
      def setDefer(value: Boolean): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
      
      @scala.inline
      def setIsGlobal(value: Boolean): Self = StObject.set(x, "isGlobal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsGlobalUndefined: Self = StObject.set(x, "isGlobal", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
  
  @js.native
  trait Package extends StObject {
    
    var name: String = js.native
    
    var version: String = js.native
  }
  object Package {
    
    @scala.inline
    def apply(name: String, version: String): Package = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Package]
    }
    
    @scala.inline
    implicit class PackageMutableBuilder[Self <: Package] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Settings extends StObject {
    
    /**
      * Which dist-tag to use to find the latest version
      * @default 'latest'
      */
    var distTag: js.UndefOr[String] = js.native
    
    /**
      * @deprecated use `pkg.name`
      */
    var packageName: js.UndefOr[String] = js.native
    
    /**
      * @deprecated use `pkg.version`
      */
    var packageVersion: js.UndefOr[String] = js.native
    
    var pkg: js.UndefOr[Package] = js.native
    
    /** Allows notification to be shown when running as an npm script */
    var shouldNotifyInNpmScript: js.UndefOr[Boolean] = js.native
    
    /** How often to check for updates */
    var updateCheckInterval: js.UndefOr[Double] = js.native
  }
  object Settings {
    
    @scala.inline
    def apply(): Settings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Settings]
    }
    
    @scala.inline
    implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDistTag(value: String): Self = StObject.set(x, "distTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistTagUndefined: Self = StObject.set(x, "distTag", js.undefined)
      
      @scala.inline
      def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
      
      @scala.inline
      def setPackageVersion(value: String): Self = StObject.set(x, "packageVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackageVersionUndefined: Self = StObject.set(x, "packageVersion", js.undefined)
      
      @scala.inline
      def setPkg(value: Package): Self = StObject.set(x, "pkg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPkgUndefined: Self = StObject.set(x, "pkg", js.undefined)
      
      @scala.inline
      def setShouldNotifyInNpmScript(value: Boolean): Self = StObject.set(x, "shouldNotifyInNpmScript", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldNotifyInNpmScriptUndefined: Self = StObject.set(x, "shouldNotifyInNpmScript", js.undefined)
      
      @scala.inline
      def setUpdateCheckInterval(value: Double): Self = StObject.set(x, "updateCheckInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateCheckIntervalUndefined: Self = StObject.set(x, "updateCheckInterval", js.undefined)
    }
  }
  
  @js.native
  trait UpdateInfo extends StObject {
    
    /** Current version */
    val current: String = js.native
    
    /** Latest version */
    val latest: String = js.native
    
    /** Package name */
    var name: String = js.native
    
    /** Type of current update */
    val `type`: typings.updateNotifier.updateNotifierStrings.latest | major | minor | patch | prerelease | build = js.native
  }
  object UpdateInfo {
    
    @scala.inline
    def apply(
      current: String,
      latest: String,
      name: String,
      `type`: latest | major | minor | patch | prerelease | build
    ): UpdateInfo = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], latest = latest.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateInfo]
    }
    
    @scala.inline
    implicit class UpdateInfoMutableBuilder[Self <: UpdateInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: String): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatest(value: String): Self = StObject.set(x, "latest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: latest | major | minor | patch | prerelease | build): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
