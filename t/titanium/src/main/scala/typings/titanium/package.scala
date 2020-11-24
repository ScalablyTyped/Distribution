package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object titanium {
  
  /**
    * Argument passed to the callback when a request finishes successfully or erroneously.
    */
  type ContactsAuthorizationResponse = typings.titanium.ErrorResponse
  
  type Dictionary[T] = typings.std.Partial[
    typings.titanium.Omit[
      T, 
      typings.titanium.FunctionPropertyNames[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Proxy */ js.Any
      ]
    ]
  ]
  
  type FunctionPropertyNames[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends std.Function? K : never}[keyof T] */ js.Any
  
  /**
    * Argument passed to the callback when a request finishes successfully or erroneously.
    */
  type LocationAuthorizationResponse = typings.titanium.ErrorResponse
  
  /**
    * Argument passed to the callback when a request finishes successfully or erroneously.
    */
  type MediaAuthorizationResponse = typings.titanium.ErrorResponse
  
  type Omit[T, K /* <: js.UndefOr[/* keyof any */ java.lang.String] */] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  /**
    * Argument passed to the callback when a request finishes successfully or erroneously.
    */
  type RequestCameraAccessResult = typings.titanium.ErrorResponse
  
  /**
    * Argument passed to the callback when a request finishes successfully or erroneously.
    */
  type RequestMusicLibraryAccessResult = typings.titanium.ErrorResponse
  
  /**
    * Argument passed to the callback when a request finishes successfully or erroneously.
    */
  type RequestPermissionAccessResult = typings.titanium.ErrorResponse
  
  /**
    * Argument passed to the callback when a request finishes successfully or erroneously.
    */
  type RequestPhotoGalleryAccessResult = typings.titanium.ErrorResponse
  
  /**
    * Argument passed to the callback when a request finishes successfully or erroneously.
    */
  type RequestStorageAccessResult = typings.titanium.ErrorResponse
}
