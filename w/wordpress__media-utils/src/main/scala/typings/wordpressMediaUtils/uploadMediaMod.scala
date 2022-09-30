package typings.wordpressMediaUtils

import typings.std.ArrayLike
import typings.std.File
import typings.std.Record
import typings.wordpressMediaUtils.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uploadMediaMod {
  
  @JSImport("@wordpress/media-utils/utils/upload-media", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def uploadMedia(options: UploadMediaOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("uploadMedia")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof @wordpress/core-data.@wordpress/core-data/schema.Schema.Media<'edit'>, 'alt_text' | 'caption' | 'source_url' | 'title'> ]: @wordpress/core-data.@wordpress/core-data/schema.Schema.Media<'edit'>[P]} */ trait MediaItem extends StObject {
    
    var alt: String
    
    var caption: String
    
    var title: String
    
    var url: String
  }
  object MediaItem {
    
    inline def apply(alt: String, caption: String, title: String, url: String): MediaItem = {
      val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaItem]
    }
    
    extension [Self <: MediaItem](x: Self) {
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wordpressMediaUtils.wordpressMediaUtilsStrings.MIME_TYPE_NOT_ALLOWED_FOR_USER
    - typings.wordpressMediaUtils.wordpressMediaUtilsStrings.MIME_TYPE_NOT_SUPPORTED
    - typings.wordpressMediaUtils.wordpressMediaUtilsStrings.SIZE_ABOVE_LIMIT
    - typings.wordpressMediaUtils.wordpressMediaUtilsStrings.EMPTY_FILE
    - typings.wordpressMediaUtils.wordpressMediaUtilsStrings.GENERAL
  */
  trait UploadMediaErrorCode extends StObject
  object UploadMediaErrorCode {
    
    inline def EMPTY_FILE: typings.wordpressMediaUtils.wordpressMediaUtilsStrings.EMPTY_FILE = "EMPTY_FILE".asInstanceOf[typings.wordpressMediaUtils.wordpressMediaUtilsStrings.EMPTY_FILE]
    
    inline def GENERAL: typings.wordpressMediaUtils.wordpressMediaUtilsStrings.GENERAL = "GENERAL".asInstanceOf[typings.wordpressMediaUtils.wordpressMediaUtilsStrings.GENERAL]
    
    inline def MIME_TYPE_NOT_ALLOWED_FOR_USER: typings.wordpressMediaUtils.wordpressMediaUtilsStrings.MIME_TYPE_NOT_ALLOWED_FOR_USER = "MIME_TYPE_NOT_ALLOWED_FOR_USER".asInstanceOf[typings.wordpressMediaUtils.wordpressMediaUtilsStrings.MIME_TYPE_NOT_ALLOWED_FOR_USER]
    
    inline def MIME_TYPE_NOT_SUPPORTED: typings.wordpressMediaUtils.wordpressMediaUtilsStrings.MIME_TYPE_NOT_SUPPORTED = "MIME_TYPE_NOT_SUPPORTED".asInstanceOf[typings.wordpressMediaUtils.wordpressMediaUtilsStrings.MIME_TYPE_NOT_SUPPORTED]
    
    inline def SIZE_ABOVE_LIMIT: typings.wordpressMediaUtils.wordpressMediaUtilsStrings.SIZE_ABOVE_LIMIT = "SIZE_ABOVE_LIMIT".asInstanceOf[typings.wordpressMediaUtils.wordpressMediaUtilsStrings.SIZE_ABOVE_LIMIT]
  }
  
  trait UploadMediaOptions extends StObject {
    
    /**
      * Additional data to include in the request.
      */
    var additionalData: js.UndefOr[Record[String, Any]] = js.undefined
    
    /**
      * Array with the types of media that can be uploaded, if unset all types are allowed.
      */
    var allowedTypes: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * List of files.
      */
    var filesList: ArrayLike[File]
    
    /**
      * Maximum upload size in bytes allowed for the site.
      */
    var maxUploadFileSize: Double
    
    /**
      * Function called when an error happens.
      */
    def onError(error: Code): Unit
    
    /**
      * Function called each time a file or a temporary representation of the file is available.
      */
    def onFileChange(files: js.Array[MediaItem]): Unit
    
    /**
      * Allowed mime types and file extensions.
      * @example
      * ```js
      * {
      *   'jpg|jpeg': 'image/jpeg',
      * }
      * ```
      */
    var wpAllowedMimeTypes: js.UndefOr[Record[String, String]] = js.undefined
  }
  object UploadMediaOptions {
    
    inline def apply(
      filesList: ArrayLike[File],
      maxUploadFileSize: Double,
      onError: Code => Unit,
      onFileChange: js.Array[MediaItem] => Unit
    ): UploadMediaOptions = {
      val __obj = js.Dynamic.literal(filesList = filesList.asInstanceOf[js.Any], maxUploadFileSize = maxUploadFileSize.asInstanceOf[js.Any], onError = js.Any.fromFunction1(onError), onFileChange = js.Any.fromFunction1(onFileChange))
      __obj.asInstanceOf[UploadMediaOptions]
    }
    
    extension [Self <: UploadMediaOptions](x: Self) {
      
      inline def setAdditionalData(value: Record[String, Any]): Self = StObject.set(x, "additionalData", value.asInstanceOf[js.Any])
      
      inline def setAdditionalDataUndefined: Self = StObject.set(x, "additionalData", js.undefined)
      
      inline def setAllowedTypes(value: js.Array[String]): Self = StObject.set(x, "allowedTypes", value.asInstanceOf[js.Any])
      
      inline def setAllowedTypesUndefined: Self = StObject.set(x, "allowedTypes", js.undefined)
      
      inline def setAllowedTypesVarargs(value: String*): Self = StObject.set(x, "allowedTypes", js.Array(value*))
      
      inline def setFilesList(value: ArrayLike[File]): Self = StObject.set(x, "filesList", value.asInstanceOf[js.Any])
      
      inline def setMaxUploadFileSize(value: Double): Self = StObject.set(x, "maxUploadFileSize", value.asInstanceOf[js.Any])
      
      inline def setOnError(value: Code => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnFileChange(value: js.Array[MediaItem] => Unit): Self = StObject.set(x, "onFileChange", js.Any.fromFunction1(value))
      
      inline def setWpAllowedMimeTypes(value: Record[String, String]): Self = StObject.set(x, "wpAllowedMimeTypes", value.asInstanceOf[js.Any])
      
      inline def setWpAllowedMimeTypesUndefined: Self = StObject.set(x, "wpAllowedMimeTypes", js.undefined)
    }
  }
}
