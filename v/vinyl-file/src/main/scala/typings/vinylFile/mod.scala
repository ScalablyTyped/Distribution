package typings.vinylFile

import typings.vinyl.mod.File
import typings.vinylFile.anon.Contents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vinyl-file", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def read(pth: String): js.Promise[VinylFile] = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(pth.asInstanceOf[js.Any]).asInstanceOf[js.Promise[VinylFile]]
  inline def read(pth: String, opts: VinylFileOptions): js.Promise[VinylFile] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(pth.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[VinylFile]]
  
  inline def readSync(pth: String): VinylFile = ^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(pth.asInstanceOf[js.Any]).asInstanceOf[VinylFile]
  inline def readSync(pth: String, opts: VinylFileOptions): VinylFile = (^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(pth.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[VinylFile]
  
  @js.native
  trait VinylFile
    extends StObject
       with File {
    
    def clone(opts: Contents): this.type = js.native
    
    /** Gets and sets the path where the file points to if it's a symbolic link */
    @JSName("symlink")
    var symlink_VinylFile: String = js.native
  }
  
  trait VinylFileOptions extends StObject {
    
    /** Specifies the folder relative to the cwd */
    var base: js.UndefOr[String] = js.undefined
    
    /** Setting this to false will retuurn file.contents as a stream */
    var buffer: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the working directory the folder is relative to */
    var cwd: js.UndefOr[String] = js.undefined
    
    /** Setting this to false will return file.contents as null and not read the file at all */
    var read: js.UndefOr[Boolean] = js.undefined
  }
  object VinylFileOptions {
    
    inline def apply(): VinylFileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VinylFileOptions]
    }
    
    extension [Self <: VinylFileOptions](x: Self) {
      
      inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      inline def setBuffer(value: Boolean): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setRead(value: Boolean): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    }
  }
}
