package typings.tarFs

import typings.node.fsMod.ReadStream
import typings.tarFs.tarFsStrings.directory
import typings.tarFs.tarFsStrings.file
import typings.tarFs.tarFsStrings.link
import typings.tarFs.tarFsStrings.symlink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tar-fs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extract(cwd: String): typings.tarStream.mod.Extract_ = ^.asInstanceOf[js.Dynamic].applyDynamic("extract")(cwd.asInstanceOf[js.Any]).asInstanceOf[typings.tarStream.mod.Extract_]
  inline def extract(cwd: String, opts: ExtractOptions): typings.tarStream.mod.Extract_ = (^.asInstanceOf[js.Dynamic].applyDynamic("extract")(cwd.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.tarStream.mod.Extract_]
  
  inline def pack(cwd: String): typings.tarStream.mod.Pack_ = ^.asInstanceOf[js.Dynamic].applyDynamic("pack")(cwd.asInstanceOf[js.Any]).asInstanceOf[typings.tarStream.mod.Pack_]
  inline def pack(cwd: String, opts: PackOptions): typings.tarStream.mod.Pack_ = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(cwd.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.tarStream.mod.Pack_]
  
  trait ExtractOptions
    extends StObject
       with Options {
    
    @JSName("filter")
    var filter_ExtractOptions: js.UndefOr[js.Function2[/* name */ String, /* header */ js.UndefOr[Headers], Boolean]] = js.undefined
    
    @JSName("ignore")
    var ignore_ExtractOptions: js.UndefOr[js.Function2[/* name */ String, /* header */ js.UndefOr[Headers], Boolean]] = js.undefined
    
    var strip: js.UndefOr[Double] = js.undefined
  }
  object ExtractOptions {
    
    inline def apply(): ExtractOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExtractOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExtractOptions] (val x: Self) extends AnyVal {
      
      inline def setFilter(value: (/* name */ String, /* header */ js.UndefOr[Headers]) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setIgnore(value: (/* name */ String, /* header */ js.UndefOr[Headers]) => Boolean): Self = StObject.set(x, "ignore", js.Any.fromFunction2(value))
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setStrip(value: Double): Self = StObject.set(x, "strip", value.asInstanceOf[js.Any])
      
      inline def setStripUndefined: Self = StObject.set(x, "strip", js.undefined)
    }
  }
  
  type Extract_ = typings.tarStream.mod.Extract_
  
  trait Headers extends StObject {
    
    var gid: Double
    
    var mode: Double
    
    var mtime: js.Date
    
    var name: String
    
    var size: Double
    
    var `type`: file | directory | link | symlink
    
    var uid: Double
  }
  object Headers {
    
    inline def apply(
      gid: Double,
      mode: Double,
      mtime: js.Date,
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
    implicit open class MutableBuilder[Self <: Headers] (val x: Self) extends AnyVal {
      
      inline def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setMtime(value: js.Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setType(value: file | directory | link | symlink): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var dmode: js.UndefOr[Double] = js.undefined
    
    var filter: js.UndefOr[js.Function1[/* name */ String, Boolean]] = js.undefined
    
    var fmode: js.UndefOr[Double] = js.undefined
    
    var ignore: js.UndefOr[js.Function1[/* name */ String, Boolean]] = js.undefined
    
    var map: js.UndefOr[js.Function1[/* header */ Headers, Headers]] = js.undefined
    
    var mapStream: js.UndefOr[js.Function2[/* fileStream */ ReadStream, /* header */ Headers, ReadStream]] = js.undefined
    
    var readable: js.UndefOr[Boolean] = js.undefined
    
    var strict: js.UndefOr[Boolean] = js.undefined
    
    var writable: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setDmode(value: Double): Self = StObject.set(x, "dmode", value.asInstanceOf[js.Any])
      
      inline def setDmodeUndefined: Self = StObject.set(x, "dmode", js.undefined)
      
      inline def setFilter(value: /* name */ String => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFmode(value: Double): Self = StObject.set(x, "fmode", value.asInstanceOf[js.Any])
      
      inline def setFmodeUndefined: Self = StObject.set(x, "fmode", js.undefined)
      
      inline def setIgnore(value: /* name */ String => Boolean): Self = StObject.set(x, "ignore", js.Any.fromFunction1(value))
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setMap(value: /* header */ Headers => Headers): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      inline def setMapStream(value: (/* fileStream */ ReadStream, /* header */ Headers) => ReadStream): Self = StObject.set(x, "mapStream", js.Any.fromFunction2(value))
      
      inline def setMapStreamUndefined: Self = StObject.set(x, "mapStream", js.undefined)
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setReadable(value: Boolean): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
      
      inline def setReadableUndefined: Self = StObject.set(x, "readable", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      inline def setWritable(value: Boolean): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
      
      inline def setWritableUndefined: Self = StObject.set(x, "writable", js.undefined)
    }
  }
  
  trait PackOptions
    extends StObject
       with Options {
    
    var dereference: js.UndefOr[Boolean] = js.undefined
    
    var entries: js.UndefOr[js.Array[String]] = js.undefined
    
    @JSName("finalize")
    var finalize_FPackOptions: js.UndefOr[Boolean] = js.undefined
    
    var finish: js.UndefOr[js.Function1[/* pack */ typings.tarStream.mod.Pack_, Unit]] = js.undefined
    
    var pack: js.UndefOr[typings.tarStream.mod.Pack_] = js.undefined
  }
  object PackOptions {
    
    inline def apply(): PackOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PackOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PackOptions] (val x: Self) extends AnyVal {
      
      inline def setDereference(value: Boolean): Self = StObject.set(x, "dereference", value.asInstanceOf[js.Any])
      
      inline def setDereferenceUndefined: Self = StObject.set(x, "dereference", js.undefined)
      
      inline def setEntries(value: js.Array[String]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
      
      inline def setEntriesVarargs(value: String*): Self = StObject.set(x, "entries", js.Array(value*))
      
      inline def setFinalize_(value: Boolean): Self = StObject.set(x, "finalize", value.asInstanceOf[js.Any])
      
      inline def setFinalize_Undefined: Self = StObject.set(x, "finalize", js.undefined)
      
      inline def setFinish(value: /* pack */ typings.tarStream.mod.Pack_ => Unit): Self = StObject.set(x, "finish", js.Any.fromFunction1(value))
      
      inline def setFinishUndefined: Self = StObject.set(x, "finish", js.undefined)
      
      inline def setPack(value: typings.tarStream.mod.Pack_): Self = StObject.set(x, "pack", value.asInstanceOf[js.Any])
      
      inline def setPackUndefined: Self = StObject.set(x, "pack", js.undefined)
    }
  }
  
  type Pack_ = typings.tarStream.mod.Pack_
}
