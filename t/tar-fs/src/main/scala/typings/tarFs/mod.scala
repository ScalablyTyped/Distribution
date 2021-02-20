package typings.tarFs

import typings.node.fsMod.ReadStream
import typings.std.Date
import typings.tarFs.tarFsStrings.directory
import typings.tarFs.tarFsStrings.file
import typings.tarFs.tarFsStrings.link
import typings.tarFs.tarFsStrings.symlink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tar-fs", "extract")
  @js.native
  def extract(cwd: String): typings.tarStream.mod.Extract_ = js.native
  @JSImport("tar-fs", "extract")
  @js.native
  def extract(cwd: String, opts: ExtractOptions): typings.tarStream.mod.Extract_ = js.native
  
  @JSImport("tar-fs", "pack")
  @js.native
  def pack(cwd: String): typings.tarStream.mod.Pack_ = js.native
  @JSImport("tar-fs", "pack")
  @js.native
  def pack(cwd: String, opts: PackOptions): typings.tarStream.mod.Pack_ = js.native
  
  @js.native
  trait ExtractOptions extends Options {
    
    @JSName("filter")
    var filter_ExtractOptions: js.UndefOr[js.Function2[/* name */ String, /* header */ js.UndefOr[Headers], Boolean]] = js.native
    
    @JSName("ignore")
    var ignore_ExtractOptions: js.UndefOr[js.Function2[/* name */ String, /* header */ js.UndefOr[Headers], Boolean]] = js.native
    
    var strip: js.UndefOr[Double] = js.native
  }
  object ExtractOptions {
    
    @scala.inline
    def apply(): ExtractOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExtractOptions]
    }
    
    @scala.inline
    implicit class ExtractOptionsMutableBuilder[Self <: ExtractOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilter(value: (/* name */ String, /* header */ js.UndefOr[Headers]) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setIgnore(value: (/* name */ String, /* header */ js.UndefOr[Headers]) => Boolean): Self = StObject.set(x, "ignore", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def setStrip(value: Double): Self = StObject.set(x, "strip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripUndefined: Self = StObject.set(x, "strip", js.undefined)
    }
  }
  
  type Extract_ = typings.tarStream.mod.Extract_
  
  @js.native
  trait Headers extends StObject {
    
    var gid: Double = js.native
    
    var mode: Double = js.native
    
    var mtime: Date = js.native
    
    var name: String = js.native
    
    var size: Double = js.native
    
    var `type`: file | directory | link | symlink = js.native
    
    var uid: Double = js.native
  }
  object Headers {
    
    @scala.inline
    def apply(
      gid: Double,
      mode: Double,
      mtime: Date,
      name: String,
      size: Double,
      `type`: file | directory | link | symlink,
      uid: Double
    ): Headers = {
      val __obj = js.Dynamic.literal(gid = gid.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Headers]
    }
    
    @scala.inline
    implicit class HeadersMutableBuilder[Self <: Headers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMtime(value: Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: file | directory | link | symlink): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var dmode: js.UndefOr[Double] = js.native
    
    var filter: js.UndefOr[js.Function1[/* name */ String, Boolean]] = js.native
    
    var fmode: js.UndefOr[Double] = js.native
    
    var ignore: js.UndefOr[js.Function1[/* name */ String, Boolean]] = js.native
    
    var map: js.UndefOr[js.Function1[/* header */ Headers, Headers]] = js.native
    
    var mapStream: js.UndefOr[js.Function2[/* fileStream */ ReadStream, /* header */ Headers, ReadStream]] = js.native
    
    var readable: js.UndefOr[Boolean] = js.native
    
    var strict: js.UndefOr[Boolean] = js.native
    
    var writable: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDmode(value: Double): Self = StObject.set(x, "dmode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDmodeUndefined: Self = StObject.set(x, "dmode", js.undefined)
      
      @scala.inline
      def setFilter(value: /* name */ String => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setFmode(value: Double): Self = StObject.set(x, "fmode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFmodeUndefined: Self = StObject.set(x, "fmode", js.undefined)
      
      @scala.inline
      def setIgnore(value: /* name */ String => Boolean): Self = StObject.set(x, "ignore", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def setMap(value: /* header */ Headers => Headers): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMapStream(value: (/* fileStream */ ReadStream, /* header */ Headers) => ReadStream): Self = StObject.set(x, "mapStream", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMapStreamUndefined: Self = StObject.set(x, "mapStream", js.undefined)
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      @scala.inline
      def setReadable(value: Boolean): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadableUndefined: Self = StObject.set(x, "readable", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      @scala.inline
      def setWritable(value: Boolean): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWritableUndefined: Self = StObject.set(x, "writable", js.undefined)
    }
  }
  
  @js.native
  trait PackOptions extends Options {
    
    var dereference: js.UndefOr[Boolean] = js.native
    
    var entries: js.UndefOr[js.Array[String]] = js.native
    
    @JSName("finalize")
    var finalize_FPackOptions: js.UndefOr[Boolean] = js.native
    
    var finish: js.UndefOr[js.Function1[/* pack */ typings.tarStream.mod.Pack_, Unit]] = js.native
    
    var pack: js.UndefOr[typings.tarStream.mod.Pack_] = js.native
  }
  object PackOptions {
    
    @scala.inline
    def apply(): PackOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PackOptions]
    }
    
    @scala.inline
    implicit class PackOptionsMutableBuilder[Self <: PackOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDereference(value: Boolean): Self = StObject.set(x, "dereference", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDereferenceUndefined: Self = StObject.set(x, "dereference", js.undefined)
      
      @scala.inline
      def setEntries(value: js.Array[String]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
      
      @scala.inline
      def setEntriesVarargs(value: String*): Self = StObject.set(x, "entries", js.Array(value :_*))
      
      @scala.inline
      def setFinalize_(value: Boolean): Self = StObject.set(x, "finalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinalize_Undefined: Self = StObject.set(x, "finalize", js.undefined)
      
      @scala.inline
      def setFinish(value: /* pack */ typings.tarStream.mod.Pack_ => Unit): Self = StObject.set(x, "finish", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFinishUndefined: Self = StObject.set(x, "finish", js.undefined)
      
      @scala.inline
      def setPack(value: typings.tarStream.mod.Pack_): Self = StObject.set(x, "pack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackUndefined: Self = StObject.set(x, "pack", js.undefined)
    }
  }
  
  type Pack_ = typings.tarStream.mod.Pack_
}
