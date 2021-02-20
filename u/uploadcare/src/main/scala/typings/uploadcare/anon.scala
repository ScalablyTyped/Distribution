package typings.uploadcare

import typings.node.fsMod.ReadStream
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait File extends StObject {
    
    var file: String = js.native
  }
  object File {
    
    @scala.inline
    def apply(file: String): File = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[File]
    }
    
    @scala.inline
    implicit class FileMutableBuilder[Self <: File] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FromUrl extends StObject {
    
    def fromUrl(
      url: String,
      options: Store,
      callback: js.Function2[/* err */ Error, /* res */ typings.uploadcare.mod.File, Unit]
    ): Unit = js.native
    
    def upload(
      readStream: ReadStream,
      options: Store,
      callback: js.Function2[/* err */ Error, /* res */ File, Unit]
    ): Unit = js.native
  }
  object FromUrl {
    
    @scala.inline
    def apply(
      fromUrl: (String, Store, js.Function2[/* err */ Error, /* res */ typings.uploadcare.mod.File, Unit]) => Unit,
      upload: (ReadStream, Store, js.Function2[/* err */ Error, /* res */ File, Unit]) => Unit
    ): FromUrl = {
      val __obj = js.Dynamic.literal(fromUrl = js.Any.fromFunction3(fromUrl), upload = js.Any.fromFunction3(upload))
      __obj.asInstanceOf[FromUrl]
    }
    
    @scala.inline
    implicit class FromUrlMutableBuilder[Self <: FromUrl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromUrl(
        value: (String, Store, js.Function2[/* err */ Error, /* res */ typings.uploadcare.mod.File, Unit]) => Unit
      ): Self = StObject.set(x, "fromUrl", js.Any.fromFunction3(value))
      
      @scala.inline
      def setUpload(value: (ReadStream, Store, js.Function2[/* err */ Error, /* res */ File, Unit]) => Unit): Self = StObject.set(x, "upload", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait Remove extends StObject {
    
    def remove(uuid: String, callback: js.Function2[/* err */ Error, /* res */ typings.uploadcare.mod.File, Unit]): Unit = js.native
    
    def store(uuid: String, callback: js.Function2[/* err */ Error, /* res */ typings.uploadcare.mod.File, Unit]): Unit = js.native
  }
  object Remove {
    
    @scala.inline
    def apply(
      remove: (String, js.Function2[/* err */ Error, /* res */ typings.uploadcare.mod.File, Unit]) => Unit,
      store: (String, js.Function2[/* err */ Error, /* res */ typings.uploadcare.mod.File, Unit]) => Unit
    ): Remove = {
      val __obj = js.Dynamic.literal(remove = js.Any.fromFunction2(remove), store = js.Any.fromFunction2(store))
      __obj.asInstanceOf[Remove]
    }
    
    @scala.inline
    implicit class RemoveMutableBuilder[Self <: Remove] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRemove(
        value: (String, js.Function2[/* err */ Error, /* res */ typings.uploadcare.mod.File, Unit]) => Unit
      ): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStore(
        value: (String, js.Function2[/* err */ Error, /* res */ typings.uploadcare.mod.File, Unit]) => Unit
      ): Self = StObject.set(x, "store", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Store extends StObject {
    
    var store: js.UndefOr[Boolean] = js.native
  }
  object Store {
    
    @scala.inline
    def apply(): Store = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Store]
    }
    
    @scala.inline
    implicit class StoreMutableBuilder[Self <: Store] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStore(value: Boolean): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    }
  }
}
