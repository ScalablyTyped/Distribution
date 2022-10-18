package typings.webextensionPolyfill.namespacesManifestMod.Manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a WebExtension site permissions manifest.json file
  */
trait WebExtensionSitePermissionsManifest
  extends StObject
     with ManifestBase {
  
  @JSName("install_origins")
  var install_origins_WebExtensionSitePermissionsManifest: js.Array[String]
  
  var site_permissions: js.Array[SitePermission]
}
object WebExtensionSitePermissionsManifest {
  
  inline def apply(
    install_origins: js.Array[String],
    manifest_version: Double,
    name: String,
    site_permissions: js.Array[SitePermission],
    version: String
  ): WebExtensionSitePermissionsManifest = {
    val __obj = js.Dynamic.literal(install_origins = install_origins.asInstanceOf[js.Any], manifest_version = manifest_version.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], site_permissions = site_permissions.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebExtensionSitePermissionsManifest]
  }
  
  extension [Self <: WebExtensionSitePermissionsManifest](x: Self) {
    
    inline def setInstall_origins(value: js.Array[String]): Self = StObject.set(x, "install_origins", value.asInstanceOf[js.Any])
    
    inline def setInstall_originsVarargs(value: String*): Self = StObject.set(x, "install_origins", js.Array(value*))
    
    inline def setSite_permissions(value: js.Array[SitePermission]): Self = StObject.set(x, "site_permissions", value.asInstanceOf[js.Any])
    
    inline def setSite_permissionsVarargs(value: SitePermission*): Self = StObject.set(x, "site_permissions", js.Array(value*))
  }
}
