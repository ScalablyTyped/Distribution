package typings.targz

import typings.node.zlibMod.ZlibOptions
import typings.std.Error
import typings.tarFs.mod.ExtractOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("targz", "compress")
  @js.native
  def compress(): Unit = js.native
  @JSImport("targz", "compress")
  @js.native
  def compress(opts: js.UndefOr[scala.Nothing], callback: js.Function1[/* error */ Error | String | Null, Unit]): Unit = js.native
  @JSImport("targz", "compress")
  @js.native
  def compress(opts: options): Unit = js.native
  @JSImport("targz", "compress")
  @js.native
  def compress(opts: options, callback: js.Function1[/* error */ Error | String | Null, Unit]): Unit = js.native
  
  @JSImport("targz", "decompress")
  @js.native
  def decompress(): Unit = js.native
  @JSImport("targz", "decompress")
  @js.native
  def decompress(opts: js.UndefOr[scala.Nothing], callback: js.Function1[/* error */ Error | String | Null, Unit]): Unit = js.native
  @JSImport("targz", "decompress")
  @js.native
  def decompress(opts: options): Unit = js.native
  @JSImport("targz", "decompress")
  @js.native
  def decompress(opts: options, callback: js.Function1[/* error */ Error | String | Null, Unit]): Unit = js.native
  
  @js.native
  trait options extends StObject {
    
    var dest: String = js.native
    
    var gz: js.UndefOr[ZlibOptions] = js.native
    
    var src: String = js.native
    
    var tar: js.UndefOr[ExtractOptions] = js.native
  }
  object options {
    
    @scala.inline
    def apply(dest: String, src: String): options = {
      val __obj = js.Dynamic.literal(dest = dest.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[options]
    }
    
    @scala.inline
    implicit class optionsMutableBuilder[Self <: options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDest(value: String): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGz(value: ZlibOptions): Self = StObject.set(x, "gz", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGzUndefined: Self = StObject.set(x, "gz", js.undefined)
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTar(value: ExtractOptions): Self = StObject.set(x, "tar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarUndefined: Self = StObject.set(x, "tar", js.undefined)
    }
  }
}
