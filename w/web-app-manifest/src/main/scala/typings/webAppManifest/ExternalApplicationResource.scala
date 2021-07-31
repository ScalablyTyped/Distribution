package typings.webAppManifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Each `ExternalApplicationResources` represents an application related to the web application.
  *
  * @see https://w3c.github.io/manifest/#externalapplicationresource-and-its-members
  */
trait ExternalApplicationResource extends StObject {
  
  /**
    * The `fingerprints` member of an `ExternalApplicationResource` dictionary represents an array of
    * `Fingerprint`s.
    *
    * @see https://w3c.github.io/manifest/#fingerprints-member
    */
  var fingerprints: js.UndefOr[js.Array[Fingerprint]] = js.undefined
  
  /**
    * The `id` member of an ExternalApplicationResource dictionary represents the id which is used to
    * represent the application on the platform.
    *
    * @see https://w3c.github.io/manifest/#id-member
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The `min_version` member of an `ExternalApplicationResource` dictionary represents the minimum version
    * of the application that is considered related to this web app.
    *
    * @see https://w3c.github.io/manifest/#min_version-member
    */
  var min_version: js.UndefOr[String] = js.undefined
  
  /**
    * The `platform` member represents the platform to which a containing object applies.
    *
    * @see https://w3c.github.io/manifest/#platform-member-0
    */
  var platform: String
  
  /**
    * The `url` member of an ExternalApplicationResource dictionary represents the
    * URL at which the application can be found.
    *
    * @see https://w3c.github.io/manifest/#url-member-0
    */
  var url: js.UndefOr[String] = js.undefined
}
object ExternalApplicationResource {
  
  @scala.inline
  def apply(platform: String): ExternalApplicationResource = {
    val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalApplicationResource]
  }
  
  @scala.inline
  implicit class ExternalApplicationResourceMutableBuilder[Self <: ExternalApplicationResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFingerprints(value: js.Array[Fingerprint]): Self = StObject.set(x, "fingerprints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprintsUndefined: Self = StObject.set(x, "fingerprints", js.undefined)
    
    @scala.inline
    def setFingerprintsVarargs(value: Fingerprint*): Self = StObject.set(x, "fingerprints", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setMin_version(value: String): Self = StObject.set(x, "min_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin_versionUndefined: Self = StObject.set(x, "min_version", js.undefined)
    
    @scala.inline
    def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
