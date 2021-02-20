package typings.winrt.Windows.ApplicationModel

import typings.std.Date
import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.StorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Store {
  
  @js.native
  trait CurrentApp extends StObject
  
  @js.native
  trait CurrentAppSimulator extends StObject
  
  @js.native
  trait ICurrentApp extends StObject {
    
    var appId: String = js.native
    
    def getAppReceiptAsync(): IAsyncOperation[String] = js.native
    
    def getProductReceiptAsync(productId: String): IAsyncOperation[String] = js.native
    
    var licenseInformation: LicenseInformation = js.native
    
    var linkUri: Uri = js.native
    
    def loadListingInformationAsync(): IAsyncOperation[ListingInformation] = js.native
    
    def requestAppPurchaseAsync(includeReceipt: Boolean): IAsyncOperation[String] = js.native
    
    def requestProductPurchaseAsync(productId: String, includeReceipt: Boolean): IAsyncOperation[String] = js.native
  }
  object ICurrentApp {
    
    @scala.inline
    def apply(
      appId: String,
      getAppReceiptAsync: () => IAsyncOperation[String],
      getProductReceiptAsync: String => IAsyncOperation[String],
      licenseInformation: LicenseInformation,
      linkUri: Uri,
      loadListingInformationAsync: () => IAsyncOperation[ListingInformation],
      requestAppPurchaseAsync: Boolean => IAsyncOperation[String],
      requestProductPurchaseAsync: (String, Boolean) => IAsyncOperation[String]
    ): ICurrentApp = {
      val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], getAppReceiptAsync = js.Any.fromFunction0(getAppReceiptAsync), getProductReceiptAsync = js.Any.fromFunction1(getProductReceiptAsync), licenseInformation = licenseInformation.asInstanceOf[js.Any], linkUri = linkUri.asInstanceOf[js.Any], loadListingInformationAsync = js.Any.fromFunction0(loadListingInformationAsync), requestAppPurchaseAsync = js.Any.fromFunction1(requestAppPurchaseAsync), requestProductPurchaseAsync = js.Any.fromFunction2(requestProductPurchaseAsync))
      __obj.asInstanceOf[ICurrentApp]
    }
    
    @scala.inline
    implicit class ICurrentAppMutableBuilder[Self <: ICurrentApp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetAppReceiptAsync(value: () => IAsyncOperation[String]): Self = StObject.set(x, "getAppReceiptAsync", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetProductReceiptAsync(value: String => IAsyncOperation[String]): Self = StObject.set(x, "getProductReceiptAsync", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLicenseInformation(value: LicenseInformation): Self = StObject.set(x, "licenseInformation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkUri(value: Uri): Self = StObject.set(x, "linkUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadListingInformationAsync(value: () => IAsyncOperation[ListingInformation]): Self = StObject.set(x, "loadListingInformationAsync", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRequestAppPurchaseAsync(value: Boolean => IAsyncOperation[String]): Self = StObject.set(x, "requestAppPurchaseAsync", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRequestProductPurchaseAsync(value: (String, Boolean) => IAsyncOperation[String]): Self = StObject.set(x, "requestProductPurchaseAsync", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait ICurrentAppSimulator extends StObject {
    
    var appId: String = js.native
    
    def getAppReceiptAsync(): IAsyncOperation[String] = js.native
    
    def getProductReceiptAsync(productId: String): IAsyncOperation[String] = js.native
    
    var licenseInformation: LicenseInformation = js.native
    
    var linkUri: Uri = js.native
    
    def loadListingInformationAsync(): IAsyncOperation[ListingInformation] = js.native
    
    def reloadSimulatorAsync(simulatorSettingsFile: StorageFile): IAsyncAction = js.native
    
    def requestAppPurchaseAsync(includeReceipt: Boolean): IAsyncOperation[String] = js.native
    
    def requestProductPurchaseAsync(productId: String, includeReceipt: Boolean): IAsyncOperation[String] = js.native
  }
  object ICurrentAppSimulator {
    
    @scala.inline
    def apply(
      appId: String,
      getAppReceiptAsync: () => IAsyncOperation[String],
      getProductReceiptAsync: String => IAsyncOperation[String],
      licenseInformation: LicenseInformation,
      linkUri: Uri,
      loadListingInformationAsync: () => IAsyncOperation[ListingInformation],
      reloadSimulatorAsync: StorageFile => IAsyncAction,
      requestAppPurchaseAsync: Boolean => IAsyncOperation[String],
      requestProductPurchaseAsync: (String, Boolean) => IAsyncOperation[String]
    ): ICurrentAppSimulator = {
      val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], getAppReceiptAsync = js.Any.fromFunction0(getAppReceiptAsync), getProductReceiptAsync = js.Any.fromFunction1(getProductReceiptAsync), licenseInformation = licenseInformation.asInstanceOf[js.Any], linkUri = linkUri.asInstanceOf[js.Any], loadListingInformationAsync = js.Any.fromFunction0(loadListingInformationAsync), reloadSimulatorAsync = js.Any.fromFunction1(reloadSimulatorAsync), requestAppPurchaseAsync = js.Any.fromFunction1(requestAppPurchaseAsync), requestProductPurchaseAsync = js.Any.fromFunction2(requestProductPurchaseAsync))
      __obj.asInstanceOf[ICurrentAppSimulator]
    }
    
    @scala.inline
    implicit class ICurrentAppSimulatorMutableBuilder[Self <: ICurrentAppSimulator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetAppReceiptAsync(value: () => IAsyncOperation[String]): Self = StObject.set(x, "getAppReceiptAsync", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetProductReceiptAsync(value: String => IAsyncOperation[String]): Self = StObject.set(x, "getProductReceiptAsync", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLicenseInformation(value: LicenseInformation): Self = StObject.set(x, "licenseInformation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkUri(value: Uri): Self = StObject.set(x, "linkUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadListingInformationAsync(value: () => IAsyncOperation[ListingInformation]): Self = StObject.set(x, "loadListingInformationAsync", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReloadSimulatorAsync(value: StorageFile => IAsyncAction): Self = StObject.set(x, "reloadSimulatorAsync", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRequestAppPurchaseAsync(value: Boolean => IAsyncOperation[String]): Self = StObject.set(x, "requestAppPurchaseAsync", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRequestProductPurchaseAsync(value: (String, Boolean) => IAsyncOperation[String]): Self = StObject.set(x, "requestProductPurchaseAsync", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait ILicenseInformation extends StObject {
    
    var expirationDate: Date = js.native
    
    var isActive: Boolean = js.native
    
    var isTrial: Boolean = js.native
    
    var onlicensechanged: js.Any = js.native
    
    var productLicenses: IMapView[String, ProductLicense] = js.native
  }
  object ILicenseInformation {
    
    @scala.inline
    def apply(
      expirationDate: Date,
      isActive: Boolean,
      isTrial: Boolean,
      onlicensechanged: js.Any,
      productLicenses: IMapView[String, ProductLicense]
    ): ILicenseInformation = {
      val __obj = js.Dynamic.literal(expirationDate = expirationDate.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isTrial = isTrial.asInstanceOf[js.Any], onlicensechanged = onlicensechanged.asInstanceOf[js.Any], productLicenses = productLicenses.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILicenseInformation]
    }
    
    @scala.inline
    implicit class ILicenseInformationMutableBuilder[Self <: ILicenseInformation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpirationDate(value: Date): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsTrial(value: Boolean): Self = StObject.set(x, "isTrial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlicensechanged(value: js.Any): Self = StObject.set(x, "onlicensechanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProductLicenses(value: IMapView[String, ProductLicense]): Self = StObject.set(x, "productLicenses", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IListingInformation extends StObject {
    
    var ageRating: Double = js.native
    
    var currentMarket: String = js.native
    
    var description: String = js.native
    
    var formattedPrice: String = js.native
    
    var name: String = js.native
    
    var productListings: IMapView[String, ProductListing] = js.native
  }
  object IListingInformation {
    
    @scala.inline
    def apply(
      ageRating: Double,
      currentMarket: String,
      description: String,
      formattedPrice: String,
      name: String,
      productListings: IMapView[String, ProductListing]
    ): IListingInformation = {
      val __obj = js.Dynamic.literal(ageRating = ageRating.asInstanceOf[js.Any], currentMarket = currentMarket.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], formattedPrice = formattedPrice.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], productListings = productListings.asInstanceOf[js.Any])
      __obj.asInstanceOf[IListingInformation]
    }
    
    @scala.inline
    implicit class IListingInformationMutableBuilder[Self <: IListingInformation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgeRating(value: Double): Self = StObject.set(x, "ageRating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentMarket(value: String): Self = StObject.set(x, "currentMarket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormattedPrice(value: String): Self = StObject.set(x, "formattedPrice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProductListings(value: IMapView[String, ProductListing]): Self = StObject.set(x, "productListings", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IProductLicense extends StObject {
    
    var expirationDate: Date = js.native
    
    var isActive: Boolean = js.native
    
    var productId: String = js.native
  }
  object IProductLicense {
    
    @scala.inline
    def apply(expirationDate: Date, isActive: Boolean, productId: String): IProductLicense = {
      val __obj = js.Dynamic.literal(expirationDate = expirationDate.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any])
      __obj.asInstanceOf[IProductLicense]
    }
    
    @scala.inline
    implicit class IProductLicenseMutableBuilder[Self <: IProductLicense] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpirationDate(value: Date): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IProductListing extends StObject {
    
    var formattedPrice: String = js.native
    
    var name: String = js.native
    
    var productId: String = js.native
  }
  object IProductListing {
    
    @scala.inline
    def apply(formattedPrice: String, name: String, productId: String): IProductListing = {
      val __obj = js.Dynamic.literal(formattedPrice = formattedPrice.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any])
      __obj.asInstanceOf[IProductListing]
    }
    
    @scala.inline
    implicit class IProductListingMutableBuilder[Self <: IProductListing] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormattedPrice(value: String): Self = StObject.set(x, "formattedPrice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    }
  }
  
  type LicenseChangedEventHandler = js.Function0[Unit]
  
  @js.native
  trait LicenseInformation extends ILicenseInformation
  object LicenseInformation {
    
    @scala.inline
    def apply(
      expirationDate: Date,
      isActive: Boolean,
      isTrial: Boolean,
      onlicensechanged: js.Any,
      productLicenses: IMapView[String, ProductLicense]
    ): LicenseInformation = {
      val __obj = js.Dynamic.literal(expirationDate = expirationDate.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isTrial = isTrial.asInstanceOf[js.Any], onlicensechanged = onlicensechanged.asInstanceOf[js.Any], productLicenses = productLicenses.asInstanceOf[js.Any])
      __obj.asInstanceOf[LicenseInformation]
    }
  }
  
  @js.native
  trait ListingInformation extends IListingInformation
  object ListingInformation {
    
    @scala.inline
    def apply(
      ageRating: Double,
      currentMarket: String,
      description: String,
      formattedPrice: String,
      name: String,
      productListings: IMapView[String, ProductListing]
    ): ListingInformation = {
      val __obj = js.Dynamic.literal(ageRating = ageRating.asInstanceOf[js.Any], currentMarket = currentMarket.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], formattedPrice = formattedPrice.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], productListings = productListings.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListingInformation]
    }
  }
  
  @js.native
  trait ProductLicense extends IProductLicense
  object ProductLicense {
    
    @scala.inline
    def apply(expirationDate: Date, isActive: Boolean, productId: String): ProductLicense = {
      val __obj = js.Dynamic.literal(expirationDate = expirationDate.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProductLicense]
    }
  }
  
  @js.native
  trait ProductListing extends IProductListing
  object ProductListing {
    
    @scala.inline
    def apply(formattedPrice: String, name: String, productId: String): ProductListing = {
      val __obj = js.Dynamic.literal(formattedPrice = formattedPrice.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProductListing]
    }
  }
}
