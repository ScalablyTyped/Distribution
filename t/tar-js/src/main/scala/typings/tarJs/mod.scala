package typings.tarJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tar-js", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Tar {
    def this(recordsPerBlock: Double) = this()
  }
  
  @js.native
  trait Tar extends StObject {
    
    def append(filepath: String, input: String): js.typedarray.Uint8Array = js.native
    def append(filepath: String, input: String, callback: js.Function1[/* out */ js.typedarray.Uint8Array, Any]): js.typedarray.Uint8Array = js.native
    def append(
      filepath: String,
      input: String,
      opts: Unit,
      callback: js.Function1[/* out */ js.typedarray.Uint8Array, Any]
    ): js.typedarray.Uint8Array = js.native
    def append(filepath: String, input: String, opts: TarOptions): js.typedarray.Uint8Array = js.native
    def append(
      filepath: String,
      input: String,
      opts: TarOptions,
      callback: js.Function1[/* out */ js.typedarray.Uint8Array, Any]
    ): js.typedarray.Uint8Array = js.native
    def append(filepath: String, input: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    def append(
      filepath: String,
      input: js.typedarray.Uint8Array,
      callback: js.Function1[/* out */ js.typedarray.Uint8Array, Any]
    ): js.typedarray.Uint8Array = js.native
    def append(
      filepath: String,
      input: js.typedarray.Uint8Array,
      opts: Unit,
      callback: js.Function1[/* out */ js.typedarray.Uint8Array, Any]
    ): js.typedarray.Uint8Array = js.native
    def append(filepath: String, input: js.typedarray.Uint8Array, opts: TarOptions): js.typedarray.Uint8Array = js.native
    def append(
      filepath: String,
      input: js.typedarray.Uint8Array,
      opts: TarOptions,
      callback: js.Function1[/* out */ js.typedarray.Uint8Array, Any]
    ): js.typedarray.Uint8Array = js.native
    
    def clear(): Unit = js.native
    
    var out: js.typedarray.Uint8Array = js.native
    
    var written: Double = js.native
  }
  
  trait TarOptions extends StObject {
    
    var gid: js.UndefOr[Double] = js.undefined
    
    var group: js.UndefOr[String] = js.undefined
    
    var mode: js.UndefOr[Double] = js.undefined
    
    var mtime: js.UndefOr[Double] = js.undefined
    
    var owner: js.UndefOr[String] = js.undefined
    
    var uid: js.UndefOr[Double] = js.undefined
  }
  object TarOptions {
    
    inline def apply(): TarOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TarOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TarOptions] (val x: Self) extends AnyVal {
      
      inline def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      inline def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMtime(value: Double): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
      
      inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    }
  }
}
