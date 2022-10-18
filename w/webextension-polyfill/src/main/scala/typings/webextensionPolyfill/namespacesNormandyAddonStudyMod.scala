package typings.webextensionPolyfill

import typings.webextensionPolyfill.namespacesEventsMod.Events.Event
import typings.webextensionPolyfill.namespacesExtensionTypesMod.ExtensionTypes.DateType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namespacesNormandyAddonStudyMod {
  
  object NormandyAddonStudy {
    
    trait Static extends StObject {
      
      /**
        * Marks the study as ended and then uninstalls the addon.
        *
        * @param reason The reason why the study is ending.
        */
      def endStudy(reason: String): Unit
      
      /**
        * Returns an object with metadata about the client which may be required for constructing survey URLs.
        */
      def getClientMetadata(): Unit
      
      /**
        * Returns a study object for the current study.
        */
      def getStudy(): Unit
      
      /**
        * Fired when a user unenrolls from a study but before the addon is uninstalled.
        *
        * @param reason The reason why the study is ending.
        */
      var onUnenroll: Event[js.Function1[/* reason */ String, Unit]]
    }
    object Static {
      
      inline def apply(
        endStudy: String => Unit,
        getClientMetadata: () => Unit,
        getStudy: () => Unit,
        onUnenroll: Event[js.Function1[/* reason */ String, Unit]]
      ): Static = {
        val __obj = js.Dynamic.literal(endStudy = js.Any.fromFunction1(endStudy), getClientMetadata = js.Any.fromFunction0(getClientMetadata), getStudy = js.Any.fromFunction0(getStudy), onUnenroll = onUnenroll.asInstanceOf[js.Any])
        __obj.asInstanceOf[Static]
      }
      
      extension [Self <: Static](x: Self) {
        
        inline def setEndStudy(value: String => Unit): Self = StObject.set(x, "endStudy", js.Any.fromFunction1(value))
        
        inline def setGetClientMetadata(value: () => Unit): Self = StObject.set(x, "getClientMetadata", js.Any.fromFunction0(value))
        
        inline def setGetStudy(value: () => Unit): Self = StObject.set(x, "getStudy", js.Any.fromFunction0(value))
        
        inline def setOnUnenroll(value: Event[js.Function1[/* reason */ String, Unit]]): Self = StObject.set(x, "onUnenroll", value.asInstanceOf[js.Any])
      }
    }
    
    trait Study extends StObject {
      
      /**
        * The state of the study.
        */
      var active: Boolean
      
      /**
        * The ID of the extension installed by the study.
        */
      var addonId: String
      
      /**
        * The URL of the XPI that was downloaded and installed by the study.
        */
      var addonUrl: String
      
      /**
        * The version of the extension installed by the study.
        */
      var addonVersion: String
      
      /**
        * The study branch in which the user is enrolled.
        */
      var branch: String
      
      /**
        * The record ID for the extension in Normandy server's database.
        */
      var extensionApiId: Double
      
      /**
        * A hash of the extension XPI file.
        */
      var extensionHash: String
      
      /**
        * The algorithm used to hash the extension XPI file.
        */
      var extensionHashAlgorithm: String
      
      /**
        * The ID of the recipe for the study.
        */
      var recipeId: Double
      
      /**
        * A slug to identify the study.
        */
      var slug: String
      
      /**
        * The end date for the study.
        */
      var studyEndDate: DateType
      
      /**
        * The start date for the study.
        */
      var studyStartDate: DateType
      
      /**
        * The description presented on about:studies.
        */
      var userFacingDescription: String
      
      /**
        * The name presented on about:studies.
        */
      var userFacingName: String
    }
    object Study {
      
      inline def apply(
        active: Boolean,
        addonId: String,
        addonUrl: String,
        addonVersion: String,
        branch: String,
        extensionApiId: Double,
        extensionHash: String,
        extensionHashAlgorithm: String,
        recipeId: Double,
        slug: String,
        studyEndDate: DateType,
        studyStartDate: DateType,
        userFacingDescription: String,
        userFacingName: String
      ): Study = {
        val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], addonId = addonId.asInstanceOf[js.Any], addonUrl = addonUrl.asInstanceOf[js.Any], addonVersion = addonVersion.asInstanceOf[js.Any], branch = branch.asInstanceOf[js.Any], extensionApiId = extensionApiId.asInstanceOf[js.Any], extensionHash = extensionHash.asInstanceOf[js.Any], extensionHashAlgorithm = extensionHashAlgorithm.asInstanceOf[js.Any], recipeId = recipeId.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], studyEndDate = studyEndDate.asInstanceOf[js.Any], studyStartDate = studyStartDate.asInstanceOf[js.Any], userFacingDescription = userFacingDescription.asInstanceOf[js.Any], userFacingName = userFacingName.asInstanceOf[js.Any])
        __obj.asInstanceOf[Study]
      }
      
      extension [Self <: Study](x: Self) {
        
        inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
        
        inline def setAddonId(value: String): Self = StObject.set(x, "addonId", value.asInstanceOf[js.Any])
        
        inline def setAddonUrl(value: String): Self = StObject.set(x, "addonUrl", value.asInstanceOf[js.Any])
        
        inline def setAddonVersion(value: String): Self = StObject.set(x, "addonVersion", value.asInstanceOf[js.Any])
        
        inline def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
        
        inline def setExtensionApiId(value: Double): Self = StObject.set(x, "extensionApiId", value.asInstanceOf[js.Any])
        
        inline def setExtensionHash(value: String): Self = StObject.set(x, "extensionHash", value.asInstanceOf[js.Any])
        
        inline def setExtensionHashAlgorithm(value: String): Self = StObject.set(x, "extensionHashAlgorithm", value.asInstanceOf[js.Any])
        
        inline def setRecipeId(value: Double): Self = StObject.set(x, "recipeId", value.asInstanceOf[js.Any])
        
        inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
        
        inline def setStudyEndDate(value: DateType): Self = StObject.set(x, "studyEndDate", value.asInstanceOf[js.Any])
        
        inline def setStudyStartDate(value: DateType): Self = StObject.set(x, "studyStartDate", value.asInstanceOf[js.Any])
        
        inline def setUserFacingDescription(value: String): Self = StObject.set(x, "userFacingDescription", value.asInstanceOf[js.Any])
        
        inline def setUserFacingName(value: String): Self = StObject.set(x, "userFacingName", value.asInstanceOf[js.Any])
      }
    }
  }
}
