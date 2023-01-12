package typings.thumbsupply

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("thumbsupply", JSImport.Namespace)
  @js.native
  val ^ : ThumbSupply = js.native
  
  trait AvailableSize extends StObject {
    
    var LARGE: Size
    
    var MEDIUM: Size
  }
  object AvailableSize {
    
    inline def apply(LARGE: Size, MEDIUM: Size): AvailableSize = {
      val __obj = js.Dynamic.literal(LARGE = LARGE.asInstanceOf[js.Any], MEDIUM = MEDIUM.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvailableSize]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvailableSize] (val x: Self) extends AnyVal {
      
      inline def setLARGE(value: Size): Self = StObject.set(x, "LARGE", value.asInstanceOf[js.Any])
      
      inline def setMEDIUM(value: Size): Self = StObject.set(x, "MEDIUM", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var cacheDir: js.UndefOr[String] = js.undefined
    
    var forceCreate: js.UndefOr[Boolean] = js.undefined
    
    var mimetype: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[Size] = js.undefined
    
    var timestamp: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCacheDir(value: String): Self = StObject.set(x, "cacheDir", value.asInstanceOf[js.Any])
      
      inline def setCacheDirUndefined: Self = StObject.set(x, "cacheDir", js.undefined)
      
      inline def setForceCreate(value: Boolean): Self = StObject.set(x, "forceCreate", value.asInstanceOf[js.Any])
      
      inline def setForceCreateUndefined: Self = StObject.set(x, "forceCreate", js.undefined)
      
      inline def setMimetype(value: String): Self = StObject.set(x, "mimetype", value.asInstanceOf[js.Any])
      
      inline def setMimetypeUndefined: Self = StObject.set(x, "mimetype", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    }
  }
  
  trait Size extends StObject {
    
    var height: Double
    
    var name: js.UndefOr[String] = js.undefined
    
    var width: Double
  }
  object Size {
    
    inline def apply(height: Double, width: Double): Size = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Size]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ThumbSupply extends StObject {
    
    var ThumbSize: AvailableSize = js.native
    
    var _defaultOptions: Options = js.native
    
    def _fetchThumbnailSupplier(file: String): ThumbnailSupplier = js.native
    def _fetchThumbnailSupplier(file: String, options: Options): ThumbnailSupplier = js.native
    
    def _registerThumbSupplier(mimetype: String, Thumbsupplier: ThumbnailSupplier): Unit = js.native
    
    var _thumbSuppliers: ThumbnailSupplier = js.native
    
    def generateThumbnail(file: String): js.Promise[String] = js.native
    def generateThumbnail(file: String, options: Options): js.Promise[String] = js.native
    
    def lookupThumbnail(file: String): js.Promise[String] = js.native
    def lookupThumbnail(file: String, options: Options): js.Promise[String] = js.native
  }
  
  trait ThumbnailSupplier extends StObject {
    
    def createThumbnail(file: String): Unit
    
    def filetype(): String
    
    def getThumbnailFileName(file: String): String
    
    def getThumbnailLocation(file: String): String
    
    def hashFile(file: String): String
  }
  object ThumbnailSupplier {
    
    inline def apply(
      createThumbnail: String => Unit,
      filetype: () => String,
      getThumbnailFileName: String => String,
      getThumbnailLocation: String => String,
      hashFile: String => String
    ): ThumbnailSupplier = {
      val __obj = js.Dynamic.literal(createThumbnail = js.Any.fromFunction1(createThumbnail), filetype = js.Any.fromFunction0(filetype), getThumbnailFileName = js.Any.fromFunction1(getThumbnailFileName), getThumbnailLocation = js.Any.fromFunction1(getThumbnailLocation), hashFile = js.Any.fromFunction1(hashFile))
      __obj.asInstanceOf[ThumbnailSupplier]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ThumbnailSupplier] (val x: Self) extends AnyVal {
      
      inline def setCreateThumbnail(value: String => Unit): Self = StObject.set(x, "createThumbnail", js.Any.fromFunction1(value))
      
      inline def setFiletype(value: () => String): Self = StObject.set(x, "filetype", js.Any.fromFunction0(value))
      
      inline def setGetThumbnailFileName(value: String => String): Self = StObject.set(x, "getThumbnailFileName", js.Any.fromFunction1(value))
      
      inline def setGetThumbnailLocation(value: String => String): Self = StObject.set(x, "getThumbnailLocation", js.Any.fromFunction1(value))
      
      inline def setHashFile(value: String => String): Self = StObject.set(x, "hashFile", js.Any.fromFunction1(value))
    }
  }
  
  type _To = ThumbSupply
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ThumbSupply = ^
}
