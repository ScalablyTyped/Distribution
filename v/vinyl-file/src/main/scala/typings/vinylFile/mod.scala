package typings.vinylFile

import typings.vinyl.mod.File
import typings.vinylFile.anon.Contents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vinyl-file", "read")
  @js.native
  def read(pth: String): js.Promise[VinylFile] = js.native
  @JSImport("vinyl-file", "read")
  @js.native
  def read(pth: String, opts: VinylFileOptions): js.Promise[VinylFile] = js.native
  
  @JSImport("vinyl-file", "readSync")
  @js.native
  def readSync(pth: String): VinylFile = js.native
  @JSImport("vinyl-file", "readSync")
  @js.native
  def readSync(pth: String, opts: VinylFileOptions): VinylFile = js.native
  
  @js.native
  trait VinylFile extends File {
    
    def clone(opts: Contents): this.type = js.native
    
    /** Gets and sets the path where the file points to if it's a symbolic link */
    @JSName("symlink")
    var symlink_VinylFile: String = js.native
  }
  
  @js.native
  trait VinylFileOptions extends StObject {
    
    /** Specifies the folder relative to the cwd */
    var base: js.UndefOr[String] = js.native
    
    /** Setting this to false will retuurn file.contents as a stream */
    var buffer: js.UndefOr[Boolean] = js.native
    
    /** Specifies the working directory the folder is relative to */
    var cwd: js.UndefOr[String] = js.native
    
    /** Setting this to false will return file.contents as null and not read the file at all */
    var read: js.UndefOr[Boolean] = js.native
  }
  object VinylFileOptions {
    
    @scala.inline
    def apply(): VinylFileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VinylFileOptions]
    }
    
    @scala.inline
    implicit class VinylFileOptionsMutableBuilder[Self <: VinylFileOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      @scala.inline
      def setBuffer(value: Boolean): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setRead(value: Boolean): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    }
  }
}
