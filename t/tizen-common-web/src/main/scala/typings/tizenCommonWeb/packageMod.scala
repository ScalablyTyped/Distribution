package typings.tizenCommonWeb

import typings.std.Date
import typings.tizenCommonWeb.applicationMod.ApplicationId
import typings.tizenCommonWeb.tizenMod.ErrorCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object packageMod {
  
  type PackageId = String
  
  trait PackageInformation extends StObject {
    
    /**
      * An attribute to store the application ID list of a package.
      */
    val appIds: js.Array[ApplicationId]
    
    /**
      * An attribute to store the author of a package.
      */
    val author: String
    
    /**
      * An attribute to store the current data size of a package.
      */
    val dataSize: Double
    
    /**
      * An attribute to store the package description.
      */
    val description: String
    
    /**
      * An attribute to store the icon path of a package.
      *
      * The icon path of the package is the same as the icon path of the relevant application
      * (see the [iconPath](https://docs.tizen.org/application/web/api/3.0/device_api/tv/tizen/application.html#ApplicationInformation::iconPath) attribute of
      * the [ApplicationInformation](https://docs.tizen.org/application/web/api/3.0/device_api/tv/tizen/application.html#ApplicationInformation) interface).
      *
      * The relevant application is the one with the same
      * [packageId](https://docs.tizen.org/application/web/api/3.0/device_api/tv/tizen/application.html#ApplicationInformation::packageId) as the
      * [id](https://docs.tizen.org/application/web/api/3.0/device_api/tv/tizen/package.html#PackageInformation::id) of this package.
      */
    val iconPath: String
    
    /**
      * An attribute to store the identifier of a package.
      */
    val id: PackageId
    
    /**
      * An attribute to store the latest installed or updated time of a package.
      */
    val lastModified: Date
    
    /**
      * An attribute to store the package name.
      */
    val name: String
    
    /**
      * An attribute to store the total installed size(package + data) of a package.
      */
    val totalSize: Double
    
    /**
      * An attribute to store the package version.
      */
    val version: String
  }
  object PackageInformation {
    
    @scala.inline
    def apply(
      appIds: js.Array[ApplicationId],
      author: String,
      dataSize: Double,
      description: String,
      iconPath: String,
      id: PackageId,
      lastModified: Date,
      name: String,
      totalSize: Double,
      version: String
    ): PackageInformation = {
      val __obj = js.Dynamic.literal(appIds = appIds.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], dataSize = dataSize.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], iconPath = iconPath.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastModified = lastModified.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], totalSize = totalSize.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackageInformation]
    }
    
    @scala.inline
    implicit class PackageInformationMutableBuilder[Self <: PackageInformation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppIds(value: js.Array[ApplicationId]): Self = StObject.set(x, "appIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppIdsVarargs(value: ApplicationId*): Self = StObject.set(x, "appIds", js.Array(value :_*))
      
      @scala.inline
      def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSize(value: Double): Self = StObject.set(x, "dataSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconPath(value: String): Self = StObject.set(x, "iconPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: PackageId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastModified(value: Date): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type PackageInformationArraySuccessCallback = js.Function1[/* informationArray */ js.Array[PackageInformation], Unit]
  
  trait PackageInformationEventCallback extends StObject {
    
    /**
      * Called when a package is installed.
      * @param info The information of the installed package.
      */
    def oninstalled(info: PackageInformation): Unit
    
    /**
      * Called when a package is uninstalled.
      * @param id The ID of the uninstalled package.
      */
    def onuninstalled(id: PackageId): Unit
    
    /**
      * Called when a package is updated.
      * @param info The information of the updated package.
      */
    def onupdated(info: PackageInformation): Unit
  }
  object PackageInformationEventCallback {
    
    @scala.inline
    def apply(
      oninstalled: PackageInformation => Unit,
      onuninstalled: PackageId => Unit,
      onupdated: PackageInformation => Unit
    ): PackageInformationEventCallback = {
      val __obj = js.Dynamic.literal(oninstalled = js.Any.fromFunction1(oninstalled), onuninstalled = js.Any.fromFunction1(onuninstalled), onupdated = js.Any.fromFunction1(onupdated))
      __obj.asInstanceOf[PackageInformationEventCallback]
    }
    
    @scala.inline
    implicit class PackageInformationEventCallbackMutableBuilder[Self <: PackageInformationEventCallback] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOninstalled(value: PackageInformation => Unit): Self = StObject.set(x, "oninstalled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnuninstalled(value: PackageId => Unit): Self = StObject.set(x, "onuninstalled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnupdated(value: PackageInformation => Unit): Self = StObject.set(x, "onupdated", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait PackageManager extends StObject {
    
    /**
      * Gets information of an installed package.
      *
      * If the ID is set to <var>null</var> or not set at all, it returns the package information of the current application.
      * The list of installed packages and their package IDs is obtained using `getPackagesInfo()`.
      *
      *
      * @privilegeLevel public
      * @privilegeName http://tizen.org/privilege/package.info
      *
      * @param id A string representing the package ID. If the ID is not provided, the package information of the calling application is returned.
      *
      * @returns The information of a package.
      *
      * @throw WebAPIException `TypeMismatchError`, `SecurityError`, `NotFoundError`, `UnknownError`.
      */
    def getPackageInfo(): PackageInformation = js.native
    def getPackageInfo(id: PackageId): PackageInformation = js.native
    
    /**
      * Gets information of the installed packages.
      *
      * The result contains the snapshots of the installed packages information.
      *
      * The `errorCallback()` is launched with this error type:
      * - UnknownError - If any other platform error occurs.
      *
      * @privilegeLevel public
      * @privilegeName http://tizen.org/privilege/package.info
      *
      * @param successCallback The method to call when an invocation ends successfully.
      * @param errorCallback The method to call when an error occurs.
      *
      * @throw WebAPIException `TypeMismatchError`, `SecurityError`.
      */
    def getPackagesInfo(successCallback: PackageInformationArraySuccessCallback): Unit = js.native
    def getPackagesInfo(successCallback: PackageInformationArraySuccessCallback, errorCallback: ErrorCallback): Unit = js.native
    
    /**
      * Installs a package with a specified file on a device.
      *
      * This API provides a way to notify the progress and completion of an installation request through PackageProgressCallback.
      *
      * The `ErrorCallback()` is launched with these error types:
      * - `NotFoundError` - If the package is not found at the specified location.
      * - `UnknownError` - If it is not allowed to install the package by the platform or any other platform error occurs.
      * @privilegeLevel platform
      * @privilegeName http://tizen.org/privilege/packagemanager.install
      *
      * @remark Virtual path cannot be used for the parameter. First, you need to convert any virtual path to a file URI path using the resolve function in the Filesystem API before passing it to the function.
      *
      * @param packageFileURI The location of the package to install.
      * @param progressCallback The method to invoke when the installation is in progress or has been completed.
      * @param errorCallback The method to invoke when an error occurs.
      *
      * @throw WebAPIException `TypeMismatchError`, `SecurityError`.
      *
      */
    def install(packageFileURI: String, progressCallback: PackageProgressCallback): Unit = js.native
    def install(packageFileURI: String, progressCallback: PackageProgressCallback, errorCallback: ErrorCallback): Unit = js.native
    
    /**
      * Sets a listener to receive notifications for any changes made to the list of installed packages.
      *
      * This method sets a `PackageInformationEventCallback` type callback that is triggered when a package is installed, removed, or updated.
      *
      * The callback lasts until the `unsetPackageInfoEventListener()` method is called.
      *
      *
      * @privilegeLevel public
      * @privilegeName http://tizen.org/privilege/package.info
      *
      * @param eventCallback The method to be called when any change is made to the list of installed packages.
      *
      * @throw WebAPIException `TypeMismatchError`, `SecurityError`, `UnknownError`.
      */
    def setPackageInfoEventListener(eventCallback: PackageInformationEventCallback): Unit = js.native
    
    /**
      * Uninstalls the package with a specified package ID.
      *
      * This API provides a way to notify about the progress and completion of an uninstallation request through PackageProgressCallback.
      *
      * The `ErrorCallback()` is launched with these error types:
      * - `NotFoundError` - If the package is not found with the specified ID.
      * - `UnknownError` - If it is not allowed to uninstall the package from the platform or any other platform error occurs.
      *
      *
      * @privilegeLevel platform
      * @privilegeName http://tizen.org/privilege/packagemanager.install
      *
      * @remark Some preloaded packages cannot be uninstalled. In this case, ErrorCallback with the UnKnownError type is launched.
      *
      * @param id The package ID to uninstall.
      * @param progressCallback The method to invoke when uninstallation is in progress or has been completed.
      * @param errorCallback The method to invoke when an error occurs.
      *
      * @throw WebAPIException `TypeMismatchError`, `SecurityError`.
      *
      */
    def uninstall(id: PackageId, progressCallback: PackageProgressCallback): Unit = js.native
    def uninstall(id: PackageId, progressCallback: PackageProgressCallback, errorCallback: ErrorCallback): Unit = js.native
    
    /**
      * Unsets the listener to stop receiving package notifications.
      *
      * Calling this function has no effect if listener is not set.
      *
      *
      * @privilegeLevel public
      * @privilegeName http://tizen.org/privilege/package.info
      *
      * @throw WebAPIException `TypeMismatchError`, `SecurityError`, `UnknownError`.
      */
    def unsetPackageInfoEventListener(): Unit = js.native
  }
  
  trait PackageProgressCallback extends StObject {
    
    /**
      * Called when the request is completed.
      *
      *
      * @param id The package ID.
      */
    def oncomplete(id: PackageId): Unit
    
    /**
      * Called while the request is in progress.
      * @param id The package ID.
      * @param progress The progress in percentage.
      */
    def onprogress(id: PackageId, progress: Double): Unit
  }
  object PackageProgressCallback {
    
    @scala.inline
    def apply(oncomplete: PackageId => Unit, onprogress: (PackageId, Double) => Unit): PackageProgressCallback = {
      val __obj = js.Dynamic.literal(oncomplete = js.Any.fromFunction1(oncomplete), onprogress = js.Any.fromFunction2(onprogress))
      __obj.asInstanceOf[PackageProgressCallback]
    }
    
    @scala.inline
    implicit class PackageProgressCallbackMutableBuilder[Self <: PackageProgressCallback] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOncomplete(value: PackageId => Unit): Self = StObject.set(x, "oncomplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnprogress(value: (PackageId, Double) => Unit): Self = StObject.set(x, "onprogress", js.Any.fromFunction2(value))
    }
  }
}
