package typings.targz

import typings.node.zlibMod.ZlibOptions
import typings.std.Error
import typings.tarFs.mod.ExtractOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("targz", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def compress(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("compress")().asInstanceOf[Unit]
  @scala.inline
  def compress(opts: Unit, callback: js.Function1[/* error */ Error | String | Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compress")(opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def compress(opts: options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("compress")(opts.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def compress(opts: options, callback: js.Function1[/* error */ Error | String | Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compress")(opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def decompress(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("decompress")().asInstanceOf[Unit]
  @scala.inline
  def decompress(opts: Unit, callback: js.Function1[/* error */ Error | String | Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decompress")(opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def decompress(opts: options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("decompress")(opts.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def decompress(opts: options, callback: js.Function1[/* error */ Error | String | Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decompress")(opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait options extends StObject {
    
    var dest: String
    
    var gz: js.UndefOr[ZlibOptions] = js.undefined
    
    var src: String
    
    var tar: js.UndefOr[ExtractOptions] = js.undefined
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
