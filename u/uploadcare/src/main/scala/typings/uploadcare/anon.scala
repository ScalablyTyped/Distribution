package typings.uploadcare

import typings.node.fsMod.ReadStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait File extends StObject {
    
    var file: String
  }
  object File {
    
    inline def apply(file: String): File = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[File]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: File] (val x: Self) extends AnyVal {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    }
  }
  
  trait FromUrl extends StObject {
    
    def fromUrl(
      url: String,
      options: Store,
      callback: js.Function2[/* err */ js.Error, /* res */ typings.uploadcare.mod.File, Unit]
    ): Unit
    
    def upload(
      readStream: ReadStream,
      options: Store,
      callback: js.Function2[/* err */ js.Error, /* res */ File, Unit]
    ): Unit
  }
  object FromUrl {
    
    inline def apply(
      fromUrl: (String, Store, js.Function2[/* err */ js.Error, /* res */ typings.uploadcare.mod.File, Unit]) => Unit,
      upload: (ReadStream, Store, js.Function2[/* err */ js.Error, /* res */ File, Unit]) => Unit
    ): FromUrl = {
      val __obj = js.Dynamic.literal(fromUrl = js.Any.fromFunction3(fromUrl), upload = js.Any.fromFunction3(upload))
      __obj.asInstanceOf[FromUrl]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FromUrl] (val x: Self) extends AnyVal {
      
      inline def setFromUrl(
        value: (String, Store, js.Function2[/* err */ js.Error, /* res */ typings.uploadcare.mod.File, Unit]) => Unit
      ): Self = StObject.set(x, "fromUrl", js.Any.fromFunction3(value))
      
      inline def setUpload(value: (ReadStream, Store, js.Function2[/* err */ js.Error, /* res */ File, Unit]) => Unit): Self = StObject.set(x, "upload", js.Any.fromFunction3(value))
    }
  }
  
  trait Remove extends StObject {
    
    def remove(
      uuid: String,
      callback: js.Function2[/* err */ js.Error, /* res */ typings.uploadcare.mod.File, Unit]
    ): Unit
    
    def store(
      uuid: String,
      callback: js.Function2[/* err */ js.Error, /* res */ typings.uploadcare.mod.File, Unit]
    ): Unit
  }
  object Remove {
    
    inline def apply(
      remove: (String, js.Function2[/* err */ js.Error, /* res */ typings.uploadcare.mod.File, Unit]) => Unit,
      store: (String, js.Function2[/* err */ js.Error, /* res */ typings.uploadcare.mod.File, Unit]) => Unit
    ): Remove = {
      val __obj = js.Dynamic.literal(remove = js.Any.fromFunction2(remove), store = js.Any.fromFunction2(store))
      __obj.asInstanceOf[Remove]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Remove] (val x: Self) extends AnyVal {
      
      inline def setRemove(
        value: (String, js.Function2[/* err */ js.Error, /* res */ typings.uploadcare.mod.File, Unit]) => Unit
      ): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
      
      inline def setStore(
        value: (String, js.Function2[/* err */ js.Error, /* res */ typings.uploadcare.mod.File, Unit]) => Unit
      ): Self = StObject.set(x, "store", js.Any.fromFunction2(value))
    }
  }
  
  trait Store extends StObject {
    
    var store: js.UndefOr[Boolean] = js.undefined
  }
  object Store {
    
    inline def apply(): Store = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Store]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Store] (val x: Self) extends AnyVal {
      
      inline def setStore(value: Boolean): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    }
  }
}
